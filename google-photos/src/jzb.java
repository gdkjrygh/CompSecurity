// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

public abstract class jzb extends jyy
    implements jzc, kad
{

    final jym f;
    private AtomicReference g;

    public jzb(jym jym1, jyn jyn1)
    {
        super(((jyn)b.f(jyn1, "GoogleApiClient must not be null")).a());
        g = new AtomicReference();
        f = (jym)b.d(jym1);
    }

    private void a(RemoteException remoteexception)
    {
        c(new Status(8, remoteexception.getLocalizedMessage(), null));
    }

    public final void a(Object obj)
    {
        super.a((jyw)obj);
    }

    public abstract void a(jyl jyl);

    public final void a(kac kac1)
    {
        g.set(kac1);
    }

    public final void b(jyl jyl)
    {
        try
        {
            a(jyl);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (jyl jyl)
        {
            a(jyl);
            throw jyl;
        }
        // Misplaced declaration of an exception variable
        catch (jyl jyl)
        {
            a(jyl);
        }
    }

    public final void c(Status status)
    {
        boolean flag;
        if (!status.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.b(flag, "Failed result must not be success");
        a(a(status));
    }

    protected final void d()
    {
        kac kac1 = (kac)g.getAndSet(null);
        if (kac1 != null)
        {
            kac1.a(this);
        }
    }

    public final jym e()
    {
        return f;
    }

    public int f()
    {
        return 0;
    }
}
