// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.MediaDocument;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.media.XmmUtil;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.MojiContent;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.widget.ChatVideoTextureView;
import com.skype.android.widget.CircularProgressBar;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.fliks.FlikRelativeLayout;

public class MojiPreviewContentView
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnPreparedListener, android.view.View.OnClickListener
{
    public static interface MojiPreviewHostCallback
    {

        public abstract void dismiss();
    }


    private Analytics analytics;
    private View closePreviewButton;
    private TextView copyrightInformation;
    private CircularProgressBar downloadProgressBar;
    private boolean enableMediaAutoplayOnLoad;
    private ObjectIdMap map;
    private MediaContentRoster mediaContentRoster;
    private PickerItemInteractionManager.MediaSendCallback mediaSendCallback;
    private MojiContent moji;
    private MojiPreviewHostCallback mojiPreviewHostCallback;
    private ChatVideoTextureView previewVideoView;
    private SymbolView refreshSymbolView;
    private View replayMojiButton;
    private View rootView;
    private View sendView;
    private ImageView thumbnailView;
    private TextView title;

    public MojiPreviewContentView(MediaContentRoster mediacontentroster, ObjectIdMap objectidmap, PickerItemInteractionManager.MediaSendCallback mediasendcallback, MojiPreviewHostCallback mojipreviewhostcallback, Analytics analytics1)
    {
        mojiPreviewHostCallback = mojipreviewhostcallback;
        mediaContentRoster = mediacontentroster;
        map = objectidmap;
        mediaSendCallback = mediasendcallback;
        analytics = analytics1;
    }

    private void clearSurfaceView()
    {
        previewVideoView.setVideoURI(null);
        ViewGroup viewgroup = (ViewGroup)previewVideoView.getParent();
        viewgroup.removeView(previewVideoView);
        viewgroup.addView(previewVideoView, 1);
        previewVideoView.setVisibility(0);
    }

    private void dismissIfHostAllows()
    {
        if (mojiPreviewHostCallback != null)
        {
            mojiPreviewHostCallback.dismiss();
        }
    }

    private boolean isVideoUnavailable(com.skype.MediaDocument.MEDIA_STATUS media_status)
    {
        return media_status == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_BAD_CONTENT || media_status == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_NOT_AVAILABLE;
    }

    private void load()
    {
        if (moji != null)
        {
            clearSurfaceView();
            if (moji.f() != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
            {
                replayMojiButton.setVisibility(8);
            }
            mediaContentRoster.c(moji.k());
            sendView.setVisibility(8);
            refreshSymbolView.setVisibility(8);
            thumbnailView.setImageDrawable(moji.b());
            title.setText(moji.m());
            copyrightInformation.setText(moji.a());
            return;
        } else
        {
            dismissIfHostAllows();
            return;
        }
    }

    private void reportAnalytics(SkypeTelemetryEvent skypetelemetryevent, MediaDocument mediadocument)
    {
        reportAnalytics(skypetelemetryevent, mediadocument, null);
    }

    private void reportAnalytics(SkypeTelemetryEvent skypetelemetryevent, MediaDocument mediadocument, String s)
    {
        if (analytics != null)
        {
            skypetelemetryevent.put(LogAttributeName.E, XmmUtil.getMetadataStringValue(mediadocument, "pickerTitle"));
            skypetelemetryevent.put(LogAttributeName.F, XmmUtil.getMediaDocumentId(mediadocument));
            if (s != null)
            {
                skypetelemetryevent.put(LogAttributeName.b, s);
            }
            analytics.a(skypetelemetryevent);
        }
    }

    public void initializeContentView(View view, Resources resources)
    {
        previewVideoView = (ChatVideoTextureView)view.findViewById(0x7f1004a0);
        previewVideoView.setOnPreparedListener(this);
        previewVideoView.setOnCompletionListener(this);
        closePreviewButton = view.findViewById(0x7f10049c);
        if (mojiPreviewHostCallback != null)
        {
            closePreviewButton.setOnClickListener(this);
        } else
        {
            closePreviewButton.setVisibility(8);
        }
        rootView = view.findViewById(0x7f10049b);
        rootView.setOnClickListener(this);
        thumbnailView = (ImageView)view.findViewById(0x7f10049f);
        thumbnailView.setOnClickListener(this);
        replayMojiButton = view.findViewById(0x7f10049d);
        replayMojiButton.setOnClickListener(this);
        title = (TextView)view.findViewById(0x7f1004a6);
        copyrightInformation = (TextView)view.findViewById(0x7f1004a7);
        sendView = view.findViewById(0x7f1004a3);
        sendView.setOnClickListener(this);
        downloadProgressBar = (CircularProgressBar)view.findViewById(0x7f1004a2);
        downloadProgressBar.setProgressColor(resources.getColor(0x7f0f00af));
        downloadProgressBar.setProgressBackgroundColor(resources.getColor(0x7f0f013a));
        downloadProgressBar.setProgressWidth(resources.getDimensionPixelSize(0x7f0c017d));
        refreshSymbolView = (SymbolView)view.findViewById(0x7f1004a1);
        ((FlikRelativeLayout)view.findViewById(0x7f10049e)).a(resources.getColor(0x7f0f0135));
        if (enableMediaAutoplayOnLoad)
        {
            load();
        }
        enableMediaAutoplayOnLoad = true;
    }

    public void onClick(View view)
    {
        enableMediaAutoplayOnLoad = true;
        MediaDocument mediadocument = (MediaDocument)map.a(moji.k(), com/skype/MediaDocument);
        if (view == closePreviewButton || view == rootView)
        {
            dismissIfHostAllows();
        } else
        {
            if (view == thumbnailView)
            {
                stopVideoAndPutSendOverlay();
                reportAnalytics(new SkypeTelemetryEvent(LogEvent.Z), mediadocument);
                return;
            }
            if (view == sendView)
            {
                mediaSendCallback.onSendMoji(moji);
                dismissIfHostAllows();
                reportAnalytics(new SkypeTelemetryEvent(LogEvent.ae), mediadocument);
                return;
            }
            if (view == replayMojiButton)
            {
                if (previewVideoView.isPlaying())
                {
                    previewVideoView.seekTo(0);
                    reportAnalytics(new SkypeTelemetryEvent(LogEvent.aa), mediadocument);
                    return;
                } else
                {
                    load();
                    reportAnalytics(new SkypeTelemetryEvent(LogEvent.ab), mediadocument);
                    return;
                }
            }
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        previewVideoView.setVisibility(8);
        sendView.setVisibility(0);
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        refreshSymbolView.setVisibility(8);
        downloadProgressBar.setVisibility(8);
        replayMojiButton.setVisibility(0);
        if (enableMediaAutoplayOnLoad)
        {
            previewVideoView.start();
            mediaplayer = (MediaDocument)map.a(moji.k(), com/skype/MediaDocument);
            if (analytics != null)
            {
                SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.X);
                skypetelemetryevent.put(LogAttributeName.E, moji.m());
                skypetelemetryevent.put(LogAttributeName.F, XmmUtil.getMediaDocumentId(mediaplayer));
                skypetelemetryevent.put(LogAttributeName.I, moji.r());
                LogAttributeName logattributename = LogAttributeName.H;
                if (moji.q())
                {
                    mediaplayer = "Featured";
                } else
                {
                    mediaplayer = "Regular";
                }
                skypetelemetryevent.put(logattributename, mediaplayer);
                analytics.a(skypetelemetryevent);
            }
        }
        enableMediaAutoplayOnLoad = true;
    }

    public void setEnableMediaAutoplayOnLoad(boolean flag)
    {
        enableMediaAutoplayOnLoad = flag;
    }

    public void setVideoURI(Uri uri)
    {
        previewVideoView.setVideoURI(uri);
    }

    public void showMoji(MojiContent mojicontent)
    {
        moji = mojicontent;
        load();
    }

    public void stopPlayback()
    {
        previewVideoView.a();
    }

    public void stopVideoAndPutSendOverlay()
    {
        if (previewVideoView.isPlaying())
        {
            previewVideoView.a();
            previewVideoView.setVisibility(8);
            sendView.setVisibility(0);
        }
    }

    public void updateDownloadProgress(int i, int j, int k)
    {
        if (moji.k() == i)
        {
            refreshSymbolView.setVisibility(8);
            downloadProgressBar.setVisibility(0);
            downloadProgressBar.setMax(j);
            downloadProgressBar.setProgress(k);
        }
    }

    public void updateMediaLink(int i, com.skype.MediaDocument.MEDIA_STATUS media_status)
    {
        MediaDocument mediadocument = (MediaDocument)map.a(i, com/skype/MediaDocument);
        if (moji.k() == i && isVideoUnavailable(media_status))
        {
            downloadProgressBar.setVisibility(8);
            refreshSymbolView.setVisibility(0);
            reportAnalytics(new SkypeTelemetryEvent(LogEvent.Y), mediadocument, media_status.name());
        }
    }
}
