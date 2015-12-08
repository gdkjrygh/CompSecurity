// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package bo.app:
//            kg, kf, kh, jb

public final class ke
    implements kg
{

    protected final Context a;
    protected final int b = 5000;
    protected final int c = 20000;

    public ke(Context context)
    {
        a = context.getApplicationContext();
    }

    private HttpURLConnection a(String s)
    {
        s = (HttpURLConnection)(new URL(Uri.encode(s, "@#&=*+-_.,:!?()/~'%"))).openConnection();
        s.setConnectTimeout(b);
        s.setReadTimeout(c);
        return s;
    }

    public final InputStream a(String s, Object obj)
    {
        int i = 0;
        switch (kf.a[kh.a(s).ordinal()])
        {
        default:
            throw new UnsupportedOperationException(String.format("UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))", new Object[] {
                s
            }));

        case 1: // '\001'
        case 2: // '\002'
            for (s = a(s); s.getResponseCode() / 100 == 3 && i < 5; i++)
            {
                s = a(s.getHeaderField("Location"));
            }

            return new jb(new BufferedInputStream(s.getInputStream(), 32768), s.getContentLength());

        case 3: // '\003'
            s = kh.c.c(s);
            return new jb(new BufferedInputStream(new FileInputStream(s), 32768), (new File(s)).length());

        case 4: // '\004'
            return a.getContentResolver().openInputStream(Uri.parse(s));

        case 5: // '\005'
            s = kh.e.c(s);
            return a.getAssets().open(s);

        case 6: // '\006'
            int j = Integer.parseInt(kh.f.c(s));
            s = ((BitmapDrawable)a.getResources().getDrawable(j)).getBitmap();
            obj = new ByteArrayOutputStream();
            s.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, ((java.io.OutputStream) (obj)));
            return new ByteArrayInputStream(((ByteArrayOutputStream) (obj)).toByteArray());
        }
    }
}
