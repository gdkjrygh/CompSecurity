// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.e.a;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ai, f, k, Fragment

final class h
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final Object b;
    final ArrayList c;
    final k d;
    final boolean e;
    final Fragment f;
    final Fragment g;
    final f h;

    h(f f1, View view, Object obj, ArrayList arraylist, k k1, boolean flag, Fragment fragment, 
            Fragment fragment1)
    {
        h = f1;
        a = view;
        b = obj;
        c = arraylist;
        d = k1;
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
            android.support.v4.app.ai.a(b, c);
            c.clear();
            a a1 = android.support.v4.app.f.a(h, d, e, f);
            c.add(d.d);
            c.addAll(a1.values());
            ai.b(b, c);
            android.support.v4.app.f.a(h, a1, d);
            android.support.v4.app.f.a(f, g, e, a1);
        }
        return true;
    }
}
