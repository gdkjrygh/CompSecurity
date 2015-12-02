// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.base.j;
import com.facebook.common.w.q;
import com.facebook.i.a.a.f;
import com.facebook.messages.ipc.peer.d;
import com.facebook.messages.model.threads.Message;
import com.google.common.d.a.ab;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import javax.inject.a;

// Referenced classes of package com.facebook.b.a:
//            c, e, d

public class b
{

    private final Context a;
    private final a b;
    private final f c;
    private final com.facebook.i.a.a.a d = new c(this);
    private j e;
    private q f;

    public b(Context context, a a1, f f1, j j1)
    {
        f = q.UNSET;
        a = context;
        b = a1;
        c = f1;
        e = j1;
        c.a(d.k, d);
        c.a(Uri.withAppendedPath(d.e, "disconnected"), d);
        c.a(d.f, d);
    }

    static q a(b b1, q q1)
    {
        b1.f = q1;
        return q1;
    }

    private void a(Intent intent)
    {
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_LOGGED_IN_USER_ID", (String)b.b());
        a.sendOrderedBroadcast(intent, e.getPermission());
    }

    private s b(Intent intent)
    {
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_LOGGED_IN_USER_ID", (String)b.b());
        ab ab1 = ab.a();
        e e1 = new e(this, ab1);
        a.sendOrderedBroadcast(intent, e.getPermission(), e1, null, 0, null, null);
        return ab1;
    }

    public s a(String s, String s1)
    {
        Intent intent = new Intent("com.facebook.orca.chatheads.ACTION_OPEN_CHAT_HEAD");
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_THREAD_ID", s);
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_REASON", s1);
        return b(intent);
    }

    public void a()
    {
        a(new Intent("com.facebook.orca.chatheads.ACTION_CLEAR_ALL_UNREAD_THREADS"));
    }

    public void a(Message message)
    {
        Intent intent = new Intent("com.facebook.orca.chatheads.ACTION_NEW_MESSAGE_NOTIFICATION");
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_MESSAGE_NOTIFIED", message);
        a(intent);
    }

    public void a(String s)
    {
        Intent intent = new Intent("com.facebook.orca.chatheads.ACTION_POPUP_CHAT_HEAD");
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_THREAD_ID", s);
        a(intent);
    }

    public void b()
    {
        a(new Intent("com.facebook.orca.chatheads.ACTION_SHOW_CHATHEADS"));
    }

    public void b(String s, String s1)
    {
        Intent intent = new Intent("com.facebook.orca.chatheads.ACTION_REMOVE_CHAT_HEAD");
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_THREAD_ID", s);
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_REASON", s1);
        b(intent);
    }

    public void c()
    {
        a(new Intent("com.facebook.orca.chatheads.ACTION_HIDE_CHATHEADS"));
    }

    public void c(String s, String s1)
    {
        Intent intent = new Intent("com.facebook.orca.chatheads.ACTION_CLEAR_UNREAD_THREAD");
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_THREAD_ID", s);
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_REASON", s1);
        a(intent);
    }

    public s d()
    {
        ab ab1 = ab.a();
        if (f.isSet())
        {
            ab1.a_(Boolean.valueOf(f.asBoolean()));
            return ab1;
        } else
        {
            i.a(b(new Intent("com.facebook.orca.chatheads.ACTION_QUERY_CHATHEADS_ENABLED")), new com.facebook.b.a.d(this, ab1));
            return ab1;
        }
    }
}
