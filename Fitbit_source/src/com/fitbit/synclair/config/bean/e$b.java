// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.config.bean;

import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.data.bl.StaticAPILogic;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.repo.o;
import com.fitbit.e.a;
import java.io.File;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.fitbit.synclair.config.bean:
//            e

private class _cls1.a extends FutureTask
{

    final e a;

    public _cls1.d(e e1, String s, String s1, UUID uuid)
    {
        a = e1;
        super(new Callable(e1, s, s1, uuid) {

            final e a;
            final String b;
            final String c;
            final UUID d;

            public Boolean a()
                throws Exception
            {
                boolean flag;
                Object obj;
                Object obj1;
                e.a a1;
                try
                {
                    obj = StaticAPILogic.a().c(b, c);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (b.a.a())
                    {
                        com.fitbit.e.a.e("SynclairAssetsManager", String.format("Error loading Asset on path %s", new Object[] {
                            b
                        }), ((Throwable) (obj)), new Object[0]);
                    } else
                    {
                        com.fitbit.e.a.e("SynclairAssetsManager", "Static Asset failed to load", ((Throwable) (obj)), new Object[0]);
                    }
                    obj = null;
                }
                if (obj != null)
                {
                    obj = com.fitbit.synclair.config.bean.e.a(a, b, ((byte []) (obj)));
                } else
                {
                    obj = null;
                }
                obj1 = com.fitbit.synclair.config.bean.e.b(a);
                obj1;
                JVM INSTR monitorenter ;
                a1 = (e.a)e.c(a).get(b);
                if (a1 == null) goto _L2; else goto _L1
_L1:
                if (a1.c == null || !a1.c.equals(d)) goto _L2; else goto _L3
_L3:
                if (obj == null) goto _L5; else goto _L4
_L4:
                a1 = new e.a(((String) (obj)), null, null);
                e.c(a).put(b, a1);
                com.fitbit.synclair.config.bean.e.b(b);
                flag = true;
_L7:
                obj1;
                JVM INSTR monitorexit ;
                if (!flag && obj != null)
                {
                    obj = new File(((String) (obj)));
                    com.fitbit.synclair.config.bean.e.a(a).b(((File) (obj)).getName());
                }
                return Boolean.valueOf(flag);
_L5:
                e.c(a).remove(b);
                  goto _L2
                obj;
                obj1;
                JVM INSTR monitorexit ;
                throw obj;
_L2:
                flag = false;
                if (true) goto _L7; else goto _L6
_L6:
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = e1;
                b = s;
                c = s1;
                d = uuid;
                super();
            }
        });
    }
}
