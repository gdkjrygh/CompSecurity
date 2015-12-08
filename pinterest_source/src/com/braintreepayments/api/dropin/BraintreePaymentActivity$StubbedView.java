// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;

// Referenced classes of package com.braintreepayments.api.dropin:
//            BraintreePaymentActivity

final class f extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static int g;
    private static final c h[];
    private final int d;
    private final int e;
    private boolean f;

    static boolean a(f f1)
    {
        return f1.f;
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/braintreepayments/api/dropin/BraintreePaymentActivity$StubbedView, s);
    }

    public static f[] values()
    {
        return (f[])h.clone();
    }

    final View a(BraintreePaymentActivity braintreepaymentactivity)
    {
        ViewStub viewstub = (ViewStub)BraintreePaymentActivity.a(braintreepaymentactivity, d);
        if (viewstub != null)
        {
            return viewstub.inflate();
        } else
        {
            return BraintreePaymentActivity.a(braintreepaymentactivity, e);
        }
    }

    final View b(BraintreePaymentActivity braintreepaymentactivity)
    {
        e ae[] = values();
        int j = ae.length;
        for (int i = 0; i < j; i++)
        {
            e e1 = ae[i];
            if (this == e1)
            {
                continue;
            }
            if ((ViewStub)BraintreePaymentActivity.a(braintreepaymentactivity, e1.d) == null)
            {
                BraintreePaymentActivity.a(braintreepaymentactivity, e1.e).setVisibility(8);
            }
            e1.f = false;
        }

        View view = a(braintreepaymentactivity);
        if (android.os.tActivity >= 12)
        {
            view.setAlpha(0.0F);
            view.setVisibility(0);
            ViewPropertyAnimator viewpropertyanimator = view.animate().alpha(1.0F);
            if (g == 0)
            {
                g = braintreepaymentactivity.getResources().getInteger(0x10e0000);
            }
            viewpropertyanimator.setDuration(g);
        } else
        {
            view.setVisibility(0);
        }
        f = true;
        return view;
    }

    static 
    {
        a = new <init>("LOADING_VIEW", 0, <init>, <init>);
        b = new <init>("SELECT_VIEW", 1, <init>, );
        c = new <init>("CARD_FORM", 2, <init>, <init>);
        h = (new h[] {
            a, b, c
        });
    }

    private (String s, int i, int j, int k)
    {
        super(s, i);
        d = j;
        e = k;
        f = false;
    }
}
