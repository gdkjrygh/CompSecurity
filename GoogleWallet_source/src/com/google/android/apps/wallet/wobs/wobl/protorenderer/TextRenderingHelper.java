// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.collect.Lists;
import com.google.wallet.wobl.renderer.android.AndroidRenderUtils;
import com.google.wallet.wobl.renderer.android.RendererClient;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            ProtoWoblRenderUtils, SpannableAppender, DateRenderingHelper

public final class TextRenderingHelper
{
    final class DateAppender extends SpannableAppender
    {

        private final com.google.wallet.proto.NanoCompiledWobl.InlineTextContent.Date date;
        private final com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes styles[];
        final TextRenderingHelper this$0;

        public final void append(SpannableStringBuilder spannablestringbuilder)
        {
            appendStyledContent(spannablestringbuilder, (new DateRenderingHelper(context)).getDateDisplayString(date), null, styles);
        }

        DateAppender(com.google.wallet.proto.NanoCompiledWobl.InlineTextContent.Date date1, com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes textstyleattributes)
        {
            this$0 = TextRenderingHelper.this;
            super(androidVersion);
            date = date1;
            styles = (new com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes[] {
                date1.textStyleAttributes, textstyleattributes
            });
        }
    }

    final class LinkAppender extends SpannableAppender
    {

        private final com.google.wallet.proto.NanoCompiledWobl.InlineTextContent.Link link;
        private final com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes styles[];
        final TextRenderingHelper this$0;
        private final TextView view;

        protected final void append(SpannableStringBuilder spannablestringbuilder)
        {
            Object obj = null;
            ClickableSpan clickablespan = obj;
            if (link.tapUri != null)
            {
                clickablespan = obj;
                if (link.tapUri.length > 0)
                {
                    ClickableSpan clickablespan1 = new ClickableSpan() {

                        final LinkAppender this$1;

                        public final void onClick(View view)
                        {
                            AndroidRenderUtils.getFirstResolvableClickListener(Lists.transform(Arrays.asList(link.tapUri), ProtoWoblRenderUtils.TO_URI), rendererClient, view).onClick(view);
                        }

                        public final void updateDrawState(TextPaint textpaint)
                        {
                            textpaint.setColor(textpaint.linkColor);
                        }

            
            {
                this$1 = LinkAppender.this;
                super();
            }
                    };
                    clickablespan = clickablespan1;
                    if (view.getMovementMethod() == null)
                    {
                        view.setMovementMethod(LinkMovementMethod.getInstance());
                        clickablespan = clickablespan1;
                    }
                }
            }
            appendStyledContent(spannablestringbuilder, link.text, clickablespan, styles);
        }


        private LinkAppender(com.google.wallet.proto.NanoCompiledWobl.InlineTextContent.Link link1, com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes textstyleattributes, TextView textview)
        {
            this$0 = TextRenderingHelper.this;
            super(androidVersion);
            link = link1;
            styles = (new com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes[] {
                link1.textStyleAttributes, textstyleattributes
            });
            view = textview;
        }

    }

    final class TextAppender extends SpannableAppender
    {

        private final com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes styles[];
        private final String text;
        final TextRenderingHelper this$0;

        protected final void append(SpannableStringBuilder spannablestringbuilder)
        {
            appendStyledContent(spannablestringbuilder, text, null, styles);
        }

        TextAppender(String s, com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes textstyleattributes)
        {
            this$0 = TextRenderingHelper.this;
            super(androidVersion);
            text = s;
            styles = (new com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes[] {
                textstyleattributes
            });
        }
    }


    private final int androidVersion;
    private final Context context;
    private final com.google.wallet.proto.NanoCompiledWobl.InlineTextContent inlineTextContents[];
    private final RendererClient rendererClient;
    private final com.google.wallet.proto.NanoCompiledWobl.TextBoxAttributes textBoxAttributes;
    private final com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes textStyleAttributes;

    public TextRenderingHelper(int i, Context context1, com.google.wallet.proto.NanoCompiledWobl.TextBoxAttributes textboxattributes, com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes textstyleattributes, com.google.wallet.proto.NanoCompiledWobl.InlineTextContent ainlinetextcontent[], RendererClient rendererclient)
    {
        androidVersion = i;
        context = context1;
        textBoxAttributes = textboxattributes;
        textStyleAttributes = textstyleattributes;
        inlineTextContents = ainlinetextcontent;
        rendererClient = rendererclient;
    }

    protected final void applyWoblToView(TextView textview)
    {
        if (textBoxAttributes == null) goto _L2; else goto _L1
_L1:
        Object obj = textBoxAttributes;
        if (((com.google.wallet.proto.NanoCompiledWobl.TextBoxAttributes) (obj)).lineHeight == null) goto _L4; else goto _L3
_L3:
        float f1;
        float f2;
        f1 = 0.0F;
        f2 = 1.0F;
        if (((com.google.wallet.proto.NanoCompiledWobl.TextBoxAttributes) (obj)).lineHeight.weight == null) goto _L6; else goto _L5
_L5:
        float f = ((com.google.wallet.proto.NanoCompiledWobl.TextBoxAttributes) (obj)).lineHeight.weight.floatValue();
_L8:
        textview.setLineSpacing(f1, f);
_L4:
        textview.setMaxLines(Protos.valueWithDefault(((com.google.wallet.proto.NanoCompiledWobl.TextBoxAttributes) (obj)).maxLines, 0x7fffffff));
        if (Protos.valueWithDefault(((com.google.wallet.proto.NanoCompiledWobl.TextBoxAttributes) (obj)).overflow, -1) == 1)
        {
            textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
        }
          goto _L2
_L6:
        textview.setLineSpacing(0.0F, 1.0F);
        int j = ProtoWoblRenderUtils.toPx(context, ((com.google.wallet.proto.NanoCompiledWobl.TextBoxAttributes) (obj)).lineHeight);
        f = f2;
        if (j > textview.getLineHeight())
        {
            f1 = j - textview.getLineHeight();
            f = f2;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (textStyleAttributes != null && textStyleAttributes.fontSize != null)
        {
            textview.setTextSize(0, ProtoWoblRenderUtils.toPx(context, textStyleAttributes.fontSize));
        }
        obj = new SpannableStringBuilder();
        com.google.wallet.proto.NanoCompiledWobl.InlineTextContent ainlinetextcontent[] = inlineTextContents;
        int k = ainlinetextcontent.length;
        int i = 0;
        while (i < k) 
        {
            com.google.wallet.proto.NanoCompiledWobl.InlineTextContent inlinetextcontent = ainlinetextcontent[i];
            if (inlinetextcontent.text != null)
            {
                (new TextAppender(inlinetextcontent.text, textStyleAttributes)).append(((SpannableStringBuilder) (obj)));
            } else
            if (inlinetextcontent.link != null)
            {
                (new LinkAppender(inlinetextcontent.link, textStyleAttributes, textview)).append(((SpannableStringBuilder) (obj)));
            } else
            if (inlinetextcontent.date != null)
            {
                (new DateAppender(inlinetextcontent.date, textStyleAttributes)).append(((SpannableStringBuilder) (obj)));
            }
            i++;
        }
        textview.setText(((CharSequence) (obj)));
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }



}
