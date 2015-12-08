// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

final class ad
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    private View a;
    private Object b;
    private ArrayList c;
    private ag d;
    private boolean e;
    private am f;
    private am g;
    private ab h;

    ad(ab ab1, View view, Object obj, ArrayList arraylist, ag ag1, boolean flag, am am, 
            am am1)
    {
        h = ab1;
        a = view;
        b = obj;
        c = arraylist;
        d = ag1;
        e = flag;
        f = am;
        g = am1;
        super();
    }

    public final boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (b != null)
        {
            b.a(b, c);
            c.clear();
            jk jk = ab.a(h, d, e, f);
            b.a(b, d.d, jk, c);
            ab.a(h, jk, d);
            ab.a(h, d, f, g, e, jk);
        }
        return true;
    }
}
