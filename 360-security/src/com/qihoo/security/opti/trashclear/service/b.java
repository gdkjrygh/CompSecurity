// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.service;

import com.qihoo360.common.utils.Utils;

public class b
{

    public String a;
    public long b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public long j;
    public long k;

    public b()
    {
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("FileInfo [desc=");
        stringbuilder.append(a);
        stringbuilder.append(", length=");
        stringbuilder.append(Utils.getHumanReadableSizeMore(b));
        stringbuilder.append(", num=");
        stringbuilder.append(c);
        stringbuilder.append(", checkedLength=");
        stringbuilder.append(Utils.getHumanReadableSizeMore(d));
        stringbuilder.append(", checkedNum=");
        stringbuilder.append(e);
        stringbuilder.append(", hasMediaFile=");
        stringbuilder.append(f);
        stringbuilder.append(", fileType=");
        stringbuilder.append(g);
        stringbuilder.append(", argInt1=");
        stringbuilder.append(h);
        stringbuilder.append(", argInt2=");
        stringbuilder.append(i);
        stringbuilder.append(", argLong1=");
        stringbuilder.append(Utils.getHumanReadableSizeMore(j));
        stringbuilder.append(", argLong2=");
        stringbuilder.append(Utils.getHumanReadableSizeMore(k));
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
