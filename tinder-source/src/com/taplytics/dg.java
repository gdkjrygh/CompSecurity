// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.taplytics:
//            cv, hk, turkey, ci, 
//            hn, fz, gd

final class dg
    implements Runnable
{

    static final boolean a;
    final cv b;

    dg(cv cv1)
    {
        b = cv1;
        super();
    }

    public final void run()
    {
        if (!a && cv.d(b) == null)
        {
            throw new AssertionError();
        }
        if (hk.a(cv.d(b)) && cv.d(b).findViewById(0x17ccbc35).getTag().equals(cv.h(b).name())) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        fz fz1;
        RelativeLayout relativelayout;
        LinearLayout linearlayout;
        LinearLayout linearlayout1;
        LinearLayout linearlayout2;
        b.f();
        cv.a(b, hk.a(cv.h(b)));
        fz1 = cv.i(b);
        obj = cv.h(b);
        obj2 = cv.e(b);
        obj1 = cv.f(b);
        relativelayout = new RelativeLayout(ci.b().u);
        linearlayout = new LinearLayout(ci.b().u);
        linearlayout1 = new LinearLayout(ci.b().u);
        linearlayout2 = new LinearLayout(ci.b().u);
        linearlayout.setOrientation(1);
        if (!((turkey) (obj)).equals(turkey.a)) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder;
label0:
        {
            stringbuilder = new StringBuilder("Experiment: ");
            if (obj2 != null)
            {
                obj = obj2;
                if (!((String) (obj2)).equals(""))
                {
                    break label0;
                }
            }
            obj = "loading...";
        }
        obj2 = stringbuilder.append(((String) (obj))).toString();
        stringbuilder = new StringBuilder("Variation: ");
        if (obj1 == null || ((String) (obj1)).equals(""))
        {
            obj = "loading...";
        } else
        {
            obj = obj1;
        }
        obj = stringbuilder.append(((String) (obj))).toString();
        obj1 = obj2;
_L8:
        linearlayout.setOnLongClickListener(new hn());
        if (ci.b().m)
        {
            obj2 = hk.a("Taplytics SDK\nUpdate Available", 0, 0, hk.a(2.0F));
            ((TextView) (obj2)).setGravity(17);
            ((TextView) (obj2)).setTextSize(2, 8F);
            linearlayout2.addView(((View) (obj2)));
            linearlayout2.setGravity(0x800005);
        }
        obj1 = hk.a(((String) (obj1)), 0x17ccbc33, -8, 0);
        obj = hk.a(((String) (obj)), 0x17ccbc34, 0, 0);
        linearlayout.addView(((View) (obj1)));
        linearlayout.addView(((View) (obj)));
        obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13);
        linearlayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(15);
        linearlayout2.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        relativelayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, hk.a(35F)));
        relativelayout.addView(linearlayout1);
        relativelayout.addView(linearlayout);
        relativelayout.addView(linearlayout2);
        fz1.addView(relativelayout);
        if (cv.h(b).equals(turkey.b) || cv.h(b).equals(turkey.d))
        {
            cv.i(b).setOnTouchListener(cv.j(b));
        }
        cv.d(b).addView(cv.i(b));
_L6:
        return;
_L4:
        obj1 = gd.a(((turkey) (obj)));
        obj = gd.b(((turkey) (obj)));
        continue; /* Loop/switch isn't completed */
_L2:
        if (!cv.h(b).equals(turkey.a) || cv.e(b) == null || cv.f(b) == null || cv.e(b).equals("null") || cv.f(b).equals("null")) goto _L6; else goto _L5
_L5:
        cv.k(b);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        boolean flag;
        if (!com/taplytics/cv.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
