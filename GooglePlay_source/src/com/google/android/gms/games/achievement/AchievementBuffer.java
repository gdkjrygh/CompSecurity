// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.achievement;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.achievement:
//            AchievementRef, Achievement

public final class AchievementBuffer extends AbstractDataBuffer
{

    public AchievementBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public final Achievement get(int i)
    {
        return new AchievementRef(mDataHolder, i);
    }

    public final volatile Object get(int i)
    {
        return get(i);
    }
}
