// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

// Referenced classes of package me.lyft.android.ui.landing:
//            TermsOfServiceView, LandingFlow

class val.isError extends ClickableSpan
{

    final TermsOfServiceView this$0;
    final boolean val$isError;

    public void onClick(View view)
    {
        landingFlow.openTermsOfServiceScreen();
    }

    public void updateDrawState(TextPaint textpaint)
    {
        if (val$isError)
        {
            textpaint.setUnderlineText(false);
            textpaint.setColor(getResources().getColor(0x7f0c008f));
            return;
        } else
        {
            textpaint.setUnderlineText(false);
            textpaint.setColor(getResources().getColor(0x7f0c000b));
            return;
        }
    }

    ()
    {
        this$0 = final_termsofserviceview;
        val$isError = Z.this;
        super();
    }
}
