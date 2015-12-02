// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push;

import com.facebook.auth.a.b;
import com.facebook.common.init.NeedsLowPriorityInitOnUiThread;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;

// Referenced classes of package com.facebook.push:
//            PushInitializer, c

public class a extends c
{

    public a()
    {
    }

    protected void a()
    {
        a(com/facebook/push/PushInitializer).a(new com.facebook.push.c(this, null)).a();
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnUiThread).a(com/facebook/push/PushInitializer);
        c(com/facebook/auth/a/b).a(com/facebook/push/PushInitializer);
    }
}
