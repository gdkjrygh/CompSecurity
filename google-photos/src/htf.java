// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

final class htf extends ClickableSpan
{

    private hte a;

    htf(hte hte1)
    {
        a = hte1;
        super();
    }

    public final void onClick(View view)
    {
        hte.a(a).a();
        hte.b(a).a(fnl.k);
    }

    public final void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
        textpaint.setColor(a.g().getColor(u.s));
    }
}
