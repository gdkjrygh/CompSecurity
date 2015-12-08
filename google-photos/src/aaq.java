// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioManager;

final class aaq extends yw
{

    private aap a;

    aaq(aap aap1)
    {
        a = aap1;
        super();
    }

    public final void b(int i)
    {
        aap.a(a).setStreamVolume(3, i, 0);
        aap.b(a);
    }

    public final void c(int i)
    {
        int j = aap.a(a).getStreamVolume(3);
        if (Math.min(aap.a(a).getStreamMaxVolume(3), Math.max(0, j + i)) != j)
        {
            aap.a(a).setStreamVolume(3, j, 0);
        }
        aap.b(a);
    }
}
