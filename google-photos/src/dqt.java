// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class dqt
    implements mpj
{

    private dqs a;

    dqt(dqs dqs1)
    {
        a = dqs1;
        super();
    }

    public final void a(int i, Intent intent)
    {
        if (i == -1 && intent != null)
        {
            dqs.a(a).a(faz.b, (ekp)intent.getParcelableExtra("navigate_to_media"));
        }
    }
}
