// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.os.Handler;
import android.os.RemoteException;
import com.qihoo.security.service.a;

// Referenced classes of package com.qihoo.security.ui.settings:
//            LocaleSettingActivity

class a extends com.qihoo.security.locale.ty._cls3
{

    final LocaleSettingActivity a;

    public void a()
        throws RemoteException
    {
        try
        {
            if (LocaleSettingActivity.c(a) != null)
            {
                LocaleSettingActivity.c(a).b();
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void a(String s)
        throws RemoteException
    {
    }

    public void a(boolean flag, boolean flag1, String s, String s1, String s2)
        throws RemoteException
    {
    }

    public void b()
        throws RemoteException
    {
        if (LocaleSettingActivity.b(a) != null)
        {
            LocaleSettingActivity.b(a).sendEmptyMessage(3);
        }
    }

    public void c()
        throws RemoteException
    {
        if (LocaleSettingActivity.b(a) != null)
        {
            LocaleSettingActivity.b(a).sendEmptyMessage(3);
        }
    }

    public void d()
        throws RemoteException
    {
        if (LocaleSettingActivity.b(a) != null)
        {
            LocaleSettingActivity.b(a).sendEmptyMessage(3);
        }
    }

    (LocaleSettingActivity localesettingactivity)
    {
        a = localesettingactivity;
        super();
    }
}
