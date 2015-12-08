// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;


// Referenced classes of package com.google.android.m4b.maps.bv:
//            ah

static final class <init>
{

    b a;
    b b;
    b c;

    final void a(int i, int j, int k, Object obj)
    {
        <init> <init>1 = a;
        if (<init>1 != null)
        {
            a = <init>1.a;
            <init>1.a = null;
        } else
        {
            <init>1 = new <init>();
        }
        <init>1.b = i;
        <init>1.c = j;
        <init>1.d = k;
        <init>1.e = obj;
        if (c == null)
        {
            c = <init>1;
            b = <init>1;
            return;
        } else
        {
            c.a = <init>1;
            c = <init>1;
            return;
        }
    }

    final boolean a()
    {
        return b == null;
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
