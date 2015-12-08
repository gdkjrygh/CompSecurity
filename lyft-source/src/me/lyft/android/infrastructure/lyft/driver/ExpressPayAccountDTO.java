// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.driver;


public class ExpressPayAccountDTO
{

    public final boolean failed;
    public final String failedMessage;
    public final String id;
    public final String lastFour;
    public final String successMessage;
    public final String type;

    public ExpressPayAccountDTO(String s, String s1, String s2, String s3, boolean flag, String s4)
    {
        id = s;
        lastFour = s1;
        type = s2;
        successMessage = s3;
        failed = flag;
        failedMessage = s4;
    }
}
