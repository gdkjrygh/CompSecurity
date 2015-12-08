// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.friends.ui:
//            MessagesActivity_, MessagesFragment

public class MessagesActivity extends FitbitActivity
{

    protected String a;

    public MessagesActivity()
    {
        a = null;
    }

    public static void a(Context context)
    {
        context.startActivity(new Intent(context, com/fitbit/friends/ui/MessagesActivity_));
    }

    public static void a(Context context, int i)
    {
        Intent intent = new Intent(context, com/fitbit/friends/ui/MessagesActivity_);
        intent.setFlags(i);
        context.startActivity(intent);
    }

    public static void a(Context context, String s)
    {
        MessagesActivity_.c(context).a(s).b();
    }

    public static Intent b(Context context)
    {
        return MessagesActivity_.c(context).a(0x4000000).a();
    }

    public static Intent b(Context context, int i)
    {
        return MessagesActivity_.c(context).a(0x4000000 | i).a();
    }

    public void c()
    {
        ((MessagesFragment)getSupportFragmentManager().findFragmentById(0x7f110174)).a(a);
    }
}
