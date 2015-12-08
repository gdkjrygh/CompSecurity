// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

final class lhv
    implements Runnable
{

    private lhu a;

    lhv(lhu lhu1)
    {
        a = lhu1;
        super();
    }

    public final void run()
    {
        synchronized (lhu.a(a))
        {
            Intent intent = new Intent("com.google.android.location.places.METHOD_CALL");
            intent.setPackage("com.google.android.gms");
            intent.putStringArrayListExtra("PLACE_IDS", lhu.b(a));
            intent.putStringArrayListExtra("METHOD_NAMES", lhu.c(a));
            intent.putExtra("PACKAGE_NAME", lhu.d(a).getPackageName());
            intent.putExtra("CLIENT_VERSION", jxz.a);
            lhu.d(a).sendBroadcast(intent);
            lhu.a(a, null);
            lhu.b(a, null);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
