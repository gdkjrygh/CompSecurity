// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

// Referenced classes of package com.google.android.gms.internal:
//            ae, w

public final class ad
{

    private static final String e[] = {
        "/aclk", "/pcs/click"
    };
    private String a;
    private String b;
    private String c;
    private String d[] = {
        ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"
    };
    private w f;

    public ad(w w1)
    {
        a = "googleads.g.doubleclick.net";
        b = "/pagead/ads";
        c = "ad.doubleclick.net";
        f = w1;
    }

    private Uri a(Uri uri, Context context, String s)
    {
        boolean flag;
        try
        {
            flag = c(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new ae("Provided Uri is not in a valid state");
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (uri.toString().contains("dc_ms="))
        {
            throw new ae("Parameter already exists: dc_ms");
        }
        break MISSING_BLOCK_LABEL_64;
        if (uri.getQueryParameter("ms") != null)
        {
            throw new ae("Query parameter already exists: ms");
        }
        context = f.a(context, s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        int i;
        s = uri.toString();
        i = s.indexOf(";adurl");
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_153;
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
            break MISSING_BLOCK_LABEL_260;
        }
        i = s.indexOf("?adurl");
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_319;
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
            flag = uri.getHost().equals(c);
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
            uri = a(uri, context, uri.getQueryParameter("ai"));
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new ae("Provided Uri is not in a valid state");
        }
        return uri;
    }

    public final w a()
    {
        return f;
    }

    public final void a(MotionEvent motionevent)
    {
        f.a(motionevent);
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
            as = d;
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
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (!a(uri)) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        int j;
        as = e;
        j = as.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        String s = as[i];
        if (!uri.getPath().endsWith(s)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

}
