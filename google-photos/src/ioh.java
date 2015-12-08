// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;

public final class ioh
    implements opl, ops, opv
{

    private final am a;
    private final ioi b;
    private int c;
    private int d;

    public ioh(am am1, opd opd1, ioi ioi1)
    {
        a = am1;
        b = ioi1;
        opd1.a(this);
    }

    public final void a(Bundle bundle)
    {
        c = a.g().getConfiguration().orientation;
        if (bundle != null)
        {
            d = bundle.getInt("orientation_change_count");
            if (c != bundle.getInt("orientation"))
            {
                d = d + 1;
                b.b(d);
            }
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putInt("orientation", c);
        bundle.putInt("orientation_change_count", d);
    }
}
