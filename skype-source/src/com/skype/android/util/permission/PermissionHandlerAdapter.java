// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.permission;

import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.util.permission:
//            PermissionHandler, OnRequestPermissionsResult

public class PermissionHandlerAdapter
    implements PermissionHandler
{

    private static final Logger log = Logger.getLogger("Permission");

    public PermissionHandlerAdapter()
    {
    }

    public void onDenied(Set set)
    {
        log.warning("Action disabled, onDenied not implemented");
    }

    public final void onEvent(OnRequestPermissionsResult onrequestpermissionsresult)
    {
        if (onrequestpermissionsresult.a().isEmpty())
        {
            onGranted();
            return;
        } else
        {
            onDenied(onrequestpermissionsresult.a());
            return;
        }
    }

    public void onGranted()
    {
    }

}
