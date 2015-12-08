// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.parameter.ImageType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package ezvcard.property:
//            BinaryProperty

public class ImageProperty extends BinaryProperty
{

    public ImageProperty(File file, ImageType imagetype)
        throws IOException
    {
        super(file, imagetype);
    }

    public ImageProperty(InputStream inputstream, ImageType imagetype)
        throws IOException
    {
        super(inputstream, imagetype);
    }

    public ImageProperty(String s, ImageType imagetype)
    {
        super(s, imagetype);
    }

    public ImageProperty(byte abyte0[], ImageType imagetype)
    {
        super(abyte0, imagetype);
    }
}
