// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.Intent;

// Referenced classes of package com.adobe.mobile:
//            Analytics, ReferrerHandler

static final class val.intent
    implements Runnable
{

    final Intent val$intent;

    public void run()
    {
        ReferrerHandler.processIntent(val$intent);
    }

    er(Intent intent1)
    {
        val$intent = intent1;
        super();
    }
}
