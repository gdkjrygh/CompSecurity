// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.support.v4.view.ViewPager;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.pandora.android.provider.b;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.y;
import java.lang.ref.WeakReference;
import p.l.c;
import p.l.d;
import p.l.g;
import p.l.j;

// Referenced classes of package com.pandora.android.activity:
//            k

class a
    implements android.view.TreeObserver.OnPreDrawListener
{

    final k a;

    public boolean onPreDraw()
    {
        k.a(a).getViewTreeObserver().removeOnPreDrawListener(this);
        int ai[] = new int[2];
        com.pandora.android.activity.k.b(a).getLocationOnScreen(ai);
        k.a(a, com.pandora.android.activity.k.c(a)[0] - ai[0]);
        com.pandora.android.activity.k.b(a, com.pandora.android.activity.k.c(a)[1] - ai[1]);
        k.a(a, com.pandora.android.activity.k.d(a)[0] / (float)k.a(a).getWidth());
        com.pandora.android.activity.k.b(a, com.pandora.android.activity.k.d(a)[1] / (float)k.a(a).getHeight());
        k.e(a);
        if (k.f(a))
        {
            g.a(k.h(a)).a(com.pandora.android.activity.k.g(a).o()).a(0x7f0200e9).a(k.a(new WeakReference(a))).a(k.a(a));
        } else
        {
            aa aa1 = b.a.b().d().s();
            if (aa1 != null && !aa1.M())
            {
                g.a(k.h(a)).a(aa1.v()).a(0x7f0200e9).a(k.a(new WeakReference(a))).a(k.a(a));
            } else
            {
                a.b();
                return true;
            }
        }
        k.a(a).postDelayed(new Runnable() {

            final k._cls1 a;

            public void run()
            {
                a.a.b();
            }

            
            {
                a = k._cls1.this;
                super();
            }
        }, 500L);
        return true;
    }

    _cls1.a(k k1)
    {
        a = k1;
        super();
    }
}
