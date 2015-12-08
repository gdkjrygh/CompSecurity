// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.view.View;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            b

private static class a
{

    private final int a;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof a)
        {
            flag = flag1;
            if (a == obj.hashCode())
            {
                flag = true;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return a;
    }

    public (View view, String s)
    {
        a = view.hashCode() ^ s.hashCode();
    }
}
