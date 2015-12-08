// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

// Referenced classes of package com.google.android.gms.internal:
//            c, i, d

public class h
{

    private final c dA = new c();
    private String dw;
    private String dx;
    private String dy[] = {
        ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"
    };
    private d dz;

    public h(d d1)
    {
        dw = "googleads.g.doubleclick.net";
        dx = "/pagead/ads";
        dz = d1;
    }

    private Uri a(Uri uri, Context context, String s, boolean flag)
        throws i
    {
        try
        {
            if (uri.getQueryParameter("ms") != null)
            {
                throw new i("Query parameter already exists: ms");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new i("Provided Uri is not in a valid state");
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        context = dz.a(context, s);
_L4:
        return a(uri, "ms", ((String) (context)));
_L2:
        context = dz.a(context);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Uri a(Uri uri, String s, String s1)
        throws UnsupportedOperationException
    {
        String s2 = uri.toString();
        int k = s2.indexOf("&adurl");
        int j = k;
        if (k == -1)
        {
            j = s2.indexOf("?adurl");
        }
        if (j != -1)
        {
            return Uri.parse((new StringBuilder(s2.substring(0, j + 1))).append(s).append("=").append(s1).append("&").append(s2.substring(j + 1)).toString());
        } else
        {
            return uri.buildUpon().appendQueryParameter(s, s1).build();
        }
    }

    public Uri a(Uri uri, Context context)
        throws i
    {
        try
        {
            uri = a(uri, context, uri.getQueryParameter("ai"), true);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new i("Provided Uri is not in a valid state");
        }
        return uri;
    }

    public void a(MotionEvent motionevent)
    {
        dz.a(motionevent);
    }

    public boolean a(Uri uri)
    {
        boolean flag1 = false;
        if (uri == null)
        {
            throw new NullPointerException();
        }
        String as[];
        int j;
        int k;
        boolean flag;
        try
        {
            uri = uri.getHost();
            as = dy;
            k = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return false;
        }
        j = 0;
        flag = flag1;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flag = uri.endsWith(as[j]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        flag = true;
        return flag;
        for (j++; false;)
        {
        }

        break MISSING_BLOCK_LABEL_31;
    }

    public d g()
    {
        return dz;
    }
}
