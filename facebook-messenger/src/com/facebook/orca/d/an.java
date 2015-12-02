// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.util.Log;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;

// Referenced classes of package com.facebook.orca.d:
//            af, ao

class an
    implements Runnable
{

    final Throwable a;
    final af b;

    an(af af1, Throwable throwable)
    {
        b = af1;
        a = throwable;
        super();
    }

    public void run()
    {
        af.j(b).b((new cb("audio_clips_recording_failed")).b("error_message", Log.getStackTraceString(a)).e("audio_clips"));
        af.a(b, false);
        af.c(b).c();
    }
}
