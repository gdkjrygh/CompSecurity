// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

// Referenced classes of package com.kik.sdkutils:
//            z

public abstract class KikServiceBase extends Service
{
    private final class a extends FutureTask
    {

        final KikServiceBase a;

        public a()
        {
            a = KikServiceBase.this;
            super(new z(KikServiceBase.this), null);
        }
    }

    public final class b extends Binder
    {

        final KikServiceBase a;

        public b()
        {
            a = KikServiceBase.this;
            super();
        }
    }


    private RunnableFuture a;
    private RunnableFuture b;

    public KikServiceBase()
    {
        a = new a();
        b = new a();
    }

    protected abstract void a(Intent intent);

    public IBinder onBind(Intent intent)
    {
        return new b();
    }

    public void onDestroy()
    {
        super.onDestroy();
        a.run();
    }

    public void onStart(Intent intent, int i)
    {
        a(intent);
        b.run();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        a(intent);
        b.run();
        return 1;
    }
}
