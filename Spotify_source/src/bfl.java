// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.dynamic.zzg;

public final class bfl extends zzg
{

    public bfl()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final bgh a(Context context, AdSizeParcel adsizeparcel, String s, cew cew, int i)
    {
        byb byb = bye.a(context);
        context = bgi.a(((bgk)b(context)).a(byb, adsizeparcel, s, cew, 0x7bd338, i));
        return context;
        context;
_L2:
        bka.a("Could not create remote AdManager.", context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final Object a(IBinder ibinder)
    {
        return bgl.a(ibinder);
    }
}
