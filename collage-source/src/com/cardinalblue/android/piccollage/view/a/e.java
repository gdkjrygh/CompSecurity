// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.a;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.view.fragments.ah;
import com.cardinalblue.android.piccollage.view.fragments.ak;
import com.cardinalblue.android.piccollage.view.fragments.v;
import com.cardinalblue.android.piccollage.view.fragments.x;

public class e
{

    public e()
    {
    }

    public static float a(int i)
    {
        float f;
        float f1;
        f1 = 0.0F;
        f = f1;
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   10000: 69
    //                   2131755743: 69
    //                   2131755744: 71
    //                   2131755745: 69
    //                   2131755747: 69;
           goto _L1 _L2 _L2 _L3 _L2 _L2
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        f = k.a().getResources().getDimensionPixelSize(0x7f0b012f);
_L5:
        return f;
_L3:
        f = f1;
        if (!PicAuth.h().b())
        {
            return (float)k.a().getResources().getDimensionPixelSize(0x7f0b012f);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static Fragment a(int i, Bundle bundle)
    {
        Bundle bundle1;
        Bundle bundle2;
        Object obj;
        bundle2 = null;
        obj = null;
        bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        i;
        JVM INSTR lookupswitch 6: default 80
    //                   10000: 105
    //                   2131755742: 184
    //                   2131755743: 195
    //                   2131755744: 206
    //                   2131755745: 237
    //                   2131755749: 103;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        bundle = obj;
_L9:
        bundle2 = bundle;
        if (bundle != null)
        {
            bundle1.putInt("key_fragment_position", i);
            bundle.setArguments(bundle1);
            bundle2 = bundle;
        }
_L7:
        return bundle2;
_L2:
        if (a())
        {
            b.O(String.valueOf(PicAuth.h().i().getCollagesCount()));
            k.j().edit().putBoolean("__is_first_time_click_profile", true).commit();
        }
        com.cardinalblue.android.piccollage.activities.b b1 = new com.cardinalblue.android.piccollage.activities.b();
        bundle = b1;
        if (!bundle1.containsKey("user"))
        {
            bundle1.putParcelable("user", PicAuth.h().i());
            bundle = b1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        bundle = new v();
        continue; /* Loop/switch isn't completed */
_L4:
        bundle = new a();
        continue; /* Loop/switch isn't completed */
_L5:
        if (PicAuth.h().b())
        {
            bundle = new ak();
        } else
        {
            bundle = new x();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        bundle = new ah();
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static boolean a()
    {
        return k.j().getBoolean("__is_first_time_click_profile", false);
    }
}
