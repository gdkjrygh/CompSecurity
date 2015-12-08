// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.nielsen.app.sdk:
//            a, AppCache, AppConfig, e, 
//            d, c

class g
{

    private e a;
    private AppCache b;

    public g()
    {
        a = null;
        b = null;
        a = com.nielsen.app.sdk.a.s();
        b = com.nielsen.app.sdk.a.o();
    }

    public boolean a()
    {
        long l = -1L;
        AppConfig appconfig = com.nielsen.app.sdk.a.n();
        if (b.c() <= 0L) goto _L2; else goto _L1
_L1:
        List list;
        Iterator iterator;
        list = b.a(0, true);
        iterator = list.iterator();
_L15:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        AppCache.ProcessorData processordata;
        char ac[];
        processordata = (AppCache.ProcessorData)iterator.next();
        ac = new char[1];
        ac[0] = ' ';
        Iterator iterator1;
        int i;
        l = appconfig.a(processordata.getTimestamp(), ac);
        processordata.setTimeBase(ac[0]);
        processordata.setTimestamp(l);
        i = processordata.getMessage();
        iterator1 = a.d().iterator();
_L9:
        if (!iterator1.hasNext()) goto _L6; else goto _L5
_L5:
        d d1 = (d)iterator1.next();
        if (d1 != null) goto _L8; else goto _L7
_L7:
        c.a(8, 'E', "Could not send data(%s), it is not available", new Object[] {
            processordata.getData()
        });
          goto _L9
        Exception exception;
        exception;
        c.a(exception, true, 'E', "An exception occurred while executing processing data on the SESSION table", new Object[0]);
_L2:
        return false;
_L8:
        int j = d1.b();
        i;
        JVM INSTR tableswitch 0 5: default 311
    //                   0 256
    //                   1 256
    //                   2 256
    //                   3 314
    //                   4 343
    //                   5 256;
           goto _L10 _L11 _L11 _L11 _L12 _L13 _L11
_L11:
        break MISSING_BLOCK_LABEL_256;
_L10:
        c.a(8, 'W', "Inexpected message type (%s)", new Object[] {
            Integer.valueOf(i)
        });
          goto _L9
_L14:
        d1.d().put(processordata);
          goto _L9
_L16:
        if (d1.g()) goto _L14; else goto _L9
_L6:
        l = processordata.getKey();
          goto _L15
_L4:
        b.a(0, l);
        list.clear();
        return true;
_L12:
        j;
        JVM INSTR tableswitch 2 3: default 340
    //                   2 256
    //                   3 256;
           goto _L9 _L14 _L14
_L13:
        j;
        JVM INSTR lookupswitch 2: default 372
    //                   1: 271
    //                   6: 271;
           goto _L9 _L16 _L16
    }

    public void b()
    {
        b = com.nielsen.app.sdk.a.o();
        if (b.c() > 0L)
        {
            c.a('W', "SESSION table is NOT empty yet", new Object[0]);
            (new Thread(new Runnable() {

                final g a;

                public void run()
                {
                    a.a();
                }

            
            {
                a = g.this;
                super();
            }
            })).start();
            return;
        } else
        {
            c.a('I', "SESSION table is now empty", new Object[0]);
            return;
        }
    }
}
