// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.io.html.HCardElement;
import ezvcard.property.Nickname;
import ezvcard.property.TextListProperty;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            ListPropertyScribe

public class NicknameScribe extends ListPropertyScribe
{

    public NicknameScribe()
    {
        super(ezvcard/property/Nickname, "NICKNAME");
    }

    protected Nickname _newInstance()
    {
        return new Nickname();
    }

    protected volatile TextListProperty _newInstance()
    {
        return _newInstance();
    }

    protected Nickname _parseHtml(HCardElement hcardelement, List list)
    {
        list = _newInstance();
        list.addValue(hcardelement.value());
        return list;
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }
}
