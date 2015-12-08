// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.pinit.exceptions;


public class ImageException extends RuntimeException
{

    public static final String MESSAGE = "imageUrl and/or imageUri cannot be null! Did you call setImageUrl(String) or setImageUri(Uri)?";

    public ImageException()
    {
        super("imageUrl and/or imageUri cannot be null! Did you call setImageUrl(String) or setImageUri(Uri)?");
    }
}
