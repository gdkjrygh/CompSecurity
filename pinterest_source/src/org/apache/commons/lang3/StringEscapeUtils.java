// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.EntityArrays;
import org.apache.commons.lang3.text.translate.JavaUnicodeEscaper;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover;

public class StringEscapeUtils
{

    public static final CharSequenceTranslator ESCAPE_CSV = new CsvEscaper();
    public static final CharSequenceTranslator ESCAPE_ECMASCRIPT = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(new String[][] {
            new String[] {
                "'", "\\'"
            }, new String[] {
                "\"", "\\\""
            }, new String[] {
                "\\", "\\\\"
            }, new String[] {
                "/", "\\/"
            }
        }), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_ESCAPE()), JavaUnicodeEscaper.outsideOf(32, 127)
    });
    public static final CharSequenceTranslator ESCAPE_HTML3 = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(EntityArrays.BASIC_ESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_ESCAPE())
    });
    public static final CharSequenceTranslator ESCAPE_HTML4 = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(EntityArrays.BASIC_ESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_ESCAPE()), new LookupTranslator(EntityArrays.HTML40_EXTENDED_ESCAPE())
    });
    public static final CharSequenceTranslator ESCAPE_JAVA = (new LookupTranslator(new String[][] {
        new String[] {
            "\"", "\\\""
        }, new String[] {
            "\\", "\\\\"
        }
    })).with(new CharSequenceTranslator[] {
        new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_ESCAPE())
    }).with(new CharSequenceTranslator[] {
        JavaUnicodeEscaper.outsideOf(32, 127)
    });
    public static final CharSequenceTranslator ESCAPE_JSON = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(new String[][] {
            new String[] {
                "\"", "\\\""
            }, new String[] {
                "\\", "\\\\"
            }, new String[] {
                "/", "\\/"
            }
        }), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_ESCAPE()), JavaUnicodeEscaper.outsideOf(32, 127)
    });
    public static final CharSequenceTranslator ESCAPE_XML = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(EntityArrays.BASIC_ESCAPE()), new LookupTranslator(EntityArrays.APOS_ESCAPE())
    });
    public static final CharSequenceTranslator ESCAPE_XML10;
    public static final CharSequenceTranslator ESCAPE_XML11;
    public static final CharSequenceTranslator UNESCAPE_CSV = new CsvUnescaper();
    public static final CharSequenceTranslator UNESCAPE_ECMASCRIPT;
    public static final CharSequenceTranslator UNESCAPE_HTML3 = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(EntityArrays.BASIC_UNESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_UNESCAPE()), new NumericEntityUnescaper(new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[0])
    });
    public static final CharSequenceTranslator UNESCAPE_HTML4 = new AggregateTranslator(new CharSequenceTranslator[] {
        new LookupTranslator(EntityArrays.BASIC_UNESCAPE()), new LookupTranslator(EntityArrays.ISO8859_1_UNESCAPE()), new LookupTranslator(EntityArrays.HTML40_EXTENDED_UNESCAPE()), new NumericEntityUnescaper(new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[0])
    });
    public static final CharSequenceTranslator UNESCAPE_JAVA;
    public static final CharSequenceTranslator UNESCAPE_JSON;
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

    public static final String escapeJson(String s)
    {
        return ESCAPE_JSON.translate(s);
    }

    public static final String escapeXml(String s)
    {
        return ESCAPE_XML.translate(s);
    }

    public static String escapeXml10(String s)
    {
        return ESCAPE_XML10.translate(s);
    }

    public static String escapeXml11(String s)
    {
        return ESCAPE_XML11.translate(s);
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

    public static final String unescapeJson(String s)
    {
        return UNESCAPE_JSON.translate(s);
    }

    public static final String unescapeXml(String s)
    {
        return UNESCAPE_XML.translate(s);
    }

    static 
    {
        Object obj = new LookupTranslator(EntityArrays.BASIC_ESCAPE());
        LookupTranslator lookuptranslator = new LookupTranslator(EntityArrays.APOS_ESCAPE());
        String as[] = {
            "\007", ""
        };
        ESCAPE_XML10 = new AggregateTranslator(new CharSequenceTranslator[] {
            obj, lookuptranslator, new LookupTranslator(new String[][] {
                new String[] {
                    "\0", ""
                }, new String[] {
                    "\001", ""
                }, new String[] {
                    "\002", ""
                }, new String[] {
                    "\003", ""
                }, new String[] {
                    "\004", ""
                }, new String[] {
                    "\005", ""
                }, new String[] {
                    "\006", ""
                }, as, new String[] {
                    "\b", ""
                }, new String[] {
                    "\013", ""
                }, new String[] {
                    "\f", ""
                }, new String[] {
                    "\016", ""
                }, new String[] {
                    "\017", ""
                }, new String[] {
                    "\020", ""
                }, new String[] {
                    "\021", ""
                }, new String[] {
                    "\022", ""
                }, new String[] {
                    "\023", ""
                }, new String[] {
                    "\024", ""
                }, new String[] {
                    "\025", ""
                }, new String[] {
                    "\026", ""
                }, new String[] {
                    "\027", ""
                }, new String[] {
                    "\030", ""
                }, new String[] {
                    "\031", ""
                }, new String[] {
                    "\032", ""
                }, new String[] {
                    "\033", ""
                }, new String[] {
                    "\034", ""
                }, new String[] {
                    "\035", ""
                }, new String[] {
                    "\036", ""
                }, new String[] {
                    "\037", ""
                }, new String[] {
                    "\uFFFE", ""
                }, new String[] {
                    "\uFFFF", ""
                }
            }), NumericEntityEscaper.between(127, 132), NumericEntityEscaper.between(134, 159), new UnicodeUnpairedSurrogateRemover()
        });
        obj = new LookupTranslator(EntityArrays.BASIC_ESCAPE());
        lookuptranslator = new LookupTranslator(EntityArrays.APOS_ESCAPE());
        as = (new String[] {
            "\f", "&#12;"
        });
        ESCAPE_XML11 = new AggregateTranslator(new CharSequenceTranslator[] {
            obj, lookuptranslator, new LookupTranslator(new String[][] {
                new String[] {
                    "\0", ""
                }, new String[] {
                    "\013", "&#11;"
                }, as, new String[] {
                    "\uFFFE", ""
                }, new String[] {
                    "\uFFFF", ""
                }
            }), NumericEntityEscaper.between(1, 8), NumericEntityEscaper.between(14, 31), NumericEntityEscaper.between(127, 132), NumericEntityEscaper.between(134, 159), new UnicodeUnpairedSurrogateRemover()
        });
        obj = new AggregateTranslator(new CharSequenceTranslator[] {
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
        UNESCAPE_JAVA = ((CharSequenceTranslator) (obj));
        UNESCAPE_ECMASCRIPT = ((CharSequenceTranslator) (obj));
        UNESCAPE_JSON = UNESCAPE_JAVA;
    }

    /* member class not found */
    class CsvEscaper {}


    /* member class not found */
    class CsvUnescaper {}

}
