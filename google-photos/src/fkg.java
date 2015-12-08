// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Collections;
import java.util.Set;

final class fkg
    implements fjw
{

    fkg()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = ((fjz)obj).a;
        hpm hpm1 = new hpm();
        hpm1.b = ((Uri) (obj)).toString();
        return new hpg(hpm1.a());
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return hpg;
    }
}
