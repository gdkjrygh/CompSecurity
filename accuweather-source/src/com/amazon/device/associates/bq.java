// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;

// Referenced classes of package com.amazon.device.associates:
//            bb, ah, i, bo, 
//            f, bx, OpenSearchPageRequest, SortType, 
//            p

public class bq
{

    public bq()
    {
    }

    public static String a()
    {
        Object obj = (i)((bb)ah.a(com/amazon/device/associates/bb)).j();
        String s;
        if (obj != null && ((i) (obj)).a().containsKey(i.b))
        {
            s = (String)((i) (obj)).a().get(i.b);
        } else
        {
            s = null;
        }
        obj = s;
        if (s == null)
        {
            obj = (String)((bb)ah.a(com/amazon/device/associates/bb)).a().a().get(i.b);
        }
        s = ((String) (obj));
        if (!((String) (obj)).startsWith("http://"))
        {
            s = (new StringBuilder()).append("http://").append(((String) (obj))).toString();
        }
        return s.replace("$SUBTAG", bo.b());
    }

    public static String a(OpenSearchPageRequest opensearchpagerequest)
    {
        Object obj = (i)((bb)ah.a(com/amazon/device/associates/bb)).j();
        if (obj == null)
        {
            obj = ((bb)ah.a(com/amazon/device/associates/bb)).a();
        }
        Object obj1 = (bx)((f)ah.a(com/amazon/device/associates/f)).j();
        Object obj2 = obj1;
        if (obj1 == null)
        {
            obj2 = ((f)ah.a(com/amazon/device/associates/f)).a();
        }
        String s2 = a(opensearchpagerequest.getSearchTerm());
        String s = a(opensearchpagerequest.getBrand());
        String s1 = a(((bx) (obj2)), opensearchpagerequest.getCategory());
        obj1 = "";
        if (opensearchpagerequest.getSortType() != null)
        {
            obj1 = b(((bx) (obj2)), opensearchpagerequest.getSortType().toString());
        }
        opensearchpagerequest = (String)((i) (obj)).a().get(i.d);
        if (opensearchpagerequest == null)
        {
            opensearchpagerequest = a();
        }
        obj2 = s1;
        if (s1 == null)
        {
            obj2 = "";
        }
        if (s == null)
        {
            s = "";
        }
        obj = opensearchpagerequest;
        if (!opensearchpagerequest.startsWith("http://"))
        {
            obj = (new StringBuilder()).append("http://").append(opensearchpagerequest).toString();
        }
        opensearchpagerequest = ((OpenSearchPageRequest) (obj));
        if (((String) (obj)).contains("$SEARCH"))
        {
            opensearchpagerequest = ((String) (obj)).replace("$SEARCH", s2);
        }
        obj = opensearchpagerequest;
        if (opensearchpagerequest.contains("$CATEGORY"))
        {
            obj = opensearchpagerequest.replace("$CATEGORY", ((CharSequence) (obj2)));
        }
        opensearchpagerequest = ((OpenSearchPageRequest) (obj));
        if (((String) (obj)).contains("$BRAND"))
        {
            opensearchpagerequest = ((String) (obj)).replace("$BRAND", s);
        }
        obj = opensearchpagerequest;
        if (opensearchpagerequest.contains("$SORTTYPE"))
        {
            obj = opensearchpagerequest.replace("$SORTTYPE", ((CharSequence) (obj1)));
        }
        return ((String) (obj)).replace("$SUBTAG", bo.b());
    }

    private static String a(bx bx1, String s)
    {
        if (s != null)
        {
            s = (String)bx1.e().get(s);
            if (s != null)
            {
                return s;
            }
        }
        return (String)bx1.e().get("All");
    }

    protected static String a(String s)
    {
        if (s == null || "".equals(s))
        {
            return null;
        }
        try
        {
            s = URLEncoder.encode(s.replace("\n", " ").trim(), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static String a(String s, String s1)
    {
        return Uri.parse(s).getQueryParameter(s1);
    }

    private static String b(bx bx1, String s)
    {
        if (s != null)
        {
            bx1 = (String)bx1.a().get(s);
            if (bx1 != null)
            {
                return bx1;
            }
        }
        return "";
    }

    public static String b(String s)
    {
        String s2 = a(s);
        s = (i)((bb)ah.a(com/amazon/device/associates/bb)).j();
        String s1;
        if (s2 != null)
        {
            if (s != null && s.a().containsKey(i.a))
            {
                s = (String)s.a().get(i.a);
            } else
            {
                s = null;
            }
        } else
        {
            s = a();
        }
        s1 = s;
        if (s == null)
        {
            s1 = (String)((bb)ah.a(com/amazon/device/associates/bb)).a().a().get(i.a);
        }
        s = s1;
        if (!s1.startsWith("http://"))
        {
            s = (new StringBuilder()).append("http://").append(s1).toString();
        }
        s1 = s;
        if (s.contains("$ASIN"))
        {
            s1 = s.replace("$ASIN", s2);
        }
        return s1.replace("$SUBTAG", bo.b());
    }

    public static String c(String s)
    {
        String s2 = a(s);
        s = (i)((bb)ah.a(com/amazon/device/associates/bb)).j();
        String s1;
        if (s2 != null)
        {
            if (s != null && s.a().containsKey(i.e))
            {
                s = (String)s.a().get(i.e);
            } else
            {
                s = null;
            }
        } else
        {
            s = a();
        }
        s1 = s;
        if (s == null)
        {
            s1 = (String)((bb)ah.a(com/amazon/device/associates/bb)).a().a().get(i.e);
        }
        s = s1;
        if (!s1.startsWith("http://"))
        {
            s = (new StringBuilder()).append("http://").append(s1).toString();
        }
        s1 = s;
        if (s.contains("$ASIN"))
        {
            s1 = s.replace("$ASIN", s2);
        }
        return s1.replace("$SUBTAG", bo.b());
    }

    static void d(String s)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        s.addCategory("android.intent.category.BROWSABLE");
        s.setFlags(0x10000000);
        bo.a().startActivity(s);
    }

    public static String e(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = s.indexOf("?");
        String s1;
        boolean flag;
        boolean flag1;
        if (j != -1)
        {
            String s2 = s.substring(j + 1);
            s1 = s.substring(0, j + 1);
            j = 1;
            s = s2;
        } else
        {
            s1 = "";
            j = 0;
        }
        s = s.split("&");
        flag1 = false;
        flag = j;
        j = ((flag1) ? 1 : 0);
        while (j < s.length) 
        {
            boolean flag2 = flag;
            if (!s[j].toLowerCase(Locale.getDefault()).contains("tag="))
            {
                if (s[j].toLowerCase(Locale.getDefault()).contains("linkcode="))
                {
                    flag2 = flag;
                } else
                if (stringbuilder.length() == 0 || flag)
                {
                    stringbuilder.append(s[j]);
                    flag2 = false;
                } else
                {
                    stringbuilder.append("&");
                    stringbuilder.append(s[j]);
                    flag2 = flag;
                }
            }
            j++;
            flag = flag2;
        }
        stringbuilder.insert(0, s1);
        p.a("DirectShoppingHelper", (new StringBuilder()).append("Url after stripping off linkcode and tag params : ").append(stringbuilder.toString()).toString());
        return stringbuilder.toString();
    }
}
