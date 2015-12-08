// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.tagmanager.ak;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ip, kc, jx, kd, 
//            ka, io

public abstract class km
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/internal/km$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("NOT_AVAILABLE", 0);
            b = new a("IO_ERROR", 1);
            c = new a("SERVER_ERROR", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private kc a;
    private ka b;
    private io c;

    public km(kc kc1, ka ka1)
    {
        this(kc1, ka1, ip.d());
    }

    private km(kc kc1, ka ka1, io io1)
    {
        boolean flag = true;
        super();
        if (kc1.a().size() != 1)
        {
            flag = false;
        }
        y.b(flag);
        a = kc1;
        b = ka1;
        c = io1;
    }

    protected abstract void a(kd kd1);

    public final void a(a a1)
    {
        ak.a((new StringBuilder("ResourceManager: Failed to download a resource: ")).append(a1.name()).toString());
        a1 = (jx)a.a().get(0);
        a(new kd(new kd.a(Status.c, a1, kd.a.a.a)));
    }

    public final void a(byte abyte0[])
    {
        Object obj;
        jx jx1;
        kd.a.a a1;
        long l;
        long l1;
        (new StringBuilder("ResourceManager: Resource downloaded from Network: ")).append(a.b());
        ak.b();
        jx1 = (jx)a.a().get(0);
        a1 = kd.a.a.a;
        obj = null;
        l1 = 0L;
        l = l1;
        Object obj1 = b.a(abyte0);
        l = l1;
        obj = obj1;
        l1 = c.a();
        if (obj1 == null)
        {
            l = l1;
            obj = obj1;
            try
            {
                ak.c("Parsed resource from network is null");
            }
            catch (ke.g g)
            {
                ak.c("Resource from network is corrupted");
                g = ((ke.g) (obj));
                l1 = l;
            }
        }
        if (obj1 != null)
        {
            abyte0 = new kd.a(Status.a, jx1, abyte0, (ke.c)obj1, a1, l1);
        } else
        {
            abyte0 = new kd.a(Status.c, jx1, kd.a.a.a);
        }
        a(new kd(abyte0));
        return;
    }
}
