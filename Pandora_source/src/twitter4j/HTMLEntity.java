// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package twitter4j:
//            EntityIndex, UserMentionEntity, URLEntity, HashtagEntity, 
//            MediaEntity

final class HTMLEntity
{

    private static final Map entityEscapeMap;
    private static final Map escapeEntityMap;

    HTMLEntity()
    {
    }

    static String escape(String s)
    {
        s = new StringBuilder(s);
        escape(((StringBuilder) (s)));
        return s.toString();
    }

    static void escape(StringBuilder stringbuilder)
    {
        for (int i = 0; i < stringbuilder.length();)
        {
            String s = (String)entityEscapeMap.get(stringbuilder.substring(i, i + 1));
            if (s != null)
            {
                stringbuilder.replace(i, i + 1, s);
                i = s.length() + i;
            } else
            {
                i++;
            }
        }

    }

    static String unescape(String s)
    {
        String s1 = null;
        if (s != null)
        {
            s = new StringBuilder(s);
            unescape(((StringBuilder) (s)));
            s1 = s.toString();
        }
        return s1;
    }

    static void unescape(StringBuilder stringbuilder)
    {
        int i = 0;
_L6:
        if (i >= stringbuilder.length()) goto _L2; else goto _L1
_L1:
        i = stringbuilder.indexOf("&", i);
        if (-1 != i) goto _L3; else goto _L2
_L2:
        int j;
        return;
_L3:
        if (-1 == (j = stringbuilder.indexOf(";", i))) goto _L2; else goto _L4
_L4:
        String s = stringbuilder.substring(i, j + 1);
        s = (String)escapeEntityMap.get(s);
        if (s != null)
        {
            stringbuilder.replace(i, j + 1, s);
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static String unescapeAndSlideEntityIncdices(String s, UserMentionEntity ausermentionentity[], URLEntity aurlentity[], HashtagEntity ahashtagentity[], MediaEntity amediaentity[])
    {
        char c;
        EntityIndex aentityindex[];
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (ausermentionentity == null)
        {
            i = 0;
        } else
        {
            i = ausermentionentity.length;
        }
        if (aurlentity == null)
        {
            j = 0;
        } else
        {
            j = aurlentity.length;
        }
        if (ahashtagentity == null)
        {
            k = 0;
        } else
        {
            k = ahashtagentity.length;
        }
        if (amediaentity == null)
        {
            l = 0;
        } else
        {
            l = amediaentity.length;
        }
        aentityindex = new EntityIndex[l + (0 + i + j + k)];
        if (ausermentionentity != null)
        {
            System.arraycopy(ausermentionentity, 0, aentityindex, 0, ausermentionentity.length);
            j = ausermentionentity.length + 0;
        } else
        {
            j = 0;
        }
        i = j;
        if (aurlentity != null)
        {
            System.arraycopy(aurlentity, 0, aentityindex, j, aurlentity.length);
            i = j + aurlentity.length;
        }
        j = i;
        if (ahashtagentity != null)
        {
            System.arraycopy(ahashtagentity, 0, aentityindex, i, ahashtagentity.length);
            j = i + ahashtagentity.length;
        }
        if (amediaentity != null)
        {
            System.arraycopy(amediaentity, 0, aentityindex, j, amediaentity.length);
        }
        Arrays.sort(aentityindex);
        ausermentionentity = new StringBuilder(s.length());
        i = 0;
        j = 0;
        l = 1;
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        c = s.charAt(i);
        if (c == '&')
        {
            k = s.indexOf(";", i);
            if (-1 != k)
            {
                aurlentity = s.substring(i, k + 1);
                ahashtagentity = (String)escapeEntityMap.get(aurlentity);
                if (ahashtagentity != null)
                {
                    ausermentionentity.append(ahashtagentity);
                    i1 = 1 - aurlentity.length();
                    i = k;
                    k = i1;
                } else
                {
                    ausermentionentity.append(c);
                    k = 0;
                }
            } else
            {
                ausermentionentity.append(c);
                k = 0;
            }
        } else
        {
            ausermentionentity.append(c);
            k = 0;
        }
        if (j >= aentityindex.length)
        {
            break MISSING_BLOCK_LABEL_463;
        }
        if (l != 0)
        {
            if (aentityindex[j].getStart() != k + i)
            {
                break MISSING_BLOCK_LABEL_463;
            }
            aentityindex[j].setStart(ausermentionentity.length() - 1);
            k = 0;
        } else
        {
            if (aentityindex[j].getEnd() != k + i)
            {
                break MISSING_BLOCK_LABEL_463;
            }
            aentityindex[j].setEnd(ausermentionentity.length() - 1);
            j++;
            k = 1;
        }
_L4:
        i++;
        l = k;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_163;
_L1:
        if (j < aentityindex.length && aentityindex[j].getEnd() == s.length())
        {
            aentityindex[j].setEnd(ausermentionentity.length());
        }
        return ausermentionentity.toString();
        k = l;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        entityEscapeMap = new HashMap();
        escapeEntityMap = new HashMap();
        String as[][] = new String[251][];
        as[0] = (new String[] {
            "&nbsp;", "&#160;", "\240"
        });
        as[1] = (new String[] {
            "&iexcl;", "&#161;", "\241"
        });
        as[2] = (new String[] {
            "&cent;", "&#162;", "\242"
        });
        as[3] = (new String[] {
            "&pound;", "&#163;", "\243"
        });
        as[4] = (new String[] {
            "&curren;", "&#164;", "\244"
        });
        as[5] = (new String[] {
            "&yen;", "&#165;", "\245"
        });
        as[6] = (new String[] {
            "&brvbar;", "&#166;", "\246"
        });
        as[7] = (new String[] {
            "&sect;", "&#167;", "\247"
        });
        as[8] = (new String[] {
            "&uml;", "&#168;", "\250"
        });
        as[9] = (new String[] {
            "&copy;", "&#169;", "\251"
        });
        as[10] = (new String[] {
            "&ordf;", "&#170;", "\252"
        });
        as[11] = (new String[] {
            "&laquo;", "&#171;", "\253"
        });
        as[12] = (new String[] {
            "&not;", "&#172;", "\254"
        });
        as[13] = (new String[] {
            "&shy;", "&#173;", "\255"
        });
        as[14] = (new String[] {
            "&reg;", "&#174;", "\256"
        });
        as[15] = (new String[] {
            "&macr;", "&#175;", "\257"
        });
        as[16] = (new String[] {
            "&deg;", "&#176;", "\260"
        });
        as[17] = (new String[] {
            "&plusmn;", "&#177;", "\261"
        });
        as[18] = (new String[] {
            "&sup2;", "&#178;", "\262"
        });
        as[19] = (new String[] {
            "&sup3;", "&#179;", "\263"
        });
        as[20] = (new String[] {
            "&acute;", "&#180;", "\264"
        });
        as[21] = (new String[] {
            "&micro;", "&#181;", "\265"
        });
        as[22] = (new String[] {
            "&para;", "&#182;", "\266"
        });
        as[23] = (new String[] {
            "&middot;", "&#183;", "\267"
        });
        as[24] = (new String[] {
            "&cedil;", "&#184;", "\270"
        });
        as[25] = (new String[] {
            "&sup1;", "&#185;", "\271"
        });
        as[26] = (new String[] {
            "&ordm;", "&#186;", "\272"
        });
        as[27] = (new String[] {
            "&raquo;", "&#187;", "\273"
        });
        as[28] = (new String[] {
            "&frac14;", "&#188;", "\274"
        });
        as[29] = (new String[] {
            "&frac12;", "&#189;", "\275"
        });
        as[30] = (new String[] {
            "&frac34;", "&#190;", "\276"
        });
        as[31] = (new String[] {
            "&iquest;", "&#191;", "\277"
        });
        as[32] = (new String[] {
            "&Agrave;", "&#192;", "\300"
        });
        as[33] = (new String[] {
            "&Aacute;", "&#193;", "\301"
        });
        as[34] = (new String[] {
            "&Acirc;", "&#194;", "\302"
        });
        as[35] = (new String[] {
            "&Atilde;", "&#195;", "\303"
        });
        as[36] = (new String[] {
            "&Auml;", "&#196;", "\304"
        });
        as[37] = (new String[] {
            "&Aring;", "&#197;", "\305"
        });
        as[38] = (new String[] {
            "&AElig;", "&#198;", "\306"
        });
        as[39] = (new String[] {
            "&Ccedil;", "&#199;", "\307"
        });
        as[40] = (new String[] {
            "&Egrave;", "&#200;", "\310"
        });
        as[41] = (new String[] {
            "&Eacute;", "&#201;", "\311"
        });
        as[42] = (new String[] {
            "&Ecirc;", "&#202;", "\312"
        });
        as[43] = (new String[] {
            "&Euml;", "&#203;", "\313"
        });
        as[44] = (new String[] {
            "&Igrave;", "&#204;", "\314"
        });
        as[45] = (new String[] {
            "&Iacute;", "&#205;", "\315"
        });
        as[46] = (new String[] {
            "&Icirc;", "&#206;", "\316"
        });
        as[47] = (new String[] {
            "&Iuml;", "&#207;", "\317"
        });
        as[48] = (new String[] {
            "&ETH;", "&#208;", "\320"
        });
        as[49] = (new String[] {
            "&Ntilde;", "&#209;", "\321"
        });
        as[50] = (new String[] {
            "&Ograve;", "&#210;", "\322"
        });
        as[51] = (new String[] {
            "&Oacute;", "&#211;", "\323"
        });
        as[52] = (new String[] {
            "&Ocirc;", "&#212;", "\324"
        });
        as[53] = (new String[] {
            "&Otilde;", "&#213;", "\325"
        });
        as[54] = (new String[] {
            "&Ouml;", "&#214;", "\326"
        });
        as[55] = (new String[] {
            "&times;", "&#215;", "\327"
        });
        as[56] = (new String[] {
            "&Oslash;", "&#216;", "\330"
        });
        as[57] = (new String[] {
            "&Ugrave;", "&#217;", "\331"
        });
        as[58] = (new String[] {
            "&Uacute;", "&#218;", "\332"
        });
        as[59] = (new String[] {
            "&Ucirc;", "&#219;", "\333"
        });
        as[60] = (new String[] {
            "&Uuml;", "&#220;", "\334"
        });
        as[61] = (new String[] {
            "&Yacute;", "&#221;", "\335"
        });
        as[62] = (new String[] {
            "&THORN;", "&#222;", "\336"
        });
        as[63] = (new String[] {
            "&szlig;", "&#223;", "\337"
        });
        as[64] = (new String[] {
            "&agrave;", "&#224;", "\340"
        });
        as[65] = (new String[] {
            "&aacute;", "&#225;", "\341"
        });
        as[66] = (new String[] {
            "&acirc;", "&#226;", "\342"
        });
        as[67] = (new String[] {
            "&atilde;", "&#227;", "\343"
        });
        as[68] = (new String[] {
            "&auml;", "&#228;", "\344"
        });
        as[69] = (new String[] {
            "&aring;", "&#229;", "\345"
        });
        as[70] = (new String[] {
            "&aelig;", "&#230;", "\346"
        });
        as[71] = (new String[] {
            "&ccedil;", "&#231;", "\347"
        });
        as[72] = (new String[] {
            "&egrave;", "&#232;", "\350"
        });
        as[73] = (new String[] {
            "&eacute;", "&#233;", "\351"
        });
        as[74] = (new String[] {
            "&ecirc;", "&#234;", "\352"
        });
        as[75] = (new String[] {
            "&euml;", "&#235;", "\353"
        });
        as[76] = (new String[] {
            "&igrave;", "&#236;", "\354"
        });
        as[77] = (new String[] {
            "&iacute;", "&#237;", "\355"
        });
        as[78] = (new String[] {
            "&icirc;", "&#238;", "\356"
        });
        as[79] = (new String[] {
            "&iuml;", "&#239;", "\357"
        });
        as[80] = (new String[] {
            "&eth;", "&#240;", "\360"
        });
        as[81] = (new String[] {
            "&ntilde;", "&#241;", "\361"
        });
        as[82] = (new String[] {
            "&ograve;", "&#242;", "\362"
        });
        as[83] = (new String[] {
            "&oacute;", "&#243;", "\363"
        });
        as[84] = (new String[] {
            "&ocirc;", "&#244;", "\364"
        });
        as[85] = (new String[] {
            "&otilde;", "&#245;", "\365"
        });
        as[86] = (new String[] {
            "&ouml;", "&#246;", "\366"
        });
        as[87] = (new String[] {
            "&divide;", "&#247;", "\367"
        });
        as[88] = (new String[] {
            "&oslash;", "&#248;", "\370"
        });
        as[89] = (new String[] {
            "&ugrave;", "&#249;", "\371"
        });
        as[90] = (new String[] {
            "&uacute;", "&#250;", "\372"
        });
        as[91] = (new String[] {
            "&ucirc;", "&#251;", "\373"
        });
        as[92] = (new String[] {
            "&uuml;", "&#252;", "\374"
        });
        as[93] = (new String[] {
            "&yacute;", "&#253;", "\375"
        });
        as[94] = (new String[] {
            "&thorn;", "&#254;", "\376"
        });
        as[95] = (new String[] {
            "&yuml;", "&#255;", "\377"
        });
        as[96] = (new String[] {
            "&fnof;", "&#402;", "\u0192"
        });
        as[97] = (new String[] {
            "&Alpha;", "&#913;", "\u0391"
        });
        as[98] = (new String[] {
            "&Beta;", "&#914;", "\u0392"
        });
        as[99] = (new String[] {
            "&Gamma;", "&#915;", "\u0393"
        });
        as[100] = (new String[] {
            "&Delta;", "&#916;", "\u0394"
        });
        as[101] = (new String[] {
            "&Epsilon;", "&#917;", "\u0395"
        });
        as[102] = (new String[] {
            "&Zeta;", "&#918;", "\u0396"
        });
        as[103] = (new String[] {
            "&Eta;", "&#919;", "\u0397"
        });
        as[104] = (new String[] {
            "&Theta;", "&#920;", "\u0398"
        });
        as[105] = (new String[] {
            "&Iota;", "&#921;", "\u0399"
        });
        as[106] = (new String[] {
            "&Kappa;", "&#922;", "\u039A"
        });
        as[107] = (new String[] {
            "&Lambda;", "&#923;", "\u039B"
        });
        as[108] = (new String[] {
            "&Mu;", "&#924;", "\u039C"
        });
        as[109] = (new String[] {
            "&Nu;", "&#925;", "\u039D"
        });
        as[110] = (new String[] {
            "&Xi;", "&#926;", "\u039E"
        });
        as[111] = (new String[] {
            "&Omicron;", "&#927;", "\u039F"
        });
        as[112] = (new String[] {
            "&Pi;", "&#928;", "\u03A0"
        });
        as[113] = (new String[] {
            "&Rho;", "&#929;", "\u03A1"
        });
        as[114] = (new String[] {
            "&Sigma;", "&#931;", "\u03A3"
        });
        as[115] = (new String[] {
            "&Tau;", "&#932;", "\u03A4"
        });
        as[116] = (new String[] {
            "&Upsilon;", "&#933;", "\u03A5"
        });
        as[117] = (new String[] {
            "&Phi;", "&#934;", "\u03A6"
        });
        as[118] = (new String[] {
            "&Chi;", "&#935;", "\u03A7"
        });
        as[119] = (new String[] {
            "&Psi;", "&#936;", "\u03A8"
        });
        as[120] = (new String[] {
            "&Omega;", "&#937;", "\u03A9"
        });
        as[121] = (new String[] {
            "&alpha;", "&#945;", "\u03B1"
        });
        as[122] = (new String[] {
            "&beta;", "&#946;", "\u03B2"
        });
        as[123] = (new String[] {
            "&gamma;", "&#947;", "\u03B3"
        });
        as[124] = (new String[] {
            "&delta;", "&#948;", "\u03B4"
        });
        as[125] = (new String[] {
            "&epsilon;", "&#949;", "\u03B5"
        });
        as[126] = (new String[] {
            "&zeta;", "&#950;", "\u03B6"
        });
        as[127] = (new String[] {
            "&eta;", "&#951;", "\u03B7"
        });
        as[128] = (new String[] {
            "&theta;", "&#952;", "\u03B8"
        });
        as[129] = (new String[] {
            "&iota;", "&#953;", "\u03B9"
        });
        as[130] = (new String[] {
            "&kappa;", "&#954;", "\u03BA"
        });
        as[131] = (new String[] {
            "&lambda;", "&#955;", "\u03BB"
        });
        as[132] = (new String[] {
            "&mu;", "&#956;", "\u03BC"
        });
        as[133] = (new String[] {
            "&nu;", "&#957;", "\u03BD"
        });
        as[134] = (new String[] {
            "&xi;", "&#958;", "\u03BE"
        });
        as[135] = (new String[] {
            "&omicron;", "&#959;", "\u03BF"
        });
        as[136] = (new String[] {
            "&pi;", "&#960;", "\u03C0"
        });
        as[137] = (new String[] {
            "&rho;", "&#961;", "\u03C1"
        });
        as[138] = (new String[] {
            "&sigmaf;", "&#962;", "\u03C2"
        });
        as[139] = (new String[] {
            "&sigma;", "&#963;", "\u03C3"
        });
        as[140] = (new String[] {
            "&tau;", "&#964;", "\u03C4"
        });
        as[141] = (new String[] {
            "&upsilon;", "&#965;", "\u03C5"
        });
        as[142] = (new String[] {
            "&phi;", "&#966;", "\u03C6"
        });
        as[143] = (new String[] {
            "&chi;", "&#967;", "\u03C7"
        });
        as[144] = (new String[] {
            "&psi;", "&#968;", "\u03C8"
        });
        as[145] = (new String[] {
            "&omega;", "&#969;", "\u03C9"
        });
        as[146] = (new String[] {
            "&thetasym;", "&#977;", "\u03D1"
        });
        as[147] = (new String[] {
            "&upsih;", "&#978;", "\u03D2"
        });
        as[148] = (new String[] {
            "&piv;", "&#982;", "\u03D6"
        });
        as[149] = (new String[] {
            "&bull;", "&#8226;", "\u2022"
        });
        as[150] = (new String[] {
            "&hellip;", "&#8230;", "\u2026"
        });
        as[151] = (new String[] {
            "&prime;", "&#8242;", "\u2032"
        });
        as[152] = (new String[] {
            "&Prime;", "&#8243;", "\u2033"
        });
        as[153] = (new String[] {
            "&oline;", "&#8254;", "\u203E"
        });
        as[154] = (new String[] {
            "&frasl;", "&#8260;", "\u2044"
        });
        as[155] = (new String[] {
            "&weierp;", "&#8472;", "\u2118"
        });
        as[156] = (new String[] {
            "&image;", "&#8465;", "\u2111"
        });
        as[157] = (new String[] {
            "&real;", "&#8476;", "\u211C"
        });
        as[158] = (new String[] {
            "&trade;", "&#8482;", "\u2122"
        });
        as[159] = (new String[] {
            "&alefsym;", "&#8501;", "\u2135"
        });
        as[160] = (new String[] {
            "&larr;", "&#8592;", "\u2190"
        });
        as[161] = (new String[] {
            "&uarr;", "&#8593;", "\u2191"
        });
        as[162] = (new String[] {
            "&rarr;", "&#8594;", "\u2192"
        });
        as[163] = (new String[] {
            "&darr;", "&#8595;", "\u2193"
        });
        as[164] = (new String[] {
            "&harr;", "&#8596;", "\u2194"
        });
        as[165] = (new String[] {
            "&crarr;", "&#8629;", "\u21B5"
        });
        as[166] = (new String[] {
            "&lArr;", "&#8656;", "\u21D0"
        });
        as[167] = (new String[] {
            "&uArr;", "&#8657;", "\u21D1"
        });
        as[168] = (new String[] {
            "&rArr;", "&#8658;", "\u21D2"
        });
        as[169] = (new String[] {
            "&dArr;", "&#8659;", "\u21D3"
        });
        as[170] = (new String[] {
            "&hArr;", "&#8660;", "\u21D4"
        });
        as[171] = (new String[] {
            "&forall;", "&#8704;", "\u2200"
        });
        as[172] = (new String[] {
            "&part;", "&#8706;", "\u2202"
        });
        as[173] = (new String[] {
            "&exist;", "&#8707;", "\u2203"
        });
        as[174] = (new String[] {
            "&empty;", "&#8709;", "\u2205"
        });
        as[175] = (new String[] {
            "&nabla;", "&#8711;", "\u2207"
        });
        as[176] = (new String[] {
            "&isin;", "&#8712;", "\u2208"
        });
        as[177] = (new String[] {
            "&notin;", "&#8713;", "\u2209"
        });
        as[178] = (new String[] {
            "&ni;", "&#8715;", "\u220B"
        });
        as[179] = (new String[] {
            "&prod;", "&#8719;", "\u220F"
        });
        as[180] = (new String[] {
            "&sum;", "&#8721;", "\u2211"
        });
        as[181] = (new String[] {
            "&minus;", "&#8722;", "\u2212"
        });
        as[182] = (new String[] {
            "&lowast;", "&#8727;", "\u2217"
        });
        as[183] = (new String[] {
            "&radic;", "&#8730;", "\u221A"
        });
        as[184] = (new String[] {
            "&prop;", "&#8733;", "\u221D"
        });
        as[185] = (new String[] {
            "&infin;", "&#8734;", "\u221E"
        });
        as[186] = (new String[] {
            "&ang;", "&#8736;", "\u2220"
        });
        as[187] = (new String[] {
            "&and;", "&#8743;", "\u2227"
        });
        as[188] = (new String[] {
            "&or;", "&#8744;", "\u2228"
        });
        as[189] = (new String[] {
            "&cap;", "&#8745;", "\u2229"
        });
        as[190] = (new String[] {
            "&cup;", "&#8746;", "\u222A"
        });
        as[191] = (new String[] {
            "&int;", "&#8747;", "\u222B"
        });
        as[192] = (new String[] {
            "&there4;", "&#8756;", "\u2234"
        });
        as[193] = (new String[] {
            "&sim;", "&#8764;", "\u223C"
        });
        as[194] = (new String[] {
            "&cong;", "&#8773;", "\u2245"
        });
        as[195] = (new String[] {
            "&asymp;", "&#8776;", "\u2248"
        });
        as[196] = (new String[] {
            "&ne;", "&#8800;", "\u2260"
        });
        as[197] = (new String[] {
            "&equiv;", "&#8801;", "\u2261"
        });
        as[198] = (new String[] {
            "&le;", "&#8804;", "\u2264"
        });
        as[199] = (new String[] {
            "&ge;", "&#8805;", "\u2265"
        });
        as[200] = (new String[] {
            "&sub;", "&#8834;", "\u2282"
        });
        as[201] = (new String[] {
            "&sup;", "&#8835;", "\u2283"
        });
        as[202] = (new String[] {
            "&sube;", "&#8838;", "\u2286"
        });
        as[203] = (new String[] {
            "&supe;", "&#8839;", "\u2287"
        });
        as[204] = (new String[] {
            "&oplus;", "&#8853;", "\u2295"
        });
        as[205] = (new String[] {
            "&otimes;", "&#8855;", "\u2297"
        });
        as[206] = (new String[] {
            "&perp;", "&#8869;", "\u22A5"
        });
        as[207] = (new String[] {
            "&sdot;", "&#8901;", "\u22C5"
        });
        as[208] = (new String[] {
            "&lceil;", "&#8968;", "\u2308"
        });
        as[209] = (new String[] {
            "&rceil;", "&#8969;", "\u2309"
        });
        as[210] = (new String[] {
            "&lfloor;", "&#8970;", "\u230A"
        });
        as[211] = (new String[] {
            "&rfloor;", "&#8971;", "\u230B"
        });
        as[212] = (new String[] {
            "&lang;", "&#9001;", "\u2329"
        });
        as[213] = (new String[] {
            "&rang;", "&#9002;", "\u232A"
        });
        as[214] = (new String[] {
            "&loz;", "&#9674;", "\u25CA"
        });
        as[215] = (new String[] {
            "&spades;", "&#9824;", "\u2660"
        });
        as[216] = (new String[] {
            "&clubs;", "&#9827;", "\u2663"
        });
        as[217] = (new String[] {
            "&hearts;", "&#9829;", "\u2665"
        });
        as[218] = (new String[] {
            "&diams;", "&#9830;", "\u2666"
        });
        as[219] = (new String[] {
            "&quot;", "&#34;", "\""
        });
        as[220] = (new String[] {
            "&amp;", "&#38;", "&"
        });
        as[221] = (new String[] {
            "&lt;", "&#60;", "<"
        });
        as[222] = (new String[] {
            "&gt;", "&#62;", ">"
        });
        as[223] = (new String[] {
            "&OElig;", "&#338;", "\u0152"
        });
        as[224] = (new String[] {
            "&oelig;", "&#339;", "\u0153"
        });
        as[225] = (new String[] {
            "&Scaron;", "&#352;", "\u0160"
        });
        as[226] = (new String[] {
            "&scaron;", "&#353;", "\u0161"
        });
        as[227] = (new String[] {
            "&Yuml;", "&#376;", "\u0178"
        });
        as[228] = (new String[] {
            "&circ;", "&#710;", "\u02C6"
        });
        as[229] = (new String[] {
            "&tilde;", "&#732;", "\u02DC"
        });
        as[230] = (new String[] {
            "&ensp;", "&#8194;", "\u2002"
        });
        as[231] = (new String[] {
            "&emsp;", "&#8195;", "\u2003"
        });
        as[232] = (new String[] {
            "&thinsp;", "&#8201;", "\u2009"
        });
        as[233] = (new String[] {
            "&zwnj;", "&#8204;", "\u200C"
        });
        as[234] = (new String[] {
            "&zwj;", "&#8205;", "\u200D"
        });
        as[235] = (new String[] {
            "&lrm;", "&#8206;", "\u200E"
        });
        as[236] = (new String[] {
            "&rlm;", "&#8207;", "\u200F"
        });
        as[237] = (new String[] {
            "&ndash;", "&#8211;", "\u2013"
        });
        as[238] = (new String[] {
            "&mdash;", "&#8212;", "\u2014"
        });
        as[239] = (new String[] {
            "&lsquo;", "&#8216;", "\u2018"
        });
        as[240] = (new String[] {
            "&rsquo;", "&#8217;", "\u2019"
        });
        as[241] = (new String[] {
            "&sbquo;", "&#8218;", "\u201A"
        });
        as[242] = (new String[] {
            "&ldquo;", "&#8220;", "\u201C"
        });
        as[243] = (new String[] {
            "&rdquo;", "&#8221;", "\u201D"
        });
        as[244] = (new String[] {
            "&bdquo;", "&#8222;", "\u201E"
        });
        as[245] = (new String[] {
            "&dagger;", "&#8224;", "\u2020"
        });
        as[246] = (new String[] {
            "&Dagger;", "&#8225;", "\u2021"
        });
        as[247] = (new String[] {
            "&permil;", "&#8240;", "\u2030"
        });
        as[248] = (new String[] {
            "&lsaquo;", "&#8249;", "\u2039"
        });
        as[249] = (new String[] {
            "&rsaquo;", "&#8250;", "\u203A"
        });
        as[250] = (new String[] {
            "&euro;", "&#8364;", "\u20AC"
        });
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String as1[] = as[i];
            entityEscapeMap.put(as1[2], as1[0]);
            escapeEntityMap.put(as1[0], as1[2]);
            escapeEntityMap.put(as1[1], as1[2]);
        }

    }
}
