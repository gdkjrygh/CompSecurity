// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class fqo
    implements fqw, Runnable
{

    private static final gfa e;
    private static final gfa f;
    private static final gfa g;
    public final gey a;
    public fqv b;
    public fqp c;
    public AsyncTask d;
    private final Context h;

    public fqo(Context context)
    {
        h = context;
        context = new gez("gpiab-fetch-purchases", this);
        context.a = e;
        context.c = f;
        context.d = 10;
        context.e = g;
        a = context.a();
    }

    static fqv a(fqo fqo1)
    {
        return fqo1.b;
    }

    static void a(fqo fqo1, boolean flag, ArrayList arraylist)
    {
        arraylist.size();
        if (fqo1.c != null)
        {
            fqo1.c.a(arraylist);
        }
        if (fqo1.b != null)
        {
            fqo1.b.a();
            fqo1.b = null;
        }
        fqo1.a.a(flag);
    }

    static AsyncTask b(fqo fqo1)
    {
        fqo1.d = null;
        return null;
    }

    public final void b()
    {
        d = (new AsyncTask() {

            private fqo a;

            protected final Object doInBackground(Object aobj[])
            {
                aobj = new ArrayList();
                fqv fqv1 = fqo.a(a);
                if (fqv1 == null)
                {
                    return new fqq(false, ((ArrayList) (aobj)));
                }
                boolean flag1 = true;
                boolean flag = flag1;
                if (fqv1.e)
                {
                    flag = flag1;
                    if (!fqv1.a("inapp", ((java.util.List) (aobj))))
                    {
                        flag = false;
                    }
                }
                flag1 = flag;
                if (fqv1.d)
                {
                    flag1 = flag;
                    if (!fqv1.a("subs", ((java.util.List) (aobj))))
                    {
                        flag1 = false;
                    }
                }
                return new fqq(flag1, ((ArrayList) (aobj)));
            }

            protected final void onCancelled()
            {
                fqo.b(a);
            }

            protected final void onPostExecute(Object obj)
            {
                obj = (fqq)obj;
                fqo.b(a);
                fqo.a(a, ((fqq) (obj)).a, ((fqq) (obj)).b);
            }

            
            {
                a = fqo.this;
                super();
            }
        }).execute(new Void[0]);
    }

    public final void run()
    {
        b = new fqv(h);
        b.f = this;
    }

    static 
    {
        e = new gfd(10L, TimeUnit.SECONDS);
        f = new gfe(10L, 30L, TimeUnit.MINUTES);
        g = new gfe(8L, 14L, TimeUnit.HOURS);
    }
}
