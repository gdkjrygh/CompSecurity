// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            ah, af

class aj
    implements Runnable
{

    final ComponentName a;
    final ah b;

    aj(ah ah1, ComponentName componentname)
    {
        b = ah1;
        a = componentname;
        super();
    }

    public void run()
    {
        af.a(b.a, a);
    }
}
