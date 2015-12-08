// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.a.d;
import com.facebook.a.e;
import com.tinder.utils.ad;
import com.tinder.utils.o;

// Referenced classes of package com.tinder.c:
//            s

final class <init> extends d
{

    final float a;
    final float b;
    final float c;
    final float d;
    final float e;
    final float f;
    final int g;
    final int h;
    final boolean i;
    final s j;

    public final void onSpringAtRest(e e1)
    {
        if (i)
        {
            s.a(j, true);
            return;
        } else
        {
            j.dismiss();
            return;
        }
    }

    public final void onSpringUpdate(e e1)
    {
        float f1 = (float)e1.d.a;
        ad.c(s.b(j), o.a(f1, 0.0F, a, 1.0F, b));
        s.b(j).setTranslationX(o.a(f1, 0.0F, c, 1.0F, d));
        s.b(j).setTranslationY(o.a(f1, 0.0F, e, 1.0F, f));
        s.c(j).setAlpha(o.a(f1, 0.0F, g, 1.0F, h));
    }

    lativeLayout(s s1, float f1, float f2, float f3, float f4, float f5, float f6, 
            int k, int l, boolean flag)
    {
        j = s1;
        a = f1;
        b = f2;
        c = f3;
        d = f4;
        e = f5;
        f = f6;
        g = k;
        h = l;
        i = flag;
        super();
    }
}
