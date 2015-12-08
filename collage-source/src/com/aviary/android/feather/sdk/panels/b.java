// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aviary.android.feather.common.utils.f;
import com.aviary.android.feather.library.a.a;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.library.services.LocalDataService;
import com.aviary.android.feather.library.services.PreferenceService;
import com.aviary.android.feather.sdk.widget.i;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            c

abstract class b extends c
    implements c.g
{

    protected ViewGroup d;

    public b(IAviaryController iaviarycontroller, a a1)
    {
        super(iaviarycontroller, a1);
    }

    public final ViewGroup a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        d = b(layoutinflater, viewgroup);
        return d;
    }

    public void a(boolean flag)
    {
        f().setEnabled(flag);
        super.a(flag);
    }

    protected transient void a(i ai[])
    {
        int j = 0;
        if (!((LocalDataService)B().a(com/aviary/android/feather/library/services/LocalDataService)).a("tools-vibration-disabled")) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        PreferenceService preferenceservice;
        for (int k = ai.length; j < k; j++)
        {
            ai[j].setVibrationEnabled(flag);
        }

        return;
_L2:
        if (B() != null && B().a() != null)
        {
            preferenceservice = (PreferenceService)B().a(com/aviary/android/feather/library/services/PreferenceService);
            if (preferenceservice != null && com.aviary.android.feather.common.utils.f.c(B().a()))
            {
                flag = preferenceservice.a("feather_app_vibration", true);
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup);

    public View c(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return a(layoutinflater, viewgroup);
    }

    protected void c()
    {
        d = null;
        super.c();
    }

    public final ViewGroup f()
    {
        return d;
    }
}
