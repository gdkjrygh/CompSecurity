// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client.a;

import com.github.nkzawa.f.a;

// Referenced classes of package com.github.nkzawa.engineio.client.a:
//            b

final class a
    implements Runnable
{

    final Object a[];
    final b b;

    public final void run()
    {
        Object obj;
        if (a.length > 0)
        {
            obj = a[0];
        } else
        {
            obj = null;
        }
        if (obj instanceof String)
        {
            b.b.a((String)obj);
        } else
        if (obj instanceof byte[])
        {
            b.b.a((byte[])(byte[])obj);
            return;
        }
    }

    ( , Object aobj[])
    {
        b = ;
        a = aobj;
        super();
    }

    // Unreferenced inner class com/github/nkzawa/engineio/client/a/b$5

/* anonymous class */
    final class b._cls5
        implements com.github.nkzawa.b.a.a
    {

        final b a;
        final b b;

        public final transient void a(Object aobj[])
        {
            com.github.nkzawa.f.a.a(new b._cls5._cls1(this, aobj));
        }

            
            {
                b = b1;
                a = b2;
                super();
            }
    }

}
