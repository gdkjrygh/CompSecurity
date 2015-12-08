// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class imv extends mtf
{

    private final int a;
    private final iuj b;
    private final String c;
    private final int j = 0;

    public imv(int i, iuj iuj1, String s, int k)
    {
        super("DeleteStoryTask");
        a = i;
        b = iuj1;
        c = s;
    }

    protected final mue a(Context context)
    {
        imu imu1 = new imu(context, a, b, c, j);
        imu1.d();
        if (!imu1.l())
        {
            iun.b(context, a, b);
            mtj.b(context, new hlu(a, b.a));
        }
        context = new mue(((nxx) (imu1)).l, ((nxx) (imu1)).n, ((nxx) (imu1)).m);
        context.a().putBoolean("delete_succeeded", imu1.l());
        context.a().putInt("delete_type", j);
        return context;
    }
}
