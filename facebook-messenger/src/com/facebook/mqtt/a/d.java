// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt.a;

import com.facebook.mqtt.messages.SubscribeTopic;
import com.facebook.mqtt.messages.e;
import com.facebook.mqtt.messages.f;
import com.facebook.mqtt.messages.h;
import com.facebook.mqtt.messages.k;
import com.facebook.mqtt.messages.q;
import com.facebook.mqtt.messages.s;
import com.facebook.mqtt.messages.w;
import com.google.common.a.hq;
import java.io.DataInputStream;
import java.util.List;

// Referenced classes of package com.facebook.mqtt.a:
//            c, b

class d extends c
{

    private Object c;

    d(h h1, Object obj, int i)
    {
        super(h1, i);
        c = obj;
    }

    static Object a(d d1, DataInputStream datainputstream)
    {
        return d1.c(datainputstream);
    }

    private Object c(DataInputStream datainputstream)
    {
        switch (b.a[a.a().ordinal()])
        {
        case 2: // '\002'
        case 6: // '\006'
        case 7: // '\007'
        default:
            return null;

        case 1: // '\001'
            return d(datainputstream);

        case 3: // '\003'
            return e(datainputstream);

        case 5: // '\005'
            return f(datainputstream);

        case 4: // '\004'
            return g(datainputstream);

        case 8: // '\b'
            return h(datainputstream);
        }
    }

    private com.facebook.mqtt.messages.d d(DataInputStream datainputstream)
    {
        String s4 = null;
        f f1 = (f)c;
        String s6 = a(datainputstream);
        String s2;
        String s3;
        String s5;
        if (f1.d())
        {
            s3 = a(datainputstream);
            s2 = a(datainputstream);
        } else
        {
            s2 = null;
            s3 = null;
        }
        if (b > 0)
        {
            String s1;
            if (f1.b())
            {
                s1 = a(datainputstream);
            } else
            {
                s1 = null;
            }
            s5 = s1;
            if (f1.c())
            {
                s4 = a(datainputstream);
                s5 = s1;
            }
        } else
        {
            s5 = null;
        }
        datainputstream = new e();
        datainputstream.a(s6);
        datainputstream.b(s3);
        datainputstream.c(s2);
        datainputstream.d(s5);
        datainputstream.e(s4);
        return datainputstream.f();
    }

    private s e(DataInputStream datainputstream)
    {
        java.util.ArrayList arraylist = hq.a();
        while (b > 0) 
        {
            String s1 = a(datainputstream);
            int i = datainputstream.readUnsignedByte();
            b = b - 1;
            arraylist.add(new SubscribeTopic(s1, i));
        }
        return new s(arraylist);
    }

    private q f(DataInputStream datainputstream)
    {
        java.util.ArrayList arraylist = hq.a();
        while (b > 0) 
        {
            int i = datainputstream.readUnsignedByte();
            b = b - 1;
            arraylist.add(Integer.valueOf(i & -4));
        }
        return new q(arraylist);
    }

    private w g(DataInputStream datainputstream)
    {
        java.util.ArrayList arraylist = hq.a();
        while (b > 0) 
        {
            arraylist.add(a(datainputstream));
        }
        return new w(arraylist);
    }

    private byte[] h(DataInputStream datainputstream)
    {
        byte abyte0[] = new byte[b];
        datainputstream.readFully(abyte0);
        b = 0;
        return abyte0;
    }
}
