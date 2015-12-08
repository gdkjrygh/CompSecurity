// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

class this._cls0
    implements Comparator
{

    final CoordinatorLayout this$0;

    public int compare(View view, View view1)
    {
        if (view == view1)
        {
            return 0;
        }
        if (((youtParams)view.getLayoutParams()).dependsOn(CoordinatorLayout.this, view, view1))
        {
            return 1;
        }
        return !((youtParams)view1.getLayoutParams()).dependsOn(CoordinatorLayout.this, view1, view) ? 0 : -1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((View)obj, (View)obj1);
    }

    youtParams()
    {
        this$0 = CoordinatorLayout.this;
        super();
    }
}
