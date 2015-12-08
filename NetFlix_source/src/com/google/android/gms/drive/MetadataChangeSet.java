// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.gs;
import com.google.android.gms.internal.gt;
import java.util.Date;

public final class MetadataChangeSet
{
    public static class Builder
    {

        private final MetadataBundle EP = MetadataBundle.fT();

        public MetadataChangeSet build()
        {
            return new MetadataChangeSet(EP);
        }

        public Builder setDescription(String s)
        {
            EP.b(gs.FT, s);
            return this;
        }

        public Builder setIndexableText(String s)
        {
            EP.b(gs.FY, s);
            return this;
        }

        public Builder setLastViewedByMeDate(Date date)
        {
            EP.b(gt.Gt, date);
            return this;
        }

        public Builder setMimeType(String s)
        {
            EP.b(gs.Gh, s);
            return this;
        }

        public Builder setPinned(boolean flag)
        {
            EP.b(gs.Gc, Boolean.valueOf(flag));
            return this;
        }

        public Builder setStarred(boolean flag)
        {
            EP.b(gs.Gm, Boolean.valueOf(flag));
            return this;
        }

        public Builder setTitle(String s)
        {
            EP.b(gs.Go, s);
            return this;
        }

        public Builder setViewed(boolean flag)
        {
            EP.b(gs.Gg, Boolean.valueOf(flag));
            return this;
        }

        public Builder()
        {
        }
    }


    private final MetadataBundle EP;

    private MetadataChangeSet(MetadataBundle metadatabundle)
    {
        EP = MetadataBundle.a(metadatabundle);
    }


    public MetadataBundle fD()
    {
        return EP;
    }

    public String getDescription()
    {
        return (String)EP.a(gs.FT);
    }

    public String getIndexableText()
    {
        return (String)EP.a(gs.FY);
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)EP.a(gt.Gt);
    }

    public String getMimeType()
    {
        return (String)EP.a(gs.Gh);
    }

    public String getTitle()
    {
        return (String)EP.a(gs.Go);
    }

    public Boolean isPinned()
    {
        return (Boolean)EP.a(gs.Gc);
    }

    public Boolean isStarred()
    {
        return (Boolean)EP.a(gs.Gm);
    }

    public Boolean isViewed()
    {
        return (Boolean)EP.a(gs.Gg);
    }
}
