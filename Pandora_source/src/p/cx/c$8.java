// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.os.AsyncTask;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.f;
import com.pandora.radio.provider.i;
import java.util.Hashtable;
import java.util.List;
import p.cw.c;

// Referenced classes of package p.cx:
//            c

class s.AsyncTask extends AsyncTask
{

    final .Void a;
    final p.cx.c b;

    protected transient Void a(Void avoid[])
    {
        if (p.cx.c.c(b).y().d())
        {
            avoid = p.cx.c.c(b).y().a(p.cx.c.c(b).x().b("SORT_PREFERENCE"), true);
            c.h(b).clear();
            p.ds.f af[] = new p.ds.f[avoid.size()];
            int l = 0;
            while (l < avoid.size()) 
            {
                y y1 = (y)avoid.get(l);
                int j;
                int k;
                if (y1.j())
                {
                    k = 4;
                } else
                {
                    k = 0;
                }
                j = k;
                if (y1.k())
                {
                    j = k | 2;
                }
                k = j;
                if (y1.n())
                {
                    k = j | 1;
                }
                af[l] = new p.ds.f(y1.c(), k, y1.d());
                c.h(b).put(Integer.valueOf(af[l].b()), y1.o());
                l++;
            }
            c.a(b, af);
            avoid.clear();
        } else
        {
            c.a(b, new p.ds.f[0]);
            c.h(b).clear();
        }
        return null;
    }

    protected void a(Void void1)
    {
        if (a != null)
        {
            a.a();
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    .Object(p.cx.c c1, .Object obj)
    {
        b = c1;
        a = obj;
        super();
    }
}
