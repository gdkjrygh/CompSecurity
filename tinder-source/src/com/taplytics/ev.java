// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            cv, fz, ci, gf, 
//            hk, gs, eu

final class ev
    implements Runnable
{

    final boolean a;
    final View b;
    final JSONObject c;
    final eu d;

    ev(eu eu, boolean flag, View view, JSONObject jsonobject)
    {
        d = eu;
        a = flag;
        b = view;
        c = jsonobject;
        super();
    }

    public final void run()
    {
        Object obj;
        if (a)
        {
            obj = cv.a().j.findViewById(0x17ccbc3b);
            break MISSING_BLOCK_LABEL_19;
        }
        boolean flag;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        obj = b;
        flag = c.has("anID");
        ai = new int[2];
        ((View) (obj)).getLocationOnScreen(ai);
        int i;
        int j;
        i = ai[0];
        j = ai[1];
        int k;
        int l;
        k = ai[0] + ((View) (obj)).getWidth();
        l = ai[1] + ((View) (obj)).getHeight();
        if (cv.a().j.findViewById(0x17ccbc3b) != null)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        obj = new fz(ci.b().u);
        ((fz) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        ((fz) (obj)).setId(0x17ccbc3b);
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        ((fz) (obj)).setBackground(new gf(Color.parseColor("#CCe75f68"), i, j, k, l, flag));
_L1:
        ((ViewGroup)ci.b().v.findViewById(0x1020002).getRootView()).addView(((View) (obj)));
        hk.b(((View) (obj)));
        return;
        obj;
        gs.b("border", ((Exception) (obj)));
        return;
        int ai[];
        if (obj != null)
        {
            try
            {
                ((View) (obj)).clearAnimation();
                cv.a().j.removeView(((View) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                gs.b("ERRRROR", ((Exception) (obj)));
            }
        }
        return;
        ((fz) (obj)).setBackgroundDrawable(new gf(Color.parseColor("#CCe75f68"), i, j, k, l, flag));
          goto _L1
        obj = (gf)cv.a().j.findViewById(0x17ccbc3b).getBackground();
        obj.b = i;
        obj.c = k;
        obj.a = j;
        obj.d = l;
        ((gf) (obj)).invalidateSelf();
        hk.b(cv.a().j.findViewById(0x17ccbc3b));
        return;
        obj = cv.a().j.findViewById(0x17ccbc3b);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        ((View) (obj)).clearAnimation();
        cv.a().j.removeView(((View) (obj)));
    }
}
