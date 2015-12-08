// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.os.AsyncTask;
import java.util.HashMap;
import p.cx.t;
import p.df.a;

public class n extends AsyncTask
{
    public static interface a
    {

        public abstract void b(String s);
    }


    private String a;
    private String b;
    private a c;
    private t d;

    public n(String s, String s1, a a1, t t1)
    {
        a = s;
        b = s1;
        c = a1;
        d = t1;
    }

    static String a(n n1)
    {
        return n1.b;
    }

    protected transient String a(Void avoid[])
    {
        try
        {
            if (b == null)
            {
                avoid = new HashMap();
            } else
            {
                avoid = new HashMap(1) {

                    final n a;

            
            {
                a = n.this;
                super(i);
                put("Cookie", (new StringBuilder()).append("pat=").append(p.di.n.a(a)).toString());
            }
                };
            }
            return d.a(a, avoid);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            p.df.a.b("BANNER AD", (new StringBuilder()).append("Error hitting url: ").append(a).toString(), avoid);
        }
        return null;
    }

    protected void a(String s)
    {
        c.b(s);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((String)obj);
    }
}
