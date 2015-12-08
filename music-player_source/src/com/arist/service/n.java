// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.Context;
import android.content.Intent;
import com.arist.c.a;

// Referenced classes of package com.arist.service:
//            m

final class n extends android.media.session.MediaSession.Callback
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public final void onPause()
    {
        a.b.sendBroadcast(new Intent(a.b));
    }

    public final void onPlay()
    {
        a.b.sendBroadcast(new Intent(a.b));
    }

    public final void onSkipToNext()
    {
        a.b.sendBroadcast(new Intent(a.g));
    }

    public final void onSkipToPrevious()
    {
        a.b.sendBroadcast(new Intent(a.f));
    }

    public final void onStop()
    {
        a.b.sendBroadcast(new Intent(a.q));
    }
}
