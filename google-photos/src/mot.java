// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class mot
    implements omb, omz, opl, opv
{

    private final am a;
    private final moy b;
    private mou c;
    private boolean d;
    private boolean e;
    private boolean f;

    public mot(am am1, opd opd1, moy moy)
    {
        e = true;
        a = am1;
        b = moy;
        opd1.a(this);
    }

    public final void a()
    {
        if (c != null)
        {
            c.a();
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mou)olm1.b(mou);
        ((omx)olm1.a(omx)).a(this);
    }

    public final void a(Bundle bundle)
    {
        boolean flag1 = true;
        bundle = a.q;
        boolean flag = flag1;
        if (bundle != null)
        {
            if (bundle.getBoolean("ActionBarFragmentMixin.Enabled", true))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        e = flag;
    }

    public final void a(boolean flag)
    {
label0:
        {
            d = flag;
            if (d && e)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag != f)
            {
                f = flag;
                if (c != null)
                {
                    if (!flag)
                    {
                        break label0;
                    }
                    c.a(b);
                }
            }
            return;
        }
        c.b(b);
    }
}
