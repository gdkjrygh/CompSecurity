// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kik.a.d.j;
import kik.a.e.n;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.f.k;
import kik.a.z;
import kik.android.e.d;
import kik.android.p;

// Referenced classes of package kik.android.util:
//            bf, p, e

public static final class g extends bf
{

    d a;
    String b;
    boolean c;
    final k d;
    final n e;
    final w f;
    final v g;

    private transient Integer a(d ad[])
    {
        p.a(p.a());
        int i;
        try
        {
            if (ad.length > 0)
            {
                a = ad[0];
            }
            if (b != null)
            {
                return Integer.valueOf(p.a(kik.android.util.p.j(), b, d, c, g).a);
            }
            i = p.a(kik.android.util.p.j(), d, g).a;
        }
        // Misplaced declaration of an exception variable
        catch (d ad[])
        {
            return Integer.valueOf(-2);
        }
        // Misplaced declaration of an exception variable
        catch (d ad[])
        {
            return Integer.valueOf(-1);
        }
        return Integer.valueOf(i);
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((d[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Integer)obj;
        if (((Integer) (obj)).intValue() == 200)
        {
            obj = kik.android.util.e.a(kik.android.util.p.j());
            a.a(((Bitmap) (obj)));
            Object obj1 = new ByteArrayOutputStream();
            ((Bitmap) (obj)).compress(android.graphics.ap.CompressFormat.JPEG, 100, ((java.io.OutputStream) (obj1)));
            if (b != null)
            {
                e.a(b, ((ByteArrayOutputStream) (obj1)).toByteArray(), "0");
            } else
            {
                e.a(z.b(g).a().a(), ((ByteArrayOutputStream) (obj1)).toByteArray(), "0");
            }
            try
            {
                ((ByteArrayOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            f.f();
            kik.android.util.p.j().delete();
            return;
        } else
        {
            obj1 = a;
            ((Integer) (obj)).intValue();
            ((d) (obj1)).k_();
            return;
        }
    }

    public xception(String s, k k, n n1, w w1, v v)
    {
        b = null;
        c = false;
        b = s;
        d = k;
        e = n1;
        f = w1;
        g = v;
    }

    public g(String s, k k, n n1, w w1, v v, byte byte0)
    {
        b = null;
        c = false;
        b = s;
        c = true;
        d = k;
        e = n1;
        f = w1;
        g = v;
    }

    public g(k k, n n1, w w1, v v)
    {
        b = null;
        c = false;
        b = null;
        d = k;
        e = n1;
        f = w1;
        g = v;
    }
}
