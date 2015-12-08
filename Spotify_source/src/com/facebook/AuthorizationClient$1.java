// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Intent;
import aof;

// Referenced classes of package com.facebook:
//            AuthorizationClient

final class a
    implements aof
{

    private Activity a;

    public final Activity a()
    {
        return a;
    }

    public final void a(Intent intent, int i)
    {
        a.startActivityForResult(intent, i);
    }

    (Activity activity)
    {
        a = activity;
        super();
    }
}
