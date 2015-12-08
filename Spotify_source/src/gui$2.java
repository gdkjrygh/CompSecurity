// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.concurrent.TimeUnit;

final class ang.Object
    implements hcw
{

    private boolean a;
    private hcj b;
    private gtv c;
    private hci d;

    public final hcx T_()
    {
        return b.T_();
    }

    public final long a(hch hch1, long l)
    {
        try
        {
            l = b.a(hch1, l);
        }
        // Misplaced declaration of an exception variable
        catch (hch hch1)
        {
            if (!a)
            {
                a = true;
                c.a();
            }
            throw hch1;
        }
        if (l == -1L)
        {
            if (!a)
            {
                a = true;
                d.close();
            }
            return -1L;
        } else
        {
            hch1.a(d.b(), hch1.b - l, l);
            d.t();
            return l;
        }
    }

    public final void close()
    {
        if (!a && !gsp.a(this, TimeUnit.MILLISECONDS))
        {
            a = true;
            c.a();
        }
        b.close();
    }

    (hcj hcj1, gtv gtv1, hci hci1)
    {
        b = hcj1;
        c = gtv1;
        d = hci1;
        super();
    }
}
