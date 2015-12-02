// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import android.content.Intent;
import android.support.v4.a.e;
import com.facebook.c.j;
import com.facebook.user.UserIdentifierKey;
import com.google.common.a.fi;
import com.google.common.a.hq;

public class g
{

    private final Context a;
    private final j b;

    public g(Context context, j j1)
    {
        a = context;
        b = j1;
    }

    private void a(Intent intent)
    {
        e.a(a).a(intent);
        b.a(intent, a);
    }

    private void a(String s, String s1)
    {
        a(s, s1, -1L);
    }

    private void a(String s, String s1, long l)
    {
        Intent intent = new Intent();
        intent.setAction(s);
        intent.putExtra("threadid", s1);
        if (l != -1L)
        {
            intent.putExtra("actionid", l);
        }
        a(intent);
    }

    public void a()
    {
        Intent intent = new Intent();
        intent.setAction("com.facebook.orca.ACTION_SMS_ENABLED_CHANGED");
        a(intent);
    }

    public void a(UserIdentifierKey useridentifierkey, String s)
    {
        Intent intent = new Intent();
        intent.setAction("com.facebook.orca.THREAD_UPDATED_CANONICAL_FOR_UI");
        intent.putExtra("user_identifier_key", useridentifierkey);
        if (s != null)
        {
            intent.putExtra("new_threadid", s);
        }
        a(intent);
    }

    public void a(String s)
    {
        a("com.facebook.orca.ACTION_THREAD_UPDATED_FOR_UI", s);
    }

    public void a(String s, long l)
    {
        a("com.facebook.orca.ACTION_THREAD_UPDATED_FOR_UI", s, l);
    }

    public void a(String s, fi fi1)
    {
        Intent intent = new Intent();
        intent.setAction("com.facebook.orca.ACTION_DELETED_MESSAGES_FOR_UI");
        intent.putExtra("threadid", s);
        intent.putStringArrayListExtra("message_ids", hq.a(fi1.h()));
        a(intent);
    }

    public void b(String s)
    {
        a("com.facebook.orca.ACTION_READ_THREAD_FOR_UI", s);
    }

    public void c(String s)
    {
        a("com.facebook.orca.ACTION_REMOVED_THREAD_FOR_UI", s);
    }
}
