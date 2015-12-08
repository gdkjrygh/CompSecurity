// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;

class aan extends aaj
    implements zs
{

    private zr o;
    private zu p;

    public aan(Context context, aas aas)
    {
        super(context, aas);
    }

    protected void a(aal aal1, yq yq1)
    {
        super.a(aal1, yq1);
        if (!((android.media.MediaRouter.RouteInfo)aal1.a).isEnabled())
        {
            yq1.a.putBoolean("enabled", false);
        }
        if (a(aal1))
        {
            yq1.a.putBoolean("connecting", true);
        }
        aal1 = ((android.media.MediaRouter.RouteInfo)aal1.a).getPresentationDisplay();
        if (aal1 != null)
        {
            yq1.f(aal1.getDisplayId());
        }
    }

    protected boolean a(aal aal1)
    {
        if (p == null)
        {
            p = new zu();
        }
        return p.a(aal1.a);
    }

    protected void b()
    {
        zr zr1;
        super.b();
        if (o == null)
        {
            o = new zr(super.a, super.c);
        }
        zr1 = o;
        int i;
        if (l)
        {
            i = k;
        } else
        {
            i = 0;
        }
        if ((i & 2) == 0) goto _L2; else goto _L1
_L1:
        if (zr1.c) goto _L4; else goto _L3
_L3:
        if (zr1.b == null) goto _L6; else goto _L5
_L5:
        zr1.c = true;
        zr1.a.post(zr1);
_L4:
        return;
_L6:
        Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
        return;
_L2:
        if (zr1.c)
        {
            zr1.c = false;
            zr1.a.removeCallbacks(zr1);
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    protected final Object c()
    {
        return new zt(this);
    }

    public final void f(Object obj)
    {
        int i = g(obj);
        if (i >= 0)
        {
            aal aal1 = (aal)n.get(i);
            obj = ((android.media.MediaRouter.RouteInfo)obj).getPresentationDisplay();
            if (obj != null)
            {
                i = ((Display) (obj)).getDisplayId();
            } else
            {
                i = -1;
            }
            if (i != aal1.c.o())
            {
                aal1.c = (new yq(aal1.c)).f(i).a();
                a();
            }
        }
    }
}
