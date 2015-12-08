// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            ap, gr

public class ak
{

    private final Object mH = new Object();
    private final int np;
    private final int nq;
    private final int nr;
    private final ap ns;
    private ArrayList nt;
    private int nu;
    private int nv;
    private int nw;
    private int nx;
    private String ny;

    public ak(int k, int l, int i1, int j1)
    {
        nt = new ArrayList();
        nu = 0;
        nv = 0;
        nw = 0;
        ny = "";
        np = k;
        nq = l;
        nr = i1;
        ns = new ap(j1);
    }

    private String a(ArrayList arraylist, int k)
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
            } while (((StringBuffer) (obj)).length() <= k);
            ((StringBuffer) (obj)).deleteCharAt(((StringBuffer) (obj)).length() - 1);
            obj = ((StringBuffer) (obj)).toString();
            arraylist = ((ArrayList) (obj));
            if (((String) (obj)).length() >= k)
            {
                return ((String) (obj)).substring(0, k);
            }
        }
        return arraylist;
    }

    private void j(String s)
    {
        if (s == null || s.length() < nr)
        {
            return;
        }
        synchronized (mH)
        {
            nt.add(s);
            nu = nu + s.length();
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    int a(int k, int l)
    {
        return np * k + nq * l;
    }

    public boolean aS()
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (nw == 0)
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

    public String aT()
    {
        return ny;
    }

    public void aU()
    {
        synchronized (mH)
        {
            nx = nx - 100;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void aV()
    {
        synchronized (mH)
        {
            nw = nw - 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void aW()
    {
        synchronized (mH)
        {
            nw = nw + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void aX()
    {
        synchronized (mH)
        {
            int k = a(nu, nv);
            if (k > nx)
            {
                nx = k;
                ny = ns.a(nt);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    int aY()
    {
        return nu;
    }

    public void c(int k)
    {
        nv = k;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ak)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (ak)obj;
            if (((ak) (obj)).aT() != null && ((ak) (obj)).aT().equals(aT()))
            {
                return true;
            }
        }
        return false;
    }

    public int getScore()
    {
        return nx;
    }

    public void h(String s)
    {
        j(s);
        synchronized (mH)
        {
            if (nw < 0)
            {
                gr.S("ActivityContent: negative number of WebViews.");
            }
            aX();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int hashCode()
    {
        return aT().hashCode();
    }

    public void i(String s)
    {
        j(s);
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActivityContent fetchId: ").append(nv).append(" score:").append(nx).append(" total_length:").append(nu).append("\n text: ").append(a(nt, 200)).append("\n signture: ").append(ny).toString();
    }
}
