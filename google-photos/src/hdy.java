// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class hdy
    implements mfh, omb, opp, opr, opv
{

    public mfg a;
    private final mfh b;
    private boolean c;

    public hdy(opd opd1, mfh mfh1)
    {
        opd1.a(this);
        b = mfh1;
    }

    public final void a(int i, Intent intent)
    {
        if (c)
        {
            b.a(i, intent);
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (mfg)olm1.a(mfg);
    }

    public final void al_()
    {
        c = true;
    }

    public final void am_()
    {
        c = false;
    }

    public final void c()
    {
        if (c)
        {
            b.c();
        }
    }
}
