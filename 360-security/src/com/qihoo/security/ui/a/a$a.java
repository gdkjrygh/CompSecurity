// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.a;

import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import java.text.Collator;
import java.util.Comparator;

// Referenced classes of package com.qihoo.security.ui.a:
//            a

private static class a
    implements Comparator
{

    private final PackageManager a;
    private final Collator b = Collator.getInstance();

    public final int a(PermissionInfo permissioninfo, PermissionInfo permissioninfo1)
    {
        permissioninfo = permissioninfo.loadLabel(a);
        permissioninfo1 = permissioninfo1.loadLabel(a);
        return b.compare(permissioninfo, permissioninfo1);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((PermissionInfo)obj, (PermissionInfo)obj1);
    }

    nager(PackageManager packagemanager)
    {
        a = packagemanager;
    }
}
