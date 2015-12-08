// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.wearable.a;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aw, ao, x

public final class ax
    implements com.google.android.gms.wearable.a
{
    public static final class a
        implements com.google.android.gms.wearable.b
    {

        private final String a;
        private final Set b;

        public final String a()
        {
            return a;
        }

        public final Set b()
        {
            return b;
        }

        public a(com.google.android.gms.wearable.b b1)
        {
            this(b1.a(), b1.b());
        }

        private a(String s, Set set)
        {
            a = s;
            b = set;
        }
    }

    public static final class b
        implements com.google.android.gms.wearable.a.b
    {

        private final com.google.android.gms.wearable.b a;
        private final Status b;

        public final com.google.android.gms.wearable.b a()
        {
            return a;
        }

        public final Status getStatus()
        {
            return b;
        }

        public b(Status status, com.google.android.gms.wearable.b b1)
        {
            b = status;
            a = b1;
        }
    }


    public ax()
    {
    }

    public final e a(c c1, String s)
    {
        return c1.a(new aw(c1, s) {

            final String b;
            final int c = 1;
            final ax d;

            protected final g a(Status status)
            {
                return new b(status, null);
            }

            protected final void a(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                b1 = (ao)b1;
                String s1 = b;
                int i = c;
                ((x)b1.n()).a(new an.c(this), s1, i);
            }

            
            {
                d = ax.this;
                b = s;
                super(c1);
            }
        });
    }
}
