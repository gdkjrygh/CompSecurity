// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

// Referenced classes of package org.apache.commons.codec.language:
//            SoundexUtils

public class Soundex
    implements StringEncoder
{

    public static final Soundex US_ENGLISH = new Soundex();
    private static final char US_ENGLISH_MAPPING[] = "01230120022455012623010202".toCharArray();
    public static final String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";
    private int maxLength;
    private final char soundexMapping[];

    public Soundex()
    {
        maxLength = 4;
        soundexMapping = US_ENGLISH_MAPPING;
    }

    public Soundex(String s)
    {
        maxLength = 4;
        soundexMapping = s.toCharArray();
    }

    public Soundex(char ac[])
    {
        maxLength = 4;
        soundexMapping = new char[ac.length];
        System.arraycopy(ac, 0, soundexMapping, 0, ac.length);
    }

    private char getMappingCode(String s, int i)
    {
        char c;
label0:
        {
            char c1 = map(s.charAt(i));
            c = c1;
            if (i <= 1)
            {
                break label0;
            }
            c = c1;
            if (c1 == '0')
            {
                break label0;
            }
            char c3 = s.charAt(i - 1);
            if ('H' != c3)
            {
                c = c1;
                if ('W' != c3)
                {
                    break label0;
                }
            }
            char c2 = s.charAt(i - 2);
            if (map(c2) != c1 && 'H' != c2)
            {
                c = c1;
                if ('W' != c2)
                {
                    break label0;
                }
            }
            c = '\0';
        }
        return c;
    }

    private char[] getSoundexMapping()
    {
        return soundexMapping;
    }

    private char map(char c)
    {
        int i = c - 65;
        if (i < 0 || i >= getSoundexMapping().length)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("The character is not mapped: ").append(c).toString());
        } else
        {
            return getSoundexMapping()[i];
        }
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
            throw new EncoderException("Parameter supplied to Soundex encode is not of type java.lang.String");
        } else
        {
            return soundex((String)obj);
        }
    }

    public String encode(String s)
    {
        return soundex(s);
    }

    public int getMaxLength()
    {
        return maxLength;
    }

    public void setMaxLength(int i)
    {
        maxLength = i;
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
        char ac[] = new char[4];
        char[] _tmp = ac;
        ac[0] = '0';
        ac[1] = '0';
        ac[2] = '0';
        ac[3] = '0';
        int i = 1;
        int j = 1;
        ac[0] = s.charAt(0);
        char c1 = getMappingCode(s, 0);
        while (i < s.length() && j < ac.length) 
        {
            int k = i + 1;
            char c = getMappingCode(s, i);
            if (c != 0)
            {
                i = j;
                if (c != '0')
                {
                    i = j;
                    if (c != c1)
                    {
                        ac[j] = c;
                        i = j + 1;
                    }
                }
                c1 = c;
                j = i;
                i = k;
            } else
            {
                i = k;
            }
        }
        return new String(ac);
    }

}
