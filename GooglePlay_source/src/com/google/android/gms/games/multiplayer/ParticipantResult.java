// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantResultCreator

public final class ParticipantResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ParticipantResultCreator();
    public final String mParticipantId;
    public final int mPlacing;
    public final int mResult;
    final int mVersionCode;

    public ParticipantResult(int i, String s, int j, int k)
    {
        mVersionCode = i;
        mParticipantId = (String)Preconditions.checkNotNull(s);
        j;
        JVM INSTR tableswitch 0 5: default 60
    //                   0 80
    //                   1 80
    //                   2 80
    //                   3 80
    //                   4 80
    //                   5 80;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        boolean flag = false;
_L4:
        Preconditions.checkState(flag);
        mResult = j;
        mPlacing = k;
        return;
_L2:
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public ParticipantResult(String s, int i, int j)
    {
        this(1, s, i, j);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ParticipantResultCreator.writeToParcel$56aede97(this, parcel);
    }

}
