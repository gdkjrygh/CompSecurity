// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class biz
    implements Runnable
{

    private Uri a;
    private bim b;
    private cmf c;
    private biy d;

    biz(biy biy1, Uri uri, bim bim, cmf cmf)
    {
        d = biy1;
        a = uri;
        b = bim;
        c = cmf;
        super();
    }

    public final void run()
    {
        d.a.a(a, b, c);
    }
}
