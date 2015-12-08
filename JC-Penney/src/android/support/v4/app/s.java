// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v4.app:
//            p, u

class s
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final u b;
    final int c;
    final Object d;
    final p e;

    s(p p1, View view, u u, int i, Object obj)
    {
        e = p1;
        a = view;
        b = u;
        c = i;
        d = obj;
        super();
    }

    public boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        p.a(e, b, c, d);
        return true;
    }
}
