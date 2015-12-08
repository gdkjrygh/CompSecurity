// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.Context;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.iq;
import com.google.android.gms.internal.is;
import java.util.Date;

public final class MetadataChangeSet
{
    public static class Builder
    {

        private final MetadataBundle HW;
        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.a HX;
        private final Context mContext;

        public MetadataChangeSet build()
        {
            if (HX != null)
            {
                HW.b(iq.JV, HX.gD());
            }
            return new MetadataChangeSet(HW);
        }

        public Builder setDescription(String s)
        {
            HW.b(iq.JW, s);
            return this;
        }

        public Builder setIndexableText(String s)
        {
            HW.b(iq.Kb, s);
            return this;
        }

        public Builder setLastViewedByMeDate(Date date)
        {
            HW.b(is.Kx, date);
            return this;
        }

        public Builder setMimeType(String s)
        {
            HW.b(iq.Kk, s);
            return this;
        }

        public Builder setPinned(boolean flag)
        {
            HW.b(iq.Kf, Boolean.valueOf(flag));
            return this;
        }

        public Builder setStarred(boolean flag)
        {
            HW.b(iq.Kp, Boolean.valueOf(flag));
            return this;
        }

        public Builder setTitle(String s)
        {
            HW.b(iq.Kr, s);
            return this;
        }

        public Builder setViewed(boolean flag)
        {
            HW.b(iq.Kj, Boolean.valueOf(flag));
            return this;
        }

        public Builder()
        {
            this(null);
        }

        public Builder(Context context)
        {
            HW = MetadataBundle.gF();
            mContext = context;
        }
    }


    public static final MetadataChangeSet HV = new MetadataChangeSet(MetadataBundle.gF());
    private final MetadataBundle HW;

    public MetadataChangeSet(MetadataBundle metadatabundle)
    {
        HW = MetadataBundle.a(metadatabundle);
    }

    public String getDescription()
    {
        return (String)HW.a(iq.JW);
    }

    public String getIndexableText()
    {
        return (String)HW.a(iq.Kb);
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)HW.a(is.Kx);
    }

    public String getMimeType()
    {
        return (String)HW.a(iq.Kk);
    }

    public String getTitle()
    {
        return (String)HW.a(iq.Kr);
    }

    public MetadataBundle gm()
    {
        return HW;
    }

    public Boolean isPinned()
    {
        return (Boolean)HW.a(iq.Kf);
    }

    public Boolean isStarred()
    {
        return (Boolean)HW.a(iq.Kp);
    }

    public Boolean isViewed()
    {
        return (Boolean)HW.a(iq.Kj);
    }

}
