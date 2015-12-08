// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.app.PendingIntent;
import android.os.Handler;
import com.microsoft.onlineid.a.b;
import com.microsoft.onlineid.internal.ApiRequestResultReceiver;
import com.microsoft.onlineid.internal.c;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.sts.a;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            AccountPickerActivity

private class a extends ApiRequestResultReceiver
{

    final AccountPickerActivity a;

    protected final void a()
    {
        if (AccountPickerActivity.d(a).a(com.microsoft.onlineid.internal.ui.AccountPickerActivity.c(a)).isEmpty())
        {
            a.finish();
        }
    }

    protected final void a(PendingIntent pendingintent)
    {
        try
        {
            a.startIntentSenderForResult(pendingintent.getIntentSender(), 0, null, 0, 0, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            com.microsoft.onlineid.internal.ui.AccountPickerActivity.a(a, pendingintent);
        }
    }

    protected final void a(c c1)
    {
        com.microsoft.onlineid.a.a.a().a("SDK", "Add account", "via account picker");
        c1 = AccountPickerActivity.d(a).b(c1.b());
        if (c1 == null)
        {
            com.microsoft.onlineid.internal.ui.AccountPickerActivity.a(a, new com.microsoft.onlineid.b.b("Picker could not find newly added account."));
            return;
        } else
        {
            com.microsoft.onlineid.internal.ui.AccountPickerActivity.a(a, c1);
            return;
        }
    }

    protected final void a(Exception exception)
    {
        boolean flag;
        if (exception != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e.a(flag);
        com.microsoft.onlineid.internal.ui.AccountPickerActivity.a(a, exception);
    }

    public (AccountPickerActivity accountpickeractivity, Handler handler)
    {
        a = accountpickeractivity;
        super(handler);
    }
}
