// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public final class MetadataChangeSet
{
    public static class Builder
    {

        private final MetadataBundle OF = MetadataBundle.iZ();
        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.a OG;

        private int bk(String s)
        {
            if (s == null)
            {
                return 0;
            } else
            {
                return s.getBytes().length;
            }
        }

        private String i(String s, int k, int l)
        {
            return String.format("%s must be no more than %d bytes, but is %d bytes.", new Object[] {
                s, Integer.valueOf(k), Integer.valueOf(l)
            });
        }

        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.a iA()
        {
            if (OG == null)
            {
                OG = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.a();
            }
            return OG;
        }

        private void j(String s, int k, int l)
        {
            boolean flag;
            if (l <= k)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, i(s, k, l));
        }

        public MetadataChangeSet build()
        {
            if (OG != null)
            {
                OF.b(ln.Rl, OG.iW());
            }
            return new MetadataChangeSet(OF);
        }

        public Builder deleteCustomProperty(CustomPropertyKey custompropertykey)
        {
            jx.b(custompropertykey, "key");
            iA().a(custompropertykey, null);
            return this;
        }

        public Builder setCustomProperty(CustomPropertyKey custompropertykey, String s)
        {
            jx.b(custompropertykey, "key");
            jx.b(s, "value");
            j("The total size of key string and value string of a custom property", 124, bk(custompropertykey.getKey()) + bk(s));
            iA().a(custompropertykey, s);
            return this;
        }

        public Builder setDescription(String s)
        {
            OF.b(ln.Rm, s);
            return this;
        }

        public Builder setIndexableText(String s)
        {
            j("Indexable text size", 0x20000, bk(s));
            OF.b(ln.Rr, s);
            return this;
        }

        public Builder setLastViewedByMeDate(Date date)
        {
            OF.b(lp.RR, date);
            return this;
        }

        public Builder setMimeType(String s)
        {
            OF.b(ln.RA, s);
            return this;
        }

        public Builder setPinned(boolean flag)
        {
            OF.b(ln.Rv, Boolean.valueOf(flag));
            return this;
        }

        public Builder setStarred(boolean flag)
        {
            OF.b(ln.RH, Boolean.valueOf(flag));
            return this;
        }

        public Builder setTitle(String s)
        {
            OF.b(ln.RJ, s);
            return this;
        }

        public Builder setViewed(boolean flag)
        {
            OF.b(ln.Rz, Boolean.valueOf(flag));
            return this;
        }

        public Builder()
        {
        }
    }


    public static final int CUSTOM_PROPERTY_SIZE_LIMIT_BYTES = 124;
    public static final int INDEXABLE_TEXT_SIZE_LIMIT_BYTES = 0x20000;
    public static final int MAX_PRIVATE_PROPERTIES_PER_RESOURCE_PER_APP = 30;
    public static final int MAX_PUBLIC_PROPERTIES_PER_RESOURCE = 30;
    public static final int MAX_TOTAL_PROPERTIES_PER_RESOURCE = 100;
    public static final MetadataChangeSet OE = new MetadataChangeSet(MetadataBundle.iZ());
    private final MetadataBundle OF;

    public MetadataChangeSet(MetadataBundle metadatabundle)
    {
        OF = MetadataBundle.a(metadatabundle);
    }

    public Map getCustomPropertyChangeMap()
    {
        AppVisibleCustomProperties appvisiblecustomproperties = (AppVisibleCustomProperties)OF.a(ln.Rl);
        if (appvisiblecustomproperties == null)
        {
            return Collections.emptyMap();
        } else
        {
            return appvisiblecustomproperties.iV();
        }
    }

    public String getDescription()
    {
        return (String)OF.a(ln.Rm);
    }

    public String getIndexableText()
    {
        return (String)OF.a(ln.Rr);
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)OF.a(lp.RR);
    }

    public String getMimeType()
    {
        return (String)OF.a(ln.RA);
    }

    public String getTitle()
    {
        return (String)OF.a(ln.RJ);
    }

    public Boolean isPinned()
    {
        return (Boolean)OF.a(ln.Rv);
    }

    public Boolean isStarred()
    {
        return (Boolean)OF.a(ln.RH);
    }

    public Boolean isViewed()
    {
        return (Boolean)OF.a(ln.Rz);
    }

    public MetadataBundle iz()
    {
        return OF;
    }

}
