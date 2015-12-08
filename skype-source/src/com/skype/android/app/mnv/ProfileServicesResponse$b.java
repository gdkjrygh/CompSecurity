// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.skype.android.app.mnv:
//            ProfileServicesResponse

static final class state extends Enum
{

    private static final getState $VALUES[];
    public static final getState UN_VERIFIED;
    public static final getState VERIFICATION_PENDING;
    public static final getState VERIFIED;
    private static final Map lookup;
    private final String state;

    public static state get(String s)
    {
        return (state)lookup.get(s);
    }

    public static lookup valueOf(String s)
    {
        return (lookup)Enum.valueOf(com/skype/android/app/mnv/ProfileServicesResponse$b, s);
    }

    public static lookup[] values()
    {
        return (lookup[])$VALUES.clone();
    }

    public final String getState()
    {
        return state;
    }

    public final String toString()
    {
        return state;
    }

    static 
    {
        VERIFIED = new <init>("VERIFIED", 0, "Verified");
        UN_VERIFIED = new <init>("UN_VERIFIED", 1, "Unverified");
        VERIFICATION_PENDING = new <init>("VERIFICATION_PENDING", 2, "VerificationPending");
        $VALUES = (new .VALUES[] {
            VERIFIED, UN_VERIFIED, VERIFICATION_PENDING
        });
        lookup = new HashMap();
        state astate[] = values();
        int j = astate.length;
        for (int i = 0; i < j; i++)
        {
            state state1 = astate[i];
            lookup.put(state1.getState(), state1);
        }

    }

    private _cls9(String s, int i, String s1)
    {
        super(s, i);
        state = s1;
    }
}
