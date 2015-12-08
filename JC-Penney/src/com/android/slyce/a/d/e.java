// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.d;

import java.util.Hashtable;

public class e
{

    private Hashtable a;

    public e()
    {
        a = new Hashtable();
    }

    public Object a(String s)
    {
        return a.get(s);
    }

    public void a(String s, Object obj)
    {
        a.put(s, obj);
    }
}
