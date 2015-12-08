// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.sync.SyncResult;
import rx.b.f;

final class 
    implements f
{

    public final Boolean call(SyncResult syncresult)
    {
        String s;
        byte byte0;
        s = syncresult.getAction();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 36
    //                   1119517830: 79
    //                   1968822650: 65;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_79;
_L4:
        switch (byte0)
        {
        default:
            return Boolean.valueOf(false);

        case 0: // '\0'
        case 1: // '\001'
            return Boolean.valueOf(syncresult.wasChanged());
        }
_L3:
        if (s.equals("syncStations"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("syncPlaylists"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public final volatile Object call(Object obj)
    {
        return call((SyncResult)obj);
    }

    ()
    {
    }
}
