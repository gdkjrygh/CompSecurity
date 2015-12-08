// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.google.common.collect.Lists;
import com.google.wallet.wobl.renderer.android.AndroidRenderUtils;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            SpannableAppender, TextRenderingHelper, ProtoWoblRenderUtils

final class <init> extends SpannableAppender
{

    private final com.google.wallet.proto.t.Link link;
    private final com.google.wallet.proto.tes styles[];
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

                    final TextRenderingHelper.LinkAppender this$1;

                    public final void onClick(View view1)
                    {
                        AndroidRenderUtils.getFirstResolvableClickListener(Lists.transform(Arrays.asList(link.tapUri), ProtoWoblRenderUtils.TO_URI), TextRenderingHelper.access$300(this$0), view1).onClick(view1);
                    }

                    public final void updateDrawState(TextPaint textpaint)
                    {
                        textpaint.setColor(textpaint.linkColor);
                    }

            
            {
                this$1 = TextRenderingHelper.LinkAppender.this;
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


    private _cls1.this._cls1(com.google.wallet.proto.t.Link link1, com.google.wallet.proto.tes tes, TextView textview)
    {
        this$0 = TextRenderingHelper.this;
        super(TextRenderingHelper.access$100(TextRenderingHelper.this));
        link = link1;
        styles = (new com.google.wallet.proto.tes[] {
            link1.textStyleAttributes, tes
        });
        view = textview;
    }

    view(com.google.wallet.proto.t.Link link1, com.google.wallet.proto.tes tes, TextView textview, view view1)
    {
        this(link1, tes, textview);
    }
}
