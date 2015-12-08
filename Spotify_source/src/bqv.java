// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class bqv
{

    private final Set a = new HashSet();
    private String b;
    private String c;
    private final Map d = new cne();
    private final Context e;
    private final Map f = new cne();
    private int g;
    private Looper h;
    private bqi i;
    private bqq j;
    private final ArrayList k = new ArrayList();
    private final ArrayList l = new ArrayList();
    private col m;

    public bqv(Context context)
    {
        g = -1;
        i = bqi.a();
        j = coj.a;
        e = context;
        h = context.getMainLooper();
        b = context.getPackageName();
        c = context.getClass().getName();
    }

    public final bqv a(bql bql1)
    {
        btl.a(bql1, "Api must not be null");
        f.put(bql1, null);
        Set set = a;
        bql1.a();
        set.addAll(Collections.emptyList());
        return this;
    }

    public final bqv a(bql bql1, bqn bqn)
    {
        btl.a(bql1, "Api must not be null");
        btl.a(bqn, "Null options are not permitted for this Api");
        f.put(bql1, bqn);
        bqn = a;
        bql1.a();
        bqn.addAll(Collections.emptyList());
        return this;
    }

    public final bqv a(bqw bqw)
    {
        btl.a(bqw, "Listener must not be null");
        k.add(bqw);
        return this;
    }

    public final bqv a(bqx bqx)
    {
        btl.a(bqx, "Listener must not be null");
        l.add(bqx);
        return this;
    }

    public final bry a()
    {
        col col1;
        if (f.containsKey(coj.b))
        {
            Set set;
            Map map;
            String s;
            String s1;
            boolean flag;
            if (m == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            btl.a(flag, "SignIn.API can't be used in conjunction with requestServerAuthCode.");
            m = (col)f.get(coj.b);
        }
        set = a;
        map = d;
        s = b;
        s1 = c;
        if (m != null)
        {
            col1 = m;
        } else
        {
            col1 = col.a;
        }
        return new bry(set, map, s, s1, col1);
    }

    final void a(cmv cmv1, bqu bqu1)
    {
        int i1 = g;
        btl.a(bqu1, "GoogleApiClient instance cannot be null");
        cmw cmw1;
        boolean flag;
        if (cmv1.Y.indexOfKey(i1) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(i1).toString());
        cmw1 = new cmw(cmv1, i1, bqu1);
        cmv1.Y.put(i1, cmw1);
        if (cmv1.a && !cmv1.b)
        {
            bqu1.b();
        }
    }

    public final bqu b()
    {
        boolean flag;
        if (!f.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.b(flag, "must call addApi() to add at least one API");
        if (g >= 0)
        {
            cmk cmk1 = new cmk(e.getApplicationContext(), h, a(), i, j, f, k, l);
            cmv cmv1 = cmv.a();
            if (cmv1 == null)
            {
                (new Handler(e.getMainLooper())).post(new Runnable(cmk1) {

                    private bqu a;
                    private bqv b;

                    public final void run()
                    {
                        throw new NullPointerException();
                    }

            
            {
                b = bqv.this;
                a = bqu1;
                super();
            }
                });
                return cmk1;
            } else
            {
                a(cmv1, cmk1);
                return cmk1;
            }
        } else
        {
            return new cmk(e, h, a(), i, j, f, k, l);
        }
    }
}
