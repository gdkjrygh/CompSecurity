// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzca, zzbx

public final class zzbv
{

    private String zzqa;
    private List zzqb;
    private int zzqc;

    public zzbv()
    {
        this((String)zzca.zzql.zzbY(), ((List) (new ArrayList())), -1);
    }

    public zzbv(String s, List list)
    {
        this(s, list, -1);
    }

    public zzbv(String s, List list, int i)
    {
        zzqc = -1;
        if (list == null)
        {
            list = new ArrayList();
        }
        zzqb = list;
        if (TextUtils.isEmpty(s))
        {
            s = (String)zzca.zzql.zzbY();
        }
        zzqa = s;
        zzqc = i;
    }

    public final String zzbV()
    {
        return zzqa;
    }

    public final List zzbW()
    {
        return zzqb;
    }

    public final int zzbX()
    {
        return zzqc;
    }
}
