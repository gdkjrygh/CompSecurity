// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.util.threading.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.fitbit.bluetooth:
//            e

public final class d
{
    private static interface a
    {

        public abstract void a(e e1);
    }

    private static class b
    {

        public static d a = new d();


        private b()
        {
        }
    }


    private static final String a = "BluetoothStateGlobalListener";
    private final c b = new c() {

        final d a;

        protected void a(Intent intent)
        {
label0:
            {
label1:
                {
label2:
                    {
label3:
                        {
                            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()))
                            {
                                int i = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0x80000000);
                                com.fitbit.e.a.a("BluetoothStateGlobalListener", "Received BluetoothState: [%s]", new Object[] {
                                    Integer.valueOf(i)
                                });
                                com.fitbit.galileo.c.a().b();
                                switch (i)
                                {
                                default:
                                    d.e(a);
                                    break;

                                case 10: // '\n'
                                    break label3;

                                case 11: // '\013'
                                    break label0;

                                case 12: // '\f'
                                    break label2;

                                case 13: // '\r'
                                    break label1;
                                }
                            }
                            return;
                        }
                        d.a(a);
                        return;
                    }
                    d.b(a);
                    return;
                }
                com.fitbit.bluetooth.d.c(a);
                return;
            }
            d.d(a);
        }

            
            {
                a = d.this;
                super();
            }
    };
    private Set c;

    public d()
    {
        c = new HashSet();
    }

    public static d a()
    {
        return b.a;
    }

    private void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        HashSet hashset;
        Iterator iterator;
        hashset = new HashSet(c);
        iterator = hashset.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (e)iterator.next();
        if (!((e) (obj)).e()) goto _L4; else goto _L3
_L3:
        if (obj == null) goto _L6; else goto _L5
_L5:
        a1.a(((e) (obj)));
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        obj = hashset.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            a1.a((e)((Iterator) (obj)).next());
        }
        if (true) goto _L8; else goto _L7
_L7:
        a1;
        throw a1;
_L2:
        obj = null;
        if (true) goto _L3; else goto _L9
_L9:
    }

    static void a(d d1)
    {
        d1.f();
    }

    static void b(d d1)
    {
        d1.d();
    }

    static void c(d d1)
    {
        d1.g();
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        TrackerSyncPreferencesSavedState.o();
        a(new a() {

            final d a;

            public void a(e e1)
            {
                e1.f();
            }

            
            {
                a = d.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void d(d d1)
    {
        d1.e();
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        a(new a() {

            final d a;

            public void a(e e1)
            {
                e1.g();
            }

            
            {
                a = d.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void e(d d1)
    {
        d1.h();
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        a(new a() {

            final d a;

            public void a(e e1)
            {
                e1.h();
            }

            
            {
                a = d.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        a(new a() {

            final d a;

            public void a(e e1)
            {
                e1.i();
            }

            
            {
                a = d.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        a(new a() {

            final d a;

            public void a(e e1)
            {
                e1.j();
            }

            
            {
                a = d.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (!c.contains(e1))
        {
            c.add(e1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        throw e1;
    }

    public void b()
    {
        b.b(new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    public void b(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        c.remove(e1);
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        throw e1;
    }

    public void c()
    {
        b.e();
    }
}
