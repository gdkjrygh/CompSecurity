// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.widget.CompoundButton;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            a

class a
    implements android.widget.oundButton.OnCheckedChangeListener
{

    final a a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (com.qihoo.security.ui.antivirus.a.a(a) != flag)
        {
            SharedPref.a(SecurityApplication.a(), "setting_auto_start", flag);
            com.qihoo.security.ui.antivirus.a.a(a, flag);
        }
    }

    Pref(a a1)
    {
        a = a1;
        super();
    }
}
