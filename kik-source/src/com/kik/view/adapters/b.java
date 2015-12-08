// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.kik.android.a;
import com.kik.cache.ad;
import kik.a.d.s;
import kik.a.e.n;
import kik.android.chat.KikApplication;
import kik.android.chat.b.c;
import kik.android.chat.b.d;

// Referenced classes of package com.kik.view.adapters:
//            ay, c, d

public abstract class b extends ay
{
    public static class a extends ay.a
    {

        View a;

        public a()
        {
        }
    }


    protected final d a;

    public b(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, ar.a a1, ad ad, com.kik.android.a a2, n n, 
            d d1, com.kik.e.a a3)
    {
        super(layoutinflater, context, onclicklistener, a1, a2, ad, n, a3);
        a = d1;
    }

    public void a(ar.b b1, s s1, boolean flag, Context context, au.b b2)
    {
        super.a(b1, s1, flag, context, b2);
        context = (a)b1;
        if (context != null && s1 != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)((a) (context)).a.getLayoutParams();
            if (s1.d())
            {
                layoutparams.addRule(11, -1);
                layoutparams.addRule(9, 0);
                c.a(((a) (context)).a, a.c(), 0x7f0201fb);
                layoutparams.setMargins(KikApplication.a(45), layoutparams.topMargin, KikApplication.a(3), layoutparams.bottomMargin);
            } else
            {
                layoutparams.addRule(11, 0);
                layoutparams.addRule(9, -1);
                c.a(((a) (context)).a, a.e(), 0x7f0201ab);
                layoutparams.setMargins(KikApplication.a(52), layoutparams.topMargin, 0, layoutparams.bottomMargin);
            }
        }
        b1 = (a)b1;
        ((a) (b1)).a.setOnClickListener(new com.kik.view.adapters.c(this, b2, b1));
        ((a) (b1)).a.setOnCreateContextMenuListener(new com.kik.view.adapters.d(this));
    }
}
