// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

static class 
    implements Comparator
{

    public int compare(View view, View view1)
    {
        float f = ViewCompat.getZ(view);
        float f1 = ViewCompat.getZ(view1);
        if (f > f1)
        {
            return -1;
        }
        return f >= f1 ? 0 : 1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((View)obj, (View)obj1);
    }

    ()
    {
    }
}
