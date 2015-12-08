// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.kd;
import com.google.android.gms.internal.kf;
import java.util.Date;

// Referenced classes of package com.google.android.gms.drive:
//            MetadataChangeSet

public static class leCustomProperties.a
{

    private final MetadataBundle Nu = MetadataBundle.io();
    private com.google.android.gms.drive.metadata.internal..a Nv;

    public MetadataChangeSet build()
    {
        if (Nv != null)
        {
            Nu.b(kd.PO, Nv.im());
        }
        return new MetadataChangeSet(Nu);
    }

    public Nu setDescription(String s)
    {
        Nu.b(kd.PP, s);
        return this;
    }

    public Bundle.b setIndexableText(String s)
    {
        Nu.b(kd.PU, s);
        return this;
    }

    public Bundle.b setLastViewedByMeDate(Date date)
    {
        Nu.b(kf.Qu, date);
        return this;
    }

    public Bundle.b setMimeType(String s)
    {
        Nu.b(kd.Qd, s);
        return this;
    }

    public Bundle.b setPinned(boolean flag)
    {
        Nu.b(kd.PY, Boolean.valueOf(flag));
        return this;
    }

    public Bundle.b setStarred(boolean flag)
    {
        Nu.b(kd.Qk, Boolean.valueOf(flag));
        return this;
    }

    public Bundle.b setTitle(String s)
    {
        Nu.b(kd.Qm, s);
        return this;
    }

    public Bundle.b setViewed(boolean flag)
    {
        Nu.b(kd.Qc, Boolean.valueOf(flag));
        return this;
    }

    public leCustomProperties.a()
    {
    }
}
