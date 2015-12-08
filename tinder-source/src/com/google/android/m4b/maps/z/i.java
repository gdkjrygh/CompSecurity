// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.y.q;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.android.m4b.maps.z:
//            j, h

final class i
{
    static final class a extends AtomicLong
        implements h
    {

        public final void a()
        {
            getAndIncrement();
        }

        public final void a(long l)
        {
            getAndAdd(l);
        }

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final q a;

    public static h a()
    {
        return (h)a.a();
    }

    static 
    {
        q q1;
        try
        {
            new j();
            q1 = new q() {

                public final Object a()
                {
                    return new j();
                }

            };
        }
        catch (Throwable throwable)
        {
            throwable = new q() {

                public final Object a()
                {
                    return new a((byte)0);
                }

            };
        }
        a = q1;
    }
}
