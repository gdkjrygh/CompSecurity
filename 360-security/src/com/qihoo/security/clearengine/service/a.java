// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.service;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseArray;
import com.qihoo.security.clearengine.a.b;
import com.qihoo.security.clearengine.a.c;
import com.qihoo360.mobilesafe.opti.i.IClearModule;
import com.qihoo360.mobilesafe.opti.i.trashclear.ICallbackTrashClear;
import com.qihoo360.mobilesafe.opti.i.trashclear.ICallbackTrashScan;
import com.qihoo360.mobilesafe.opti.i.trashclear.ITrashClear;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import com.qihoo360.mobilesafe.opti.i.whitelist.IBlackAndWhiteList;
import com.qihoo360.mobilesafe.opti.i.whitelist.IUserBWList;
import com.qihoo360.mobilesafe.opti.i.whitelist.UserBWRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.qihoo.security.clearengine.service:
//            c, b

public class a
{

    protected int a;
    protected int b[];
    protected ArrayList c;
    public ICallbackTrashScan d;
    ICallbackTrashClear e;
    private Object f;
    private com.qihoo.security.clearengine.service.c g;
    private com.qihoo.security.clearengine.service.b h;
    private ITrashClear i;
    private IClearModule j;
    private com.qihoo.security.clearengine.a.a k;
    private IBlackAndWhiteList l;
    private SparseArray m;
    private com.qihoo.security.e.a n;
    private Handler o;
    private final int p = 1;
    private final long q = 0x927c0L;
    private AtomicInteger r;

    public a(ITrashClear itrashclear, IClearModule iclearmodule, IBlackAndWhiteList iblackandwhitelist)
    {
        a = 11;
        b = null;
        f = new Object();
        i = null;
        j = null;
        d = new ICallbackTrashScan() {

            final a a;

            public void onFinished(int i1)
            {
                a.a(a).a(i1);
            }

            public void onFoundItem(TrashInfo trashinfo)
            {
                a.a(a).a(trashinfo);
            }

            public void onProgress(int i1, int j1, String s)
            {
                a.a(a).a(i1, j1, s);
            }

            public void onStart()
            {
                a.a(a).a();
            }

            
            {
                a = a.this;
                super();
            }
        };
        k = new com.qihoo.security.clearengine.a.a() {

            final a a;

            static a a(_cls2 _pcls2)
            {
                return _pcls2.a;
            }

            public List a(int i1)
            {
                IUserBWList iuserbwlist = a.a(i1);
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
                (new Thread(new Runnable(this) {

                    final _cls2 a;

                    public void run()
                    {
                        com.qihoo.security.clearengine.service.a.b(_cls2.a(a)).incrementAndGet();
                        com.qihoo.security.clearengine.service.a.c(_cls2.a(a)).sendEmptyMessageDelayed(1, 0x927c0L);
                        _cls2.a(a).a();
                        com.qihoo.security.clearengine.service.a.c(_cls2.a(a)).removeMessages(1);
                    }

            
            {
                a = _pcls2;
                super();
            }
                })).start();
            }

            public void a(int i1, int ai[], List list)
                throws RemoteException
            {
                ArrayList arraylist = new ArrayList();
                if (list != null)
                {
                    arraylist.addAll(list);
                }
                a.a(i1, ai, arraylist);
            }

            public void a(b b1)
                throws RemoteException
            {
                a.d(a).a(b1);
            }

            public void a(c c1)
                throws RemoteException
            {
                a.a(a).a(c1);
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
                a.d(a).b(b1);
            }

            public void b(c c1)
                throws RemoteException
            {
                a.a(a).b(c1);
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
                a = a.this;
                super();
            }
        };
        e = new ICallbackTrashClear() {

            final a a;
            private int b;
            private int c;

            public void onFinished(int i1)
            {
                a.d(a).a(i1);
            }

            public void onProgress(int i1, int j1, TrashInfo trashinfo)
            {
                a.d(a).a(i1, j1, trashinfo);
            }

            public void onStart()
            {
                b = 0;
                c = 0;
                a.d(a).a();
            }

            
            {
                a = a.this;
                super();
            }
        };
        l = null;
        m = new SparseArray();
        r = new AtomicInteger(0);
        i = itrashclear;
        j = iclearmodule;
        l = iblackandwhitelist;
        g = new com.qihoo.security.clearengine.service.c(f);
        h = new com.qihoo.security.clearengine.service.b(f);
    }

    static com.qihoo.security.clearengine.service.c a(a a1)
    {
        return a1.g;
    }

    private final void a(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            n.a(0, String.format("scan %d takes another 10m", new Object[] {
                Integer.valueOf(r.get())
            }));
            break;
        }
        o.sendEmptyMessageDelayed(1, 0x927c0L);
    }

    static void a(a a1, Message message)
    {
        a1.a(message);
    }

    static AtomicInteger b(a a1)
    {
        return a1.r;
    }

    static Handler c(a a1)
    {
        return a1.o;
    }

    static com.qihoo.security.clearengine.service.b d(a a1)
    {
        return a1.h;
    }

    protected IUserBWList a(int i1)
    {
        IUserBWList iuserbwlist1 = (IUserBWList)m.get(i1);
        IUserBWList iuserbwlist = iuserbwlist1;
        if (iuserbwlist1 == null)
        {
            iuserbwlist = l.getUserBWList(i1);
            m.put(i1, iuserbwlist);
        }
        return iuserbwlist;
    }

    public void a()
    {
        try
        {
            i.scan(a, b, c, d);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void a(int i1, int ai[], ArrayList arraylist)
    {
        a = i1;
        b = ai;
        c = arraylist;
    }

    final void a(com.qihoo.security.e.a a1)
    {
        n = a1;
        o = new Handler(n.a()) {

            final a a;

            public void handleMessage(Message message)
            {
                a.a(a, message);
            }

            
            {
                a = a.this;
                super(looper);
            }
        };
    }

    public void a(List list)
    {
        i.clearByTrashInfo(list, e);
    }

    public void b()
    {
        i.cancelScan(d);
    }

    public void c()
    {
        i.cancelClear();
    }

    public IBinder d()
    {
        return k.asBinder();
    }
}
