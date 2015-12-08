// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import com.fitbit.data.domain.s;

// Referenced classes of package com.fitbit.data.domain.challenges:
//            ChallengeUser

public static final class serializableName extends Enum
    implements s
{

    private static final DECLINED $VALUES[];
    public static final DECLINED DECLINED;
    public static final DECLINED INVITED;
    public static final DECLINED PARTICIPANT;
    public static final DECLINED QUITTER;
    private final String serializableName;

    public static serializableName valueOf(String s1)
    {
        return (serializableName)Enum.valueOf(com/fitbit/data/domain/challenges/ChallengeUser$ChallengeParticipationType, s1);
    }

    public static serializableName[] values()
    {
        return (serializableName[])$VALUES.clone();
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    static 
    {
        PARTICIPANT = new <init>("PARTICIPANT", 0, "PARTICIPANT");
        INVITED = new <init>("INVITED", 1, "INVITED");
        QUITTER = new <init>("QUITTER", 2, "QUITTER");
        DECLINED = new <init>("DECLINED", 3, "DECLINED");
        $VALUES = (new .VALUES[] {
            PARTICIPANT, INVITED, QUITTER, DECLINED
        });
    }

    private (String s1, int i, String s2)
    {
        super(s1, i);
        serializableName = s2;
    }
}
