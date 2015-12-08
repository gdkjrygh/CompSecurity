// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.html.HCardReader;
import ezvcard.io.scribe.VCardPropertyScribe;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.util.List;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

public static class <init> extends <init>
{

    private final File file;
    private final Reader reader;
    private final URL url;

    HCardReader _constructReader()
        throws IOException
    {
        if (reader != null)
        {
            return new HCardReader(reader, pageUrl);
        }
        if (file != null)
        {
            return new HCardReader(file, pageUrl);
        } else
        {
            return new HCardReader(url);
        }
    }

    public volatile List all()
        throws IOException
    {
        return super.url();
    }

    public volatile VCard first()
        throws IOException
    {
        return super.url();
    }

    public url pageUrl(String s)
    {
        return (url)super.l(s);
    }

    public volatile Object pageUrl(String s)
    {
        return pageUrl(s);
    }

    public pageUrl register(VCardPropertyScribe vcardpropertyscribe)
    {
        return (pageUrl)super.er(vcardpropertyscribe);
    }

    public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
    {
        return register(vcardpropertyscribe);
    }

    public register warnings(List list)
    {
        return (register)super.gs(list);
    }

    public volatile Object warnings(List list)
    {
        return warnings(list);
    }

    private (File file1)
    {
        reader = null;
        file = file1;
        url = null;
    }

    url(File file1, url url1)
    {
        this(file1);
    }

    private <init>(Reader reader1)
    {
        reader = reader1;
        file = null;
        url = null;
    }

    url(Reader reader1, url url1)
    {
        this(reader1);
    }

    private <init>(URL url1)
    {
        reader = null;
        file = null;
        url = url1;
    }

    url(URL url1, url url2)
    {
        this(url1);
    }
}
