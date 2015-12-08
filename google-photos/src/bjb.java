// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class bjb
    implements Runnable
{

    private Uri a;
    private bim b;
    private Exception c;
    private biy d;

    bjb(biy biy1, Uri uri, bim bim, Exception exception)
    {
        d = biy1;
        a = uri;
        b = bim;
        c = exception;
        super();
    }

    public final void run()
    {
        d.a.a(a, b, c);
    }
}
