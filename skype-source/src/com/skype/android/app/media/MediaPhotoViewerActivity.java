// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.k;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.o;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.skype.MediaDocument;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.event.EventBus;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.ProgressCircleView;
import com.skype.android.widget.SqueezeableImageView;
import java.io.File;

// Referenced classes of package com.skype.android.app.media:
//            MediaLinkProfile, MediaDocumentFileProvider, MediaDocumentDownloadUtil, MediaDownloadErrorDialog, 
//            MediaSaveCallback, OnMediaDocumentLinkStatusChange, OnMediaDownloadCriticalError, OnMediaDownloadedForSave

public class MediaPhotoViewerActivity extends SkypeActivity
    implements android.os.Handler.Callback, android.view.View.OnClickListener
{

    private static final String EXTRA_SAVE_STATUS = "saveStatus";
    public static final String EXTRA_TITLE_TEXT = "TITLE_TEXT";
    private static final int HIDE_ACTION_BAR_DELAY = 5000;
    private static final int WHAT_HIDE_ACTION_BAR_MESSAGE = 1;
    AccessibilityUtil accessibility;
    Analytics analytics;
    EventBus eventBus;
    private Handler handler;
    private AsyncCallback imageCallback;
    SqueezeableImageView imageView;
    private MediaDocument mediaDocument;
    MediaDocumentDownloadUtil mediaDocumentDownloadUtil;
    NetworkUtil networkUtil;
    ProgressCircleView progressIndicator;
    private AsyncCallback saveImageCallback;
    private boolean saving;

    public MediaPhotoViewerActivity()
    {
        imageCallback = new AsyncCallback() {

            final MediaPhotoViewerActivity this$0;

            public final void done(AsyncResult asyncresult)
            {
label0:
                {
                    if (asyncresult.e())
                    {
                        asyncresult = (MediaDocumentDownloadUtil.GetMediaLinkResult)asyncresult.a();
                        Bitmap bitmap = (Bitmap)asyncresult.getMedia();
                        if (bitmap == null)
                        {
                            break label0;
                        }
                        imageView.setBitmap(bitmap);
                        imageView.setVisibility(0);
                        progressIndicator.setVisibility(8);
                        supportInvalidateOptionsMenu();
                    }
                    return;
                }
                if (asyncresult.getStatus() == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADING && !networkUtil.a())
                {
                    onDownloadError();
                    return;
                } else
                {
                    updateImageViewer(asyncresult.getStatus());
                    return;
                }
            }

            
            {
                this$0 = MediaPhotoViewerActivity.this;
                super();
            }
        };
    }

    private void cancelTimeout()
    {
        handler.removeMessages(1);
    }

    private Intent getShareIntent()
    {
        Object obj1 = mediaDocument.getMediaLink(MediaLinkProfile.SAVE_PROFILE.toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_ONLY);
        Object obj = obj1;
        if (((com.skype.MediaDocument.GetMediaLink_Result) (obj1)).m_return != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
        {
            obj1 = mediaDocument.getMediaLink(MediaLinkProfile.PREVIEW_PROFILE.toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_ONLY);
            obj = obj1;
            if (((com.skype.MediaDocument.GetMediaLink_Result) (obj1)).m_return != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
            {
                return null;
            }
        }
        obj = MediaDocumentFileProvider.getUriForFile(getApplicationContext(), new File(((com.skype.MediaDocument.GetMediaLink_Result) (obj)).m_path));
        obj1 = new Intent("android.intent.action.SEND");
        ((Intent) (obj1)).addFlags(1);
        ((Intent) (obj1)).putExtra("android.intent.extra.STREAM", ((android.os.Parcelable) (obj)));
        ((Intent) (obj1)).putExtra("INTENT_ORIGIN", com/skype/android/app/media/MediaPhotoViewerActivity.toString());
        ((Intent) (obj1)).setType(getContentResolver().getType(((android.net.Uri) (obj))));
        return ((Intent) (obj1));
    }

    private void hideActionBar()
    {
        if (getSupportActionBar().i())
        {
            getSupportActionBar().h();
        }
    }

    private boolean isPreviewVisible()
    {
        return imageView.getVisibility() == 0 || mediaDocumentDownloadUtil.isMediaLoadedInCache(mediaDocument, MediaLinkProfile.PREVIEW_PROFILE);
    }

    private void loadPhoto()
    {
        mediaDocumentDownloadUtil.getMediaPreviewAsync(mediaDocument, null, imageCallback);
    }

    private void onDownloadError()
    {
        MediaDownloadErrorDialog.create(true).show(getSupportFragmentManager());
    }

    private void saveImage(MediaLinkProfile medialinkprofile)
    {
        mediaDocumentDownloadUtil.saveMediaAsync(mediaDocument, medialinkprofile, saveImageCallback);
        saving = true;
    }

    private void setSharePhotoAction(MenuItem menuitem, boolean flag)
    {
label0:
        {
            menuitem.setVisible(flag);
            menuitem.setEnabled(flag);
            o o1 = new o(this);
            if (menuitem.isVisible())
            {
                k.a(menuitem, o1);
                menuitem = getShareIntent();
                if (menuitem != null)
                {
                    o1.a(menuitem);
                    if (!flag)
                    {
                        break label0;
                    }
                    cancelTimeout();
                }
            }
            return;
        }
        startTimeout();
    }

    private void showActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        if (isPreviewVisible() && !getSupportActionBar().i())
        {
            actionbar.g();
        }
    }

    private void startTimeout()
    {
        if (!accessibility.a())
        {
            handler.sendEmptyMessageDelayed(1, 5000L);
        }
    }

    private void updateImageViewer(com.skype.MediaDocument.MEDIA_STATUS media_status)
    {
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[];

            static 
            {
                $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS = new int[com.skype.MediaDocument.MEDIA_STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_NOT_AVAILABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_BAD_CONTENT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.skype.MediaDocument.MEDIA_STATUS[media_status.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 41
    //                   2 69
    //                   3 69
    //                   4 74;
           goto _L1 _L2 _L3 _L3 _L4
_L1:
        return;
_L2:
        if (progressIndicator.getVisibility() != 0)
        {
            imageView.setVisibility(8);
            progressIndicator.setVisibility(0);
            return;
        }
          goto _L1
_L3:
        onDownloadError();
        return;
_L4:
        loadPhoto();
        return;
    }

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            hideActionBar();
            return true;
        } else
        {
            return false;
        }
    }

    public void onClick(View view)
    {
        cancelTimeout();
        if (getSupportActionBar().i())
        {
            hideActionBar();
            return;
        } else
        {
            showActionBar();
            startTimeout();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        mediaDocument = (MediaDocument)getObjectInterface(com/skype/MediaDocument);
        getWindow().setBackgroundDrawable(null);
        getSupportActionBar().a(true);
        getSupportActionBar().a("");
        hideActionBar();
        handler = new Handler(this);
        imageView.setOnClickListener(this);
        loadPhoto();
        if (bundle != null)
        {
            saving = bundle.getBoolean("saveStatus");
        }
        saveImageCallback = new MediaSaveCallback(this, analytics, MediaLinkProfile.SAVE_PROFILE, eventBus);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        boolean flag1 = isPreviewVisible();
        getMenuInflater().inflate(0x7f110019, menu);
        Object obj;
        char c;
        boolean flag;
        if (!saving)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = menu.findItem(0x7f1005ef);
        ((MenuItem) (obj)).setVisible(flag1);
        ((MenuItem) (obj)).setEnabled(flag);
        obj = ((MenuItem) (obj)).getIcon();
        if (flag)
        {
            c = '\377';
        } else
        {
            c = '\200';
        }
        ((Drawable) (obj)).setAlpha(c);
        setSharePhotoAction(menu.findItem(0x7f1005ee), flag1);
        return true;
    }

    public void onEvent(OnMediaDocumentLinkStatusChange onmediadocumentlinkstatuschange)
    {
        if (onmediadocumentlinkstatuschange.getMediaDocumentId() == mediaDocument.getObjectID())
        {
            updateImageViewer(onmediadocumentlinkstatuschange.getStatus());
        }
    }

    public void onEvent(OnMediaDownloadCriticalError onmediadownloadcriticalerror)
    {
        if (onmediadownloadcriticalerror.getMediaDocumentId() == mediaDocument.getObjectID())
        {
            onDownloadError();
        }
    }

    public void onEvent(OnMediaDownloadedForSave onmediadownloadedforsave)
    {
        if (onmediadownloadedforsave.getMediaDocumentId() == mediaDocument.getObjectID())
        {
            saveImage(onmediadownloadedforsave.getProfile());
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756527: 
            supportInvalidateOptionsMenu();
            break;
        }
        saveImage(MediaLinkProfile.SAVE_PROFILE);
        return true;
    }

    public void onPause()
    {
        super.onPause();
        cancelTimeout();
    }

    public void onResume()
    {
        super.onResume();
        if (accessibility.a())
        {
            setTitle(getIntent().getStringExtra("TITLE_TEXT"));
        }
        if (isPreviewVisible())
        {
            startTimeout();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("saveStatus", saving);
        super.onSaveInstanceState(bundle);
    }


}
