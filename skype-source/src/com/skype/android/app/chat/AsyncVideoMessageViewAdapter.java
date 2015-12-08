// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.ConversationImpl;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.KpiAttributeName;
import com.skype.android.analytics.KpiAttributeValue;
import com.skype.android.analytics.KpiEvent;
import com.skype.android.analytics.MessageTelemetryEvent;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.app.media.XmmUtil;
import com.skype.android.app.vim.VideoMessagePlayerActivity;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.NetworkUtil;
import com.skype.android.widget.CircularProgressBar;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;

// Referenced classes of package com.skype.android.app.chat:
//            AsyncMediaViewAdapter

public class AsyncVideoMessageViewAdapter extends AsyncMediaViewAdapter
    implements AsyncMediaViewAdapter.Callback, AsyncMediaViewAdapter.ProgressCallback
{

    private static final int supportedMessageTypes[];
    private MediaDocument mediaDocumentToPlayAfterDownload;

    public AsyncVideoMessageViewAdapter(Activity activity, MediaDocumentDownloadUtil mediadocumentdownloadutil)
    {
        super(activity, mediadocumentdownloadutil);
        setCallback(this);
        setProgressCallback(this);
    }

    private boolean isMediaDocumentAvailable(MediaDocument mediadocument)
    {
        mediadocument = mediadocument.getStatusProp();
        static final class _cls3
        {

            static final int $SwitchMap$com$skype$MediaDocument$STATUS[];

            static 
            {
                $SwitchMap$com$skype$MediaDocument$STATUS = new int[com.skype.MediaDocument.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.MediaDocument.STATUS.ACCESS_DENIED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.MediaDocument.STATUS.NOT_AVAILABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.MediaDocument.STATUS.DELETED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.MediaDocument.STATUS.EXPIRED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.skype.MediaDocument.STATUS[mediadocument.ordinal()])
        {
        default:
            return true;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return false;
        }
    }

    private boolean isVideoMessageUploading(MediaDocument mediadocument)
    {
        mediadocument = XmmUtil.getMediaDocumentUploadStatus(lib, mediadocument);
        return mediadocument == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_QUEUED || mediadocument == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_IN_PROGRESS || mediadocument == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_NOT_STARTED;
    }

    private void playVideoMessage(MediaDocument mediadocument, boolean flag)
    {
        com.skype.MediaDocument.GetMediaLink_Result getmedialink_result1;
label0:
        {
            com.skype.MediaDocument.GetMediaLink_Result getmedialink_result = null;
            if (flag)
            {
                getmedialink_result = mediadocument.getMediaLink((new StringBuilder("?")).append(MediaLinkProfile.VIDEO_PROFILE.toString()).toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_ONLY);
            }
            if (flag)
            {
                getmedialink_result1 = getmedialink_result;
                if (!TextUtils.isEmpty(getmedialink_result.m_path))
                {
                    break label0;
                }
            }
            getmedialink_result1 = mediadocument.getMediaLink(MediaLinkProfile.VIDEO_PROFILE.toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_THEN_DOWNLOAD);
        }
        if (!TextUtils.isEmpty(getmedialink_result1.m_path))
        {
            sendVideoMessageViewedTelemetryEvent(mediadocument);
            mediadocument = new Intent(getContext(), com/skype/android/app/vim/VideoMessagePlayerActivity);
            mediadocument.putExtra("extra_video_message_ path", getmedialink_result1.m_path);
            getContext().startActivity(mediadocument);
            return;
        } else
        {
            AsyncMediaViewAdapter.AsyncMediaViewHolder asyncmediaviewholder = getHolderForMediaDocument(mediadocument);
            asyncmediaviewholder.progress.setVisibility(4);
            asyncmediaviewholder.action.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.dr);
            mediaDocumentToPlayAfterDownload = mediadocument;
            setVideoMessageFailedView(XmmUtil.getMessageForMediaDocument(map, mediadocument), mediadocument, asyncmediaviewholder);
            return;
        }
    }

    private void retryVideoMessageTransfer(Message message, MediaDocument mediadocument, boolean flag)
    {
label0:
        {
            if (mediadocument != null && message != null)
            {
                if (!flag)
                {
                    break label0;
                }
                mediaDocumentUploadUtil.retryMediaDocumentUploadAsync(message.getObjectID(), mediadocument);
            }
            return;
        }
        mediadocument.sync();
    }

    private void sendVideoMessageViewedTelemetryEvent(MediaDocument mediadocument)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        lib.getConversationByConvoID(mediadocument.getConvoIdProp(), conversationimpl);
        mediadocument = new MessageTelemetryEvent(KpiEvent.c, conversationimpl, KpiAttributeValue.i);
        mediadocument.put(KpiAttributeName.h, KpiAttributeValue.a);
        analytics.a(mediadocument);
    }

    private void setVideoMessageFailedView(final Message message, final MediaDocument mediaDocument, final AsyncMediaViewAdapter.AsyncMediaViewHolder asyncMediaViewHolder)
    {
        updateHolderRecyclability(asyncMediaViewHolder, false);
        asyncMediaViewHolder.videoFailureRetryLayout.setVisibility(0);
        asyncMediaViewHolder.action.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.dr);
        asyncMediaViewHolder.progress.setVisibility(4);
        TextView textview = (TextView)asyncMediaViewHolder.videoFailureRetryLayout.findViewById(0x7f10022b);
        Object obj = (TextView)asyncMediaViewHolder.videoFailureRetryLayout.findViewById(0x7f10022c);
        ((TextView) (obj)).setText(getContext().getString(0x7f080177));
        ((TextView) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final AsyncVideoMessageViewAdapter this$0;
            final AsyncMediaViewAdapter.AsyncMediaViewHolder val$asyncMediaViewHolder;
            final MediaDocument val$mediaDocument;
            final Message val$message;

            public final void onClick(View view)
            {
                retryVideoMessageTransfer(message, mediaDocument, asyncMediaViewHolder.isOutgoing());
            }

            
            {
                this$0 = AsyncVideoMessageViewAdapter.this;
                message = message1;
                mediaDocument = mediadocument;
                asyncMediaViewHolder = asyncmediaviewholder;
                super();
            }
        });
        obj = (android.widget.RelativeLayout.LayoutParams)asyncMediaViewHolder.videoFailureRetryLayout.getLayoutParams();
        if (asyncMediaViewHolder.isOutgoing())
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(0, asyncMediaViewHolder.mediaThumbnailLayout.getId());
            asyncMediaViewHolder.videoFailureRetryLayout.setPadding(0, (int)getContext().getResources().getDimension(0x7f0c0237), (int)getContext().getResources().getDimension(0x7f0c0237), 0);
            if (!networkUtil.a())
            {
                if (isMediaUpLoaded(message))
                {
                    message = getContext().getString(0x7f08039f);
                } else
                {
                    message = getContext().getString(0x7f080417);
                }
                textview.setText(message);
                return;
            }
            message = getContext();
            int i;
            if (isVideoMessageUploading(mediaDocument))
            {
                i = 0x7f0803cc;
            } else
            {
                i = 0x7f080418;
            }
            message = message.getString(i);
        } else
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(1, asyncMediaViewHolder.mediaThumbnailLayout.getId());
            asyncMediaViewHolder.videoFailureRetryLayout.setPadding((int)getContext().getResources().getDimension(0x7f0c0237), (int)getContext().getResources().getDimension(0x7f0c0237), 0, 0);
            if (networkUtil.a())
            {
                message = getContext().getString(0x7f080415);
            } else
            {
                message = getContext().getString(0x7f080416);
            }
        }
        textview.setText(message);
    }

    protected void bindContentViewForMedia(Message message, MediaDocument mediadocument, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        super.bindContentViewForMedia(message, mediadocument, mediamessageviewholder);
    }

    protected MediaLinkProfile getMediaLinkProfile()
    {
        return MediaLinkProfile.THUMBNAIL_PROFILE;
    }

    public int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    public void onInitializeCenterSymbol(AsyncMediaViewAdapter.AsyncMediaViewHolder asyncmediaviewholder)
    {
        asyncmediaviewholder.centerSymbol.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.aP);
        asyncmediaviewholder.centerSymbol.setVisibility(0);
    }

    protected void onMediaItemClick(MediaDocument mediadocument, Message message)
    {
        if (isMediaDocumentAvailable(mediadocument))
        {
            playVideoMessage(mediadocument, isMediaUpLoaded(message));
        }
    }

    public void onMediaTransferProgressStart(AsyncMediaViewAdapter.AsyncMediaViewHolder asyncmediaviewholder)
    {
        asyncmediaviewholder.videoFailureRetryLayout.setVisibility(8);
    }

    public void onToggleProgressSymbol(AsyncMediaViewAdapter.AsyncMediaViewHolder asyncmediaviewholder, boolean flag)
    {
        SymbolView symbolview = asyncmediaviewholder.action;
        if (flag)
        {
            asyncmediaviewholder = com.skype.android.widget.SymbolElement.SymbolCode.aP;
        } else
        {
            asyncmediaviewholder = com.skype.android.widget.SymbolElement.SymbolCode.bV;
        }
        symbolview.setSymbolCode(asyncmediaviewholder);
    }

    protected void openMediaDocumentAfterDownload(MediaDocument mediadocument, boolean flag)
    {
        if (mediadocument.equals(mediaDocumentToPlayAfterDownload))
        {
            playVideoMessage(mediadocument, flag);
        }
    }

    protected void setFailedUploadViewState(Message message, MediaDocument mediadocument, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        setVideoMessageFailedView(message, mediadocument, (AsyncMediaViewAdapter.AsyncMediaViewHolder)mediamessageviewholder);
    }

    protected void setMediaProgressOnBind(AsyncMediaViewAdapter.AsyncMediaViewHolder asyncmediaviewholder, MediaDocument mediadocument, Message message)
    {
        byte byte0;
        boolean flag;
        if (asyncmediaviewholder.isOutgoing())
        {
            flag = isMediaUpLoaded(message);
        } else
        {
            flag = isVideoDownLoaded(mediadocument);
        }
        mediadocument = asyncmediaviewholder.progress;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        mediadocument.setVisibility(byte0);
        asyncmediaviewholder.action.setVisibility(0);
        mediadocument = asyncmediaviewholder.action;
        if (flag)
        {
            asyncmediaviewholder = com.skype.android.widget.SymbolElement.SymbolCode.bV;
        } else
        {
            asyncmediaviewholder = com.skype.android.widget.SymbolElement.SymbolCode.aP;
        }
        mediadocument.setSymbolCode(asyncmediaviewholder);
    }

    protected void setThumbnailView(Bitmap bitmap, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        updateHolderRecyclability((AsyncMediaViewAdapter.AsyncMediaViewHolder)mediamessageviewholder, true);
        super.setThumbnailView(bitmap, mediamessageviewholder);
    }

    protected void setUnavailableViewState(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        mediamessageviewholder = (AsyncMediaViewAdapter.AsyncMediaViewHolder)mediamessageviewholder;
        updateHolderRecyclability(mediamessageviewholder, false);
        ((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).action.setVisibility(4);
        ((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).thumbnail.setImageDrawable(null);
        ((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).thumbnail.setBackgroundColor(getContext().getResources().getColor(0x7f0f003b));
        ((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).progress.setVisibility(4);
        ((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).centerSymbol.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.aY);
        ((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).videoFailureRetryLayout.setVisibility(0);
        ((TextView)((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).videoFailureRetryLayout.findViewById(0x7f10022b)).setText(getContext().getString(0x7f0804e2));
        Object obj = (TextView)((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).videoFailureRetryLayout.findViewById(0x7f10022c);
        ((TextView) (obj)).setText(getContext().getString(0x7f080350));
        ((TextView) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final AsyncVideoMessageViewAdapter this$0;

            public final void onClick(View view)
            {
                view = getContext().getResources().getQuantityString(0x7f0b0016, ecsConfiguration.getAsyncVideoExpirationPeriod(), new Object[] {
                    Integer.valueOf(ecsConfiguration.getAsyncVideoExpirationPeriod())
                });
                view = getContext().getString(0x7f0801b7, new Object[] {
                    view
                });
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getContext());
                builder.setMessage(view);
                builder.setNegativeButton(0x7f0802f6, null);
                builder.create().show();
            }

            
            {
                this$0 = AsyncVideoMessageViewAdapter.this;
                super();
            }
        });
        obj = (android.widget.RelativeLayout.LayoutParams)((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).videoFailureRetryLayout.getLayoutParams();
        if (mediamessageviewholder.isOutgoing())
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(0, ((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).mediaThumbnailLayout.getId());
            ((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).videoFailureRetryLayout.setPadding(0, (int)getContext().getResources().getDimension(0x7f0c0237), (int)getContext().getResources().getDimension(0x7f0c0237), 0);
            return;
        } else
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(1, ((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).mediaThumbnailLayout.getId());
            ((AsyncMediaViewAdapter.AsyncMediaViewHolder) (mediamessageviewholder)).videoFailureRetryLayout.setPadding((int)getContext().getResources().getDimension(0x7f0c0237), (int)getContext().getResources().getDimension(0x7f0c0237), 0, 0);
            return;
        }
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            com.skype.Message.TYPE.POSTED_VIDEO.toInt()
        });
    }

}
