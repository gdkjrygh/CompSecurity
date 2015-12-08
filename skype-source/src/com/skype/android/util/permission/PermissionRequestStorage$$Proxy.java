// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.permission;

import com.skype.android.inject.EventThread;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;

// Referenced classes of package com.skype.android.util.permission:
//            OnRequestPermissionsResult, PermissionRequestStorage

public class onEventOnRequestPermissionsResult extends Proxy
{

    private ProxyEventListener onEventOnRequestPermissionsResult;

    public void clearViews()
    {
        super.clearViews();
    }

    public void injectViews()
    {
        super.injectViews();
    }

    public _cls1.a(PermissionRequestStorage permissionrequeststorage)
    {
        super(permissionrequeststorage);
        onEventOnRequestPermissionsResult = new ProxyEventListener(this, com/skype/android/util/permission/OnRequestPermissionsResult, EventThread.MAIN) {

            final PermissionRequestStorage..Proxy a;

            public final void onEvent(Object obj)
            {
                obj = (OnRequestPermissionsResult)obj;
                ((PermissionRequestStorage)a.getTarget()).a(((OnRequestPermissionsResult) (obj)));
            }

            
            {
                a = PermissionRequestStorage..Proxy.this;
                super(proxy1, class1, null, eventthread);
            }
        };
        addListener(onEventOnRequestPermissionsResult);
    }
}
