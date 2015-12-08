// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package org.androidannotations.api.a:
//            e

public abstract class f extends e
{

    public f(Context context, Intent intent)
    {
        super(context, intent);
    }

    public f(Context context, Class class1)
    {
        super(context, class1);
    }

    public ComponentName start()
    {
        return context.startService(intent);
    }

    public boolean stop()
    {
        return context.stopService(intent);
    }
}
