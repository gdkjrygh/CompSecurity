// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

public final class igc
    implements atm
{

    final PackageManager a;
    final noz b;

    igc(Context context)
    {
        a = context.getPackageManager();
        b = noz.a(context, 2, "ResolveInfoLoader", new String[] {
            "perf"
        });
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        obj = (ResolveInfo)obj;
        return new atn(new azw(obj), new ige(this, ((ResolveInfo) (obj))));
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
