// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.parameter.ImageType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package ezvcard.property:
//            ImageProperty

public class Photo extends ImageProperty
{

    public Photo(File file, ImageType imagetype)
        throws IOException
    {
        super(file, imagetype);
    }

    public Photo(InputStream inputstream, ImageType imagetype)
        throws IOException
    {
        super(inputstream, imagetype);
    }

    public Photo(String s, ImageType imagetype)
    {
        super(s, imagetype);
    }

    public Photo(byte abyte0[], ImageType imagetype)
    {
        super(abyte0, imagetype);
    }
}
