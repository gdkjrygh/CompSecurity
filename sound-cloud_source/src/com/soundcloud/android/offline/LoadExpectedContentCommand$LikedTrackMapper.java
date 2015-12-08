// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.ResultMapper;

// Referenced classes of package com.soundcloud.android.offline:
//            LoadExpectedContentCommand

private static class <init>
    implements ResultMapper
{

    private final boolean hasSyncableTracks;

    public a map(CursorReader cursorreader)
    {
        long l = cursorreader.getLong("_id");
        long l1 = cursorreader.getLong("user_id");
        long l2 = cursorreader.getLong("duration");
        String s = cursorreader.getString("waveform_url");
        boolean flag1 = cursorreader.getBoolean("syncable");
        boolean flag;
        if (cursorreader.getBoolean("syncable") || !hasSyncableTracks)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new a(l, l1, l2, s, flag1, flag);
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private a(boolean flag)
    {
        hasSyncableTracks = flag;
    }

    hasSyncableTracks(boolean flag, hasSyncableTracks hassyncabletracks)
    {
        this(flag);
    }
}
