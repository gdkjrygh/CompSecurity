// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.faresplit;


public final class ContributorStatus extends Enum
{

    private static final ContributorStatus $VALUES[];
    public static final ContributorStatus ACCEPTED;
    public static final ContributorStatus DECLINED;
    public static final ContributorStatus INELIGIBLE;
    public static final ContributorStatus PENDING;

    private ContributorStatus(String s, int i)
    {
        super(s, i);
    }

    public static ContributorStatus valueOf(String s)
    {
        return (ContributorStatus)Enum.valueOf(me/lyft/android/infrastructure/lyft/faresplit/ContributorStatus, s);
    }

    public static ContributorStatus[] values()
    {
        return (ContributorStatus[])$VALUES.clone();
    }

    static 
    {
        PENDING = new ContributorStatus("PENDING", 0);
        ACCEPTED = new ContributorStatus("ACCEPTED", 1);
        DECLINED = new ContributorStatus("DECLINED", 2);
        INELIGIBLE = new ContributorStatus("INELIGIBLE", 3);
        $VALUES = (new ContributorStatus[] {
            PENDING, ACCEPTED, DECLINED, INELIGIBLE
        });
    }
}
