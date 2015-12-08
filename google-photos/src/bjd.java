// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

final class bjd
    implements Runnable
{

    private Bitmap a;
    private biy b;

    bjd(biy biy1, Bitmap bitmap)
    {
        b = biy1;
        a = bitmap;
        super();
    }

    public final void run()
    {
        b.a.a(a);
    }
}
