// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//            PagerTitleStrip, ViewPager, p

private class <init> extends DataSetObserver
    implements <init>, <init>
{

    final PagerTitleStrip a;
    private int b;

    public void a(int i, float f, int j)
    {
        j = i;
        if (f > 0.5F)
        {
            j = i + 1;
        }
        a.a(j, f, false);
    }

    public void a(p p, p p1)
    {
        a.a(p, p1);
    }

    public void a_(int i)
    {
        float f = 0.0F;
        if (b == 0)
        {
            a.a(a.a.getCurrentItem(), a.a.getAdapter());
            if (PagerTitleStrip.a(a) >= 0.0F)
            {
                f = PagerTitleStrip.a(a);
            }
            a.a(a.a.getCurrentItem(), f, true);
        }
    }

    public void b_(int i)
    {
        b = i;
    }

    public void onChanged()
    {
        float f = 0.0F;
        a.a(a.a.getCurrentItem(), a.a.getAdapter());
        if (PagerTitleStrip.a(a) >= 0.0F)
        {
            f = PagerTitleStrip.a(a);
        }
        a.a(a.a.getCurrentItem(), f, true);
    }

    private (PagerTitleStrip pagertitlestrip)
    {
        a = pagertitlestrip;
        super();
    }

    a(PagerTitleStrip pagertitlestrip, a a1)
    {
        this(pagertitlestrip);
    }
}
