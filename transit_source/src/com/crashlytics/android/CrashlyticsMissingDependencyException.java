// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.net.URLEncoder;

public class CrashlyticsMissingDependencyException extends RuntimeException
{

    private static final long serialVersionUID = 0xf004ebc5c705cfa5L;

    CrashlyticsMissingDependencyException(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("\nSomething is missing! Find it here: \n");
        stringbuilder.append((new StringBuilder()).append(String.format("http://www.crashlytics.com/api/v1/%s/android/confirm/%s", new Object[] {
            URLEncoder.encode(s), URLEncoder.encode(s1)
        })).append("\n").toString());
        super(stringbuilder.toString());
    }
}
