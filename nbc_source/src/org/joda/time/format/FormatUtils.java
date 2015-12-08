// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;

public class FormatUtils
{

    private static final double LOG_10 = Math.log(10D);

    private FormatUtils()
    {
    }

    public static void appendPaddedInteger(Appendable appendable, int i, int j)
        throws IOException
    {
        int k;
label0:
        {
label1:
            {
label2:
                {
                    k = i;
                    if (i < 0)
                    {
                        appendable.append('-');
                        k = j;
                        if (i == 0x80000000)
                        {
                            break label2;
                        }
                        k = -i;
                    }
                    if (k >= 10)
                    {
                        break label0;
                    }
                    for (; j > 1; j--)
                    {
                        appendable.append('0');
                    }

                    break label1;
                }
                for (; k > 10; k--)
                {
                    appendable.append('0');
                }

                appendable.append("2147483648");
                return;
            }
            appendable.append((char)(k + 48));
            return;
        }
        if (k < 100)
        {
            for (; j > 2; j--)
            {
                appendable.append('0');
            }

            i = (k + 1) * 0xcccccc >> 27;
            appendable.append((char)(i + 48));
            appendable.append((char)((k - (i << 3) - (i << 1)) + 48));
            return;
        }
        if (k >= 1000)
        {
            if (k < 10000)
            {
                i = 4;
            } else
            {
                i = (int)(Math.log(k) / LOG_10) + 1;
            }
        }
        for (i = 3; j > i; j--)
        {
            appendable.append('0');
        }

        appendable.append(Integer.toString(k));
    }

    public static void appendPaddedInteger(Appendable appendable, long l, int i)
        throws IOException
    {
        long l1;
label0:
        {
            int j;
label1:
            {
                j = (int)l;
                if ((long)j == l)
                {
                    appendPaddedInteger(appendable, j, i);
                    return;
                }
                if (i <= 19)
                {
                    appendable.append(Long.toString(l));
                    return;
                }
                l1 = l;
                if (l < 0L)
                {
                    appendable.append('-');
                    j = i;
                    if (l == 0x8000000000000000L)
                    {
                        break label1;
                    }
                    l1 = -l;
                }
                for (j = (int)(Math.log(l1) / LOG_10); i > j + 1; i--)
                {
                    appendable.append('0');
                }

                break label0;
            }
            for (; j > 19; j--)
            {
                appendable.append('0');
            }

            appendable.append("9223372036854775808");
            return;
        }
        appendable.append(Long.toString(l1));
    }

    public static void appendPaddedInteger(StringBuffer stringbuffer, int i, int j)
    {
        try
        {
            appendPaddedInteger(((Appendable) (stringbuffer)), i, j);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuffer stringbuffer)
        {
            return;
        }
    }

    public static void appendPaddedInteger(StringBuffer stringbuffer, long l, int i)
    {
        try
        {
            appendPaddedInteger(((Appendable) (stringbuffer)), l, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuffer stringbuffer)
        {
            return;
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, int i)
        throws IOException
    {
        int j;
label0:
        {
label1:
            {
                j = i;
                if (i < 0)
                {
                    appendable.append('-');
                    if (i == 0x80000000)
                    {
                        break label1;
                    }
                    j = -i;
                }
                if (j < 10)
                {
                    appendable.append((char)(j + 48));
                    return;
                }
                break label0;
            }
            appendable.append("2147483648");
            return;
        }
        if (j < 100)
        {
            i = (j + 1) * 0xcccccc >> 27;
            appendable.append((char)(i + 48));
            appendable.append((char)((j - (i << 3) - (i << 1)) + 48));
            return;
        } else
        {
            appendable.append(Integer.toString(j));
            return;
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, long l)
        throws IOException
    {
        int i = (int)l;
        if ((long)i == l)
        {
            appendUnpaddedInteger(appendable, i);
            return;
        } else
        {
            appendable.append(Long.toString(l));
            return;
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringbuffer, int i)
    {
        try
        {
            appendUnpaddedInteger(((Appendable) (stringbuffer)), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuffer stringbuffer)
        {
            return;
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringbuffer, long l)
    {
        try
        {
            appendUnpaddedInteger(((Appendable) (stringbuffer)), l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuffer stringbuffer)
        {
            return;
        }
    }

    public static int calculateDigitCount(long l)
    {
        if (l < 0L)
        {
            if (l != 0x8000000000000000L)
            {
                return calculateDigitCount(-l) + 1;
            } else
            {
                return 20;
            }
        }
        if (l < 10L)
        {
            return 1;
        }
        if (l < 100L)
        {
            return 2;
        }
        if (l < 1000L)
        {
            return 3;
        }
        if (l < 10000L)
        {
            return 4;
        } else
        {
            return (int)(Math.log(l) / LOG_10) + 1;
        }
    }

    static String createErrorMessage(String s, int i)
    {
        int j = i + 32;
        String s1;
        if (s.length() <= j + 3)
        {
            s1 = s;
        } else
        {
            s1 = s.substring(0, j).concat("...");
        }
        if (i <= 0)
        {
            return (new StringBuilder()).append("Invalid format: \"").append(s1).append('"').toString();
        }
        if (i >= s.length())
        {
            return (new StringBuilder()).append("Invalid format: \"").append(s1).append("\" is too short").toString();
        } else
        {
            return (new StringBuilder()).append("Invalid format: \"").append(s1).append("\" is malformed at \"").append(s1.substring(i)).append('"').toString();
        }
    }

    static int parseTwoDigits(CharSequence charsequence, int i)
    {
        int j = charsequence.charAt(i) - 48;
        return ((j << 1) + (j << 3) + charsequence.charAt(i + 1)) - 48;
    }

    public static void writePaddedInteger(Writer writer, int i, int j)
        throws IOException
    {
        int k;
label0:
        {
label1:
            {
label2:
                {
                    k = i;
                    if (i < 0)
                    {
                        writer.write(45);
                        k = j;
                        if (i == 0x80000000)
                        {
                            break label2;
                        }
                        k = -i;
                    }
                    if (k >= 10)
                    {
                        break label0;
                    }
                    for (; j > 1; j--)
                    {
                        writer.write(48);
                    }

                    break label1;
                }
                for (; k > 10; k--)
                {
                    writer.write(48);
                }

                writer.write("2147483648");
                return;
            }
            writer.write(k + 48);
            return;
        }
        if (k < 100)
        {
            for (; j > 2; j--)
            {
                writer.write(48);
            }

            i = (k + 1) * 0xcccccc >> 27;
            writer.write(i + 48);
            writer.write((k - (i << 3) - (i << 1)) + 48);
            return;
        }
        if (k >= 1000)
        {
            if (k < 10000)
            {
                i = 4;
            } else
            {
                i = (int)(Math.log(k) / LOG_10) + 1;
            }
        }
        for (i = 3; j > i; j--)
        {
            writer.write(48);
        }

        writer.write(Integer.toString(k));
    }

    public static void writePaddedInteger(Writer writer, long l, int i)
        throws IOException
    {
        long l1;
label0:
        {
            int j;
label1:
            {
                j = (int)l;
                if ((long)j == l)
                {
                    writePaddedInteger(writer, j, i);
                    return;
                }
                if (i <= 19)
                {
                    writer.write(Long.toString(l));
                    return;
                }
                l1 = l;
                if (l < 0L)
                {
                    writer.write(45);
                    j = i;
                    if (l == 0x8000000000000000L)
                    {
                        break label1;
                    }
                    l1 = -l;
                }
                for (j = (int)(Math.log(l1) / LOG_10); i > j + 1; i--)
                {
                    writer.write(48);
                }

                break label0;
            }
            for (; j > 19; j--)
            {
                writer.write(48);
            }

            writer.write("9223372036854775808");
            return;
        }
        writer.write(Long.toString(l1));
    }

    public static void writeUnpaddedInteger(Writer writer, int i)
        throws IOException
    {
        int j;
label0:
        {
label1:
            {
                j = i;
                if (i < 0)
                {
                    writer.write(45);
                    if (i == 0x80000000)
                    {
                        break label1;
                    }
                    j = -i;
                }
                if (j < 10)
                {
                    writer.write(j + 48);
                    return;
                }
                break label0;
            }
            writer.write("2147483648");
            return;
        }
        if (j < 100)
        {
            i = (j + 1) * 0xcccccc >> 27;
            writer.write(i + 48);
            writer.write((j - (i << 3) - (i << 1)) + 48);
            return;
        } else
        {
            writer.write(Integer.toString(j));
            return;
        }
    }

    public static void writeUnpaddedInteger(Writer writer, long l)
        throws IOException
    {
        int i = (int)l;
        if ((long)i == l)
        {
            writeUnpaddedInteger(writer, i);
            return;
        } else
        {
            writer.write(Long.toString(l));
            return;
        }
    }

}
