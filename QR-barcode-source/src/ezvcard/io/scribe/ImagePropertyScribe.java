// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.io.CannotParseException;
import ezvcard.io.html.HCardElement;
import ezvcard.parameter.ImageType;
import ezvcard.parameter.MediaTypeParameter;
import ezvcard.property.BinaryProperty;
import ezvcard.property.ImageProperty;
import ezvcard.property.VCardProperty;
import ezvcard.util.DataUri;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            BinaryPropertyScribe

public abstract class ImagePropertyScribe extends BinaryPropertyScribe
{

    public ImagePropertyScribe(Class class1, String s)
    {
        super(class1, s);
    }

    protected ImageType _buildMediaTypeObj(String s)
    {
        return ImageType.get(null, s, null);
    }

    protected volatile MediaTypeParameter _buildMediaTypeObj(String s)
    {
        return _buildMediaTypeObj(s);
    }

    protected ImageType _buildTypeObj(String s)
    {
        return ImageType.get(s, null, null);
    }

    protected volatile MediaTypeParameter _buildTypeObj(String s)
    {
        return _buildTypeObj(s);
    }

    protected volatile BinaryProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected ImageProperty _parseHtml(HCardElement hcardelement, List list)
    {
        if (!"img".equals(hcardelement.tagName()))
        {
            return (ImageProperty)super._parseHtml(hcardelement, list);
        }
        hcardelement = hcardelement.absUrl("src");
        if (hcardelement.length() == 0)
        {
            throw new CannotParseException("<img> tag does not have a \"src\" attribute.");
        }
        try
        {
            list = new DataUri(hcardelement);
            ImageType imagetype = _buildMediaTypeObj(list.getContentType());
            list = (ImageProperty)_newInstance(list.getData(), imagetype);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            return (ImageProperty)_newInstance(hcardelement, null);
        }
        return list;
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }
}
