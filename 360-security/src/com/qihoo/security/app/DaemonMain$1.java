// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.content.Context;

// Referenced classes of package com.qihoo.security.app:
//            DaemonMain

static final class a
    implements Runnable
{

    final Context a;

    public void run()
    {
        DaemonMain.c(a);
    }

    (Context context)
    {
        a = context;
        super();
    }
}
