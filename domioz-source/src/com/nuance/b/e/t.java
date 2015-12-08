// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.util.Log;
import com.nuance.b.b.a.ak;
import com.nuance.b.b.a.am;
import com.nuance.b.b.a.an;
import com.nuance.b.b.a.ao;
import com.nuance.b.e.a.d;

// Referenced classes of package com.nuance.b.e:
//            c

final class t
    implements am
{

    final c a;

    t(c c1)
    {
        a = c1;
        super();
    }

    public final void onRecordingError(ak ak)
    {
        Log.d("Nina", "NinaObserver.onRecordingError");
    }

    public final void onRecordingStarted(an an)
    {
        Log.d("Nina", "NinaObserver.onRecordingStarted");
        c.a(a, d.b);
    }

    public final void onRecordingStopped(ao ao)
    {
        Log.d("Nina", "NinaObserver.onRecordingStopped");
        if (c.i(a))
        {
            a.a(true);
        }
        c.a(a, d.e);
        c.a(a, d.j);
    }
}
