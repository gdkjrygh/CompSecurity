// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gjt
    implements gjz
{

    private final gjr a;
    private final noz b;

    gjt(Context context, gjr gjr1)
    {
        a = gjr1;
        b = noz.a(context, 3, "OnDeviceSearchPartition", new String[] {
            "perf"
        });
    }

    public final void a(int i)
    {
        a.a(i, true);
_L1:
        return;
        mmy mmy1;
        mmy1;
        if (b.a())
        {
            noy.a(i);
            return;
        }
          goto _L1
    }
}
