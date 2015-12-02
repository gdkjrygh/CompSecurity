// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.app.Service;
import android.content.ContentUris;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android_src.c.d;
import android_src.mms.e.t;
import android_src.mms.g.l;
import com.facebook.debug.log.b;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package android_src.mms.transaction:
//            l, t, i, s, 
//            v, r, x, d, 
//            u, p, k

public class TransactionService extends Service
    implements android_src.mms.transaction.l
{

    public Handler a;
    private v b;
    private Looper c;
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private ConnectivityManager f;
    private u g;
    private android.os.PowerManager.WakeLock h;

    public TransactionService()
    {
        a = new android_src.mms.transaction.t(this);
    }

    static ArrayList a(TransactionService transactionservice)
    {
        return transactionservice.d;
    }

    private void a(int j)
    {
        synchronized (d)
        {
            if (d.isEmpty() && e.isEmpty())
            {
                if (com.facebook.debug.log.b.b(2))
                {
                    com.facebook.debug.log.b.a("fb-mms:TransactionService", "stopSelfIfIdle: STOP!");
                }
                if (com.facebook.debug.log.b.b(2))
                {
                    com.facebook.debug.log.b.a("fb-mms:TransactionService", "stopSelfIfIdle: unRegisterForConnectionStateChanges");
                }
                android_src.mms.transaction.i.b(getApplicationContext());
                stopSelf(j);
            }
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(int j, int k)
    {
        byte byte0 = 2;
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", (new StringBuilder()).append("onNetworkUnavailable: sid=").append(j).append(", type=").append(k).toString());
        }
        if (k == 1)
        {
            k = byte0;
        } else
        if (k == 2)
        {
            k = 1;
        } else
        {
            k = -1;
        }
        if (k != -1)
        {
            a.sendEmptyMessage(k);
        }
        stopSelf(j);
    }

    private void a(int j, s s1, boolean flag)
    {
        if (flag)
        {
            com.facebook.debug.log.b.d("fb-mms:TransactionService", "launchTransaction: no network error!");
            a(j, s1.a());
            return;
        }
        Message message = b.obtainMessage(1);
        message.arg1 = j;
        message.obj = s1;
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", (new StringBuilder()).append("launchTransaction: sending message ").append(message).toString());
        }
        b.sendMessage(message);
    }

    static void b(TransactionService transactionservice)
    {
        transactionservice.g();
    }

    private static boolean b(int j)
    {
        return j < 10 && j > 0;
    }

    private int c(int j)
    {
        switch (j)
        {
        default:
            com.facebook.debug.log.b.d("fb-mms:TransactionService", (new StringBuilder()).append("Unrecognized MESSAGE_TYPE: ").append(j).toString());
            return -1;

        case 130: 
            return 1;

        case 135: 
            return 3;

        case 128: 
            return 2;
        }
    }

    static ArrayList c(TransactionService transactionservice)
    {
        return transactionservice.e;
    }

    private boolean c()
    {
        NetworkInfo networkinfo = f.getNetworkInfo(2);
        if (networkinfo == null)
        {
            return false;
        } else
        {
            return networkinfo.isAvailable();
        }
    }

    static v d(TransactionService transactionservice)
    {
        return transactionservice.b;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (h == null)
        {
            h = ((PowerManager)getSystemService("power")).newWakeLock(1, "MMS Connectivity");
            h.setReferenceCounted(false);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void e()
    {
        h.acquire();
    }

    private void f()
    {
        if (h != null && h.isHeld())
        {
            h.release();
        }
    }

    private void g()
    {
        b.sendMessageDelayed(b.obtainMessage(3), 30000L);
    }

    protected int a()
    {
        d();
        int j = f.startUsingNetworkFeature(0, "enableMMS");
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", (new StringBuilder()).append("beginMmsConnectivity: result=").append(j).toString());
        }
        switch (j)
        {
        default:
            throw new IOException("Cannot establish MMS connectivity");

        case 0: // '\0'
        case 1: // '\001'
            e();
            break;
        }
        return j;
    }

    public void a(k k)
    {
        int j;
        k = (r)k;
        j = k.e();
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", (new StringBuilder()).append("update transaction ").append(j).toString());
        }
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        d.remove(k);
        if (e.size() <= 0) goto _L2; else goto _L1
_L1:
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", "update: handle next pending transaction...");
        }
        Message message = b.obtainMessage(4, k.f());
        b.sendMessage(message);
_L6:
        int i1;
        obj = new Intent("android.intent.action.TRANSACTION_COMPLETED_ACTION");
        x x1 = k.d();
        i1 = x1.a();
        ((Intent) (obj)).putExtra("state", i1);
        ((Intent) (obj)).putExtra("uri", x1.b());
        i1;
        JVM INSTR tableswitch 1 2: default 442
    //                   1 321
    //                   2 406;
           goto _L3 _L4 _L5
_L3:
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", (new StringBuilder()).append("Transaction state unknown: ").append(j).append(" ").append(i1).toString());
        }
_L11:
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", (new StringBuilder()).append("update: broadcast transaction result ").append(i1).toString());
        }
        sendBroadcast(((Intent) (obj)));
        k.b(this);
        android_src.mms.transaction.i.b(getApplicationContext());
        stopSelf(j);
        return;
_L2:
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", "update: endMmsConnectivity");
        }
        b();
          goto _L6
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        k.b(this);
        android_src.mms.transaction.i.b(getApplicationContext());
        stopSelf(j);
        throw exception;
_L4:
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", (new StringBuilder()).append("Transaction complete: ").append(j).toString());
        }
        k.b();
        JVM INSTR tableswitch 0 2: default 445
    //                   0 384
    //                   1 384
    //                   2 397;
           goto _L7 _L8 _L8 _L9
_L7:
        if (true) goto _L11; else goto _L10
_L10:
_L8:
        android_src.mms.transaction.d.b(this, true, false);
        android_src.mms.transaction.d.b(this);
          goto _L11
_L9:
        l.a().b();
          goto _L11
_L5:
        if (!com.facebook.debug.log.b.b(2)) goto _L11; else goto _L12
_L12:
        com.facebook.debug.log.b.a("fb-mms:TransactionService", (new StringBuilder()).append("Transaction failed: ").append(j).toString());
          goto _L11
    }

    protected void b()
    {
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", "endMmsConnectivity");
        }
        b.removeMessages(3);
        if (f != null)
        {
            f.stopUsingNetworkFeature(0, "enableMMS");
        }
        f();
        return;
        Exception exception;
        exception;
        f();
        throw exception;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", "Creating TransactionService");
        }
        Object obj = new HandlerThread("TransactionService");
        ((HandlerThread) (obj)).start();
        c = ((HandlerThread) (obj)).getLooper();
        b = new v(this, c);
        g = new u(this, null);
        obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(g, ((IntentFilter) (obj)));
    }

    public void onDestroy()
    {
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", "Destroying TransactionService");
        }
        if (!e.isEmpty())
        {
            com.facebook.debug.log.b.d("fb-mms:TransactionService", "TransactionService exiting with transaction still pending");
        }
        f();
        unregisterReceiver(g);
        b.sendEmptyMessage(100);
    }

    public int onStartCommand(Intent intent, int j, int k)
    {
        boolean flag;
        boolean flag1 = true;
        if (intent == null)
        {
            return 2;
        }
        f = (ConnectivityManager)getSystemService("connectivity");
        if (!c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", (new StringBuilder()).append("onStart: #").append(k).append(": ").append(intent.getExtras()).append(" intent=").append(intent).toString());
            StringBuilder stringbuilder = (new StringBuilder()).append("    networkAvailable=");
            if (flag)
            {
                flag1 = false;
            }
            com.facebook.debug.log.b.a("fb-mms:TransactionService", stringbuilder.append(flag1).toString());
        }
        if (!"android.intent.action.ACTION_ONALARM".equals(intent.getAction()) && intent.getExtras() != null) goto _L2; else goto _L1
_L1:
        intent = t.a(this).a(System.currentTimeMillis());
        if (intent == null) goto _L4; else goto _L3
_L3:
        j = intent.getCount();
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", (new StringBuilder()).append("onStart: cursor.count=").append(j).toString());
        }
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", "onStart: no pending messages. Stopping service.");
        }
        android_src.mms.transaction.p.b(this);
        a(k);
        intent.close();
        return 2;
        int i1;
        j = intent.getColumnIndexOrThrow("msg_id");
        i1 = intent.getColumnIndexOrThrow("msg_type");
        if (!flag) goto _L6; else goto _L5
_L5:
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", "onStart: registerForConnectionStateChanges");
        }
        i.a(getApplicationContext());
_L6:
        if (!intent.moveToNext()) goto _L8; else goto _L7
_L7:
        int j1 = c(intent.getInt(i1));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        a(k, j1);
        intent.close();
        return 2;
        j1;
        JVM INSTR tableswitch -1 1: default 364
    //                   -1 293
    //                   0 364
    //                   1 409;
           goto _L9 _L6 _L9 _L10
_L9:
        a(k, new s(j1, ContentUris.withAppendedId(d.a, intent.getLong(j)).toString()), false);
        break; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        intent.close();
        throw exception;
_L10:
        boolean flag2 = b(intent.getInt(intent.getColumnIndexOrThrow("err_type")));
        if (flag2) goto _L9; else goto _L6
_L8:
        intent.close();
        return 2;
_L4:
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", "onStart: no pending messages. Stopping service.");
        }
        android_src.mms.transaction.p.b(this);
        a(k);
        return 2;
_L2:
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionService", "onStart: launch transaction...");
        }
        a(k, new s(intent.getExtras()), flag);
        return 2;
    }
}
