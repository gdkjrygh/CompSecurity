// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaRouter;
import android.os.Bundle;

final class aao extends aan
{

    public aao(Context context, aas aas)
    {
        super(context, aas);
    }

    protected final void a(aal aal1, yq yq1)
    {
        super.a(aal1, yq1);
        aal1 = ((android.media.MediaRouter.RouteInfo)aal1.a).getDescription();
        if (aal1 != null)
        {
            aal1 = aal1.toString();
            yq1.a.putString("status", aal1);
        }
    }

    protected final void a(aam aam1)
    {
        super.a(aam1);
        Object obj = aam1.b;
        aam1 = aam1.a.e;
        ((android.media.MediaRouter.UserRouteInfo)obj).setDescription(aam1);
    }

    protected final boolean a(aal aal1)
    {
        return ((android.media.MediaRouter.RouteInfo)aal1.a).isConnecting();
    }

    protected final void b()
    {
        int i = 1;
        if (m)
        {
            b.a(this.i, this.j);
        }
        m = true;
        Object obj = this.i;
        int j = k;
        Object obj1 = this.j;
        if (!l)
        {
            i = 0;
        }
        ((MediaRouter)obj).addCallback(j, (android.media.MediaRouter.Callback)obj1, i | 2);
    }

    protected final Object d()
    {
        return ((MediaRouter)i).getDefaultRoute();
    }

    protected final void h(Object obj)
    {
        ((MediaRouter)i).selectRoute(0x800003, (android.media.MediaRouter.RouteInfo)obj);
    }
}
