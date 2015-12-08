// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.text.SpannableStringBuilder;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            SpannableAppender, TextRenderingHelper, DateRenderingHelper

final class styles extends SpannableAppender
{

    private final com.google.wallet.proto.t.Date date;
    private final com.google.wallet.proto.tes styles[];
    final TextRenderingHelper this$0;

    public final void append(SpannableStringBuilder spannablestringbuilder)
    {
        appendStyledContent(spannablestringbuilder, (new DateRenderingHelper(TextRenderingHelper.access$400(TextRenderingHelper.this))).getDateDisplayString(date), null, styles);
    }

    (com.google.wallet.proto.t.Date date1, com.google.wallet.proto.tes tes)
    {
        this$0 = TextRenderingHelper.this;
        super(TextRenderingHelper.access$100(TextRenderingHelper.this));
        date = date1;
        styles = (new com.google.wallet.proto.tes[] {
            date1.textStyleAttributes, tes
        });
    }
}
