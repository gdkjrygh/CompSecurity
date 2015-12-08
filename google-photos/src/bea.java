// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bea
    implements Runnable
{

    private View a[];

    bea(bdx bdx, View aview[])
    {
        a = aview;
        super();
    }

    public final void run()
    {
        bgb.a(a, true);
    }
}
