// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.utils;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.adobe.adobepass.accessenabler.utils:
//            IntHashMap

class Entities
{
    static interface EntityMap
    {

        public abstract void add(String s, int i);

        public abstract String name(int i);

        public abstract int value(String s);
    }

    static class LookupEntityMap extends PrimitiveEntityMap
    {

        private static final int LOOKUP_TABLE_SIZE = 256;
        private String lookupTable[];

        private void createLookupTable()
        {
            lookupTable = new String[256];
            for (int i = 0; i < 256; i++)
            {
                lookupTable[i] = super.name(i);
            }

        }

        private String[] lookupTable()
        {
            if (lookupTable == null)
            {
                createLookupTable();
            }
            return lookupTable;
        }

        public String name(int i)
        {
            if (i < 256)
            {
                return lookupTable()[i];
            } else
            {
                return super.name(i);
            }
        }

        LookupEntityMap()
        {
        }
    }

    static class PrimitiveEntityMap
        implements EntityMap
    {

        private final Map mapNameToValue = new HashMap();
        private final IntHashMap mapValueToName = new IntHashMap();

        public void add(String s, int i)
        {
            mapNameToValue.put(s, Integer.valueOf(i));
            mapValueToName.put(i, s);
        }

        public String name(int i)
        {
            return (String)mapValueToName.get(i);
        }

        public int value(String s)
        {
            s = ((String) (mapNameToValue.get(s)));
            if (s == null)
            {
                return -1;
            } else
            {
                return ((Integer)s).intValue();
            }
        }

        PrimitiveEntityMap()
        {
        }
    }


    private static final String BASIC_ARRAY[][] = {
        {
            "quot", "34"
        }, {
            "amp", "38"
        }, {
            "lt", "60"
        }, {
            "gt", "62"
        }
    };
    public static final Entities HTML40;
    static final String HTML40_ARRAY[][];
    static final String ISO8859_1_ARRAY[][];
    private final EntityMap map = new LookupEntityMap();

    public Entities()
    {
    }

    private void doUnescape(Writer writer, String s, int i)
        throws IOException
    {
        int l;
        writer.write(s, 0, i);
        l = s.length();
_L2:
        int j;
        int k;
        int i1;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        j = s.charAt(i);
        if (j != 38)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        i1 = i + 1;
        k = s.indexOf(';', i1);
        if (k != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        writer.write(j);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            int j1 = s.indexOf('&', i + 1);
            if (j1 == -1 || j1 >= k)
            {
                break label0;
            }
            writer.write(j);
        }
          goto _L3
        String s1;
        s1 = s.substring(i1, k);
        j = -1;
        i1 = s1.length();
        i = j;
        if (i1 <= 0) goto _L5; else goto _L4
_L4:
        if (s1.charAt(0) != '#')
        {
            break MISSING_BLOCK_LABEL_258;
        }
        i = j;
        if (i1 <= 1) goto _L5; else goto _L6
_L6:
        s1.charAt(1);
        JVM INSTR lookupswitch 2: default 180
    //                   88: 235
    //                   120: 235;
           goto _L7 _L8 _L8
_L7:
        j = Integer.parseInt(s1.substring(1), 10);
_L9:
        i = j;
        if (j > 65535)
        {
            i = -1;
        }
_L5:
        NumberFormatException numberformatexception;
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
          goto _L3
_L8:
        j = Integer.parseInt(s1.substring(2), 16);
          goto _L9
        numberformatexception;
        i = -1;
          goto _L5
        i = entityValue(s1);
          goto _L5
        writer.write(j);
          goto _L3
    }

    static void fillWithHtml40Entities(Entities entities)
    {
        entities.addEntities(BASIC_ARRAY);
        entities.addEntities(ISO8859_1_ARRAY);
        entities.addEntities(HTML40_ARRAY);
    }

    public void addEntities(String as[][])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String as1[] = as[i];
            addEntity(as1[0], Integer.parseInt(as1[1]));
        }

    }

    public void addEntity(String s, int i)
    {
        map.add(s, i);
    }

    public int entityValue(String s)
    {
        return map.value(s);
    }

    public void unescape(Writer writer, String s)
        throws IOException
    {
        int i = s.indexOf('&');
        if (i < 0)
        {
            writer.write(s);
            return;
        } else
        {
            doUnescape(writer, s, i);
            return;
        }
    }

    static 
    {
        String as[] = {
            "nbsp", "160"
        };
        String as1[] = {
            "pound", "163"
        };
        String as2[] = {
            "curren", "164"
        };
        String as3[] = {
            "copy", "169"
        };
        String as4[] = {
            "ordf", "170"
        };
        String as5[] = {
            "not", "172"
        };
        String as6[] = {
            "deg", "176"
        };
        String as7[] = {
            "acute", "180"
        };
        String as8[] = {
            "cedil", "184"
        };
        String as9[] = {
            "ordm", "186"
        };
        String as10[] = {
            "raquo", "187"
        };
        String as11[] = {
            "frac12", "189"
        };
        String as12[] = {
            "Atilde", "195"
        };
        String as13[] = {
            "AElig", "198"
        };
        String as14[] = {
            "Ccedil", "199"
        };
        String as15[] = {
            "Eacute", "201"
        };
        String as16[] = {
            "Iacute", "205"
        };
        String as17[] = {
            "Iuml", "207"
        };
        String as18[] = {
            "ETH", "208"
        };
        String as19[] = {
            "Ograve", "210"
        };
        String as20[] = {
            "Oacute", "211"
        };
        String as21[] = {
            "Oslash", "216"
        };
        String as22[] = {
            "Uacute", "218"
        };
        String as23[] = {
            "Yacute", "221"
        };
        String as24[] = {
            "aacute", "225"
        };
        String as25[] = {
            "acirc", "226"
        };
        String as26[] = {
            "auml", "228"
        };
        String as27[] = {
            "aelig", "230"
        };
        String as28[] = {
            "eacute", "233"
        };
        String as29[] = {
            "iacute", "237"
        };
        String as30[] = {
            "icirc", "238"
        };
        String as31[] = {
            "ntilde", "241"
        };
        String as32[] = {
            "ograve", "242"
        };
        String as33[] = {
            "oacute", "243"
        };
        String as34[] = {
            "ocirc", "244"
        };
        String as35[] = {
            "otilde", "245"
        };
        String as36[] = {
            "ouml", "246"
        };
        String as37[] = {
            "oslash", "248"
        };
        ISO8859_1_ARRAY = (new String[][] {
            as, new String[] {
                "iexcl", "161"
            }, new String[] {
                "cent", "162"
            }, as1, as2, new String[] {
                "yen", "165"
            }, new String[] {
                "brvbar", "166"
            }, new String[] {
                "sect", "167"
            }, new String[] {
                "uml", "168"
            }, as3, 
            as4, new String[] {
                "laquo", "171"
            }, as5, new String[] {
                "shy", "173"
            }, new String[] {
                "reg", "174"
            }, new String[] {
                "macr", "175"
            }, as6, new String[] {
                "plusmn", "177"
            }, new String[] {
                "sup2", "178"
            }, new String[] {
                "sup3", "179"
            }, 
            as7, new String[] {
                "micro", "181"
            }, new String[] {
                "para", "182"
            }, new String[] {
                "middot", "183"
            }, as8, new String[] {
                "sup1", "185"
            }, as9, as10, new String[] {
                "frac14", "188"
            }, as11, 
            new String[] {
                "frac34", "190"
            }, new String[] {
                "iquest", "191"
            }, new String[] {
                "Agrave", "192"
            }, new String[] {
                "Aacute", "193"
            }, new String[] {
                "Acirc", "194"
            }, as12, new String[] {
                "Auml", "196"
            }, new String[] {
                "Aring", "197"
            }, as13, as14, 
            new String[] {
                "Egrave", "200"
            }, as15, new String[] {
                "Ecirc", "202"
            }, new String[] {
                "Euml", "203"
            }, new String[] {
                "Igrave", "204"
            }, as16, new String[] {
                "Icirc", "206"
            }, as17, as18, new String[] {
                "Ntilde", "209"
            }, 
            as19, as20, new String[] {
                "Ocirc", "212"
            }, new String[] {
                "Otilde", "213"
            }, new String[] {
                "Ouml", "214"
            }, new String[] {
                "times", "215"
            }, as21, new String[] {
                "Ugrave", "217"
            }, as22, new String[] {
                "Ucirc", "219"
            }, 
            new String[] {
                "Uuml", "220"
            }, as23, new String[] {
                "THORN", "222"
            }, new String[] {
                "szlig", "223"
            }, new String[] {
                "agrave", "224"
            }, as24, as25, new String[] {
                "atilde", "227"
            }, as26, new String[] {
                "aring", "229"
            }, 
            as27, new String[] {
                "ccedil", "231"
            }, new String[] {
                "egrave", "232"
            }, as28, new String[] {
                "ecirc", "234"
            }, new String[] {
                "euml", "235"
            }, new String[] {
                "igrave", "236"
            }, as29, as30, new String[] {
                "iuml", "239"
            }, 
            new String[] {
                "eth", "240"
            }, as31, as32, as33, as34, as35, as36, new String[] {
                "divide", "247"
            }, as37, new String[] {
                "ugrave", "249"
            }, 
            new String[] {
                "uacute", "250"
            }, new String[] {
                "ucirc", "251"
            }, new String[] {
                "uuml", "252"
            }, new String[] {
                "yacute", "253"
            }, new String[] {
                "thorn", "254"
            }, new String[] {
                "yuml", "255"
            }
        });
        as = (new String[] {
            "fnof", "402"
        });
        as1 = (new String[] {
            "Delta", "916"
        });
        as2 = (new String[] {
            "Zeta", "918"
        });
        as3 = (new String[] {
            "Iota", "921"
        });
        as4 = (new String[] {
            "Kappa", "922"
        });
        as5 = (new String[] {
            "Lambda", "923"
        });
        as6 = (new String[] {
            "Xi", "926"
        });
        as7 = (new String[] {
            "Omicron", "927"
        });
        as8 = (new String[] {
            "Upsilon", "933"
        });
        as9 = (new String[] {
            "Phi", "934"
        });
        as10 = (new String[] {
            "Psi", "936"
        });
        as11 = (new String[] {
            "alpha", "945"
        });
        as12 = (new String[] {
            "gamma", "947"
        });
        as13 = (new String[] {
            "epsilon", "949"
        });
        as14 = (new String[] {
            "zeta", "950"
        });
        as15 = (new String[] {
            "lambda", "955"
        });
        as16 = (new String[] {
            "nu", "957"
        });
        as17 = (new String[] {
            "xi", "958"
        });
        as18 = (new String[] {
            "omicron", "959"
        });
        as19 = (new String[] {
            "phi", "966"
        });
        as20 = (new String[] {
            "thetasym", "977"
        });
        as21 = (new String[] {
            "hellip", "8230"
        });
        as22 = (new String[] {
            "image", "8465"
        });
        as23 = (new String[] {
            "alefsym", "8501"
        });
        as24 = (new String[] {
            "uarr", "8593"
        });
        as25 = (new String[] {
            "crarr", "8629"
        });
        as26 = (new String[] {
            "hArr", "8660"
        });
        as27 = (new String[] {
            "forall", "8704"
        });
        as28 = (new String[] {
            "part", "8706"
        });
        as29 = (new String[] {
            "exist", "8707"
        });
        as30 = (new String[] {
            "notin", "8713"
        });
        as31 = (new String[] {
            "prod", "8719"
        });
        as32 = (new String[] {
            "radic", "8730"
        });
        as33 = (new String[] {
            "ang", "8736"
        });
        as34 = (new String[] {
            "and", "8743"
        });
        as35 = (new String[] {
            "cup", "8746"
        });
        as36 = (new String[] {
            "cong", "8773"
        });
        as37 = (new String[] {
            "ne", "8800"
        });
        String as38[] = {
            "le", "8804"
        };
        String as39[] = {
            "ge", "8805"
        };
        String as40[] = {
            "sub", "8834"
        };
        String as41[] = {
            "sube", "8838"
        };
        String as42[] = {
            "supe", "8839"
        };
        String as43[] = {
            "lceil", "8968"
        };
        String as44[] = {
            "lang", "9001"
        };
        String as45[] = {
            "loz", "9674"
        };
        String as46[] = {
            "clubs", "9827"
        };
        String as47[] = {
            "hearts", "9829"
        };
        String as48[] = {
            "diams", "9830"
        };
        String as49[] = {
            "Scaron", "352"
        };
        String as50[] = {
            "scaron", "353"
        };
        String as51[] = {
            "circ", "710"
        };
        String as52[] = {
            "tilde", "732"
        };
        String as53[] = {
            "zwnj", "8204"
        };
        String as54[] = {
            "zwj", "8205"
        };
        String as55[] = {
            "rlm", "8207"
        };
        String as56[] = {
            "sbquo", "8218"
        };
        String as57[] = {
            "ldquo", "8220"
        };
        String as58[] = {
            "bdquo", "8222"
        };
        String as59[] = {
            "Dagger", "8225"
        };
        String as60[] = {
            "permil", "8240"
        };
        String as61[] = {
            "euro", "8364"
        };
        HTML40_ARRAY = (new String[][] {
            as, new String[] {
                "Alpha", "913"
            }, new String[] {
                "Beta", "914"
            }, new String[] {
                "Gamma", "915"
            }, as1, new String[] {
                "Epsilon", "917"
            }, as2, new String[] {
                "Eta", "919"
            }, new String[] {
                "Theta", "920"
            }, as3, 
            as4, as5, new String[] {
                "Mu", "924"
            }, new String[] {
                "Nu", "925"
            }, as6, as7, new String[] {
                "Pi", "928"
            }, new String[] {
                "Rho", "929"
            }, new String[] {
                "Sigma", "931"
            }, new String[] {
                "Tau", "932"
            }, 
            as8, as9, new String[] {
                "Chi", "935"
            }, as10, new String[] {
                "Omega", "937"
            }, as11, new String[] {
                "beta", "946"
            }, as12, new String[] {
                "delta", "948"
            }, as13, 
            as14, new String[] {
                "eta", "951"
            }, new String[] {
                "theta", "952"
            }, new String[] {
                "iota", "953"
            }, new String[] {
                "kappa", "954"
            }, as15, new String[] {
                "mu", "956"
            }, as16, as17, as18, 
            new String[] {
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
            }, as19, new String[] {
                "chi", "967"
            }, new String[] {
                "psi", "968"
            }, new String[] {
                "omega", "969"
            }, 
            as20, new String[] {
                "upsih", "978"
            }, new String[] {
                "piv", "982"
            }, new String[] {
                "bull", "8226"
            }, as21, new String[] {
                "prime", "8242"
            }, new String[] {
                "Prime", "8243"
            }, new String[] {
                "oline", "8254"
            }, new String[] {
                "frasl", "8260"
            }, new String[] {
                "weierp", "8472"
            }, 
            as22, new String[] {
                "real", "8476"
            }, new String[] {
                "trade", "8482"
            }, as23, new String[] {
                "larr", "8592"
            }, as24, new String[] {
                "rarr", "8594"
            }, new String[] {
                "darr", "8595"
            }, new String[] {
                "harr", "8596"
            }, as25, 
            new String[] {
                "lArr", "8656"
            }, new String[] {
                "uArr", "8657"
            }, new String[] {
                "rArr", "8658"
            }, new String[] {
                "dArr", "8659"
            }, as26, as27, as28, as29, new String[] {
                "empty", "8709"
            }, new String[] {
                "nabla", "8711"
            }, 
            new String[] {
                "isin", "8712"
            }, as30, new String[] {
                "ni", "8715"
            }, as31, new String[] {
                "sum", "8721"
            }, new String[] {
                "minus", "8722"
            }, new String[] {
                "lowast", "8727"
            }, as32, new String[] {
                "prop", "8733"
            }, new String[] {
                "infin", "8734"
            }, 
            as33, as34, new String[] {
                "or", "8744"
            }, new String[] {
                "cap", "8745"
            }, as35, new String[] {
                "int", "8747"
            }, new String[] {
                "there4", "8756"
            }, new String[] {
                "sim", "8764"
            }, as36, new String[] {
                "asymp", "8776"
            }, 
            as37, new String[] {
                "equiv", "8801"
            }, as38, as39, as40, new String[] {
                "sup", "8835"
            }, as41, as42, new String[] {
                "oplus", "8853"
            }, new String[] {
                "otimes", "8855"
            }, 
            new String[] {
                "perp", "8869"
            }, new String[] {
                "sdot", "8901"
            }, as43, new String[] {
                "rceil", "8969"
            }, new String[] {
                "lfloor", "8970"
            }, new String[] {
                "rfloor", "8971"
            }, as44, new String[] {
                "rang", "9002"
            }, as45, new String[] {
                "spades", "9824"
            }, 
            as46, as47, as48, new String[] {
                "OElig", "338"
            }, new String[] {
                "oelig", "339"
            }, as49, as50, new String[] {
                "Yuml", "376"
            }, as51, as52, 
            new String[] {
                "ensp", "8194"
            }, new String[] {
                "emsp", "8195"
            }, new String[] {
                "thinsp", "8201"
            }, as53, as54, new String[] {
                "lrm", "8206"
            }, as55, new String[] {
                "ndash", "8211"
            }, new String[] {
                "mdash", "8212"
            }, new String[] {
                "lsquo", "8216"
            }, 
            new String[] {
                "rsquo", "8217"
            }, as56, as57, new String[] {
                "rdquo", "8221"
            }, as58, new String[] {
                "dagger", "8224"
            }, as59, as60, new String[] {
                "lsaquo", "8249"
            }, new String[] {
                "rsaquo", "8250"
            }, 
            as61
        });
        Entities entities = new Entities();
        fillWithHtml40Entities(entities);
        HTML40 = entities;
    }
}
