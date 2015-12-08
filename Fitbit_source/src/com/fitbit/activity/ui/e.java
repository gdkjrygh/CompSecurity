// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.util.bi;
import java.util.UUID;

public abstract class e extends bi
{

    protected volatile boolean a;
    private UUID b;

    public e(Context context, IntentFilter intentfilter)
    {
        super(context, intentfilter);
        b = UUID.randomUUID();
    }

    protected void a(Intent intent)
    {
        a = false;
        intent.putExtra("com.fitbit.util.service.DispatcherService.GUID", b);
        super.a(intent);
    }

    protected abstract void a(Object obj, boolean flag);

    protected void b(Intent intent)
    {
        intent = (UUID)intent.getSerializableExtra("com.fitbit.util.service.DispatcherService.GUID");
        if (b.equals(intent))
        {
            a = true;
            onContentChanged();
        }
    }

    public void deliverResult(Object obj)
    {
        super.deliverResult(obj);
        a(obj, a);
    }
}
