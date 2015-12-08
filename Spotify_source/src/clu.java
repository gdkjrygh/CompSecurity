// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

public abstract class clu extends clw
    implements clv, cmp
{

    private AtomicReference a;
    final bqs b;

    public clu(bqs bqs1, bqu bqu1)
    {
        super(((bqu)btl.a(bqu1, "GoogleApiClient must not be null")).a());
        a = new AtomicReference();
        b = (bqs)btl.a(bqs1);
    }

    private void a(RemoteException remoteexception)
    {
        c(new Status(remoteexception.getLocalizedMessage()));
    }

    public abstract void a(bqr bqr);

    public final void a(cmo cmo1)
    {
        a.set(cmo1);
    }

    public final void a(Object obj)
    {
        super.a((brc)obj);
    }

    public final void b(bqr bqr)
    {
        try
        {
            a(bqr);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bqr bqr)
        {
            a(bqr);
            throw bqr;
        }
        // Misplaced declaration of an exception variable
        catch (bqr bqr)
        {
            a(bqr);
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
        btl.b(flag, "Failed result must not be success");
        a(a(status));
    }

    public final bqs d()
    {
        return b;
    }

    protected final void e()
    {
        cmo cmo1 = (cmo)a.getAndSet(null);
        if (cmo1 != null)
        {
            cmo1.a(this);
        }
    }
}
