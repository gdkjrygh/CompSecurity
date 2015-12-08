// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.h;

import rx.Y;
import rx.b.a;

// Referenced classes of package rx.h:
//            a

public final class f
{
    private static final class a
        implements Y
    {

        public final boolean isUnsubscribed()
        {
            return true;
        }

        public final void unsubscribe()
        {
        }

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final a a = new a((byte)0);

    public static Y a()
    {
        return rx.h.a.a();
    }

    public static Y a(rx.b.a a1)
    {
        return rx.h.a.a(a1);
    }

    public static Y b()
    {
        return a;
    }

}
