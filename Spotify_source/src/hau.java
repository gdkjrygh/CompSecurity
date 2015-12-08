// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

public final class hau
    implements Runnable
{

    private final Context a;
    private final haq b;

    public hau(Context context, haq haq1)
    {
        a = context;
        b = haq1;
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
