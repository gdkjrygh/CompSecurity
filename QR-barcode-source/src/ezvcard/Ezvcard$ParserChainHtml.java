// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.html.HCardReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

static abstract class  extends 
{

    String pageUrl;

    private HCardReader constructReader()
        throws IOException
    {
        HCardReader hcardreader = _constructReader();
        hcardreader.setScribeIndex(index);
        return hcardreader;
    }

    abstract HCardReader _constructReader()
        throws IOException;

    public List all()
        throws IOException
    {
        HCardReader hcardreader = constructReader();
        ArrayList arraylist = new ArrayList();
        do
        {
            VCard vcard = hcardreader.readNext();
            if (vcard != null)
            {
                if (warnings != null)
                {
                    warnings.add(hcardreader.getWarnings());
                }
                arraylist.add(vcard);
            } else
            {
                return arraylist;
            }
        } while (true);
    }

    public VCard first()
        throws IOException
    {
        HCardReader hcardreader = constructReader();
        VCard vcard = hcardreader.readNext();
        if (warnings != null)
        {
            warnings.add(hcardreader.getWarnings());
        }
        return vcard;
    }

    public Object pageUrl(String s)
    {
        pageUrl = s;
        return this_;
    }

    ()
    {
    }
}
