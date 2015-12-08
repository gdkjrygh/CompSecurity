// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.permission;

import android.app.Activity;
import android.os.Looper;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.skype.android.util.permission:
//            PermissionUtil, Permission, OnRequestPermissionsResult, PermissionHandler, 
//            PermissionRequestStorage

public class PermissionRequest extends PermissionUtil
{

    public static final PermissionHandler b = new PermissionHandler() {

        public final void onEvent(OnRequestPermissionsResult onrequestpermissionsresult)
        {
        }

    };
    private static final EnumSet e = EnumSet.noneOf(com/skype/android/util/permission/Permission);
    public final int a = -1;
    private final AtomicInteger d = new AtomicInteger(0);
    private Activity f;
    private PermissionRequestStorage g;

    public PermissionRequest(Activity activity, PermissionRequestStorage permissionrequeststorage)
    {
        super(activity);
        f = activity;
        g = permissionrequeststorage;
    }

    public final void a(Set set, boolean flag, PermissionHandler permissionhandler)
    {
        if (!Looper.getMainLooper().equals(Looper.myLooper()))
        {
            throw new RuntimeException("Permission request have to be done from UI thread");
        }
        if (a())
        {
            Object obj = EnumSet.noneOf(com/skype/android/util/permission/Permission);
            EnumSet enumset = EnumSet.noneOf(com/skype/android/util/permission/Permission);
            ArrayList arraylist = new ArrayList();
            for (set = set.iterator(); set.hasNext();)
            {
                Permission permission = (Permission)set.next();
                if (b(permission))
                {
                    enumset.add(permission);
                } else
                if (flag || !f.shouldShowRequestPermissionRationale(permission.a()))
                {
                    arraylist.add(permission.a());
                } else
                {
                    ((EnumSet) (obj)).add(permission);
                }
            }

            if (arraylist.isEmpty())
            {
                permissionhandler.onEvent(new OnRequestPermissionsResult(-1, enumset, ((Set) (obj))));
                return;
            } else
            {
                set = new String[arraylist.size()];
                arraylist.toArray(set);
                int i = d.getAndIncrement();
                obj = new OnRequestPermissionsResult(i, enumset, ((Set) (obj)));
                g.a(i, permissionhandler, ((OnRequestPermissionsResult) (obj)));
                f.requestPermissions(set, i);
                return;
            }
        } else
        {
            permissionhandler.onEvent(new OnRequestPermissionsResult(-1, set, e));
            return;
        }
    }

}
