// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dt;

import android.os.Handler;
import android.os.Looper;
import com.pandora.radio.util.i;
import p.df.a;

// Referenced classes of package p.dt:
//            c, k

public class b extends c
{

    private final Handler a = new Handler(Looper.getMainLooper());

    public b(String s)
    {
        super(k.b, s);
    }

    static void a(b b1, Object obj)
    {
        b1.p.dt.c.a(obj);
    }

    public void a(Object obj)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            super.a(obj);
            return;
        } else
        {
            a.post(new Runnable(obj) {

                final Object a;
                final b b;

                public void run()
                {
                    p.dt.b.a(b, a);
                }

            
            {
                b = b.this;
                a = obj;
                super();
            }
            });
            return;
        }
    }

    public void b(Object obj)
    {
        super.b(obj);
_L1:
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        if (obj != null)
        {
            obj = obj.getClass().getName();
        } else
        {
            obj = "null object";
        }
        p.df.a.b("AppBus", illegalargumentexception, "Unexpected exception unregistering %s", new Object[] {
            obj
        });
        if (!i.e())
        {
            throw illegalargumentexception;
        }
          goto _L1
    }
}
