// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class cyd
{

    private final Map a = new HashMap();
    private final List b = new ArrayList();

    cyd()
    {
    }

    public final Map a()
    {
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap = new HashMap(a);
        this;
        JVM INSTR monitorexit ;
        return hashmap;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(cye cye)
    {
        this;
        JVM INSTR monitorenter ;
        b.add(cye);
        this;
        JVM INSTR monitorexit ;
        return;
        cye;
        throw cye;
    }

    public final void a(String s, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (a.containsKey(s)) goto _L2; else goto _L1
_L1:
        Log.w("MixpanelAPI.Tweaks", (new StringBuilder("Attempt to set a tweak \"")).append(s).append("\" which has never been defined.").toString());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        cyf cyf1 = (cyf)a.get(s);
        obj = new cyf(cyf1.a, cyf1.b, cyf1.c, cyf1.d, obj);
        a.put(s, obj);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }
}
