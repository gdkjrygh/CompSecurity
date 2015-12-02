// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Intent;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.threads.m;
import com.facebook.user.RecipientInfo;
import com.facebook.user.UserIdentifier;
import com.facebook.user.s;
import com.google.common.base.Preconditions;

public class dm
{

    public dm()
    {
    }

    public static ThreadViewSpec a(Intent intent)
    {
        if (intent.hasExtra("thread_id"))
        {
            boolean flag;
            if (!intent.hasExtra("thread_view_spec"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            return ThreadViewSpec.a(intent.getStringExtra("thread_id"));
        }
        if (intent.hasExtra("thread_view_spec"))
        {
            return (ThreadViewSpec)intent.getParcelableExtra("thread_view_spec");
        } else
        {
            return ThreadViewSpec.a;
        }
    }

    public static ThreadViewSpec a(Message message)
    {
        Preconditions.checkNotNull(message);
        if (message.G() != null)
        {
            return ThreadViewSpec.a(message.G());
        } else
        {
            return ThreadViewSpec.b(message.e());
        }
    }

    public static boolean a(ThreadViewSpec threadviewspec)
    {
        if (threadviewspec.a())
        {
            return m.g(threadviewspec.d());
        }
        if (threadviewspec.b())
        {
            return threadviewspec.e().a().e().equals(s.PHONE);
        } else
        {
            return false;
        }
    }
}
