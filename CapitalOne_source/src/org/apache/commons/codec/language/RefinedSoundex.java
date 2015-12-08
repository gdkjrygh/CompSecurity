// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

// Referenced classes of package org.apache.commons.codec.language:
//            SoundexUtils

public class RefinedSoundex
    implements StringEncoder
{

    public static final RefinedSoundex US_ENGLISH = new RefinedSoundex();
    private static final char US_ENGLISH_MAPPING[] = "01360240043788015936020505".toCharArray();
    public static final String US_ENGLISH_MAPPING_STRING = "01360240043788015936020505";
    private final char soundexMapping[];

    public RefinedSoundex()
    {
        soundexMapping = US_ENGLISH_MAPPING;
    }

    public RefinedSoundex(String s)
    {
        soundexMapping = s.toCharArray();
    }

    public RefinedSoundex(char ac[])
    {
        soundexMapping = new char[ac.length];
        System.arraycopy(ac, 0, soundexMapping, 0, ac.length);
    }

    public int difference(String s, String s1)
        throws EncoderException
    {
        return SoundexUtils.difference(this, s, s1);
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof String))
        {
            throw new EncoderException("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } else
        {
            return soundex((String)obj);
        }
    }

    public String encode(String s)
    {
        return soundex(s);
    }

    char getMappingCode(char c)
    {
        if (!Character.isLetter(c))
        {
            return '\0';
        } else
        {
            return soundexMapping[Character.toUpperCase(c) - 65];
        }
    }

    public String soundex(String s)
    {
        if (s == null)
        {
            return null;
        }
        s = SoundexUtils.clean(s);
        if (s.length() == 0)
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s.charAt(0));
        char c1 = '*';
        int i = 0;
        while (i < s.length()) 
        {
            char c = getMappingCode(s.charAt(i));
            if (c != c1)
            {
                if (c != 0)
                {
                    stringbuilder.append(c);
                }
                c1 = c;
            }
            i++;
        }
        return stringbuilder.toString();
    }

}
