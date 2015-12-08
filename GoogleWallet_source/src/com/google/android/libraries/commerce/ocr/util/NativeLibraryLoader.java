// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.util;


public final class NativeLibraryLoader
{

    private static boolean shouldLoadLibrary = true;

    public static void loadOcrClientLibrary()
    {
        if (shouldLoadLibrary)
        {
            System.loadLibrary("google-ocrclient");
        }
    }

}
