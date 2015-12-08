// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.content.Intent;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            f, WebFlowActivity

final class a
    implements Runnable
{

    final Intent a;
    final f b;

    public final void run()
    {
        f.a(b).setIntent(a);
        f.a(b).recreate();
    }

    lowActivity(f f1, Intent intent)
    {
        b = f1;
        a = intent;
        super();
    }
}
