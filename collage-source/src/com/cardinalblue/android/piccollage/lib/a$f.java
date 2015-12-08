// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.cardinalblue.android.piccollage.model.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            a, f

public static class nit> extends a
{

    public Bitmap a(int i, android.graphics.ap.Config config)
        throws IOException
    {
        try
        {
            config = k.a(new File(a), config);
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.ap.Config config)
        {
            IOException ioexception = new IOException((new StringBuilder()).append("[LegacyImageSource] : ").append(config).toString());
            ioexception.setStackTrace(config.getStackTrace());
            throw ioexception;
        }
        return config;
    }

    public void a(ImageView imageview, f f1)
        throws IOException
    {
        throw new RuntimeException("this method is not implemented");
    }

    public InputStream d()
        throws IOException
    {
        return new FileInputStream(new File(a));
    }

    public a(String s)
    {
        super(s, null);
    }
}
