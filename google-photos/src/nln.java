// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;

public class nln
{

    private final Context a;
    private final noz b;
    private final noz c;
    private final noz d;
    private final Class e;
    private final String f;
    private final int g;
    private nlh h;
    private nlj i[];

    public transient nln(Context context, Class class1, String s, int j, nlj anlj[])
    {
        i = anlj;
        a = context.getApplicationContext();
        e = class1;
        f = s;
        g = j;
        b = noz.a(context, "MediaSync", new String[0]);
        c = noz.a(context, 3, "MediaSync", new String[] {
            "perf", "sync"
        });
        d = noz.a(context, 2, "MediaSync", new String[0]);
    }

    private void b()
    {
        if (h == null || h.e)
        {
            return;
        }
        nlh nlh1 = h;
        nlh1.c = true;
        nlg nlg1 = nlh1.d;
        if (nlg1 != null)
        {
            nlg1.a();
        }
        if (nlh1.b.a())
        {
            noy.a("current synchronize request", nlg1);
        }
        try
        {
            h.join();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(boolean flag)
    {
        boolean flag3 = true;
        this;
        JVM INSTR monitorenter ;
        nlm nlm1 = nlm.a(a, new nlf(a), getClass());
        boolean flag1 = flag3;
        if (h == null) goto _L2; else goto _L1
_L1:
        if (!h.e) goto _L4; else goto _L3
_L3:
        flag1 = flag3;
_L2:
        if (!flag1) goto _L6; else goto _L5
_L5:
        Object obj;
        SharedPreferences sharedpreferences;
        String s;
        b();
        sharedpreferences = a.getSharedPreferences("MediaStoreUriSynchronizer", 0);
        obj = String.valueOf(f);
        s = String.valueOf("-version");
        if (s.length() == 0) goto _L8; else goto _L7
_L7:
        obj = ((String) (obj)).concat(s);
_L9:
        if (sharedpreferences.getInt(((String) (obj)), 0) < g)
        {
            nlm.a(a);
            sharedpreferences.edit().putInt(((String) (obj)), g).apply();
        }
        if (nlm1.a())
        {
            nlm.a(a);
        }
        obj = nlm.a(a, new nle(a), getClass());
        h = new nlh(a, flag, ((nlm) (obj)), nlm1, i, e, c, d);
        h.start();
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L8:
        obj = new String(((String) (obj)));
          goto _L9
        exception;
        throw exception;
_L4:
        Exception exception;
        boolean flag2;
        if (nlm1.a(h.a).a.size() == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag1 = flag3;
        if (flag2)
        {
            flag1 = false;
        }
        if (true) goto _L2; else goto _L10
_L10:
    }

    public final void b(boolean flag)
    {
        a(flag);
        h.join();
    }
}
