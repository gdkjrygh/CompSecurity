// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.dialog.b;
import com.qihoo.security.widget.CheckBoxPreference;
import com.qihoo360.mobilesafe.share.SharedPref;

public class a extends b
{

    private final Context b;
    private final CheckBoxPreference c;
    private boolean d;

    public a(Context context)
    {
        super(context);
        b = context;
        context = View.inflate(b, 0x7f030075, null);
        c = (CheckBoxPreference)context.findViewById(0x7f0b018b);
        d = SharedPref.b(SecurityApplication.a(), "setting_auto_start", true);
        c.a(d);
        c.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final a a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (a.a(a) != flag)
                {
                    SharedPref.a(SecurityApplication.a(), "setting_auto_start", flag);
                    a.a(a, flag);
                }
            }

            
            {
                a = a.this;
                super();
            }
        });
        a(context);
    }

    static boolean a(a a1)
    {
        return a1.d;
    }

    static boolean a(a a1, boolean flag)
    {
        a1.d = flag;
        return flag;
    }
}
