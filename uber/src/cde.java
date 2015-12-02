// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.LinearLayout;

final class cde
    implements bzt
{

    private ccy a;

    cde(ccy ccy1)
    {
        a = ccy1;
        super();
    }

    public final void a(bzw bzw1)
    {
        a.dismissDialog(2);
        if (bzw1.b.equals("invalid_nonce"))
        {
            a.c.h.setEnabled(false);
            ccm.a(a, bux.a(buz.aL), 4);
            return;
        } else
        {
            a.c.h.setEnabled(true);
            ccm.a(a, bux.a(bzw1.b), 1);
            return;
        }
    }

    public final void a(Object obj)
    {
        if (obj instanceof bwf)
        {
            ccy.a(a, (bwf)obj);
            return;
        } else
        {
            ccy.b(a);
            return;
        }
    }
}
