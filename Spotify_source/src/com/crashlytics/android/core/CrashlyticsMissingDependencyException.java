// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;


public class CrashlyticsMissingDependencyException extends RuntimeException
{

    private static final long serialVersionUID = 0xf004ebc5c705cfa5L;

    public CrashlyticsMissingDependencyException(String s)
    {
        super((new StringBuilder("\n")).append(s).append("\n").toString());
    }
}
