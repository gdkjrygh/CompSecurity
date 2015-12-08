// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            a, f

public static class nit> extends a
{

    private final a c = a(e());

    private String e()
    {
        return (new StringBuilder()).append("https://i.ytimg.com/vi/").append(Uri.parse(a).getLastPathSegment()).append("/hqdefault.jpg").toString();
    }

    public Bitmap a(int j, android.graphics.ap.Config config)
        throws IOException, OutOfMemoryError
    {
        return c.a(j, config);
    }

    public void a(ImageView imageview, f f)
        throws IOException, OutOfMemoryError
    {
        c.a(imageview, f);
    }

    public InputStream d()
        throws IOException
    {
        return c.d();
    }

    public (String s)
    {
        super(s, null);
    }
}
