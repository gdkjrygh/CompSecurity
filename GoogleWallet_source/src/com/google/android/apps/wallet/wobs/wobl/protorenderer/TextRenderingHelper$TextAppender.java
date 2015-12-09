// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.text.SpannableStringBuilder;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            SpannableAppender, TextRenderingHelper

final class styles extends SpannableAppender
{

    private final com.google.wallet.proto.tes styles[];
    private final String text;
    final TextRenderingHelper this$0;

    protected final void append(SpannableStringBuilder spannablestringbuilder)
    {
        appendStyledContent(spannablestringbuilder, text, null, styles);
    }

    (String s, com.google.wallet.proto.tes tes)
    {
        this$0 = TextRenderingHelper.this;
        super(TextRenderingHelper.access$100(TextRenderingHelper.this));
        text = s;
        styles = (new com.google.wallet.proto.tes[] {
            tes
        });
    }
}
