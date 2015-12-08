// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client.a;

import com.github.nkzawa.f.a;

// Referenced classes of package com.github.nkzawa.engineio.client.a:
//            b

final class a
    implements com.github.nkzawa.b.io.client.a.b._cls6
{

    final b a;
    final b b;

    public final transient void a(Object aobj[])
    {
        com.github.nkzawa.f.a.a(new Runnable(aobj) {

            final Object a[];
            final b._cls6 b;

            public final void run()
            {
                Exception exception;
                if (a.length > 0 && (a[0] instanceof Exception))
                {
                    exception = (Exception)a[0];
                } else
                {
                    exception = null;
                }
                com.github.nkzawa.engineio.client.a.b.b(b.a, "xhr poll error", exception);
            }

            
            {
                b = b._cls6.this;
                a = aobj;
                super();
            }
        });
    }

    _cls1.a(b b1, b b2)
    {
        b = b1;
        a = b2;
        super();
    }
}
