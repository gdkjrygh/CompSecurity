// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text.translate;

import java.lang.reflect.Array;

public class EntityArrays
{

    private static final String APOS_ESCAPE[][] = {
        {
            "'", "&apos;"
        }
    };
    private static final String APOS_UNESCAPE[][] = invert(APOS_ESCAPE);
    private static final String BASIC_ESCAPE[][];
    private static final String BASIC_UNESCAPE[][];
    private static final String HTML40_EXTENDED_ESCAPE[][];
    private static final String HTML40_EXTENDED_UNESCAPE[][];
    private static final String ISO8859_1_ESCAPE[][];
    private static final String ISO8859_1_UNESCAPE[][];
    private static final String JAVA_CTRL_CHARS_ESCAPE[][];
    private static final String JAVA_CTRL_CHARS_UNESCAPE[][];

    public EntityArrays()
    {
    }

    public static String[][] APOS_ESCAPE()
    {
        return (String[][])APOS_ESCAPE.clone();
    }

    public static String[][] APOS_UNESCAPE()
    {
        return (String[][])APOS_UNESCAPE.clone();
    }

    public static String[][] BASIC_ESCAPE()
    {
        return (String[][])BASIC_ESCAPE.clone();
    }

    public static String[][] BASIC_UNESCAPE()
    {
        return (String[][])BASIC_UNESCAPE.clone();
    }

    public static String[][] HTML40_EXTENDED_ESCAPE()
    {
        return (String[][])HTML40_EXTENDED_ESCAPE.clone();
    }

    public static String[][] HTML40_EXTENDED_UNESCAPE()
    {
        return (String[][])HTML40_EXTENDED_UNESCAPE.clone();
    }

    public static String[][] ISO8859_1_ESCAPE()
    {
        return (String[][])ISO8859_1_ESCAPE.clone();
    }

    public static String[][] ISO8859_1_UNESCAPE()
    {
        return (String[][])ISO8859_1_UNESCAPE.clone();
    }

    public static String[][] JAVA_CTRL_CHARS_ESCAPE()
    {
        return (String[][])JAVA_CTRL_CHARS_ESCAPE.clone();
    }

    public static String[][] JAVA_CTRL_CHARS_UNESCAPE()
    {
        return (String[][])JAVA_CTRL_CHARS_UNESCAPE.clone();
    }

    public static String[][] invert(String as[][])
    {
        String as1[][] = (String[][])Array.newInstance(java/lang/String, new int[] {
            as.length, 2
        });
        for (int i = 0; i < as.length; i++)
        {
            as1[i][0] = as[i][1];
            as1[i][1] = as[i][0];
        }

        return as1;
    }

    static 
    {
        String as[] = {
            "\347", "&ccedil;"
        };
        String as1[] = {
            "\354", "&igrave;"
        };
        ISO8859_1_ESCAPE = (new String[][] {
            new String[] {
                "\240", "&nbsp;"
            }, new String[] {
                "\241", "&iexcl;"
            }, new String[] {
                "\242", "&cent;"
            }, new String[] {
                "\243", "&pound;"
            }, new String[] {
                "\244", "&curren;"
            }, new String[] {
                "\245", "&yen;"
            }, new String[] {
                "\246", "&brvbar;"
            }, new String[] {
                "\247", "&sect;"
            }, new String[] {
                "\250", "&uml;"
            }, new String[] {
                "\251", "&copy;"
            }, new String[] {
                "\252", "&ordf;"
            }, new String[] {
                "\253", "&laquo;"
            }, new String[] {
                "\254", "&not;"
            }, new String[] {
                "\255", "&shy;"
            }, new String[] {
                "\256", "&reg;"
            }, new String[] {
                "\257", "&macr;"
            }, new String[] {
                "\260", "&deg;"
            }, new String[] {
                "\261", "&plusmn;"
            }, new String[] {
                "\262", "&sup2;"
            }, new String[] {
                "\263", "&sup3;"
            }, new String[] {
                "\264", "&acute;"
            }, new String[] {
                "\265", "&micro;"
            }, new String[] {
                "\266", "&para;"
            }, new String[] {
                "\267", "&middot;"
            }, new String[] {
                "\270", "&cedil;"
            }, new String[] {
                "\271", "&sup1;"
            }, new String[] {
                "\272", "&ordm;"
            }, new String[] {
                "\273", "&raquo;"
            }, new String[] {
                "\274", "&frac14;"
            }, new String[] {
                "\275", "&frac12;"
            }, new String[] {
                "\276", "&frac34;"
            }, new String[] {
                "\277", "&iquest;"
            }, new String[] {
                "\300", "&Agrave;"
            }, new String[] {
                "\301", "&Aacute;"
            }, new String[] {
                "\302", "&Acirc;"
            }, new String[] {
                "\303", "&Atilde;"
            }, new String[] {
                "\304", "&Auml;"
            }, new String[] {
                "\305", "&Aring;"
            }, new String[] {
                "\306", "&AElig;"
            }, new String[] {
                "\307", "&Ccedil;"
            }, new String[] {
                "\310", "&Egrave;"
            }, new String[] {
                "\311", "&Eacute;"
            }, new String[] {
                "\312", "&Ecirc;"
            }, new String[] {
                "\313", "&Euml;"
            }, new String[] {
                "\314", "&Igrave;"
            }, new String[] {
                "\315", "&Iacute;"
            }, new String[] {
                "\316", "&Icirc;"
            }, new String[] {
                "\317", "&Iuml;"
            }, new String[] {
                "\320", "&ETH;"
            }, new String[] {
                "\321", "&Ntilde;"
            }, new String[] {
                "\322", "&Ograve;"
            }, new String[] {
                "\323", "&Oacute;"
            }, new String[] {
                "\324", "&Ocirc;"
            }, new String[] {
                "\325", "&Otilde;"
            }, new String[] {
                "\326", "&Ouml;"
            }, new String[] {
                "\327", "&times;"
            }, new String[] {
                "\330", "&Oslash;"
            }, new String[] {
                "\331", "&Ugrave;"
            }, new String[] {
                "\332", "&Uacute;"
            }, new String[] {
                "\333", "&Ucirc;"
            }, new String[] {
                "\334", "&Uuml;"
            }, new String[] {
                "\335", "&Yacute;"
            }, new String[] {
                "\336", "&THORN;"
            }, new String[] {
                "\337", "&szlig;"
            }, new String[] {
                "\340", "&agrave;"
            }, new String[] {
                "\341", "&aacute;"
            }, new String[] {
                "\342", "&acirc;"
            }, new String[] {
                "\343", "&atilde;"
            }, new String[] {
                "\344", "&auml;"
            }, new String[] {
                "\345", "&aring;"
            }, new String[] {
                "\346", "&aelig;"
            }, as, new String[] {
                "\350", "&egrave;"
            }, new String[] {
                "\351", "&eacute;"
            }, new String[] {
                "\352", "&ecirc;"
            }, new String[] {
                "\353", "&euml;"
            }, as1, new String[] {
                "\355", "&iacute;"
            }, new String[] {
                "\356", "&icirc;"
            }, new String[] {
                "\357", "&iuml;"
            }, new String[] {
                "\360", "&eth;"
            }, new String[] {
                "\361", "&ntilde;"
            }, new String[] {
                "\362", "&ograve;"
            }, new String[] {
                "\363", "&oacute;"
            }, new String[] {
                "\364", "&ocirc;"
            }, new String[] {
                "\365", "&otilde;"
            }, new String[] {
                "\366", "&ouml;"
            }, new String[] {
                "\367", "&divide;"
            }, new String[] {
                "\370", "&oslash;"
            }, new String[] {
                "\371", "&ugrave;"
            }, new String[] {
                "\372", "&uacute;"
            }, new String[] {
                "\373", "&ucirc;"
            }, new String[] {
                "\374", "&uuml;"
            }, new String[] {
                "\375", "&yacute;"
            }, new String[] {
                "\376", "&thorn;"
            }, new String[] {
                "\377", "&yuml;"
            }
        });
        ISO8859_1_UNESCAPE = invert(ISO8859_1_ESCAPE);
        as = (new String[] {
            "\u0192", "&fnof;"
        });
        as1 = (new String[] {
            "\u0391", "&Alpha;"
        });
        String as2[] = {
            "\u0392", "&Beta;"
        };
        String as3[] = {
            "\u0394", "&Delta;"
        };
        String as4[] = {
            "\u0395", "&Epsilon;"
        };
        String as5[] = {
            "\u0396", "&Zeta;"
        };
        String as6[] = {
            "\u0397", "&Eta;"
        };
        String as7[] = {
            "\u0398", "&Theta;"
        };
        String as8[] = {
            "\u0399", "&Iota;"
        };
        String as9[] = {
            "\u039C", "&Mu;"
        };
        String as10[] = {
            "\u039D", "&Nu;"
        };
        String as11[] = {
            "\u039E", "&Xi;"
        };
        String as12[] = {
            "\u039F", "&Omicron;"
        };
        String as13[] = {
            "\u03A0", "&Pi;"
        };
        String as14[] = {
            "\u03A1", "&Rho;"
        };
        String as15[] = {
            "\u03A3", "&Sigma;"
        };
        String as16[] = {
            "\u03A5", "&Upsilon;"
        };
        String as17[] = {
            "\u03A7", "&Chi;"
        };
        String as18[] = {
            "\u03A8", "&Psi;"
        };
        String as19[] = {
            "\u03B1", "&alpha;"
        };
        String as20[] = {
            "\u03B2", "&beta;"
        };
        String as21[] = {
            "\u03B4", "&delta;"
        };
        String as22[] = {
            "\u03B5", "&epsilon;"
        };
        String as23[] = {
            "\u03B6", "&zeta;"
        };
        String as24[] = {
            "\u03B9", "&iota;"
        };
        String as25[] = {
            "\u03BA", "&kappa;"
        };
        String as26[] = {
            "\u03BB", "&lambda;"
        };
        String as27[] = {
            "\u03BC", "&mu;"
        };
        String as28[] = {
            "\u03BD", "&nu;"
        };
        String as29[] = {
            "\u03BE", "&xi;"
        };
        String as30[] = {
            "\u03BF", "&omicron;"
        };
        String as31[] = {
            "\u03C1", "&rho;"
        };
        String as32[] = {
            "\u03C3", "&sigma;"
        };
        String as33[] = {
            "\u03C4", "&tau;"
        };
        String as34[] = {
            "\u03C6", "&phi;"
        };
        String as35[] = {
            "\u03C7", "&chi;"
        };
        String as36[] = {
            "\u03D1", "&thetasym;"
        };
        String as37[] = {
            "\u03D2", "&upsih;"
        };
        String as38[] = {
            "\u03D6", "&piv;"
        };
        String as39[] = {
            "\u2022", "&bull;"
        };
        String as40[] = {
            "\u2026", "&hellip;"
        };
        String as41[] = {
            "\u2032", "&prime;"
        };
        String as42[] = {
            "\u2033", "&Prime;"
        };
        String as43[] = {
            "\u203E", "&oline;"
        };
        String as44[] = {
            "\u2044", "&frasl;"
        };
        String as45[] = {
            "\u2111", "&image;"
        };
        String as46[] = {
            "\u211C", "&real;"
        };
        String as47[] = {
            "\u2190", "&larr;"
        };
        String as48[] = {
            "\u2191", "&uarr;"
        };
        String as49[] = {
            "\u2192", "&rarr;"
        };
        String as50[] = {
            "\u2193", "&darr;"
        };
        String as51[] = {
            "\u21B5", "&crarr;"
        };
        String as52[] = {
            "\u21D0", "&lArr;"
        };
        String as53[] = {
            "\u21D1", "&uArr;"
        };
        String as54[] = {
            "\u21D3", "&dArr;"
        };
        String as55[] = {
            "\u21D4", "&hArr;"
        };
        String as56[] = {
            "\u2203", "&exist;"
        };
        String as57[] = {
            "\u2205", "&empty;"
        };
        String as58[] = {
            "\u2207", "&nabla;"
        };
        String as59[] = {
            "\u2208", "&isin;"
        };
        String as60[] = {
            "\u2209", "&notin;"
        };
        String as61[] = {
            "\u220B", "&ni;"
        };
        String as62[] = {
            "\u220F", "&prod;"
        };
        String as63[] = {
            "\u2211", "&sum;"
        };
        String as64[] = {
            "\u2212", "&minus;"
        };
        String as65[] = {
            "\u2217", "&lowast;"
        };
        String as66[] = {
            "\u221A", "&radic;"
        };
        String as67[] = {
            "\u221D", "&prop;"
        };
        String as68[] = {
            "\u221E", "&infin;"
        };
        String as69[] = {
            "\u2220", "&ang;"
        };
        String as70[] = {
            "\u2227", "&and;"
        };
        String as71[] = {
            "\u2228", "&or;"
        };
        String as72[] = {
            "\u2234", "&there4;"
        };
        String as73[] = {
            "\u2245", "&cong;"
        };
        String as74[] = {
            "\u2248", "&asymp;"
        };
        String as75[] = {
            "\u2260", "&ne;"
        };
        String as76[] = {
            "\u2265", "&ge;"
        };
        String as77[] = {
            "\u2282", "&sub;"
        };
        String as78[] = {
            "\u2283", "&sup;"
        };
        String as79[] = {
            "\u2287", "&supe;"
        };
        String as80[] = {
            "\u2295", "&oplus;"
        };
        String as81[] = {
            "\u2297", "&otimes;"
        };
        String as82[] = {
            "\u2308", "&lceil;"
        };
        String as83[] = {
            "\u2309", "&rceil;"
        };
        String as84[] = {
            "\u230A", "&lfloor;"
        };
        String as85[] = {
            "\u230B", "&rfloor;"
        };
        String as86[] = {
            "\u232A", "&rang;"
        };
        String as87[] = {
            "\u25CA", "&loz;"
        };
        String as88[] = {
            "\u2660", "&spades;"
        };
        String as89[] = {
            "\u2666", "&diams;"
        };
        String as90[] = {
            "\u0153", "&oelig;"
        };
        String as91[] = {
            "\u0160", "&Scaron;"
        };
        String as92[] = {
            "\u0161", "&scaron;"
        };
        String as93[] = {
            "\u0178", "&Yuml;"
        };
        String as94[] = {
            "\u02C6", "&circ;"
        };
        String as95[] = {
            "\u2003", "&emsp;"
        };
        String as96[] = {
            "\u2009", "&thinsp;"
        };
        String as97[] = {
            "\u200C", "&zwnj;"
        };
        String as98[] = {
            "\u200E", "&lrm;"
        };
        String as99[] = {
            "\u2013", "&ndash;"
        };
        String as100[] = {
            "\u2014", "&mdash;"
        };
        String as101[] = {
            "\u2018", "&lsquo;"
        };
        String as102[] = {
            "\u2019", "&rsquo;"
        };
        String as103[] = {
            "\u201A", "&sbquo;"
        };
        String as104[] = {
            "\u201E", "&bdquo;"
        };
        String as105[] = {
            "\u2020", "&dagger;"
        };
        String as106[] = {
            "\u2021", "&Dagger;"
        };
        String as107[] = {
            "\u2039", "&lsaquo;"
        };
        String as108[] = {
            "\u203A", "&rsaquo;"
        };
        HTML40_EXTENDED_ESCAPE = (new String[][] {
            as, as1, as2, new String[] {
                "\u0393", "&Gamma;"
            }, as3, as4, as5, as6, as7, as8, 
            new String[] {
                "\u039A", "&Kappa;"
            }, new String[] {
                "\u039B", "&Lambda;"
            }, as9, as10, as11, as12, as13, as14, as15, new String[] {
                "\u03A4", "&Tau;"
            }, 
            as16, new String[] {
                "\u03A6", "&Phi;"
            }, as17, as18, new String[] {
                "\u03A9", "&Omega;"
            }, as19, as20, new String[] {
                "\u03B3", "&gamma;"
            }, as21, as22, 
            as23, new String[] {
                "\u03B7", "&eta;"
            }, new String[] {
                "\u03B8", "&theta;"
            }, as24, as25, as26, as27, as28, as29, as30, 
            new String[] {
                "\u03C0", "&pi;"
            }, as31, new String[] {
                "\u03C2", "&sigmaf;"
            }, as32, as33, new String[] {
                "\u03C5", "&upsilon;"
            }, as34, as35, new String[] {
                "\u03C8", "&psi;"
            }, new String[] {
                "\u03C9", "&omega;"
            }, 
            as36, as37, as38, as39, as40, as41, as42, as43, as44, new String[] {
                "\u2118", "&weierp;"
            }, 
            as45, as46, new String[] {
                "\u2122", "&trade;"
            }, new String[] {
                "\u2135", "&alefsym;"
            }, as47, as48, as49, as50, new String[] {
                "\u2194", "&harr;"
            }, as51, 
            as52, as53, new String[] {
                "\u21D2", "&rArr;"
            }, as54, as55, new String[] {
                "\u2200", "&forall;"
            }, new String[] {
                "\u2202", "&part;"
            }, as56, as57, as58, 
            as59, as60, as61, as62, as63, as64, as65, as66, as67, as68, 
            as69, as70, as71, new String[] {
                "\u2229", "&cap;"
            }, new String[] {
                "\u222A", "&cup;"
            }, new String[] {
                "\u222B", "&int;"
            }, as72, new String[] {
                "\u223C", "&sim;"
            }, as73, as74, 
            as75, new String[] {
                "\u2261", "&equiv;"
            }, new String[] {
                "\u2264", "&le;"
            }, as76, as77, as78, new String[] {
                "\u2286", "&sube;"
            }, as79, as80, as81, 
            new String[] {
                "\u22A5", "&perp;"
            }, new String[] {
                "\u22C5", "&sdot;"
            }, as82, as83, as84, as85, new String[] {
                "\u2329", "&lang;"
            }, as86, as87, as88, 
            new String[] {
                "\u2663", "&clubs;"
            }, new String[] {
                "\u2665", "&hearts;"
            }, as89, new String[] {
                "\u0152", "&OElig;"
            }, as90, as91, as92, as93, as94, new String[] {
                "\u02DC", "&tilde;"
            }, 
            new String[] {
                "\u2002", "&ensp;"
            }, as95, as96, as97, new String[] {
                "\u200D", "&zwj;"
            }, as98, new String[] {
                "\u200F", "&rlm;"
            }, as99, as100, as101, 
            as102, as103, new String[] {
                "\u201C", "&ldquo;"
            }, new String[] {
                "\u201D", "&rdquo;"
            }, as104, as105, as106, new String[] {
                "\u2030", "&permil;"
            }, as107, as108, 
            new String[] {
                "\u20AC", "&euro;"
            }
        });
        HTML40_EXTENDED_UNESCAPE = invert(HTML40_EXTENDED_ESCAPE);
        as = (new String[] {
            "<", "&lt;"
        });
        BASIC_ESCAPE = (new String[][] {
            new String[] {
                "\"", "&quot;"
            }, new String[] {
                "&", "&amp;"
            }, as, new String[] {
                ">", "&gt;"
            }
        });
        BASIC_UNESCAPE = invert(BASIC_ESCAPE);
        as = (new String[] {
            "\b", "\\b"
        });
        as1 = (new String[] {
            "\r", "\\r"
        });
        JAVA_CTRL_CHARS_ESCAPE = (new String[][] {
            as, new String[] {
                "\n", "\\n"
            }, new String[] {
                "\t", "\\t"
            }, new String[] {
                "\f", "\\f"
            }, as1
        });
        JAVA_CTRL_CHARS_UNESCAPE = invert(JAVA_CTRL_CHARS_ESCAPE);
    }
}
