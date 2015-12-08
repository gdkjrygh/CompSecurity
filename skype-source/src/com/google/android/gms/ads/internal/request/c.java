// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.e;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.ay;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdResponseParcel, AdRequestInfoParcel

public final class c
{
    public static interface a
    {

        public abstract void a(AdResponseParcel adresponseparcel);
    }

    static interface b
    {

        public abstract boolean a(AdRequestInfoParcel adrequestinfoparcel);
    }


    // Unreferenced inner class com/google/android/gms/ads/internal/request/c$1

/* anonymous class */
    static final class _cls1
        implements b
    {

        final Context a;

        public final boolean a(AdRequestInfoParcel adrequestinfoparcel)
        {
label0:
            {
                if (!adrequestinfoparcel.k.e)
                {
                    if (!e.h(a))
                    {
                        break label0;
                    }
                    adrequestinfoparcel = ay.B;
                    if (((Boolean)p.n().a(adrequestinfoparcel)).booleanValue())
                    {
                        break label0;
                    }
                }
                return true;
            }
            return false;
        }

            
            {
                a = context;
                super();
            }
    }

}
