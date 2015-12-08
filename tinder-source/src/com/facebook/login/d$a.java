// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import com.facebook.internal.n;

// Referenced classes of package com.facebook.login:
//            f, d

private static final class a
    implements f
{

    private final Activity a;

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
        n.a(activity, "activity");
        a = activity;
    }
}
