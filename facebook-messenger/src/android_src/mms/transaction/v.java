// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android_src.mms.e.f;
import android_src.mms.e.h;
import android_src.mms.e.r;
import com.facebook.debug.log.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android_src.mms.transaction:
//            TransactionService, r, s, w, 
//            j, o, q, n

final class v extends Handler
{

    final TransactionService a;

    public v(TransactionService transactionservice, Looper looper)
    {
        a = transactionservice;
        super(looper);
    }

    private String a(int i)
    {
        if (i == 0)
        {
            return "NOTIFICATION_TRANSACTION";
        }
        if (i == 1)
        {
            return "RETRIEVE_TRANSACTION";
        }
        if (i == 2)
        {
            return "SEND_TRANSACTION";
        }
        if (i == 3)
        {
            return "READREC_TRANSACTION";
        } else
        {
            return "invalid transaction type";
        }
    }

    private String a(Message message)
    {
        if (message.what == 100)
        {
            return "EVENT_QUIT";
        }
        if (message.what == 3)
        {
            return "EVENT_CONTINUE_MMS_CONNECTIVITY";
        }
        if (message.what == 1)
        {
            return "EVENT_TRANSACTION_REQUEST";
        }
        if (message.what == 4)
        {
            return "EVENT_HANDLE_NEXT_PENDING_TRANSACTION";
        } else
        {
            return "unknown message.what";
        }
    }

    private boolean a(android_src.mms.transaction.r r1)
    {
label0:
        {
            synchronized (TransactionService.a(a))
            {
                Iterator iterator = TransactionService.c(a).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (!((android_src.mms.transaction.r)iterator.next()).a(r1));
                if (b.b(2))
                {
                    b.a("fb-mms:TransactionService", (new StringBuilder()).append("Transaction already pending: ").append(r1.e()).toString());
                }
            }
            return true;
        }
        Iterator iterator1 = TransactionService.a(a).iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_163;
            }
        } while (!((android_src.mms.transaction.r)iterator1.next()).a(r1));
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("Duplicated transaction: ").append(r1.e()).toString());
        }
        arraylist;
        JVM INSTR monitorexit ;
        return true;
        r1;
        arraylist;
        JVM INSTR monitorexit ;
        throw r1;
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", "processTransaction: call beginMmsConnectivity...");
        }
        if (a.a() != 1)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        TransactionService.c(a).add(r1);
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", "processTransaction: connResult=APN_REQUEST_STARTED, defer transaction pending MMS connectivity");
        }
        arraylist;
        JVM INSTR monitorexit ;
        return true;
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("Adding transaction to 'mProcessing' list: ").append(r1).toString());
        }
        TransactionService.a(a).add(r1);
        arraylist;
        JVM INSTR monitorexit ;
        sendMessageDelayed(obtainMessage(3), 30000L);
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("processTransaction: starting transaction ").append(r1).toString());
        }
        r1.a(a);
        r1.a();
        return true;
    }

    public void a(android_src.mms.transaction.r r1, w w1)
    {
        int i;
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("processPendingTxn: transaction=").append(r1).toString());
        }
        synchronized (TransactionService.a(a))
        {
            if (TransactionService.c(a).size() != 0)
            {
                r1 = (android_src.mms.transaction.r)TransactionService.c(a).remove(0);
            }
            i = TransactionService.a(a).size();
        }
        if (r1 == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        if (w1 != null)
        {
            r1.a(w1);
        }
        i = r1.e();
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("processPendingTxn: process ").append(i).toString());
        }
        if (!a(r1)) goto _L2; else goto _L1
_L1:
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("Started deferred processing of transaction  ").append(r1).toString());
        }
_L3:
        return;
        r1;
        arraylist;
        JVM INSTR monitorexit ;
        throw r1;
_L2:
        try
        {
            a.stopSelf(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android_src.mms.transaction.r r1)
        {
            b.c("fb-mms:TransactionService", r1.getMessage(), r1);
        }
        return;
        if (i == 0)
        {
            if (b.b(2))
            {
                b.a("fb-mms:TransactionService", "processPendingTxn: no more transaction, endMmsConnectivity");
            }
            a.b();
            return;
        }
          goto _L3
    }

    public void handleMessage(Message message)
    {
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("Handling incoming message: ").append(message).append(" = ").append(a(message)).toString());
        }
        message.what;
        JVM INSTR lookupswitch 4: default 96
    //                   1: 241
    //                   3: 132
    //                   4: 1062
    //                   100: 124;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        b.d("fb-mms:TransactionService", (new StringBuilder()).append("what=").append(message.what).toString());
_L11:
        return;
_L5:
        getLooper().quit();
        return;
_L3:
        message = TransactionService.a(a);
        message;
        JVM INSTR monitorenter ;
        if (TransactionService.a(a).isEmpty())
        {
            return;
        }
          goto _L6
        Exception exception;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
_L6:
        message;
        JVM INSTR monitorexit ;
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", "handle EVENT_CONTINUE_MMS_CONNECTIVITY event...");
        }
        int i = a.a();
        if (i != 0)
        {
            try
            {
                b.a("fb-mms:TransactionService", (new StringBuilder()).append("Extending MMS connectivity returned ").append(i).append(" instead of APN_ALREADY_ACTIVE").toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                b.d("fb-mms:TransactionService", "Attempt to extend use of MMS connectivity failed");
            }
            return;
        } else
        {
            android_src.mms.transaction.TransactionService.b(a);
            return;
        }
_L2:
        i = message.arg1;
        String s1;
        Object obj1;
        obj1 = (s)message.obj;
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("EVENT_TRANSACTION_REQUEST MmscUrl=").append(((s) (obj1)).d()).append(" proxy port: ").append(((s) (obj1)).e()).toString());
        }
        s1 = ((s) (obj1)).d();
        if (s1 == null) goto _L8; else goto _L7
_L7:
        obj = new w(s1, ((s) (obj1)).e(), ((s) (obj1)).f());
_L12:
        int k;
        k = ((s) (obj1)).a();
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("handle EVENT_TRANSACTION_REQUEST: transactionType=").append(k).append(" ").append(a(k)).toString());
        }
          goto _L9
_L30:
        b.d("fb-mms:TransactionService", (new StringBuilder()).append("Invalid transaction type: ").append(i).toString());
        if (false) goto _L11; else goto _L10
_L10:
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("Transaction was null. Stopping self: ").append(i).toString());
        }
        a.b();
        a.stopSelf(i);
        return;
_L8:
        obj = new w(a, null);
          goto _L12
_L31:
        String s2 = ((s) (obj1)).b();
        if (s2 == null) goto _L14; else goto _L13
_L13:
        obj = new j(a, i, ((w) (obj)), s2);
_L21:
        obj1 = obj;
        boolean flag = a(((android_src.mms.transaction.r) (obj)));
        if (flag) goto _L16; else goto _L15
_L15:
        if (false) goto _L11; else goto _L17
_L17:
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("Transaction was null. Stopping self: ").append(i).toString());
        }
        a.b();
        a.stopSelf(i);
        return;
_L14:
        obj1 = (new r(((s) (obj1)).c())).a();
        if (obj1 == null) goto _L19; else goto _L18
_L18:
        if (((f) (obj1)).f() != 130) goto _L19; else goto _L20
_L20:
        obj = new j(a, i, ((w) (obj)), (h)obj1);
          goto _L21
        Exception exception1;
        exception1;
        obj = null;
_L29:
        obj1 = obj;
        b.c("fb-mms:TransactionService", (new StringBuilder()).append("Exception occurred while handling message: ").append(message).toString(), exception1);
        if (obj == null) goto _L23; else goto _L22
_L22:
        ((android_src.mms.transaction.r) (obj)).b(a);
        message = obj3;
        if (TransactionService.a(a).contains(obj))
        {
            synchronized (TransactionService.a(a))
            {
                TransactionService.a(a).remove(obj);
            }
            message = obj3;
        }
_L27:
        if (message != null) goto _L11; else goto _L24
_L24:
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("Transaction was null. Stopping self: ").append(i).toString());
        }
        a.b();
        a.stopSelf(i);
        return;
_L19:
        b.e("fb-mms:TransactionService", "Invalid PUSH data.");
        if (false) goto _L11; else goto _L25
_L25:
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("Transaction was null. Stopping self: ").append(i).toString());
        }
        a.b();
        a.stopSelf(i);
        return;
_L32:
        obj = new o(a, i, ((w) (obj)), ((s) (obj1)).b());
          goto _L21
        message;
        obj = obj2;
_L28:
        if (obj == null)
        {
            if (b.b(2))
            {
                b.a("fb-mms:TransactionService", (new StringBuilder()).append("Transaction was null. Stopping self: ").append(i).toString());
            }
            a.b();
            a.stopSelf(i);
        }
        throw message;
_L33:
        obj = new q(a, i, ((w) (obj)), ((s) (obj1)).b());
          goto _L21
_L34:
        obj = new n(a, i, ((w) (obj)), ((s) (obj1)).b());
          goto _L21
_L16:
        obj1 = obj;
        if (!b.b(2))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        b.a("fb-mms:TransactionService", (new StringBuilder()).append("Started processing of incoming message: ").append(message).toString());
        if (obj != null) goto _L11; else goto _L26
_L26:
        if (b.b(2))
        {
            b.a("fb-mms:TransactionService", (new StringBuilder()).append("Transaction was null. Stopping self: ").append(i).toString());
        }
        a.b();
        a.stopSelf(i);
        return;
        obj;
        message;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        finally { }
        b.d("fb-mms:TransactionService", "Unexpected Throwable.", message);
        message = obj3;
          goto _L27
        throw message;
_L4:
        a(null, (w)message.obj);
        return;
        message;
        obj = obj1;
          goto _L28
        exception1;
          goto _L29
_L23:
        message = ((Message) (obj));
          goto _L27
_L9:
        k;
        JVM INSTR tableswitch 0 3: default 1124
    //                   0 476
    //                   1 825
    //                   2 905
    //                   3 927;
           goto _L30 _L31 _L32 _L33 _L34
    }
}
