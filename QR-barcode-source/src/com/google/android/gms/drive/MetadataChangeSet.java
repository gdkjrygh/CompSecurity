// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.kd;
import com.google.android.gms.internal.kf;
import java.util.Date;

public final class MetadataChangeSet
{
    public static class Builder
    {

        private final MetadataBundle Nu = MetadataBundle.io();
        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.a Nv;

        public MetadataChangeSet build()
        {
            if (Nv != null)
            {
                Nu.b(kd.PO, Nv.im());
            }
            return new MetadataChangeSet(Nu);
        }

        public Builder setDescription(String s)
        {
            Nu.b(kd.PP, s);
            return this;
        }

        public Builder setIndexableText(String s)
        {
            Nu.b(kd.PU, s);
            return this;
        }

        public Builder setLastViewedByMeDate(Date date)
        {
            Nu.b(kf.Qu, date);
            return this;
        }

        public Builder setMimeType(String s)
        {
            Nu.b(kd.Qd, s);
            return this;
        }

        public Builder setPinned(boolean flag)
        {
            Nu.b(kd.PY, Boolean.valueOf(flag));
            return this;
        }

        public Builder setStarred(boolean flag)
        {
            Nu.b(kd.Qk, Boolean.valueOf(flag));
            return this;
        }

        public Builder setTitle(String s)
        {
            Nu.b(kd.Qm, s);
            return this;
        }

        public Builder setViewed(boolean flag)
        {
            Nu.b(kd.Qc, Boolean.valueOf(flag));
            return this;
        }

        public Builder()
        {
        }
    }


    public static final MetadataChangeSet Nt = new MetadataChangeSet(MetadataBundle.io());
    private final MetadataBundle Nu;

    public MetadataChangeSet(MetadataBundle metadatabundle)
    {
        Nu = MetadataBundle.a(metadatabundle);
    }

    public String getDescription()
    {
        return (String)Nu.a(kd.PP);
    }

    public String getIndexableText()
    {
        return (String)Nu.a(kd.PU);
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)Nu.a(kf.Qu);
    }

    public String getMimeType()
    {
        return (String)Nu.a(kd.Qd);
    }

    public String getTitle()
    {
        return (String)Nu.a(kd.Qm);
    }

    public MetadataBundle hS()
    {
        return Nu;
    }

    public Boolean isPinned()
    {
        return (Boolean)Nu.a(kd.PY);
    }

    public Boolean isStarred()
    {
        return (Boolean)Nu.a(kd.Qk);
    }

    public Boolean isViewed()
    {
        return (Boolean)Nu.a(kd.Qc);
    }

}
