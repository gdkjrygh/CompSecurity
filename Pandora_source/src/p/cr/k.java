// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.content.j;
import com.pandora.android.provider.b;
import com.pandora.android.util.p;
import java.util.List;

// Referenced classes of package p.cr:
//            d, c, f, i, 
//            h, b, l, e, 
//            g, j, m, a, 
//            n, o

public class k
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        private static final a o[];
        private c n;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/cr/k$a, s);
        }

        public static a[] values()
        {
            return (a[])o.clone();
        }

        public p.cp.b.c a(Uri uri)
        {
            return n.a(uri);
        }

        static 
        {
            a = new a("createStation", 0, new p.cr.c());
            b = new a("openGenrePicker", 1, new f());
            c = new a("offerUpgrade", 2, new i());
            d = new a("landing", 3, new h());
            e = new a("backstage", 4, new p.cr.b());
            f = new a("showPrivacySettings", 5, new l());
            g = new a("feed", 6, new e());
            h = new a("inbox", 7, new g());
            i = new a("one", 8, new p.cr.j());
            j = new a("profile", 9, new m());
            k = new a("account", 10, new p.cr.a());
            l = new a("station", 11, new n());
            m = new a("stations", 12, new o());
            o = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m
            });
        }

        private a(String s, int i1, c c1)
        {
            super(s, i1);
            n = c1;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(p/cr/k$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("pandorav2", 0);
            b = new b("pandorav3", 1);
            c = new b("pandorav4", 2);
            d = new b("pandorav5", 3);
            e = (new b[] {
                a, b, c, d
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface c
    {

        public abstract p.cp.b.c a(Uri uri);
    }


    public static Uri a(b b1, p p1, String as[])
    {
        String s = "";
        if (as != null)
        {
            s = a(as);
        }
        return Uri.parse(String.format("%s:///%s%s", new Object[] {
            b1.name(), p1.name().toLowerCase(), s
        }));
    }

    private static String a(String as[])
    {
        return String.format((new String(new char[as.length])).replace("\0", "/%s"), (String[])as);
    }

    public static boolean a(Uri uri)
    {
        uri = b(uri);
        if (uri != null)
        {
            if (uri.a())
            {
                com.pandora.android.provider.b.a.C().a(uri.c());
                return true;
            }
            if (uri.b())
            {
                uri.d().execute(new Object[0]);
                return true;
            }
        }
        return false;
    }

    public static p.cp.b.c b(Uri uri)
    {
        if (!c(uri))
        {
            return null;
        }
        String s = uri.toString();
        if (s.indexOf("://") == b.a.name().length())
        {
            uri = Uri.parse(s.replaceFirst("://", ":/"));
        }
        if (uri.getPathSegments().size() == 0)
        {
            return (new d()).a(uri);
        }
        try
        {
            uri = a.valueOf((String)uri.getPathSegments().get(0)).a(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return null;
        }
        return uri;
    }

    public static boolean c(Uri uri)
    {
        try
        {
            b.valueOf(uri.getScheme());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return false;
        }
        return true;
    }
}
