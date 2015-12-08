// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

// Referenced classes of package net.hockeyapp.android:
//            LoginActivity

final class a extends Handler
{

    private LoginActivity a;

    public final void handleMessage(Message message)
    {
        if (message.getData().getBoolean("success"))
        {
            a.finish();
            return;
        } else
        {
            Toast.makeText(a, "Login failed. Check your credentials.", 2000).show();
            return;
        }
    }

    (LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }
}
