// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;

public final class ksq
{

    private String a;
    private String b[] = {
        ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"
    };
    private k c;

    public ksq(k k1)
    {
        a = "ad.doubleclick.net";
        c = null;
    }

    private Uri a(Uri uri, Context context, String s, boolean flag)
    {
        try
        {
            flag = c(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new ksr("Provided Uri is not in a valid state");
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (uri.toString().contains("dc_ms="))
        {
            throw new ksr("Parameter already exists: dc_ms");
        }
        break MISSING_BLOCK_LABEL_64;
        if (uri.getQueryParameter("ms") != null)
        {
            throw new ksr("Query parameter already exists: ms");
        }
        context = c.p();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        int i;
        s = uri.toString();
        i = s.indexOf(";adurl");
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        return Uri.parse((new StringBuilder(s.substring(0, i + 1))).append("dc_ms").append("=").append(context).append(";").append(s.substring(i + 1)).toString());
        uri = uri.getEncodedPath();
        i = s.indexOf(uri);
        return Uri.parse((new StringBuilder(s.substring(0, uri.length() + i))).append(";").append("dc_ms").append("=").append(context).append(";").append(s.substring(uri.length() + i)).toString());
        int j;
        s = uri.toString();
        j = s.indexOf("&adurl");
        i = j;
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        i = s.indexOf("?adurl");
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        return Uri.parse((new StringBuilder(s.substring(0, i + 1))).append("ms").append("=").append(context).append("&").append(s.substring(i + 1)).toString());
        uri = uri.buildUpon().appendQueryParameter("ms", context).build();
        return uri;
    }

    private boolean c(Uri uri)
    {
        if (uri == null)
        {
            throw new NullPointerException();
        }
        boolean flag;
        try
        {
            flag = uri.getHost().equals(a);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return false;
        }
        return flag;
    }

    public final Uri a(Uri uri, Context context)
    {
        try
        {
            uri = a(uri, context, uri.getQueryParameter("ai"), true);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new ksr("Provided Uri is not in a valid state");
        }
        return uri;
    }

    public final boolean a(Uri uri)
    {
        boolean flag1 = false;
        if (uri == null)
        {
            throw new NullPointerException();
        }
        String as[];
        int i;
        int j;
        boolean flag;
        try
        {
            uri = uri.getHost();
            as = b;
            j = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return false;
        }
        i = 0;
        flag = flag1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flag = uri.endsWith(as[i]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        flag = true;
        return flag;
        for (i++; false;)
        {
        }

        break MISSING_BLOCK_LABEL_31;
    }

    public final boolean b(Uri uri)
    {
        return a(uri) && uri.getPath().endsWith("/aclk");
    }
}
