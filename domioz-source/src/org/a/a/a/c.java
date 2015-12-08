// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;

import java.io.Writer;

// Referenced classes of package org.a.a.a:
//            e, d

final class c
{

    static final String a[][];
    static final String b[][];
    public static final c c;
    public static final c d;
    public static final c e;
    private static final String f[][];
    private static final String g[][] = {
        {
            "apos", "39"
        }
    };
    private final d h = new e();

    public c()
    {
    }

    private void a(String as[][])
    {
        for (int i = 0; i < as.length; i++)
        {
            String s = as[i][0];
            int j = Integer.parseInt(as[i][1]);
            h.a(s, j);
        }

    }

    public final void a(Writer writer, String s)
    {
        int i = s.indexOf('&');
        if (i >= 0) goto _L2; else goto _L1
_L1:
        writer.write(s);
_L6:
        return;
_L2:
        int l;
        writer.write(s, 0, i);
        l = s.length();
_L4:
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        {
            int j = s.charAt(i);
            String s1;
            NumberFormatException numberformatexception;
            int k;
            int i1;
            if (j == 38)
            {
                i1 = i + 1;
                k = s.indexOf(';', i1);
                if (k == -1)
                {
                    writer.write(j);
                } else
                {
label0:
                    {
                        int j1 = s.indexOf('&', i + 1);
                        if (j1 == -1 || j1 >= k)
                        {
                            break label0;
                        }
                        writer.write(j);
                    }
                }
            } else
            {
                writer.write(j);
            }
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        s1 = s.substring(i1, k);
        i = s1.length();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        if (s1.charAt(0) != '#') goto _L8; else goto _L7
_L7:
        if (i <= 1)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        s1.charAt(1);
        JVM INSTR lookupswitch 2: default 192
    //                   88: 249
    //                   120: 249;
           goto _L9 _L10 _L10
_L9:
        j = Integer.parseInt(s1.substring(1), 10);
_L11:
        i = j;
        if (j > 65535)
        {
            i = -1;
        }
_L12:
        if (i == -1)
        {
            writer.write(38);
            writer.write(s1);
            writer.write(59);
        } else
        {
            writer.write(i);
        }
        i = k;
        break MISSING_BLOCK_LABEL_83;
_L10:
        j = Integer.parseInt(s1.substring(2), 16);
          goto _L11
        numberformatexception;
        i = -1;
          goto _L12
_L8:
        i = h.a(s1);
          goto _L12
        i = -1;
          goto _L12
    }

    static 
    {
        String as[] = {
            "amp", "38"
        };
        String as1[] = {
            "lt", "60"
        };
        f = (new String[][] {
            new String[] {
                "quot", "34"
            }, as, as1, new String[] {
                "gt", "62"
            }
        });
        as = (new String[] {
            "nbsp", "160"
        });
        as1 = (new String[] {
            "iexcl", "161"
        });
        String as2[] = {
            "cent", "162"
        };
        String as3[] = {
            "pound", "163"
        };
        String as4[] = {
            "curren", "164"
        };
        String as5[] = {
            "yen", "165"
        };
        String as6[] = {
            "brvbar", "166"
        };
        String as7[] = {
            "uml", "168"
        };
        String as8[] = {
            "copy", "169"
        };
        String as9[] = {
            "ordf", "170"
        };
        String as10[] = {
            "laquo", "171"
        };
        String as11[] = {
            "not", "172"
        };
        String as12[] = {
            "shy", "173"
        };
        String as13[] = {
            "reg", "174"
        };
        String as14[] = {
            "deg", "176"
        };
        String as15[] = {
            "plusmn", "177"
        };
        String as16[] = {
            "sup2", "178"
        };
        String as17[] = {
            "sup3", "179"
        };
        String as18[] = {
            "acute", "180"
        };
        String as19[] = {
            "micro", "181"
        };
        String as20[] = {
            "para", "182"
        };
        String as21[] = {
            "middot", "183"
        };
        String as22[] = {
            "cedil", "184"
        };
        String as23[] = {
            "sup1", "185"
        };
        String as24[] = {
            "ordm", "186"
        };
        String as25[] = {
            "raquo", "187"
        };
        String as26[] = {
            "frac14", "188"
        };
        String as27[] = {
            "frac34", "190"
        };
        String as28[] = {
            "iquest", "191"
        };
        String as29[] = {
            "Agrave", "192"
        };
        String as30[] = {
            "Aacute", "193"
        };
        String as31[] = {
            "Acirc", "194"
        };
        String as32[] = {
            "Atilde", "195"
        };
        String as33[] = {
            "Auml", "196"
        };
        String as34[] = {
            "Aring", "197"
        };
        String as35[] = {
            "AElig", "198"
        };
        String as36[] = {
            "Ccedil", "199"
        };
        String as37[] = {
            "Egrave", "200"
        };
        String as38[] = {
            "Eacute", "201"
        };
        String as39[] = {
            "Ecirc", "202"
        };
        String as40[] = {
            "Euml", "203"
        };
        String as41[] = {
            "Igrave", "204"
        };
        String as42[] = {
            "Iacute", "205"
        };
        String as43[] = {
            "Icirc", "206"
        };
        String as44[] = {
            "ETH", "208"
        };
        String as45[] = {
            "Ntilde", "209"
        };
        String as46[] = {
            "Ograve", "210"
        };
        String as47[] = {
            "Oacute", "211"
        };
        String as48[] = {
            "Ocirc", "212"
        };
        String as49[] = {
            "Otilde", "213"
        };
        String as50[] = {
            "times", "215"
        };
        String as51[] = {
            "Ugrave", "217"
        };
        String as52[] = {
            "Ucirc", "219"
        };
        String as53[] = {
            "Uuml", "220"
        };
        String as54[] = {
            "Yacute", "221"
        };
        String as55[] = {
            "THORN", "222"
        };
        String as56[] = {
            "szlig", "223"
        };
        String as57[] = {
            "agrave", "224"
        };
        String as58[] = {
            "aacute", "225"
        };
        String as59[] = {
            "acirc", "226"
        };
        String as60[] = {
            "atilde", "227"
        };
        String as61[] = {
            "auml", "228"
        };
        String as62[] = {
            "aring", "229"
        };
        String as63[] = {
            "aelig", "230"
        };
        String as64[] = {
            "ccedil", "231"
        };
        String as65[] = {
            "egrave", "232"
        };
        String as66[] = {
            "eacute", "233"
        };
        String as67[] = {
            "ecirc", "234"
        };
        String as68[] = {
            "euml", "235"
        };
        String as69[] = {
            "igrave", "236"
        };
        String as70[] = {
            "iacute", "237"
        };
        String as71[] = {
            "icirc", "238"
        };
        String as72[] = {
            "iuml", "239"
        };
        String as73[] = {
            "eth", "240"
        };
        String as74[] = {
            "ograve", "242"
        };
        String as75[] = {
            "oacute", "243"
        };
        String as76[] = {
            "ocirc", "244"
        };
        String as77[] = {
            "otilde", "245"
        };
        String as78[] = {
            "ouml", "246"
        };
        String as79[] = {
            "divide", "247"
        };
        String as80[] = {
            "oslash", "248"
        };
        String as81[] = {
            "ugrave", "249"
        };
        String as82[] = {
            "uacute", "250"
        };
        String as83[] = {
            "ucirc", "251"
        };
        String as84[] = {
            "uuml", "252"
        };
        String as85[] = {
            "yacute", "253"
        };
        String as86[] = {
            "thorn", "254"
        };
        String as87[] = {
            "yuml", "255"
        };
        a = (new String[][] {
            as, as1, as2, as3, as4, as5, as6, new String[] {
                "sect", "167"
            }, as7, as8, 
            as9, as10, as11, as12, as13, new String[] {
                "macr", "175"
            }, as14, as15, as16, as17, 
            as18, as19, as20, as21, as22, as23, as24, as25, as26, new String[] {
                "frac12", "189"
            }, 
            as27, as28, as29, as30, as31, as32, as33, as34, as35, as36, 
            as37, as38, as39, as40, as41, as42, as43, new String[] {
                "Iuml", "207"
            }, as44, as45, 
            as46, as47, as48, as49, new String[] {
                "Ouml", "214"
            }, as50, new String[] {
                "Oslash", "216"
            }, as51, new String[] {
                "Uacute", "218"
            }, as52, 
            as53, as54, as55, as56, as57, as58, as59, as60, as61, as62, 
            as63, as64, as65, as66, as67, as68, as69, as70, as71, as72, 
            as73, new String[] {
                "ntilde", "241"
            }, as74, as75, as76, as77, as78, as79, as80, as81, 
            as82, as83, as84, as85, as86, as87
        });
        as = (new String[] {
            "Gamma", "915"
        });
        as1 = (new String[] {
            "Theta", "920"
        });
        as2 = (new String[] {
            "Mu", "924"
        });
        as3 = (new String[] {
            "Pi", "928"
        });
        as4 = (new String[] {
            "Upsilon", "933"
        });
        as5 = (new String[] {
            "Phi", "934"
        });
        as6 = (new String[] {
            "alpha", "945"
        });
        as7 = (new String[] {
            "chi", "967"
        });
        as8 = (new String[] {
            "upsih", "978"
        });
        as9 = (new String[] {
            "Prime", "8243"
        });
        as10 = (new String[] {
            "uarr", "8593"
        });
        as11 = (new String[] {
            "darr", "8595"
        });
        as12 = (new String[] {
            "harr", "8596"
        });
        as13 = (new String[] {
            "lArr", "8656"
        });
        as14 = (new String[] {
            "hArr", "8660"
        });
        as15 = (new String[] {
            "ni", "8715"
        });
        as16 = (new String[] {
            "prod", "8719"
        });
        as17 = (new String[] {
            "sum", "8721"
        });
        as18 = (new String[] {
            "radic", "8730"
        });
        as19 = (new String[] {
            "infin", "8734"
        });
        as20 = (new String[] {
            "or", "8744"
        });
        as21 = (new String[] {
            "cup", "8746"
        });
        as22 = (new String[] {
            "asymp", "8776"
        });
        as23 = (new String[] {
            "sup", "8835"
        });
        as24 = (new String[] {
            "clubs", "9827"
        });
        as25 = (new String[] {
            "Scaron", "352"
        });
        as26 = (new String[] {
            "lrm", "8206"
        });
        as27 = (new String[] {
            "lsquo", "8216"
        });
        as28 = (new String[] {
            "ldquo", "8220"
        });
        as29 = (new String[] {
            "rdquo", "8221"
        });
        as30 = (new String[] {
            "bdquo", "8222"
        });
        b = (new String[][] {
            new String[] {
                "fnof", "402"
            }, new String[] {
                "Alpha", "913"
            }, new String[] {
                "Beta", "914"
            }, as, new String[] {
                "Delta", "916"
            }, new String[] {
                "Epsilon", "917"
            }, new String[] {
                "Zeta", "918"
            }, new String[] {
                "Eta", "919"
            }, as1, new String[] {
                "Iota", "921"
            }, new String[] {
                "Kappa", "922"
            }, new String[] {
                "Lambda", "923"
            }, as2, new String[] {
                "Nu", "925"
            }, new String[] {
                "Xi", "926"
            }, new String[] {
                "Omicron", "927"
            }, as3, new String[] {
                "Rho", "929"
            }, new String[] {
                "Sigma", "931"
            }, new String[] {
                "Tau", "932"
            }, as4, as5, new String[] {
                "Chi", "935"
            }, new String[] {
                "Psi", "936"
            }, new String[] {
                "Omega", "937"
            }, as6, new String[] {
                "beta", "946"
            }, new String[] {
                "gamma", "947"
            }, new String[] {
                "delta", "948"
            }, new String[] {
                "epsilon", "949"
            }, new String[] {
                "zeta", "950"
            }, new String[] {
                "eta", "951"
            }, new String[] {
                "theta", "952"
            }, new String[] {
                "iota", "953"
            }, new String[] {
                "kappa", "954"
            }, new String[] {
                "lambda", "955"
            }, new String[] {
                "mu", "956"
            }, new String[] {
                "nu", "957"
            }, new String[] {
                "xi", "958"
            }, new String[] {
                "omicron", "959"
            }, new String[] {
                "pi", "960"
            }, new String[] {
                "rho", "961"
            }, new String[] {
                "sigmaf", "962"
            }, new String[] {
                "sigma", "963"
            }, new String[] {
                "tau", "964"
            }, new String[] {
                "upsilon", "965"
            }, new String[] {
                "phi", "966"
            }, as7, new String[] {
                "psi", "968"
            }, new String[] {
                "omega", "969"
            }, new String[] {
                "thetasym", "977"
            }, as8, new String[] {
                "piv", "982"
            }, new String[] {
                "bull", "8226"
            }, new String[] {
                "hellip", "8230"
            }, new String[] {
                "prime", "8242"
            }, as9, new String[] {
                "oline", "8254"
            }, new String[] {
                "frasl", "8260"
            }, new String[] {
                "weierp", "8472"
            }, new String[] {
                "image", "8465"
            }, new String[] {
                "real", "8476"
            }, new String[] {
                "trade", "8482"
            }, new String[] {
                "alefsym", "8501"
            }, new String[] {
                "larr", "8592"
            }, as10, new String[] {
                "rarr", "8594"
            }, as11, as12, new String[] {
                "crarr", "8629"
            }, as13, new String[] {
                "uArr", "8657"
            }, new String[] {
                "rArr", "8658"
            }, new String[] {
                "dArr", "8659"
            }, as14, new String[] {
                "forall", "8704"
            }, new String[] {
                "part", "8706"
            }, new String[] {
                "exist", "8707"
            }, new String[] {
                "empty", "8709"
            }, new String[] {
                "nabla", "8711"
            }, new String[] {
                "isin", "8712"
            }, new String[] {
                "notin", "8713"
            }, as15, as16, as17, new String[] {
                "minus", "8722"
            }, new String[] {
                "lowast", "8727"
            }, as18, new String[] {
                "prop", "8733"
            }, as19, new String[] {
                "ang", "8736"
            }, new String[] {
                "and", "8743"
            }, as20, new String[] {
                "cap", "8745"
            }, as21, new String[] {
                "int", "8747"
            }, new String[] {
                "there4", "8756"
            }, new String[] {
                "sim", "8764"
            }, new String[] {
                "cong", "8773"
            }, as22, new String[] {
                "ne", "8800"
            }, new String[] {
                "equiv", "8801"
            }, new String[] {
                "le", "8804"
            }, new String[] {
                "ge", "8805"
            }, new String[] {
                "sub", "8834"
            }, as23, new String[] {
                "sube", "8838"
            }, new String[] {
                "supe", "8839"
            }, new String[] {
                "oplus", "8853"
            }, new String[] {
                "otimes", "8855"
            }, new String[] {
                "perp", "8869"
            }, new String[] {
                "sdot", "8901"
            }, new String[] {
                "lceil", "8968"
            }, new String[] {
                "rceil", "8969"
            }, new String[] {
                "lfloor", "8970"
            }, new String[] {
                "rfloor", "8971"
            }, new String[] {
                "lang", "9001"
            }, new String[] {
                "rang", "9002"
            }, new String[] {
                "loz", "9674"
            }, new String[] {
                "spades", "9824"
            }, as24, new String[] {
                "hearts", "9829"
            }, new String[] {
                "diams", "9830"
            }, new String[] {
                "OElig", "338"
            }, new String[] {
                "oelig", "339"
            }, as25, new String[] {
                "scaron", "353"
            }, new String[] {
                "Yuml", "376"
            }, new String[] {
                "circ", "710"
            }, new String[] {
                "tilde", "732"
            }, new String[] {
                "ensp", "8194"
            }, new String[] {
                "emsp", "8195"
            }, new String[] {
                "thinsp", "8201"
            }, new String[] {
                "zwnj", "8204"
            }, new String[] {
                "zwj", "8205"
            }, as26, new String[] {
                "rlm", "8207"
            }, new String[] {
                "ndash", "8211"
            }, new String[] {
                "mdash", "8212"
            }, as27, new String[] {
                "rsquo", "8217"
            }, new String[] {
                "sbquo", "8218"
            }, as28, as29, as30, new String[] {
                "dagger", "8224"
            }, new String[] {
                "Dagger", "8225"
            }, new String[] {
                "permil", "8240"
            }, new String[] {
                "lsaquo", "8249"
            }, new String[] {
                "rsaquo", "8250"
            }, new String[] {
                "euro", "8364"
            }
        });
        c c1 = new c();
        c1.a(f);
        c1.a(g);
        c = c1;
        c1 = new c();
        c1.a(f);
        c1.a(a);
        d = c1;
        c1 = new c();
        c1.a(f);
        c1.a(a);
        c1.a(b);
        e = c1;
    }
}
