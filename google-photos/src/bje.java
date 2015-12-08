// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class bje
    implements Runnable
{

    private Uri a;
    private cmf b;
    private biy c;

    bje(biy biy1, Uri uri, cmf cmf)
    {
        c = biy1;
        a = uri;
        b = cmf;
        super();
    }

    public final void run()
    {
        c.a.a(a, b);
    }
}
