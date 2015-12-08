// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.ndk;

import android.content.res.AssetManager;
import ant;

public class JniNativeApi
    implements ant
{

    public JniNativeApi()
    {
    }

    private native boolean nativeInit(String s, Object obj);

    public final boolean a(String s, AssetManager assetmanager)
    {
        return nativeInit(s, assetmanager);
    }

    static 
    {
        System.loadLibrary("crashlytics");
    }
}
