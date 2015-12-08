// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.home.ui.b;

// Referenced classes of package com.fitbit.settings.ui:
//            GoalsActivity

class  extends b
{

    final GoalsActivity a;

    public void a(Exception exception)
    {
        g();
        GoalsActivity.a(a).setVisibility(0);
        com.fitbit.settings.ui.GoalsActivity.b(a).setVisibility(8);
        if ((exception instanceof ServerCommunicationException) && ((ServerCommunicationException)exception).f() == com.fitbit.data.bl.exceptions.ionException.ServerErrorType.a)
        {
            Toast.makeText(a, exception.getMessage(), 1).show();
            return;
        } else
        {
            Toast.makeText(a, 0x7f08018e, 1).show();
            return;
        }
    }

    (GoalsActivity goalsactivity, FragmentActivity fragmentactivity, com.fitbit.home.ui.vity vity)
    {
        a = goalsactivity;
        super(fragmentactivity, vity);
    }
}
