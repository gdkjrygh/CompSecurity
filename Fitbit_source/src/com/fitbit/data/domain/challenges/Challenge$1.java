// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import android.os.Parcel;
import java.util.Map;

// Referenced classes of package com.fitbit.data.domain.challenges:
//            Challenge, g, ChallengeUser, ChallengeMessage, 
//            Achievement

static final class sage
    implements android.os.reator
{

    public Challenge a(Parcel parcel)
    {
        Challenge challenge = new Challenge();
        Challenge.a(challenge, parcel.readString());
        Challenge.b(challenge, parcel.readString());
        Challenge.a(challenge, (allengeStatus)g.a(parcel, com/fitbit/data/domain/challenges/Challenge$ChallengeStatus));
        Challenge.a(challenge, g.c(parcel));
        Challenge.a(challenge, parcel.createTypedArrayList(ChallengeUser.CREATOR));
        Challenge.b(challenge, parcel.createTypedArrayList(ChallengeMessage.CREATOR));
        Challenge.a(challenge, g.b(parcel));
        Challenge.b(challenge, g.b(parcel));
        Challenge.c(challenge, parcel.readString());
        Challenge.d(challenge, parcel.readString());
        Challenge.e(challenge, parcel.readString());
        Challenge.f(challenge, parcel.readString());
        Challenge.g(challenge, parcel.readString());
        Challenge.h(challenge, parcel.readString());
        Challenge.i(challenge, parcel.readString());
        Challenge.j(challenge, parcel.readString());
        Challenge.k(challenge, parcel.readString());
        Challenge.a(challenge, g.a(parcel));
        Challenge.b(challenge, g.a(parcel));
        Challenge.c(challenge, g.a(parcel));
        Challenge.d(challenge, g.a(parcel));
        Challenge.e(challenge, g.a(parcel));
        Challenge.f(challenge, g.a(parcel));
        Challenge.g(challenge, g.a(parcel));
        Challenge.a(challenge, (Achievement)parcel.readParcelable(com/fitbit/data/domain/challenges/Achievement.getClassLoader()));
        String as[] = parcel.createStringArray();
        parcel = parcel.createStringArray();
        int i = 0;
        for (int j = as.length; i < j; i++)
        {
            Challenge.a(challenge).put(as[i], parcel[i]);
        }

        return challenge;
    }

    public Challenge[] a(int i)
    {
        return new Challenge[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    sage()
    {
    }
}
