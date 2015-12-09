// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.wire.Message;
import com.squareup.wire.MessageAdapter;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class gxt
{

    public final gxb a;
    private final Map b;
    private final Map c;
    private final Map d;

    private gxt(List list)
    {
        Iterator iterator;
        b = new LinkedHashMap();
        c = new LinkedHashMap();
        d = new LinkedHashMap();
        a = new gxb();
        iterator = list.iterator();
_L4:
        Field afield[];
        int i;
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_269;
        }
        afield = ((Class)iterator.next()).getDeclaredFields();
        j = afield.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        list = afield[i];
        if (!list.getType().equals(gwz))
        {
            break MISSING_BLOCK_LABEL_250;
        }
        Object obj;
        Map map;
        gwz gwz1;
        gxb gxb1;
        Class class1;
        try
        {
            gwz1 = (gwz)list.get(null);
            gxb1 = a;
            class1 = gwz1.a;
            map = (Map)gxb1.a.get(class1);
            obj = (Map)gxb1.b.get(class1);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new AssertionError(list);
        }
        list = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        list = new LinkedHashMap();
        obj = new LinkedHashMap();
        gxb1.a.put(class1, list);
        gxb1.b.put(class1, obj);
        list.put(Integer.valueOf(gwz1.e), gwz1);
        ((Map) (obj)).put(gwz1.d, gwz1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    public transient gxt(Class aclass[])
    {
        this(Arrays.asList(aclass));
    }

    public final Message a(byte abyte0[], Class class1)
    {
        gxh.a(abyte0, "bytes");
        gxh.a(class1, "messageClass");
        abyte0 = gxu.a(abyte0);
        return a(class1).a(abyte0);
    }

    public final MessageAdapter a(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        MessageAdapter messageadapter1 = (MessageAdapter)b.get(class1);
        MessageAdapter messageadapter;
        messageadapter = messageadapter1;
        if (messageadapter1 != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        messageadapter = new MessageAdapter(this, class1);
        b.put(class1, messageadapter);
        this;
        JVM INSTR monitorexit ;
        return messageadapter;
        class1;
        throw class1;
    }

    final gww b(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        gww gww2 = (gww)c.get(class1);
        gww gww1;
        gww1 = gww2;
        if (gww2 != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        gww1 = new gww(class1);
        c.put(class1, gww1);
        this;
        JVM INSTR monitorexit ;
        return gww1;
        class1;
        throw class1;
    }

    public final gwx c(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        gwx gwx2 = (gwx)d.get(class1);
        gwx gwx1;
        gwx1 = gwx2;
        if (gwx2 != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        gwx1 = new gwx(class1);
        d.put(class1, gwx1);
        this;
        JVM INSTR monitorexit ;
        return gwx1;
        class1;
        throw class1;
    }
}
