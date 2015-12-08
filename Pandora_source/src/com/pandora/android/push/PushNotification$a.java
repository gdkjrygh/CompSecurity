// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.push;

import android.net.Uri;
import android.text.Html;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android.push:
//            PushNotification

public static class a
{

    private final String a;
    private String b;
    private CharSequence c;
    private CharSequence d;
    private CharSequence e;
    private CharSequence f;
    private CharSequence g;
    private Uri h;
    private Uri i;
    private b j;

    public a a(Uri uri)
    {
        h = uri;
        return this;
    }

    public h a(h h1)
    {
        j = h1;
        return this;
    }

    public j a(String s1)
    {
        b = s1;
        return this;
    }

    public PushNotification a()
    {
        return new PushNotification(a, b, c, d, e, f, g, h, i, j);
    }

    public j b(Uri uri)
    {
        i = uri;
        return this;
    }

    public i b(String s1)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = Html.fromHtml(s1);
        }
        c = s1;
        return this;
    }

    public c c(String s1)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = Html.fromHtml(s1);
        }
        d = s1;
        return this;
    }

    public d d(String s1)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = Html.fromHtml(s1);
        }
        e = s1;
        return this;
    }

    public e e(String s1)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = Html.fromHtml(s1);
        }
        f = s1;
        return this;
    }

    public f f(String s1)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = Html.fromHtml(s1);
        }
        g = s1;
        return this;
    }

    public g g(String s1)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = Uri.parse(s1);
        }
        return a(s1);
    }

    public a h(String s1)
    {
        if (s.a(s1))
        {
            s1 = null;
        } else
        {
            s1 = Uri.parse(s1);
        }
        return b(s1);
    }

    public (String s1)
    {
        j = d;
        a = s1;
    }
}
