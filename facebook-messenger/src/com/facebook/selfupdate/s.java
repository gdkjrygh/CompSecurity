// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.common.executors.a;
import com.facebook.prefs.shared.d;

// Referenced classes of package com.facebook.selfupdate:
//            q, j, t

class s
    implements b
{

    final q a;

    s(q q1)
    {
        a = q1;
        super();
    }

    public void a(Context context, Intent intent, c c)
    {
        long l = intent.getExtras().getLong("extra_download_id");
        if (com.facebook.selfupdate.q.a(a).a(j.g, -1L) == l)
        {
            com.facebook.selfupdate.q.b(a).a("completeDownload", new t(this, l));
        }
    }
}
