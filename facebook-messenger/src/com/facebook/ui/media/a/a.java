// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.g.e;
import com.facebook.debug.log.b;
import com.facebook.http.b.ap;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.facebook.ui.media.a:
//            h, c, d

public class a
{

    private static final Class a = com/facebook/ui/media/a/a;
    private final ap b;
    private final Context c;
    private final String d;
    private final com.facebook.analytics.j.a e;
    private final av f;
    private final e g;
    private final h h = new h(null);

    public a(Context context, ap ap1, String s, com.facebook.analytics.j.a a1, av av1, e e1)
    {
        c = context;
        b = ap1;
        d = s;
        e = a1;
        f = av1;
        g = e1;
    }

    private void a(String s, String s1, int i)
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append(s).append(" Url: ").append(s1).toString());
        cb cb1 = (new cb("media_downloader_failure")).b("category", (new StringBuilder()).append(s).append(":").append(d).toString()).b("url", s1).a("http_code", i);
        s1 = URI.create(s1);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s1.getScheme()).append('_').append(s1.getHost());
        stringbuilder.append('_').append(s).append('_').append(i);
        cb1.a("throttle_key", stringbuilder.toString());
        cb1.a("throttle_duration", String.valueOf(0x36ee80L));
        f.a(cb1, g);
    }

    private HttpResponse b(Uri uri)
    {
        Uri uri1;
        int i;
        uri1 = Uri.parse(uri.toString());
        uri = null;
        i = 0;
_L2:
        Object obj1;
        obj1 = uri;
        if (i >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Fetching ").append(uri1).toString());
        h(uri1);
        e.b(uri1.toString());
        uri = new HttpGet(uri1.toString());
        uri = b.a(d, uri, "MediaDownloader");
        obj1 = uri;
        if (!h.a(uri))
        {
            break; /* Loop/switch isn't completed */
        }
        uri1 = h.a(uri, uri1);
        obj1 = uri.getEntity();
        Object obj;
        if (obj1 != null)
        {
            try
            {
                ((HttpEntity) (obj1)).consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        i++;
        if (true) goto _L2; else goto _L1
        obj;
        throw new ClientProtocolException(((Throwable) (obj)));
        obj;
        uri = uri.getEntity();
        if (uri != null)
        {
            try
            {
                uri.consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri) { }
        }
        throw obj;
_L1:
        return ((HttpResponse) (obj1));
    }

    private c c(Uri uri)
    {
        HttpEntity httpentity;
        int i;
        HttpResponse httpresponse = b(uri);
        httpentity = httpresponse.getEntity();
        i = httpresponse.getStatusLine().getStatusCode();
        if (i != 200 || httpentity == null) goto _L2; else goto _L1
_L1:
        c c2;
        e.c(uri.toString());
        c2 = com.facebook.ui.media.a.c.a(httpentity);
_L7:
        if (c2.a() != d.SUCCESS)
        {
            a("MediaDownloader (HTTP code)", uri.toString(), i);
        }
        return c2;
_L2:
        if (i != 404) goto _L4; else goto _L3
_L3:
        c c1 = com.facebook.ui.media.a.c.a(d.NOT_FOUND);
_L5:
        c2 = c1;
        if (httpentity != null)
        {
            httpentity.consumeContent();
            c2 = c1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (i != 403)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        c1 = com.facebook.ui.media.a.c.a(d.FORBIDDEN);
          goto _L5
        c1 = com.facebook.ui.media.a.c.a(d.OTHER);
          goto _L5
        uri;
        if (httpentity != null)
        {
            httpentity.consumeContent();
        }
        throw uri;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private c d(Uri uri)
    {
        if ("com.android.contacts".equals(uri.getAuthority()))
        {
            return e(uri);
        } else
        {
            return f(uri);
        }
    }

    private c e(Uri uri)
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Downloading contact photo from: ").append(uri).toString());
        java.io.InputStream inputstream = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(c.getContentResolver(), uri);
        if (inputstream == null)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Contact photo not found: ").append(uri).toString());
            return com.facebook.ui.media.a.c.a(d.NOT_FOUND);
        } else
        {
            return com.facebook.ui.media.a.c.a(inputstream);
        }
    }

    private c f(Uri uri)
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Downloading media from generic content resolver: ").append(uri).toString());
        java.io.InputStream inputstream = c.getContentResolver().openInputStream(uri);
        if (inputstream == null)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Media not found: ").append(uri).toString());
            return com.facebook.ui.media.a.c.a(d.NOT_FOUND);
        } else
        {
            return com.facebook.ui.media.a.c.a(inputstream);
        }
    }

    private c g(Uri uri)
    {
        return com.facebook.ui.media.a.c.a(new FileInputStream(uri.getPath()));
    }

    private void h(Uri uri)
    {
        try
        {
            URI.create(uri.toString());
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new IOException((new StringBuilder()).append("Invalid URI: ").append(uri).toString());
        }
    }

    public c a(Uri uri)
    {
        c c1;
        try
        {
            if ("http".equals(uri.getScheme()) || "https".equals(uri.getScheme()))
            {
                return c(uri);
            }
            if ("content".equals(uri.getScheme()))
            {
                return d(uri);
            }
            if ("file".equals(uri.getScheme()))
            {
                return g(uri);
            }
            com.facebook.debug.log.b.e(a, "Unsupported scheme: %s", new Object[] {
                uri
            });
            c1 = com.facebook.ui.media.a.c.a(d.UNSUPPORTED_URI);
        }
        catch (IOException ioexception)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("IOException downloading ").append(uri).toString(), ioexception);
            return com.facebook.ui.media.a.c.a(d.IO_EXCEPTION);
        }
        return c1;
    }

}
