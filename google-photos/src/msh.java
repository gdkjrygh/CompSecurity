// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class msh
    implements omb, omz, opv
{

    public boolean a;
    private msd b;

    public msh(opd opd1)
    {
        opd1.a(this);
    }

    public msh(opd opd1, byte byte0)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (msd)olm1.a(msd);
        ((omx)olm1.a(omx)).a(this);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            msd msd1 = b;
            if (msd1.b)
            {
                mry.a(msd1.a, -1);
                msd1.b = false;
            }
        } else
        if (a)
        {
            b.b = true;
            return;
        }
    }
}
