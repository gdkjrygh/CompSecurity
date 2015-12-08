// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public final class hlm extends mtf
{

    private final int a;
    private final List b;
    private final String c;
    private final String j;

    public hlm(int i, String s, String s1, List list)
    {
        boolean flag1 = true;
        super("remotemedia.tasks.AddMediaToEnvelope");
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        p.a(s, "media key must be non-empty");
        if (list != null && !list.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag);
        a = i;
        b = list;
        c = s;
        j = s1;
    }

    protected final mue a(Context context)
    {
        noz noz1 = noz.a(context, "AddMediaToEnvelopeTask", new String[0]);
        hkm hkm1 = new hkm(context, a, c, j, b);
        ((hpz)olm.a(context, hpz)).a(a, hkm1);
        if (!hkm1.a)
        {
            if (noz1.a())
            {
                noy.a("tag", "remotemedia.tasks.AddMediaToEnvelope");
            }
            return new mue(false);
        } else
        {
            ((est)olm.a(context, est)).d(a, c);
            return new mue(hkm1.a);
        }
    }
}
