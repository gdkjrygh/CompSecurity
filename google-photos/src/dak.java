// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.moviemaker.ui.ScrollingTabLayout;

public final class dak
    implements np
{

    private int a;
    private ScrollingTabLayout b;

    public dak(ScrollingTabLayout scrollingtablayout)
    {
        b = scrollingtablayout;
        super();
    }

    public final void a(int i, float f, int j)
    {
        if (i >= 0 && i < ScrollingTabLayout.a(b).getChildCount())
        {
            ScrollingTabLayout.a(b).a(i, f);
            int k = (int)((float)ScrollingTabLayout.a(b).getChildAt(i).getWidth() * f);
            ScrollingTabLayout.a(b, i, k);
            if (ScrollingTabLayout.c(b) != null)
            {
                ScrollingTabLayout.c(b).a(i, f, j);
            }
        }
    }

    public final void b(int i)
    {
        a = i;
        if (ScrollingTabLayout.c(b) != null)
        {
            ScrollingTabLayout.c(b).b(i);
        }
    }

    public final void c_(int i)
    {
        if (i >= 0 && i < ScrollingTabLayout.a(b).getChildCount())
        {
            if (a == 0)
            {
                ScrollingTabLayout.a(b).a(i, 0.0F);
                ScrollingTabLayout.a(b, i, 0);
            }
            if (ScrollingTabLayout.c(b) != null)
            {
                ScrollingTabLayout.c(b).c_(i);
            }
        }
    }
}
