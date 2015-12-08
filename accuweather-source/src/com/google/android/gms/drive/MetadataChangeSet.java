// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.Context;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.ir;
import com.google.android.gms.internal.it;
import java.util.Date;

public final class MetadataChangeSet
{
    public static class Builder
    {

        private final MetadataBundle HT;
        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.a HU;
        private final Context mContext;

        public MetadataChangeSet build()
        {
            if (HU != null)
            {
                HT.b(ir.JS, HU.gy());
            }
            return new MetadataChangeSet(HT);
        }

        public Builder setDescription(String s)
        {
            HT.b(ir.JT, s);
            return this;
        }

        public Builder setIndexableText(String s)
        {
            HT.b(ir.JY, s);
            return this;
        }

        public Builder setLastViewedByMeDate(Date date)
        {
            HT.b(it.Ku, date);
            return this;
        }

        public Builder setMimeType(String s)
        {
            HT.b(ir.Kh, s);
            return this;
        }

        public Builder setPinned(boolean flag)
        {
            HT.b(ir.Kc, Boolean.valueOf(flag));
            return this;
        }

        public Builder setStarred(boolean flag)
        {
            HT.b(ir.Km, Boolean.valueOf(flag));
            return this;
        }

        public Builder setTitle(String s)
        {
            HT.b(ir.Ko, s);
            return this;
        }

        public Builder setViewed(boolean flag)
        {
            HT.b(ir.Kg, Boolean.valueOf(flag));
            return this;
        }

        public Builder()
        {
            this(null);
        }

        public Builder(Context context)
        {
            HT = MetadataBundle.gA();
            mContext = context;
        }
    }


    public static final MetadataChangeSet HS = new MetadataChangeSet(MetadataBundle.gA());
    private final MetadataBundle HT;

    public MetadataChangeSet(MetadataBundle metadatabundle)
    {
        HT = MetadataBundle.a(metadatabundle);
    }

    public String getDescription()
    {
        return (String)HT.a(ir.JT);
    }

    public String getIndexableText()
    {
        return (String)HT.a(ir.JY);
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)HT.a(it.Ku);
    }

    public String getMimeType()
    {
        return (String)HT.a(ir.Kh);
    }

    public String getTitle()
    {
        return (String)HT.a(ir.Ko);
    }

    public MetadataBundle gh()
    {
        return HT;
    }

    public Boolean isPinned()
    {
        return (Boolean)HT.a(ir.Kc);
    }

    public Boolean isStarred()
    {
        return (Boolean)HT.a(ir.Km);
    }

    public Boolean isViewed()
    {
        return (Boolean)HT.a(ir.Kg);
    }

}
