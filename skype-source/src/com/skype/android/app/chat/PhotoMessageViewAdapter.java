// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.LevelListDrawable;
import android.support.v7.util.a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.app.Navigation;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.ProgressCircleView;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.Bubblable;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;
import com.skype.android.widget.bubbles.BubbleTextView;

// Referenced classes of package com.skype.android.app.chat:
//            MediaMessageViewAdapter, MediaUploadRetryDialogFragment, ChatActivity, RetryDialogCallback, 
//            j, MessageHolder

public class PhotoMessageViewAdapter extends MediaMessageViewAdapter
{
    private final class a extends MediaMessageViewAdapter.MediaMessageViewHolder
    {

        SymbolView failureIcon;
        View overlay;
        SymbolView placeholder;
        ProgressCircleView progressIndicator;
        SymbolView retryButton;
        final PhotoMessageViewAdapter this$0;
        BubbleRelativeLayout thumbnailLayout;

        final void initializeViews()
        {
            thumbnailLayout = (BubbleRelativeLayout)ViewUtil.a(itemView, 0x7f1002b2);
            mediaRemovedTextView = (BubbleTextView)ViewUtil.a(itemView, 0x7f1002b6);
            thumbnail = (ImageView)ViewUtil.a(thumbnailLayout, 0x7f1002b3);
            retryButton = (SymbolView)ViewUtil.a(thumbnailLayout, 0x7f10022c);
            progressIndicator = (ProgressCircleView)ViewUtil.a(thumbnailLayout, 0x7f1002a4);
            overlay = ViewUtil.a(thumbnailLayout, 0x7f1002a3);
            failureIcon = (SymbolView)ViewUtil.a(thumbnailLayout, 0x7f1002b4);
            placeholder = (SymbolView)ViewUtil.a(thumbnailLayout, 0x7f1002b5);
        }

        public a(View view)
        {
            this$0 = PhotoMessageViewAdapter.this;
            super(PhotoMessageViewAdapter.this, view);
        }
    }

    private static final class b extends Enum
    {

        private static final b $VALUES[];
        public static final b DEFAULT;
        public static final b FAILED;
        public static final b LOADING;
        public static final b UNAVAILABLE;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/skype/android/app/chat/PhotoMessageViewAdapter$b, s);
        }

        public static b[] values()
        {
            return (b[])$VALUES.clone();
        }

        static 
        {
            LOADING = new b("LOADING", 0);
            UNAVAILABLE = new b("UNAVAILABLE", 1);
            FAILED = new b("FAILED", 2);
            DEFAULT = new b("DEFAULT", 3);
            $VALUES = (new b[] {
                LOADING, UNAVAILABLE, FAILED, DEFAULT
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int supportedMessageTypes[];
    private RetryDialogCallback retryDialogCallback;

    public PhotoMessageViewAdapter(Activity activity, MediaDocumentDownloadUtil mediadocumentdownloadutil)
    {
        super(activity, mediadocumentdownloadutil);
        retryDialogCallback = new RetryDialogCallback() {

            final PhotoMessageViewAdapter this$0;

            public final void onRetryButtonClick(int i, int j)
            {
                retryFailedUpload(i, j);
            }

            
            {
                this$0 = PhotoMessageViewAdapter.this;
                super();
            }
        };
    }

    private void hideProgressIndicator(a a1)
    {
        a1.progressIndicator.setVisibility(8);
        if (!a1.isRecyclable())
        {
            a1.setIsRecyclable(true);
        }
    }

    private void retryFailedUpload(int i, int j)
    {
        MediaDocument mediadocument = (MediaDocument)map.a(j, com/skype/MediaDocument);
        if (mediadocument != null)
        {
            mediaDocumentUploadUtil.retryMediaDocumentUploadAsync(i, mediadocument);
        }
    }

    private void setRetryListener(final int messageId, a a1, final MediaDocument mediaDocument)
    {
        if (accessibility.a())
        {
            a1 = a1.getInlineContent();
            android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

                final PhotoMessageViewAdapter this$0;
                final MediaDocument val$mediaDocument;
                final int val$messageId;

                public final void onClick(View view)
                {
                    showRetryConfirmation(messageId, mediaDocument.getObjectID());
                }

            
            {
                this$0 = PhotoMessageViewAdapter.this;
                messageId = i;
                mediaDocument = mediadocument;
                super();
            }
            };
            mediaDocument = a1;
            a1 = onclicklistener;
        } else
        {
            SymbolView symbolview = a1.retryButton;
            a1 = new android.view.View.OnClickListener() {

                final PhotoMessageViewAdapter this$0;
                final MediaDocument val$mediaDocument;
                final int val$messageId;

                public final void onClick(View view)
                {
                    retryFailedUpload(messageId, mediaDocument.getObjectID());
                }

            
            {
                this$0 = PhotoMessageViewAdapter.this;
                messageId = i;
                mediaDocument = mediadocument;
                super();
            }
            };
            mediaDocument = symbolview;
        }
        mediaDocument.setOnClickListener(a1);
    }

    private void setViewContentDescription(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder, b b1)
    {
        Activity activity;
        Message message;
        String s;
        if (!accessibility.a())
        {
            return;
        }
        activity = getContext();
        message = (Message)map.a(mediamessageviewholder.messageId, com/skype/Message);
        s = timeUtil.b(message.getTimestampProp());
        static final class _cls5
        {

            static final int $SwitchMap$com$skype$android$app$chat$PhotoMessageViewAdapter$ViewState[];

            static 
            {
                $SwitchMap$com$skype$android$app$chat$PhotoMessageViewAdapter$ViewState = new int[b.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$chat$PhotoMessageViewAdapter$ViewState[b.LOADING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$PhotoMessageViewAdapter$ViewState[b.UNAVAILABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$PhotoMessageViewAdapter$ViewState[b.FAILED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls5..SwitchMap.com.skype.android.app.chat.PhotoMessageViewAdapter.ViewState[b1.ordinal()];
        JVM INSTR tableswitch 1 3: default 88
    //                   1 120
    //                   2 175
    //                   3 230;
           goto _L1 _L2 _L3 _L4
_L1:
        if (mediamessageviewholder.isOutgoing())
        {
            b1 = activity.getString(0x7f080106, new Object[] {
                s
            });
        } else
        {
            b1 = activity.getString(0x7f0800c3, new Object[] {
                message.getAuthorDisplaynameProp(), s
            });
        }
_L6:
        mediamessageviewholder.itemView.setContentDescription(b1);
        return;
_L2:
        if (mediamessageviewholder.isOutgoing())
        {
            b1 = activity.getString(0x7f080108, new Object[] {
                s
            });
        } else
        {
            b1 = activity.getString(0x7f0800c4, new Object[] {
                message.getAuthorDisplaynameProp(), s
            });
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mediamessageviewholder.isOutgoing())
        {
            b1 = activity.getString(0x7f08010a, new Object[] {
                s
            });
        } else
        {
            b1 = activity.getString(0x7f0800c5, new Object[] {
                message.getAuthorDisplaynameProp(), s
            });
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (mediamessageviewholder.isOutgoing())
        {
            b1 = activity.getString(0x7f080109, new Object[] {
                s
            });
        } else
        {
            b1 = activity.getString(0x7f0800c5, new Object[] {
                message.getAuthorDisplaynameProp(), s
            });
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void showOverlay(a a1, boolean flag)
    {
        a1.overlay.setVisibility(0);
        a1 = (LevelListDrawable)a1.overlay.getBackground();
        int i;
        if (flag)
        {
            i = 0x7f0e002d;
        } else
        {
            i = 0x7f0e002e;
        }
        a1.setLevel(getContext().getResources().getInteger(i));
    }

    private void showRetryConfirmation(int i, int j)
    {
        Activity activity = getContext();
        MediaUploadRetryDialogFragment mediauploadretrydialogfragment = MediaUploadRetryDialogFragment.create(i, j, activity.getResources().getQuantityString(0x7f0b0013, 1), activity.getString(0x7f0803a8), activity.getString(0x7f080177), activity.getString(0x7f080067));
        ((MediaUploadRetryDialogFragment)mediauploadretrydialogfragment).setRetryDialogCallback(retryDialogCallback);
        mediauploadretrydialogfragment.show(((ChatActivity)activity).getSupportFragmentManager());
    }

    protected void bindContentViewForMedia(Message message, MediaDocument mediadocument, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        a a1 = (a)mediamessageviewholder;
        a1.thumbnailLayout.setVisibility(0);
        a1.mediaRemovedTextView.setVisibility(8);
        super.bindContentViewForMedia(message, mediadocument, mediamessageviewholder);
    }

    protected void bindContentViewForRemovedMedia(j j, MessageHolder messageholder, boolean flag)
    {
        ((a)j).thumbnailLayout.setVisibility(8);
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
            mediamessageviewholder = ((a) (mediamessageviewholder)).mediaRemovedTextView;
        } else
        {
            mediamessageviewholder = ((a) (mediamessageviewholder)).thumbnailLayout;
        }
        return (Bubblable)mediamessageviewholder;
    }

    protected android.view.View.OnClickListener getClickListener(final Message message, final MediaDocument mediaDocument)
    {
        return new android.view.View.OnClickListener() {

            final PhotoMessageViewAdapter this$0;
            final MediaDocument val$mediaDocument;
            final Message val$message;

            public final void onClick(View view)
            {
                if (isLoaded(mediaDocument))
                {
                    int i = message.getTimestampProp();
                    String s;
                    try
                    {
                        view = timeUtil.a(lib.getServerTime(), i, true);
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        timeAnomalyTelemetry.a(view, message.getTypeProp(), "PhotoMessage#onClick#mediaDocument#isLoaded");
                        view = timeUtil.a(i, true);
                    }
                    s = message.getAuthorProp();
                    view = getContext().getString(0x7f0800fc, new Object[] {
                        s, view
                    });
                    navigation.showImage(mediaDocument, view);
                }
            }

            
            {
                this$0 = PhotoMessageViewAdapter.this;
                mediaDocument = mediadocument;
                message = message1;
                super();
            }
        };
    }

    protected int getLayoutId(int i)
    {
        return 0x7f030046;
    }

    protected MediaLinkProfile getMediaLinkProfile()
    {
        return MediaLinkProfile.IMG_PROFILE;
    }

    public int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    protected void setFailedUploadViewState(Message message, MediaDocument mediadocument, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        mediamessageviewholder = (a)mediamessageviewholder;
        showOverlay(mediamessageviewholder, false);
        hideProgressIndicator(mediamessageviewholder);
        ((a) (mediamessageviewholder)).retryButton.setVisibility(0);
        ((a) (mediamessageviewholder)).failureIcon.setVisibility(0);
        if (accessibility.a())
        {
            AccessibilityUtil.a(new View[] {
                ((a) (mediamessageviewholder)).retryButton
            });
        }
        setRetryListener(message.getObjectID(), mediamessageviewholder, mediadocument);
        setViewContentDescription(mediamessageviewholder, b.FAILED);
    }

    protected void setLoadingViewState(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        mediamessageviewholder = (a)mediamessageviewholder;
        if (((a) (mediamessageviewholder)).progressIndicator.getVisibility() != 0)
        {
            showOverlay(mediamessageviewholder, false);
            ((a) (mediamessageviewholder)).progressIndicator.setVisibility(0);
            if (mediamessageviewholder.isRecyclable())
            {
                mediamessageviewholder.setIsRecyclable(false);
            }
        }
        ((a) (mediamessageviewholder)).retryButton.setVisibility(8);
        ((a) (mediamessageviewholder)).failureIcon.setVisibility(8);
        setViewContentDescription(mediamessageviewholder, b.LOADING);
    }

    protected void setThumbnailBitmap(Bitmap bitmap, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        super.setThumbnailBitmap(bitmap, mediamessageviewholder);
        mediamessageviewholder = (a)mediamessageviewholder;
        if (bitmap != null)
        {
            ((a) (mediamessageviewholder)).placeholder.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)((a) (mediamessageviewholder)).thumbnail.getLayoutParams();
            int i;
            int j;
            if (bitmap.getWidth() > bitmap.getHeight())
            {
                j = 0x7f0c00b4;
                i = 0x7f0c00b3;
            } else
            {
                j = 0x7f0c00b2;
                i = 0x7f0c00b1;
            }
            layoutparams.width = getContext().getResources().getDimensionPixelSize(j);
            layoutparams.height = getContext().getResources().getDimensionPixelSize(i);
            ((a) (mediamessageviewholder)).thumbnail.setLayoutParams(layoutparams);
            return;
        } else
        {
            ((a) (mediamessageviewholder)).placeholder.setVisibility(0);
            return;
        }
    }

    protected void setThumbnailView(Bitmap bitmap, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        super.setThumbnailView(bitmap, mediamessageviewholder);
        bitmap = (a)mediamessageviewholder;
        showOverlay(bitmap, true);
        hideProgressIndicator(bitmap);
        ((a) (bitmap)).retryButton.setVisibility(8);
        ((a) (bitmap)).failureIcon.setVisibility(8);
        setViewContentDescription(bitmap, b.DEFAULT);
    }

    protected void setUnavailableViewState(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        mediamessageviewholder = (a)mediamessageviewholder;
        ((a) (mediamessageviewholder)).placeholder.setVisibility(0);
        hideProgressIndicator(mediamessageviewholder);
        ((a) (mediamessageviewholder)).overlay.setVisibility(8);
        ((a) (mediamessageviewholder)).thumbnail.setImageDrawable(null);
        ((a) (mediamessageviewholder)).retryButton.setVisibility(8);
        ((a) (mediamessageviewholder)).failureIcon.setVisibility(8);
        setViewContentDescription(mediamessageviewholder, b.UNAVAILABLE);
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE.toInt()
        });
    }


}
