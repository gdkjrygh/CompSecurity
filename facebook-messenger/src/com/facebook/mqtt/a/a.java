// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt.a;

import com.facebook.mqtt.messages.h;
import com.facebook.mqtt.messages.i;
import com.facebook.mqtt.messages.k;
import com.facebook.mqtt.messages.l;
import com.google.common.base.Preconditions;
import java.io.DataInputStream;
import java.io.IOException;

// Referenced classes of package com.facebook.mqtt.a:
//            e, d, h

public class a
{

    private final com.facebook.mqtt.a.h a;
    private DataInputStream b;

    public a(com.facebook.mqtt.a.h h1)
    {
        a = h1;
    }

    private h b()
    {
        int l = 1;
        int i1 = 0;
        int l1 = b.readUnsignedByte();
        k k1 = k.fromInt(l1 >> 4);
        i j;
        int j1;
        int i2;
        boolean flag;
        boolean flag1;
        if ((l1 & 8) == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((l1 & 1) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        do
        {
            i2 = b.readUnsignedByte();
            j1 = i1 + (i2 & 0x7f) * l;
            l *= 128;
            i1 = j1;
        } while ((i2 & 0x80) != 0);
        j = new i();
        j.a(k1);
        j.a(flag);
        j.a((l1 & 6) >> 1);
        j.b(flag1);
        j.b(j1);
        return j.f();
    }

    public l a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Stream not initialized");
        obj = b();
        obj2 = new e(((h) (obj)), ((h) (obj)).e());
        obj1 = e.a(((e) (obj2)), b);
        obj2 = new d(((h) (obj)), obj1, ((e) (obj2)).b);
        obj3 = d.a(((d) (obj2)), b);
        if (((d) (obj2)).b != 0)
        {
            throw new IOException("Unexpected bytes remaining in payload");
        }
        break MISSING_BLOCK_LABEL_98;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj = a.a(((h) (obj)), obj1, obj3);
        this;
        JVM INSTR monitorexit ;
        return ((l) (obj));
    }

    public void a(DataInputStream datainputstream)
    {
        b = datainputstream;
    }
}
