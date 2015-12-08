// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v7.util.a;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.Bubblable;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;
import com.skype.android.widget.bubbles.BubbleTextView;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.skype.android.app.chat:
//            MediaMessageViewAdapter, MessageViewAdapterComponent, j, MessageHolder

public class XmmMessageViewAdapter extends MediaMessageViewAdapter
{
    private final class a extends MediaMessageViewAdapter.MediaMessageViewHolder
    {

        SymbolView centerSymbol;
        BubbleRelativeLayout mediaThumbnailLayout;
        final XmmMessageViewAdapter this$0;
        TextView xmmTitle;

        final void initializeViews()
        {
            xmmTitle = (TextView)ViewUtil.a(itemView, 0x7f1002eb);
            mediaRemovedTextView = (BubbleTextView)ViewUtil.a(itemView, 0x7f1002b6);
            mediaThumbnailLayout = (BubbleRelativeLayout)ViewUtil.a(itemView, 0x7f1002e8);
            thumbnail = (ImageView)ViewUtil.a(mediaThumbnailLayout, 0x7f1002e9);
            centerSymbol = (SymbolView)ViewUtil.a(mediaThumbnailLayout, 0x7f1002ea);
        }

        public a(View view)
        {
            this$0 = XmmMessageViewAdapter.this;
            super(XmmMessageViewAdapter.this, view);
        }
    }


    private static final int supportedMessageTypes[];

    public XmmMessageViewAdapter(Activity activity, MediaDocumentDownloadUtil mediadocumentdownloadutil)
    {
        super(activity, mediadocumentdownloadutil);
        getComponent().inject(this);
    }

    protected void alignContentView(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder, Bubblable bubblable, boolean flag, boolean flag1)
    {
        super.alignContentView(mediamessageviewholder, bubblable, flag, flag1);
        mediamessageviewholder = (a)mediamessageviewholder;
        bubblable = (android.widget.RelativeLayout.LayoutParams)((a) (mediamessageviewholder)).mediaThumbnailLayout.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)((a) (mediamessageviewholder)).xmmTitle.getLayoutParams();
        int i = ((a) (mediamessageviewholder)).mediaThumbnailLayout.getId();
        int j = getContext().getResources().getDimensionPixelSize(0x7f0c018a);
        byte byte0;
        if (flag)
        {
            byte0 = 5;
            bubblable.addRule(11, -1);
            bubblable.addRule(9, 0);
            layoutparams.addRule(0, i);
            layoutparams.addRule(1, 0);
            layoutparams.setMargins(0, 0, j, 0);
        } else
        {
            byte0 = 3;
            bubblable.addRule(9, -1);
            bubblable.addRule(11, 0);
            layoutparams.addRule(1, i);
            layoutparams.addRule(0, 0);
            layoutparams.setMargins(j, 0, 0, 0);
        }
        ((a) (mediamessageviewholder)).xmmTitle.setGravity(byte0);
    }

    protected void bindContentViewForMedia(Message message, final MediaDocument mediaDocument, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        a a1 = (a)mediamessageviewholder;
        a1.mediaThumbnailLayout.setVisibility(0);
        a1.mediaRemovedTextView.setVisibility(8);
        a1.centerSymbol.setVisibility(0);
        a1.centerSymbol.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.dH);
        a1.centerSymbol.setTextColor(getContext().getResources().getColor(0x7f0f0054));
        a1.thumbnail.setBackgroundColor(getContext().getResources().getColor(0x7f0f002f));
        if (!TextUtils.isEmpty(mediaDocument.getWebUrlProp()))
        {
            a1.xmmTitle.setVisibility(0);
            a1.xmmTitle.setOnClickListener(new android.view.View.OnClickListener() {

                final XmmMessageViewAdapter this$0;
                final MediaDocument val$mediaDocument;

                public final void onClick(View view)
                {
                    navigationUrl.goToUrl(getContext(), mediaDocument.getWebUrlProp(), true);
                }

            
            {
                this$0 = XmmMessageViewAdapter.this;
                mediaDocument = mediadocument;
                super();
            }
            });
        }
        super.bindContentViewForMedia(message, mediaDocument, mediamessageviewholder);
    }

    protected void bindContentViewForRemovedMedia(j j, MessageHolder messageholder, boolean flag)
    {
        a a1 = (a)j;
        a1.xmmTitle.setVisibility(8);
        a1.mediaThumbnailLayout.setVisibility(8);
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
            mediamessageviewholder = ((a) (mediamessageviewholder)).mediaThumbnailLayout;
        }
        return (Bubblable)mediamessageviewholder;
    }

    protected android.view.View.OnClickListener getClickListener(Message message, final MediaDocument mediaDocument)
    {
        return new android.view.View.OnClickListener() {

            final XmmMessageViewAdapter this$0;
            final MediaDocument val$mediaDocument;

            public final void onClick(View view)
            {
                if (isLoaded(mediaDocument))
                {
                    navigationUrl.goToUrl(getContext(), mediaDocument.getWebUrlProp(), true);
                }
            }

            
            {
                this$0 = XmmMessageViewAdapter.this;
                mediaDocument = mediadocument;
                super();
            }
        };
    }

    protected int getLayoutId(int i)
    {
        return 0x7f030055;
    }

    protected MediaLinkProfile getMediaLinkProfile()
    {
        return MediaLinkProfile.THUMBNAIL_PROFILE;
    }

    public int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    protected void setFailedUploadViewState(Message message, MediaDocument mediadocument, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
    }

    protected void setLoadingViewState(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
    }

    protected void setThumbnailView(Bitmap bitmap, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        ((a)mediamessageviewholder).centerSymbol.setVisibility(8);
        super.setThumbnailView(bitmap, mediamessageviewholder);
    }

    protected void setUnavailableViewState(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        mediamessageviewholder = (a)mediamessageviewholder;
        ((a) (mediamessageviewholder)).centerSymbol.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.dI);
        ((a) (mediamessageviewholder)).centerSymbol.setTextColor(getContext().getResources().getColor(0x7f0f0053));
        ((a) (mediamessageviewholder)).thumbnail.setImageDrawable(null);
        ((a) (mediamessageviewholder)).thumbnail.setBackgroundColor(getContext().getResources().getColor(0x7f0f002e));
    }

    static 
    {
        Object obj = EnumSet.range(com.skype.Message.TYPE.MESSAGE_GENERIC_MEDIA_START, com.skype.Message.TYPE.MESSAGE_GENERIC_MEDIA_END);
        supportedMessageTypes = new int[((EnumSet) (obj)).size()];
        int i = 0;
        for (obj = ((EnumSet) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            com.skype.Message.TYPE type = (com.skype.Message.TYPE)((Iterator) (obj)).next();
            supportedMessageTypes[i] = type.toInt();
            i++;
        }

    }
}
