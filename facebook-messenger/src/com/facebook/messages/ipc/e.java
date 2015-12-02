// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc;

import android.content.Context;
import android.content.Intent;
import com.facebook.base.j;
import com.facebook.c.l;
import javax.inject.a;

// Referenced classes of package com.facebook.messages.ipc:
//            FrozenNewMessageNotification

public class e
{

    private final Context a;
    private final a b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public e(Context context, a a1, j j1, l l1)
    {
        a = context;
        b = a1;
        c = j1.getPermission();
        d = l1.a("messages.ACTION_NEW_MESSAGE");
        e = l1.a("messages.ACTION_CLEAR_ALL_MESSAGES");
        f = l1.a("messages.ACTION_CLEAR_MESSAGE");
    }

    public void a(FrozenNewMessageNotification frozennewmessagenotification, String s)
    {
        Intent intent = new Intent(d);
        intent.putExtra("message", frozennewmessagenotification);
        intent.putExtra("userId", s);
        a.sendBroadcast(intent, c);
    }

    public void a(String s)
    {
        Intent intent = new Intent(e);
        intent.putExtra("userId", s);
        a.sendBroadcast(intent, c);
    }

    public void a(String s, String s1)
    {
        Intent intent = new Intent(f);
        intent.putExtra("threadId", s);
        intent.putExtra("userId", s1);
        a.sendBroadcast(intent, c);
    }
}
