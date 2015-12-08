// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class bix
    implements Runnable
{

    private Uri a;
    private bim b;
    private bii c;
    private biw d;

    bix(biw biw1, Uri uri, bim bim, bii bii)
    {
        d = biw1;
        a = uri;
        b = bim;
        c = bii;
        super();
    }

    public final void run()
    {
        biw.a(d).a(a, b, new biy(d, c));
    }
}
