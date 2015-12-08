// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.os.AsyncTask;

// Referenced classes of package com.umeng.common.net:
//            r, o, n

public class m extends r
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(o.a a1);
    }

    private class b extends AsyncTask
    {

        final m a;
        private n b;
        private a c;

        protected transient o.a a(Integer ainteger[])
        {
            return a.a(b);
        }

        protected void a(o.a a1)
        {
            if (c != null)
            {
                c.a(a1);
            }
        }

        protected transient Object doInBackground(Object aobj[])
        {
            return a((Integer[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((o.a)obj);
        }

        protected void onPreExecute()
        {
            if (c != null)
            {
                c.a();
            }
        }

        public b(n n, a a1)
        {
            a = m.this;
            super();
            b = n;
            c = a1;
        }
    }


    public m()
    {
    }

    public o.a a(n n)
    {
        n = (o)a(((s) (n)), com/umeng/common/net/o);
        if (n == null)
        {
            return o.a.b;
        } else
        {
            return ((o) (n)).a;
        }
    }

    public void a(n n, a a1)
    {
        (new b(n, a1)).execute(new Integer[0]);
_L1:
        return;
        n;
        if (a1 != null)
        {
            a1.a(o.a.b);
            return;
        }
          goto _L1
    }
}
