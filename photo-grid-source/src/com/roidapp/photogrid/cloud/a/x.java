// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.roidapp.photogrid.common.ap;
import com.roidapp.photogrid.common.o;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            w, t

public final class x extends w
{

    private Activity j;
    private String k;

    public x(Activity activity, t t, String s)
    {
        boolean flag1 = true;
        super(activity, 7, t);
        j = activity;
        a = 0x7f0203f0;
        b = 0x7f07014d;
        g = 0x7f07025a;
        h = 0x7f07025b;
        this.i = 0x7f070255;
        int i = activity.getSharedPreferences(activity.getPackageName(), 0).getInt("REGISTER_COUNT", -3);
        boolean flag;
        if (i >= 5 && i >= 5)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            flag1 = false;
        }
        f = flag1;
        k = s;
    }

    public final volatile View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        return super.a(layoutinflater, view, viewgroup);
    }

    public final void onClick(View view)
    {
        if (j == null || view == null) goto _L2; else goto _L1
_L1:
        view.getId();
        JVM INSTR tableswitch 2131558530 2131558532: default 40
    //                   2131558530 41
    //                   2131558531 40
    //                   2131558532 99;
           goto _L2 _L3 _L2 _L4
_L2:
        return;
_L3:
        j.getSharedPreferences(j.getPackageName(), 0).edit().putInt("REGISTER_COUNT", -3).putBoolean("IS_RATE", true).commit();
        (new o(j)).b();
        return;
_L4:
        (new ap()).b(j);
        return;
    }
}
