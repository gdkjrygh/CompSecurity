// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.gs;
import com.google.android.gms.internal.gt;
import java.util.Date;

// Referenced classes of package com.google.android.gms.drive:
//            MetadataChangeSet

public static class Bundle
{

    private final MetadataBundle EP = MetadataBundle.fT();

    public MetadataChangeSet build()
    {
        return new MetadataChangeSet(EP, null);
    }

    public Bundle setDescription(String s)
    {
        EP.b(gs.FT, s);
        return this;
    }

    public Bundle.b setIndexableText(String s)
    {
        EP.b(gs.FY, s);
        return this;
    }

    public Bundle.b setLastViewedByMeDate(Date date)
    {
        EP.b(gt.Gt, date);
        return this;
    }

    public Bundle.b setMimeType(String s)
    {
        EP.b(gs.Gh, s);
        return this;
    }

    public Bundle.b setPinned(boolean flag)
    {
        EP.b(gs.Gc, Boolean.valueOf(flag));
        return this;
    }

    public Bundle.b setStarred(boolean flag)
    {
        EP.b(gs.Gm, Boolean.valueOf(flag));
        return this;
    }

    public Bundle.b setTitle(String s)
    {
        EP.b(gs.Go, s);
        return this;
    }

    public Bundle.b setViewed(boolean flag)
    {
        EP.b(gs.Gg, Boolean.valueOf(flag));
        return this;
    }

    public Bundle()
    {
    }
}
