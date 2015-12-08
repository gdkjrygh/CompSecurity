// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GooglePlayServicesUtil;

public final class bit
{

    // Unreferenced inner class bit$1

/* anonymous class */
    public final class _cls1
        implements biv
    {

        private Context a;

        public final boolean a(AdRequestInfoParcel adrequestinfoparcel)
        {
label0:
            {
                if (!adrequestinfoparcel.k.e)
                {
                    if (!GooglePlayServicesUtil.zzag(a))
                    {
                        break label0;
                    }
                    adrequestinfoparcel = cbb.q;
                    if (((Boolean)bkv.n().a(adrequestinfoparcel)).booleanValue())
                    {
                        break label0;
                    }
                }
                return true;
            }
            return false;
        }

            public 
            {
                a = context;
                super();
            }
    }

}
