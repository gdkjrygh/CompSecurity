// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.service;

import android.os.IBinder;
import android.os.RemoteCallbackList;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;

public class b
    implements com.qihoo.security.clearengine.a.b
{

    private RemoteCallbackList a;
    private Object b;

    public b(Object obj)
    {
        a = new RemoteCallbackList();
        b = obj;
    }

    public void a()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        int j = a.beginBroadcast();
        int i = 0;
          goto _L1
_L2:
        a.finishBroadcast();
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        ((com.qihoo.security.clearengine.a.b)a.getBroadcastItem(i)).a();
        i++;
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
        break; /* Loop/switch isn't completed */
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L1:
        if (i < j) goto _L3; else goto _L2
    }

    public void a(int i)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        int k = a.beginBroadcast();
        int j = 0;
          goto _L1
_L2:
        a.finishBroadcast();
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        ((com.qihoo.security.clearengine.a.b)a.getBroadcastItem(j)).a(i);
        j++;
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
        break; /* Loop/switch isn't completed */
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L1:
        if (j < k) goto _L3; else goto _L2
    }

    public void a(int i, int j, TrashInfo trashinfo)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        int l = a.beginBroadcast();
        int k = 0;
          goto _L1
_L2:
        a.finishBroadcast();
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        ((com.qihoo.security.clearengine.a.b)a.getBroadcastItem(k)).a(i, j, trashinfo);
        k++;
        continue; /* Loop/switch isn't completed */
        trashinfo;
        trashinfo.printStackTrace();
        break; /* Loop/switch isn't completed */
        trashinfo;
        obj;
        JVM INSTR monitorexit ;
        throw trashinfo;
_L1:
        if (k < l) goto _L3; else goto _L2
    }

    public void a(com.qihoo.security.clearengine.a.b b1)
    {
        if (b1 != null)
        {
            a.register(b1);
        }
    }

    public IBinder asBinder()
    {
        return null;
    }

    public void b(com.qihoo.security.clearengine.a.b b1)
    {
        if (b1 != null)
        {
            a.unregister(b1);
        }
    }
}
