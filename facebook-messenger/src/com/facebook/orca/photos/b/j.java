// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;


public class j extends Exception
{

    public static final j a = new j();

    private j()
    {
        super("Message send failed due to photo upload failure. One or more photos didn't upload.");
    }

}
