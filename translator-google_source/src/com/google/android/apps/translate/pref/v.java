// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.app.Activity;
import android.preference.Preference;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.u;

// Referenced classes of package com.google.android.apps.translate.pref:
//            a, z, GoogleAccountPref, b

public abstract class v
{

    public final boolean a;
    public final int b;

    public v(int i, Activity activity)
    {
        i;
        JVM INSTR tableswitch 1 6: default 44
    //                   1 66
    //                   2 99
    //                   3 132
    //                   4 132
    //                   5 164
    //                   6 176;
           goto _L1 _L2 _L3 _L4 _L4 _L5 _L6
_L1:
        boolean flag;
        a(u.settings_headers_legacy);
        b = r.menu_settings;
        flag = false;
_L8:
        a = flag;
        return;
_L2:
        a(u.settings_copydrop);
        new a(a("key_copydrop_enable"));
        b = r.label_copydrop;
        flag = false;
        continue; /* Loop/switch isn't completed */
_L3:
        a(u.settings_speech);
        new z(a("dialects_root"));
        b = r.label_speech_input;
        flag = false;
        continue; /* Loop/switch isn't completed */
_L4:
        a(u.settings_data);
        ((GoogleAccountPref)a("key_google_login")).a = activity;
        b = r.label_data_usage;
        flag = false;
        continue; /* Loop/switch isn't completed */
_L5:
        flag = true;
        b = r.label_about_translate;
        continue; /* Loop/switch isn't completed */
_L6:
        a(u.settings_developer_options);
        new b(a("tws_root"), a("speech_root"));
        b = r.label_developer_options;
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    abstract Preference a(String s);

    abstract void a(int i);
}
