// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.Context;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.ir;
import com.google.android.gms.internal.it;
import java.util.Date;

// Referenced classes of package com.google.android.gms.drive:
//            MetadataChangeSet

public static class mContext
{

    private final MetadataBundle HT;
    private com.google.android.gms.drive.metadata.internal..a HU;
    private final Context mContext;

    public MetadataChangeSet build()
    {
        if (HU != null)
        {
            HT.b(ir.JS, HU.gy());
        }
        return new MetadataChangeSet(HT);
    }

    public HT setDescription(String s)
    {
        HT.b(ir.JT, s);
        return this;
    }

    public Bundle.b setIndexableText(String s)
    {
        HT.b(ir.JY, s);
        return this;
    }

    public Bundle.b setLastViewedByMeDate(Date date)
    {
        HT.b(it.Ku, date);
        return this;
    }

    public Bundle.b setMimeType(String s)
    {
        HT.b(ir.Kh, s);
        return this;
    }

    public Bundle.b setPinned(boolean flag)
    {
        HT.b(ir.Kc, Boolean.valueOf(flag));
        return this;
    }

    public Bundle.b setStarred(boolean flag)
    {
        HT.b(ir.Km, Boolean.valueOf(flag));
        return this;
    }

    public Bundle.b setTitle(String s)
    {
        HT.b(ir.Ko, s);
        return this;
    }

    public Bundle.b setViewed(boolean flag)
    {
        HT.b(ir.Kg, Boolean.valueOf(flag));
        return this;
    }

    public leCustomProperties.a()
    {
        this(null);
    }

    public <init>(Context context)
    {
        HT = MetadataBundle.gA();
        mContext = context;
    }
}
