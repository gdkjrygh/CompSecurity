// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.c.k;
import com.google.common.a.ew;

// Referenced classes of package com.facebook.push.c2dm:
//            b

public class C2DMBroadcastReceiver extends k
{

    private static final Class a = com/facebook/push/c2dm/C2DMBroadcastReceiver;

    public C2DMBroadcastReceiver()
    {
        super((new ew()).b("com.google.android.c2dm.intent.RECEIVE", new b(null)).b("com.google.android.c2dm.intent.REGISTRATION", new b(null)).b());
    }

    static Class a()
    {
        return a;
    }

}
