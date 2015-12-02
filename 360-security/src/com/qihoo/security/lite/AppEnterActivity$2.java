// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.lite;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.qihoo.security.ui.main.HomeActivity;

// Referenced classes of package com.qihoo.security.lite:
//            AppEnterActivity

class a extends Handler
{

    final AppEnterActivity a;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            AppEnterActivity.b(a);
            return;

        case 1: // '\001'
            AppEnterActivity.c(a);
            return;

        case 2: // '\002'
            AppEnterActivity.e(a).setClass(AppEnterActivity.d(a), com/qihoo/security/ui/main/HomeActivity);
            break;
        }
        a.startActivity(AppEnterActivity.e(a));
        a.finish();
    }

    (AppEnterActivity appenteractivity)
    {
        a = appenteractivity;
        super();
    }
}
