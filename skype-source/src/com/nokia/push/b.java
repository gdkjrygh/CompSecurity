// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nokia.push;

import android.util.Log;

final class b
{

    private final String a;
    private final String b;

    b(String s, String s1)
    {
        a = s;
        b = s1;
    }

    protected final transient void a(int i, String s, Object aobj[])
    {
        if (Log.isLoggable(a, i))
        {
            s = String.format(s, aobj);
            Log.println(i, a, (new StringBuilder()).append(b).append(s).toString());
        }
    }
}
