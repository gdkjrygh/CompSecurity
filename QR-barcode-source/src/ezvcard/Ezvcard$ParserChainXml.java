// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.xml.XCardDocument;
import java.io.IOException;
import java.util.List;
import org.xml.sax.SAXException;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

static abstract class  extends 
{

    private XCardDocument constructDocument()
        throws SAXException, IOException
    {
        XCardDocument xcarddocument = _constructDocument();
        xcarddocument.setScribeIndex(index);
        return xcarddocument;
    }

    abstract XCardDocument _constructDocument()
        throws IOException, SAXException;

    public List all()
        throws IOException, SAXException
    {
        XCardDocument xcarddocument = constructDocument();
        List list = xcarddocument.parseAll();
        if (warnings != null)
        {
            warnings.addAll(xcarddocument.getParseWarnings());
        }
        return list;
    }

    public VCard first()
        throws IOException, SAXException
    {
        XCardDocument xcarddocument = constructDocument();
        VCard vcard = xcarddocument.parseFirst();
        if (warnings != null)
        {
            warnings.addAll(xcarddocument.getParseWarnings());
        }
        return vcard;
    }

    ()
    {
    }
}
