// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.DataBuffer;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantRef, Participant

public final class ParticipantBuffer extends DataBuffer
{

    public Participant get(int i)
    {
        return new ParticipantRef(DG, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
