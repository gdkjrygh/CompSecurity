// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mtj
    implements oor, opl, opn, opp, opr, ops, opv
{

    private static final mua c = new mtm();
    mtn a;
    public mua b;
    private final ArrayList d;
    private final jz e;
    private Activity f;
    private mty g;

    public mtj(am am, opd opd1)
    {
        d = new ArrayList();
        e = new jz();
        b = c;
        am.getClass().getSimpleName();
        opd1.a(this);
    }

    public mtj(Activity activity, opd opd1)
    {
        d = new ArrayList();
        e = new jz();
        b = c;
        f = activity;
        activity.getClass().getSimpleName();
        opd1.a(this);
    }

    public static void a(Context context, mtf mtf1)
    {
        Context context1 = context.getApplicationContext();
        context = (mty)olm.a(context, mty);
        mtf1.c(context1);
        if (b.t())
        {
            context.a(mtf1, null);
            return;
        } else
        {
            b.a(new mtk(context, mtf1));
            return;
        }
    }

    public static boolean a(Context context, String s)
    {
        context = (mty)olm.a(context, mty);
        b.u();
        int j = ((mty) (context)).c.size();
        for (int i = 0; i < j; i++)
        {
            if (((mtf)((mty) (context)).c.get(i)).d.equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public static mue b(Context context, mtf mtf1)
    {
        mue mue;
        if (context != null)
        {
            context = context.getApplicationContext();
        } else
        {
            context = null;
        }
        mtf1.c(context);
        mtf1.b();
        mue = mtf1.e(context);
        mtf1.d(context);
        return mue;
        Exception exception;
        exception;
        mtf1.d(context);
        throw exception;
    }

    public final mtj a(String s, mud mud1)
    {
        ArrayList arraylist1 = (ArrayList)e.get(s);
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            arraylist = new ArrayList();
            e.put(s, arraylist);
        }
        arraylist.add(mud1);
        return this;
    }

    public final mtj a(mti mti1)
    {
        d.add(mti1);
        return this;
    }

    public final mtj a(olm olm1)
    {
        olm1.a(mtj, this);
        return this;
    }

    public final void a(Activity activity)
    {
        f = activity;
    }

    public final void a(Bundle bundle)
    {
        g = (mty)olm.a(f, mty);
        if (bundle != null)
        {
            a = (mtn)bundle.getParcelable("boc_background_tasks");
        } else
        {
            a = new mtn(g);
        }
        bundle = (mub)olm.b(f, mub);
        if (bundle != null && (f instanceof ar))
        {
            ay ay = ((ar)f).c();
            b = bundle.a(f, ay);
        }
    }

    final void a(String s, mue mue)
    {
        a.a(s);
        b.a(s);
        b.c = true;
        ArrayList arraylist = (ArrayList)e.get(s);
        if (arraylist != null)
        {
            for (int i = arraylist.size() - 1; i >= 0; i--)
            {
                ((mud)arraylist.get(i)).a(mue, b);
            }

        }
        for (int j = d.size() - 1; j >= 0; j--)
        {
            ((mti)d.get(j)).a(s, mue, b);
        }

        if (b.c)
        {
            b.a(mue);
        }
    }

    public final void a(mtf mtf1)
    {
        mtn mtn1 = a;
        String s = mtf1.d;
        Integer integer = (Integer)mtn1.c.get(s);
        if (integer == null)
        {
            integer = Integer.valueOf(1);
        } else
        {
            integer = Integer.valueOf(integer.intValue() + 1);
        }
        mtn1.c.put(s, integer);
        mtf1.c(f.getApplicationContext());
        g.a(mtf1, this);
    }

    public final boolean a(String s)
    {
        while (a == null || g.a(this, s) <= 0) 
        {
            return false;
        }
        return true;
    }

    public final void al_()
    {
        mty mty1 = g;
        b.u();
        int k = a.b;
        mty1.b.put(k, this);
        if (Log.isLoggable("BackgroundTask", 3))
        {
            (new StringBuilder(29)).append("Register manager: ").append(k);
        }
        Object obj = a;
        int l;
        if (((mtn) (obj)).c.isEmpty())
        {
            obj = mtn.a;
        } else
        {
            String as[] = new String[((mtn) (obj)).c.size()];
            obj = (String[])((mtn) (obj)).c.keySet().toArray(as);
        }
        l = obj.length;
        for (int i = 0; i < l; i++)
        {
            String s = obj[i];
            for (int j = b.a((Integer)a.c.get(s)) - mty1.a(this, s); j > 0; j--)
            {
                mue mue = mty1.f.a(k, s);
                if (Log.isLoggable("BackgroundTask", 4))
                {
                    String s1 = String.valueOf(mue);
                    (new StringBuilder(String.valueOf(s).length() + 40 + String.valueOf(s1).length())).append("Deliver saved background task result: ").append(s).append(", ").append(s1);
                }
                a(s, mue);
            }

        }

    }

    public final void am_()
    {
        mty mty1 = g;
        b.u();
        int i = a.b;
        mty1.b.remove(i);
        if (Log.isLoggable("BackgroundTask", 3))
        {
            (new StringBuilder(31)).append("Unregister manager: ").append(i);
        }
    }

    public final mtj b(mti mti1)
    {
        d.remove(mti1);
        return this;
    }

    public final void b(String s)
    {
        int j = 0;
        mty mty1 = g;
        int i;
        int k;
        if (this != null)
        {
            i = a.b;
        } else
        {
            i = 0;
        }
        for (k = mty1.c.size(); j < k; j++)
        {
            mtf mtf1 = (mtf)mty1.c.get(j);
            if (mtf1.f == i && mtf1.d.equals(s))
            {
                mtf1.a(true);
            }
        }

    }

    public final void b(mtf mtf1)
    {
        b.a(mtf1, false);
        a(mtf1);
    }

    public final void c()
    {
        if (f.isFinishing())
        {
            mty mty1 = g;
            int k = a.b;
            int l = mty1.c.size();
            int j = 0;
            int i = 0;
            for (; j < l; j++)
            {
                mtf mtf1 = (mtf)mty1.c.get(j);
                if (mtf1.f == k)
                {
                    mtf1.f = 0;
                    i++;
                }
            }

            j = mty1.f.a(k);
            if (Log.isLoggable("BackgroundTask", 3))
            {
                (new StringBuilder(95)).append("Permanently remove manager: ").append(k).append(", pending ops: ").append(i).append(", results dropped: ").append(j);
            }
        }
    }

    final int d()
    {
        return a.b;
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("boc_background_tasks", a);
    }

}
