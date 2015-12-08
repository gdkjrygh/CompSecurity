// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public final class cah
{

    final Object a = new Object();
    int b;
    int c;
    int d;
    int e;
    public String f;
    private final int g;
    private final int h;
    private final int i;
    private final can j;
    private ArrayList k;

    public cah(int l, int i1, int j1, int k1)
    {
        k = new ArrayList();
        b = 0;
        c = 0;
        d = 0;
        f = "";
        g = l;
        h = i1;
        i = j1;
        j = new can(k1);
    }

    private static String a(ArrayList arraylist)
    {
        if (arraylist.isEmpty())
        {
            arraylist = "";
        } else
        {
            Object obj = new StringBuffer();
            arraylist = arraylist.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                ((StringBuffer) (obj)).append((String)arraylist.next());
                ((StringBuffer) (obj)).append(' ');
            } while (((StringBuffer) (obj)).length() <= 200);
            ((StringBuffer) (obj)).deleteCharAt(((StringBuffer) (obj)).length() - 1);
            obj = ((StringBuffer) (obj)).toString();
            arraylist = ((ArrayList) (obj));
            if (((String) (obj)).length() >= 200)
            {
                return ((String) (obj)).substring(0, 200);
            }
        }
        return arraylist;
    }

    public final void a(String s)
    {
        b(s);
        synchronized (a)
        {
            if (d < 0)
            {
                bka.a("ActivityContent: negative number of WebViews.");
            }
            c();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (d == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (a)
        {
            d = d + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void b(String s)
    {
        if (s == null || s.length() < i)
        {
            return;
        }
        synchronized (a)
        {
            k.add(s);
            b = b + s.length();
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void c()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        StringBuffer stringbuffer;
        int l = b;
        int i1 = c;
        l = l * g + i1 * h;
        if (l <= e)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        e = l;
        obj1 = j;
        Object obj2 = k;
        stringbuffer = new StringBuffer();
        for (obj2 = ((ArrayList) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); stringbuffer.append('\n'))
        {
            stringbuffer.append(((String)((Iterator) (obj2)).next()).toLowerCase(Locale.US));
        }

        break MISSING_BLOCK_LABEL_123;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        f = ((can) (obj1)).a(stringbuffer.toString());
        obj;
        JVM INSTR monitorexit ;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof cah)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (cah)obj;
            if (((cah) (obj)).f != null && ((cah) (obj)).f.equals(f))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return f.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("ActivityContent fetchId: ")).append(c).append(" score:").append(e).append(" total_length:").append(b).append("\n text: ").append(a(k)).append("\n signture: ").append(f).toString();
    }
}
