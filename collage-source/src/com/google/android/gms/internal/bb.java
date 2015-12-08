// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            az, ba

public class bb
{

    public bb()
    {
    }

    public ba a(az az1)
    {
        if (az1 == null)
        {
            throw new IllegalArgumentException("CSI configuration can't be null. ");
        }
        if (!az1.a())
        {
            zzb.v("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        }
        if (az1.c() == null)
        {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(az1.d()))
        {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        } else
        {
            return new ba(az1.c(), az1.d(), az1.b(), az1.e());
        }
    }
}
