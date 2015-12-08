// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;

final class ige
    implements ann
{

    private final ResolveInfo a;
    private igc b;

    public ige(igc igc1, ResolveInfo resolveinfo)
    {
        b = igc1;
        super();
        a = resolveinfo;
    }

    public final void a()
    {
    }

    public final void a(amb amb, ano ano1)
    {
        long l = noy.a();
        amb = a.loadLabel(b.a);
        android.graphics.drawable.Drawable drawable;
        if (amb == null)
        {
            amb = null;
        } else
        {
            amb = amb.toString();
        }
        if (b.b.a())
        {
            noy.a("packageName", a.activityInfo.applicationInfo.packageName);
            noy.b("loadTime", noy.a() - l);
        }
        l = noy.a();
        if (a.icon == 0 && a.activityInfo.icon == 0)
        {
            drawable = a.activityInfo.applicationInfo.loadIcon(b.a);
        } else
        {
            drawable = a.loadIcon(b.a);
        }
        if (b.b.a())
        {
            noy.a("packageName", a.activityInfo.applicationInfo.packageName);
            noy.b("loadTime", noy.a() - l);
        }
        ano1.a(new ifz(amb, drawable));
    }

    public final void b()
    {
    }

    public final amz c()
    {
        return amz.a;
    }

    public final Class d()
    {
        return ifz;
    }
}
