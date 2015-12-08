// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.u;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.internal:
//            dh

public final class dg
{
    public static abstract class a extends dh
        implements b, dl.f
    {

        final com.google.android.gms.common.api.a.c a;
        private AtomicReference c;

        private void a(RemoteException remoteexception)
        {
            a(new Status(remoteexception.getLocalizedMessage()));
        }

        public final void a(Status status)
        {
            boolean flag;
            if (!status.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.b(flag, "Failed result must not be success");
            a(c(status));
        }

        public final void a(com.google.android.gms.common.api.a.b b1)
            throws DeadObjectException
        {
            try
            {
                b(b1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.common.api.a.b b1)
            {
                a(((RemoteException) (b1)));
                throw b1;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.common.api.a.b b1)
            {
                a(((RemoteException) (b1)));
            }
        }

        public final void a(dl.e e)
        {
            c.set(e);
        }

        public final void a(Object obj)
        {
            super.a((f)obj);
        }

        public final com.google.android.gms.common.api.a.c b()
        {
            return a;
        }

        public abstract void b(com.google.android.gms.common.api.a.b b1)
            throws RemoteException;

        public final void c()
        {
            a(((com.google.android.gms.common.api.g) (null)));
        }

        protected final void d()
        {
            dl.e e = (dl.e)c.getAndSet(null);
            if (e != null)
            {
                e.a(this);
            }
        }

        public a(com.google.android.gms.common.api.a.c c1, c c2)
        {
            super(((c)u.a(c2, "GoogleApiClient must not be null")).a());
            c = new AtomicReference();
            a = (com.google.android.gms.common.api.a.c)u.a(c1);
        }
    }

    public static interface b
    {

        public abstract void a(Object obj);
    }

}
