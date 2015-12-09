// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b.a;

import com.google.code.rome.android.repackaged.com.sun.syndication.feed.synd.SyndFeed;
import com.google.code.rome.android.repackaged.com.sun.syndication.io.FeedException;
import com.google.code.rome.android.repackaged.com.sun.syndication.io.SyndFeedInput;
import com.google.code.rome.android.repackaged.com.sun.syndication.io.SyndFeedOutput;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import org.c.c.b.h;
import org.c.c.f;
import org.c.c.g;
import org.c.c.j;
import org.c.c.n;
import org.c.d.m;

public final class a extends org.c.c.b.a
{

    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    public a()
    {
        super(new n[] {
            n.APPLICATION_RSS_XML, n.APPLICATION_ATOM_XML
        });
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
        }
    }

    private static SyndFeed a(g g1)
    {
        SyndFeedInput syndfeedinput = new SyndFeedInput();
        Object obj = g1.getHeaders().getContentType();
        if (obj != null && ((n) (obj)).getCharSet() != null)
        {
            obj = ((n) (obj)).getCharSet();
        } else
        {
            obj = DEFAULT_CHARSET;
        }
        try
        {
            g1 = syndfeedinput.build(new InputStreamReader(g1.getBody(), ((Charset) (obj))));
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            throw new org.c.c.b.g((new StringBuilder("Could not read SyndFeed: ")).append(g1.getMessage()).toString(), g1);
        }
        return g1;
    }

    protected final Object readInternal(Class class1, g g1)
    {
        return a(g1);
    }

    protected final boolean supports(Class class1)
    {
        return com/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed.isAssignableFrom(class1);
    }

    protected final void writeInternal(Object obj, j j1)
    {
        SyndFeed syndfeed = (SyndFeed)obj;
        Object obj1 = syndfeed.getEncoding();
        obj = obj1;
        if (!m.hasLength(((String) (obj1))))
        {
            obj = DEFAULT_CHARSET.name();
        }
        obj1 = j1.getHeaders().getContentType();
        if (obj1 != null)
        {
            Charset charset = Charset.forName(((String) (obj)));
            obj1 = new n(((n) (obj1)).getType(), ((n) (obj1)).getSubtype(), charset);
            j1.getHeaders().setContentType(((n) (obj1)));
        }
        obj1 = new SyndFeedOutput();
        try
        {
            ((SyndFeedOutput) (obj1)).output(syndfeed, new OutputStreamWriter(j1.getBody(), ((String) (obj))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new h((new StringBuilder("Could not write SyndFeed: ")).append(((FeedException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
    }

}
