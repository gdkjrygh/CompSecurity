// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            ViewPager

static final class youtParams
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (View)obj;
        obj1 = (View)obj1;
        obj = (youtParams)((View) (obj)).getLayoutParams();
        obj1 = (youtParams)((View) (obj1)).getLayoutParams();
        if (((youtParams) (obj)).a != ((youtParams) (obj1)).a)
        {
            return !((youtParams) (obj)).a ? -1 : 1;
        } else
        {
            return ((youtParams) (obj)).e - ((youtParams) (obj1)).e;
        }
    }

    youtParams()
    {
    }
}
