// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            az, p, u, Fragment

class r
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final Object b;
    final ArrayList c;
    final u d;
    final boolean e;
    final Fragment f;
    final Fragment g;
    final p h;

    r(p p1, View view, Object obj, ArrayList arraylist, u u1, boolean flag, Fragment fragment, 
            Fragment fragment1)
    {
        h = p1;
        a = view;
        b = obj;
        c = arraylist;
        d = u1;
        e = flag;
        f = fragment;
        g = fragment1;
        super();
    }

    public boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (b != null)
        {
            az.a(b, c);
            c.clear();
            android.support.v4.f.a a1 = p.a(h, d, e, f);
            az.a(b, d.d, a1, c);
            p.a(h, a1, d);
            p.a(h, d, f, g, e, a1);
        }
        return true;
    }
}
