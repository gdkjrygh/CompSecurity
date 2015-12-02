// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.content.Context;
import android.content.Intent;
import com.facebook.base.a.g;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.push.c2dm:
//            C2DMRegistrar, FacebookPushServerRegistrar

class w
    implements b
{

    w()
    {
    }

    public void a(Context context, Intent intent, c c)
    {
        g.a(context);
        context = t.a(context);
        intent = (C2DMRegistrar)context.a(com/facebook/push/c2dm/C2DMRegistrar);
        ((FacebookPushServerRegistrar)context.a(com/facebook/push/c2dm/FacebookPushServerRegistrar)).a(((C2DMRegistrar) (intent)).a);
    }
}
