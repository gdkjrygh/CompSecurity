// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.a.b;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
import rx.R;
import rx.Y;
import rx.h.f;
import rx.internal.c.d;

// Referenced classes of package rx.a.b:
//            c

public final class b extends R
{
    static final class a extends rx.R.a
    {

        final Handler a;
        private final rx.h.b b = new rx.h.b();

        public final Y a(rx.b.a a1)
        {
            return a(a1, 0L, TimeUnit.MILLISECONDS);
        }

        public final Y a(rx.b.a a1, long l, TimeUnit timeunit)
        {
            if (b.isUnsubscribed())
            {
                return f.b();
            } else
            {
                rx.a.a.a.a().b();
                a1 = new d(rx.a.a.b.a(a1));
                a1.a(b);
                b.a(a1);
                a.postDelayed(a1, timeunit.toMillis(l));
                a1.a(f.a(new c(this, a1)));
                return a1;
            }
        }

        public final boolean isUnsubscribed()
        {
            return b.isUnsubscribed();
        }

        public final void unsubscribe()
        {
            b.unsubscribe();
        }

        a(Handler handler)
        {
            a = handler;
        }
    }


    private final Handler a;

    b(Handler handler)
    {
        a = handler;
    }

    public final rx.R.a a()
    {
        return new a(a);
    }
}
