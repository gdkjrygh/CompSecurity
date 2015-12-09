// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.os.AsyncTask;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import java.lang.ref.WeakReference;
import p.cw.c;
import p.cx.t;
import p.df.a;

public class r extends AsyncTask
{
    public static interface a
    {

        public abstract void a(String s1, String s2);
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b c[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(p/cm/r$b, s1);
        }

        public static b[] values()
        {
            return (b[])c.clone();
        }

        static 
        {
            a = new b("Get", 0);
            b = new b("Post", 1);
            c = (new b[] {
                a, b
            });
        }

        private b(String s1, int i)
        {
            super(s1, i);
        }
    }


    private final String a[];
    private final String b;
    private final b c;
    private final WeakReference d;

    public r(String as[], String s1, b b1, WeakReference weakreference)
    {
        a = as;
        b = s1;
        c = b1;
        d = weakreference;
    }

    protected transient String a(Object aobj[])
    {
        String as[];
        int i;
        int j;
        if (isCancelled())
        {
            return null;
        }
        as = a;
        j = as.length;
        i = 0;
_L9:
        String s1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        s1 = as[i];
        if (c != p.cm.b.b) goto _L2; else goto _L1
_L1:
        Object obj;
        p.df.a.c("HttpRequestAsyncTask", (new StringBuilder()).append("post request ").append(s1).toString());
        obj = com.pandora.android.provider.b.a.b().p();
        if (b != null) goto _L4; else goto _L3
_L3:
        aobj = "";
_L5:
        aobj = ((t) (obj)).a(s1, ((String) (aobj)), p.cx.t.a.b);
_L6:
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        obj = (a)d.get();
        if (obj != null)
        {
            try
            {
                ((a) (obj)).a(s1, ((String) (aobj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                p.df.a.b("HttpRequestAsyncTask", "HttpRequestAsyncTask error (handled)", ((Throwable) (aobj)));
                return "false";
            }
        }
        break MISSING_BLOCK_LABEL_247;
_L4:
        aobj = b;
          goto _L5
_L2:
        if (!s.a(b))
        {
            break MISSING_BLOCK_LABEL_203;
        }
        aobj = s1;
_L7:
        p.df.a.c("HttpRequestAsyncTask", (new StringBuilder()).append("HttpRequestAsyncTask, get request ").append(((String) (aobj))).toString());
        aobj = com.pandora.android.provider.b.a.b().p().a(((String) (aobj)), p.cx.t.a.b);
          goto _L6
        aobj = (new StringBuilder()).append(s1).append("?").append(b).toString();
          goto _L7
        return null;
          goto _L6
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }
}
