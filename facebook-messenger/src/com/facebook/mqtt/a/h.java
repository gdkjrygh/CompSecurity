// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt.a;

import com.facebook.mqtt.messages.a;
import com.facebook.mqtt.messages.b;
import com.facebook.mqtt.messages.c;
import com.facebook.mqtt.messages.d;
import com.facebook.mqtt.messages.f;
import com.facebook.mqtt.messages.j;
import com.facebook.mqtt.messages.k;
import com.facebook.mqtt.messages.l;
import com.facebook.mqtt.messages.m;
import com.facebook.mqtt.messages.n;
import com.facebook.mqtt.messages.o;
import com.facebook.mqtt.messages.p;
import com.facebook.mqtt.messages.q;
import com.facebook.mqtt.messages.r;
import com.facebook.mqtt.messages.s;
import com.facebook.mqtt.messages.u;
import com.facebook.mqtt.messages.v;
import com.facebook.mqtt.messages.w;

// Referenced classes of package com.facebook.mqtt.a:
//            i

public class h
{

    public h()
    {
    }

    public l a(com.facebook.mqtt.messages.h h1, Object obj, Object obj1)
    {
        switch (com.facebook.mqtt.a.i.a[h1.a().ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown message type: ").append(h1.a().toString()).toString());

        case 1: // '\001'
            return new c(h1, (f)obj, (d)obj1);

        case 2: // '\002'
            return new a(h1, (b)obj);

        case 3: // '\003'
            return new r(h1, (j)obj, (s)obj1);

        case 4: // '\004'
            return new p(h1, (j)obj, (q)obj1);

        case 5: // '\005'
            return new v(h1, (j)obj, (w)obj1);

        case 6: // '\006'
            return new n(h1, (o)obj, (byte[])(byte[])obj1);

        case 7: // '\007'
            return new l(h1, null, null);

        case 8: // '\b'
            return new l(h1, null, null);

        case 9: // '\t'
            return new l(h1, null, null);

        case 10: // '\n'
            return new m(h1, (j)obj);

        case 11: // '\013'
            return new u(h1, (j)obj);
        }
    }
}
