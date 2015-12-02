// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.errorreporting;

import com.facebook.acra.DexVerifyBridge;
import com.facebook.acra.ErrorReporter;
import com.facebook.common.dextricks.DexLibLoader;

public class AcraDexLibLoaderBridge
    implements DexVerifyBridge
{

    public AcraDexLibLoaderBridge()
    {
    }

    public static void a()
    {
        ErrorReporter.getInstance().setDexVerifyBridge(new AcraDexLibLoaderBridge());
    }

    public RuntimeException verifyDexes()
    {
        return DexLibLoader.a();
    }
}
