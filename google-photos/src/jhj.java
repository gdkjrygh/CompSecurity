// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class jhj
    implements nuc, omb, opv
{

    public final ntz a = new ntz(this);
    public am b;
    private noz c;
    private Object d;

    public jhj(opd opd1)
    {
        opd1.a(this);
    }

    public final jhj a(olm olm1)
    {
        olm1.a(jhj, this);
        return this;
    }

    public final nud a()
    {
        return a;
    }

    public final void a(am am1)
    {
        b = am1;
        if (am1 == null)
        {
            am1 = null;
        } else
        {
            am1 = am1.R;
        }
        if (d != null ? d.equals(am1) : am1 == null)
        {
            return;
        }
        d = am1;
        if (c.a())
        {
            noy.a("activeView", am1);
        }
        a.b();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = noz.a(context, 2, "ViewPagerManager", new String[0]);
    }
}
