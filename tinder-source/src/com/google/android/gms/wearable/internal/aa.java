// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.dp;
import com.google.android.gms.wearable.k;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ay, ap, aq, z, 
//            y

public final class aa
    implements k
{
    private static final class a extends ay
    {

        private com.google.android.gms.wearable.k.a c;
        private dp d;
        private IntentFilter e[];

        protected final void b(com.google.android.gms.common.api.a.b b1)
            throws RemoteException
        {
            b1 = (ap)b1;
            com.google.android.gms.wearable.k.a a1 = c;
            dp dp1 = d;
            IntentFilter aintentfilter[] = e;
            ((ap) (b1)).j.a(b1, this, a1, aq.b(dp1, aintentfilter));
            c = null;
            d = null;
            e = null;
        }

        public final f c(Status status)
        {
            c = null;
            d = null;
            e = null;
            return status;
        }

        private a(c c1, com.google.android.gms.wearable.k.a a1, dp dp1)
        {
            super(c1);
            c = (com.google.android.gms.wearable.k.a)u.a(a1);
            d = (dp)u.a(dp1);
            e = null;
        }

        a(c c1, com.google.android.gms.wearable.k.a a1, dp dp1, byte byte0)
        {
            this(c1, a1, dp1);
        }
    }

    public static final class b
        implements com.google.android.gms.wearable.k.b
    {

        private final Status a;
        private final int b;

        public final Status a()
        {
            return a;
        }

        public b(Status status, int i)
        {
            a = status;
            b = i;
        }
    }


    public aa()
    {
    }

    public final d a(c c1, com.google.android.gms.wearable.k.a a1)
    {
        return c1.a(new a(c1, a1, c1.a(a1), (byte)0));
    }

    public final d a(c c1, String s, String s1)
    {
        return c1.a(new ay(c1, s, s1) {

            final String c;
            final String d;
            final byte e[] = null;
            final aa f;

            protected final void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                b1 = (ap)b1;
                String s2 = c;
                String s3 = d;
                byte abyte0[] = e;
                ((y)b1.m()).a(new ao.e(this), s2, s3, abyte0);
            }

            protected final f c(Status status)
            {
                return new b(status, -1);
            }

            
            {
                f = aa.this;
                c = s;
                d = s1;
                super(c1);
            }
        });
    }

    public final d b(c c1, com.google.android.gms.wearable.k.a a1)
    {
        return c1.a(new ay(c1, a1) {

            final com.google.android.gms.wearable.k.a c;
            final aa d;

            protected final void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                b1 = (ap)b1;
                com.google.android.gms.wearable.k.a a2 = c;
                ((ap) (b1)).j.a(b1, this, a2);
            }

            public final f c(Status status)
            {
                return status;
            }

            
            {
                d = aa.this;
                c = a1;
                super(c1);
            }
        });
    }
}
