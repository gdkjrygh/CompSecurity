// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.experience:
//            ExperienceEventRef, ExperienceEvent

public final class ExperienceEventBuffer extends DataBuffer
{

    public ExperienceEventBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public ExperienceEvent cn(int i)
    {
        return new ExperienceEventRef(DG, i);
    }

    public Object get(int i)
    {
        return cn(i);
    }
}
