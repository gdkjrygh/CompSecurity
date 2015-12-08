// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Bundle;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games:
//            PlayerRef, Player

public final class PlayerBuffer extends AbstractDataBuffer
{

    public PlayerBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public final Player get(int i)
    {
        return new PlayerRef(mDataHolder, i);
    }

    public final volatile Object get(int i)
    {
        return get(i);
    }

    public final int getTotalPlayerCount()
    {
        int i = -1;
        Bundle bundle = getMetadata();
        if (bundle != null)
        {
            i = bundle.getInt("total_count", -1);
        }
        return i;
    }
}
