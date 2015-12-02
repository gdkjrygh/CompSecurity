// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan;

import com.qihoo.security.engine.FileInfo;

public class QueryItem
{

    public FileInfo a;
    public int b;
    public long c;

    public QueryItem(FileInfo fileinfo, int i, long l)
    {
        a = fileinfo;
        b = i;
        c = l;
    }
}
