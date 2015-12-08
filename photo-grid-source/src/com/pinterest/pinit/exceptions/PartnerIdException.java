// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.pinit.exceptions;


public class PartnerIdException extends RuntimeException
{

    public static final String MESSAGE = "partnerId cannot be null! Did you call setPartnerId?";

    public PartnerIdException()
    {
        super("partnerId cannot be null! Did you call setPartnerId?");
    }
}
