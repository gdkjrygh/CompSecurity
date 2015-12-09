// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            ViewPager

static class youtParams
    implements Comparator
{

    public int a(View view, View view1)
    {
        view = (youtParams)view.getLayoutParams();
        view1 = (youtParams)view1.getLayoutParams();
        if (((youtParams) (view)).a != ((youtParams) (view1)).a)
        {
            return !((youtParams) (view)).a ? -1 : 1;
        } else
        {
            return ((youtParams) (view)).e - ((youtParams) (view1)).e;
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((View)obj, (View)obj1);
    }

    youtParams()
    {
    }
}
