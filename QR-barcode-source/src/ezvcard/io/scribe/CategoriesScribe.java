// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.io.html.HCardElement;
import ezvcard.property.Categories;
import ezvcard.property.TextListProperty;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            ListPropertyScribe

public class CategoriesScribe extends ListPropertyScribe
{

    public CategoriesScribe()
    {
        super(ezvcard/property/Categories, "CATEGORIES");
    }

    protected Categories _newInstance()
    {
        return new Categories();
    }

    protected volatile TextListProperty _newInstance()
    {
        return _newInstance();
    }

    protected Categories _parseHtml(HCardElement hcardelement, List list)
    {
        String s = hcardelement.attr("rel");
        list = s;
        if (s.length() == 0)
        {
            list = hcardelement.value();
        }
        hcardelement = _newInstance();
        hcardelement.addValue(list);
        return hcardelement;
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }
}
