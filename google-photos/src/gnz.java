// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;

final class gnz
    implements Runnable
{

    private gnw a;

    gnz(gnw gnw1)
    {
        a = gnw1;
        super();
    }

    public final void run()
    {
        ar ar = a.O_();
        if (ar != null)
        {
            ar.onBackPressed();
        }
    }
}
