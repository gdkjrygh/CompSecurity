// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.nativecrashreporter;


public final class NativeCrashHandler
{

    private static final Object a = new Object();

    public NativeCrashHandler()
    {
    }

    private static native boolean nativeInstallSignalHandler(String s);

}
