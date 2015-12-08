// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator.android.osp;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package com.viewpagerindicator.android.osp:
//            ViewPager

static class I
    implements Comparator
{

    public int compare(View view, View view1)
    {
        view = (I)view.getLayoutParams();
        view1 = (I)view1.getLayoutParams();
        if (((I) (view)).I != ((I) (view1)).I)
        {
            return !((I) (view)).I ? -1 : 1;
        } else
        {
            return ((I) (view)).I - ((I) (view1)).I;
        }
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((View)obj, (View)obj1);
    }

    I()
    {
    }
}
