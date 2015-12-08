// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaExtractor;
import android.net.Uri;
import java.io.IOException;

public class cjs
{

    Context a;
    final noj b;
    final okj c;

    public cjs(Context context, noj noj1, okj okj1)
    {
        a = (Context)b.a(context, "context", null);
        b = (noj)b.a(noj1, "movieMakerProvider", null);
        c = (okj)b.a(okj1, "chunkStore", null);
    }

    public cjt a(Uri uri)
    {
        MediaExtractor mediaextractor;
        b.a(uri, "uri", null);
        mediaextractor = new MediaExtractor();
        mediaextractor.setDataSource(a, uri, null);
        return new cju(mediaextractor);
        IOException ioexception;
        ioexception;
        throw new cri(uri, ioexception);
        uri;
        mediaextractor.release();
        throw uri;
    }

    public cjt a(String s)
    {
        MediaExtractor mediaextractor;
        b.a(s, "path", null);
        mediaextractor = new MediaExtractor();
        mediaextractor.setDataSource(s);
        return new cju(mediaextractor);
        IOException ioexception;
        ioexception;
        throw new cri(s, ioexception);
        s;
        mediaextractor.release();
        throw s;
    }

    public cjv a(int i, Uri uri, String s)
    {
        return new cke(a.getContentResolver(), uri, new cln(a, b, i, s));
    }

    public cjv a(nny nny1, int i)
    {
        b.a(nny1, "mediaIdentifier", null);
        cjz cjz1;
        try
        {
            cjz1 = new cjz(b.a(a, i, nny1.a.a, c), c, b, i, a, nny1);
        }
        catch (nop nop1)
        {
            nny1 = String.valueOf(nny1);
            throw new IOException((new StringBuilder(String.valueOf(nny1).length() + 31)).append("Error getting video stream for ").append(nny1).toString(), nop1);
        }
        return cjz1;
    }

    public cjt b(nny nny1, int i)
    {
        if (nny1.a != null && nny1.a.a != null)
        {
            try
            {
                nny1 = new cjz(b.a(a, i, nny1.a.a, c), c, b, i, a, nny1);
            }
            // Misplaced declaration of an exception variable
            catch (nny nny1)
            {
                throw new IOException("Couldn't get cloud video stream.", nny1);
            }
            return nny1;
        } else
        {
            return a(nny1.b);
        }
    }
}
