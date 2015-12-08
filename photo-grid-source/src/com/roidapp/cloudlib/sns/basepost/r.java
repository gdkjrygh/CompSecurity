// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.support.v7.widget.bi;

final class r
{

    public bi a;
    public bi b;
    public int c;
    public int d;
    public int e;
    public int f;

    private r(bi bi, bi bi1)
    {
        a = bi;
        b = bi1;
    }

    private r(bi bi, bi bi1, int i, int j, int k, int l)
    {
        this(bi, bi1);
        c = i;
        d = j;
        e = k;
        f = l;
    }

    r(bi bi, bi bi1, int i, int j, int k, int l, byte byte0)
    {
        this(bi, bi1, i, j, k, l);
    }

    public final String toString()
    {
        return (new StringBuilder("ChangeInfo{oldHolder=")).append(a).append(", newHolder=").append(b).append(", fromX=").append(c).append(", fromY=").append(d).append(", toX=").append(e).append(", toY=").append(f).append('}').toString();
    }
}
