// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.a;

import android.os.RemoteException;
import com.qihoo.security.service.a;
import com.qihoo.utils.notice.c;
import com.qihoo360.common.utils.PermissionUtil;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.floatview.a:
//            a

class <init> extends <init>
{

    final com.qihoo.security.floatview.a.a a;

    public void a(int i)
        throws RemoteException
    {
        PermissionUtil.ensureCallerPermissionByUid("fvs");
        if (com.qihoo.security.floatview.a.a.h(a) == i)
        {
            return;
        } else
        {
            com.qihoo.security.floatview.a.a.a(a, i);
            SharedPref.a(com.qihoo.security.floatview.a.a.a(a), "fv_mode", com.qihoo.security.floatview.a.a.h(a));
            return;
        }
    }

    public void a(boolean flag)
        throws RemoteException
    {
        PermissionUtil.ensureCallerPermissionByUid("fvs");
        if (!com.qihoo.utils.notice.c.a(com.qihoo.security.floatview.a.a.a(a))) goto _L2; else goto _L1
_L1:
        com.qihoo.security.floatview.a.a.a(a, false);
_L10:
        if (!com.qihoo.security.floatview.a.a.b(a)) goto _L4; else goto _L3
_L3:
        com.qihoo.security.floatview.a.a.d(a).a(com.qihoo.security.floatview.a.a.c(a));
        com.qihoo.security.floatview.a.a.d(a).a(com.qihoo.security.floatview.a.a.e(a));
_L8:
        if (!com.qihoo.security.floatview.a.a.f(a))
        {
            break; /* Loop/switch isn't completed */
        }
        com.qihoo.security.floatview.a.a.g(a).f();
_L6:
        return;
_L2:
        if (com.qihoo.security.floatview.a.a.b(a) == flag) goto _L6; else goto _L5
_L5:
        com.qihoo.security.floatview.a.a.a(a, flag);
        SharedPref.a(com.qihoo.security.floatview.a.a.a(a), "fv_enabled", com.qihoo.security.floatview.a.a.b(a));
        continue; /* Loop/switch isn't completed */
_L4:
        try
        {
            com.qihoo.security.floatview.a.a.d(a).b(com.qihoo.security.floatview.a.a.c(a));
            com.qihoo.security.floatview.a.a.d(a).b(com.qihoo.security.floatview.a.a.e(a));
        }
        catch (Exception exception) { }
        if (true) goto _L8; else goto _L7
_L7:
        com.qihoo.security.floatview.a.a.g(a).g();
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void a(boolean flag, int i)
        throws RemoteException
    {
    }

    public boolean a()
        throws RemoteException
    {
        PermissionUtil.ensureCallerPermissionByUid("fvs");
        return com.qihoo.security.floatview.a.a.b(a);
    }

    public int b()
        throws RemoteException
    {
        PermissionUtil.ensureCallerPermissionByUid("fvs");
        return com.qihoo.security.floatview.a.a.h(a);
    }

    public void c()
        throws RemoteException
    {
    }

    public void d()
        throws RemoteException
    {
        PermissionUtil.ensureCallerPermissionByUid("fvs");
        a.d();
    }

    dPref(com.qihoo.security.floatview.a.a a1)
    {
        a = a1;
        super();
    }
}
