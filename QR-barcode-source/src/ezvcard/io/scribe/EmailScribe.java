// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.io.html.HCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Email;
import ezvcard.property.VCardProperty;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package ezvcard.io.scribe:
//            StringPropertyScribe

public class EmailScribe extends StringPropertyScribe
{

    public EmailScribe()
    {
        super(ezvcard/property/Email, "EMAIL");
    }

    protected Email _parseHtml(HCardElement hcardelement, List list)
    {
        list = hcardelement.attr("href");
        if (list.length() > 0)
        {
            list = Pattern.compile("^mailto:(.*)$", 2).matcher(list);
            String s;
            if (list.find())
            {
                list = list.group(1);
            } else
            {
                list = hcardelement.value();
            }
        } else
        {
            list = hcardelement.value();
        }
        list = new Email(list);
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

    protected Email _parseValue(String s)
    {
        return new Email(s);
    }

    protected volatile VCardProperty _parseValue(String s)
    {
        return _parseValue(s);
    }

    protected void _prepareParameters(Email email, VCardParameters vcardparameters, VCardVersion vcardversion, VCard vcard)
    {
        handlePrefParam(email, vcardparameters, vcardversion, vcard);
    }

    protected volatile void _prepareParameters(VCardProperty vcardproperty, VCardParameters vcardparameters, VCardVersion vcardversion, VCard vcard)
    {
        _prepareParameters((Email)vcardproperty, vcardparameters, vcardversion, vcard);
    }
}
