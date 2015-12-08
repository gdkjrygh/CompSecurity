// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import cjd;

// Referenced classes of package com.google.android.gms.internal:
//            zzr

public class zza extends zzr
{

    private Intent zza;

    public zza()
    {
    }

    public zza(cjd cjd)
    {
        super(cjd);
    }

    public String getMessage()
    {
        if (zza != null)
        {
            return "User needs to (re)enter credentials.";
        } else
        {
            return super.getMessage();
        }
    }
}
