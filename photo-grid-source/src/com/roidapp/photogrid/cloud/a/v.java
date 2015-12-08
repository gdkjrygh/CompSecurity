// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import com.roidapp.videolib.f;

final class v
{

    static final int a[];

    static 
    {
        a = new int[f.a().length];
        try
        {
            a[f.a - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[f.b - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[f.c - 1] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
