// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cv;

import android.util.Log;
import com.google.android.m4b.maps.e.c;
import com.google.android.m4b.maps.h.d;
import com.google.android.m4b.maps.h.l;
import com.google.android.m4b.maps.h.q;

// Referenced classes of package com.google.android.m4b.maps.cv:
//            a, b, d

final class b extends b
{

    private final c b;
    private a c;

    protected final l a(q q)
    {
        return q;
    }

    protected final void a(com.google.android.m4b.maps.h. )
    {
         = (b);
        b b1 = new c.a() {

            private a.b a;

            public final void a(q q)
            {
                a.a(q);
            }

            
            {
                a = a.b.this;
                super();
            }
        };
        c c1;
        try
        {
            com.google.android.m4b.maps.cv.a.a(b);
        }
        catch (Throwable throwable)
        {
             = String.valueOf(b.e.toString());
            String s = String.valueOf(throwable.toString());
            Log.e("ClearcutLoggerApiImpl", (new StringBuilder(String.valueOf().length() + 28 + String.valueOf(s).length())).append("MessageNanoProducer ").append().append(" threw: ").append(s).toString());
            return;
        }
        c1 = b;
        ((com.google.android.m4b.maps.cv.d).l()).a(b1, c1);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof b))
        {
            return false;
        } else
        {
            obj = (b)obj;
            return b.equals(((als) (obj)).b);
        }
    }

    public final String toString()
    {
        String s = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 12)).append("MethodImpl(").append(s).append(")").toString();
    }

    <init>(a a1, c c1, d d1)
    {
        c = a1;
        super(d1);
        b = c1;
    }
}
