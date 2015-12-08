// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

public class ata
    implements ane
{

    public URL b;
    private final atb c;
    private final URL d;
    private final String e;
    private String f;
    private volatile byte g[];

    public ata(String s)
    {
        this(s, atb.a);
    }

    public ata(String s, atb atb1)
    {
        d = null;
        e = b.f(s);
        c = (atb)b.a(atb1, "Argument must not be null");
    }

    public ata(URL url)
    {
        this(url, atb.a);
    }

    private ata(URL url, atb atb1)
    {
        d = (URL)b.a(url, "Argument must not be null");
        e = null;
        c = (atb)b.a(atb1, "Argument must not be null");
    }

    public String a()
    {
        if (TextUtils.isEmpty(f))
        {
            String s1 = e;
            String s = s1;
            if (TextUtils.isEmpty(s1))
            {
                s = d.toString();
            }
            f = Uri.encode(s, "@#&=*+-_.,:!?()/~'%");
        }
        return f;
    }

    public final void a(MessageDigest messagedigest)
    {
        if (g == null)
        {
            g = c().getBytes(a);
        }
        messagedigest.update(g);
    }

    public final Map b()
    {
        return c.a();
    }

    public final String c()
    {
        if (e != null)
        {
            return e;
        } else
        {
            return d.toString();
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ata)
        {
            obj = (ata)obj;
            flag = flag1;
            if (c().equals(((ata) (obj)).c()))
            {
                flag = flag1;
                if (c.equals(((ata) (obj)).c))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return c().hashCode() * 31 + c.hashCode();
    }

    public String toString()
    {
        return c();
    }
}
