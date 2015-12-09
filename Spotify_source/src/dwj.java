// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class dwj
{

    final Context a;
    final Set b;
    Object c;
    boolean d;
    dwl e;
    private final ServiceConnection f;
    private final Class g;

    public dwj(Context context, Class class1)
    {
        this(context, class1, ((dwl) (new dwm((byte)0))));
    }

    protected dwj(Context context, Class class1, dwl dwl)
    {
        f = new ServiceConnection() {

            private dwj a;

            public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                if (!a.d)
                {
                    a.a.unbindService(this);
                    return;
                }
                a.c = a.e.a(ibinder);
                if (a.c == null)
                {
                    throw new IllegalStateException("The service was bound to, but returned a null interface. That's bad.");
                } else
                {
                    a.d = false;
                    dwj.a(a);
                    return;
                }
            }

            public final void onServiceDisconnected(ComponentName componentname)
            {
                Object obj;
                a.c = null;
                if (a.d)
                {
                    a.d = false;
                }
                obj = a;
                componentname = ((dwj) (obj)).b;
                componentname;
                JVM INSTR monitorenter ;
                for (obj = ((dwj) (obj)).b.iterator(); ((Iterator) (obj)).hasNext(); ((dwk)((Iterator) (obj)).next()).b()) { }
                break MISSING_BLOCK_LABEL_79;
                Exception exception;
                exception;
                componentname;
                JVM INSTR monitorexit ;
                throw exception;
                componentname;
                JVM INSTR monitorexit ;
            }

            
            {
                a = dwj.this;
                super();
            }
        };
        b = Collections.synchronizedSet(new HashSet());
        a = context;
        g = class1;
        e = dwl;
    }

    static void a(dwj dwj1)
    {
        dwj1.e();
        Set set = dwj1.b;
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = dwj1.b.iterator(); iterator.hasNext(); ((dwk)iterator.next()).a(dwj1.f())) { }
        break MISSING_BLOCK_LABEL_56;
        dwj1;
        set;
        JVM INSTR monitorexit ;
        throw dwj1;
        set;
        JVM INSTR monitorexit ;
    }

    public final void a()
    {
        geh.b();
        if (c != null || d)
        {
            return;
        } else
        {
            d();
            Intent intent = new Intent(a, g);
            d = true;
            d = dvk.a(a, intent, f, getClass().getSimpleName());
            return;
        }
    }

    public final void a(dwk dwk1)
    {
        b.add(dwk1);
    }

    public void b()
    {
        geh.b();
        if (d)
        {
            d = false;
        }
        if (c != null)
        {
            c = null;
            dvk.a(a, f, getClass().getSimpleName());
        }
    }

    public final void b(dwk dwk1)
    {
        b.remove(dwk1);
    }

    public final boolean c()
    {
        return c != null && !d;
    }

    public void d()
    {
    }

    public void e()
    {
    }

    public final Object f()
    {
        if (c == null)
        {
            throw new IllegalStateException("Service is not connected. Did you forget to connect, or forgot that you called disconnect?");
        } else
        {
            return c;
        }
    }
}
