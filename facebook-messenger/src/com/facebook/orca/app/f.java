// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.orca.app:
//            LoginReminderManager

class f
    implements b
{

    private LoginReminderManager a;

    f()
    {
    }

    public void a(Context context, Intent intent, c c)
    {
        a = (LoginReminderManager)t.a(context).a(com/facebook/orca/app/LoginReminderManager);
        com.facebook.orca.app.LoginReminderManager.b(a);
    }
}
