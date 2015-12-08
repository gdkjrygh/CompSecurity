// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.skype.MediaDocument;
import com.skype.MediaDocumentImpl;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.bubbles.Bubblable;
import com.skype.android.widget.bubbles.BubbleTextView;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.chat:
//            e, MessageViewAdapterComponent, MessageHolder, j, 
//            f

abstract class MediaMessageViewAdapter extends e
{
    protected abstract class MediaMessageViewHolder extends f
    {

        Future bitmapFuture;
        BubbleTextView mediaRemovedTextView;
        int messageId;
        final MediaMessageViewAdapter this$0;
        ImageView thumbnail;

        abstract void initializeViews();

        public MediaMessageViewHolder(View view)
        {
            this$0 = MediaMessageViewAdapter.this;
            super(view);
            initializeViews();
            if (thumbnail == null)
            {
                throw new RuntimeException("Using this adapter probably means there is a thumbnail to display. No view for the thumbnail was provided.");
            } else
            {
                return;
            }
        }
    }


    AccessibilityUtil accessibility;
    private AsyncCallback cachedThumbnailCallback;
    ConversationUtil conversationUtil;
    ImageCache imageCache;
    private AsyncCallback imageCallback;
    SkyLib lib;
    ObjectIdMap map;
    private MediaDocumentDownloadUtil mediaDocumentDownloadUtil;
    MediaDocumentUploadUtil mediaDocumentUploadUtil;
    TimeAnomalyTelemetry timeAnomalyTelemetry;
    TimeUtil timeUtil;

    public MediaMessageViewAdapter(Activity activity, MediaDocumentDownloadUtil mediadocumentdownloadutil)
    {
        super(activity);
        imageCallback = new AsyncCallback() {

            final MediaMessageViewAdapter this$0;

            public final void done(AsyncResult asyncresult)
            {
                MediaMessageViewHolder mediamessageviewholder;
                Object obj;
label0:
                {
                    if (asyncresult.e())
                    {
                        mediamessageviewholder = (MediaMessageViewHolder)asyncresult.b();
                        obj = (com.skype.android.app.media.MediaDocumentDownloadUtil.GetMediaLinkResult)asyncresult.a();
                        asyncresult = (Bitmap)((com.skype.android.app.media.MediaDocumentDownloadUtil.GetMediaLinkResult) (obj)).getMedia();
                        obj = ((com.skype.android.app.media.MediaDocumentDownloadUtil.GetMediaLinkResult) (obj)).getStatus();
                        if (asyncresult == null)
                        {
                            break label0;
                        }
                        setThumbnailView(asyncresult, mediamessageviewholder);
                    }
                    return;
                }
                updateThumbnail(((com.skype.MediaDocument.MEDIA_STATUS) (obj)), mediamessageviewholder);
            }

            
            {
                this$0 = MediaMessageViewAdapter.this;
                super();
            }
        };
        cachedThumbnailCallback = new AsyncCallback() {

            final MediaMessageViewAdapter this$0;

            public final void done(AsyncResult asyncresult)
            {
                if (asyncresult.e())
                {
                    MediaMessageViewHolder mediamessageviewholder = (MediaMessageViewHolder)asyncresult.b();
                    asyncresult = (Bitmap)asyncresult.a();
                    if (asyncresult != null)
                    {
                        setThumbnailBitmap(asyncresult, mediamessageviewholder);
                    }
                }
            }

            
            {
                this$0 = MediaMessageViewAdapter.this;
                super();
            }
        };
        getComponent().inject(this);
        mediaDocumentDownloadUtil = mediadocumentdownloadutil;
    }

    private MediaDocument getMediaDocument(Message message)
    {
        MediaDocumentImpl mediadocumentimpl;
label0:
        {
            mediadocumentimpl = new MediaDocumentImpl();
            Object obj = mediadocumentimpl;
            if (message.getMediaDocument(mediadocumentimpl))
            {
                obj = (MediaDocument)map.a(mediadocumentimpl.getObjectID());
                if (obj == null)
                {
                    break label0;
                }
            }
            return ((MediaDocument) (obj));
        }
        map.b(mediadocumentimpl);
        map.a(mediadocumentimpl);
        return mediadocumentimpl;
    }

    private boolean isRemovedMediaMessage(MessageHolder messageholder)
    {
        return TextUtils.isEmpty(messageholder.getTextContent()) && ((Message)messageholder.getMessageObject()).getEditTimestampProp() > 0;
    }

    private void updateThumbnail(com.skype.MediaDocument.MEDIA_STATUS media_status, MediaMessageViewHolder mediamessageviewholder)
    {
        static final class _cls4
        {

            static final int $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[];
            static final int $SwitchMap$com$skype$MediaDocument$STATUS[];
            static final int $SwitchMap$com$skype$MediaDocument$UPLOAD_STATUS[];

            static 
            {
                $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS = new int[com.skype.MediaDocument.MEDIA_STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_NOT_AVAILABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_BAD_CONTENT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                $SwitchMap$com$skype$MediaDocument$STATUS = new int[com.skype.MediaDocument.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.MediaDocument.STATUS.ACCESS_DENIED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.MediaDocument.STATUS.NOT_AVAILABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.MediaDocument.STATUS.NOT_CREATED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.MediaDocument.STATUS.DELETED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.MediaDocument.STATUS.EXPIRED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.MediaDocument.STATUS.AVAILABLE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                $SwitchMap$com$skype$MediaDocument$UPLOAD_STATUS = new int[com.skype.MediaDocument.UPLOAD_STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$MediaDocument$UPLOAD_STATUS[com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_FAILED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$UPLOAD_STATUS[com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_IN_PROGRESS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$UPLOAD_STATUS[com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_QUEUED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$UPLOAD_STATUS[com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_COMPLETED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4..SwitchMap.com.skype.MediaDocument.MEDIA_STATUS[media_status.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setLoadingViewState(mediamessageviewholder);
            return;

        case 2: // '\002'
        case 3: // '\003'
            setUnavailableViewState(mediamessageviewholder);
            break;
        }
    }

    private void updateThumbnail(MediaDocument mediadocument, MediaMessageViewHolder mediamessageviewholder)
    {
        com.skype.MediaDocument.STATUS status = mediadocument.getStatusProp();
        switch (_cls4..SwitchMap.com.skype.MediaDocument.STATUS[status.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            setUnavailableViewState(mediamessageviewholder);
            return;

        case 6: // '\006'
            loadThumbnail(mediadocument, mediamessageviewholder);
            break;
        }
    }

    private void updateThumbnailForOutgoingMessage(Message message, MediaDocument mediadocument, MediaMessageViewHolder mediamessageviewholder)
    {
        Bitmap bitmap;
        Object obj;
        obj = mediadocument.getUploadStatus(lib.getDefaultContentId(mediadocument.getDocTypeProp()).m_contentId);
        bitmap = imageCache.a(String.valueOf(mediadocument.getObjectID()).concat(getMediaLinkProfile().toString()));
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        setThumbnailBitmap(bitmap, mediamessageviewholder);
_L10:
        _cls4..SwitchMap.com.skype.MediaDocument.UPLOAD_STATUS[((com.skype.MediaDocument.UPLOAD_STATUS) (obj)).ordinal()];
        JVM INSTR tableswitch 1 4: default 104
    //                   1 141
    //                   2 149
    //                   3 155
    //                   4 181;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        if (bitmap == null)
        {
            updateThumbnail(mediadocument, mediamessageviewholder);
            return;
        } else
        {
            setThumbnailView(bitmap, mediamessageviewholder);
            return;
        }
_L2:
        if (obj != com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_NOT_STARTED)
        {
            mediaDocumentUploadUtil.getThumbnailForCachedMediaAsync(mediadocument, mediamessageviewholder, cachedThumbnailCallback);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        setFailedUploadViewState(message, mediadocument, mediamessageviewholder);
        return;
_L5:
        setLoadingViewState(mediamessageviewholder);
        return;
_L6:
        if (mediadocument.getStatusProp() == com.skype.MediaDocument.STATUS.FAILED)
        {
            setFailedUploadViewState(message, mediadocument, mediamessageviewholder);
            return;
        } else
        {
            setLoadingViewState(mediamessageviewholder);
            return;
        }
_L7:
        obj = message.getSendingStatusProp();
        if (obj == com.skype.Message.SENDING_STATUS.SENDING)
        {
            setLoadingViewState(mediamessageviewholder);
            return;
        }
        if (obj != com.skype.Message.SENDING_STATUS.FAILED_TO_SEND) goto _L3; else goto _L8
_L8:
        setFailedUploadViewState(message, mediadocument, mediamessageviewholder);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected void alignContentView(MediaMessageViewHolder mediamessageviewholder, Bubblable bubblable, boolean flag, boolean flag1)
    {
        alignContentView(mediamessageviewholder, flag);
        if (flag)
        {
            mediamessageviewholder = com.skype.android.widget.bubbles.Bubblable.Direction.b;
        } else
        {
            mediamessageviewholder = com.skype.android.widget.bubbles.Bubblable.Direction.a;
        }
        bubblable.setDirectionState(mediamessageviewholder, flag1);
    }

    protected void alignContentView(MediaMessageViewHolder mediamessageviewholder, boolean flag)
    {
        mediamessageviewholder = (RelativeLayout)mediamessageviewholder.getInlineContent();
        byte byte0;
        if (flag)
        {
            byte0 = 5;
        } else
        {
            byte0 = 3;
        }
        mediamessageviewholder.setGravity(byte0);
    }

    protected void bindContentView(j j1, MessageHolder messageholder)
    {
        MediaMessageViewHolder mediamessageviewholder = (MediaMessageViewHolder)j1;
        Message message = (Message)messageholder.getMessageObject();
        boolean flag = j1.isOutgoing();
        mediamessageviewholder.messageId = message.getObjectID();
        boolean flag1 = accessibility.a();
        ViewGroup viewgroup = mediamessageviewholder.getInlineContent();
        setThumbnailBitmap(null, mediamessageviewholder);
        if (mediamessageviewholder.bitmapFuture != null)
        {
            mediamessageviewholder.bitmapFuture.cancel(true);
        }
        boolean flag2 = isRemovedMediaMessage(messageholder);
        if (flag2)
        {
            bindContentViewForRemovedMedia(j1, messageholder, flag1);
        } else
        {
            j1 = getMediaDocument(message);
            viewgroup.setPadding(0, 0, 0, 0);
            if (getClickListener(message, j1) != null)
            {
                enableClickOnThumbnail(message, j1, mediamessageviewholder, flag1);
            }
            bindContentViewForMedia(message, j1, mediamessageviewholder);
        }
        j1 = getBubblable(mediamessageviewholder, flag2);
        if (j1 != null)
        {
            alignContentView(mediamessageviewholder, j1, flag, mediamessageviewholder.isChained());
            return;
        } else
        {
            alignContentView(mediamessageviewholder, flag);
            return;
        }
    }

    protected void bindContentViewForMedia(Message message, MediaDocument mediadocument, MediaMessageViewHolder mediamessageviewholder)
    {
        updateThumbnail(message, mediadocument, mediamessageviewholder);
    }

    protected void bindContentViewForRemovedMedia(j j1, MessageHolder messageholder, boolean flag)
    {
        MediaMessageViewHolder mediamessageviewholder = (MediaMessageViewHolder)j1;
        showRemovedMedia(mediamessageviewholder);
        Object obj;
        if (flag)
        {
            obj = j1.itemView;
        } else
        {
            obj = mediamessageviewholder.mediaRemovedTextView;
        }
        setOnItemLongClickListener((Message)messageholder.getMessageObject(), ((View) (obj)), j1.getLayoutPosition());
        if (!flag)
        {
            enableClickForTimestamp(mediamessageviewholder.mediaRemovedTextView, j1.getLayoutPosition());
        }
    }

    protected void enableClickOnThumbnail(Message message, MediaDocument mediadocument, MediaMessageViewHolder mediamessageviewholder, boolean flag)
    {
        ViewGroup viewgroup = mediamessageviewholder.getInlineContent();
        if (flag)
        {
            AccessibilityUtil.a(new View[] {
                mediamessageviewholder.getInlineContent(), (View)mediamessageviewholder.thumbnail.getParent(), mediamessageviewholder.thumbnail
            });
            ViewUtil.a(new View[] {
                mediamessageviewholder.getInlineContent(), (View)mediamessageviewholder.thumbnail.getParent(), mediamessageviewholder.thumbnail
            });
            setNavigationListener(mediamessageviewholder.itemView, message, mediadocument);
            setOnItemLongClickListener(message, mediamessageviewholder.itemView, mediamessageviewholder.getLayoutPosition());
            return;
        } else
        {
            viewgroup.setClickable(false);
            viewgroup.setLongClickable(false);
            setNavigationListener(mediamessageviewholder.thumbnail, message, mediadocument);
            setOnItemLongClickListener(message, mediamessageviewholder.thumbnail, mediamessageviewholder.getLayoutPosition());
            return;
        }
    }

    protected abstract Bubblable getBubblable(MediaMessageViewHolder mediamessageviewholder, boolean flag);

    protected abstract android.view.View.OnClickListener getClickListener(Message message, MediaDocument mediadocument);

    protected CharSequence getDefaultContentDescription(j j1, MessageHolder messageholder)
    {
        if (isRemovedMediaMessage(messageholder))
        {
            return super.getDefaultContentDescription(j1, messageholder);
        } else
        {
            return j1.itemView.getContentDescription();
        }
    }

    protected MediaDocument getMediaDocument(int i)
    {
        return getMediaDocument((Message)map.a(i, com/skype/Message));
    }

    protected abstract MediaLinkProfile getMediaLinkProfile();

    protected long getTimestamp(MessageHolder messageholder)
    {
        if (isRemovedMediaMessage(messageholder))
        {
            return messageholder.getTimestamp();
        } else
        {
            return super.getTimestamp(messageholder);
        }
    }

    protected boolean isFileDownloaded(MediaDocument mediadocument)
    {
        return mediaDocumentDownloadUtil.isMediaLoadedInCache(mediadocument, MediaLinkProfile.ORIGINAL);
    }

    protected boolean isLoaded(MediaDocument mediadocument)
    {
        return mediaDocumentDownloadUtil.isMediaLoadedInCache(mediadocument, getMediaLinkProfile()) || mediaDocumentUploadUtil.isUploaded(mediadocument);
    }

    protected boolean isMediaUpLoaded(Message message)
    {
        return message.getSendingStatusProp() == com.skype.Message.SENDING_STATUS.SENT;
    }

    protected boolean isVideoDownLoaded(MediaDocument mediadocument)
    {
        return mediaDocumentDownloadUtil.isVideoMediaLoadedInCache(mediadocument, MediaLinkProfile.VIDEO_PROFILE);
    }

    protected void loadThumbnail(MediaDocument mediadocument, MediaMessageViewHolder mediamessageviewholder)
    {
        mediamessageviewholder.bitmapFuture = mediaDocumentDownloadUtil.getMediaByProfileAsync(getMediaLinkProfile(), mediadocument, mediamessageviewholder, imageCallback);
    }

    protected void setDefaultViewClickListener(j j1, MessageHolder messageholder)
    {
        if (accessibility.a() && !isRemovedMediaMessage(messageholder))
        {
            return;
        } else
        {
            super.setDefaultViewClickListener(j1, messageholder);
            return;
        }
    }

    protected abstract void setFailedUploadViewState(Message message, MediaDocument mediadocument, MediaMessageViewHolder mediamessageviewholder);

    protected abstract void setLoadingViewState(MediaMessageViewHolder mediamessageviewholder);

    protected void setNavigationListener(View view, Message message, MediaDocument mediadocument)
    {
        view.setOnClickListener(getClickListener(message, mediadocument));
    }

    protected void setOnItemLongClickListener(Message message, View view, int i)
    {
        if (accessibility.a())
        {
            if (TextUtils.isEmpty(message.getBodyXmlProp()) && message.getEditTimestampProp() > 0)
            {
                view.setOnLongClickListener(new android.view.View.OnLongClickListener() {

                    final MediaMessageViewAdapter this$0;

                    public final boolean onLongClick(View view1)
                    {
                        return true;
                    }

            
            {
                this$0 = MediaMessageViewAdapter.this;
                super();
            }
                });
                return;
            } else
            {
                super.setOnItemLongClickListener(message, view, i, false, false);
                return;
            }
        } else
        {
            super.setOnItemLongClickListener(message, view, i);
            return;
        }
    }

    protected void setThumbnailBitmap(Bitmap bitmap, MediaMessageViewHolder mediamessageviewholder)
    {
        mediamessageviewholder.thumbnail.setImageBitmap(bitmap);
    }

    protected void setThumbnailView(Bitmap bitmap, MediaMessageViewHolder mediamessageviewholder)
    {
        setThumbnailBitmap(bitmap, mediamessageviewholder);
    }

    protected abstract void setUnavailableViewState(MediaMessageViewHolder mediamessageviewholder);

    protected void showRemovedMedia(MediaMessageViewHolder mediamessageviewholder)
    {
        mediamessageviewholder.mediaRemovedTextView.setVisibility(0);
        mediamessageviewholder.mediaRemovedTextView.setText(conversationUtil.a());
        if (mediamessageviewholder.isOutgoing())
        {
            mediamessageviewholder.getInlineContent().setPadding(getContext().getResources().getDimensionPixelSize(0x7f0c0246), 0, 0, 0);
        } else
        {
            mediamessageviewholder.getInlineContent().setPadding(0, 0, getContext().getResources().getDimensionPixelSize(0x7f0c0246), 0);
        }
        mediamessageviewholder.getInlineContent().setContentDescription(ViewUtil.b(mediamessageviewholder.mediaRemovedTextView));
    }

    protected void updateHolderRecyclability(MediaMessageViewHolder mediamessageviewholder, boolean flag)
    {
        if (flag && !mediamessageviewholder.isRecyclable())
        {
            mediamessageviewholder.setIsRecyclable(true);
        } else
        if (!flag && mediamessageviewholder.isRecyclable())
        {
            mediamessageviewholder.setIsRecyclable(false);
            return;
        }
    }

    protected void updateThumbnail(Message message, MediaDocument mediadocument, MediaMessageViewHolder mediamessageviewholder)
    {
        if (mediamessageviewholder.isOutgoing())
        {
            updateThumbnailForOutgoingMessage(message, mediadocument, mediamessageviewholder);
            return;
        } else
        {
            updateThumbnail(mediadocument, mediamessageviewholder);
            return;
        }
    }

}
