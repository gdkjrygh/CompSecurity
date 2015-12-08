// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b.d;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import com.b.a.c.b;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.b.a.b.d:
//            b

public final class a
    implements com.b.a.b.d.b
{

    protected final Context a;
    protected final int b = 5000;
    protected final int c = 20000;

    public a(Context context)
    {
        a = context.getApplicationContext();
    }

    private InputStream a(String s)
        throws IOException
    {
        int i = 0;
        for (s = b(s); s.getResponseCode() / 100 == 3 && i < 5; i++)
        {
            s = b(s.getHeaderField("Location"));
        }

        InputStream inputstream = s.getInputStream();
        return new com.b.a.b.a.a(new BufferedInputStream(inputstream, 32768), s.getContentLength());
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
        com.b.a.c.b.a(s);
_L2:
        throw obj;
        IOException ioexception;
        ioexception;
        com.b.a.c.b.a(s);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        com.b.a.c.b.a(s);
        throw obj;
    }

    private HttpURLConnection b(String s)
        throws IOException
    {
        s = (HttpURLConnection)(new URL(Uri.encode(s, "@#&=*+-_.,:!?()/~'%"))).openConnection();
        s.setConnectTimeout(b);
        s.setReadTimeout(c);
        return s;
    }

    public final InputStream a(String s, Object obj)
        throws IOException
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.b.a.b.d.b.a.values().length];
                try
                {
                    a[b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.b.a.b.d.b.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[b.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[b.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[b.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.a.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[com.b.a.b.d.b.a.a(s).ordinal()])
        {
        default:
            throw new UnsupportedOperationException(String.format("UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))", new Object[] {
                s
            }));

        case 1: // '\001'
        case 2: // '\002'
            return a(s);

        case 3: // '\003'
            s = b.a.c.c(s);
            return new com.b.a.b.a.a(new BufferedInputStream(new FileInputStream(s), 32768), (int)(new File(s)).length());

        case 4: // '\004'
            obj = a.getContentResolver();
            Uri uri = Uri.parse(s);
            if (s.startsWith("content://com.android.contacts/"))
            {
                return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(((ContentResolver) (obj)), uri);
            } else
            {
                return ((ContentResolver) (obj)).openInputStream(uri);
            }

        case 5: // '\005'
            s = b.a.e.c(s);
            return a.getAssets().open(s);

        case 6: // '\006'
            int i = Integer.parseInt(b.a.f.c(s));
            return a.getResources().openRawResource(i);
        }
    }
}
