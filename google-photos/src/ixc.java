// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

final class ixc
    implements fpm
{

    private ixa a;

    ixc(ixa ixa1)
    {
        a = ixa1;
        super();
    }

    public final boolean a(ResolveInfo resolveinfo)
    {
        return !resolveinfo.activityInfo.packageName.equals(ixa.a(a).getPackageName());
    }
}
