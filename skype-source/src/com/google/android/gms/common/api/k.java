// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.y;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api:
//            i, c, Status, g

public final class k
{
    public static abstract class a extends i
        implements b, o.e
    {

        private final a.c b;
        private AtomicReference c;

        private void a(RemoteException remoteexception)
        {
            c(new Status(remoteexception.getLocalizedMessage()));
        }

        protected abstract void a(a.b b1)
            throws RemoteException;

        public final void a(o.d d)
        {
            c.set(d);
        }

        public final void a(Object obj)
        {
            super.a((g)obj);
        }

        protected final void b()
        {
            o.d d = (o.d)c.getAndSet(null);
            if (d != null)
            {
                d.a(this);
            }
        }

        public final void b(a.b b1)
            throws DeadObjectException
        {
            try
            {
                a(b1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (a.b b1)
            {
                a(b1);
                throw b1;
            }
            // Misplaced declaration of an exception variable
            catch (a.b b1)
            {
                a(b1);
            }
        }

        public final a.c c()
        {
            return b;
        }

        public final void c(Status status)
        {
            boolean flag;
            if (!status.d())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            y.b(flag, "Failed result must not be success");
            a(a(status));
        }

        protected a(a.c c1, c c2)
        {
            super(((c)y.a(c2, "GoogleApiClient must not be null")).a());
            c = new AtomicReference();
            b = (a.c)y.a(c1);
        }
    }

    public static interface b
    {

        public abstract void a(Object obj);
    }

}
