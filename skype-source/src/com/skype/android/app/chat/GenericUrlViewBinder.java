// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.android.widget.RoundCornerRelativeLayout;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;

// Referenced classes of package com.skype.android.app.chat:
//            UrlMessageViewBinder, GenericUrlViewHolder, MessageHolder, SubtypeViewHolder, 
//            UrlPreviewTextMessageViewHolder, TextMessageViewAdapter

public class GenericUrlViewBinder
    implements UrlMessageViewBinder
{

    public GenericUrlViewBinder()
    {
    }

    private void alignGenericUrlPreview(UrlMessageViewBinder.ViewBinderParams viewbinderparams, boolean flag, boolean flag1)
    {
        GenericUrlViewHolder genericurlviewholder = (GenericUrlViewHolder)viewbinderparams.getSubtypeViewHolder();
        Resources resources = viewbinderparams.getContext().getResources();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)genericurlviewholder.urlBubble.getLayoutParams();
        if (flag1)
        {
            viewbinderparams = com.skype.android.widget.bubbles.Bubblable.Direction.b;
            layoutparams.addRule(11);
            layoutparams.addRule(9, 0);
            layoutparams.setMargins(resources.getDimensionPixelSize(0x7f0c007a), 0, 0, 0);
            genericurlviewholder.urlBubble.setBackgroundResource(0x7f0f003c);
        } else
        {
            viewbinderparams = com.skype.android.widget.bubbles.Bubblable.Direction.a;
            layoutparams.addRule(9);
            layoutparams.addRule(11, 0);
            layoutparams.setMargins(0, 0, resources.getDimensionPixelSize(0x7f0c007a), 0);
            genericurlviewholder.urlBubble.setBackgroundResource(0x7f0f0039);
        }
        genericurlviewholder.urlBubble.setLayoutParams(layoutparams);
        ((BubbleRelativeLayout)genericurlviewholder.urlBubble).setDirectionState(viewbinderparams, flag);
    }

    private void setUrlPreviewLongClickListener(UrlMessageViewBinder.ViewBinderParams viewbinderparams)
    {
        SubtypeViewHolder subtypeviewholder;
        Object obj;
        String s;
        int i;
label0:
        {
            obj = viewbinderparams.getMessageHolder();
            subtypeviewholder = viewbinderparams.getSubtypeViewHolder();
            if (((MessageHolder) (obj)).getMessageObject() instanceof Message)
            {
                obj = (Message)((MessageHolder) (obj)).getMessageObject();
                i = subtypeviewholder.getLayoutPosition();
                s = viewbinderparams.getUrlPreviewResult().getMediaDocument().getWebUrlProp();
                if (subtypeviewholder.getUrlPreviewTextMessageViewHolder().getMessageSubtype() != UrlPreviewTextMessageViewHolder.MessageSubType.COMBINED_MESSAGE)
                {
                    break label0;
                }
                viewbinderparams.getTextMessageViewAdapter().setOnItemLongClickListener(((Message) (obj)), subtypeviewholder.getSubView(), i, true, true);
            }
            return;
        }
        viewbinderparams.getTextMessageViewAdapter().setOnItemLongClickListener(((Message) (obj)), subtypeviewholder.getSubView(), i, true, true, s);
    }

    public void bindView(UrlMessageViewBinder.ViewBinderParams viewbinderparams)
    {
        GenericUrlViewHolder genericurlviewholder;
        UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder;
        Resources resources;
        Object obj1;
        int i;
        boolean flag1;
        int k;
        genericurlviewholder = (GenericUrlViewHolder)viewbinderparams.getSubtypeViewHolder();
        com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult = viewbinderparams.getUrlPreviewResult();
        urlpreviewtextmessageviewholder = genericurlviewholder.getUrlPreviewTextMessageViewHolder();
        resources = viewbinderparams.getContext().getResources();
        Bitmap bitmap = (Bitmap)urlpreviewresult.getUrlMedia().getMedia();
        Bitmap bitmap1 = (Bitmap)urlpreviewresult.getFavicon().getMedia();
        String s = urlpreviewresult.getTitle();
        obj1 = urlpreviewresult.getMediaDocument().getWebUrlProp();
        boolean flag;
        if (bitmap != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s != null && !TextUtils.isEmpty(s))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (bitmap1 != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        genericurlviewholder.urlDomain.setVisibility(0);
        genericurlviewholder.favIcon.setImageBitmap(bitmap1);
        genericurlviewholder.urlTitle.setText(s);
        genericurlviewholder.urlDomain.setText(Uri.parse(((String) (obj1))).getHost());
        if (flag1)
        {
            genericurlviewholder.favIcon.setVisibility(0);
        } else
        {
            genericurlviewholder.favIcon.setImageDrawable(resources.getDrawable(0x7f020238));
        }
        k = resources.getDimensionPixelSize(0x7f0c00f1);
        genericurlviewholder.urlTitle.setPadding(genericurlviewholder.urlTitle.getPaddingLeft(), 0, genericurlviewholder.urlTitle.getPaddingRight(), resources.getDimensionPixelSize(0x7f0c023e));
        genericurlviewholder.playButton.setVisibility(8);
        if (!flag) goto _L2; else goto _L1
_L1:
        obj1 = (android.widget.RelativeLayout.LayoutParams)genericurlviewholder.urlTitle.getLayoutParams();
        obj1.height = resources.getDimensionPixelSize(0x7f0c00f5);
        genericurlviewholder.urlTitle.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        genericurlviewholder.thumbnail.setVisibility(0);
        genericurlviewholder.thumbnail.setImageBitmap(bitmap);
        obj1 = (android.widget.RelativeLayout.LayoutParams)genericurlviewholder.thumbnail.getLayoutParams();
        if (viewbinderparams.isEmbedded())
        {
            i = resources.getDimensionPixelSize(0x7f0c00f8);
        } else
        {
            i = resources.getDimensionPixelSize(0x7f0c00f7);
        }
        obj1.width = i;
        if (viewbinderparams.isEmbedded())
        {
            i = resources.getDimensionPixelSize(0x7f0c00f6);
        } else
        {
            i = resources.getDimensionPixelSize(0x7f0c00f5);
        }
        obj1.height = i;
        genericurlviewholder.thumbnail.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        genericurlviewholder.urlTitle.setMaxLines(2);
        genericurlviewholder.urlTitle.setTextColor(resources.getColor(0x7f0f0135));
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            genericurlviewholder.urlTitle.setBackgroundDrawable(resources.getDrawable(0x7f020239));
        } else
        {
            genericurlviewholder.urlTitle.setBackground(resources.getDrawable(0x7f020239));
        }
        genericurlviewholder.urlDomain.setTextColor(resources.getColor(0x7f0f013a));
        if (viewbinderparams.isEmbedded())
        {
            if (urlpreviewtextmessageviewholder.isOutgoing())
            {
                i = resources.getColor(0x7f0f003c);
            } else
            {
                i = resources.getColor(0x7f0f0039);
            }
            ((RoundCornerRelativeLayout)genericurlviewholder.urlBubble).setColor(i);
        }
        if (urlpreviewresult.getType() == com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.VIDEO)
        {
            genericurlviewholder.playButton.setVisibility(0);
            genericurlviewholder.urlTitle.setMaxLines(1);
        }
_L4:
        genericurlviewholder.getSubView().setOnClickListener(viewbinderparams.getItemOnClickListener());
        setUrlPreviewLongClickListener(viewbinderparams);
        if (!viewbinderparams.isEmbedded())
        {
            alignGenericUrlPreview(viewbinderparams, urlpreviewtextmessageviewholder.isChained(), urlpreviewtextmessageviewholder.isOutgoing());
        }
        return;
_L2:
        Object obj = (android.widget.RelativeLayout.LayoutParams)genericurlviewholder.urlTitle.getLayoutParams();
        obj.height = -2;
        genericurlviewholder.urlTitle.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        genericurlviewholder.urlTitle.setPadding(genericurlviewholder.urlTitle.getPaddingLeft(), k, genericurlviewholder.urlTitle.getPaddingRight(), genericurlviewholder.urlTitle.getPaddingBottom());
        genericurlviewholder.thumbnail.setVisibility(8);
        genericurlviewholder.urlTitle.setMaxLines(3);
        obj = genericurlviewholder.urlTitle;
        int j;
        if (urlpreviewtextmessageviewholder.isOutgoing())
        {
            j = 0x7f0f003c;
        } else
        {
            j = 0x7f0f0039;
        }
        ((TextView) (obj)).setBackgroundColor(resources.getColor(j));
        genericurlviewholder.urlTitle.setTextColor(resources.getColor(0x7f0f00f9));
        genericurlviewholder.urlDomain.setTextColor(resources.getColor(0x7f0f0119));
        if (i == 0)
        {
            genericurlviewholder.urlTitle.setText(((CharSequence) (obj1)));
            if (!flag1)
            {
                genericurlviewholder.favIcon.setVisibility(8);
                genericurlviewholder.urlDomain.setVisibility(8);
                genericurlviewholder.urlTitle.setPadding(genericurlviewholder.urlTitle.getPaddingLeft(), k, genericurlviewholder.urlTitle.getPaddingRight(), k);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
