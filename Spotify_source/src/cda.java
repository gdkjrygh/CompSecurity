// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.zzg;

public final class cda extends zzg
{

    public cda()
    {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final cbw a(Context context, FrameLayout framelayout, FrameLayout framelayout1)
    {
        byb byb = bye.a(context);
        framelayout = bye.a(framelayout);
        framelayout1 = bye.a(framelayout1);
        context = cbx.a(((cbz)b(context)).a(byb, framelayout, framelayout1, 0x7bd338));
        return context;
        context;
_L2:
        bka.c("Could not create remote NativeAdViewDelegate.", context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final Object a(IBinder ibinder)
    {
        return cca.a(ibinder);
    }
}
