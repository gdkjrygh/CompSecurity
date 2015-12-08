// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;

import java.util.concurrent.TimeUnit;
import rx.R;
import rx.Y;
import rx.h.f;

// Referenced classes of package rx.f:
//            j

public final class g extends R
{
    private final class a extends rx.R.a
        implements Y
    {

        final rx.h.a a;
        final g b;

        public final Y a(rx.b.a a1)
        {
            a1.call();
            return f.b();
        }

        public final Y a(rx.b.a a1, long l, TimeUnit timeunit)
        {
            return a(((rx.b.a) (new j(a1, this, System.currentTimeMillis() + timeunit.toMillis(l)))));
        }

        public final boolean isUnsubscribed()
        {
            return a.isUnsubscribed();
        }

        public final void unsubscribe()
        {
            a.unsubscribe();
        }

        private a()
        {
            b = g.this;
            super();
            a = new rx.h.a();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final g a = new g();

    g()
    {
    }

    static g b()
    {
        return a;
    }

    public final rx.R.a a()
    {
        return new a((byte)0);
    }

}
