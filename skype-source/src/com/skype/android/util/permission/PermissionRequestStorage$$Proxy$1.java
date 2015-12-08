// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.permission;

import com.skype.android.inject.EventThread;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;

// Referenced classes of package com.skype.android.util.permission:
//            OnRequestPermissionsResult, PermissionRequestStorage

final class a extends ProxyEventListener
{

    final tTarget a;

    public final void onEvent(Object obj)
    {
        obj = (OnRequestPermissionsResult)obj;
        ((PermissionRequestStorage)a.tTarget()).a(((OnRequestPermissionsResult) (obj)));
    }

    I(I i, Proxy proxy, Class class1, EventThread eventthread)
    {
        a = i;
        super(proxy, class1, null, eventthread);
    }
}
