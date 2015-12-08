// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.net.URL;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            zzdh

static class zzwo
{

    private final String zzwl;
    private final URL zzwm;
    private final ArrayList zzwn;
    private final String zzwo;

    public String zzdJ()
    {
        return zzwl;
    }

    public URL zzdK()
    {
        return zzwm;
    }

    public ArrayList zzdL()
    {
        return zzwn;
    }

    public String zzdM()
    {
        return zzwo;
    }

    public (String s, URL url, ArrayList arraylist, String s1)
    {
        zzwl = s;
        zzwm = url;
        if (arraylist == null)
        {
            zzwn = new ArrayList();
        } else
        {
            zzwn = arraylist;
        }
        zzwo = s1;
    }
}
