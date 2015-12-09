// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.util.Log;
import com.nuance.b.b.a.ap;
import com.nuance.b.b.a.n;
import com.nuance.b.b.a.o;
import com.nuance.b.e.a.d;

// Referenced classes of package com.nuance.b.e:
//            c

final class q
    implements o
{

    final c a;

    q(c c1)
    {
        a = c1;
        super();
    }

    public final void onEndOfSpeech(n n1)
    {
        Log.d("Nina", String.format("NinaObserver.onEndOfSpeech [%d]", new Object[] {
            Long.valueOf(n1.a)
        }));
        c.a(a, d.d);
    }

    public final void onStartOfSpeech(ap ap1)
    {
        Log.d("Nina", String.format("NinaObserver.onStartOfSpeech [%d]", new Object[] {
            Long.valueOf(ap1.a)
        }));
        c.a(a, d.c);
    }
}
