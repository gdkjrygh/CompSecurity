// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bff
    implements Runnable
{

    private View a[];

    bff(bfe bfe, View aview[])
    {
        a = aview;
        super();
    }

    public final void run()
    {
        bgb.a(a, true);
    }
}
