// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.view.ViewPager;
import android.view.View;
import com.google.android.apps.moviemaker.ui.ScrollingTabLayout;

public final class daj
    implements android.view.View.OnClickListener
{

    private ScrollingTabLayout a;

    public daj(ScrollingTabLayout scrollingtablayout)
    {
        a = scrollingtablayout;
        super();
    }

    public final void onClick(View view)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < ScrollingTabLayout.a(a).getChildCount())
                {
                    if (view != ScrollingTabLayout.a(a).getChildAt(i))
                    {
                        break label0;
                    }
                    ScrollingTabLayout.b(a).a(i);
                }
                return;
            }
            i++;
        } while (true);
    }
}
