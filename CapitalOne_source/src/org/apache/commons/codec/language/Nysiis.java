// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

// Referenced classes of package org.apache.commons.codec.language:
//            SoundexUtils

public class Nysiis
    implements StringEncoder
{

    private static final char CHARS_A[] = {
        'A'
    };
    private static final char CHARS_AF[] = {
        'A', 'F'
    };
    private static final char CHARS_C[] = {
        'C'
    };
    private static final char CHARS_FF[] = {
        'F', 'F'
    };
    private static final char CHARS_G[] = {
        'G'
    };
    private static final char CHARS_N[] = {
        'N'
    };
    private static final char CHARS_NN[] = {
        'N', 'N'
    };
    private static final char CHARS_S[] = {
        'S'
    };
    private static final char CHARS_SSS[] = {
        'S', 'S', 'S'
    };
    private static final Pattern PAT_DT_ETC = Pattern.compile("(DT|RT|RD|NT|ND)$");
    private static final Pattern PAT_EE_IE = Pattern.compile("(EE|IE)$");
    private static final Pattern PAT_K = Pattern.compile("^K");
    private static final Pattern PAT_KN = Pattern.compile("^KN");
    private static final Pattern PAT_MAC = Pattern.compile("^MAC");
    private static final Pattern PAT_PH_PF = Pattern.compile("^(PH|PF)");
    private static final Pattern PAT_SCH = Pattern.compile("^SCH");
    private static final char SPACE = 32;
    private static final int TRUE_LENGTH = 6;
    private final boolean strict;

    public Nysiis()
    {
        this(true);
    }

    public Nysiis(boolean flag)
    {
        strict = flag;
    }

    private static boolean isVowel(char c)
    {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    private static char[] transcodeRemaining(char c, char c1, char c2, char c3)
    {
        if (c1 == 'E' && c2 == 'V')
        {
            return CHARS_AF;
        }
        if (isVowel(c1))
        {
            return CHARS_A;
        }
        if (c1 == 'Q')
        {
            return CHARS_G;
        }
        if (c1 == 'Z')
        {
            return CHARS_S;
        }
        if (c1 == 'M')
        {
            return CHARS_N;
        }
        if (c1 == 'K')
        {
            if (c2 == 'N')
            {
                return CHARS_NN;
            } else
            {
                return CHARS_C;
            }
        }
        if (c1 == 'S' && c2 == 'C' && c3 == 'H')
        {
            return CHARS_SSS;
        }
        if (c1 == 'P' && c2 == 'H')
        {
            return CHARS_FF;
        }
        if (c1 == 'H' && (!isVowel(c) || !isVowel(c2)))
        {
            return (new char[] {
                c
            });
        }
        if (c1 == 'W' && isVowel(c))
        {
            return (new char[] {
                c
            });
        } else
        {
            return (new char[] {
                c1
            });
        }
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof String))
        {
            throw new EncoderException("Parameter supplied to Nysiis encode is not of type java.lang.String");
        } else
        {
            return nysiis((String)obj);
        }
    }

    public String encode(String s)
    {
        return nysiis(s);
    }

    public boolean isStrict()
    {
        return strict;
    }

    public String nysiis(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = SoundexUtils.clean(s);
            if (s.length() == 0)
            {
                return s;
            }
            s = PAT_MAC.matcher(s).replaceFirst("MCC");
            s = PAT_KN.matcher(s).replaceFirst("NN");
            s = PAT_K.matcher(s).replaceFirst("C");
            s = PAT_PH_PF.matcher(s).replaceFirst("FF");
            s = PAT_SCH.matcher(s).replaceFirst("SSS");
            s = PAT_EE_IE.matcher(s).replaceFirst("Y");
            String s1 = PAT_DT_ETC.matcher(s).replaceFirst("D");
            s = new StringBuilder(s1.length());
            s.append(s1.charAt(0));
            char ac[] = s1.toCharArray();
            int j = ac.length;
            int i = 1;
            while (i < j) 
            {
                char c;
                char c1;
                char ac1[];
                if (i < j - 1)
                {
                    c = ac[i + 1];
                } else
                {
                    c = ' ';
                }
                if (i < j - 2)
                {
                    c1 = ac[i + 2];
                } else
                {
                    c1 = ' ';
                }
                ac1 = transcodeRemaining(ac[i - 1], ac[i], c, c1);
                System.arraycopy(ac1, 0, ac, i, ac1.length);
                if (ac[i] != ac[i - 1])
                {
                    s.append(ac[i]);
                }
                i++;
            }
            if (s.length() > 1)
            {
                char c3 = s.charAt(s.length() - 1);
                char c2 = c3;
                if (c3 == 'S')
                {
                    s.deleteCharAt(s.length() - 1);
                    c2 = s.charAt(s.length() - 1);
                }
                if (s.length() > 2 && s.charAt(s.length() - 2) == 'A' && c2 == 'Y')
                {
                    s.deleteCharAt(s.length() - 2);
                }
                if (c2 == 'A')
                {
                    s.deleteCharAt(s.length() - 1);
                }
            }
            ac = s.toString();
            s = ac;
            if (isStrict())
            {
                return ac.substring(0, Math.min(6, ac.length()));
            }
        }
        return s;
    }

}
