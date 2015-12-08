// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.b.d;
import io.fabric.sdk.android.services.b.f;
import io.fabric.sdk.android.services.common.j;
import io.fabric.sdk.android.services.settings.b;
import java.io.IOException;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEventTransform

class SessionAnalyticsFilesManager extends d
{

    b a;

    SessionAnalyticsFilesManager(Context context, SessionEventTransform sessioneventtransform, j j1, f f)
        throws IOException
    {
        super(context, sessioneventtransform, j1, f);
    }

    protected final String a()
    {
        UUID uuid = UUID.randomUUID();
        return (new StringBuilder("sa_")).append(uuid.toString()).append("_").append(d.a()).append(".tap").toString();
    }

    protected final int b()
    {
        if (a == null)
        {
            return super.b();
        } else
        {
            return a.e;
        }
    }

    protected final int c()
    {
        if (a == null)
        {
            return super.c();
        } else
        {
            return a.c;
        }
    }
}
