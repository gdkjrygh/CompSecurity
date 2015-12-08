// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cy;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            e, AdRequestInfoParcel

final class d
    implements e
{

    final Context a;

    d(Context context)
    {
        a = context;
        super();
    }

    public final boolean a(AdRequestInfoParcel adrequestinfoparcel)
    {
label0:
        {
            if (!adrequestinfoparcel.zzqj.zzJx)
            {
                if (!GooglePlayServicesUtil.zzag(a))
                {
                    break label0;
                }
                adrequestinfoparcel = cy.B;
                if (((Boolean)zzp.zzbE().a(adrequestinfoparcel)).booleanValue())
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }
}
