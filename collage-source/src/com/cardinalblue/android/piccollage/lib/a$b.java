// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.cardinalblue.android.piccollage.controller.o;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            a, f

public static class nit> extends a
{

    private final a c = a(e());

    private String e()
    {
        Uri uri = Uri.parse(a());
        List list = uri.getPathSegments();
        if (!list.isEmpty())
        {
            if ("backgrounds".equals(list.get(0)))
            {
                return a().replace(b.a(), e.a());
            }
            if ("StickerLite.bundle".equals(list.get(0)))
            {
                return a().replace(b.a(), e.a()).replace("StickerLite.bundle", "stickers/StickerLite");
            }
        }
        return Uri.fromFile(new File(o.a().f(), uri.getPath())).toString();
    }

    public Bitmap a(int i, android.graphics.ap.Config config)
        throws IOException, OutOfMemoryError
    {
        return c.a(i, config);
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

    public er.o(String s)
    {
        super(s, null);
    }
}
