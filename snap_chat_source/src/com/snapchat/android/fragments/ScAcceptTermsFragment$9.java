// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments:
//            ScAcceptTermsFragment

final class a extends ClickableSpan
{

    private ScAcceptTermsFragment a;

    public final void onClick(View view)
    {
        view.invalidate();
        ScAcceptTermsFragment.f(a);
    }

    public final void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }

    (ScAcceptTermsFragment scaccepttermsfragment)
    {
        a = scaccepttermsfragment;
        super();
    }
}
