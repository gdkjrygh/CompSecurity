// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;

public final class htn
    implements ds
{

    private static final int b;
    private static final oqe c = new oqe("debug.photos.rlo", null);
    public hto a;
    private final noz d;
    private int e;

    public htn(Context context, int i)
    {
        e = i;
        d = noz.a(context, "ReportLocationRequest", new String[0]);
    }

    private void j()
    {
        String s = c.a;
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            a = hto.valueOf(s.toUpperCase(Locale.US));
            return;
        }
    }

    public final void a(hpr hpr)
    {
        if (d.a())
        {
            noy.a("rpcError", hpr);
        }
        j();
    }

    public final void a(qlw qlw)
    {
        qlw = (qrn)qlw;
        a = hto.a;
        if (qlw != null)
        {
            qlw = ((qrn) (qlw)).b;
            if (qlw != null && ((qkx) (qlw)).a != null)
            {
                if (((qkx) (qlw)).a.booleanValue())
                {
                    qlw = hto.c;
                } else
                {
                    qlw = hto.b;
                }
                a = qlw;
            }
        }
        j();
    }

    public final qlr f()
    {
        return qrn.a;
    }

    public final int g()
    {
        return b;
    }

    public final qlr g_()
    {
        return qrm.a;
    }

    public final String k_()
    {
        return "ReportLocationRequest";
    }

    public final qlw l_()
    {
        qrm qrm1 = new qrm();
        qrm1.b = new qkw();
        qrm1.b.a = e;
        return qrm1;
    }

    static 
    {
        b = qmb.b(qrn.a.b);
    }
}
