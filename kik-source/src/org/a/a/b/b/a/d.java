// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b.b.a;

import java.lang.reflect.Array;

public final class d
{

    private static final String a[][];
    private static final String b[][];
    private static final String c[][];
    private static final String d[][];
    private static final String e[][];
    private static final String f[][];
    private static final String g[][];
    private static final String h[][];
    private static final String i[][];
    private static final String j[][];

    public static String[][] a()
    {
        return (String[][])a.clone();
    }

    private static String[][] a(String as[][])
    {
        String as1[][] = (String[][])Array.newInstance(java/lang/String, new int[] {
            as.length, 2
        });
        for (int k = 0; k < as.length; k++)
        {
            as1[k][0] = as[k][1];
            as1[k][1] = as[k][0];
        }

        return as1;
    }

    public static String[][] b()
    {
        return (String[][])b.clone();
    }

    public static String[][] c()
    {
        return (String[][])c.clone();
    }

    public static String[][] d()
    {
        return (String[][])d.clone();
    }

    public static String[][] e()
    {
        return (String[][])e.clone();
    }

    public static String[][] f()
    {
        return (String[][])f.clone();
    }

    public static String[][] g()
    {
        return (String[][])g.clone();
    }

    public static String[][] h()
    {
        return (String[][])h.clone();
    }

    public static String[][] i()
    {
        return (String[][])i.clone();
    }

    public static String[][] j()
    {
        return (String[][])j.clone();
    }

    static 
    {
        String as[][] = new String[96][];
        as[0] = (new String[] {
            "\240", "&nbsp;"
        });
        as[1] = (new String[] {
            "\241", "&iexcl;"
        });
        as[2] = (new String[] {
            "\242", "&cent;"
        });
        as[3] = (new String[] {
            "\243", "&pound;"
        });
        as[4] = (new String[] {
            "\244", "&curren;"
        });
        as[5] = (new String[] {
            "\245", "&yen;"
        });
        as[6] = (new String[] {
            "\246", "&brvbar;"
        });
        as[7] = (new String[] {
            "\247", "&sect;"
        });
        as[8] = (new String[] {
            "\250", "&uml;"
        });
        as[9] = (new String[] {
            "\251", "&copy;"
        });
        as[10] = (new String[] {
            "\252", "&ordf;"
        });
        as[11] = (new String[] {
            "\253", "&laquo;"
        });
        as[12] = (new String[] {
            "\254", "&not;"
        });
        as[13] = (new String[] {
            "\255", "&shy;"
        });
        as[14] = (new String[] {
            "\256", "&reg;"
        });
        as[15] = (new String[] {
            "\257", "&macr;"
        });
        as[16] = (new String[] {
            "\260", "&deg;"
        });
        as[17] = (new String[] {
            "\261", "&plusmn;"
        });
        as[18] = (new String[] {
            "\262", "&sup2;"
        });
        as[19] = (new String[] {
            "\263", "&sup3;"
        });
        as[20] = (new String[] {
            "\264", "&acute;"
        });
        as[21] = (new String[] {
            "\265", "&micro;"
        });
        as[22] = (new String[] {
            "\266", "&para;"
        });
        as[23] = (new String[] {
            "\267", "&middot;"
        });
        as[24] = (new String[] {
            "\270", "&cedil;"
        });
        as[25] = (new String[] {
            "\271", "&sup1;"
        });
        as[26] = (new String[] {
            "\272", "&ordm;"
        });
        as[27] = (new String[] {
            "\273", "&raquo;"
        });
        as[28] = (new String[] {
            "\274", "&frac14;"
        });
        as[29] = (new String[] {
            "\275", "&frac12;"
        });
        as[30] = (new String[] {
            "\276", "&frac34;"
        });
        as[31] = (new String[] {
            "\277", "&iquest;"
        });
        as[32] = (new String[] {
            "\300", "&Agrave;"
        });
        as[33] = (new String[] {
            "\301", "&Aacute;"
        });
        as[34] = (new String[] {
            "\302", "&Acirc;"
        });
        as[35] = (new String[] {
            "\303", "&Atilde;"
        });
        as[36] = (new String[] {
            "\304", "&Auml;"
        });
        as[37] = (new String[] {
            "\305", "&Aring;"
        });
        as[38] = (new String[] {
            "\306", "&AElig;"
        });
        as[39] = (new String[] {
            "\307", "&Ccedil;"
        });
        as[40] = (new String[] {
            "\310", "&Egrave;"
        });
        as[41] = (new String[] {
            "\311", "&Eacute;"
        });
        as[42] = (new String[] {
            "\312", "&Ecirc;"
        });
        as[43] = (new String[] {
            "\313", "&Euml;"
        });
        as[44] = (new String[] {
            "\314", "&Igrave;"
        });
        as[45] = (new String[] {
            "\315", "&Iacute;"
        });
        as[46] = (new String[] {
            "\316", "&Icirc;"
        });
        as[47] = (new String[] {
            "\317", "&Iuml;"
        });
        as[48] = (new String[] {
            "\320", "&ETH;"
        });
        as[49] = (new String[] {
            "\321", "&Ntilde;"
        });
        as[50] = (new String[] {
            "\322", "&Ograve;"
        });
        as[51] = (new String[] {
            "\323", "&Oacute;"
        });
        as[52] = (new String[] {
            "\324", "&Ocirc;"
        });
        as[53] = (new String[] {
            "\325", "&Otilde;"
        });
        as[54] = (new String[] {
            "\326", "&Ouml;"
        });
        as[55] = (new String[] {
            "\327", "&times;"
        });
        as[56] = (new String[] {
            "\330", "&Oslash;"
        });
        as[57] = (new String[] {
            "\331", "&Ugrave;"
        });
        as[58] = (new String[] {
            "\332", "&Uacute;"
        });
        as[59] = (new String[] {
            "\333", "&Ucirc;"
        });
        as[60] = (new String[] {
            "\334", "&Uuml;"
        });
        as[61] = (new String[] {
            "\335", "&Yacute;"
        });
        as[62] = (new String[] {
            "\336", "&THORN;"
        });
        as[63] = (new String[] {
            "\337", "&szlig;"
        });
        as[64] = (new String[] {
            "\340", "&agrave;"
        });
        as[65] = (new String[] {
            "\341", "&aacute;"
        });
        as[66] = (new String[] {
            "\342", "&acirc;"
        });
        as[67] = (new String[] {
            "\343", "&atilde;"
        });
        as[68] = (new String[] {
            "\344", "&auml;"
        });
        as[69] = (new String[] {
            "\345", "&aring;"
        });
        as[70] = (new String[] {
            "\346", "&aelig;"
        });
        as[71] = (new String[] {
            "\347", "&ccedil;"
        });
        as[72] = (new String[] {
            "\350", "&egrave;"
        });
        as[73] = (new String[] {
            "\351", "&eacute;"
        });
        as[74] = (new String[] {
            "\352", "&ecirc;"
        });
        as[75] = (new String[] {
            "\353", "&euml;"
        });
        as[76] = (new String[] {
            "\354", "&igrave;"
        });
        as[77] = (new String[] {
            "\355", "&iacute;"
        });
        as[78] = (new String[] {
            "\356", "&icirc;"
        });
        as[79] = (new String[] {
            "\357", "&iuml;"
        });
        as[80] = (new String[] {
            "\360", "&eth;"
        });
        as[81] = (new String[] {
            "\361", "&ntilde;"
        });
        as[82] = (new String[] {
            "\362", "&ograve;"
        });
        as[83] = (new String[] {
            "\363", "&oacute;"
        });
        as[84] = (new String[] {
            "\364", "&ocirc;"
        });
        as[85] = (new String[] {
            "\365", "&otilde;"
        });
        as[86] = (new String[] {
            "\366", "&ouml;"
        });
        as[87] = (new String[] {
            "\367", "&divide;"
        });
        as[88] = (new String[] {
            "\370", "&oslash;"
        });
        as[89] = (new String[] {
            "\371", "&ugrave;"
        });
        as[90] = (new String[] {
            "\372", "&uacute;"
        });
        as[91] = (new String[] {
            "\373", "&ucirc;"
        });
        as[92] = (new String[] {
            "\374", "&uuml;"
        });
        as[93] = (new String[] {
            "\375", "&yacute;"
        });
        as[94] = (new String[] {
            "\376", "&thorn;"
        });
        as[95] = (new String[] {
            "\377", "&yuml;"
        });
        a = as;
        b = a(as);
        as = new String[151][];
        as[0] = (new String[] {
            "\u0192", "&fnof;"
        });
        as[1] = (new String[] {
            "\u0391", "&Alpha;"
        });
        as[2] = (new String[] {
            "\u0392", "&Beta;"
        });
        as[3] = (new String[] {
            "\u0393", "&Gamma;"
        });
        as[4] = (new String[] {
            "\u0394", "&Delta;"
        });
        as[5] = (new String[] {
            "\u0395", "&Epsilon;"
        });
        as[6] = (new String[] {
            "\u0396", "&Zeta;"
        });
        as[7] = (new String[] {
            "\u0397", "&Eta;"
        });
        as[8] = (new String[] {
            "\u0398", "&Theta;"
        });
        as[9] = (new String[] {
            "\u0399", "&Iota;"
        });
        as[10] = (new String[] {
            "\u039A", "&Kappa;"
        });
        as[11] = (new String[] {
            "\u039B", "&Lambda;"
        });
        as[12] = (new String[] {
            "\u039C", "&Mu;"
        });
        as[13] = (new String[] {
            "\u039D", "&Nu;"
        });
        as[14] = (new String[] {
            "\u039E", "&Xi;"
        });
        as[15] = (new String[] {
            "\u039F", "&Omicron;"
        });
        as[16] = (new String[] {
            "\u03A0", "&Pi;"
        });
        as[17] = (new String[] {
            "\u03A1", "&Rho;"
        });
        as[18] = (new String[] {
            "\u03A3", "&Sigma;"
        });
        as[19] = (new String[] {
            "\u03A4", "&Tau;"
        });
        as[20] = (new String[] {
            "\u03A5", "&Upsilon;"
        });
        as[21] = (new String[] {
            "\u03A6", "&Phi;"
        });
        as[22] = (new String[] {
            "\u03A7", "&Chi;"
        });
        as[23] = (new String[] {
            "\u03A8", "&Psi;"
        });
        as[24] = (new String[] {
            "\u03A9", "&Omega;"
        });
        as[25] = (new String[] {
            "\u03B1", "&alpha;"
        });
        as[26] = (new String[] {
            "\u03B2", "&beta;"
        });
        as[27] = (new String[] {
            "\u03B3", "&gamma;"
        });
        as[28] = (new String[] {
            "\u03B4", "&delta;"
        });
        as[29] = (new String[] {
            "\u03B5", "&epsilon;"
        });
        as[30] = (new String[] {
            "\u03B6", "&zeta;"
        });
        as[31] = (new String[] {
            "\u03B7", "&eta;"
        });
        as[32] = (new String[] {
            "\u03B8", "&theta;"
        });
        as[33] = (new String[] {
            "\u03B9", "&iota;"
        });
        as[34] = (new String[] {
            "\u03BA", "&kappa;"
        });
        as[35] = (new String[] {
            "\u03BB", "&lambda;"
        });
        as[36] = (new String[] {
            "\u03BC", "&mu;"
        });
        as[37] = (new String[] {
            "\u03BD", "&nu;"
        });
        as[38] = (new String[] {
            "\u03BE", "&xi;"
        });
        as[39] = (new String[] {
            "\u03BF", "&omicron;"
        });
        as[40] = (new String[] {
            "\u03C0", "&pi;"
        });
        as[41] = (new String[] {
            "\u03C1", "&rho;"
        });
        as[42] = (new String[] {
            "\u03C2", "&sigmaf;"
        });
        as[43] = (new String[] {
            "\u03C3", "&sigma;"
        });
        as[44] = (new String[] {
            "\u03C4", "&tau;"
        });
        as[45] = (new String[] {
            "\u03C5", "&upsilon;"
        });
        as[46] = (new String[] {
            "\u03C6", "&phi;"
        });
        as[47] = (new String[] {
            "\u03C7", "&chi;"
        });
        as[48] = (new String[] {
            "\u03C8", "&psi;"
        });
        as[49] = (new String[] {
            "\u03C9", "&omega;"
        });
        as[50] = (new String[] {
            "\u03D1", "&thetasym;"
        });
        as[51] = (new String[] {
            "\u03D2", "&upsih;"
        });
        as[52] = (new String[] {
            "\u03D6", "&piv;"
        });
        as[53] = (new String[] {
            "\u2022", "&bull;"
        });
        as[54] = (new String[] {
            "\u2026", "&hellip;"
        });
        as[55] = (new String[] {
            "\u2032", "&prime;"
        });
        as[56] = (new String[] {
            "\u2033", "&Prime;"
        });
        as[57] = (new String[] {
            "\u203E", "&oline;"
        });
        as[58] = (new String[] {
            "\u2044", "&frasl;"
        });
        as[59] = (new String[] {
            "\u2118", "&weierp;"
        });
        as[60] = (new String[] {
            "\u2111", "&image;"
        });
        as[61] = (new String[] {
            "\u211C", "&real;"
        });
        as[62] = (new String[] {
            "\u2122", "&trade;"
        });
        as[63] = (new String[] {
            "\u2135", "&alefsym;"
        });
        as[64] = (new String[] {
            "\u2190", "&larr;"
        });
        as[65] = (new String[] {
            "\u2191", "&uarr;"
        });
        as[66] = (new String[] {
            "\u2192", "&rarr;"
        });
        as[67] = (new String[] {
            "\u2193", "&darr;"
        });
        as[68] = (new String[] {
            "\u2194", "&harr;"
        });
        as[69] = (new String[] {
            "\u21B5", "&crarr;"
        });
        as[70] = (new String[] {
            "\u21D0", "&lArr;"
        });
        as[71] = (new String[] {
            "\u21D1", "&uArr;"
        });
        as[72] = (new String[] {
            "\u21D2", "&rArr;"
        });
        as[73] = (new String[] {
            "\u21D3", "&dArr;"
        });
        as[74] = (new String[] {
            "\u21D4", "&hArr;"
        });
        as[75] = (new String[] {
            "\u2200", "&forall;"
        });
        as[76] = (new String[] {
            "\u2202", "&part;"
        });
        as[77] = (new String[] {
            "\u2203", "&exist;"
        });
        as[78] = (new String[] {
            "\u2205", "&empty;"
        });
        as[79] = (new String[] {
            "\u2207", "&nabla;"
        });
        as[80] = (new String[] {
            "\u2208", "&isin;"
        });
        as[81] = (new String[] {
            "\u2209", "&notin;"
        });
        as[82] = (new String[] {
            "\u220B", "&ni;"
        });
        as[83] = (new String[] {
            "\u220F", "&prod;"
        });
        as[84] = (new String[] {
            "\u2211", "&sum;"
        });
        as[85] = (new String[] {
            "\u2212", "&minus;"
        });
        as[86] = (new String[] {
            "\u2217", "&lowast;"
        });
        as[87] = (new String[] {
            "\u221A", "&radic;"
        });
        as[88] = (new String[] {
            "\u221D", "&prop;"
        });
        as[89] = (new String[] {
            "\u221E", "&infin;"
        });
        as[90] = (new String[] {
            "\u2220", "&ang;"
        });
        as[91] = (new String[] {
            "\u2227", "&and;"
        });
        as[92] = (new String[] {
            "\u2228", "&or;"
        });
        as[93] = (new String[] {
            "\u2229", "&cap;"
        });
        as[94] = (new String[] {
            "\u222A", "&cup;"
        });
        as[95] = (new String[] {
            "\u222B", "&int;"
        });
        as[96] = (new String[] {
            "\u2234", "&there4;"
        });
        as[97] = (new String[] {
            "\u223C", "&sim;"
        });
        as[98] = (new String[] {
            "\u2245", "&cong;"
        });
        as[99] = (new String[] {
            "\u2248", "&asymp;"
        });
        as[100] = (new String[] {
            "\u2260", "&ne;"
        });
        as[101] = (new String[] {
            "\u2261", "&equiv;"
        });
        as[102] = (new String[] {
            "\u2264", "&le;"
        });
        as[103] = (new String[] {
            "\u2265", "&ge;"
        });
        as[104] = (new String[] {
            "\u2282", "&sub;"
        });
        as[105] = (new String[] {
            "\u2283", "&sup;"
        });
        as[106] = (new String[] {
            "\u2286", "&sube;"
        });
        as[107] = (new String[] {
            "\u2287", "&supe;"
        });
        as[108] = (new String[] {
            "\u2295", "&oplus;"
        });
        as[109] = (new String[] {
            "\u2297", "&otimes;"
        });
        as[110] = (new String[] {
            "\u22A5", "&perp;"
        });
        as[111] = (new String[] {
            "\u22C5", "&sdot;"
        });
        as[112] = (new String[] {
            "\u2308", "&lceil;"
        });
        as[113] = (new String[] {
            "\u2309", "&rceil;"
        });
        as[114] = (new String[] {
            "\u230A", "&lfloor;"
        });
        as[115] = (new String[] {
            "\u230B", "&rfloor;"
        });
        as[116] = (new String[] {
            "\u2329", "&lang;"
        });
        as[117] = (new String[] {
            "\u232A", "&rang;"
        });
        as[118] = (new String[] {
            "\u25CA", "&loz;"
        });
        as[119] = (new String[] {
            "\u2660", "&spades;"
        });
        as[120] = (new String[] {
            "\u2663", "&clubs;"
        });
        as[121] = (new String[] {
            "\u2665", "&hearts;"
        });
        as[122] = (new String[] {
            "\u2666", "&diams;"
        });
        as[123] = (new String[] {
            "\u0152", "&OElig;"
        });
        as[124] = (new String[] {
            "\u0153", "&oelig;"
        });
        as[125] = (new String[] {
            "\u0160", "&Scaron;"
        });
        as[126] = (new String[] {
            "\u0161", "&scaron;"
        });
        as[127] = (new String[] {
            "\u0178", "&Yuml;"
        });
        as[128] = (new String[] {
            "\u02C6", "&circ;"
        });
        as[129] = (new String[] {
            "\u02DC", "&tilde;"
        });
        as[130] = (new String[] {
            "\u2002", "&ensp;"
        });
        as[131] = (new String[] {
            "\u2003", "&emsp;"
        });
        as[132] = (new String[] {
            "\u2009", "&thinsp;"
        });
        as[133] = (new String[] {
            "\u200C", "&zwnj;"
        });
        as[134] = (new String[] {
            "\u200D", "&zwj;"
        });
        as[135] = (new String[] {
            "\u200E", "&lrm;"
        });
        as[136] = (new String[] {
            "\u200F", "&rlm;"
        });
        as[137] = (new String[] {
            "\u2013", "&ndash;"
        });
        as[138] = (new String[] {
            "\u2014", "&mdash;"
        });
        as[139] = (new String[] {
            "\u2018", "&lsquo;"
        });
        as[140] = (new String[] {
            "\u2019", "&rsquo;"
        });
        as[141] = (new String[] {
            "\u201A", "&sbquo;"
        });
        as[142] = (new String[] {
            "\u201C", "&ldquo;"
        });
        as[143] = (new String[] {
            "\u201D", "&rdquo;"
        });
        as[144] = (new String[] {
            "\u201E", "&bdquo;"
        });
        as[145] = (new String[] {
            "\u2020", "&dagger;"
        });
        as[146] = (new String[] {
            "\u2021", "&Dagger;"
        });
        as[147] = (new String[] {
            "\u2030", "&permil;"
        });
        as[148] = (new String[] {
            "\u2039", "&lsaquo;"
        });
        as[149] = (new String[] {
            "\u203A", "&rsaquo;"
        });
        as[150] = (new String[] {
            "\u20AC", "&euro;"
        });
        c = as;
        d = a(as);
        as = new String[4][];
        as[0] = (new String[] {
            "\"", "&quot;"
        });
        as[1] = (new String[] {
            "&", "&amp;"
        });
        as[2] = (new String[] {
            "<", "&lt;"
        });
        as[3] = (new String[] {
            ">", "&gt;"
        });
        e = as;
        f = a(as);
        as = new String[1][];
        as[0] = (new String[] {
            "'", "&apos;"
        });
        g = as;
        h = a(as);
        as = new String[5][];
        as[0] = (new String[] {
            "\b", "\\b"
        });
        as[1] = (new String[] {
            "\n", "\\n"
        });
        as[2] = (new String[] {
            "\t", "\\t"
        });
        as[3] = (new String[] {
            "\f", "\\f"
        });
        as[4] = (new String[] {
            "\r", "\\r"
        });
        i = as;
        j = a(as);
    }
}
