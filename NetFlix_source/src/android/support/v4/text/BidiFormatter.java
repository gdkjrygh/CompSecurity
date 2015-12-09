// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;

import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//            TextDirectionHeuristicsCompat, TextUtilsCompat, TextDirectionHeuristicCompat

public final class BidiFormatter
{
    public static final class Builder
    {

        private int mFlags;
        private boolean mIsRtlContext;
        private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

        private static BidiFormatter getDefaultInstanceFromContext(boolean flag)
        {
            if (flag)
            {
                return BidiFormatter.DEFAULT_RTL_INSTANCE;
            } else
            {
                return BidiFormatter.DEFAULT_LTR_INSTANCE;
            }
        }

        private void initialize(boolean flag)
        {
            mIsRtlContext = flag;
            mTextDirectionHeuristicCompat = BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
            mFlags = 2;
        }

        public BidiFormatter build()
        {
            if (mFlags == 2 && mTextDirectionHeuristicCompat == BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC)
            {
                return getDefaultInstanceFromContext(mIsRtlContext);
            } else
            {
                return new BidiFormatter(mIsRtlContext, mFlags, mTextDirectionHeuristicCompat);
            }
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textdirectionheuristiccompat)
        {
            mTextDirectionHeuristicCompat = textdirectionheuristiccompat;
            return this;
        }

        public Builder stereoReset(boolean flag)
        {
            if (flag)
            {
                mFlags = mFlags | 2;
                return this;
            } else
            {
                mFlags = mFlags & -3;
                return this;
            }
        }

        public Builder()
        {
            initialize(BidiFormatter.isRtlLocale(Locale.getDefault()));
        }

        public Builder(Locale locale)
        {
            initialize(BidiFormatter.isRtlLocale(locale));
        }

        public Builder(boolean flag)
        {
            initialize(flag);
        }
    }

    private static class DirectionalityEstimator
    {

        private static final byte DIR_TYPE_CACHE[];
        private static final int DIR_TYPE_CACHE_SIZE = 1792;
        private int charIndex;
        private final boolean isHtml;
        private char lastChar;
        private final int length;
        private final String text;

        private static byte getCachedDirectionality(char c)
        {
            if (c < '\u0700')
            {
                return DIR_TYPE_CACHE[c];
            } else
            {
                return Character.getDirectionality(c);
            }
        }

        private byte skipEntityBackward()
        {
            int i = charIndex;
            do
            {
                if (charIndex <= 0)
                {
                    break;
                }
                String s = text;
                int j = charIndex - 1;
                charIndex = j;
                lastChar = s.charAt(j);
                if (lastChar == '&')
                {
                    return 12;
                }
            } while (lastChar != ';');
            charIndex = i;
            lastChar = ';';
            return 13;
        }

        private byte skipEntityForward()
        {
            char c;
            do
            {
                if (charIndex >= length)
                {
                    break;
                }
                String s = text;
                int i = charIndex;
                charIndex = i + 1;
                c = s.charAt(i);
                lastChar = c;
            } while (c != ';');
            return 12;
        }

        private byte skipTagBackward()
        {
            int i = charIndex;
            do
            {
                do
                {
                    if (charIndex > 0)
                    {
                        String s = text;
                        int j = charIndex - 1;
                        charIndex = j;
                        lastChar = s.charAt(j);
                        if (lastChar == '<')
                        {
                            return 12;
                        }
                        if (lastChar != '>')
                        {
                            continue;
                        }
                    }
                    charIndex = i;
                    lastChar = '>';
                    return 13;
                } while (lastChar != '"' && lastChar != '\'');
                char c1 = lastChar;
                char c;
                do
                {
                    if (charIndex <= 0)
                    {
                        break;
                    }
                    String s1 = text;
                    int k = charIndex - 1;
                    charIndex = k;
                    c = s1.charAt(k);
                    lastChar = c;
                } while (c != c1);
            } while (true);
        }

        private byte skipTagForward()
        {
            int i = charIndex;
            while (charIndex < length) 
            {
                String s = text;
                int j = charIndex;
                charIndex = j + 1;
                lastChar = s.charAt(j);
                if (lastChar == '>')
                {
                    return 12;
                }
                if (lastChar != '"' && lastChar != '\'')
                {
                    break;
                }
                j = lastChar;
                char c;
                do
                {
                    if (charIndex >= length)
                    {
                        break;
                    }
                    String s1 = text;
                    int k = charIndex;
                    charIndex = k + 1;
                    c = s1.charAt(k);
                    lastChar = c;
                } while (c != j);
            }
            charIndex = i;
            lastChar = '<';
            return 13;
        }

        byte dirTypeBackward()
        {
            lastChar = text.charAt(charIndex - 1);
            byte byte0;
            if (Character.isLowSurrogate(lastChar))
            {
                int i = Character.codePointBefore(text, charIndex);
                charIndex = charIndex - Character.charCount(i);
                byte0 = Character.getDirectionality(i);
            } else
            {
                charIndex = charIndex - 1;
                byte byte1 = getCachedDirectionality(lastChar);
                byte0 = byte1;
                if (isHtml)
                {
                    if (lastChar == '>')
                    {
                        return skipTagBackward();
                    }
                    byte0 = byte1;
                    if (lastChar == ';')
                    {
                        return skipEntityBackward();
                    }
                }
            }
            return byte0;
        }

        byte dirTypeForward()
        {
            lastChar = text.charAt(charIndex);
            byte byte0;
            if (Character.isHighSurrogate(lastChar))
            {
                int i = Character.codePointAt(text, charIndex);
                charIndex = charIndex + Character.charCount(i);
                byte0 = Character.getDirectionality(i);
            } else
            {
                charIndex = charIndex + 1;
                byte byte1 = getCachedDirectionality(lastChar);
                byte0 = byte1;
                if (isHtml)
                {
                    if (lastChar == '<')
                    {
                        return skipTagForward();
                    }
                    byte0 = byte1;
                    if (lastChar == '&')
                    {
                        return skipEntityForward();
                    }
                }
            }
            return byte0;
        }

        int getEntryDir()
        {
            int i;
            byte byte0;
            int j;
            charIndex = 0;
            i = 0;
            byte0 = 0;
            j = 0;
_L6:
            if (charIndex >= length || j != 0) goto _L2; else goto _L1
_L1:
            dirTypeForward();
            JVM INSTR tableswitch 0 18: default 120
        //                       0 152
        //                       1 167
        //                       2 167
        //                       3 120
        //                       4 120
        //                       5 120
        //                       6 120
        //                       7 120
        //                       8 120
        //                       9 11
        //                       10 120
        //                       11 120
        //                       12 120
        //                       13 120
        //                       14 125
        //                       15 125
        //                       16 134
        //                       17 134
        //                       18 143;
               goto _L3 _L4 _L5 _L5 _L3 _L3 _L3 _L3 _L3 _L3 _L6 _L3 _L3 _L3 _L3 _L7 _L7 _L8 _L8 _L9
_L3:
            j = i;
              goto _L6
_L7:
            i++;
            byte0 = -1;
              goto _L6
_L8:
            i++;
            byte0 = 1;
              goto _L6
_L9:
            i--;
            byte0 = 0;
              goto _L6
_L4:
            if (i != 0) goto _L11; else goto _L10
_L10:
            byte byte1 = -1;
_L12:
            return byte1;
_L11:
            j = i;
              goto _L6
_L5:
            if (i == 0)
            {
                return 1;
            }
            j = i;
              goto _L6
_L2:
            if (j == 0)
            {
                return 0;
            }
            byte1 = byte0;
            if (byte0 == 0)
            {
                do
                {
                    if (charIndex > 0)
                    {
                        switch (dirTypeBackward())
                        {
                        case 14: // '\016'
                        case 15: // '\017'
                            if (j == i)
                            {
                                return -1;
                            }
                            i--;
                            break;

                        case 16: // '\020'
                        case 17: // '\021'
                            if (j == i)
                            {
                                return 1;
                            }
                            i--;
                            break;

                        case 18: // '\022'
                            i++;
                            break;
                        }
                    } else
                    {
                        return 0;
                    }
                } while (true);
            }
              goto _L12
        }

        int getExitDir()
        {
            int i;
            int j;
            charIndex = length;
            i = 0;
            j = 0;
_L12:
            if (charIndex <= 0)
            {
                break; /* Loop/switch isn't completed */
            }
            dirTypeBackward();
            JVM INSTR tableswitch 0 18: default 112
        //                       0 121
        //                       1 148
        //                       2 148
        //                       3 112
        //                       4 112
        //                       5 112
        //                       6 112
        //                       7 112
        //                       8 112
        //                       9 12
        //                       10 112
        //                       11 112
        //                       12 112
        //                       13 112
        //                       14 136
        //                       15 136
        //                       16 163
        //                       17 163
        //                       18 177;
               goto _L1 _L2 _L3 _L3 _L1 _L1 _L1 _L1 _L1 _L1 _L4 _L1 _L1 _L1 _L1 _L5 _L5 _L6 _L6 _L7
_L4:
            continue; /* Loop/switch isn't completed */
_L1:
            if (j == 0)
            {
                j = i;
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (i != 0) goto _L9; else goto _L8
_L8:
            return -1;
_L9:
            if (j == 0)
            {
                j = i;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            if (j == i) goto _L8; else goto _L10
_L10:
            i--;
            continue; /* Loop/switch isn't completed */
_L3:
            if (i == 0)
            {
                return 1;
            }
            if (j == 0)
            {
                j = i;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (j == i)
            {
                return 1;
            }
            i--;
            continue; /* Loop/switch isn't completed */
_L7:
            i++;
            if (true) goto _L12; else goto _L11
_L11:
            return 0;
        }

        static 
        {
            DIR_TYPE_CACHE = new byte[1792];
            for (int i = 0; i < 1792; i++)
            {
                DIR_TYPE_CACHE[i] = Character.getDirectionality(i);
            }

        }

        DirectionalityEstimator(String s, boolean flag)
        {
            text = s;
            isHtml = flag;
            length = s.length();
        }
    }


    private static final int DEFAULT_FLAGS = 2;
    private static final BidiFormatter DEFAULT_LTR_INSTANCE;
    private static final BidiFormatter DEFAULT_RTL_INSTANCE;
    private static TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC;
    private static final int DIR_LTR = -1;
    private static final int DIR_RTL = 1;
    private static final int DIR_UNKNOWN = 0;
    private static final String EMPTY_STRING = "";
    private static final int FLAG_STEREO_RESET = 2;
    private static final char LRE = 8234;
    private static final char LRM = 8206;
    private static final String LRM_STRING = Character.toString('\u200E');
    private static final char PDF = 8236;
    private static final char RLE = 8235;
    private static final char RLM = 8207;
    private static final String RLM_STRING = Character.toString('\u200F');
    private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;

    private BidiFormatter(boolean flag, int i, TextDirectionHeuristicCompat textdirectionheuristiccompat)
    {
        mIsRtlContext = flag;
        mFlags = i;
        mDefaultTextDirectionHeuristicCompat = textdirectionheuristiccompat;
    }


    private static int getEntryDir(String s)
    {
        return (new DirectionalityEstimator(s, false)).getEntryDir();
    }

    private static int getExitDir(String s)
    {
        return (new DirectionalityEstimator(s, false)).getExitDir();
    }

    public static BidiFormatter getInstance()
    {
        return (new Builder()).build();
    }

    public static BidiFormatter getInstance(Locale locale)
    {
        return (new Builder(locale)).build();
    }

    public static BidiFormatter getInstance(boolean flag)
    {
        return (new Builder(flag)).build();
    }

    private static boolean isRtlLocale(Locale locale)
    {
        return TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
    }

    private String markAfter(String s, TextDirectionHeuristicCompat textdirectionheuristiccompat)
    {
        boolean flag = textdirectionheuristiccompat.isRtl(s, 0, s.length());
        if (!mIsRtlContext && (flag || getExitDir(s) == 1))
        {
            return LRM_STRING;
        }
        if (mIsRtlContext && (!flag || getExitDir(s) == -1))
        {
            return RLM_STRING;
        } else
        {
            return "";
        }
    }

    private String markBefore(String s, TextDirectionHeuristicCompat textdirectionheuristiccompat)
    {
        boolean flag = textdirectionheuristiccompat.isRtl(s, 0, s.length());
        if (!mIsRtlContext && (flag || getEntryDir(s) == 1))
        {
            return LRM_STRING;
        }
        if (mIsRtlContext && (!flag || getEntryDir(s) == -1))
        {
            return RLM_STRING;
        } else
        {
            return "";
        }
    }

    public boolean getStereoReset()
    {
        return (mFlags & 2) != 0;
    }

    public boolean isRtl(String s)
    {
        return mDefaultTextDirectionHeuristicCompat.isRtl(s, 0, s.length());
    }

    public boolean isRtlContext()
    {
        return mIsRtlContext;
    }

    public String unicodeWrap(String s)
    {
        return unicodeWrap(s, mDefaultTextDirectionHeuristicCompat, true);
    }

    public String unicodeWrap(String s, TextDirectionHeuristicCompat textdirectionheuristiccompat)
    {
        return unicodeWrap(s, textdirectionheuristiccompat, true);
    }

    public String unicodeWrap(String s, TextDirectionHeuristicCompat textdirectionheuristiccompat, boolean flag)
    {
        boolean flag1 = textdirectionheuristiccompat.isRtl(s, 0, s.length());
        StringBuilder stringbuilder = new StringBuilder();
        if (getStereoReset() && flag)
        {
            if (flag1)
            {
                textdirectionheuristiccompat = TextDirectionHeuristicsCompat.RTL;
            } else
            {
                textdirectionheuristiccompat = TextDirectionHeuristicsCompat.LTR;
            }
            stringbuilder.append(markBefore(s, textdirectionheuristiccompat));
        }
        if (flag1 != mIsRtlContext)
        {
            char c;
            if (flag1)
            {
                c = '\u202B';
            } else
            {
                c = '\u202A';
            }
            stringbuilder.append(c);
            stringbuilder.append(s);
            stringbuilder.append('\u202C');
        } else
        {
            stringbuilder.append(s);
        }
        if (flag)
        {
            if (flag1)
            {
                textdirectionheuristiccompat = TextDirectionHeuristicsCompat.RTL;
            } else
            {
                textdirectionheuristiccompat = TextDirectionHeuristicsCompat.LTR;
            }
            stringbuilder.append(markAfter(s, textdirectionheuristiccompat));
        }
        return stringbuilder.toString();
    }

    public String unicodeWrap(String s, boolean flag)
    {
        return unicodeWrap(s, mDefaultTextDirectionHeuristicCompat, flag);
    }

    static 
    {
        DEFAULT_TEXT_DIRECTION_HEURISTIC = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
        DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
    }




}
