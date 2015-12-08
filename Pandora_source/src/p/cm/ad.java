// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.radio.data.aa;
import org.json.JSONException;
import p.cw.c;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;

public class ad extends h
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/cm/ad$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("amazonMp3", 0);
            b = new a("amazonSearch", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private final c a;
    private final aa c;
    private final String d;
    private final String e;
    private final String f;

    public ad(c c1, String s, String s1, aa aa)
    {
        a = c1;
        c = aa;
        e = s;
        f = s1;
        d = null;
    }

    public ad(c c1, String s, String s1, String s2)
    {
        a = c1;
        d = s2;
        e = s;
        f = s1;
        c = null;
    }

    public ad a()
    {
        if (c == null)
        {
            return new ad(a, e, f, d);
        } else
        {
            return new ad(a, e, f, c);
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public h b()
    {
        return a();
    }

    public Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        if (c == null)
        {
            a.e().f(e, f, d);
        } else
        {
            a.e().a(e, f, c);
        }
        return null;
    }
}
