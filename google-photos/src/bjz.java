// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.net.Uri;

final class bjz
    implements biv
{

    private bii a;
    private Uri b;

    bjz(bii bii1, Uri uri)
    {
        a = bii1;
        b = uri;
        super();
    }

    public final void a(long l)
    {
        a.a(b, l);
    }

    public final void a(Bitmap bitmap)
    {
        a.a(bitmap);
    }

    public final void a(Uri uri, cmf cmf)
    {
        a.a(uri, cmf);
    }
}
