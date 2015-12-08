// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.IOException;

final class nvd
    implements lxi
{

    private nvc a;

    nvd(nvc nvc1)
    {
        a = nvc1;
        super();
    }

    public final void a(Object obj)
    {
        if (!((lxg)obj).a)
        {
            Log.e("CastApi", "CastClient not connected to device");
            nva.d(a.a);
        }
        try
        {
            obj = ((lxp)olm.a(nva.g(), lxp)).a(nva.e(a.a));
            a.a.a = new nvi(nva.e(a.a), ((lxo) (obj)));
            nva.f(a.a).e = a.a;
            nva.f(a.a).a("newSession", null);
            a.a.a(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("CastApi", "IOError when connecting to the device.", ((Throwable) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("CastApi", "CastClient not connected to device", ((Throwable) (obj)));
        }
        nva.d(a.a);
    }
}
