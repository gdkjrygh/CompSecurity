// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            ViewPager

static class 
    implements Comparator
{

    public int a(View view, View view1)
    {
        view = ()view.getLayoutParams();
        view1 = ()view1.getLayoutParams();
        if ((() (view)).a != ((a) (view1)).a)
        {
            return !((a) (view)).a ? -1 : 1;
        } else
        {
            return ((a) (view)).e - ((e) (view1)).e;
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((View)obj, (View)obj1);
    }

    ()
    {
    }
}
