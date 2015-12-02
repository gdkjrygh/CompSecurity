// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.content.DialogInterface;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            VirusListActivity

class a
    implements android.content.celListener
{

    final VirusListActivity a;

    public void onCancel(DialogInterface dialoginterface)
    {
        SharedPref.a(a.p, "setting_auto_start", false);
    }

    (VirusListActivity viruslistactivity)
    {
        a = viruslistactivity;
        super();
    }
}
