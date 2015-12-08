// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.EntityArrays;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;

// Referenced classes of package org.apache.commons.lang3:
//            StringUtils

public class StringEscapeUtils
{
    static class CsvEscaper extends CharSequenceTranslator
    {

        private static final char CSV_DELIMITER = 44;
        private static final char CSV_QUOTE = 34;
        private static final String CSV_QUOTE_STR = String.valueOf('"');
        private static final char CSV_SEARCH_CHARS[] = {
            ',', '"', '\r', '\n'
        };

        public int translate(CharSequence charsequence, int i, Writer writer)
            throws IOException
        {
            if (i != 0)
            {
                throw new IllegalStateException("CsvEscaper should never reach the [1] index");
            }
            if (StringUtils.containsNone(charsequence.toString(), CSV_SEARCH_CHARS))
            {
                writer.write(charsequence.toString());
            } else
            {
                writer.write(34);
                writer.write(StringUtils.replace(charsequence.toString(), CSV_QUOTE_STR, (new StringBuilder()).append(CSV_QUOTE_STR).append(CSV_QUOTE_STR).toString()));
                writer.write(34);
            }
            return charsequence.length();
        }


        CsvEscaper()
        {
        }
    }

    static class CsvUnescaper extends CharSequenceTranslator
    {

        private static final char CSV_DELIMITER = 44;
        private static final char CSV_QUOTE = 34;
        private static final String CSV_QUOTE_STR = String.valueOf('"');
        private static final char CSV_SEARCH_CHARS[] = {
            ',', '"', '\r', '\n'
        };

        public int translate(CharSequence charsequence, int i, Writer writer)
            throws IOException
        {
            if (i != 0)
            {
                throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
            }
            if (charsequence.charAt(0) != '"' || charsequence.charAt(charsequence.length() - 1) != '"')
            {
                writer.write(charsequence.toString());
                return charsequence.length();
            }
            String s = charsequence.subSequence(1, charsequence.length() - 1).toString();
            if (StringUtils.containsAny(s, CSV_SEARCH_CHARS))
            {
                writer.write(StringUtils.replace(s, (new StringBuilder()).append(CSV_QUOTE_STR).append(CSV_QUOTE_STR).toString(), CSV_QUOTE_STR));
            } else
            {
                writer.write(charsequence.toString());
            }
            return charsequence.length();
        }


        CsvUnescaper()
        {
        }
    }


    public static final CharSequenceTranslator ESCAPE_CSV = new CsvEscaper();
    public static final CharSequenceTranslator ESCAPE_ECMASCRIPT;
    public static final CharSequenceTranslator ESCAPE_HTML3 = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(EntityArrays.BASIC_ESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_ESCAPE())
    });
    public static final CharSequenceTranslator ESCAPE_HTML4 = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(EntityArrays.BASIC_ESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_ESCAPE()), new LookupTranslator(EntityArrays.HTML40_EXTENDED_ESCAPE())
    });
    public static final CharSequenceTranslator ESCAPE_JAVA;
    public static final CharSequenceTranslator ESCAPE_XML = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(EntityArrays.BASIC_ESCAPE()), new LookupTranslator(EntityArrays.APOS_ESCAPE())
    });
    public static final CharSequenceTranslator UNESCAPE_CSV = new CsvUnescaper();
    public static final CharSequenceTranslator UNESCAPE_ECMASCRIPT;
    public static final CharSequenceTranslator UNESCAPE_HTML3 = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(EntityArrays.BASIC_UNESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_UNESCAPE()), new NumericEntityUnescaper(new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[0])
    });
    public static final CharSequenceTranslator UNESCAPE_HTML4 = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(EntityArrays.BASIC_UNESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_UNESCAPE()), new LookupTranslator(EntityArrays.HTML40_EXTENDED_UNESCAPE()), new NumericEntityUnescaper(new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[0])
    });
    public static final CharSequenceTranslator UNESCAPE_JAVA;
    public static final CharSequenceTranslator UNESCAPE_XML = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(EntityArrays.BASIC_UNESCAPE()), new LookupTranslator(EntityArrays.APOS_UNESCAPE()), new NumericEntityUnescaper(new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[0])
    });

    public StringEscapeUtils()
    {
    }

    public static final String escapeCsv(String s)
    {
        return ESCAPE_CSV.translate(s);
    }

    public static final String escapeEcmaScript(String s)
    {
        return ESCAPE_ECMASCRIPT.translate(s);
    }

    public static final String escapeHtml3(String s)
    {
        return ESCAPE_HTML3.translate(s);
    }

    public static final String escapeHtml4(String s)
    {
        return ESCAPE_HTML4.translate(s);
    }

    public static final String escapeJava(String s)
    {
        return ESCAPE_JAVA.translate(s);
    }

    public static final String escapeXml(String s)
    {
        return ESCAPE_XML.translate(s);
    }

    public static final String unescapeCsv(String s)
    {
        return UNESCAPE_CSV.translate(s);
    }

    public static final String unescapeEcmaScript(String s)
    {
        return UNESCAPE_ECMASCRIPT.translate(s);
    }

    public static final String unescapeHtml3(String s)
    {
        return UNESCAPE_HTML3.translate(s);
    }

    public static final String unescapeHtml4(String s)
    {
        return UNESCAPE_HTML4.translate(s);
    }

    public static final String unescapeJava(String s)
    {
        return UNESCAPE_JAVA.translate(s);
    }

    public static final String unescapeXml(String s)
    {
        return UNESCAPE_XML.translate(s);
    }

    static 
    {
        String as[] = {
            "\\", "\\\\"
        };
        ESCAPE_JAVA = (new LookupTranslator(new String[][] {
            new String[] {
                "\"", "\\\""
            }, as
        })).with(new CharSequenceTranslator[] {
            new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_ESCAPE())
        }).with(new CharSequenceTranslator[] {
            UnicodeEscaper.outsideOf(32, 127)
        });
        as = (new String[] {
            "\\", "\\\\"
        });
        String as1[] = {
            "/", "\\/"
        };
        ESCAPE_ECMASCRIPT = new AggregateTranslator(new CharSequenceTranslator[] {
            new LookupTranslator(new String[][] {
                new String[] {
                    "'", "\\'"
                }, new String[] {
                    "\"", "\\\""
                }, as, as1
            }), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_ESCAPE()), UnicodeEscaper.outsideOf(32, 127)
        });
        UNESCAPE_JAVA = new AggregateTranslator(new CharSequenceTranslator[] {
            new OctalUnescaper(), new UnicodeUnescaper(), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_UNESCAPE()), new LookupTranslator(new String[][] {
                new String[] {
                    "\\\\", "\\"
                }, new String[] {
                    "\\\"", "\""
                }, new String[] {
                    "\\'", "'"
                }, new String[] {
                    "\\", ""
                }
            })
        });
        UNESCAPE_ECMASCRIPT = UNESCAPE_JAVA;
    }
}
