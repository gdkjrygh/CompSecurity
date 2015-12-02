// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.push.mqtt.cj;
import com.facebook.user.RecipientInfo;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserIdentifierKey;

public abstract class cb extends q
{

    private ThreadViewSpec a;
    private boolean b;

    public cb(Context context)
    {
        super(context, e());
        a = ThreadViewSpec.a;
    }

    private boolean a(UserIdentifierKey useridentifierkey)
    {
        return a.b() && a.e().a().c().equals(useridentifierkey);
    }

    private boolean b(String s)
    {
        return a.a() && a.d().equals(s);
    }

    private static IntentFilter e()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.orca.ACTION_THREAD_UPDATED_FOR_UI");
        intentfilter.addAction("com.facebook.orca.ACTION_REMOVED_THREAD_FOR_UI");
        intentfilter.addAction("com.facebook.orca.THREAD_UPDATED_CANONICAL_FOR_UI");
        intentfilter.addAction("com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
        return intentfilter;
    }

    public abstract void a(long l);

    public void a(Context context, Intent intent)
    {
        context = intent.getAction();
        if (!"com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        a(cj.fromValue(intent.getIntExtra("event", cj.UNKNOWN.toValue())));
_L4:
        return;
_L2:
        if (!b)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!"com.facebook.orca.ACTION_THREAD_UPDATED_FOR_UI".equals(context))
        {
            break; /* Loop/switch isn't completed */
        }
        if (b(intent.getStringExtra("threadid")))
        {
            a(intent.getLongExtra("actionid", -1L));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!"com.facebook.orca.ACTION_REMOVED_THREAD_FOR_UI".equals(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!b(intent.getStringExtra("threadid"))) goto _L4; else goto _L5
_L5:
        d();
        return;
        if (!"com.facebook.orca.THREAD_UPDATED_CANONICAL_FOR_UI".equals(context) || !a((UserIdentifierKey)intent.getParcelableExtra("user_identifier_key"))) goto _L4; else goto _L6
_L6:
        context = null;
        if (intent.hasExtra("new_threadid"))
        {
            context = intent.getStringExtra("new_threadid");
        }
        a(((String) (context)));
        return;
    }

    public void a(ThreadViewSpec threadviewspec)
    {
        a = threadviewspec;
    }

    public abstract void a(cj cj1);

    public abstract void a(String s);

    public void a(boolean flag)
    {
        b = flag;
    }

    public abstract void d();
}
