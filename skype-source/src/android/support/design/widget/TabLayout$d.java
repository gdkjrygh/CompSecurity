// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//            TabLayout

public static final class a
    implements android.support.v4.view.out.d
{

    private final WeakReference a;
    private int b;
    private int c;

    public final void onPageScrollStateChanged(int i)
    {
        c = i;
    }

    public final void onPageScrolled(int i, float f, int j)
    {
        TabLayout tablayout = (TabLayout)a.get();
        if (tablayout != null)
        {
            if (b == -1 || TabLayout.n(tablayout) != (float)b)
            {
                tablayout.setScrollPosition(i, f, true);
            }
            if (c == 0 && b != -1)
            {
                tablayout.a(tablayout.a(b));
                b = -1;
            }
        }
    }

    public final void onPageSelected(int i)
    {
        b = i;
    }

    public (TabLayout tablayout)
    {
        b = -1;
        a = new WeakReference(tablayout);
    }
}
