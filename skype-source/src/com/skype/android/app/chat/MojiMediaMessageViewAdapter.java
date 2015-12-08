// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.LevelListDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.util.a;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.app.media.MediaDocumentFileProvider;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.app.media.MojiPlaybackStateHolder;
import com.skype.android.app.media.XmmUtil;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.LifecycleListener;
import com.skype.android.media.ScaleMode;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.ChatVideoTextureView;
import com.skype.android.widget.CircularProgressBar;
import com.skype.android.widget.ProgressCircleView;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.Bubblable;
import com.skype.android.widget.bubbles.BubbleTextView;
import com.skype.android.widget.fliks.FlikRelativeLayout;
import java.io.File;

// Referenced classes of package com.skype.android.app.chat:
//            MediaMessageViewAdapter, MessageViewAdapterComponent, MessageHolder, j, 
//            ChatFragmentProvider, ChatFragment

public class MojiMediaMessageViewAdapter extends MediaMessageViewAdapter
    implements LifecycleListener
{
    private final class a extends MediaMessageViewAdapter.MediaMessageViewHolder
    {

        TextView callToActionView;
        TextView copyrightInformationView;
        SymbolView forwardMojiButton;
        ProgressCircleView indeterminateProgressIndicator;
        RelativeLayout infoLayout;
        TextView itemInfoView;
        RelativeLayout itemLayout;
        View overlay;
        CircularProgressBar progressBar;
        SymbolView symbolView;
        final MojiMediaMessageViewAdapter this$0;
        ChatVideoTextureView videoTextureView;

        final void initializeViews()
        {
            ViewGroup viewgroup = getInlineContent();
            itemLayout = (RelativeLayout)ViewUtil.a(viewgroup, 0x7f1002a0);
            thumbnail = (ImageView)ViewUtil.a(viewgroup, 0x7f1002a1);
            overlay = ViewUtil.a(viewgroup, 0x7f1002a3);
            indeterminateProgressIndicator = (ProgressCircleView)ViewUtil.a(viewgroup, 0x7f1002a4);
            progressBar = (CircularProgressBar)ViewUtil.a(viewgroup, 0x7f1002a5);
            symbolView = (SymbolView)ViewUtil.a(viewgroup, 0x7f1002a6);
            videoTextureView = (ChatVideoTextureView)ViewUtil.a(viewgroup, 0x7f1002a2);
            mediaRemovedTextView = (BubbleTextView)ViewUtil.a(viewgroup, 0x7f1002b6);
            infoLayout = (RelativeLayout)ViewUtil.a(viewgroup, 0x7f10029b);
            itemInfoView = (TextView)ViewUtil.a(viewgroup, 0x7f10029c);
            callToActionView = (TextView)ViewUtil.a(viewgroup, 0x7f10029d);
            copyrightInformationView = (TextView)ViewUtil.a(viewgroup, 0x7f10029e);
            forwardMojiButton = (SymbolView)ViewUtil.a(viewgroup, 0x7f10029f);
            progressBar.setProgressBackgroundColor(getContext().getResources().getColor(0x7f0f00ae));
            progressBar.setProgressColor(getContext().getResources().getColor(0x7f0f00af));
            progressBar.setProgressWidth(getContext().getResources().getDimensionPixelSize(0x7f0c017d));
            ((FlikRelativeLayout)itemLayout).a(getContext().getResources().getColor(0x7f0f0135));
        }

        public a(View view)
        {
            this$0 = MojiMediaMessageViewAdapter.this;
            super(MojiMediaMessageViewAdapter.this, view);
        }
    }

    private static final class b extends Enum
    {

        private static final b $VALUES[];
        public static final b LOADING_MOJI;
        public static final b LOADING_PREVIEW;
        public static final b PLAYED;
        public static final b PLAYING;
        public static final b READY_FOR_PLAY;
        public static final b UNAVAILABLE_MOJI;
        public static final b UNAVAILABLE_PREVIEW;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/skype/android/app/chat/MojiMediaMessageViewAdapter$b, s);
        }

        public static b[] values()
        {
            return (b[])$VALUES.clone();
        }

        static 
        {
            LOADING_PREVIEW = new b("LOADING_PREVIEW", 0);
            LOADING_MOJI = new b("LOADING_MOJI", 1);
            UNAVAILABLE_PREVIEW = new b("UNAVAILABLE_PREVIEW", 2);
            UNAVAILABLE_MOJI = new b("UNAVAILABLE_MOJI", 3);
            READY_FOR_PLAY = new b("READY_FOR_PLAY", 4);
            PLAYING = new b("PLAYING", 5);
            PLAYED = new b("PLAYED", 6);
            $VALUES = (new b[] {
                LOADING_PREVIEW, LOADING_MOJI, UNAVAILABLE_PREVIEW, UNAVAILABLE_MOJI, READY_FOR_PLAY, PLAYING, PLAYED
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int supportedMessageTypes[];
    Analytics analytics;
    private a currentlyPlayingViewHolder;
    EcsConfiguration ecsConfiguration;
    private MojiPlaybackStateHolder mojiPlaybackStateHolder;

    public MojiMediaMessageViewAdapter(Activity activity, MediaDocumentDownloadUtil mediadocumentdownloadutil, MojiPlaybackStateHolder mojiplaybackstateholder)
    {
        super(activity, mediadocumentdownloadutil);
        getComponent().inject(this);
        mojiPlaybackStateHolder = mojiplaybackstateholder;
    }

    private void bindContentViewForMoji(a a1, MediaDocument mediadocument)
    {
        com.skype.MediaDocument.GetMediaLink_Result getmedialink_result = mediadocument.getMediaLink(MediaLinkProfile.DEFAULT_PROFILE.toString());
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[];
            static final int $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[];

            static 
            {
                $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS = new int[com.skype.MediaDocument.MEDIA_STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_BAD_CONTENT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_NOT_AVAILABLE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState = new int[b.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[b.LOADING_MOJI.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[b.UNAVAILABLE_MOJI.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[b.READY_FOR_PLAY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[b.PLAYED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[b.PLAYING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[b.UNAVAILABLE_PREVIEW.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.skype.MediaDocument.MEDIA_STATUS[getmedialink_result.m_return.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            startPlayback(a1, getmedialink_result.m_path);
            return;

        case 2: // '\002'
            setLoadingMojiViewState(a1, mediadocument);
            return;

        case 3: // '\003'
        case 4: // '\004'
            setUnavailableMojiViewState(a1);
            break;
        }
        mojiPlaybackStateHolder.resetCurrentlyPlaying();
    }

    private void displayThumbnail(a a1)
    {
        loadThumbnail(getMediaDocument(a1.messageId), a1);
    }

    private void handleMojiSelectedForPlayback(a a1, int i)
    {
        if (currentlyPlayingViewHolder != null)
        {
            if (currentlyPlayingViewHolder.videoTextureView.isPlaying())
            {
                currentlyPlayingViewHolder.videoTextureView.a();
            }
            displayThumbnail(currentlyPlayingViewHolder);
        }
        currentlyPlayingViewHolder = a1;
        mojiPlaybackStateHolder.onMojiSelectedForPlayback(a1.messageId, i);
    }

    private void hideIndeterminateProgress(a a1)
    {
        a1.indeterminateProgressIndicator.setVisibility(8);
        updateHolderRecyclability(a1, true);
    }

    private void hideProgressBar(a a1)
    {
        a1.progressBar.setVisibility(8);
    }

    private void onPlaybackCompletion(a a1)
    {
        mojiPlaybackStateHolder.onPlaybackCompletion(a1.messageId, XmmUtil.getMediaDocumentId(getMediaDocument(a1.messageId)), analytics);
        currentlyPlayingViewHolder = null;
        displayThumbnail(a1);
    }

    private void onPlaybackStopped(a a1)
    {
        mojiPlaybackStateHolder.resetCurrentlyPlaying();
        currentlyPlayingViewHolder = null;
        displayThumbnail(a1);
    }

    private void playMoji(a a1)
    {
        MediaDocument mediadocument = getMediaDocument(a1.messageId);
        handleMojiSelectedForPlayback(a1, mediadocument.getObjectID());
        bindContentViewForMoji(a1, mediadocument);
        if (mojiPlaybackStateHolder.hasPlayed(a1.messageId))
        {
            a1 = new SkypeTelemetryEvent(LogEvent.T);
        } else
        {
            a1 = new SkypeTelemetryEvent(LogEvent.U);
        }
        reportAnalytics(a1, mediadocument);
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
            skypetelemetryevent.put(LogAttributeName.a, s);
        }
        analytics.a(skypetelemetryevent);
    }

    private void retryDownload(a a1, b b1)
    {
        MediaDocument mediadocument = getMediaDocument(a1.messageId);
        switch (_cls2..SwitchMap.com.skype.android.app.chat.MojiMediaMessageViewAdapter.ViewState[b1.ordinal()])
        {
        default:
            return;

        case 6: // '\006'
            loadThumbnail(mediadocument, a1);
            break;
        }
    }

    private void setLoadingMojiViewState(a a1, MediaDocument mediadocument)
    {
        displayThumbnail(a1);
        hideIndeterminateProgress(a1);
        a1.symbolView.setVisibility(8);
        updateOverlay(a1, b.LOADING_MOJI);
        a1.progressBar.setVisibility(0);
        int i = mediadocument.getObjectID();
        a1.progressBar.setMax(mojiPlaybackStateHolder.getTotalSize(i));
        a1.progressBar.setProgress(mojiPlaybackStateHolder.getSizeDownloaded(i));
        a1.videoTextureView.setVisibility(8);
        enableClickForTimestamp(a1.itemLayout, a1.getLayoutPosition());
    }

    private void setUnavailableMojiViewState(a a1)
    {
        b b1 = b.UNAVAILABLE_MOJI;
        hideProgressBar(a1);
        hideIndeterminateProgress(a1);
        updateSymbol(a1, b1);
        updateOverlay(a1, b1);
        a1.videoTextureView.setVisibility(8);
        enableClickForTimestamp(a1.itemLayout, a1.getLayoutPosition());
    }

    private void startPlayback(final a holder, String s)
    {
        final long startTime = System.currentTimeMillis();
        b b1 = b.PLAYING;
        hideProgressBar(holder);
        hideIndeterminateProgress(holder);
        updateSymbol(holder, b1);
        updateOverlay(holder, b1);
        holder.videoTextureView.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

            final MojiMediaMessageViewAdapter this$0;
            final a val$holder;
            final long val$startTime;

            public final void onPrepared(MediaPlayer mediaplayer)
            {
                if (mojiPlaybackStateHolder.isCurrentlyPlayingMessage(holder.messageId))
                {
                    holder.itemLayout.setOnClickListener(new android.view.View.OnClickListener() {

                        final _cls7 this$1;

                        public final void onClick(View view)
                        {
                            if (holder.videoTextureView.isPlaying())
                            {
                                holder.videoTextureView.a();
                            }
                            onPlaybackStopped(holder);
                        }

            
            {
                this$1 = _cls7.this;
                super();
            }
                    });
                    int i = mojiPlaybackStateHolder.getCurrentPosition(holder.messageId);
                    if (i > 0)
                    {
                        holder.videoTextureView.seekTo(i);
                    }
                    holder.videoTextureView.start();
                    long l = System.currentTimeMillis();
                    long l1 = startTime;
                    reportAnalytics(new SkypeTelemetryEvent(LogEvent.ac), getMediaDocument(holder.messageId), String.valueOf(l - l1));
                    return;
                } else
                {
                    displayThumbnail(holder);
                    return;
                }
            }

            
            {
                this$0 = MojiMediaMessageViewAdapter.this;
                holder = a1;
                startTime = l;
                super();
            }
        });
        holder.videoTextureView.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() {

            final MojiMediaMessageViewAdapter this$0;
            final a val$holder;

            public final boolean onError(MediaPlayer mediaplayer, int i, int j)
            {
                onPlaybackStopped(holder);
                reportAnalytics(new SkypeTelemetryEvent(LogEvent.V), getMediaDocument(holder.messageId));
                return true;
            }

            
            {
                this$0 = MojiMediaMessageViewAdapter.this;
                holder = a1;
                super();
            }
        });
        holder.videoTextureView.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

            final MojiMediaMessageViewAdapter this$0;
            final a val$holder;

            public final void onCompletion(MediaPlayer mediaplayer)
            {
                onPlaybackCompletion(holder);
            }

            
            {
                this$0 = MojiMediaMessageViewAdapter.this;
                holder = a1;
                super();
            }
        });
        holder.videoTextureView.setOnSurfaceTextureDestroyedListener(new com.skype.android.widget.ChatVideoTextureView.SurfaceTextureDestroyedListener() {

            final MojiMediaMessageViewAdapter this$0;
            final a val$holder;

            public final void onSurfaceTextureDestroyed()
            {
                if (mojiPlaybackStateHolder.isCurrentlyPlayingMessage(holder.messageId))
                {
                    mojiPlaybackStateHolder.setCurrentPosition(holder.messageId, holder.videoTextureView.getCurrentPosition());
                }
            }

            
            {
                this$0 = MojiMediaMessageViewAdapter.this;
                holder = a1;
                super();
            }
        });
        holder.videoTextureView.setVisibility(0);
        holder.videoTextureView.setScaleMode(ScaleMode.b);
        s = MediaDocumentFileProvider.getUriForFile(getContext(), new File(s));
        holder.videoTextureView.setVideoURI(s);
        updateHolderRecyclability(holder, false);
    }

    private void updateInfoLayout(final Message ctaTitle, final MediaDocument mediaDocument, a a1)
    {
        ctaTitle = mediaDocument.getMetadataStringValue("description");
        if (!((com.skype.MediaDocument.GetMetadataStringValue_Result) (ctaTitle)).m_return)
        {
            mediaDocument.sync();
        }
        ctaTitle = ((com.skype.MediaDocument.GetMetadataStringValue_Result) (ctaTitle)).m_value;
        if (!TextUtils.isEmpty(ctaTitle))
        {
            a1.itemInfoView.setText(ctaTitle);
            a1.itemInfoView.setVisibility(0);
        } else
        {
            a1.itemInfoView.setVisibility(8);
        }
        ctaTitle = mediaDocument.getMetadataStringValue("auxiliaryText").m_value;
        if (!TextUtils.isEmpty(ctaTitle))
        {
            a1.callToActionView.setText(ctaTitle);
            a1.callToActionView.setVisibility(0);
            final String url = mediaDocument.getMetadataStringValue("auxiliaryUrl").m_value;
            if (!TextUtils.isEmpty(url))
            {
                a1.callToActionView.setOnClickListener(new android.view.View.OnClickListener() {

                    final MojiMediaMessageViewAdapter this$0;
                    final String val$ctaTitle;
                    final MediaDocument val$mediaDocument;
                    final String val$url;

                    public final void onClick(View view)
                    {
                        navigationUrl.goToUrl(getContext(), url, true);
                        reportAnalytics(new SkypeTelemetryEvent(LogEvent.O), mediaDocument, ctaTitle);
                    }

            
            {
                this$0 = MojiMediaMessageViewAdapter.this;
                url = s;
                mediaDocument = mediadocument;
                ctaTitle = s1;
                super();
            }
                });
            }
        } else
        {
            a1.callToActionView.setVisibility(8);
        }
        ctaTitle = mediaDocument.getMetadataStringValue("copyright").m_value;
        if (!TextUtils.isEmpty(ctaTitle))
        {
            a1.copyrightInformationView.setText(ctaTitle);
            a1.copyrightInformationView.setVisibility(0);
        } else
        {
            a1.copyrightInformationView.setVisibility(8);
        }
        if (ecsConfiguration.isExpMojiForwardButtonEnabled())
        {
            a1.forwardMojiButton.setVisibility(0);
            a1.forwardMojiButton.setOnClickListener(new android.view.View.OnClickListener() {

                final MojiMediaMessageViewAdapter this$0;
                final MediaDocument val$mediaDocument;

                public final void onClick(View view)
                {
                    ((ChatFragmentProvider)getContext()).getChatFragment().forwardMoji(mediaDocument.getObjectID(), 6, ChatFragment.MojiForwardSource.BUTTON);
                }

            
            {
                this$0 = MojiMediaMessageViewAdapter.this;
                mediaDocument = mediadocument;
                super();
            }
            });
            return;
        } else
        {
            a1.forwardMojiButton.setVisibility(8);
            return;
        }
    }

    private void updateOverlay(a a1, b b1)
    {
        int i = -1;
        _cls2..SwitchMap.com.skype.android.app.chat.MojiMediaMessageViewAdapter.ViewState[b1.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 82
    //                   2 89
    //                   3 96
    //                   4 96
    //                   5 103;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_103;
_L6:
        if (i > 0)
        {
            ((LevelListDrawable)a1.overlay.getBackground()).setLevel(getContext().getResources().getInteger(i));
            a1.overlay.setVisibility(0);
            return;
        } else
        {
            a1.overlay.setVisibility(8);
            return;
        }
_L2:
        i = 0x7f0e001f;
          goto _L6
_L3:
        i = 0x7f0e0020;
          goto _L6
_L4:
        i = 0x7f0e0021;
          goto _L6
        i = 0x7f0e0022;
          goto _L6
    }

    private void updateSymbol(final a holder, final b viewState)
    {
        com.skype.android.widget.SymbolElement.SymbolCode symbolcode;
        android.view.View.OnClickListener onclicklistener;
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        byte byte0;
        boolean flag;
        boolean flag1;
        byte0 = -1;
        symbolcode = com.skype.android.widget.SymbolElement.SymbolCode.a;
        obj1 = null;
        flag = false;
        flag1 = false;
        obj = null;
        i = byte0;
        onclicklistener = obj;
        symbolcode = obj1;
        j = ((flag) ? 1 : 0);
        k = ((flag1) ? 1 : 0);
        _cls2..SwitchMap.com.skype.android.app.chat.MojiMediaMessageViewAdapter.ViewState[viewState.ordinal()];
        JVM INSTR tableswitch 2 6: default 80
    //                   2 270
    //                   3 237
    //                   4 237
    //                   5 99
    //                   6 203;
           goto _L1 _L2 _L3 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_270;
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        k = ((flag1) ? 1 : 0);
        j = ((flag) ? 1 : 0);
        symbolcode = obj1;
        onclicklistener = obj;
        i = byte0;
_L6:
        if (i > 0 && symbolcode != com.skype.android.widget.SymbolElement.SymbolCode.a)
        {
            ((LevelListDrawable)holder.symbolView.getBackground()).setLevel(getContext().getResources().getInteger(i));
            holder.symbolView.setSymbolCode(symbolcode);
            holder.symbolView.setVisibility(0);
            holder.symbolView.setTextColor(getContext().getResources().getColor(j));
            holder.symbolView.setTextSize(0, getContext().getResources().getDimensionPixelSize(k));
            holder.symbolView.setOnClickListener(onclicklistener);
            return;
        } else
        {
            holder.symbolView.setVisibility(8);
            return;
        }
_L5:
        symbolcode = com.skype.android.widget.SymbolElement.SymbolCode.dP;
        i = 0x7f0e0025;
        j = 0x7f0f00b0;
        k = 0x7f0c0180;
        onclicklistener = new android.view.View.OnClickListener() {

            final MojiMediaMessageViewAdapter this$0;
            final a val$holder;
            final b val$viewState;

            public final void onClick(View view)
            {
                retryDownload(holder, viewState);
            }

            
            {
                this$0 = MojiMediaMessageViewAdapter.this;
                holder = a1;
                viewState = b1;
                super();
            }
        };
          goto _L6
_L3:
        symbolcode = com.skype.android.widget.SymbolElement.SymbolCode.bV;
        i = 0x7f0e0024;
        j = 0x7f0f00b0;
        k = 0x7f0c0178;
        onclicklistener = new android.view.View.OnClickListener() {

            final MojiMediaMessageViewAdapter this$0;
            final a val$holder;

            public final void onClick(View view)
            {
                playMoji(holder);
            }

            
            {
                this$0 = MojiMediaMessageViewAdapter.this;
                holder = a1;
                super();
            }
        };
          goto _L6
        symbolcode = com.skype.android.widget.SymbolElement.SymbolCode.fs;
        i = 0x7f0e0026;
        j = 0x7f0f00b1;
        k = 0x7f0c0180;
        onclicklistener = obj;
          goto _L6
    }

    protected void alignContentView(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder, boolean flag)
    {
        super.alignContentView(mediamessageviewholder, flag);
        mediamessageviewholder = (a)mediamessageviewholder;
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)((a) (mediamessageviewholder)).itemLayout.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)((a) (mediamessageviewholder)).infoLayout.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams2 = (android.widget.RelativeLayout.LayoutParams)((a) (mediamessageviewholder)).itemInfoView.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams3 = (android.widget.RelativeLayout.LayoutParams)((a) (mediamessageviewholder)).callToActionView.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams4 = (android.widget.RelativeLayout.LayoutParams)((a) (mediamessageviewholder)).copyrightInformationView.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams5 = (android.widget.RelativeLayout.LayoutParams)((a) (mediamessageviewholder)).forwardMojiButton.getLayoutParams();
        if (flag)
        {
            layoutparams.addRule(11);
            layoutparams.addRule(9, 0);
            layoutparams.setMargins(layoutparams.leftMargin, layoutparams.topMargin, 0, layoutparams.bottomMargin);
            layoutparams1.addRule(0, ((a) (mediamessageviewholder)).itemLayout.getId());
            layoutparams1.addRule(1, 0);
            layoutparams1.setMargins(0, 0, getContext().getResources().getDimensionPixelSize(0x7f0c017a), 0);
            layoutparams3.addRule(9, 0);
            layoutparams3.addRule(11, -1);
            layoutparams4.addRule(9, 0);
            layoutparams4.addRule(11, -1);
            layoutparams5.addRule(9, 0);
            layoutparams5.addRule(11, -1);
            layoutparams2.addRule(9, 0);
            layoutparams2.addRule(11, -1);
            ((a) (mediamessageviewholder)).itemInfoView.setGravity(5);
            ((a) (mediamessageviewholder)).callToActionView.setGravity(5);
            ((a) (mediamessageviewholder)).copyrightInformationView.setGravity(5);
            ((a) (mediamessageviewholder)).forwardMojiButton.setGravity(5);
        } else
        {
            layoutparams.addRule(9);
            layoutparams.addRule(11, 0);
            layoutparams.setMargins(layoutparams.leftMargin, layoutparams.topMargin, getContext().getResources().getDimensionPixelSize(0x7f0c017a), layoutparams.bottomMargin);
            layoutparams1.addRule(1, ((a) (mediamessageviewholder)).itemLayout.getId());
            layoutparams1.addRule(0, 0);
            layoutparams1.setMargins(0, 0, 0, 0);
            layoutparams3.addRule(11, 0);
            layoutparams3.addRule(9, -1);
            layoutparams4.addRule(11, 0);
            layoutparams4.addRule(9, -1);
            layoutparams5.addRule(11, 0);
            layoutparams5.addRule(9, -1);
            layoutparams2.addRule(11, 0);
            layoutparams2.addRule(9, -1);
            ((a) (mediamessageviewholder)).itemInfoView.setGravity(3);
            ((a) (mediamessageviewholder)).callToActionView.setGravity(3);
            ((a) (mediamessageviewholder)).copyrightInformationView.setGravity(3);
            ((a) (mediamessageviewholder)).forwardMojiButton.setGravity(5);
        }
        ((a) (mediamessageviewholder)).itemLayout.setLayoutParams(layoutparams);
        ((a) (mediamessageviewholder)).infoLayout.setLayoutParams(layoutparams1);
    }

    protected void bindContentView(j j, MessageHolder messageholder)
    {
        super.bindContentView(j, messageholder);
        j = (a)j;
        messageholder = (Message)messageholder.getMessageObject();
        setOnItemLongClickListener(messageholder, ((a) (j)).itemLayout, j.getLayoutPosition());
        setOnItemLongClickListener(messageholder, ((a) (j)).symbolView, j.getLayoutPosition());
    }

    protected void bindContentViewForMedia(Message message, MediaDocument mediadocument, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        a a1 = (a)mediamessageviewholder;
        a1.infoLayout.setVisibility(0);
        a1.itemLayout.setVisibility(0);
        a1.mediaRemovedTextView.setVisibility(8);
        updateInfoLayout(message, mediadocument, a1);
        if (mojiPlaybackStateHolder.isCurrentlyPlayingMessage(message.getObjectID()))
        {
            bindContentViewForMoji(a1, mediadocument);
            return;
        } else
        {
            super.bindContentViewForMedia(message, mediadocument, mediamessageviewholder);
            return;
        }
    }

    protected void bindContentViewForRemovedMedia(j j, MessageHolder messageholder, boolean flag)
    {
        a a1 = (a)j;
        a1.infoLayout.setVisibility(8);
        a1.itemLayout.setVisibility(8);
        super.bindContentViewForRemovedMedia(j, messageholder, flag);
    }

    public volatile void bindViewHolder(j j, MessageHolder messageholder, android.support.v7.util.a a1)
    {
        super.bindViewHolder(j, messageholder, a1);
    }

    protected j createMessageViewHolder(View view)
    {
        return new a(view);
    }

    public volatile j createMessageViewHolder(ViewGroup viewgroup, int i)
    {
        return super.createMessageViewHolder(viewgroup, i);
    }

    public Bubblable getBubblable(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder, boolean flag)
    {
        mediamessageviewholder = (a)mediamessageviewholder;
        if (flag)
        {
            return ((a) (mediamessageviewholder)).mediaRemovedTextView;
        } else
        {
            return null;
        }
    }

    protected android.view.View.OnClickListener getClickListener(Message message, MediaDocument mediadocument)
    {
        return null;
    }

    protected int getLayoutId(int i)
    {
        return 0x7f030040;
    }

    protected MediaLinkProfile getMediaLinkProfile()
    {
        return MediaLinkProfile.THUMBNAIL_PROFILE;
    }

    public int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    public void onCreate(Bundle bundle)
    {
    }

    public void onDestroy()
    {
    }

    public void onPause()
    {
        if (currentlyPlayingViewHolder != null)
        {
            currentlyPlayingViewHolder.videoTextureView.a();
            mojiPlaybackStateHolder.resetCurrentlyPlaying();
        }
    }

    public void onResume()
    {
    }

    public void onStart()
    {
    }

    public void onStop()
    {
    }

    protected void setFailedUploadViewState(Message message, MediaDocument mediadocument, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
    }

    protected void setLoadingViewState(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        mediamessageviewholder = (a)mediamessageviewholder;
        hideProgressBar(mediamessageviewholder);
        ((a) (mediamessageviewholder)).symbolView.setVisibility(8);
        if (((a) (mediamessageviewholder)).indeterminateProgressIndicator.getVisibility() != 0)
        {
            updateOverlay(mediamessageviewholder, b.LOADING_PREVIEW);
            ((a) (mediamessageviewholder)).indeterminateProgressIndicator.setVisibility(0);
            updateHolderRecyclability(mediamessageviewholder, false);
        }
        ((a) (mediamessageviewholder)).videoTextureView.setVisibility(8);
        enableClickForTimestamp(((a) (mediamessageviewholder)).itemLayout, mediamessageviewholder.getLayoutPosition());
    }

    protected void setThumbnailView(Bitmap bitmap, final MediaMessageViewAdapter.MediaMessageViewHolder holder)
    {
        super.setThumbnailView(bitmap, holder);
        if (mojiPlaybackStateHolder.hasPlayed(holder.messageId))
        {
            bitmap = b.PLAYED;
        } else
        {
            bitmap = b.READY_FOR_PLAY;
        }
        holder = (a)holder;
        hideProgressBar(holder);
        hideIndeterminateProgress(holder);
        updateOverlay(holder, bitmap);
        updateSymbol(holder, bitmap);
        ((a) (holder)).videoTextureView.setVisibility(8);
        ((a) (holder)).itemLayout.setOnClickListener(new android.view.View.OnClickListener() {

            final MojiMediaMessageViewAdapter this$0;
            final a val$holder;

            public final void onClick(View view)
            {
                playMoji(holder);
            }

            
            {
                this$0 = MojiMediaMessageViewAdapter.this;
                holder = a1;
                super();
            }
        });
    }

    protected void setUnavailableViewState(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        b b1 = b.UNAVAILABLE_PREVIEW;
        mediamessageviewholder = (a)mediamessageviewholder;
        hideProgressBar(mediamessageviewholder);
        hideIndeterminateProgress(mediamessageviewholder);
        updateOverlay(mediamessageviewholder, b1);
        ((a) (mediamessageviewholder)).videoTextureView.setVisibility(8);
        ((a) (mediamessageviewholder)).thumbnail.setImageDrawable(null);
        updateSymbol(mediamessageviewholder, b1);
        enableClickForTimestamp(((a) (mediamessageviewholder)).itemLayout, mediamessageviewholder.getLayoutPosition());
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            com.skype.Message.TYPE.POSTED_FLIK_MESSAGE.toInt()
        });
    }








}
