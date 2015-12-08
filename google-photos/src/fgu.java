// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.EnumSet;

public final class fgu
    implements hzv, opl, ops, opv
{

    public boolean a;
    public boolean b;

    public fgu(opd opd1)
    {
        opd1.a(this);
    }

    public final EnumSet a()
    {
        if (b)
        {
            return EnumSet.of(hzz.i, hzz.g);
        }
        if (a)
        {
            return EnumSet.of(hzz.g);
        } else
        {
            return EnumSet.of(hzz.i);
        }
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            a = bundle.getBoolean("is_envelope_owner");
            b = bundle.getBoolean("is_envelope_collaborative");
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("is_envelope_owner", a);
        bundle.putBoolean("is_envelope_collaborative", b);
    }
}
