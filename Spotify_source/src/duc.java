// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.soft.SoftObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class duc extends AbstractCursor
{

    private Bundle a;
    private String b;
    private final Context c;
    private final ExecutorService d;
    private final dwo e;
    private final ArrayList f = new ArrayList();
    private final ArrayList g = new ArrayList();
    private int h;
    private String i;
    private String j[];
    private Map k;
    private int l;
    private boolean m;
    private final Object n = new Object();
    private ContentObserver o;
    private due p;
    private final Object q = new Object();
    private hh r;
    private boolean s;
    private dwp t;

    public duc(Context context, dwo dwo1, Uri uri, String as[], Bundle bundle, ExecutorService executorservice)
    {
        a = new Bundle();
        o = new duf(this);
        r = new hh() {

            protected final volatile int b(Object obj)
            {
                return ((due)obj).b;
            }

        };
        t = new dwp() {

            private duc a;

            public final void a()
            {
                if (duc.a(a))
                {
                    duc.b(a);
                    duc.a(a, false);
                }
            }

            public final void b()
            {
                duc.a(a, true);
            }

            
            {
                a = duc.this;
                super();
            }
        };
        c = context;
        d = executorservice;
        h = bundle.getInt("limit", 0);
        f.add("order");
        g.add(bundle.getString("order"));
        f.add("reverse");
        g.add(String.valueOf(bundle.getBoolean("reverse")));
        if (uri.getQuery() != null)
        {
            gei.a(uri.getEncodedQuery(), f, g);
        }
        e = dwo1;
        e.a();
        e.a(t);
        a.putBoolean("data_loaded", false);
        i = (String)ctz.a(uri.getEncodedPath().substring(1));
        j = (String[])as.clone();
        dwo1 = e.c();
        uri.toString();
        as = i;
        setNotificationUri(context.getContentResolver(), uri);
        b = a(dwo1, i);
        m = false;
        context.getContentResolver().registerContentObserver(uri, false, o);
        boolean flag = true;
        do
        {
            if (!flag)
            {
                break;
            }
            if (!a())
            {
                l = -1;
                try
                {
                    l = dwo1.a(i);
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
                if (!a())
                {
                    if (l < 0)
                    {
                        l = 0;
                        return;
                    }
                    a(0);
                    if (!a())
                    {
                        flag = false;
                    }
                }
            }
        } while (true);
        a.putBoolean("data_loaded", true);
    }

    private String a(eaa eaa1, String s1)
    {
        ctz.a(eaa1);
        String as[] = new String[f.size()];
        String as1[] = new String[g.size()];
        try
        {
            eaa1 = eaa1.a(s1, (String[])f.toArray(as), (String[])g.toArray(as1));
        }
        // Misplaced declaration of an exception variable
        catch (eaa eaa1)
        {
            return null;
        }
        return eaa1;
    }

    private void a(int i1)
    {
        Object obj = (eaa)ctz.a(e.c());
        String s1;
        String as[];
        int j1;
        s1 = i;
        as = j;
        if (h == 0)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        j1 = h;
_L1:
        obj = new due(((eaa) (obj)).a(s1, as, i1 * 30, j1));
        r.a(Integer.valueOf(i1), obj);
        synchronized (q)
        {
            q.notifyAll();
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        synchronized (q)
        {
            q.notifyAll();
        }
        throw exception1;
        exception2;
        obj2;
        JVM INSTR monitorexit ;
        throw exception2;
        j1 = 30;
          goto _L1
    }

    static void a(duc duc1, int i1)
    {
        duc1.a(i1);
    }

    private boolean a()
    {
        Object obj = n;
        obj;
        JVM INSTR monitorenter ;
        if (!m)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        m = false;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean a(Cursor cursor)
    {
        cursor = cursor.getExtras();
        Assertion.a(cursor.containsKey("data_loaded"), "Cursor doesn't contain load state. Is it a MetadataCursor?");
        return cursor.getBoolean("data_loaded");
    }

    static boolean a(duc duc1)
    {
        return duc1.s;
    }

    static boolean a(duc duc1, boolean flag)
    {
        duc1.s = flag;
        return flag;
    }

    private SoftObject b()
    {
        if (getPosition() < 0)
        {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        }
        if (getPosition() >= getCount())
        {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
        Object obj;
        if (!e.d())
        {
            obj = p;
        } else
        {
            obj = (due)r.a(Integer.valueOf(getPosition() / 30));
        }
        if (obj == null)
        {
            return null;
        }
        int i1 = getPosition() % 30;
        if (((due) (obj)).a == null)
        {
            return null;
        }
        obj = ((due) (obj)).a;
        if (!((SoftObject) (obj)).b || i1 >= ((SoftObject) (obj)).a)
        {
            return null;
        } else
        {
            return ((SoftObject) (obj)).c[i1];
        }
    }

    private void b(int i1)
    {
        if (i1 < 0 || i1 >= j.length)
        {
            throw new CursorIndexOutOfBoundsException(String.format("Requested column: %d, # of columns: %d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(j.length)
            }));
        } else
        {
            return;
        }
    }

    static void b(duc duc1)
    {
        duc1.onChange(false);
    }

    static Object c(duc duc1)
    {
        return duc1.n;
    }

    static boolean d(duc duc1)
    {
        duc1.m = true;
        return true;
    }

    public final void close()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isClosed();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        eaa eaa1;
        eaa1 = e.c();
        e.b(t);
        flag = TextUtils.isEmpty(b);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        Exception exception;
        try
        {
            eaa1.a(i, b);
        }
        catch (Exception exception1) { }
        e.b();
        super.close();
        c.getContentResolver().unregisterContentObserver(o);
        p = null;
        if (getPosition() >= 0 && getPosition() < getCount())
        {
            p = (due)r.a(Integer.valueOf(getPosition() / 30));
        }
        if (p == null)
        {
            p = (due)r.a(Integer.valueOf(0));
        }
        r.a();
        if (true) goto _L1; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public final int getColumnIndex(String s1)
    {
        if (k == null)
        {
            k = new HashMap(j.length);
            int i1 = 0;
            for (int j1 = j.length; i1 < j1; i1++)
            {
                k.put(j[i1], Integer.valueOf(i1));
            }

        }
        s1 = (Integer)k.get(s1);
        if (s1 != null)
        {
            return s1.intValue();
        } else
        {
            return -1;
        }
    }

    public final String[] getColumnNames()
    {
        return j;
    }

    public final int getCount()
    {
        if (h != 0)
        {
            return Math.min(l, h);
        } else
        {
            return l;
        }
    }

    public final double getDouble(int i1)
    {
        b(i1);
        SoftObject softobject = b();
        if (softobject == null)
        {
            return 0.0D;
        } else
        {
            return softobject.c(i1);
        }
    }

    public final Bundle getExtras()
    {
        return a;
    }

    public final float getFloat(int i1)
    {
        b(i1);
        SoftObject softobject = b();
        if (softobject == null)
        {
            return 0.0F;
        } else
        {
            return (float)softobject.c(i1);
        }
    }

    public final int getInt(int i1)
    {
        b(i1);
        SoftObject softobject = b();
        if (softobject == null)
        {
            return 0;
        } else
        {
            return (int)softobject.b(i1);
        }
    }

    public final long getLong(int i1)
    {
        b(i1);
        SoftObject softobject = b();
        if (softobject == null)
        {
            return 0L;
        } else
        {
            return softobject.b(i1);
        }
    }

    public final short getShort(int i1)
    {
        b(i1);
        SoftObject softobject = b();
        if (softobject == null)
        {
            return 0;
        } else
        {
            return (short)(int)softobject.b(i1);
        }
    }

    public final String getString(int i1)
    {
        b(i1);
        SoftObject softobject = b();
        if (softobject == null)
        {
            return null;
        }
        switch (softobject.a(i1))
        {
        default:
            throw new com.spotify.mobile.android.util.soft.SoftObject.InvalidTypeException("can't get as string");

        case 64: // '@'
            return "null";

        case 33: // '!'
            if (softobject.d(i1))
            {
                return "true";
            } else
            {
                return "false";
            }

        case 35: // '#'
            return softobject.e(i1);

        case 126: // '~'
            return softobject.e(i1);

        case 40: // '('
            return softobject.e(i1);
        }
    }

    public final boolean isNull(int i1)
    {
        return b() == null || b().a(i1) == 64;
    }

    public final boolean onMove(int i1, int j1)
    {
        if (!e.d())
        {
            Logger.c("No metadata connection after restart ~ %s with %s", new Object[] {
                i, Arrays.toString(j)
            });
            return true;
        }
        Object obj = q;
        obj;
        JVM INSTR monitorenter ;
        int k1;
        k1 = j1 / 30;
        if (r.a(Integer.valueOf(k1)) != null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        d.execute(dud.a(this, k1));
        if (!s)
        {
            q.wait(1337L);
        }
        if (r.a(Integer.valueOf(k1)) != null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        s = true;
_L2:
        return super.onMove(i1, j1);
        Object obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        return false;
        s = false;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final void registerContentObserver(ContentObserver contentobserver)
    {
        Object obj = n;
        obj;
        JVM INSTR monitorenter ;
        super.registerContentObserver(contentobserver);
        if (m)
        {
            if (!gcl.a)
            {
                break MISSING_BLOCK_LABEL_33;
            }
            contentobserver.dispatchChange(false);
        }
_L2:
        return;
        contentobserver.dispatchChange(false, null);
        if (true) goto _L2; else goto _L1
_L1:
        contentobserver;
        obj;
        JVM INSTR monitorexit ;
        throw contentobserver;
    }
}
