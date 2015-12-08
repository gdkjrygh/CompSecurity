// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.wearable.j;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aw, ao, x

public final class z
    implements j
{
    private static final class a extends aw
    {

        private com.google.android.gms.wearable.j.a b;
        private IntentFilter c[];

        public final g a(Status status)
        {
            b = null;
            c = null;
            return status;
        }

        protected final volatile void a(com.google.android.gms.common.api.a.b b1)
            throws RemoteException
        {
            ((ao)b1).a(this, b, c);
            b = null;
            c = null;
        }

        private a(c c1, com.google.android.gms.wearable.j.a a1)
        {
            super(c1);
            b = a1;
            c = null;
        }

        a(c c1, com.google.android.gms.wearable.j.a a1, byte byte0)
        {
            this(c1, a1);
        }
    }

    public static final class b
        implements com.google.android.gms.wearable.j.b
    {

        private final Status a;
        private final int b;

        public final int getRequestId()
        {
            return b;
        }

        public final Status getStatus()
        {
            return a;
        }

        public b(Status status, int i)
        {
            a = status;
            b = i;
        }
    }


    public z()
    {
    }

    public final e a(c c1, com.google.android.gms.wearable.j.a a1)
    {
        return c1.a(new a(c1, a1, (byte)0));
    }

    public final e a(c c1, String s, String s1)
    {
        return c1.a(new aw(c1, s, s1) {

            final String b;
            final String c;
            final byte d[] = null;
            final z e;

            protected final g a(Status status)
            {
                return new b(status, -1);
            }

            protected final void a(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                b1 = (ao)b1;
                String s2 = b;
                String s3 = c;
                byte abyte0[] = d;
                ((x)b1.n()).a(new an.h(this), s2, s3, abyte0);
            }

            
            {
                e = z.this;
                b = s;
                c = s1;
                super(c1);
            }
        });
    }
}
