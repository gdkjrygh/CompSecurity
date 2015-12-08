// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import java.io.PrintStream;

public final class SdkVersion
{

    public SdkVersion()
    {
    }

    public static String get()
    {
        return "1.6.3";
    }

    public static void main(String args[])
    {
        System.out.println((new StringBuilder("Dropbox Java SDK, Version ")).append(get()).toString());
    }
}
