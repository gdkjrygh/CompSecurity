// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import com.android.volley.VolleyError;
import com.tinder.a.f;
import com.tinder.managers.ae;
import com.tinder.managers.d;

// Referenced classes of package com.tinder.utils:
//            v

public final class n
{

    public f a;
    private ae b;
    private d c;

    public n(ae ae, d d, f f)
    {
        b = ae;
        c = d;
        a = f;
    }

    // Unreferenced inner class com/tinder/utils/n$1

/* anonymous class */
    public final class _cls1
        implements com.android.volley.i.b
    {

        final n a;

        public final void a(Object obj)
        {
            ae.b(true);
        }

            public 
            {
                a = n.this;
                super();
            }
    }


    // Unreferenced inner class com/tinder/utils/n$2

/* anonymous class */
    public final class _cls2
        implements com.android.volley.i.a
    {

        final n a;

        public final void a(VolleyError volleyerror)
        {
            v.b((new StringBuilder("error registering push with Tinder backend: ")).append(volleyerror).append(", ").append(volleyerror.getMessage()).append(", ").append(volleyerror.a).toString());
            ae.b(false);
        }

            public 
            {
                a = n.this;
                super();
            }
    }


    // Unreferenced inner class com/tinder/utils/n$3

/* anonymous class */
    public final class _cls3
        implements com.android.volley.i.b
    {

        final n a;

        public final void a(Object obj)
        {
            ae.b(false);
        }

            public 
            {
                a = n.this;
                super();
            }
    }


    // Unreferenced inner class com/tinder/utils/n$4

/* anonymous class */
    public final class _cls4
        implements com.android.volley.i.a
    {

        final n a;

        public final void a(VolleyError volleyerror)
        {
            v.b((new StringBuilder("error unregistering push with Tinder backend: ")).append(volleyerror).append(", ").append(volleyerror.getMessage()).append(", ").append(volleyerror.a).toString());
            ae.b(false);
        }

            public 
            {
                a = n.this;
                super();
            }
    }

}
