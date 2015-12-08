// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import aU;
import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//            PagerTitleStrip, ViewPager

final class <init> extends DataSetObserver
    implements <init>, <init>
{

    private int a;
    private PagerTitleStrip b;

    public final void a(int i)
    {
        float f = 0.0F;
        if (a == 0)
        {
            b.a(b.a.mCurItem, b.a.mAdapter);
            if (PagerTitleStrip.a(b) >= 0.0F)
            {
                f = PagerTitleStrip.a(b);
            }
            b.a(b.a.mCurItem, f, true);
        }
    }

    public final void a(int i, float f, int j)
    {
        j = i;
        if (f > 0.5F)
        {
            j = i + 1;
        }
        b.a(j, f, false);
    }

    public final void a(aU au, aU au1)
    {
        b.a(au, au1);
    }

    public final void b(int i)
    {
        a = i;
    }

    public final void onChanged()
    {
        float f = 0.0F;
        b.a(b.a.mCurItem, b.a.mAdapter);
        if (PagerTitleStrip.a(b) >= 0.0F)
        {
            f = PagerTitleStrip.a(b);
        }
        b.a(b.a.mCurItem, f, true);
    }

    private (PagerTitleStrip pagertitlestrip)
    {
        b = pagertitlestrip;
        super();
    }

    b(PagerTitleStrip pagertitlestrip, byte byte0)
    {
        this(pagertitlestrip);
    }
}
