// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class bjc
    implements Runnable
{

    private Uri a;
    private long b;
    private biy c;

    bjc(biy biy1, Uri uri, long l)
    {
        c = biy1;
        a = uri;
        b = l;
        super();
    }

    public final void run()
    {
        c.a.a(a, b);
    }
}
