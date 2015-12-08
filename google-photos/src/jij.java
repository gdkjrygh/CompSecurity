// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class jij extends Handler
{

    private jii a;

    jij(jii jii1)
    {
        a = jii1;
        super();
    }

    public final void handleMessage(Message message)
    {
        Object obj = a;
        message.what;
        JVM INSTR tableswitch 1 4: default 40
    //                   1 41
    //                   2 109
    //                   3 159
    //                   4 210;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        System.arraycopy(message.obj, 0, ((jii) (obj)).b, 0, ((jii) (obj)).b.length);
        obj.d = message.arg1;
        message = ((jii) (obj)).a.iterator();
        while (message.hasNext()) 
        {
            ((jih)message.next()).a(((jii) (obj)).c, ((jii) (obj)).d);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        obj.d = message.arg1;
        message = ((jii) (obj)).a.iterator();
        while (message.hasNext()) 
        {
            ((jih)message.next()).a(((jii) (obj)).c, ((jii) (obj)).d);
        }
        if (true) goto _L1; else goto _L4
_L4:
        obj.e = ((jii) (obj)).e - 1;
        if (((jii) (obj)).e == 0)
        {
            message = ((jii) (obj)).a.iterator();
            while (message.hasNext()) 
            {
                ((jih)message.next()).z_();
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        message = (jie)message.obj;
        obj = ((jii) (obj)).a.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            ((jih)((Iterator) (obj)).next()).a(message);
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
