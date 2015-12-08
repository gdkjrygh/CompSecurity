// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueItem

private static class aData extends PlayQueueItem
{

    public aData getKind()
    {
        return MPTY;
    }

    public boolean shouldPersist()
    {
        return false;
    }

    public _cls9()
    {
        super.setMetaData(PropertySet.create());
    }
}
