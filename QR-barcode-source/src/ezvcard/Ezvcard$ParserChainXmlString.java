// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.io.xml.XCardDocument;
import java.io.IOException;
import java.util.List;
import org.xml.sax.SAXException;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

public static class <init> extends <init>
{

    private final String xml;

    XCardDocument _constructDocument()
        throws SAXException
    {
        return new XCardDocument(xml);
    }

    public List all()
        throws SAXException
    {
        List list;
        try
        {
            list = super.xml();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return list;
    }

    public VCard first()
        throws SAXException
    {
        VCard vcard;
        try
        {
            vcard = super.xml();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return vcard;
    }

    public  register(VCardPropertyScribe vcardpropertyscribe)
    {
        return ()super.er(vcardpropertyscribe);
    }

    public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
    {
        return register(vcardpropertyscribe);
    }

    public  warnings(List list)
    {
        return ()super.gs(list);
    }

    public volatile Object warnings(List list)
    {
        return warnings(list);
    }

    private (String s)
    {
        xml = s;
    }

    xml(String s, xml xml1)
    {
        this(s);
    }
}
