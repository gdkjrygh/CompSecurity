// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.Executor;

final class biy
    implements bii
{

    final bii a;
    private biw b;

    biy(biw biw1, bii bii1)
    {
        b = biw1;
        super();
        a = (bii)b.a(bii1, "callback", null);
    }

    public final void a(Bitmap bitmap)
    {
        biw.b(b).execute(new bjd(this, bitmap));
    }

    public final void a(Uri uri, long l)
    {
        biw.b(b).execute(new bjc(this, uri, l));
    }

    public final void a(Uri uri, bim bim, cmf cmf)
    {
        biw.b(b).execute(new biz(this, uri, bim, cmf));
    }

    public final void a(Uri uri, bim bim, Exception exception)
    {
        biw.b(b).execute(new bjb(this, uri, bim, exception));
    }

    public final void a(Uri uri, cmf cmf)
    {
        biw.b(b).execute(new bje(this, uri, cmf));
    }

    public final void b(Uri uri, bim bim, cmf cmf)
    {
        biw.b(b).execute(new bja(this, uri, bim, cmf));
    }
}
