// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.TimeUnit;

public final class hqo
{

    static final long a;
    final android.os.PowerManager.WakeLock b;
    public volatile boolean c;
    volatile boolean d;

    hqo(Context context, int i)
    {
        context = (PowerManager)context.getSystemService("power");
        String s = String.valueOf("wake:Scheduler||");
        b = context.newWakeLock(1, (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString());
        b.setReferenceCounted(false);
    }

    public final void a()
    {
        b.release();
        d = false;
    }

    static 
    {
        a = TimeUnit.MINUTES.toMillis(10L);
    }
}
