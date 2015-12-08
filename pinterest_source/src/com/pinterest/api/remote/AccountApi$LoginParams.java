// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;


public class p
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public boolean p;

    public final int a()
    {
        if (i != null)
        {
            return 2;
        }
        if (j != null)
        {
            return 4;
        }
        if (m != null || o != null)
        {
            return 3;
        }
        if (k != null || l != null)
        {
            return 5;
        }
        if (a != null)
        {
            return 0;
        }
        if (d != null)
        {
            return 7;
        }
        return c == null || e != null ? 1 : 8;
    }

    public ()
    {
        p = false;
    }
}
