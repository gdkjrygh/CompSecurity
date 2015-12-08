// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            ap, gs

public class ak
{

    private final Object mw = new Object();
    private final int nf;
    private final int ng;
    private final int nh;
    private final ap ni;
    private ArrayList nj;
    private int nk;
    private int nl;
    private int nm;
    private int nn;
    private String no;

    public ak(int k, int l, int i1, int j1)
    {
        nj = new ArrayList();
        nk = 0;
        nl = 0;
        nm = 0;
        no = "";
        nf = k;
        ng = l;
        nh = i1;
        ni = new ap(j1);
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
        if (s == null || s.length() < nh)
        {
            return;
        }
        synchronized (mw)
        {
            nj.add(s);
            nk = nk + s.length();
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    int a(int k, int l)
    {
        return nf * k + ng * l;
    }

    public boolean aN()
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (nm == 0)
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

    public String aO()
    {
        return no;
    }

    public void aP()
    {
        synchronized (mw)
        {
            nn = nn - 100;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void aQ()
    {
        synchronized (mw)
        {
            nm = nm - 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void aR()
    {
        synchronized (mw)
        {
            nm = nm + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void aS()
    {
        synchronized (mw)
        {
            int k = a(nk, nl);
            if (k > nn)
            {
                nn = k;
                no = ni.a(nj);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    int aT()
    {
        return nk;
    }

    public void c(int k)
    {
        nl = k;
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
            if (((ak) (obj)).aO() != null && ((ak) (obj)).aO().equals(aO()))
            {
                return true;
            }
        }
        return false;
    }

    public int getScore()
    {
        return nn;
    }

    public void h(String s)
    {
        j(s);
        synchronized (mw)
        {
            if (nm < 0)
            {
                gs.S("ActivityContent: negative number of WebViews.");
            }
            aS();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int hashCode()
    {
        return aO().hashCode();
    }

    public void i(String s)
    {
        j(s);
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActivityContent fetchId: ").append(nl).append(" score:").append(nn).append(" total_length:").append(nk).append("\n text: ").append(a(nj, 200)).append("\n signture: ").append(no).toString();
    }
}
