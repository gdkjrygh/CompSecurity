// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            af, a, f, Fragment

final class c
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final Object b;
    final ArrayList c;
    final f d;
    final boolean e;
    final Fragment f;
    final Fragment g;
    final a h;

    c(a a1, View view, Object obj, ArrayList arraylist, f f1, boolean flag, Fragment fragment, 
            Fragment fragment1)
    {
        h = a1;
        a = view;
        b = obj;
        c = arraylist;
        d = f1;
        e = flag;
        f = fragment;
        g = fragment1;
        super();
    }

    public final boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (b != null)
        {
            af.a(b, c);
            c.clear();
            android.support.v4.d.a a1 = android.support.v4.app.a.a(h, d, e, f);
            af.a(b, d.d, a1, c);
            android.support.v4.app.a.a(h, a1, d);
            android.support.v4.app.a.a(f, g, e, a1);
        }
        return true;
    }
}
