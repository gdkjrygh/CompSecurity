// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzki

public final class zzkt extends zzki
{

    private String mCategory;
    private long zzahF;
    private String zzawK;
    private String zzso;

    public zzkt()
    {
    }

    public String getAction()
    {
        return zzso;
    }

    public String getLabel()
    {
        return zzawK;
    }

    public long getValue()
    {
        return zzahF;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("category", mCategory);
        hashmap.put("action", zzso);
        hashmap.put("label", zzawK);
        hashmap.put("value", Long.valueOf(zzahF));
        return zzu(hashmap);
    }

    public void zzL(long l)
    {
        zzahF = l;
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzkt)zzki1);
    }

    public void zza(zzkt zzkt1)
    {
        if (!TextUtils.isEmpty(mCategory))
        {
            zzkt1.zzda(mCategory);
        }
        if (!TextUtils.isEmpty(zzso))
        {
            zzkt1.zzdb(zzso);
        }
        if (!TextUtils.isEmpty(zzawK))
        {
            zzkt1.zzdc(zzawK);
        }
        if (zzahF != 0L)
        {
            zzkt1.zzL(zzahF);
        }
    }

    public void zzda(String s)
    {
        mCategory = s;
    }

    public void zzdb(String s)
    {
        zzso = s;
    }

    public void zzdc(String s)
    {
        zzawK = s;
    }

    public String zzuI()
    {
        return mCategory;
    }
}
