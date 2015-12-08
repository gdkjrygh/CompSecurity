// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.io.html.HCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Label;
import ezvcard.property.VCardProperty;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            StringPropertyScribe

public class LabelScribe extends StringPropertyScribe
{

    public LabelScribe()
    {
        super(ezvcard/property/Label, "LABEL");
    }

    protected Label _parseHtml(HCardElement hcardelement, List list)
    {
        list = new Label(hcardelement.value());
        String s;
        for (hcardelement = hcardelement.types().iterator(); hcardelement.hasNext(); list.getParameters().addType(s))
        {
            s = (String)hcardelement.next();
        }

        return list;
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected Label _parseValue(String s)
    {
        return new Label(s);
    }

    protected volatile VCardProperty _parseValue(String s)
    {
        return _parseValue(s);
    }
}
