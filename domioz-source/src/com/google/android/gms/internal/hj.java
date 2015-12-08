// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;

// Referenced classes of package com.google.android.gms.internal:
//            hw, ed

public final class hj
{

    private String a;
    private String b[];
    private ed c;

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

    private Uri d(Uri uri)
    {
        boolean flag;
        try
        {
            flag = c(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new hw("Provided Uri is not in a valid state");
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (uri.toString().contains("dc_ms="))
        {
            throw new hw("Parameter already exists: dc_ms");
        }
        break MISSING_BLOCK_LABEL_64;
        if (uri.getQueryParameter("ms") != null)
        {
            throw new hw("Query parameter already exists: ms");
        }
        String s = c.a();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        String s1;
        int i;
        s1 = uri.toString();
        i = s1.indexOf(";adurl");
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        return Uri.parse((new StringBuilder(s1.substring(0, i + 1))).append("dc_ms").append("=").append(s).append(";").append(s1.substring(i + 1)).toString());
        uri = uri.getEncodedPath();
        i = s1.indexOf(uri);
        return Uri.parse((new StringBuilder(s1.substring(0, uri.length() + i))).append(";").append("dc_ms").append("=").append(s).append(";").append(s1.substring(uri.length() + i)).toString());
        int j;
        s1 = uri.toString();
        j = s1.indexOf("&adurl");
        i = j;
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        i = s1.indexOf("?adurl");
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        return Uri.parse((new StringBuilder(s1.substring(0, i + 1))).append("ms").append("=").append(s).append("&").append(s1.substring(i + 1)).toString());
        uri = uri.buildUpon().appendQueryParameter("ms", s).build();
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

    public final Uri b(Uri uri)
    {
        try
        {
            uri.getQueryParameter("ai");
            uri = d(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new hw("Provided Uri is not in a valid state");
        }
        return uri;
    }
}
