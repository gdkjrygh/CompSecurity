// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;

public final class fqk
    implements fqw
{

    final Context a;
    final fqx b;
    fql c;
    fqv d;
    AsyncTask e;

    public fqk(Context context, fqx fqx)
    {
        a = context;
        b = fqx;
    }

    public final void a()
    {
        d.a();
        d = null;
        if (e != null)
        {
            e.cancel(false);
            e = null;
        }
    }

    public final void b()
    {
        e = new AsyncTask() {

            private fqk a;

            protected final Object doInBackground(Object aobj[])
            {
                return Boolean.valueOf(a.d.a(a.b));
            }

            protected final void onPostExecute(Object obj)
            {
                obj = (Boolean)obj;
                a.e = null;
                if (a.c != null)
                {
                    fql fql1 = a.c;
                    fqk fqk1 = a;
                    ((Boolean) (obj)).booleanValue();
                    fql1.a(fqk1);
                }
            }

            
            {
                a = fqk.this;
                super();
            }
        };
        e.execute(new Void[0]);
    }
}
