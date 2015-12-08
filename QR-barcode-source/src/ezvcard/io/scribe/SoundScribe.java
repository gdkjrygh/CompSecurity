// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.io.CannotParseException;
import ezvcard.io.html.HCardElement;
import ezvcard.parameter.MediaTypeParameter;
import ezvcard.parameter.SoundType;
import ezvcard.property.BinaryProperty;
import ezvcard.property.Sound;
import ezvcard.property.VCardProperty;
import ezvcard.util.DataUri;
import java.util.List;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// Referenced classes of package ezvcard.io.scribe:
//            BinaryPropertyScribe

public class SoundScribe extends BinaryPropertyScribe
{

    public SoundScribe()
    {
        super(ezvcard/property/Sound, "SOUND");
    }

    protected volatile MediaTypeParameter _buildMediaTypeObj(String s)
    {
        return _buildMediaTypeObj(s);
    }

    protected SoundType _buildMediaTypeObj(String s)
    {
        return SoundType.get(null, s, null);
    }

    protected volatile MediaTypeParameter _buildTypeObj(String s)
    {
        return _buildTypeObj(s);
    }

    protected SoundType _buildTypeObj(String s)
    {
        return SoundType.get(s, null, null);
    }

    protected volatile BinaryProperty _newInstance(String s, MediaTypeParameter mediatypeparameter)
    {
        return _newInstance(s, (SoundType)mediatypeparameter);
    }

    protected volatile BinaryProperty _newInstance(byte abyte0[], MediaTypeParameter mediatypeparameter)
    {
        return _newInstance(abyte0, (SoundType)mediatypeparameter);
    }

    protected Sound _newInstance(String s, SoundType soundtype)
    {
        return new Sound(s, soundtype);
    }

    protected Sound _newInstance(byte abyte0[], SoundType soundtype)
    {
        return new Sound(abyte0, soundtype);
    }

    protected volatile BinaryProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected Sound _parseHtml(HCardElement hcardelement, List list)
    {
        String s = hcardelement.tagName();
        if (!"audio".equals(s) && !"source".equals(s))
        {
            return (Sound)super._parseHtml(hcardelement, list);
        }
        list = hcardelement;
        if ("audio".equals(s))
        {
            hcardelement = hcardelement.getElement().getElementsByTag("source").first();
            if (hcardelement == null)
            {
                throw new CannotParseException("No <source> tag found beneath <audio> tag.");
            }
            list = new HCardElement(hcardelement);
        }
        hcardelement = list.absUrl("src");
        if (hcardelement.length() == 0)
        {
            throw new CannotParseException("<source> tag does not have a \"src\" attribute.");
        }
        list = list.attr("type");
        if (list.length() != 0)
        {
            _buildMediaTypeObj(list);
        }
        try
        {
            list = new DataUri(hcardelement);
            SoundType soundtype = _buildMediaTypeObj(list.getContentType());
            list = new Sound(list.getData(), soundtype);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            return new Sound(hcardelement, null);
        }
        return list;
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }
}
