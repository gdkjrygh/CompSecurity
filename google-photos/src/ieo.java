// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

final class ieo
    implements ier
{

    private final String a;
    private ien b;

    ieo(ien ien)
    {
        b = ien;
        super();
        a = ((ei) (b)).f.getPackageName();
    }

    public final boolean a(ifc ifc1)
    {
        if (!ifc1.b())
        {
            return false;
        } else
        {
            return ifc1.c.getComponent().getPackageName().equals(a);
        }
    }
}
