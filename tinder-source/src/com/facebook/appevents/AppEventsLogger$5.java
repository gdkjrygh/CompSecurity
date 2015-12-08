// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import android.content.Context;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

static final class c
    implements Runnable
{

    final Context a;
    final cessTokenAppIdPair b;
    final pEvent c;

    public final void run()
    {
        AppEventsLogger.a(a, b).a(c);
        AppEventsLogger.e();
    }

    pEvent(Context context, cessTokenAppIdPair cesstokenappidpair, pEvent pevent)
    {
        a = context;
        b = cesstokenappidpair;
        c = pevent;
        super();
    }
}
