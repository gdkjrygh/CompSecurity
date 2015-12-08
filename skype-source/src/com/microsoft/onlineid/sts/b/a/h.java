// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.l;
import com.microsoft.onlineid.sts.q;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, j, t

public final class h extends a
{

    private q d;

    public h(XmlPullParser xmlpullparser)
    {
        super(xmlpullparser, "http://www.w3.org/2003/05/soap-envelope", "Fault");
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        b("S:Detail");
        j j1 = h();
        j1.b("psf:error");
        Integer integer = null;
        Object obj = null;
        String s = null;
        j j2 = h();
label0:
        do
        {
            if (!j2.e())
            {
                break;
            }
            String s1 = g();
            if (s1.equals("psf:value"))
            {
                integer = Integer.valueOf(t.b(d()));
                continue;
            }
            if (s1.equals("psf:internalerror"))
            {
                j j3 = h();
                Object obj1 = obj;
                String s2 = s;
                do
                {
                    s = s2;
                    obj = obj1;
                    if (!j3.e())
                    {
                        continue label0;
                    }
                    obj = g();
                    if (((String) (obj)).equals("psf:code"))
                    {
                        obj1 = Integer.valueOf(t.b(d()));
                    } else
                    if (((String) (obj)).equals("psf:text"))
                    {
                        s2 = a.nextText();
                    } else
                    {
                        e();
                    }
                } while (true);
            }
            e();
        } while (true);
        j1.b();
        if (integer == null)
        {
            throw new f("psf:value node does not exist.", new Object[0]);
        }
        if (obj == null)
        {
            throw new f("psf:code node does not exist.", new Object[0]);
        } else
        {
            d = new q(new l(integer.intValue(), ((Integer) (obj)).intValue(), s));
            return;
        }
    }

    public final q j()
    {
        i();
        return d;
    }
}
