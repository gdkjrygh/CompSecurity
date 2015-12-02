// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.service;

import android.os.Handler;
import android.os.RemoteException;
import com.qihoo.security.clearengine.a.b;
import com.qihoo.security.clearengine.a.c;
import com.qihoo360.mobilesafe.opti.i.whitelist.IUserBWList;
import com.qihoo360.mobilesafe.opti.i.whitelist.UserBWRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.qihoo.security.clearengine.service:
//            a, b, c

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        com.qihoo.security.clearengine.service.a.b(a(a)).incrementAndGet();
        com.qihoo.security.clearengine.service.a.c(rementAndGet(a)).sendEmptyMessageDelayed(1, 0x927c0L);
        a(a).a();
        com.qihoo.security.clearengine.service.a.c(a(a)).removeMessages(1);
    }

    BWRecord(BWRecord bwrecord)
    {
        a = bwrecord;
        super();
    }

    // Unreferenced inner class com/qihoo/security/clearengine/service/a$2

/* anonymous class */
    class a._cls2 extends com.qihoo.security.clearengine.a.a.a
    {

        final a a;

        static a a(a._cls2 _pcls2)
        {
            return _pcls2.a;
        }

        public List a(int i)
        {
            IUserBWList iuserbwlist = a.a(i);
            if (iuserbwlist != null)
            {
                return iuserbwlist.getList();
            } else
            {
                return null;
            }
        }

        public void a()
            throws RemoteException
        {
            (new Thread(new a._cls2._cls1(this))).start();
        }

        public void a(int i, int ai[], List list)
            throws RemoteException
        {
            ArrayList arraylist = new ArrayList();
            if (list != null)
            {
                arraylist.addAll(list);
            }
            a.a(i, ai, arraylist);
        }

        public void a(b b1)
            throws RemoteException
        {
            com.qihoo.security.clearengine.service.a.d(a).a(b1);
        }

        public void a(c c1)
            throws RemoteException
        {
            com.qihoo.security.clearengine.service.a.a(a).a(c1);
        }

        public void a(UserBWRecord userbwrecord)
        {
            IUserBWList iuserbwlist = a.a(2);
            if (iuserbwlist != null)
            {
                iuserbwlist.insert(userbwrecord);
                iuserbwlist.save();
            }
        }

        public void a(List list)
            throws RemoteException
        {
            a.a(list);
        }

        public void b()
            throws RemoteException
        {
            a.b();
        }

        public void b(b b1)
            throws RemoteException
        {
            com.qihoo.security.clearengine.service.a.d(a).b(b1);
        }

        public void b(c c1)
            throws RemoteException
        {
            com.qihoo.security.clearengine.service.a.a(a).b(c1);
        }

        public void b(UserBWRecord userbwrecord)
        {
            IUserBWList iuserbwlist = a.a(2);
            if (iuserbwlist != null)
            {
                iuserbwlist.remove(userbwrecord);
                iuserbwlist.save();
            }
        }

        public void c()
            throws RemoteException
        {
            a.c();
        }

        public void d()
            throws RemoteException
        {
        }

            
            {
                a = a1;
                super();
            }
    }

}
