// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

// Referenced classes of package org.apache.commons.codec.language:
//            Caverphone2

public class Caverphone
    implements StringEncoder
{

    private final Caverphone2 encoder = new Caverphone2();

    public Caverphone()
    {
    }

    public String caverphone(String s)
    {
        return encoder.encode(s);
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof String))
        {
            throw new EncoderException("Parameter supplied to Caverphone encode is not of type java.lang.String");
        } else
        {
            return caverphone((String)obj);
        }
    }

    public String encode(String s)
    {
        return caverphone(s);
    }

    public boolean isCaverphoneEqual(String s, String s1)
    {
        return caverphone(s).equals(caverphone(s1));
    }
}
