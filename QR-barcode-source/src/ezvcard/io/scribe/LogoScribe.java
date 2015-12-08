// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.parameter.ImageType;
import ezvcard.parameter.MediaTypeParameter;
import ezvcard.property.BinaryProperty;
import ezvcard.property.Logo;

// Referenced classes of package ezvcard.io.scribe:
//            ImagePropertyScribe

public class LogoScribe extends ImagePropertyScribe
{

    public LogoScribe()
    {
        super(ezvcard/property/Logo, "LOGO");
    }

    protected volatile BinaryProperty _newInstance(String s, MediaTypeParameter mediatypeparameter)
    {
        return _newInstance(s, (ImageType)mediatypeparameter);
    }

    protected volatile BinaryProperty _newInstance(byte abyte0[], MediaTypeParameter mediatypeparameter)
    {
        return _newInstance(abyte0, (ImageType)mediatypeparameter);
    }

    protected Logo _newInstance(String s, ImageType imagetype)
    {
        return new Logo(s, imagetype);
    }

    protected Logo _newInstance(byte abyte0[], ImageType imagetype)
    {
        return new Logo(abyte0, imagetype);
    }
}
