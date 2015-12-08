// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.cardinalblue.android.b.k;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            a, f

public static class nit> extends a
{

    public Bitmap a(int i, android.graphics.ap.Config config)
        throws IOException, OutOfMemoryError
    {
        try
        {
            config = BitmapFactory.decodeResource(k.a().getResources(), Integer.valueOf(b.c(a)).intValue());
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.ap.Config config)
        {
            IOException ioexception = new IOException((new StringBuilder()).append("Invalid uri to convert resource id. Uri: ").append(a).toString());
            ioexception.setStackTrace(config.getStackTrace());
            throw ioexception;
        }
        return config;
    }

    public void a(ImageView imageview, f f)
        throws IOException, OutOfMemoryError
    {
        try
        {
            imageview.setImageResource(Integer.valueOf(b.c(a)).intValue());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ImageView imageview)
        {
            throw new IOException((new StringBuilder()).append("Invalid uri to convert resource id. Uri: ").append(a).toString());
        }
    }

    public InputStream d()
        throws IOException
    {
        return null;
    }

    public (String s)
    {
        super(s, null);
    }
}
