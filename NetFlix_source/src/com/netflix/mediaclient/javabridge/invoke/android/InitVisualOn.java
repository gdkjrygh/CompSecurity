// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.android;

import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;

public final class InitVisualOn extends BaseInvoke
{

    private static final String METHOD = "initVisualOn";
    private static final String TARGET = "android";
    private long ctxt;
    private long ptr;

    public InitVisualOn(long l, long l1)
    {
        super("android", "initVisualOn");
        ptr = l;
        ctxt = l1;
    }

    public long getCtxt()
    {
        return ctxt;
    }

    public long getPtr()
    {
        return ptr;
    }
}
