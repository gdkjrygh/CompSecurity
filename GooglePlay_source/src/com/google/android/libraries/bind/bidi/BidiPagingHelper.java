// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.bidi;

import android.support.v4.view.PagerAdapter;

// Referenced classes of package com.google.android.libraries.bind.bidi:
//            BidiAwarePagerAdapter

public final class BidiPagingHelper
{

    public static int getLogicalPosition(PagerAdapter pageradapter, int i)
    {
        int j = i;
        if (pageradapter instanceof BidiAwarePagerAdapter)
        {
            j = i;
            if (((BidiAwarePagerAdapter)pageradapter).isRtl())
            {
                j = swapPosition(pageradapter, i);
            }
        }
        return j;
    }

    public static int getVisualPosition(PagerAdapter pageradapter, int i)
    {
        int j = i;
        if (pageradapter instanceof BidiAwarePagerAdapter)
        {
            j = i;
            if (((BidiAwarePagerAdapter)pageradapter).isRtl())
            {
                j = swapPosition(pageradapter, i);
            }
        }
        return j;
    }

    private static int swapPosition(PagerAdapter pageradapter, int i)
    {
        if (i < 0)
        {
            return i;
        } else
        {
            return pageradapter.getCount() - 1 - i;
        }
    }
}
