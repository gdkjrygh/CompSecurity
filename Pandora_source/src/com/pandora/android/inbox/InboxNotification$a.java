// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.net.Uri;
import android.text.Html;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android.inbox:
//            InboxNotification

public static class a
{

    private final long a;
    private CharSequence b;
    private CharSequence c;
    private Uri d;
    private Uri e;
    private Uri f;
    private CharSequence g;
    private Integer h;
    private boolean i;
    private Boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private long n;
    private long o;
    private Long p;

    public a a(long l1)
    {
        n = l1;
        return this;
    }

    public n a(Uri uri)
    {
        d = uri;
        return this;
    }

    public d a(Integer integer)
    {
        h = integer;
        return this;
    }

    public h a(Long long1)
    {
        p = long1;
        return this;
    }

    public p a(String s1)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = Html.fromHtml(s1);
        }
        b = s1;
        return this;
    }

    public b a(boolean flag)
    {
        i = flag;
        return this;
    }

    public InboxNotification a()
    {
        long l2 = a;
        CharSequence charsequence = b;
        CharSequence charsequence1 = c;
        Uri uri = d;
        Uri uri1 = e;
        Uri uri2 = f;
        CharSequence charsequence2 = g;
        Integer integer = h;
        boolean flag = i;
        Boolean boolean1 = j;
        boolean flag1 = k;
        boolean flag2 = l;
        boolean flag3 = m;
        long l3 = n;
        long l4 = o;
        long l1;
        if (p == null)
        {
            l1 = n;
        } else
        {
            l1 = p.longValue();
        }
        return new InboxNotification(l2, charsequence, charsequence1, uri, uri1, uri2, charsequence2, integer, flag, boolean1, flag1, flag2, flag3, l3, l4, Long.valueOf(l1));
    }

    public nit> b(long l1)
    {
        o = l1;
        return this;
    }

    public o b(Uri uri)
    {
        e = uri;
        return this;
    }

    public e b(String s1)
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

    public c b(boolean flag)
    {
        j = Boolean.valueOf(flag);
        return this;
    }

    public j c(Uri uri)
    {
        f = uri;
        return this;
    }

    public f c(String s1)
    {
        if (s.a(s1))
        {
            s1 = null;
        } else
        {
            s1 = Uri.parse(s1);
        }
        return a(s1);
    }

    public a c(boolean flag)
    {
        k = flag;
        return this;
    }

    public k d(String s1)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = Uri.parse(s1);
        }
        return b(s1);
    }

    public b d(boolean flag)
    {
        l = flag;
        return this;
    }

    public l e(String s1)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = Uri.parse(s1);
        }
        return c(s1);
    }

    public c e(boolean flag)
    {
        m = flag;
        return this;
    }

    public m f(String s1)
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

    public (long l1)
    {
        a = l1;
    }
}
