// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import com.fitbit.data.domain.s;
import com.fitbit.e.a;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.domain.challenges:
//            Challenge

public static final class serializableName extends Enum
    implements s
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN ACTIVE;
    public static final UNKNOWN COMPLETE;
    public static final UNKNOWN INVITED;
    public static final UNKNOWN UNKNOWN;
    private final String serializableName;

    public static serializableName getSafeChallengeStatusFromString(String s1)
    {
        serializableName serializablename = UNKNOWN;
        try
        {
            s1 = (UNKNOWN)w.a(s1, com/fitbit/data/domain/challenges/Challenge$ChallengeStatus);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a.e("Challenge", a.a(s1), new Object[0]);
            return serializablename;
        }
        return s1;
    }

    public static UNKNOWN valueOf(String s1)
    {
        return (UNKNOWN)Enum.valueOf(com/fitbit/data/domain/challenges/Challenge$ChallengeStatus, s1);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    static 
    {
        ACTIVE = new <init>("ACTIVE", 0, "ACTIVE");
        INVITED = new <init>("INVITED", 1, "INVITED");
        COMPLETE = new <init>("COMPLETE", 2, "COMPLETE");
        UNKNOWN = new <init>("UNKNOWN", 3, "UNKNOWN");
        $VALUES = (new .VALUES[] {
            ACTIVE, INVITED, COMPLETE, UNKNOWN
        });
    }

    private A(String s1, int i, String s2)
    {
        super(s1, i);
        serializableName = s2;
    }
}
