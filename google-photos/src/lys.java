// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import com.google.android.gms.cast.CastDevice;
import com.google.android.libraries.gcoreclient.cast.remotedisplay.impl.CastRemoteDisplayLocalServiceDelegator;

public final class lys
    implements lyl
{

    public lys()
    {
    }

    public final lxl a(Bundle bundle)
    {
        bundle = CastDevice.a(bundle);
        if (bundle != null)
        {
            return new lyp(bundle);
        } else
        {
            return null;
        }
    }

    public final lyj a(Context context, Display display, int i, lyk lyk)
    {
        return new lyr(lyk, context, display, i);
    }

    public final void a()
    {
        jva.a();
    }

    public final void a(Context context, String s, lxl lxl, ds ds, lyn lyn)
    {
        jva.a(context, com/google/android/libraries/gcoreclient/cast/remotedisplay/impl/CastRemoteDisplayLocalServiceDelegator, s, ((lyp)lxl).a, ((lyu)ds).a, new lyt(this, lyn));
    }
}
