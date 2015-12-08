// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.parameter.ImageType;
import ezvcard.parameter.MediaTypeParameter;
import ezvcard.property.BinaryProperty;
import ezvcard.property.Photo;

// Referenced classes of package ezvcard.io.scribe:
//            ImagePropertyScribe

public class PhotoScribe extends ImagePropertyScribe
{

    public PhotoScribe()
    {
        super(ezvcard/property/Photo, "PHOTO");
    }

    protected volatile BinaryProperty _newInstance(String s, MediaTypeParameter mediatypeparameter)
    {
        return _newInstance(s, (ImageType)mediatypeparameter);
    }

    protected volatile BinaryProperty _newInstance(byte abyte0[], MediaTypeParameter mediatypeparameter)
    {
        return _newInstance(abyte0, (ImageType)mediatypeparameter);
    }

    protected Photo _newInstance(String s, ImageType imagetype)
    {
        return new Photo(s, imagetype);
    }

    protected Photo _newInstance(byte abyte0[], ImageType imagetype)
    {
        return new Photo(abyte0, imagetype);
    }
}
