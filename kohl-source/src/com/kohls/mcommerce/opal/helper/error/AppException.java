// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.error;


public class AppException extends Exception
{

    private static final String PREFIX = "KOHLS_PHONE_EXCEPTION: ";
    private static final long serialVersionUID = 0x6541be81dde7ae23L;

    public AppException(String s)
    {
        super((new StringBuilder()).append("KOHLS_PHONE_EXCEPTION: ").append(s).toString());
    }
}
