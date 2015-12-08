// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.content.Intent;
import com.fitbit.dncs.domain.TrackerBondState;
import com.fitbit.e.a;
import com.fitbit.galileo.a.f;
import com.fitbit.savedstate.g;
import com.fitbit.util.threading.c;
import java.util.Map;

// Referenced classes of package com.fitbit.dncs:
//            c

class ading.c extends c
{

    final com.fitbit.dncs.c a;

    protected void a(Intent intent)
    {
        String s;
        TrackerBondState trackerbondstate;
        TrackerBondState trackerbondstate1;
        if (!g.b.equals(intent.getAction()))
        {
            break MISSING_BLOCK_LABEL_206;
        }
        s = intent.getStringExtra(g.c);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        trackerbondstate = (TrackerBondState)intent.getParcelableExtra(g.d);
        trackerbondstate1 = (TrackerBondState)intent.getParcelableExtra(g.e);
        com.fitbit.e.a.a("TrackerBondErrorHandler", "State of the tracker %s changed from %s to %s", new Object[] {
            s, trackerbondstate, trackerbondstate1
        });
        intent = com.fitbit.dncs.c.a(a);
        intent;
        JVM INSTR monitorenter ;
        if (trackerbondstate1 != null) goto _L2; else goto _L1
_L1:
        if (com.fitbit.dncs.c.a(a).containsKey(s))
        {
            a.a(s);
        }
_L4:
        intent;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!com.fitbit.dncs.c.a(a).containsKey(s) || trackerbondstate1 == null) goto _L4; else goto _L3
_L3:
        if (trackerbondstate != TrackerBondState.b || trackerbondstate1 != TrackerBondState.a && trackerbondstate1 != TrackerBondState.d) goto _L4; else goto _L5
_L5:
        String s1 = f.b(f.a(s));
        if (com.fitbit.bluetooth.g.g() && com.fitbit.bluetooth.g.a(s1))
        {
            g.a(3);
            c.b(a);
        }
        a.a(s);
          goto _L4
        Exception exception;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
    }

    nt(com.fitbit.dncs.c c1)
    {
        a = c1;
        super();
    }
}
