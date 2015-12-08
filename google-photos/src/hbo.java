// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.View;

public final class hbo
{

    public final hbp a;
    public final long b;
    public final Rect c;
    public afn d;
    public final Rect e = new Rect();
    public hbo f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;

    public hbo(hbp hbp, long l, afn afn, Rect rect)
    {
        a = hbp;
        b = l;
        d = afn;
        c = rect;
        e.set(rect);
    }

    public static void b(View view, View view1)
    {
        if (view1 != null)
        {
            view1.setAlpha(1.0F);
        }
        view.setScaleX(1.0F);
        view.setScaleY(1.0F);
        view.setTranslationX(0.0F);
        view.setTranslationY(0.0F);
    }

    public final void a(View view, View view1)
    {
        if (view1 != null)
        {
            view1.setAlpha(g);
        }
        view.setScaleX(h);
        view.setScaleY(i);
        view.setTranslationX(j);
        view.setTranslationY(k);
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(c);
        String s2 = String.valueOf(e);
        return (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append("{").append(s1).append("->").append(s2).append("}").toString();
    }
}
