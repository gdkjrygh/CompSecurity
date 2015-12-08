// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.aa;
import com.nuance.b.b.a.ab;
import com.nuance.b.b.a.ac;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.ao;
import com.nuance.dragon.toolkit.a.x;
import com.nuance.dragon.toolkit.b.e;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            gp, fr, fm, go, 
//            v, fc, z

final class gf extends gp
{

    private final b a;

    gf(b b1)
    {
        super(b1.b(), "ping", "TransactionListenerPing");
        a = b1;
    }

    public final void a(x x, ao ao1, boolean flag)
    {
        boolean flag1;
        flag1 = true;
        super.a(x, ao1, flag);
        if (!ao1.e())
        {
            break MISSING_BLOCK_LABEL_392;
        }
        x = ao1.d().e("adk_result").a;
        fr.c((new StringBuilder()).append(d()).append("Response: ").append(x).toString());
        x = new JSONObject(x);
        if (!fm.c(x)) goto _L2; else goto _L1
_L1:
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        String s;
        try
        {
            a.b(new ab(a.b(), ac.e, null, "session expired"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ao ao1) { }
        break MISSING_BLOCK_LABEL_250;
_L2:
        ao1 = go.a(x, "Response.request.jsessionid", null);
        s = v.r().p().c();
        com.nuance.b.b.fr.e((new StringBuilder()).append(d()).append(" isSessionExpired -- jSessionId: ").append(ao1).append(" prevJSessionId: ").append(s).toString());
        if (s.equals(ao1))
        {
            flag1 = false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (fm.a(x))
        {
            x = com.nuance.b.b.fm.b(x);
            fr.a((new StringBuilder()).append(d()).append(" Request failed: ").append(x).toString());
            a.b(new ab(a.b(), ac.f, null, x));
            return;
        }
        break MISSING_BLOCK_LABEL_371;
        com.nuance.b.b.fr.b((new StringBuilder()).append(d()).append(" Failed to read response (perhaps manually disconnected): ").append(ao1).toString());
        synchronized (v.r())
        {
            if (z.a == x.s())
            {
                a.b(new ab(a.b(), ac.d, ao1, "Failed to read response (perhaps manually disconnected)"));
            }
        }
        return;
        ao1;
        x;
        JVM INSTR monitorexit ;
        try
        {
            throw ao1;
        }
        // Misplaced declaration of an exception variable
        catch (x x)
        {
            fr.a("Unable to read ping response");
        }
        fr.a(x.getStackTrace());
        a.b(new ab(a.b(), ac.d, x, "Unable to read ping response"));
        return;
        a.a(new aa(a.b()));
    }
}
