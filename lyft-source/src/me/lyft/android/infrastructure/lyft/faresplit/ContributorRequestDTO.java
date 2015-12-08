// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.faresplit;


// Referenced classes of package me.lyft.android.infrastructure.lyft.faresplit:
//            ContributorStatus

public class ContributorRequestDTO
{

    public final String id;
    public final String initiatorName;
    public final String initiatorPhoto;
    public final ContributorStatus status;

    private ContributorRequestDTO(String s, String s1, String s2, ContributorStatus contributorstatus)
    {
        id = s;
        initiatorName = s1;
        initiatorPhoto = s2;
        status = contributorstatus;
    }
}
