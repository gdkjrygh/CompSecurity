// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.pandora.android.data.a;

// Referenced classes of package com.pandora.android.activity:
//            HomeTabsActivity

public class f
{
    public static interface a
    {

        public abstract Bundle a(boolean flag);
    }

    public static interface b
    {

        public abstract com.pandora.android.data.a[] a(HomeTabsActivity hometabsactivity, boolean flag);
    }


    private static final com.pandora.android.data.a e[] = new com.pandora.android.data.a[0];
    public Fragment a;
    public final String b;
    public final String c;
    public final Class d;
    private final a f;
    private b g;

    public f(String s, String s1, Class class1, a a1, b b1)
    {
        b = s;
        c = s1;
        d = class1;
        f = a1;
        g = b1;
    }

    public Bundle a(boolean flag)
    {
        if (f == null)
        {
            return null;
        } else
        {
            return f.a(flag);
        }
    }

    public com.pandora.android.data.a[] a(HomeTabsActivity hometabsactivity, boolean flag)
    {
        com.pandora.android.data.a aa[];
        if (g == null)
        {
            hometabsactivity = null;
        } else
        {
            hometabsactivity = g.a(hometabsactivity, flag);
        }
        aa = hometabsactivity;
        if (hometabsactivity == null)
        {
            aa = e;
        }
        return aa;
    }

}
