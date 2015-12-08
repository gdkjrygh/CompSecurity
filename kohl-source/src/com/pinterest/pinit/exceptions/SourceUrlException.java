// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.pinit.exceptions;


public class SourceUrlException extends RuntimeException
{

    public static final String MESSAGE = "url cannot be null! Did you call setUrl?";

    public SourceUrlException()
    {
        super("url cannot be null! Did you call setUrl?");
    }
}
