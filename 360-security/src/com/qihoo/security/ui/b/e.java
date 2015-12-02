// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.b;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.qihoo.security.app.d;
import com.qihoo.security.service.SecurityService;

// Referenced classes of package com.qihoo.security.ui.b:
//            d

public class e
    implements com.qihoo.security.app.d.a
{
    public final class a
    {

        final e a;
        private final int b;

        public void a()
        {
            try
            {
                e.b(a).a(e.a(a), b);
                return;
            }
            catch (Exception exception)
            {
                return;
            }
        }

        public void b()
        {
            try
            {
                e.b(a).b(e.a(a), b);
                return;
            }
            catch (Exception exception)
            {
                return;
            }
        }

        private a(int i)
        {
            a = e.this;
            super();
            b = i;
        }

    }


    private static e b;
    private final Handler a = new Handler(Looper.getMainLooper()) {

        final e a;

        public void handleMessage(Message message)
        {
            e.a(a, message);
        }

            
            {
                a = e.this;
                super(looper);
            }
    };
    private Context c;
    private com.qihoo.security.ui.b.d d;
    private final Binder e = new Binder();
    private SparseArray f;

    private e(Context context)
    {
        f = new SparseArray();
        c = context.getApplicationContext();
        context = new Intent("com.qihoo.security.service.UIBARRIER");
        context.setClass(c, com/qihoo/security/service/SecurityService);
        d = (com.qihoo.security.ui.b.d)com.qihoo.security.app.d.a(c).a(com/qihoo/security/ui/b/d, context, false, this);
    }

    static Binder a(e e1)
    {
        return e1.e;
    }

    public static e a(Context context)
    {
        com/qihoo/security/ui/b/e;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new e(context);
        }
        context = b;
        com/qihoo/security/ui/b/e;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private final void a(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            break;
        }
        try
        {
            d.b(e, message.arg1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            return;
        }
    }

    static void a(e e1, Message message)
    {
        e1.a(message);
    }

    static com.qihoo.security.ui.b.d b(e e1)
    {
        return e1.d;
    }

    public IInterface a(IBinder ibinder)
    {
        return b(ibinder);
    }

    public a a(int i)
    {
        SparseArray sparsearray = f;
        sparsearray;
        JVM INSTR monitorenter ;
        a a2 = (a)f.get(i);
        a a1;
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        a1 = new a(i);
        f.put(i, a1);
        sparsearray;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public com.qihoo.security.ui.b.d b(IBinder ibinder)
    {
        return com.qihoo.security.ui.b.d.a.a(ibinder);
    }

    public boolean b(int i)
    {
        boolean flag;
        try
        {
            flag = d.a(i);
        }
        catch (Exception exception)
        {
            return false;
        }
        return flag;
    }
}
