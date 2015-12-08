// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.Context;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.iq;
import com.google.android.gms.internal.is;
import java.util.Date;

// Referenced classes of package com.google.android.gms.drive:
//            MetadataChangeSet

public static class mContext
{

    private final MetadataBundle HW;
    private com.google.android.gms.drive.metadata.internal..a HX;
    private final Context mContext;

    public MetadataChangeSet build()
    {
        if (HX != null)
        {
            HW.b(iq.JV, HX.gD());
        }
        return new MetadataChangeSet(HW);
    }

    public HW setDescription(String s)
    {
        HW.b(iq.JW, s);
        return this;
    }

    public Bundle.b setIndexableText(String s)
    {
        HW.b(iq.Kb, s);
        return this;
    }

    public Bundle.b setLastViewedByMeDate(Date date)
    {
        HW.b(is.Kx, date);
        return this;
    }

    public Bundle.b setMimeType(String s)
    {
        HW.b(iq.Kk, s);
        return this;
    }

    public Bundle.b setPinned(boolean flag)
    {
        HW.b(iq.Kf, Boolean.valueOf(flag));
        return this;
    }

    public Bundle.b setStarred(boolean flag)
    {
        HW.b(iq.Kp, Boolean.valueOf(flag));
        return this;
    }

    public Bundle.b setTitle(String s)
    {
        HW.b(iq.Kr, s);
        return this;
    }

    public Bundle.b setViewed(boolean flag)
    {
        HW.b(iq.Kj, Boolean.valueOf(flag));
        return this;
    }

    public leCustomProperties.a()
    {
        this(null);
    }

    public <init>(Context context)
    {
        HW = MetadataBundle.gF();
        mContext = context;
    }
}
