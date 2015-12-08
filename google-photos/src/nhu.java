// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AuthenticatorException;
import android.content.Intent;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class nhu
{

    final mne a;
    final String b;
    final ngg c;
    final boolean d;
    final mmz e;
    nyg f;
    boolean g;
    List h;
    int i;
    boolean j;
    boolean k;
    final nhr l;
    private Map m;
    private List n;
    private boolean o;

    nhu(nhr nhr1, mne mne1, String s, ngg ngg, boolean flag)
    {
        l = nhr1;
        super();
        n = new ArrayList();
        a = mne1;
        b = s;
        c = ngg;
        d = flag;
        i = nhr.a(nhr1).b(mne1.a, s);
        if (i == -1)
        {
            nhr1 = nhr.a(nhr1).a(mne1.a, s);
        } else
        {
            nhr1 = nhr.a(nhr1).b(i);
        }
        e = nhr1;
        e.c("device_index", mne1.b);
    }

    final void a(Exception exception)
    {
        boolean flag1 = false;
        Log.e("LoginManager", "Account update failed", exception);
        n.add(exception);
        j = true;
        boolean flag = true;
        while (exception != null) 
        {
            if (exception instanceof lwy)
            {
                Object obj = (lwy)exception;
                SparseArray sparsearray = nhr.f(l);
                int i1 = i;
                if (((lwy) (obj)).a == null)
                {
                    obj = null;
                } else
                {
                    obj = new Intent(((lwy) (obj)).a);
                }
                sparsearray.put(i1, obj);
            } else
            if (exception instanceof AuthenticatorException)
            {
                flag = false;
            }
            exception = exception.getCause();
        }
        o = o | flag;
        boolean flag2 = k;
        if (!flag)
        {
            flag1 = true;
        }
        k = flag2 | flag1;
    }

    final void a(List list)
    {
        if (!j)
        {
            m = new IdentityHashMap();
            Object obj = new ArrayList();
            ngo ngo1;
            ngp ngp2;
            for (Iterator iterator = h.iterator(); iterator.hasNext(); m.put(ngo1, ngp2))
            {
                ngo1 = (ngo)iterator.next();
                ngp2 = ngo1.a(e, g);
            }

            Iterator iterator1 = m.values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                ngp ngp1 = (ngp)iterator1.next();
                if (ngp1 != null)
                {
                    ngp1.a(e, f, ((List) (obj)));
                }
            } while (true);
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                list.add(new nhv(this, (nxx)((Iterator) (obj)).next()));
            }
        }
    }

    public final void a(ngw ngw1)
    {
        boolean flag1 = ngw1.a;
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ngw1.a = flag & flag1;
        ngw1.b = ngw1.b | o;
        ngw1.c = ngw1.c | k;
        ngw1.f.add(Integer.valueOf(i));
        ngw1.e.addAll(n);
        ngw1.d = i;
    }

    final boolean a()
    {
        if (j)
        {
            return true;
        }
        Iterator iterator = m.keySet().iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ngo ngo1;
        ngp ngp1;
        ngo1 = (ngo)iterator.next();
        ngp1 = (ngp)m.get(ngo1);
        if (ngp1 == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        boolean flag;
        if (ngp1.a(e) == ngq.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L4:
        if (!flag)
        {
            try
            {
                h.remove(ngo1);
            }
            catch (IOException ioexception)
            {
                a(((Exception) (ioexception)));
                return true;
            }
        }
          goto _L3
_L2:
        boolean flag1 = h.isEmpty();
        return flag1;
        flag = false;
          goto _L4
    }
}
