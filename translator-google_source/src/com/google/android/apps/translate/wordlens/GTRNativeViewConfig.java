// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.wordlens;

import com.google.android.libraries.wordlens.WordLensSystem;
import com.google.android.libraries.wordlens.util.g;

public class GTRNativeViewConfig
{

    public GTRNativeViewConfig()
    {
    }

    private native int getViewOrientationNative();

    private native void setDrawOCRResultsNative(boolean flag);

    public static native void setIsAppWindowAutoRotate(boolean flag);

    public final void a(int i)
    {
        g.a(i);
        synchronized (WordLensSystem.c())
        {
            setViewOrientationNative(i);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public native void setViewOrientationNative(int i);
}
