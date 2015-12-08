// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.view.View;

class e
{

    private final int a;

    public e(View view, String s)
    {
        a = view.hashCode() ^ s.hashCode();
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof e)
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
}
