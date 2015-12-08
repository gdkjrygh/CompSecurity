// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.work;


public class OrganizationUnverifiedDetailsDTO
{

    public final String unverifiedDescription;
    public final String unverifiedHeader;

    public OrganizationUnverifiedDetailsDTO(String s, String s1)
    {
        unverifiedHeader = s;
        unverifiedDescription = s1;
    }

    public String getUnverifiedDescription()
    {
        return unverifiedDescription;
    }

    public String getUnverifiedHeader()
    {
        return unverifiedHeader;
    }
}
