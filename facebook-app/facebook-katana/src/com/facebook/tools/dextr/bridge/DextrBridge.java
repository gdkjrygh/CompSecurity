// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge;

import java.util.concurrent.atomic.AtomicBoolean;

public class DextrBridge
{

    private static final AtomicBoolean a = new AtomicBoolean(false);

    public DextrBridge()
    {
    }

    public static boolean a()
    {
        return a.get();
    }

}
