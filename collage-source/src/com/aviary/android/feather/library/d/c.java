// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.d;


public class c
{

    String a;
    String b;
    Object c;

    public c()
    {
    }

    public c(Object obj)
    {
        c = obj;
    }

    public Object a()
    {
        return c;
    }

    public void a(Object obj)
    {
        c = obj;
    }

    public void a(String s)
    {
        b = s;
    }

    public void b(String s)
    {
        a = s;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ToolActionVO{");
        if (c != null)
        {
            stringbuilder.append((new StringBuilder()).append("value:").append(c).toString());
        }
        if (b != null)
        {
            if (c != null)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append("pack:").append(b).toString());
            stringbuilder.append((new StringBuilder()).append(", content:").append(a).toString());
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
