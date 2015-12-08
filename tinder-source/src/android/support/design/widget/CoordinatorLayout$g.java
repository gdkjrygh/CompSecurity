// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.x;
import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

static final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (View)obj;
        obj1 = (View)obj1;
        float f = x.F(((View) (obj)));
        float f1 = x.F(((View) (obj1)));
        if (f > f1)
        {
            return -1;
        }
        return f >= f1 ? 0 : 1;
    }

    ()
    {
    }
}
