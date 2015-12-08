// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class adr
    implements Runnable
{

    private adq a;

    adr(adq adq1)
    {
        a = adq1;
        super();
    }

    public final void run()
    {
        View view = a.l;
        if (view != null && view.getWindowToken() != null)
        {
            a.b();
        }
    }
}
