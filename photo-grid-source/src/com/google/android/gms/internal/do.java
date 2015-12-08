// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.d;

// Referenced classes of package com.google.android.gms.internal:
//            dp

public final class do
    implements CustomRenderedAd
{

    private final dp a;

    public do(dp dp1)
    {
        a = dp1;
    }

    public final String getBaseUrl()
    {
        String s;
        try
        {
            s = a.a();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not delegate getBaseURL to CustomRenderedAd", remoteexception);
            return null;
        }
        return s;
    }

    public final String getContent()
    {
        String s;
        try
        {
            s = a.b();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not delegate getContent to CustomRenderedAd", remoteexception);
            return null;
        }
        return s;
    }

    public final void onAdRendered(View view)
    {
        dp dp1;
        try
        {
            dp1 = a;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            zzb.zzd("Could not delegate onAdRendered to CustomRenderedAd", view);
            return;
        }
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        view = d.a(view);
_L1:
        dp1.a(view);
        return;
        view = null;
          goto _L1
    }

    public final void recordClick()
    {
        try
        {
            a.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not delegate recordClick to CustomRenderedAd", remoteexception);
        }
    }

    public final void recordImpression()
    {
        try
        {
            a.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not delegate recordImpression to CustomRenderedAd", remoteexception);
        }
    }
}
