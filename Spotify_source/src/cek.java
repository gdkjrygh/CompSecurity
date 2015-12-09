// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.internal.zzk;

final class cek
    implements Runnable
{

    private final zzk a;
    private final cnb b;
    private final Runnable c;

    public cek(zzk zzk1, cnb cnb1, Runnable runnable)
    {
        a = zzk1;
        b = cnb1;
        c = runnable;
    }

    public final void run()
    {
        boolean flag;
        if (b.c == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a.a(b.a);
        } else
        {
            zzk zzk1 = a;
            com.google.android.gms.internal.zzr zzr = b.c;
            if (zzk1.c != null)
            {
                zzk1.c.a(zzr);
            }
        }
        if (b.d)
        {
            a.a("intermediate-response");
        } else
        {
            a.b("done");
        }
        if (c != null)
        {
            c.run();
        }
    }
}
