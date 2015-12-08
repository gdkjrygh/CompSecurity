// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.net.Uri;

final class clr
    implements bii
{

    boolean a;
    boolean b;
    private clo c;

    clr(clo clo1)
    {
        c = clo1;
        super();
        a = false;
        b = false;
    }

    public final void a(Bitmap bitmap)
    {
    }

    public final void a(Uri uri, long l)
    {
    }

    public final void a(Uri uri, bim bim, cmf cmf)
    {
        clo.a(c).a("analysis succeeded");
        a = true;
    }

    public final void a(Uri uri, bim bim, Exception exception)
    {
        clo.a(c).a("analysis failed");
        clo.b(c).c(uri);
        a = false;
    }

    public final void a(Uri uri, cmf cmf)
    {
    }

    public final void b(Uri uri, bim bim, cmf cmf)
    {
        clo.a(c).a("analysis cancelled");
        b = true;
    }
}
