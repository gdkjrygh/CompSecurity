// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.zzg;

public final class bfk extends zzg
{

    private static final bfk a = new bfk();

    private bfk()
    {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public static bgb a(Context context, String s, cew cew)
    {
        Object obj;
label0:
        {
            bfq.a();
            if (bjz.b(context))
            {
                bgb bgb = a.b(context, s, cew);
                obj = bgb;
                if (bgb != null)
                {
                    break label0;
                }
            }
            bka.a("Using AdLoader from the client jar.");
            obj = new bkn(context, s, cew, new VersionInfoParcel());
        }
        return ((bgb) (obj));
    }

    private bgb b(Context context, String s, cew cew)
    {
        byb byb = bye.a(context);
        context = bgc.a(((bge)b(context)).a(byb, s, cew, 0x7bd338));
        return context;
        context;
        bka.c("Could not create remote builder for AdLoader.", context);
_L2:
        return null;
        context;
        bka.c("Could not create remote builder for AdLoader.", context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final Object a(IBinder ibinder)
    {
        return bgf.a(ibinder);
    }

}
