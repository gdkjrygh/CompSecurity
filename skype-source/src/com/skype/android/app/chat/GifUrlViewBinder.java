// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.MoviePlayerView;
import com.skype.android.widget.bubbles.BubbleFrameLayout;

// Referenced classes of package com.skype.android.app.chat:
//            UrlMessageViewBinder, GifUrlViewHolder, MessageHolder, SubtypeViewHolder, 
//            UrlPreviewTextMessageViewHolder, TextMessageViewAdapter

public class GifUrlViewBinder
    implements UrlMessageViewBinder
{

    public GifUrlViewBinder()
    {
    }

    private void alignPreview(UrlMessageViewBinder.ViewBinderParams viewbinderparams, boolean flag, boolean flag1)
    {
        GifUrlViewHolder gifurlviewholder = (GifUrlViewHolder)viewbinderparams.getSubtypeViewHolder();
        Resources resources = viewbinderparams.getContext().getResources();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)gifurlviewholder.urlBubble.getLayoutParams();
        if (flag1)
        {
            viewbinderparams = com.skype.android.widget.bubbles.Bubblable.Direction.b;
            layoutparams.addRule(11);
            layoutparams.addRule(9, 0);
            layoutparams.setMargins(resources.getDimensionPixelSize(0x7f0c007a), 0, 0, 0);
        } else
        {
            viewbinderparams = com.skype.android.widget.bubbles.Bubblable.Direction.a;
            layoutparams.addRule(9);
            layoutparams.addRule(11, 0);
            layoutparams.setMargins(0, 0, resources.getDimensionPixelSize(0x7f0c007a), 0);
        }
        gifurlviewholder.urlBubble.setLayoutParams(layoutparams);
        ((BubbleFrameLayout)gifurlviewholder.urlBubble).setDirectionState(viewbinderparams, flag);
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

    private void setViewSize(View view, int i, int j, int k, int l)
    {
        int k1 = 0;
        int j2 = 0;
        int l1 = i;
        int i2 = j;
        if (i > k)
        {
            k1 = i - k;
        }
        if (j > l)
        {
            j2 = j - l;
        }
        int j1 = i2;
        int i1 = l1;
        if (k1 > 0)
        {
            j1 = i2;
            i1 = l1;
            if (k1 >= j2)
            {
                float f = (float)j / (float)i;
                i1 = k;
                j1 = (int)((float)k * f + 0.5F);
            }
        }
        l1 = j1;
        k = i1;
        if (j2 > 0)
        {
            l1 = j1;
            k = i1;
            if (j2 > k1)
            {
                float f1 = (float)i / (float)j;
                l1 = l;
                k = (int)((float)l * f1 + 0.5F);
            }
        }
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
        layoutparams.width = k;
        layoutparams.height = l1;
        view.setLayoutParams(layoutparams);
    }

    public void bindView(UrlMessageViewBinder.ViewBinderParams viewbinderparams)
    {
        GifUrlViewHolder gifurlviewholder = (GifUrlViewHolder)viewbinderparams.getSubtypeViewHolder();
        com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult = viewbinderparams.getUrlPreviewResult();
        UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder = gifurlviewholder.getUrlPreviewTextMessageViewHolder();
        Resources resources = viewbinderparams.getContext().getResources();
        gifurlviewholder.urlBubble.removeView(ViewUtil.a(gifurlviewholder.urlBubble, 0x7f100018));
        Object obj1 = urlpreviewresult.getUrlMedia().getMedia();
        boolean flag;
        if (obj1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            gifurlviewholder.thumbnailView.setImageBitmap(null);
            gifurlviewholder.thumbnailView.setVisibility(8);
        } else
        {
            Object obj;
            int i;
            int j;
            int k;
            if (obj1 instanceof Bitmap)
            {
                gifurlviewholder.thumbnailView.setVisibility(0);
                gifurlviewholder.thumbnailView.setImageBitmap((Bitmap)obj1);
                i = ((Bitmap)obj1).getWidth();
                j = ((Bitmap)obj1).getHeight();
                obj = gifurlviewholder.thumbnailView;
            } else
            {
                gifurlviewholder.thumbnailView.setVisibility(8);
                gifurlviewholder.thumbnailView.setImageBitmap(null);
                MoviePlayerView movieplayerview = new MoviePlayerView(viewbinderparams.getContext());
                obj = movieplayerview;
                movieplayerview.setId(0x7f100018);
                obj1 = (Movie)obj1;
                i = ((Movie) (obj1)).width();
                j = ((Movie) (obj1)).height();
                movieplayerview.setMovie(((Movie) (obj1)));
                obj1 = new android.widget.FrameLayout.LayoutParams(((Movie) (obj1)).width(), ((Movie) (obj1)).height());
                obj1.gravity = 17;
                gifurlviewholder.urlBubble.addView(movieplayerview, ((android.view.ViewGroup.LayoutParams) (obj1)));
            }
            gifurlviewholder.getSubView().setOnClickListener(viewbinderparams.getItemOnClickListener());
            setUrlPreviewLongClickListener(viewbinderparams);
            if (viewbinderparams.isEmbedded())
            {
                k = resources.getDimensionPixelSize(0x7f0c00f4);
            } else
            {
                k = resources.getDimensionPixelSize(0x7f0c00f3);
            }
            setViewSize(((View) (obj)), i, j, k, resources.getDimensionPixelSize(0x7f0c00f2));
            if (!viewbinderparams.isEmbedded())
            {
                alignPreview(viewbinderparams, urlpreviewtextmessageviewholder.isChained(), urlpreviewtextmessageviewholder.isOutgoing());
                return;
            }
        }
    }
}
