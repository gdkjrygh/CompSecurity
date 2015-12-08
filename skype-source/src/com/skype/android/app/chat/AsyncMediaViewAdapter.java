// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v7.util.a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.CircularProgressBar;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.Bubblable;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;
import com.skype.android.widget.bubbles.BubbleTextView;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.skype.android.app.chat:
//            MediaMessageViewAdapter, MessageViewAdapterComponent, j, MessageHolder

public abstract class AsyncMediaViewAdapter extends MediaMessageViewAdapter
{
    protected class AsyncMediaViewHolder extends MediaMessageViewAdapter.MediaMessageViewHolder
    {

        SymbolView action;
        RelativeLayout actionProgressLayout;
        SymbolView centerSymbol;
        BubbleRelativeLayout mediaThumbnailLayout;
        CircularProgressBar progress;
        final AsyncMediaViewAdapter this$0;
        RelativeLayout videoFailureRetryLayout;

        void initializeViews()
        {
            mediaRemovedTextView = (BubbleTextView)ViewUtil.a(itemView, 0x7f1002b6);
            mediaThumbnailLayout = (BubbleRelativeLayout)ViewUtil.a(itemView, 0x7f100225);
            videoFailureRetryLayout = (RelativeLayout)ViewUtil.a(itemView, 0x7f10022a);
            thumbnail = (ImageView)ViewUtil.a(mediaThumbnailLayout, 0x7f100226);
            progress = (CircularProgressBar)ViewUtil.a(itemView, 0x7f100229);
            action = (SymbolView)ViewUtil.a(itemView, 0x7f100228);
            centerSymbol = (SymbolView)ViewUtil.a(mediaThumbnailLayout, 0x7f100227);
            actionProgressLayout = (RelativeLayout)ViewUtil.a(itemView, 0x7f10026e);
            Activity activity = getContext();
            progress.setProgressBackgroundColor(activity.getResources().getColor(0x7f0f013c));
            progress.setProgressColor(activity.getResources().getColor(0x7f0f0135));
            progress.setProgressWidth(activity.getResources().getDimensionPixelSize(0x7f0c00fe));
        }

        public AsyncMediaViewHolder(View view)
        {
            this$0 = AsyncMediaViewAdapter.this;
            super(AsyncMediaViewAdapter.this, view);
        }
    }

    protected static interface Callback
    {

        public abstract void onInitializeCenterSymbol(AsyncMediaViewHolder asyncmediaviewholder);
    }

    protected static interface ProgressCallback
    {

        public abstract void onMediaTransferProgressStart(AsyncMediaViewHolder asyncmediaviewholder);

        public abstract void onToggleProgressSymbol(AsyncMediaViewHolder asyncmediaviewholder, boolean flag);
    }


    private Callback callback;
    ConversationUtil conversationUtil;
    SkyLib lib;
    private Map mediaDocToHolderMap;
    NetworkUtil networkUtil;
    private ProgressCallback progressCallback;

    public AsyncMediaViewAdapter(Activity activity, MediaDocumentDownloadUtil mediadocumentdownloadutil)
    {
        super(activity, mediadocumentdownloadutil);
        getComponent().inject(this);
        mediaDocToHolderMap = new HashMap();
    }

    private void initializeCenterSymbol(AsyncMediaViewHolder asyncmediaviewholder)
    {
        if (callback != null)
        {
            callback.onInitializeCenterSymbol(asyncmediaviewholder);
        }
    }

    private void mediaTransferProgressStart(AsyncMediaViewHolder asyncmediaviewholder)
    {
        if (progressCallback != null)
        {
            progressCallback.onMediaTransferProgressStart(asyncmediaviewholder);
        }
    }

    private void toggleProgressIndication(AsyncMediaViewHolder asyncmediaviewholder, boolean flag)
    {
        if (flag && asyncmediaviewholder.progress.getVisibility() != 0)
        {
            asyncmediaviewholder.progress.setVisibility(0);
        }
        toggleProgressSymbol(asyncmediaviewholder, flag);
    }

    private void toggleProgressSymbol(AsyncMediaViewHolder asyncmediaviewholder, boolean flag)
    {
        if (progressCallback != null)
        {
            progressCallback.onToggleProgressSymbol(asyncmediaviewholder, flag);
        }
    }

    protected void alignContentView(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder, Bubblable bubblable, boolean flag, boolean flag1)
    {
        super.alignContentView(mediamessageviewholder, bubblable, flag, flag1);
        mediamessageviewholder = (android.widget.RelativeLayout.LayoutParams)((AsyncMediaViewHolder)mediamessageviewholder).mediaThumbnailLayout.getLayoutParams();
        if (flag)
        {
            mediamessageviewholder.addRule(11, -1);
            mediamessageviewholder.addRule(9, 0);
            return;
        } else
        {
            mediamessageviewholder.addRule(9, -1);
            mediamessageviewholder.addRule(11, 0);
            return;
        }
    }

    protected void bindContentViewForMedia(Message message, MediaDocument mediadocument, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        AsyncMediaViewHolder asyncmediaviewholder = (AsyncMediaViewHolder)mediamessageviewholder;
        mediaDocToHolderMap.put(Integer.valueOf(mediadocument.getObjectID()), asyncmediaviewholder);
        asyncmediaviewholder.mediaThumbnailLayout.setVisibility(0);
        asyncmediaviewholder.mediaRemovedTextView.setVisibility(8);
        asyncmediaviewholder.thumbnail.setBackgroundColor(getContext().getResources().getColor(0x7f0f0039));
        initializeCenterSymbol(asyncmediaviewholder);
        setMediaProgressOnBind(asyncmediaviewholder, mediadocument, message);
        super.bindContentViewForMedia(message, mediadocument, mediamessageviewholder);
    }

    protected void bindContentViewForRemovedMedia(j j, MessageHolder messageholder, boolean flag)
    {
        ((AsyncMediaViewHolder)j).mediaThumbnailLayout.setVisibility(8);
        super.bindContentViewForRemovedMedia(j, messageholder, flag);
    }

    public volatile void bindViewHolder(j j, MessageHolder messageholder, a a)
    {
        super.bindViewHolder(j, messageholder, a);
    }

    protected j createMessageViewHolder(View view)
    {
        return new AsyncMediaViewHolder(view);
    }

    public volatile j createMessageViewHolder(ViewGroup viewgroup, int i)
    {
        return super.createMessageViewHolder(viewgroup, i);
    }

    protected Bubblable getBubblable(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder, boolean flag)
    {
        return ((AsyncMediaViewHolder)mediamessageviewholder).mediaThumbnailLayout;
    }

    protected android.view.View.OnClickListener getClickListener(final Message message, final MediaDocument mediaDocument)
    {
        return new android.view.View.OnClickListener() {

            final AsyncMediaViewAdapter this$0;
            final MediaDocument val$mediaDocument;
            final Message val$message;

            public final void onClick(View view)
            {
                onMediaItemClick(mediaDocument, message);
            }

            
            {
                this$0 = AsyncMediaViewAdapter.this;
                mediaDocument = mediadocument;
                message = message1;
                super();
            }
        };
    }

    protected AsyncMediaViewHolder getHolderForMediaDocument(MediaDocument mediadocument)
    {
        return (AsyncMediaViewHolder)mediaDocToHolderMap.get(Integer.valueOf(mediadocument.getObjectID()));
    }

    protected int getLayoutId(int i)
    {
        return 0x7f030023;
    }

    protected abstract void onMediaItemClick(MediaDocument mediadocument, Message message);

    protected abstract void openMediaDocumentAfterDownload(MediaDocument mediadocument, boolean flag);

    public void setCallback(Callback callback1)
    {
        callback = callback1;
    }

    protected void setFailedUploadViewState(Message message, MediaDocument mediadocument, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
    }

    protected void setLoadingViewState(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
    }

    protected abstract void setMediaProgressOnBind(AsyncMediaViewHolder asyncmediaviewholder, MediaDocument mediadocument, Message message);

    public void setProgressCallback(ProgressCallback progresscallback)
    {
        progressCallback = progresscallback;
    }

    protected void setProgressForMedia(MediaDocument mediadocument, int i, int j)
    {
        AsyncMediaViewHolder asyncmediaviewholder = getHolderForMediaDocument(mediadocument);
        if (asyncmediaviewholder != null)
        {
            updateHolderRecyclability(asyncmediaviewholder, false);
            mediaTransferProgressStart(asyncmediaviewholder);
            toggleProgressIndication(asyncmediaviewholder, true);
            asyncmediaviewholder.progress.setMax(j);
            asyncmediaviewholder.progress.setProgress(i);
            if (i == j)
            {
                updateHolderRecyclability(asyncmediaviewholder, true);
                toggleProgressIndication(asyncmediaviewholder, false);
                openMediaDocumentAfterDownload(mediadocument, asyncmediaviewholder.isOutgoing());
            }
        }
    }

    protected void setThumbnailBitmap(Bitmap bitmap, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        ((AsyncMediaViewHolder)mediamessageviewholder).centerSymbol.setVisibility(8);
        super.setThumbnailBitmap(bitmap, mediamessageviewholder);
    }

    protected void setThumbnailView(Bitmap bitmap, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        ((AsyncMediaViewHolder)mediamessageviewholder).centerSymbol.setVisibility(8);
        super.setThumbnailView(bitmap, mediamessageviewholder);
    }

    protected void setUnavailableViewState(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
    }
}
