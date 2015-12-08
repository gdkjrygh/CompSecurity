// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.VideoMessage;
import com.skype.VideoMessageImpl;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.analytics.KpiAttributeName;
import com.skype.android.analytics.KpiAttributeValue;
import com.skype.android.analytics.KpiEvent;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.MessageTelemetryEvent;
import com.skype.android.app.InfoDialogFragment;
import com.skype.android.app.ListItemMenuDialog;
import com.skype.android.app.Navigation;
import com.skype.android.app.contacts.ContactPickerFragment;
import com.skype.android.app.contacts.PickerActivity;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.widget.SymbolView;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessagePlayerActivity, a, VideoMessageVideoView

public class VideoMessageReviewActivity extends VideoMessagePlayerActivity
    implements android.view.View.OnClickListener, com.skype.android.app.ListItemMenuDialog.MenuCallback, VideoMessageVideoView.VideoMessagePlaybackListener
{

    static final String EXTRA_DURATION = "com.skype.vim.duration";
    static final String EXTRA_FILTER_COUNT = "com.skype.vim.filters";
    public static final String EXTRA_RERECORD_VIDEO = "EXTRA_RERECORD_VIDEO";
    private static final int GET_SELECTED_CONTACT_FOR_VIM = 1;
    View acceptButton;
    Analytics analytics;
    View cancelButton;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    private long durationMilliseconds;
    TextView durationText;
    EcsConfiguration ecsConfiguration;
    ImageCache imageCache;
    private boolean isVideoMessageRecordFirst;
    SkyLib lib;
    ObjectIdMap map;
    private AsyncCallback mediaDocumentUploadCallback;
    MediaDocumentUploadUtil mediaDocumentUploadUtil;
    Navigation navigation;
    private File rawVideoFile;
    private Bitmap thumbnail;
    TimeAnomalyTelemetry timeAnomalyTelemetry;
    TimeUtil timeUtil;

    public VideoMessageReviewActivity()
    {
        mediaDocumentUploadCallback = new AsyncCallback() {

            final VideoMessageReviewActivity this$0;

            public final void done(AsyncResult asyncresult)
            {
                boolean flag;
                if (!asyncresult.e())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag && !((Boolean)asyncresult.a()).booleanValue())
                {
                    asyncresult = getString(0x7f08044b);
                    Toast.makeText(VideoMessageReviewActivity.this, asyncresult, 1).show();
                }
                navigation.chat(conversation);
            }

            
            {
                this$0 = VideoMessageReviewActivity.this;
                super();
            }
        };
    }

    private void cancelRecording()
    {
        cleanup();
        if (isVideoMessageRecordFirst)
        {
            sendResultForVideoPreview(0, false);
            return;
        } else
        {
            navigation.chat(conversation);
            return;
        }
    }

    private void cleanup()
    {
        deleteFile(rawVideoFile);
    }

    private void deleteFile(File file)
    {
        if (file != null && !file.delete())
        {
            log.info((new StringBuilder("Delete video file ")).append(file.getAbsolutePath()).append(" failed").toString());
        }
    }

    private void hideReviewControls()
    {
        if (reviewControls != null)
        {
            reviewControls.setVisibility(4);
        }
    }

    private void pickContact()
    {
        Intent intent = new Intent(this, com/skype/android/app/contacts/PickerActivity);
        intent.putExtra("fragmentClass", com/skype/android/app/contacts/ContactPickerFragment);
        intent.putExtra("CUSTOM_TITLE", 0x7f08023e);
        intent.putExtra("CUSTOM_ACTION", com.skype.android.widget.SymbolElement.SymbolCode.fQ);
        startActivityForResult(intent, 1);
    }

    private void sendMessage()
    {
        String s = "";
        if (thumbnail == null)
        {
            updateThumbnail();
        }
        Object obj = s;
        if (thumbnail != null)
        {
            try
            {
                obj = a.saveVideoThumbnail(this, thumbnail);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((FileNotFoundException) (obj)).printStackTrace();
                obj = s;
            }
        }
        if (ecsConfiguration.isAsyncVideoMessageEnabled())
        {
            s = getString(0x7f0802ca, new Object[] {
                getString(0x7f080468)
            });
            mediaDocumentUploadUtil.uploadVideoMessageAsync(conversation, Uri.fromFile(rawVideoFile), ((String) (obj)), thumbnail, s, mediaDocumentUploadCallback);
            sendVideoMessageSentEvent(true);
            return;
        }
        s = getString(0x7f0802ca, new Object[] {
            getString(0x7f0804e0)
        });
        VideoMessageImpl videomessageimpl = new VideoMessageImpl();
        if (lib.createVideoMessageWithFile(rawVideoFile.getAbsolutePath(), "", "", videomessageimpl, ((String) (obj))) && conversation.postVideoMessage(videomessageimpl.getObjectID(), s) != 0)
        {
            navigation.chat(conversation);
            imageCache.a(String.valueOf(videomessageimpl.getObjectID()), thumbnail);
            map.b(videomessageimpl);
            map.a(videomessageimpl);
            sendVideoMessageSentEvent(false);
            return;
        } else
        {
            InfoDialogFragment infodialogfragment = InfoDialogFragment.create("", getString(0x7f08044e), getString(0x7f0802f6));
            infodialogfragment.show(getSupportFragmentManager());
            infodialogfragment.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final VideoMessageReviewActivity this$0;

                public final void onDismiss(DialogInterface dialoginterface)
                {
                    finish();
                }

            
            {
                this$0 = VideoMessageReviewActivity.this;
                super();
            }
            });
            return;
        }
    }

    private void sendResultForVideoPreview(int i, boolean flag)
    {
        Intent intent = new Intent();
        setResult(i, intent);
        if (i == 0)
        {
            intent.putExtra("EXTRA_RERECORD_VIDEO", flag);
        }
        finish();
    }

    private void sendVideoMessageSentEvent(boolean flag)
    {
        int i = 0;
        Object obj = new AnalyticsParameterContainer();
        if (getIntent() != null)
        {
            i = getIntent().getIntExtra("com.skype.vim.filters", 0);
        }
        ((AnalyticsParameterContainer) (obj)).a(AnalyticsParameter.Q, Integer.valueOf(i));
        analytics.a(AnalyticsEvent.w, obj);
        Object obj1 = analytics;
        KpiAttributeName kpiattributename;
        if (i > 0)
        {
            obj = LogEvent.aq;
        } else
        {
            obj = LogEvent.ar;
        }
        ((Analytics) (obj1)).a(((LogEvent) (obj)));
        obj1 = new MessageTelemetryEvent(KpiEvent.b, conversation, KpiAttributeValue.i);
        kpiattributename = KpiAttributeName.h;
        if (flag)
        {
            obj = KpiAttributeValue.a;
        } else
        {
            obj = KpiAttributeValue.f;
        }
        ((MessageTelemetryEvent) (obj1)).put(kpiattributename, obj);
        analytics.a(((com.skype.android.analytics.SkypeTelemetryEvent) (obj1)));
    }

    private void setVideoMessagePlaybackListener()
    {
        ((VideoMessageVideoView)getVideoView()).setVideoMessagePlaybackListener(this);
    }

    private void showCancelDialog()
    {
        ListItemMenuDialog.create(this, getString(0x7f080234), 0).show(getSupportFragmentManager());
    }

    private void showReviewControls()
    {
        if (reviewControls != null)
        {
            reviewControls.setVisibility(0);
        }
    }

    protected boolean hasCustomMediaController()
    {
        return true;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        i;
        JVM INSTR tableswitch 1 1: default 28
    //                   1 52;
           goto _L1 _L2
_L1:
        log.warning((new StringBuilder("Result Ok. Not properly handled requestCode: ")).append(i).toString());
_L4:
        return;
_L2:
        if (j == -1)
        {
            intent = intent.getIntArrayExtra("com.skype.objIds");
            if (intent != null && intent.length != 0)
            {
                intent = (Contact)map.a(intent[0], com/skype/Contact);
                if (intent != null)
                {
                    intent = Collections.singletonList(intent);
                    conversation = conversationUtil.a(intent);
                    sendResultForVideoPreview(-1, false);
                    sendMessage();
                    return;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onBackPressed()
    {
        showCancelDialog();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131755813: 
            onBackPressed();
            return;

        case 2131755616: 
            if (isVideoMessageRecordFirst)
            {
                pickContact();
                return;
            } else
            {
                sendMessage();
                return;
            }

        case 2131756435: 
            playFromTouch();
            return;
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem, int i)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756540: 
            menuitem = getVideoView();
            if (menuitem != null)
            {
                menuitem.suspend();
            }
            cleanup();
            if (!isVideoMessageRecordFirst)
            {
                navigation.videoMessage(conversation);
                finish();
                return true;
            } else
            {
                sendResultForVideoPreview(0, true);
                return true;
            }

        case 2131756541: 
            cancelRecording();
            return true;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        conversation = (Conversation)getObjectInterface(com/skype/Conversation);
        cancelButton.setOnClickListener(this);
        acceptButton.setOnClickListener(this);
        playButton.setOnClickListener(this);
        durationMilliseconds = getIntent().getLongExtra("com.skype.vim.duration", 0L);
        CharSequence charsequence;
        boolean flag;
        if (getIntent().getExtras() != null && getIntent().getExtras().getBoolean("EXTRA_RECORD_VIDEO_FIRST", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isVideoMessageRecordFirst = flag;
        bundle = TimeUtil.c(durationMilliseconds);
        durationText.setText(bundle);
        charsequence = timeUtil.a(durationMilliseconds / 1000L);
        bundle = charsequence;
_L1:
        durationText.setContentDescription(bundle);
        bundle = getIntent().getData();
        TimeAnomalyException timeanomalyexception;
        try
        {
            rawVideoFile = new File(new URI(bundle.toString()));
            updateThumbnail();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
        }
        reviewControls.setVisibility(0);
        setVideoMessagePlaybackListener();
        return;
        timeanomalyexception;
        timeAnomalyTelemetry.a(timeanomalyexception, Long.valueOf(durationMilliseconds), "VideoMessageReviewActivity#onCreate");
          goto _L1
    }

    public void onCreateContextMenu(Menu menu, int i)
    {
        getMenuInflater().inflate(0x7f110022, menu);
    }

    public void onHide(MediaController mediacontroller)
    {
        if (getVideoView() != null && !getVideoView().isPlaying())
        {
            showReviewControls();
        }
    }

    public void onPlaybackPause(VideoMessageVideoView videomessagevideoview)
    {
        hideMediaController();
        showReviewControls();
    }

    public void onPlaybackStart(VideoMessageVideoView videomessagevideoview)
    {
        setPreplayVisibility(false);
        hideReviewControls();
    }

    protected void onPrepareMediaController(MediaController mediacontroller)
    {
    }

    public void onShow(MediaController mediacontroller)
    {
        hideReviewControls();
    }

    protected void onVideoPlaybackCompleted()
    {
        setPreplayVisibility(true);
        showReviewControls();
    }

    protected void playFromMessage()
    {
    }

    protected void updateThumbnail()
    {
        thumbnail = a.createVideoThumbnailBitmap(rawVideoFile.getAbsolutePath());
        if (thumbnail != null && thumbnailView != null)
        {
            thumbnailView.setVisibility(0);
            thumbnailView.setImageBitmap(thumbnail);
        }
    }

}
