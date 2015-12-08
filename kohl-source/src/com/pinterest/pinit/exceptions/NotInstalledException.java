// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.pinit.exceptions;


public class NotInstalledException extends RuntimeException
{

    public static final String MESSAGE = "Pinterest for Android is not installed!";

    public NotInstalledException()
    {
        super("Pinterest for Android is not installed!");
    }
}
