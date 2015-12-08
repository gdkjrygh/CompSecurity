// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.l;
import android.view.View;
import com.skype.MediaDocument;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.chat.ChatFragmentProvider;
import com.skype.android.app.media.MediaDocumentFileProvider;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.app.media.XmmUtil;
import com.skype.android.mediacontent.MojiContent;
import com.skype.android.mediacontent.OnVideoReady;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.Log;
import java.io.File;

// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerDialogFragment, MojiPreviewContentView

public class MojiPreviewDialogFragment extends PickerDialogFragment
    implements MojiPreviewContentView.MojiPreviewHostCallback
{

    public static final String FRAGMENT_TAG = "previewDialog";
    Analytics analytics;
    private int height;
    ObjectIdMap map;
    private PickerItemInteractionManager.MediaPreviewCallback mediaPreviewCallback;
    private PickerItemInteractionManager.MediaSendCallback mediaSendCallback;
    private MojiContent moji;
    private MojiPreviewContentView mojiPreviewContentView;

    public MojiPreviewDialogFragment()
    {
    }

    public static void hide(l l1)
    {
        l1 = (MojiPreviewDialogFragment)l1.a("previewDialog");
        if (l1 != null)
        {
            l1.dismiss();
        }
    }

    public static boolean isShowing(l l1)
    {
        return l1.a("previewDialog") != null;
    }

    private void reportAnalytics(SkypeTelemetryEvent skypetelemetryevent, MediaDocument mediadocument)
    {
        reportAnalytics(skypetelemetryevent, mediadocument, null);
    }

    private void reportAnalytics(SkypeTelemetryEvent skypetelemetryevent, MediaDocument mediadocument, String s)
    {
        skypetelemetryevent.put(LogAttributeName.E, XmmUtil.getMetadataStringValue(mediadocument, "pickerTitle"));
        skypetelemetryevent.put(LogAttributeName.F, XmmUtil.getMediaDocumentId(mediadocument));
        if (s != null)
        {
            skypetelemetryevent.put(LogAttributeName.b, s);
        }
        analytics.a(skypetelemetryevent);
    }

    public static void show(l l1, int i, MojiContent mojicontent, PickerItemInteractionManager.MediaPreviewCallback mediapreviewcallback)
    {
        MojiPreviewDialogFragment mojipreviewdialogfragment = (MojiPreviewDialogFragment)l1.a("previewDialog");
        if (mojipreviewdialogfragment == null)
        {
            mojipreviewdialogfragment = new MojiPreviewDialogFragment();
            mojipreviewdialogfragment.moji = mojicontent;
            mojipreviewdialogfragment.height = i;
            mojipreviewdialogfragment.mediaPreviewCallback = mediapreviewcallback;
            mojipreviewdialogfragment.show(l1, "previewDialog");
            return;
        } else
        {
            mojipreviewdialogfragment.update(mojicontent);
            return;
        }
    }

    private void update(MojiContent mojicontent)
    {
        moji = mojicontent;
        mojiPreviewContentView.showMoji(mojicontent);
    }

    protected void destroy()
    {
        mojiPreviewContentView.stopPlayback();
    }

    protected int getAlignment()
    {
        return 48;
    }

    protected int getLayoutId()
    {
        return 0x7f0300d4;
    }

    protected int getRootViewId()
    {
        return 0x7f10049b;
    }

    protected int getWindowHeight()
    {
        return height;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        try
        {
            mediaSendCallback = ((ChatFragmentProvider)getActivity()).getChatFragment();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.e("previewDialog", "The fragment intending to showing this dialog must implement ChatFragmentProvider so that MediaSendCallback can be obtained");
            throw new IllegalStateException("Fragment hosting MojiPreview Dialog must implement MediaSendCallback");
        }
        return super.onCreateDialog(bundle);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        destroy();
        if (mediaPreviewCallback != null)
        {
            mediaPreviewCallback.onMojiPreviewDismissed();
        }
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnMediaLinkProgress onmedialinkprogress)
    {
        int i = onmedialinkprogress.getSender().getObjectID();
        MediaLinkProfile medialinkprofile = MediaLinkProfile.fromString(onmedialinkprogress.getProfile());
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$app$media$MediaLinkProfile[];

            static 
            {
                $SwitchMap$com$skype$android$app$media$MediaLinkProfile = new int[MediaLinkProfile.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.DEFAULT_PROFILE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1..SwitchMap.com.skype.android.app.media.MediaLinkProfile[medialinkprofile.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            mojiPreviewContentView.updateDownloadProgress(i, onmedialinkprogress.getTotalSize(), onmedialinkprogress.getSizeDownloaded());
            break;
        }
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnMediaLinkStatusChange onmedialinkstatuschange)
    {
        int i = onmedialinkstatuschange.getSender().getObjectID();
        MediaLinkProfile medialinkprofile = MediaLinkProfile.fromString(onmedialinkstatuschange.getProfile());
        switch (_cls1..SwitchMap.com.skype.android.app.media.MediaLinkProfile[medialinkprofile.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            mojiPreviewContentView.updateMediaLink(i, onmedialinkstatuschange.getStatus());
            break;
        }
    }

    public void onEvent(OnVideoReady onvideoready)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null && onvideoready.b() == moji.k())
        {
            onvideoready = MediaDocumentFileProvider.getUriForFile(fragmentactivity, new File(onvideoready.a()));
            mojiPreviewContentView.setVideoURI(onvideoready);
        }
    }

    public void onPause()
    {
        super.onPause();
        mojiPreviewContentView.stopVideoAndPutSendOverlay();
        mojiPreviewContentView.setEnableMediaAutoplayOnLoad(false);
    }

    protected void onViewCreated(View view)
    {
        if (mojiPreviewContentView == null)
        {
            mojiPreviewContentView = new MojiPreviewContentView(mediaContentRoster, map, mediaSendCallback, this, analytics);
        }
        mojiPreviewContentView.initializeContentView(view, getResources());
        mojiPreviewContentView.setEnableMediaAutoplayOnLoad(true);
        mojiPreviewContentView.showMoji(moji);
    }
}
