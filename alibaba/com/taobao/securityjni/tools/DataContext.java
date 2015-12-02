// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.securityjni.tools;


public class DataContext
{

    public int category;
    public byte extData[];
    public int index;
    public int type;

    public DataContext()
    {
        index = -1;
        extData = null;
        category = -1;
        type = -1;
    }

    public DataContext(int i, byte abyte0[])
    {
        index = i;
        extData = abyte0;
    }

    public DataContext(int i, byte abyte0[], int j, int k)
    {
        index = i;
        extData = abyte0;
        category = j;
        type = k;
    }
}
