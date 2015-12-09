// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.Map;
import org.json.JSONObject;

public final class bhf extends bhg
{

    private cfj g;
    private cfm h;
    private final bks i;
    private bhg j;
    private boolean k;
    private Object l;

    private bhf(Context context, bks bks1, bzm bzm)
    {
        super(context, bks1, null, bzm, null, null, null);
        k = false;
        l = new Object();
        i = bks1;
    }

    public bhf(Context context, bks bks1, bzm bzm, cfj cfj1)
    {
        this(context, bks1, bzm);
        g = cfj1;
    }

    public bhf(Context context, bks bks1, bzm bzm, cfm cfm1)
    {
        this(context, bks1, bzm);
        h = cfm1;
    }

    public final bha a(android.view.View.OnClickListener onclicklistener)
    {
        return null;
    }

    public final void a()
    {
        btl.b("recordImpression must be called on the main UI thread.");
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        super.d = true;
        if (j == null) goto _L2; else goto _L1
_L1:
        j.a();
_L5:
        i.r();
        return;
_L2:
        if (g == null || g.k()) goto _L4; else goto _L3
_L3:
        g.i();
          goto _L5
        Object obj1;
        obj1;
        bka.c("Failed to call recordImpression", ((Throwable) (obj1)));
          goto _L5
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L4:
        if (h == null || h.i()) goto _L5; else goto _L6
_L6:
        h.g();
          goto _L5
    }

    public final void a(View view)
    {
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        k = true;
        if (g == null) goto _L2; else goto _L1
_L1:
        g.b(bye.a(view));
_L4:
        k = false;
        return;
_L2:
        if (h == null) goto _L4; else goto _L3
_L3:
        h.b(bye.a(view));
          goto _L4
        view;
        bka.c("Failed to call prepareAd", view);
          goto _L4
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }

    public final void a(View view, Map map, JSONObject jsonobject, JSONObject jsonobject1)
    {
        btl.b("performClick must be called on the main UI thread.");
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        if (j == null) goto _L2; else goto _L1
_L1:
        j.a(view, map, jsonobject, jsonobject1);
_L3:
        i.e();
        return;
_L2:
        if (g != null && !g.k())
        {
            g.a(bye.a(view));
        }
        if (h != null && !h.i())
        {
            g.a(bye.a(view));
        }
          goto _L3
        view;
        bka.c("Failed to call performClick", view);
          goto _L3
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }

    public final void a(bhg bhg1)
    {
        synchronized (l)
        {
            j = bhg1;
        }
        return;
        bhg1;
        obj;
        JVM INSTR monitorexit ;
        throw bhg1;
    }

    public final boolean b()
    {
        boolean flag;
        synchronized (l)
        {
            flag = k;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ckw c()
    {
        return null;
    }
}
