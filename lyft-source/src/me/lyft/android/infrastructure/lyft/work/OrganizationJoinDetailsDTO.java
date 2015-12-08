// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.work;


public class OrganizationJoinDetailsDTO
{

    public final String joinDescription;
    public final String joinHeader;

    public OrganizationJoinDetailsDTO(String s, String s1)
    {
        joinHeader = s;
        joinDescription = s1;
    }

    public String getJoinDescription()
    {
        return joinDescription;
    }

    public String getJoinHeader()
    {
        return joinHeader;
    }
}
