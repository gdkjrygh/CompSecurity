// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.d;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.a.a.c.c;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.a.a.b.d:
//            c, b, d

public final class a
    implements com.a.a.b.d.c
{

    protected final Context a;
    protected final int b = 5000;
    protected final int c = 20000;

    public a(Context context)
    {
        a = context.getApplicationContext();
    }

    private InputStream a(String s)
    {
        int i = 0;
        for (s = b(s); s.getResponseCode() / 100 == 3 && i < 5; i++)
        {
            s = b(s.getHeaderField("Location"));
        }

        InputStream inputstream = s.getInputStream();
        return new com.a.a.b.a.a(new BufferedInputStream(inputstream, 32768), s.getContentLength());
        Object obj;
        obj;
        byte abyte0[];
        s = s.getErrorStream();
        abyte0 = new byte[32768];
        int j;
        do
        {
            j = s.read(abyte0, 0, 32768);
        } while (j != -1);
        com.a.a.c.c.a(s);
_L2:
        throw obj;
        IOException ioexception;
        ioexception;
        com.a.a.c.c.a(s);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        com.a.a.c.c.a(s);
        throw obj;
    }

    private HttpURLConnection b(String s)
    {
        s = (HttpURLConnection)(new URL(Uri.encode(s, "@#&=*+-_.,:!?()/~'%"))).openConnection();
        s.setConnectTimeout(b);
        s.setReadTimeout(c);
        return s;
    }

    public final InputStream a(String s, Object obj)
    {
        int i;
        switch (b.a[d.a(s).ordinal()])
        {
        default:
            throw new UnsupportedOperationException(String.format("UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))", new Object[] {
                s
            }));

        case 1: // '\001'
        case 2: // '\002'
            return a(s);

        case 3: // '\003'
            s = com.a.a.b.d.d.c.c(s);
            return new com.a.a.b.a.a(new BufferedInputStream(new FileInputStream(s), 32768), (new File(s)).length());

        case 4: // '\004'
            return a.getContentResolver().openInputStream(Uri.parse(s));

        case 5: // '\005'
            s = d.e.c(s);
            return a.getAssets().open(s);

        case 6: // '\006'
            i = Integer.parseInt(d.f.c(s));
            break;
        }
        s = ((BitmapDrawable)a.getResources().getDrawable(i)).getBitmap();
        obj = new ByteArrayOutputStream();
        s.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, ((java.io.OutputStream) (obj)));
        return new ByteArrayInputStream(((ByteArrayOutputStream) (obj)).toByteArray());
    }
}
