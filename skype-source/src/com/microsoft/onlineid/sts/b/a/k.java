// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.s;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, t, x

public final class k extends a
{

    private int d;
    private int e;
    private String f;
    private String g;
    private String h;
    private String i;
    private s j;
    private final Set k = new HashSet();

    public k(XmlPullParser xmlpullparser)
    {
        super(xmlpullparser, null, "pp");
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        while (c()) 
        {
            Object obj = g();
            if (((String) (obj)).equals("psf:authstate"))
            {
                d = t.b(d());
            } else
            if (((String) (obj)).equals("psf:reqstatus"))
            {
                e = t.b(d());
            } else
            if (((String) (obj)).equals("psf:inlineauthurl"))
            {
                f = d();
            } else
            if (((String) (obj)).equals("psf:signChallenge"))
            {
                g = d();
            } else
            if (((String) (obj)).equals("psf:configVersion"))
            {
                i = d();
            } else
            if (((String) (obj)).equals("psf:PUID"))
            {
                h = d();
            } else
            if (((String) (obj)).equals("psf:flights"))
            {
                obj = d().split(",");
                int j1 = obj.length;
                int i1 = 0;
                while (i1 < j1) 
                {
                    String s = obj[i1];
                    k.add(Integer.valueOf(t.b(s)));
                    i1++;
                }
            } else
            if (((String) (obj)).equals("psf:credProperties"))
            {
                x x1 = new x(a);
                x1.a();
                j = x1.j();
            } else
            {
                e();
            }
        }
    }

    public final int j()
    {
        i();
        return d;
    }

    public final int k()
    {
        i();
        return e;
    }

    public final String l()
    {
        i();
        return f;
    }

    public final String m()
    {
        i();
        return i;
    }

    public final String n()
    {
        i();
        return h;
    }

    public final s o()
    {
        i();
        return j;
    }

    public final Set p()
    {
        i();
        return k;
    }
}
