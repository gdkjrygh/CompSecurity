// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.work;


public class ErrorsDTO
{

    public final String field;
    public final String reason;

    public ErrorsDTO(String s, String s1)
    {
        field = s;
        reason = s1;
    }

    public String getField()
    {
        return field;
    }

    public String getReason()
    {
        return reason;
    }
}
