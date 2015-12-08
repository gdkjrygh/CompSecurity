// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.util.SparseArray;
import com.flurry.android.tumblr.Post;

public class lx
{

    private static lx b = null;
    private SparseArray a;

    private lx()
    {
        a = new SparseArray();
    }

    public static lx a()
    {
        if (b == null)
        {
            b = new lx();
        }
        return b;
    }

    public void a(int i)
    {
        a.remove(i);
    }

    public void a(int i, Post post)
    {
        a.append(i, post);
    }

}
