// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewTreeObserver;

final class ae
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    private View a;
    private ag b;
    private int c;
    private Object d;
    private ab e;

    ae(ab ab1, View view, ag ag, int i, Object obj)
    {
        e = ab1;
        a = view;
        b = ag;
        c = i;
        d = obj;
        super();
    }

    public final boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        ab.a(e, b, c, d);
        return true;
    }
}
