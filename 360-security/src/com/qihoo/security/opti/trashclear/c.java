// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear;


public class c
    implements Cloneable
{

    public int a;
    public int b;

    public c()
    {
        b = 100;
    }

    public Object clone()
    {
        c c1;
        try
        {
            c1 = (c)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return c1;
    }

    public String toString()
    {
        return "";
    }
}
