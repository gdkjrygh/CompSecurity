// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class glw
    implements gkj, np, omb, opt, opu, opv
{

    public final am a;
    public gll b;
    public gqb c;
    public boolean d;
    public ehr e;
    private int f;

    public glw(am am1, opd opd1)
    {
        a = am1;
        opd1.a(this);
    }

    public final void V_()
    {
        if (c == null)
        {
            return;
        } else
        {
            b.b(e, this);
            return;
        }
    }

    public final void X_()
    {
        d = true;
        if (c == null)
        {
            return;
        } else
        {
            b.a(e, this);
            b(-1, -1);
            return;
        }
    }

    public final void a(int i, float f1, int j)
    {
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (gll)olm1.a(gll);
    }

    public final gki b(int i, int j)
    {
        c.c();
        Integer integer = b.b(e);
        if (integer != null && integer.intValue() == 0)
        {
            a.O_().onBackPressed();
        }
        return null;
    }

    public final void b(int i)
    {
    }

    public final void c_(int i)
    {
        f = i;
    }

    public final int d()
    {
        return f;
    }
}
