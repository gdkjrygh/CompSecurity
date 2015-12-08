// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

final class bqg
    implements Runnable
{

    private Bitmap a;
    private bqa b;

    bqg(bqa bqa1, Bitmap bitmap)
    {
        b = bqa1;
        a = bitmap;
        super();
    }

    public final void run()
    {
        ((bqr)bqa.q(b).b).a(a);
    }
}
