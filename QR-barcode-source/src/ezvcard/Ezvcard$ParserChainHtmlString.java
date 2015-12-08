// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.html.HCardReader;
import ezvcard.io.scribe.VCardPropertyScribe;
import java.io.IOException;
import java.util.List;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

public static class <init> extends <init>
{

    private final String html;

    HCardReader _constructReader()
    {
        return new HCardReader(html, pageUrl);
    }

    public List all()
    {
        List list;
        try
        {
            list = super.pageUrl();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return list;
    }

    public VCard first()
    {
        VCard vcard;
        try
        {
            vcard = super.pageUrl();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return vcard;
    }

    public pageUrl pageUrl(String s)
    {
        return (pageUrl)super.l(s);
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

    private (String s)
    {
        html = s;
    }

    html(String s, html html1)
    {
        this(s);
    }
}
