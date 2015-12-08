// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.permission;

import android.util.SparseArray;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.EventSubscriberBinder;

// Referenced classes of package com.skype.android.util.permission:
//            OnRequestPermissionsResult, PermissionHandler

public class PermissionRequestStorage
{

    private SparseArray a;
    private SparseArray b;
    private EventSubscriberBinder c;

    PermissionRequestStorage()
    {
        a = new SparseArray();
        b = new SparseArray();
        c = new EventSubscriberBinder(EventBusInstance.a(), this);
        c.bind();
    }

    final void a(int i, PermissionHandler permissionhandler, OnRequestPermissionsResult onrequestpermissionsresult)
    {
        a.put(i, permissionhandler);
        b.put(i, onrequestpermissionsresult);
    }

    protected final void a(OnRequestPermissionsResult onrequestpermissionsresult)
    {
        int i = onrequestpermissionsresult.b();
        OnRequestPermissionsResult onrequestpermissionsresult1 = (OnRequestPermissionsResult)b.get(i);
        PermissionHandler permissionhandler = (PermissionHandler)a.get(i);
        if (onrequestpermissionsresult != null && permissionhandler != null)
        {
            a.remove(i);
            b.remove(i);
            onrequestpermissionsresult.a(onrequestpermissionsresult1);
            permissionhandler.onEvent(onrequestpermissionsresult);
        }
    }
}
