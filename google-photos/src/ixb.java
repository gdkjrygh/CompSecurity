// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

final class ixb
    implements fpm
{

    private PackageManager a;

    ixb(ixa ixa, PackageManager packagemanager)
    {
        a = packagemanager;
        super();
    }

    public final boolean a(ResolveInfo resolveinfo)
    {
        return a.checkPermission("android.permission.WRITE_MEDIA_STORAGE", resolveinfo.activityInfo.packageName) == 0;
    }
}
