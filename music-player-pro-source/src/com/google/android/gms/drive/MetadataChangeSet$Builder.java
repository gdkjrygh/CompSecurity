// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import java.util.Date;

// Referenced classes of package com.google.android.gms.drive:
//            MetadataChangeSet

public static class 
{

    private final MetadataBundle OF = MetadataBundle.iZ();
    private com.google.android.gms.drive.metadata.internal..a OG;

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

    private com.google.android.gms.drive.metadata.internal..a iA()
    {
        if (OG == null)
        {
            OG = new com.google.android.gms.drive.metadata.internal..a();
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

    public  deleteCustomProperty(CustomPropertyKey custompropertykey)
    {
        jx.b(custompropertykey, "key");
        iA().a(custompropertykey, null);
        return this;
    }

    public  setCustomProperty(CustomPropertyKey custompropertykey, String s)
    {
        jx.b(custompropertykey, "key");
        jx.b(s, "value");
        j("The total size of key string and value string of a custom property", 124, bk(custompropertykey.getKey()) + bk(s));
        iA().a(custompropertykey, s);
        return this;
    }

    public  setDescription(String s)
    {
        OF.b(ln.Rm, s);
        return this;
    }

    public Bundle.b setIndexableText(String s)
    {
        j("Indexable text size", 0x20000, bk(s));
        OF.b(ln.Rr, s);
        return this;
    }

    public Bundle.b setLastViewedByMeDate(Date date)
    {
        OF.b(lp.RR, date);
        return this;
    }

    public Bundle.b setMimeType(String s)
    {
        OF.b(ln.RA, s);
        return this;
    }

    public Bundle.b setPinned(boolean flag)
    {
        OF.b(ln.Rv, Boolean.valueOf(flag));
        return this;
    }

    public Bundle.b setStarred(boolean flag)
    {
        OF.b(ln.RH, Boolean.valueOf(flag));
        return this;
    }

    public Bundle.b setTitle(String s)
    {
        OF.b(ln.RJ, s);
        return this;
    }

    public Bundle.b setViewed(boolean flag)
    {
        OF.b(ln.Rz, Boolean.valueOf(flag));
        return this;
    }

    public ()
    {
    }
}
