// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.m4b.maps.j.x;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.m4b.maps.h:
//            a, d, q

public final class c
{
    public static abstract class a extends com.google.android.m4b.maps.h.a
        implements h.e
    {

        final b.c a;
        private AtomicReference b;

        private void a(RemoteException remoteexception)
        {
            c(new q(remoteexception.getLocalizedMessage()));
        }

        public abstract void a(b.a a1);

        public final void a(h.c c1)
        {
            b.set(c1);
        }

        public final b.c b()
        {
            return a;
        }

        public final void b(b.a a1)
        {
            try
            {
                a(a1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (b.a a1)
            {
                a(a1);
                throw a1;
            }
            // Misplaced declaration of an exception variable
            catch (b.a a1)
            {
                a(a1);
            }
        }

        public final void c(q q1)
        {
            boolean flag1 = true;
            boolean flag;
            if (q1.f <= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                flag1 = false;
            }
            x.b(flag1, "Failed result must not be success");
            a(a(q1));
        }

        public a(b.c c1, d d1)
        {
            super(((d)x.a(d1, "GoogleApiClient must not be null")).a());
            b = new AtomicReference();
            a = (b.c)x.a(c1);
        }
    }

}
