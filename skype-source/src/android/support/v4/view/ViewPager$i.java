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

    public final int compare(Object obj, Object obj1)
    {
        obj = (View)obj;
        obj1 = (View)obj1;
        obj = ()((View) (obj)).getLayoutParams();
        obj1 = ()((View) (obj1)).getLayoutParams();
        if ((() (obj)).a != ((a) (obj1)).a)
        {
            return !((a) (obj)).a ? -1 : 1;
        } else
        {
            return ((a) (obj)).e - ((e) (obj1)).e;
        }
    }

    ()
    {
    }
}
