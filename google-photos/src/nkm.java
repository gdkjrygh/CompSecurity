// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class nkm
{

    private static final Pattern a = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");
    private static int b;

    private static Uri a(int i, int j, Uri uri, String s)
    {
        Object obj;
        Object obj1;
        obj = Uri.EMPTY.buildUpon();
        ((android.net.Uri.Builder) (obj)).authority(uri.getAuthority());
        ((android.net.Uri.Builder) (obj)).scheme(uri.getScheme());
        ((android.net.Uri.Builder) (obj)).path(uri.getPath());
        if (i != -1 && j != -1)
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("resize_w", Integer.toString(i));
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("resize_h", Integer.toString(j));
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("no_expand", "1");
        }
        obj1 = ((android.net.Uri.Builder) (obj)).build();
        if (uri.isOpaque())
        {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        obj = uri.getEncodedQuery();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = Collections.emptySet();
_L8:
        Object obj2;
        obj2 = ((Set) (obj)).iterator();
        obj = obj1;
_L4:
        android.net.Uri.Builder builder;
        int k;
        int l;
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (String)((Iterator) (obj2)).next();
        if (((Uri) (obj)).getQueryParameter(((String) (obj1))) != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i1;
        int j1;
        if ("resize_w".equals(obj1) || "resize_h".equals(obj1) || "no_expand".equals(obj1))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (i == -1 || j == -1)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        builder = ((Uri) (obj)).buildUpon();
        if (!"url".equals(obj1))
        {
            continue; /* Loop/switch isn't completed */
        }
        builder.appendQueryParameter("url", uri.getQueryParameter("url"));
_L6:
        obj = builder.build();
        if (true) goto _L4; else goto _L3
_L2:
        obj2 = new LinkedHashSet();
        l = 0;
        do
        {
label0:
            {
                i1 = ((String) (obj)).indexOf('&', l);
                k = i1;
                if (i1 == -1)
                {
                    k = ((String) (obj)).length();
                }
                j1 = ((String) (obj)).indexOf('=', l);
                if (j1 <= k)
                {
                    i1 = j1;
                    if (j1 != -1)
                    {
                        break label0;
                    }
                }
                i1 = k;
            }
            ((Set) (obj2)).add(Uri.decode(((String) (obj)).substring(l, i1)));
            k++;
            l = k;
        } while (k < ((String) (obj)).length());
        obj = Collections.unmodifiableSet(((Set) (obj2)));
        continue; /* Loop/switch isn't completed */
        if (l != 0 && k != 0) goto _L4; else goto _L5
_L5:
        obj = uri.getQueryParameters(((String) (obj1))).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            builder.appendQueryParameter(((String) (obj1)), (String)((Iterator) (obj)).next());
        }
          goto _L6
_L3:
        uri = ((Uri) (obj));
        if (s != null)
        {
            uri = ((Uri) (obj));
            if (((Uri) (obj)).getQueryParameter("url") == null)
            {
                uri = ((Uri) (obj)).buildUpon();
                uri.appendQueryParameter("url", s);
                uri = uri.build();
            }
        }
        s = uri;
        if (uri.getQueryParameter("container") == null)
        {
            uri = uri.buildUpon();
            uri.appendQueryParameter("container", "esmobile");
            s = uri.build();
        }
        uri = s;
        if (s.getQueryParameter("gadget") == null)
        {
            uri = s.buildUpon();
            uri.appendQueryParameter("gadget", "a");
            uri = uri.build();
        }
        s = uri;
        if (uri.getQueryParameter("rewriteMime") == null)
        {
            uri = uri.buildUpon();
            uri.appendQueryParameter("rewriteMime", "image/*");
            s = uri.build();
        }
        return s;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static String a()
    {
        String s = String.valueOf("https://images");
        int i = b();
        String s1 = String.valueOf("-esmobile-opensocial.googleusercontent.com/gadgets/proxy");
        return (new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf(s1).length())).append(s).append(i).append(s1).toString();
    }

    static String a(int i, int j, String s)
    {
        if (s == null)
        {
            return s;
        }
        String s1;
        String s2;
        if (!a(s))
        {
            s2 = a();
            s1 = s;
        } else
        {
            s1 = null;
            s2 = s;
        }
        return a(i, j, Uri.parse(s2), s1).toString();
    }

    static String a(int i, String s)
    {
        if (s == null)
        {
            return s;
        }
        String s1;
        String s2;
        if (!a(s))
        {
            s2 = a();
            s1 = s;
        } else
        {
            s1 = null;
            s2 = s;
        }
        return a(i, i, Uri.parse(s2), s1).toString();
    }

    private static boolean a(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            return a.matcher(s).find();
        }
    }

    private static int b()
    {
        nkm;
        JVM INSTR monitorenter ;
        int i;
        i = b + 1;
        b = i;
        b %= 3;
        nkm;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

}
