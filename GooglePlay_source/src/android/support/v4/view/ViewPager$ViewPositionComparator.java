// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            ViewPager

static final class 
    implements Comparator
{

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (View)obj;
        obj1 = (View)obj1;
        obj = ()((View) (obj)).getLayoutParams();
        obj1 = ()((View) (obj1)).getLayoutParams();
        if ((() (obj)). != (() (obj1)).)
        {
            return !(() (obj)). ? -1 : 1;
        } else
        {
            return (() (obj)). - (() (obj1)).;
        }
    }

    ()
    {
    }
}
