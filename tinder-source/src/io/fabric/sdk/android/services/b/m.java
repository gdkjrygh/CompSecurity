// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.b;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package io.fabric.sdk.android.services.b:
//            i

public final class m
    implements Runnable
{

    private final Context a;
    private final i b;

    public m(Context context, i j)
    {
        a = context;
        b = j;
    }

    public final void run()
    {
        try
        {
            CommonUtils.a(a, "Performing time based file roll over.");
            if (!b.e())
            {
                b.d();
            }
            return;
        }
        catch (Exception exception)
        {
            CommonUtils.b(a, "Failed to roll over file");
        }
    }
}
