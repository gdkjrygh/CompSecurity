// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.base.a.g;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.inject.t;
import com.facebook.orca.chatheads.annotations.IsChatHeadsEnabled;
import com.google.common.base.Objects;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.chatheads:
//            cz, da

class db
    implements b
{

    private a a;
    private a b;
    private cz c;

    private db()
    {
    }

    db(da da)
    {
        this();
    }

    private void a(Context context)
    {
        if (a == null || b == null)
        {
            g.a(context);
            context = t.a(context);
            a = context.b(java/lang/Boolean, com/facebook/orca/chatheads/annotations/IsChatHeadsEnabled);
            b = context.b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId);
            c = (cz)context.a(com/facebook/orca/chatheads/cz);
        }
    }

    private void a(c c1)
    {
        if (((Boolean)a.b()).booleanValue())
        {
            c1.setResultCode(-1);
            c1.abortBroadcast();
        }
    }

    private void b(Context context, Intent intent, c c1)
    {
        c1.setResultCode(-1);
        c1.abortBroadcast();
        intent = new Intent(intent);
        intent.setClass(context, c.a());
        context.startService(intent);
    }

    public void a(Context context, Intent intent, c c1)
    {
        a(context);
        if (Objects.equal(intent.getStringExtra("com.facebook.orca.chatheads.EXTRA_LOGGED_IN_USER_ID"), b.b()) && b.b() != null)
        {
            String s = intent.getAction();
            if ("com.facebook.orca.chatheads.ACTION_QUERY_CHATHEADS_ENABLED".equals(s))
            {
                a(c1);
                return;
            }
            if ((((Boolean)a.b()).booleanValue() || !"com.facebook.orca.chatheads.ACTION_OPEN_CHAT_HEAD".equals(s) && !"com.facebook.orca.chatheads.ACTION_POPUP_CHAT_HEAD".equals(s)) && ((Boolean)a.b()).booleanValue())
            {
                b(context, intent, c1);
                return;
            }
        }
    }
}
