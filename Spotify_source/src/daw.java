// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import com.sony.snei.np.android.a.a.b;
import com.sony.snei.np.android.a.a.c;
import com.sony.snei.np.android.account.oauth.InvalidInstanceException;
import com.sony.snei.np.android.account.oauth.hide.DelegateStateId;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public abstract class daw
    implements dam
{

    private static final IntentFilter f;
    private static boolean j;
    public final Context a;
    public final dar b;
    public final dbg c;
    public final String d;
    public String e;
    private final BroadcastReceiver g;
    private final Handler h;
    private final dbj i;

    public daw(Context context, dba dba)
    {
        e = null;
        if (!j && context == null)
        {
            throw new AssertionError();
        } else
        {
            a = context.getApplicationContext();
            h = new Handler(a.getMainLooper());
            c = new dbg(context);
            d = com.sony.snei.np.android.a.a.b.a(a).a();
            b = new dar(DelegateStateId.a, dba);
            i = new dbj(b);
            g = new dax(this, "com.sony.snei.np.android.account");
            a.registerReceiver(g, f);
            return;
        }
    }

    public final Handler a(Handler handler)
    {
        if (handler != null)
        {
            return handler;
        } else
        {
            return h;
        }
    }

    public final dbi a(dbl dbl1)
    {
        return i.a(dbl1);
    }

    public void a()
    {
        if (DelegateStateId.d.equals(b.a())) goto _L2; else goto _L1
_L1:
        Object obj;
        b.a(DelegateStateId.d, null);
        a.unregisterReceiver(g);
        obj = i;
        HashMap hashmap = ((dbj) (obj)).a;
        hashmap;
        JVM INSTR monitorenter ;
        Iterator iterator = ((dbj) (obj)).a.entrySet().iterator();
_L4:
        dbi dbi1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_117;
            }
            dbi1 = ((dbk)((java.util.Map.Entry)iterator.next()).getValue()).a.c;
        } while (dbi1 == null);
        dbi1.cancel(true);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        hashmap;
        JVM INSTR monitorexit ;
        throw obj;
        ((dbj) (obj)).a.clear();
        hashmap;
        JVM INSTR monitorexit ;
_L2:
    }

    public boolean a(String s)
    {
        try
        {
            d();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (!TextUtils.isEmpty(s))
        {
            dbp dbp1 = dbp.a();
            String s1 = dbp1.a;
            boolean flag;
            if (!dbp.a(s))
            {
                flag = false;
            } else
            {
                s = s.toLowerCase(Locale.ENGLISH);
                dbp.b();
                dbp1.a = s;
                flag = true;
            }
            if (flag)
            {
                s = dbp1.a;
                if (!s1.equals(s))
                {
                    a(new dbl(s) {

                        private String a;
                        private daw b;

                        protected final Object a(dar dar1, Exception exception)
                        {
                            dar1.a(DelegateStateId.a, null);
                            throw exception;
                        }

                        protected final volatile Object a(dar dar1, Object obj)
                        {
                            obj = (Void)obj;
                            dar1.a(DelegateStateId.a, null);
                            return obj;
                        }

                        protected final void a(dar dar1)
                        {
                            final class _cls2
                            {

                                static final int a[];

                                static 
                                {
                                    a = new int[DelegateStateId.values().length];
                                    try
                                    {
                                        a[DelegateStateId.d.ordinal()] = 1;
                                    }
                                    catch (NoSuchFieldError nosuchfielderror1) { }
                                    try
                                    {
                                        a[DelegateStateId.c.ordinal()] = 2;
                                    }
                                    catch (NoSuchFieldError nosuchfielderror)
                                    {
                                        return;
                                    }
                                }
                            }

                            switch (_cls2.a[dar1.a().ordinal()])
                            {
                            default:
                                return;

                            case 1: // '\001'
                            case 2: // '\002'
                                throw new IllegalStateException(dar1.a().name());
                            }
                        }

                        protected final Object b(dar dar1)
                        {
                            b.c.b(a);
                            b.e = null;
                            return null;
                        }

            
            {
                b = daw.this;
                a = s;
                super();
            }
                    });
                }
                return true;
            }
        }
        return false;
    }

    public String b()
    {
        return dbp.a().a;
    }

    public abstract void c();

    public final void d()
    {
        switch (_cls2.a[b.a().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            throw new InvalidInstanceException();
        }
    }

    static 
    {
        IntentFilter intentfilter;
        boolean flag;
        if (!daw.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        intentfilter = new IntentFilter();
        f = intentfilter;
        intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
        f.addAction("android.intent.action.PACKAGE_REMOVED");
        f.addAction("android.intent.action.PACKAGE_REPLACED");
        f.addAction("android.intent.action.PACKAGE_CHANGED");
        f.addDataScheme("package");
    }
}
