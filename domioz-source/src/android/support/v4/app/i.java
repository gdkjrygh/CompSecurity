// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v4.app:
//            f, k

final class i
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final k b;
    final int c;
    final Object d;
    final f e;

    i(f f1, View view, k k, int j, Object obj)
    {
        e = f1;
        a = view;
        b = k;
        c = j;
        d = obj;
        super();
    }

    public final boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        f.a(e, b, c, d);
        return true;
    }
}
