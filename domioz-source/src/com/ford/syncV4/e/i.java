// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.a.a;
import com.ford.syncV4.a.b;
import com.ford.syncV4.e.c.a.j;
import com.ford.syncV4.e.c.a.r;
import com.ford.syncV4.e.c.q;
import com.ford.syncV4.i.e;
import java.util.Vector;

// Referenced classes of package com.ford.syncV4.e:
//            j

public final class i extends com.ford.syncV4.e.j
{

    public i(com.ford.syncV4.e.b.a a1, String s, String s1, Vector vector, Boolean boolean1, j j1, j j2, 
            String s2)
    {
        super(a1, s, s1, vector, boolean1, j1, j2, s2, new e());
        com.ford.syncV4.h.e.a("Application constructed SyncProxyALM (using legacy constructor for BT transport) instance passing in: IProxyListener, appName, ngnMediaScreenAppName, vrSynonyms, isMediaApp, syncMsgVersion, languageDesired, and autoActivateID.", "42baba60-eb57-11df-98cf-0800200c9a66");
    }

    public final void a()
    {
        super.a(r.l);
    }

    public final q b()
    {
        if (h.booleanValue())
        {
            throw new a("This object has been disposed, it is no long capable of executing methods.", b.l);
        }
        if (!d.booleanValue())
        {
            throw new a("SYNC is unavailable. Unable to get the displayCapabilities.", b.o);
        } else
        {
            return r;
        }
    }

    public final Vector c()
    {
        if (h.booleanValue())
        {
            throw new a("This object has been disposed, it is no long capable of executing methods.", b.l);
        }
        if (!d.booleanValue())
        {
            throw new a("SYNC is unavailable. Unable to get the speechCapabilities.", b.o);
        } else
        {
            return w;
        }
    }
}
