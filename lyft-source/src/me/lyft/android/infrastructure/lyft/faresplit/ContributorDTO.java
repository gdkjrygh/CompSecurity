// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.faresplit;


// Referenced classes of package me.lyft.android.infrastructure.lyft.faresplit:
//            ContributorStatus

public class ContributorDTO
{

    public final String name;
    public final String phone;
    public final ContributorStatus status;

    public ContributorDTO(String s, String s1, ContributorStatus contributorstatus)
    {
        name = s;
        phone = s1;
        status = contributorstatus;
    }
}
