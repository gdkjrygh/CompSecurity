// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

final class a
    implements Comparator
{

    final CoordinatorLayout a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (View)obj;
        obj1 = (View)obj1;
        if (obj != obj1)
        {
            if (((a)((View) (obj)).getLayoutParams()).a(((View) (obj1))))
            {
                return 1;
            }
            if (((a)((View) (obj1)).getLayoutParams()).a(((View) (obj))))
            {
                return -1;
            }
        }
        return 0;
    }

    (CoordinatorLayout coordinatorlayout)
    {
        a = coordinatorlayout;
        super();
    }
}
