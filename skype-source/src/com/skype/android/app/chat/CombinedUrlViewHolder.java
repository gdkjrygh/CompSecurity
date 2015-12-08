// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import com.skype.android.mediacontent.SpannedAnimationDrawableCallback;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.bubbles.BubbleLinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat:
//            SubtypeViewHolder, SimpleMessageInCombinedPreviewViewBinder, ChatMessageUtils, UrlPreviewTextMessageViewHolder, 
//            TextMessageViewAdapter, MessageHolder

public class CombinedUrlViewHolder extends SubtypeViewHolder
{
    public static interface CombinedLayoutVisitor
    {

        public abstract void visit(SubtypeViewHolder subtypeviewholder, com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult, MessageHolder messageholder);
    }


    private List holders;
    BubbleLinearLayout layoutBubble;
    private SimpleMessageInCombinedPreviewViewBinder textBinder;

    public CombinedUrlViewHolder()
    {
        super(false);
        holders = new ArrayList();
        textBinder = new SimpleMessageInCombinedPreviewViewBinder();
    }

    private void addFooterText(TextMessageViewAdapter textmessageviewadapter, MessageHolder messageholder, AccessibilityUtil accessibilityutil, Spannable spannable, SpannableStringBuilder spannablestringbuilder, Context context, int i)
    {
        spannable = ChatMessageUtils.trim(spannablestringbuilder.subSequence(i, spannable.length()));
        if (spannable.length() > 0)
        {
            addTextToCombinedUrlViewHolder(spannable, context, accessibilityutil, messageholder, textmessageviewadapter);
        }
    }

    private void addTextToCombinedUrlViewHolder(CharSequence charsequence, Context context, AccessibilityUtil accessibilityutil, MessageHolder messageholder, TextMessageViewAdapter textmessageviewadapter)
    {
        TextView textview = (TextView)LayoutInflater.from(context).inflate(0x7f03012d, layoutBubble, false);
        boolean flag = accessibilityutil.a();
        accessibilityutil.a(textview, charsequence, flag);
        new SpannedAnimationDrawableCallback(textview);
        textview.setText(charsequence);
        charsequence = (new UrlMessageViewBinder.ViewBinderOptionsBuilder(context, messageholder, textmessageviewadapter, this)).setIsInAccessibilityMode(flag).setIsUrl(ViewUtil.a(charsequence)).setCustomView(textview).createViewBinderOptions();
        textBinder.bindView(charsequence);
        layoutBubble.addView(textview);
    }

    protected View inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        layoutinflater = layoutinflater.inflate(0x7f03012c, viewgroup, flag);
        layoutBubble = (BubbleLinearLayout)ViewUtil.a(layoutinflater, 0x7f10057b);
        return layoutinflater;
    }

    public void recycle()
    {
        UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder = getUrlPreviewTextMessageViewHolder();
        layoutBubble.removeAllViews();
        Pair pair;
        for (Iterator iterator = holders.iterator(); iterator.hasNext(); urlpreviewtextmessageviewholder.recycleToCache((UrlPreviewTextMessageViewHolder.MessageSubType)pair.first, (SubtypeViewHolder)pair.second))
        {
            pair = (Pair)iterator.next();
        }

        holders.clear();
    }

    public void startVisitor(TextMessageViewAdapter textmessageviewadapter, MessageHolder messageholder, AccessibilityUtil accessibilityutil, CombinedLayoutVisitor combinedlayoutvisitor)
    {
        ((ViewGroup)getSubView()).removeAllViews();
        UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder = getUrlPreviewTextMessageViewHolder();
        Spannable spannable = (Spannable)urlpreviewtextmessageviewholder.getOriginalText();
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(spannable);
        URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
        SparseArray sparsearray = urlpreviewtextmessageviewholder.getUrlResults();
        Context context = layoutBubble.getContext();
        Resources resources = context.getResources();
        int j = 0;
        int l = resources.getDimensionPixelSize(0x7f0c0267);
        int i = 0;
        while (i < sparsearray.size()) 
        {
            Pair pair = (Pair)sparsearray.get(i);
            int k;
            if (pair.second != null && ((com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult)pair.second).getUrlMedia().getMedia() != null)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k == 0)
            {
                k = j;
                if (i == sparsearray.size() - 1)
                {
                    addFooterText(textmessageviewadapter, messageholder, accessibilityutil, spannable, spannablestringbuilder, context, j);
                    k = j;
                }
            } else
            {
                Object obj = ChatMessageUtils.trim(ChatMessageUtils.trim(spannablestringbuilder.subSequence(j, spannable.getSpanStart(aurlspan[i]))));
                j = spannable.getSpanEnd(aurlspan[i]);
                if (((CharSequence) (obj)).length() > 0)
                {
                    addTextToCombinedUrlViewHolder(((CharSequence) (obj)), context, accessibilityutil, messageholder, textmessageviewadapter);
                    layoutBubble.addView(new Space(context), -1, l);
                }
                obj = urlpreviewtextmessageviewholder.previewTypeToMessageSubtype(((com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult)pair.second).getType(), true);
                SubtypeViewHolder subtypeviewholder = urlpreviewtextmessageviewholder.getSubtypeViewHolder(context, ((UrlPreviewTextMessageViewHolder.MessageSubType) (obj)));
                holders.add(new Pair(obj, subtypeviewholder));
                combinedlayoutvisitor.visit(subtypeviewholder, (com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult)pair.second, messageholder);
                layoutBubble.addView(subtypeviewholder.getSubView());
                layoutBubble.addView(new Space(context), -1, l);
                k = j;
                if (i == sparsearray.size() - 1)
                {
                    addFooterText(textmessageviewadapter, messageholder, accessibilityutil, spannable, spannablestringbuilder, context, j);
                    k = j;
                }
            }
            i++;
            j = k;
        }
    }
}
