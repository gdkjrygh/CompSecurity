// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.DataBuffer;

// Referenced classes of package com.google.android.gms.games.quest:
//            MilestoneRef, Milestone

public final class MilestoneBuffer extends DataBuffer
{

    public Milestone get(int i)
    {
        return new MilestoneRef(DG, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
