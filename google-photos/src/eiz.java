// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.UriMatcher;
import android.net.Uri;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public final class eiz
{

    static final Random a = new Random();
    final int b;
    final euv c;
    public final Uri d;
    final ejm e;

    public eiz(int i, euv euv1, Uri uri, ejm ejm1)
    {
        if (!"mediaKey".equals(uri.getScheme()) && !"content".equals(uri.getScheme()) && !"file".equals(uri.getScheme()))
        {
            euv1 = String.valueOf(uri.getScheme());
            if (euv1.length() != 0)
            {
                euv1 = "Unsupported scheme: ".concat(euv1);
            } else
            {
                euv1 = new String("Unsupported scheme: ");
            }
            throw new IllegalArgumentException(euv1);
        }
        p.b(euv1, "avType must not be null");
        boolean flag;
        if (!b.c(uri))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "uri must not be empty");
        p.b(ejm1, "contentSize must be non null");
        b = i;
        c = euv1;
        d = uri;
        e = ejm1;
    }

    public static UriMatcher a(String s)
    {
        UriMatcher urimatcher = new UriMatcher(-1);
        urimatcher.addURI(s, "*/#/*/*/*", 0);
        return urimatcher;
    }

    public static eiz a(Uri uri)
    {
        uri = uri.getPathSegments();
        return new eiz(Integer.parseInt((String)uri.get(0)), euv.a(Integer.parseInt((String)uri.get(1))), Uri.parse(Uri.decode((String)uri.get(2))), ejm.valueOf(Uri.decode((String)uri.get(3))));
    }

    public final String a()
    {
        if ("mediaKey".equals(d.getScheme()))
        {
            return (String)d.getPathSegments().get(0);
        } else
        {
            return null;
        }
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof eiz)
        {
            obj = (eiz)obj;
            flag = flag1;
            if (b == ((eiz) (obj)).b)
            {
                flag = flag1;
                if (c == ((eiz) (obj)).c)
                {
                    flag = flag1;
                    if (d.equals(((eiz) (obj)).d))
                    {
                        flag = flag1;
                        if (e.equals(((eiz) (obj)).e))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return b + (c.f + (e.hashCode() + d.hashCode() * 31) * 31) * 31;
    }

    public final String toString()
    {
        return String.format(Locale.US, "MediaContentIdentifier {accountId: %d, avType: %s, uri: %s, contentSize: %s}", new Object[] {
            Integer.valueOf(b), c, d, e
        });
    }

}
