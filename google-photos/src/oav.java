// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public class oav
    implements ooi, opv
{

    private rz a;
    private oad b;

    private oav(rz rz1, oad oad1, opd opd1)
    {
        a = rz1;
        b = null;
        opd1.a(this);
    }

    public oav(rz rz1, opd opd1)
    {
        this(rz1, null, opd1);
    }

    public Bundle a(Intent intent)
    {
        return null;
    }

    public oad a()
    {
        return b;
    }

    public final void b_(Bundle bundle)
    {
        if (bundle == null)
        {
            bundle = a();
            if (bundle == null)
            {
                throw new IllegalStateException("A PreferenceFragment must be provided!");
            }
            Bundle bundle1 = a(a.getIntent());
            if (bundle1 != null)
            {
                bundle.f(bundle1);
            }
            a.c().a().a(cn.P, bundle).b();
        }
    }
}
