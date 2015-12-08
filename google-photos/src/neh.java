// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

public final class neh
{

    private static final Uri a;
    private static final Uri b;
    private static final nej c;
    private static final nej d;
    private static final nek e[];
    private static final nek f[];
    private static final nek g[];

    public static String a(String s, int i, long l)
    {
        return (new StringBuilder(String.valueOf(s).length() + 34)).append("~").append(s).append("~").append(i).append("~").append(l).toString();
    }

    public static Set a(Context context)
    {
        b.v();
        HashSet hashset = new HashSet();
        nek anek[] = g;
        int j = anek.length;
        for (int i = 0; i < j; i++)
        {
            hashset.addAll(anek[i].a(context));
        }

        return hashset;
    }

    public static nek a(int i)
    {
        return g[i];
    }

    public static nek a(Uri uri)
    {
        long l = ContentUris.parseId(uri);
        nek anek[] = g;
        int j = anek.length;
        for (int i = 0; i < j; i++)
        {
            nek nek1 = anek[i];
            if (uri.equals(ContentUris.withAppendedId(nek1.b, l)))
            {
                return nek1;
            }
        }

        return null;
    }

    public static nek[] a()
    {
        return g;
    }

    static nej b()
    {
        return d;
    }

    public static nek[] b(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if ((i & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i & 1) != 0)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (flag && i != 0)
        {
            return new nek[0];
        }
        if (flag)
        {
            return f;
        }
        if (i != 0)
        {
            return e;
        } else
        {
            return g;
        }
    }

    static 
    {
        boolean flag = false;
        a = android.provider.MediaStore.Images.Media.getContentUri("phoneStorage");
        b = android.provider.MediaStore.Video.Media.getContentUri("phoneStorage");
        c = new nei();
        d = new nel();
        e = (new nek[] {
            new nek(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, c), new nek(a, c)
        });
        f = (new nek[] {
            new nek(android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, d), new nek(b, d)
        });
        g = new nek[e.length + f.length];
        nek anek[] = e;
        int l = anek.length;
        int j = 0;
        int i;
        for (i = 0; j < l; i++)
        {
            nek nek1 = anek[j];
            g[i] = nek1;
            nek1.a = i;
            j++;
        }

        anek = f;
        l = anek.length;
        for (int k = ((flag) ? 1 : 0); k < l;)
        {
            nek nek2 = anek[k];
            g[i] = nek2;
            nek2.a = i;
            k++;
            i++;
        }

    }
}
