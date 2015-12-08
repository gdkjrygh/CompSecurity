// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public abstract class nxb
{

    private boolean a;
    public final nxg f;
    public final nxd g;
    public volatile Object h;
    public volatile int i;
    public volatile boolean j;
    public volatile int k;
    public volatile int l;
    public boolean m;
    public nxe n;
    public Object o;
    public ArrayList p;

    public nxb(nxg nxg1, nxd nxd)
    {
        f = nxg1;
        g = nxd;
        m = Log.isLoggable("EsResource", 3);
    }

    public static void a(String s1, Throwable throwable)
    {
        Log.e("EsResource", s1, throwable);
    }

    private static void a(StringBuilder stringbuilder, nxe nxe1, Object obj)
    {
        stringbuilder.append(nxe1);
        if (nxe1 instanceof View)
        {
            stringbuilder.append(" context: ").append(((View)nxe1).getContext());
        }
        if (obj != null)
        {
            stringbuilder.append(" tag: ").append(obj);
        }
    }

    public static String c(int i1)
    {
        switch (i1)
        {
        default:
            return String.valueOf(i1);

        case 7: // '\007'
            return "canceled";

        case 2: // '\002'
            return "loading";

        case 3: // '\003'
            return "not found";

        case 6: // '\006'
            return "out of memory";

        case 8: // '\b'
            return "packed";

        case 5: // '\005'
            return "permanent error";

        case 1: // '\001'
            return "ready";

        case 4: // '\004'
            return "transient error";

        case 0: // '\0'
            return "undefined";
        }
    }

    public void a(int i1)
    {
        if (i != 2)
        {
            if (m)
            {
                String s1 = String.valueOf(g);
                String s3 = String.valueOf(c(i));
                String s5 = String.valueOf(c(i1));
                (new StringBuilder(String.valueOf(s1).length() + 96 + String.valueOf(s3).length() + String.valueOf(s5).length())).append("Request no longer needed, not delivering status change: ").append(s1).append(", current status: ").append(s3).append(", ignored new status: ").append(s5);
            }
            return;
        }
        if (m)
        {
            String s2 = String.valueOf(g);
            String s4 = String.valueOf(c(i1));
            (new StringBuilder(String.valueOf(s2).length() + 45 + String.valueOf(s4).length())).append("Delivering error code to consumers: ").append(s2).append(" status: ").append(s4);
        }
        f.a(this, i1);
    }

    public void a(int i1, String s1)
    {
        if (i1 == 404)
        {
            f.a(this, 3);
            return;
        }
        if (i1 == 401)
        {
            f.a(this, 4, i1);
            return;
        } else
        {
            f.a(this, 5, i1);
            return;
        }
    }

    public abstract void a(Object obj);

    public void a(StringBuilder stringbuilder)
    {
    }

    public final void a(nxe nxe1)
    {
        b.u();
        r();
        if (n != nxe1 || o != null && (o == null || !o.equals(null))) goto _L2; else goto _L1
_L1:
        n = null;
        o = null;
        f.b(this);
_L4:
        return;
_L2:
        if (p == null) goto _L4; else goto _L3
_L3:
        int i1;
        int j1;
        j1 = p.size();
        i1 = 0;
_L6:
        if (i1 >= j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((nxc)p.get(i1)).a(nxe1, null))
        {
            break MISSING_BLOCK_LABEL_132;
        }
        p.remove(i1);
        if (!p.isEmpty()) goto _L4; else goto _L5
_L5:
        f.b(this);
        return;
        i1++;
          goto _L6
    }

    public boolean a(nxe nxe1, Object obj)
    {
        if (n == nxe1 && (o == null && obj == null || o != null && o.equals(obj)))
        {
            return true;
        }
        if (p != null)
        {
            int j1 = p.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                if (((nxc)p.get(i1)).a(nxe1, obj))
                {
                    return true;
                }
            }

        }
        return false;
    }

    public abstract void c();

    public void c(Object obj)
    {
        f.a(this, 1, obj);
    }

    public File e()
    {
        return null;
    }

    public File f()
    {
        return null;
    }

    public void h()
    {
        i = 0;
        h = null;
    }

    public void r()
    {
        if (a)
        {
            throw new ConcurrentModificationException("Registering/unregistering resource while delivering status change notification");
        } else
        {
            return;
        }
    }

    public final int s()
    {
        if (p != null)
        {
            return p.size();
        }
        return n == null ? 0 : 1;
    }

    public final void t()
    {
        b.u();
        if (s() == 0)
        {
            h();
            return;
        }
        a = true;
        if (p == null) goto _L2; else goto _L1
_L1:
        int j1 = p.size();
        int i1 = 0;
_L4:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((nxc)p.get(i1)).a.a(this);
        i1++;
        if (true) goto _L4; else goto _L3
_L2:
        if (n != null)
        {
            n.a(this);
        }
_L3:
        a = false;
        return;
        Exception exception;
        exception;
        a = false;
        throw exception;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName()).append('@').append(System.identityHashCode(this)).append("\n  ID: ").append(g).append("\n  Status: ").append(c(i));
        if (j)
        {
            stringbuilder.append("; downloading");
        }
        if (h != null)
        {
            a(stringbuilder);
        }
        stringbuilder.append("\n  Consumers:");
        if (p != null)
        {
            int j1 = p.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                nxc nxc1 = (nxc)p.get(i1);
                stringbuilder.append("\n   ");
                a(stringbuilder, nxc1.a, nxc1.b);
            }

        } else
        if (n != null)
        {
            stringbuilder.append("\n   ");
            a(stringbuilder, n, o);
        } else
        {
            stringbuilder.append("\n   none");
        }
        return stringbuilder.toString();
    }
}
