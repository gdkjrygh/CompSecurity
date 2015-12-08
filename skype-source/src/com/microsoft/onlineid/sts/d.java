// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.b.c;
import com.microsoft.onlineid.internal.a.b;
import com.microsoft.onlineid.internal.transport.TransportFactory;
import com.microsoft.onlineid.sts.a.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts:
//            n

public final class d
{

    private final Context a;
    private n b;
    private com.microsoft.onlineid.internal.e.f c;

    public d(Context context)
    {
        a = context;
    }

    private static long a(String s, String s1)
    {
        int i = 0;
        int j;
        int k;
        if (TextUtils.isEmpty(s))
        {
            s = new String[0];
        } else
        {
            s = s.split("\\.");
        }
        if (TextUtils.isEmpty(s1))
        {
            s1 = new String[0];
        } else
        {
            s1 = s1.split("\\.");
        }
        j = 0;
        do
        {
            if (j >= s.length)
            {
                k = i;
                if (j >= s1.length)
                {
                    break;
                }
            }
            i = 0;
            k = 0;
            if (j < s.length)
            {
                i = Integer.parseInt(s[j]);
            }
            if (j < s1.length)
            {
                k = Integer.parseInt(s1[j]);
            }
            i -= k;
            k = i;
            if (i != 0)
            {
                break;
            }
            j++;
        } while (true);
        return (long)k;
    }

    private boolean a(b b1)
    {
        com.microsoft.onlineid.internal.transport.b b2;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        com.microsoft.onlineid.internal.c.d.a((new StringBuilder("Downloading new PPCRL config file (")).append(b1).append(").").toString());
        b2 = (new TransportFactory(a)).createTransport();
        int i;
        b2.b(b1.b());
        i = b2.b();
        if (i != 200) goto _L2; else goto _L1
_L1:
        flag1 = a(b2.a(), b1);
        flag = flag1;
_L5:
        b2.e();
_L3:
        if (flag)
        {
            com.microsoft.onlineid.internal.c.d.a((new StringBuilder("Successfully updated ppcrlconfig to version: ")).append(a()).toString());
            e().i();
            return flag;
        } else
        {
            com.microsoft.onlineid.internal.c.d.c("Failed to update ppcrlconfig (parseConfig() returned false).");
            return flag;
        }
_L2:
        com.microsoft.onlineid.internal.c.d.c((new StringBuilder("Failed to update ppcrlconfig due to HTTP response code ")).append(i).toString());
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        b1;
        com.microsoft.onlineid.internal.c.d.c("Failed to update ppcrlconfig.", b1);
        com.microsoft.onlineid.a.a.a().a(b1);
        b2.e();
          goto _L3
        b1;
        com.microsoft.onlineid.internal.c.d.c("Failed to update ppcrlconfig.", b1);
        com.microsoft.onlineid.a.a.a().a(b1);
        b2.e();
          goto _L3
        b1;
        com.microsoft.onlineid.internal.c.d.c("Failed to update ppcrlconfig.", b1);
        com.microsoft.onlineid.a.a.a().a(b1);
        b2.e();
          goto _L3
        b1;
        com.microsoft.onlineid.internal.c.d.c("Failed to update ppcrlconfig.", b1);
        com.microsoft.onlineid.a.a.a().a(b1);
        b2.e();
          goto _L3
        b1;
        b2.e();
        throw b1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean a(InputStream inputstream, b b1)
        throws IOException, XmlPullParserException, f
    {
        boolean flag;
        XmlPullParser xmlpullparser = Xml.newPullParser();
        xmlpullparser.setInput(inputstream, null);
        int i = d().a(n.d);
        n.a a1 = d().a();
        a1.c();
        a1.b(com.microsoft.onlineid.sts.n.c, b1.a());
        a1.a(com.microsoft.onlineid.sts.n.b.a, b1.b());
        a1.b(n.d, Integer.valueOf(i).intValue());
        (new com.microsoft.onlineid.sts.b.a.b(xmlpullparser, a1)).a();
        flag = a1.a();
        inputstream.close();
        return flag;
        b1;
        inputstream.close();
        throw b1;
    }

    private n d()
    {
        if (b == null)
        {
            b = new n(a);
        }
        return b;
    }

    private com.microsoft.onlineid.internal.e.f e()
    {
        if (c == null)
        {
            c = new com.microsoft.onlineid.internal.e.f(a);
        }
        return c;
    }

    public final String a()
    {
        return d().b(com.microsoft.onlineid.sts.n.b);
    }

    public final boolean a(long l)
    {
        return (System.currentTimeMillis() - l) / 1000L < (long)d().a(com.microsoft.onlineid.sts.n.c.f);
    }

    public final boolean a(String s)
    {
        boolean flag = false;
        long l;
        try
        {
            l = a(s, a());
        }
        catch (NumberFormatException numberformatexception)
        {
            com.microsoft.onlineid.internal.c.d.b((new StringBuilder("Invalid client version: ")).append(s).toString(), numberformatexception);
            return false;
        }
        if (l < 0L)
        {
            flag = true;
        }
        return flag;
    }

    public final boolean b()
    {
        return a(d().b());
    }

    public final boolean b(String s)
    {
        if (!a(e().j()))
        {
            String s1 = a();
            com.microsoft.onlineid.internal.c.d.a(String.format(Locale.US, "Checking for PPCRL config update from version \"%s\" to version \"%s\"", new Object[] {
                s1, s
            }));
            long l;
            try
            {
                l = a(s, s1);
            }
            catch (NumberFormatException numberformatexception)
            {
                com.microsoft.onlineid.internal.c.d.b((new StringBuilder("Invalid server configuration requested: ")).append(s).toString(), numberformatexception);
                return false;
            }
            if (l > 0L)
            {
                return a(d().b());
            }
        }
        return true;
    }

    public final boolean c()
    {
        if (a(a(), "1") == 0L)
        {
            return b();
        } else
        {
            return true;
        }
    }
}
