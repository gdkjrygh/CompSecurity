// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.antivirus.update:
//            ai, UpdateService

class a
    implements Runnable
{

    final ai a;

    public void run()
    {
        Intent intent = new Intent(ai.a(a), com/qihoo/antivirus/update/UpdateService);
        intent.setAction("com.qihoo.action.UPDATE_NOTICE_TIMEOUT");
        ai.a(a).startService(intent);
    }

    eService(ai ai1)
    {
        a = ai1;
        super();
    }
}
