// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            df

class dm
    implements Comparator
{

    dm()
    {
    }

    public int a(View view, View view1)
    {
        view = (df)view.getLayoutParams();
        view1 = (df)view1.getLayoutParams();
        if (((df) (view)).a != ((df) (view1)).a)
        {
            return !((df) (view)).a ? -1 : 1;
        } else
        {
            return ((df) (view)).e - ((df) (view1)).e;
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((View)obj, (View)obj1);
    }
}
