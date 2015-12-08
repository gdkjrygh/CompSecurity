// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;


// Referenced classes of package com.pinterest.activity.contacts:
//            InvitabilityContact

public final class <init>
    implements Comparable
{

    public final InvitabilityContact contact;
    public final double score;

    public final int compareTo(<init> <init>1)
    {
        double d = score - <init>1.score;
        if (d == 0.0D)
        {
            return 0;
        }
        return d <= 0.0D ? -1 : 1;
    }

    public final volatile int compareTo(Object obj)
    {
        return compareTo((compareTo)obj);
    }

    private (InvitabilityContact invitabilitycontact, double d)
    {
        contact = invitabilitycontact;
        score = d;
    }

    score(InvitabilityContact invitabilitycontact, double d, score score1)
    {
        this(invitabilitycontact, d);
    }
}
