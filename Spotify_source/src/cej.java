// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.gms.internal.zzk;
import com.google.android.gms.internal.zzr;
import java.util.concurrent.Executor;

public final class cej
    implements cnw
{

    private final Executor a;

    public cej(Handler handler)
    {
        a = new Executor(handler) {

            private Handler a;

            public final void execute(Runnable runnable)
            {
                a.post(runnable);
            }

            
            {
                a = handler;
                super();
            }
        };
    }

    public final void a(zzk zzk1, cnb cnb1)
    {
        a(zzk1, cnb1, null);
    }

    public final void a(zzk zzk1, cnb cnb1, Runnable runnable)
    {
        zzk1.g = true;
        zzk1.a("post-response");
        a.execute(new cek(zzk1, cnb1, runnable));
    }

    public final void a(zzk zzk1, zzr zzr)
    {
        zzk1.a("post-error");
        zzr = new cnb(zzr);
        a.execute(new cek(zzk1, zzr, null));
    }
}
