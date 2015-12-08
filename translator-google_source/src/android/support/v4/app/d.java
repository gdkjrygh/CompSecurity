// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v4.app:
//            a, f

final class d
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final f b;
    final int c;
    final Object d;
    final a e;

    d(a a1, View view, f f, int i, Object obj)
    {
        e = a1;
        a = view;
        b = f;
        c = i;
        d = obj;
        super();
    }

    public final boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        android.support.v4.app.a.a(e, b, c, d);
        return true;
    }
}
