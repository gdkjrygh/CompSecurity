// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.io.xml.XCardDocument;
import java.io.IOException;
import java.util.List;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

public static class <init> extends <init>
{

    private final Document document;

    XCardDocument _constructDocument()
    {
        return new XCardDocument(document);
    }

    public List all()
    {
        List list;
        try
        {
            list = super.();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        catch (SAXException saxexception)
        {
            throw new RuntimeException(saxexception);
        }
        return list;
    }

    public VCard first()
    {
        VCard vcard;
        try
        {
            vcard = super.st();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        catch (SAXException saxexception)
        {
            throw new RuntimeException(saxexception);
        }
        return vcard;
    }

    public ibe register(VCardPropertyScribe vcardpropertyscribe)
    {
        return (ibe)super.ister(vcardpropertyscribe);
    }

    public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
    {
        return register(vcardpropertyscribe);
    }

    public ibe warnings(List list)
    {
        return (ibe)super.nings(list);
    }

    public volatile Object warnings(List list)
    {
        return warnings(list);
    }

    private ibe(Document document1)
    {
        document = document1;
    }

    document(Document document1, document document2)
    {
        this(document1);
    }
}
