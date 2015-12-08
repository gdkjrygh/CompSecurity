// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzo

class <init>
    implements Runnable
{

    final zzo a;

    public void run()
    {
        synchronized (zzo.a(a))
        {
            Intent intent = new Intent("com.google.android.location.places.METHOD_CALL");
            intent.setPackage("com.google.android.gms");
            intent.putStringArrayListExtra("PLACE_IDS", zzo.b(a));
            intent.putStringArrayListExtra("METHOD_NAMES", zzo.c(a));
            zzo.d(a).sendBroadcast(intent);
            zzo.a(a, null);
            zzo.b(a, null);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private (zzo zzo1)
    {
        a = zzo1;
        super();
    }

    a(zzo zzo1, a a1)
    {
        this(zzo1);
    }
}
