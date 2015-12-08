// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde

class zzp extends zzaj
{

    private static final String ID;
    private final String zzYw;

    public zzp(String s)
    {
        super(ID, new String[0]);
        zzYw = s;
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        if (zzYw == null)
        {
            return zzde.zzuf();
        } else
        {
            return zzde.zzx(zzYw);
        }
    }

    public boolean zzsD()
    {
        return true;
    }

    static 
    {
        ID = zza.zzD.toString();
    }
}
