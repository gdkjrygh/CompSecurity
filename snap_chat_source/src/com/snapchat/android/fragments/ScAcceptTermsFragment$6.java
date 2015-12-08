// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import Mf;
import Oi;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.snapchat.android.fragments.settings.WebFragment;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.fragments:
//            ScAcceptTermsFragment

final class a extends ClickableSpan
{

    private String a;

    public final void onClick(View view)
    {
        view.invalidate();
        Mf.a().a(new Oi(new WebFragment("https://www.snapchat.com/privacy", a)));
    }

    public final void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }

    (String s)
    {
        a = s;
        super();
    }
}
