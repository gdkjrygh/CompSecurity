// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.surface;

import com.qihoo.security.clearengine.TrashType;

public class b
{

    public long a;
    public long b;
    public TrashType c;

    public b(TrashType trashtype)
    {
        c = trashtype;
    }

    public b a()
    {
        b b1 = new b(c);
        b1.a = a;
        b1.b = b;
        return b1;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return a();
    }

    public String toString()
    {
        return (new StringBuilder("TrashCatgoryInfo [ type = ")).append(c).append("selectSize = ").append(a).append(" totalSize  = ").append(b).append("}").toString();
    }
}
