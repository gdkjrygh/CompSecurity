// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import com.roidapp.cloudlib.sns.b.b;

final class ab
{

    static final int a[];

    static 
    {
        a = new int[b.a().length];
        try
        {
            a[b.a - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[b.b - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[b.c - 1] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
