// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.parameter.SoundType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package ezvcard.property:
//            BinaryProperty

public class Sound extends BinaryProperty
{

    public Sound(File file, SoundType soundtype)
        throws IOException
    {
        super(file, soundtype);
    }

    public Sound(InputStream inputstream, SoundType soundtype)
        throws IOException
    {
        super(inputstream, soundtype);
    }

    public Sound(String s, SoundType soundtype)
    {
        super(s, soundtype);
    }

    public Sound(byte abyte0[], SoundType soundtype)
    {
        super(abyte0, soundtype);
    }

    public String getLanguage()
    {
        return super.getLanguage();
    }

    public void setLanguage(String s)
    {
        super.setLanguage(s);
    }
}
