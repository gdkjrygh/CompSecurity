// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.e;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.a.b;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.internal.o;
import com.microsoft.onlineid.sts.h;
import com.microsoft.onlineid.sts.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.internal.e:
//            c, a, d, b

public final class f
{

    protected static final Object b = new Object();
    protected final c a;

    public f(Context context)
    {
        com.microsoft.onlineid.internal.k.a(context, "applicationContext");
        a = new c(context);
    }

    private Object a(String s, String s1, com.microsoft.onlineid.internal.e.a a1)
    {
        com.microsoft.onlineid.internal.e.a a2;
        String s2;
        s2 = a.a(s1);
        a2 = null;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        a1 = ((com.microsoft.onlineid.internal.e.a) (a1.a(s2)));
        a2 = a1;
        if (a1 == null)
        {
            a(s, new String[] {
                s1
            });
            a2 = a1;
        }
        return a2;
        a1;
        com.microsoft.onlineid.internal.c.d.b(String.format(Locale.US, "Value in storage at '%s' was corrupt.", new Object[] {
            s1
        }));
        a(s, new String[] {
            s1
        });
        return null;
        a1;
        a(s, new String[] {
            s1
        });
        throw a1;
    }

    private Set a(String s, com.microsoft.onlineid.internal.e.a a1)
    {
        HashMap hashmap = new HashMap();
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        HashSet hashset;
        Object obj2;
        obj = a.b(s);
        hashset = new HashSet(((Collection) (obj)));
        obj2 = ((Set) (obj)).iterator();
_L1:
        String s1;
        String s2;
        if (!((Iterator) (obj2)).hasNext())
        {
            break MISSING_BLOCK_LABEL_120;
        }
        s1 = (String)((Iterator) (obj2)).next();
        s2 = a.a(s1);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        hashmap.put(s1, s2);
          goto _L1
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
        com.microsoft.onlineid.internal.e.a(false);
        hashset.remove(s1);
          goto _L1
        if (hashset.size() == ((Set) (obj)).size()) goto _L3; else goto _L2
_L2:
        int l;
        com.microsoft.onlineid.internal.c.d.c((new StringBuilder("Key set was out of sync for collection: ")).append(s).toString());
        l = s.indexOf("|");
        obj2 = com.microsoft.onlineid.a.a.a();
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        obj = s.substring(0, l);
_L4:
        ((b) (obj2)).a("Storage", "Collection consistency error", ((String) (obj)));
        a.a().a(s, hashset).a();
_L3:
        obj1;
        JVM INSTR monitorexit ;
        s = Collections.emptySet();
        try
        {
            a1 = a1.a(hashmap);
        }
        // Misplaced declaration of an exception variable
        catch (com.microsoft.onlineid.internal.e.a a1)
        {
            com.microsoft.onlineid.internal.c.d.c("Unable to deserialize indexed collection.", a1);
            return s;
        }
        return a1;
        obj = s;
          goto _L4
    }

    private void a(String s, String s1, Object obj, com.microsoft.onlineid.internal.e.a a1)
    {
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        try
        {
            a1 = a1.a(obj);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new com.microsoft.onlineid.internal.e.d(s);
        }
        synchronized (b)
        {
            Object obj1 = a.b(s);
            c.a a2 = a.a();
            if (!((Set) (obj1)).contains(s1))
            {
                obj1 = new HashSet(((Collection) (obj1)));
                ((Set) (obj1)).add(s1);
                a2.a(s, ((Set) (obj1)));
            }
            a2.a(s1, a1).a();
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    private void a(String s, Map map, c.a a1)
    {
        for (Iterator iterator = a.b(s).iterator(); iterator.hasNext(); a1.a((String)iterator.next())) { }
        if (map != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator1 = map.entrySet().iterator(); iterator1.hasNext(); a1.a((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator1.next();
            }

            a1.a(s, map.keySet());
            return;
        } else
        {
            a1.a(s);
            return;
        }
    }

    private transient void a(String s, String as[])
    {
        c.a a1;
        as = Arrays.asList(as);
        if (as.isEmpty())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        a1 = a.a();
        for (Iterator iterator = as.iterator(); iterator.hasNext(); a1.a((String)iterator.next())) { }
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        HashSet hashset;
        hashset = new HashSet(a.b(s));
        hashset.removeAll(as);
        if (!hashset.isEmpty())
        {
            break MISSING_BLOCK_LABEL_116;
        }
        a1.a(s);
_L2:
        a1.a();
        return;
        a1.a(s, hashset);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static String c(String s, String s1, com.microsoft.onlineid.d d1)
    {
        com.microsoft.onlineid.internal.k.a(d1.a(), "Ticket target");
        com.microsoft.onlineid.internal.k.a(d1.b(), "Ticket policy");
        return TextUtils.join("|", new Object[] {
            "Ticket", s.toLowerCase(Locale.US), s1.toLowerCase(Locale.US), d1.a().toLowerCase(Locale.US), d1.b().toLowerCase(Locale.US)
        });
    }

    private boolean d(String s)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!a.b(s).isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static String e(String s)
    {
        return TextUtils.join("|", new Object[] {
            "Account", s.toLowerCase(Locale.US)
        });
    }

    private static String f(String s)
    {
        return TextUtils.join("|", new Object[] {
            "Tickets", s.toLowerCase(Locale.US)
        });
    }

    public final com.microsoft.onlineid.sts.b a(String s)
    {
        return (com.microsoft.onlineid.sts.b)a("Accounts", e(s), ((com.microsoft.onlineid.internal.e.a) (new com.microsoft.onlineid.internal.e.b())));
    }

    public final i a()
    {
        return (i)a.a("Device", new com.microsoft.onlineid.internal.e.b());
    }

    public final void a(long l)
    {
        a.a().a("ClockSkew", l).a();
    }

    public final void a(Bundle bundle)
        throws com.microsoft.onlineid.internal.sso.b
    {
        Object obj;
        Object obj1 = bundle.getBundle("com.microsoft.onlineid.backup_device");
        obj = null;
        if (obj1 != null)
        {
            obj = com.microsoft.onlineid.internal.sso.a.a(((Bundle) (obj1)));
            Object obj3;
            Object obj4;
            com.microsoft.onlineid.internal.sso.b b1;
            String s;
            try
            {
                obj = (new com.microsoft.onlineid.internal.e.b()).a(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new com.microsoft.onlineid.internal.e.d(bundle);
            }
        }
        obj3 = bundle.getParcelableArrayList("com.microsoft.onlineid.backup_users");
        bundle = new HashMap();
        obj1 = new com.microsoft.onlineid.internal.e.b();
        if (obj3 == null) goto _L2; else goto _L1
_L1:
        obj3 = ((List) (obj3)).iterator();
_L3:
        if (!((Iterator) (obj3)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj4 = (Bundle)((Iterator) (obj3)).next();
        obj4 = com.microsoft.onlineid.internal.sso.a.b(((Bundle) (obj4)));
        s = ((com.microsoft.onlineid.internal.e.a) (obj1)).a(obj4);
        bundle.put(e(((com.microsoft.onlineid.sts.b) (obj4)).b()), s);
        continue; /* Loop/switch isn't completed */
_L4:
        if (true) goto _L3; else goto _L2
        IOException ioexception;
        ioexception;
        try
        {
            throw new com.microsoft.onlineid.internal.e.d(ioexception);
        }
        // Misplaced declaration of an exception variable
        catch (com.microsoft.onlineid.internal.sso.b b1)
        {
            com.microsoft.onlineid.internal.c.d.c("Encountered an error while trying to unbundle accounts.", b1);
            com.microsoft.onlineid.a.a.a().a(b1);
        }
          goto _L4
_L2:
        Object obj2 = b;
        obj2;
        JVM INSTR monitorenter ;
        c.a a1 = a.a();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        a1.a("Device", ((String) (obj)));
        for (Iterator iterator = a.b("Accounts").iterator(); iterator.hasNext(); a(((String)iterator.next()).replace("Account", "Tickets"), ((Map) (null)), a1)) { }
        break MISSING_BLOCK_LABEL_264;
        bundle;
        obj2;
        JVM INSTR monitorexit ;
        throw bundle;
        a("Accounts", ((Map) (bundle)), a1);
        a1.a("LastBackupReceivedTime", System.currentTimeMillis());
        a1.a();
        obj2;
        JVM INSTR monitorexit ;
    }

    public final void a(com.microsoft.onlineid.sts.b b1)
    {
        o.a(b1.b(), "account.PUID");
        a("Accounts", e(b1.b()), b1, ((com.microsoft.onlineid.internal.e.a) (new com.microsoft.onlineid.internal.e.b())));
    }

    public final void a(i l)
    {
        a.a().a("Device", l, new com.microsoft.onlineid.internal.e.b()).a();
    }

    final void a(String s, String s1, com.microsoft.onlineid.d d1)
    {
        a(f(s), new String[] {
            c(s, s1, d1)
        });
    }

    final void a(String s, String s1, com.microsoft.onlineid.i l)
    {
        a(f(s), c(s, s1, l.a()), l, ((com.microsoft.onlineid.internal.e.a) (new com.microsoft.onlineid.internal.e.b())));
    }

    final com.microsoft.onlineid.i b(String s, String s1, com.microsoft.onlineid.d d1)
    {
        return (com.microsoft.onlineid.i)a(f(s), c(s, s1, d1), new com.microsoft.onlineid.internal.e.b());
    }

    public final void b()
    {
        a.a().a("Device").a();
    }

    public final void b(String s)
    {
        a("Accounts", new String[] {
            e(s)
        });
        String s1 = f(s);
        synchronized (b)
        {
            c.a a1 = a.a();
            a(s1, ((Map) (null)), a1);
            a1.a();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final long c()
    {
        return a.c("ClockSkew");
    }

    public final void c(String s)
    {
        a.a().a("SdkVersion", s).a();
    }

    public final boolean d()
    {
        return d("Accounts");
    }

    public final Set e()
    {
        return a("Accounts", new com.microsoft.onlineid.internal.e.b());
    }

    public final Bundle f()
    {
        Bundle bundle = new Bundle();
        i l = a();
        if (l != null)
        {
            Bundle bundle1 = new Bundle();
            bundle1.putString("com.microsoft.onlineid.device_puid", l.b());
            Object obj = l.a();
            bundle1.putString("com.microsoft.onlineid.device_username", ((h) (obj)).a());
            bundle1.putString("com.microsoft.onlineid.device_password", ((h) (obj)).b());
            obj = l.c();
            bundle1.putString("com.microsoft.onlineid.device_datoken", ((com.microsoft.onlineid.sts.f) (obj)).a());
            bundle1.putByteArray("com.microsoft.onlineid.device_session_key_base64", ((com.microsoft.onlineid.sts.f) (obj)).b());
            bundle.putBundle("com.microsoft.onlineid.backup_device", bundle1);
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = e().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.microsoft.onlineid.sts.b b1 = (com.microsoft.onlineid.sts.b)iterator.next();
            Bundle bundle2 = com.microsoft.onlineid.internal.sso.a.a(b1);
            com.microsoft.onlineid.sts.f f1 = b1.e();
            Bundle bundle3 = new Bundle();
            bundle3.putString("com.microsoft.onlineid.user_datoken", f1.a());
            bundle3.putByteArray("com.microsoft.onlineid.user_session_key_base64", f1.b());
            bundle2.putAll(bundle3);
            arraylist.add(bundle2);
            if (l == null)
            {
                boolean flag;
                if (!d(f(b1.b())))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.microsoft.onlineid.internal.e.a(flag);
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            bundle.putParcelableArrayList("com.microsoft.onlineid.backup_users", arraylist);
        }
        return bundle;
    }

    public final void g()
    {
        a.a().a("LastBackupPushedTime", System.currentTimeMillis()).a();
    }

    public final long h()
    {
        return a.c("LastBackupPushedTime");
    }

    public final void i()
    {
        a.a().a("ConfigLastDownloadedTime", System.currentTimeMillis()).a();
    }

    public final long j()
    {
        return a.c("ConfigLastDownloadedTime");
    }

    public final String k()
    {
        return a.a("SdkVersion");
    }

}
