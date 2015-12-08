// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

// Referenced classes of package com.google.android.gms.internal:
//            it, la, iv

public final class kz
{

    private String a;
    private String b;
    private String c[] = {
        ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"
    };
    private iv d;
    private final it e = new it();

    public kz(iv iv1)
    {
        a = "googleads.g.doubleclick.net";
        b = "/pagead/ads";
        d = iv1;
    }

    private Uri a(Uri uri, Context context, String s)
    {
        try
        {
            if (uri.getQueryParameter("ms") != null)
            {
                throw new la("Query parameter already exists: ms");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new la("Provided Uri is not in a valid state");
        }
        int j;
        context = d.a(context, s);
        s = uri.toString();
        j = s.indexOf("&adurl");
        int i;
        i = j;
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        i = s.indexOf("?adurl");
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        return Uri.parse((new StringBuilder(s.substring(0, i + 1))).append("ms").append("=").append(context).append("&").append(s.substring(i + 1)).toString());
        uri = uri.buildUpon().appendQueryParameter("ms", context).build();
        return uri;
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
            throw new la("Provided Uri is not in a valid state");
        }
        return uri;
    }

    public final iv a()
    {
        return d;
    }

    public final void a(MotionEvent motionevent)
    {
        d.a(motionevent);
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
            as = c;
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
}
