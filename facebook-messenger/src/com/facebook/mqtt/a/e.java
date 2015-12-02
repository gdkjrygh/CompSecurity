// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt.a;

import com.facebook.mqtt.messages.b;
import com.facebook.mqtt.messages.f;
import com.facebook.mqtt.messages.g;
import com.facebook.mqtt.messages.h;
import com.facebook.mqtt.messages.j;
import com.facebook.mqtt.messages.k;
import com.facebook.mqtt.messages.o;
import java.io.DataInputStream;
import java.io.IOException;

// Referenced classes of package com.facebook.mqtt.a:
//            c, b

class e extends c
{

    e(h h1, int i)
    {
        super(h1, i);
    }

    static Object a(e e1, DataInputStream datainputstream)
    {
        return e1.c(datainputstream);
    }

    private Object c(DataInputStream datainputstream)
    {
        switch (b.a[a.a().ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return d(datainputstream);

        case 2: // '\002'
            return e(datainputstream);

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            return f(datainputstream);

        case 8: // '\b'
            return g(datainputstream);
        }
    }

    private f d(DataInputStream datainputstream)
    {
        boolean flag1 = true;
        if (!"MQIsdp".equals(a(datainputstream)))
        {
            datainputstream.close();
            throw new IOException("Invalid input - missing header");
        }
        byte byte0 = datainputstream.readByte();
        int i = datainputstream.readUnsignedByte();
        b = b - 2;
        int l = b(datainputstream);
        datainputstream = new g();
        datainputstream.a(byte0);
        boolean flag;
        if ((i & 0x80) == 128)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        datainputstream.a(flag);
        if ((i & 0x40) == 64)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        datainputstream.b(flag);
        if ((i & 0x20) == 32)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        datainputstream.d(flag);
        datainputstream.b((i & 0x18) >> 3);
        if ((i & 4) == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        datainputstream.c(flag);
        if ((i & 2) == 2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        datainputstream.e(flag);
        datainputstream.c(l);
        return datainputstream.i();
    }

    private b e(DataInputStream datainputstream)
    {
        datainputstream.readUnsignedByte();
        byte byte0 = datainputstream.readByte();
        b = b - 2;
        return new b(byte0);
    }

    private j f(DataInputStream datainputstream)
    {
        return new j(b(datainputstream));
    }

    private o g(DataInputStream datainputstream)
    {
        String s = a(datainputstream);
        int i = -1;
        if (a.c() > 0)
        {
            i = b(datainputstream);
        }
        return new o(s, i);
    }
}
