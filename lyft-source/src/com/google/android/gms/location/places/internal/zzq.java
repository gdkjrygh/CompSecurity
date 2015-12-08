// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.zzg;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzt, zzp

public class zzq extends zzt
    implements zzg
{

    private final String c = d("photo_fife_url");

    public zzq(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public Object a()
    {
        return b();
    }

    public zzg b()
    {
        return new zzp(c, c(), d(), e(), b);
    }

    public int c()
    {
        return a("photo_max_width", 0);
    }

    public int d()
    {
        return a("photo_max_height", 0);
    }

    public CharSequence e()
    {
        return a("photo_attributions", null);
    }
}
