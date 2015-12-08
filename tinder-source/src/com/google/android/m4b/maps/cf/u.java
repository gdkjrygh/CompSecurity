// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;


// Referenced classes of package com.google.android.m4b.maps.cf:
//            g

public class u
{

    int a;
    private boolean b;

    protected u()
    {
        b = false;
        a = 0;
    }

    protected boolean a(g g, f.a a1)
    {
        while (a1.d == b && !a1.e || !a1.d && !a1.e && a != 0) 
        {
            return false;
        }
        b = a1.d;
        return true;
    }
}
