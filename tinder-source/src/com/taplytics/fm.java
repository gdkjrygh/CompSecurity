// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.Handler;
import android.os.Looper;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            fy, em, fn, gs

final class fm
    implements fy
{

    final String a;
    final em b;

    fm(em em1, String s)
    {
        b = em1;
        a = s;
        super();
    }

    public final void a(Boolean boolean1)
    {
        if (!boolean1.booleanValue())
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (em.i(b) == null)
        {
            em.d(b, new JSONObject());
        }
        em.i(b).put("wasConnected", false);
        (new Handler(Looper.getMainLooper())).postDelayed(new fn(this), 10L);
        return;
        boolean1;
        gs.b("Sending pairing device socket", boolean1);
        return;
    }
}
