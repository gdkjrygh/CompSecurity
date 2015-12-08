// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.scribe.ScribeIndex;
import ezvcard.io.scribe.VCardPropertyScribe;
import java.io.IOException;
import java.util.List;
import org.xml.sax.SAXException;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

static abstract class rtyScribe
{

    final ScribeIndex index = new ScribeIndex();
    final Object this_ = this;
    List warnings;

    public abstract List all()
        throws IOException, SAXException;

    public abstract VCard first()
        throws IOException, SAXException;

    public Object register(VCardPropertyScribe vcardpropertyscribe)
    {
        index.register(vcardpropertyscribe);
        return this_;
    }

    public Object warnings(List list)
    {
        warnings = list;
        return this_;
    }

    rtyScribe()
    {
    }
}
