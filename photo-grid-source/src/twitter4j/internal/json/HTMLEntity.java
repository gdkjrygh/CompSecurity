// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import twitter4j.HashtagEntity;
import twitter4j.MediaEntity;
import twitter4j.URLEntity;
import twitter4j.UserMentionEntity;

// Referenced classes of package twitter4j.internal.json:
//            EntityIndex

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
        for (int i = 0; i < stringbuilder.length(); i++)
        {
            i = stringbuilder.indexOf("&", i);
            if (-1 == i)
            {
                break;
            }
            int j = stringbuilder.indexOf(";", i);
            if (-1 == j)
            {
                break;
            }
            String s = stringbuilder.substring(i, j + 1);
            s = (String)escapeEntityMap.get(s);
            if (s != null)
            {
                stringbuilder.replace(i, j + 1, s);
            }
        }

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
        aentityindex = new EntityIndex[l + (i + 0 + j + k)];
        j = 0;
        if (ausermentionentity != null)
        {
            System.arraycopy(ausermentionentity, 0, aentityindex, 0, ausermentionentity.length);
            j = ausermentionentity.length + 0;
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
        l = 1;
        j = 0;
        ausermentionentity = new StringBuilder(s.length());
        i = 0;
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
            break MISSING_BLOCK_LABEL_466;
        }
        if (l != 0)
        {
            if (aentityindex[j].getStart() != k + i)
            {
                break MISSING_BLOCK_LABEL_466;
            }
            aentityindex[j].setStart(ausermentionentity.length() - 1);
            k = 0;
        } else
        {
            if (aentityindex[j].getEnd() != k + i)
            {
                break MISSING_BLOCK_LABEL_466;
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
        break MISSING_BLOCK_LABEL_166;
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
        String as1[] = {
            "&nbsp;", "&#160;", "\240"
        };
        String as2[] = {
            "&iexcl;", "&#161;", "\241"
        };
        String as3[] = {
            "&cent;", "&#162;", "\242"
        };
        String as4[] = {
            "&pound;", "&#163;", "\243"
        };
        String as5[] = {
            "&curren;", "&#164;", "\244"
        };
        String as6[] = {
            "&yen;", "&#165;", "\245"
        };
        String as7[] = {
            "&brvbar;", "&#166;", "\246"
        };
        String as8[] = {
            "&sect;", "&#167;", "\247"
        };
        String as9[] = {
            "&uml;", "&#168;", "\250"
        };
        String as10[] = {
            "&copy;", "&#169;", "\251"
        };
        String as11[] = {
            "&ordf;", "&#170;", "\252"
        };
        String as12[] = {
            "&laquo;", "&#171;", "\253"
        };
        String as13[] = {
            "&not;", "&#172;", "\254"
        };
        String as14[] = {
            "&shy;", "&#173;", "\255"
        };
        String as15[] = {
            "&reg;", "&#174;", "\256"
        };
        String as16[] = {
            "&macr;", "&#175;", "\257"
        };
        String as17[] = {
            "&deg;", "&#176;", "\260"
        };
        String as18[] = {
            "&plusmn;", "&#177;", "\261"
        };
        String as19[] = {
            "&sup2;", "&#178;", "\262"
        };
        String as20[] = {
            "&sup3;", "&#179;", "\263"
        };
        String as21[] = {
            "&acute;", "&#180;", "\264"
        };
        String as22[] = {
            "&micro;", "&#181;", "\265"
        };
        String as23[] = {
            "&para;", "&#182;", "\266"
        };
        String as24[] = {
            "&middot;", "&#183;", "\267"
        };
        String as25[] = {
            "&cedil;", "&#184;", "\270"
        };
        String as26[] = {
            "&sup1;", "&#185;", "\271"
        };
        String as27[] = {
            "&ordm;", "&#186;", "\272"
        };
        String as28[] = {
            "&raquo;", "&#187;", "\273"
        };
        String as29[] = {
            "&frac14;", "&#188;", "\274"
        };
        String as30[] = {
            "&frac12;", "&#189;", "\275"
        };
        String as31[] = {
            "&frac34;", "&#190;", "\276"
        };
        String as32[] = {
            "&iquest;", "&#191;", "\277"
        };
        String as33[] = {
            "&Agrave;", "&#192;", "\300"
        };
        String as34[] = {
            "&Aacute;", "&#193;", "\301"
        };
        String as35[] = {
            "&Acirc;", "&#194;", "\302"
        };
        String as36[] = {
            "&Atilde;", "&#195;", "\303"
        };
        String as37[] = {
            "&Auml;", "&#196;", "\304"
        };
        String as38[] = {
            "&Aring;", "&#197;", "\305"
        };
        String as39[] = {
            "&AElig;", "&#198;", "\306"
        };
        String as40[] = {
            "&Ccedil;", "&#199;", "\307"
        };
        String as41[] = {
            "&Egrave;", "&#200;", "\310"
        };
        String as42[] = {
            "&Eacute;", "&#201;", "\311"
        };
        String as43[] = {
            "&Ecirc;", "&#202;", "\312"
        };
        String as44[] = {
            "&Euml;", "&#203;", "\313"
        };
        String as45[] = {
            "&Igrave;", "&#204;", "\314"
        };
        String as46[] = {
            "&Iacute;", "&#205;", "\315"
        };
        String as47[] = {
            "&Icirc;", "&#206;", "\316"
        };
        String as48[] = {
            "&Iuml;", "&#207;", "\317"
        };
        String as49[] = {
            "&ETH;", "&#208;", "\320"
        };
        String as50[] = {
            "&Ntilde;", "&#209;", "\321"
        };
        String as51[] = {
            "&Ograve;", "&#210;", "\322"
        };
        String as52[] = {
            "&Oacute;", "&#211;", "\323"
        };
        String as53[] = {
            "&Ocirc;", "&#212;", "\324"
        };
        String as54[] = {
            "&Ouml;", "&#214;", "\326"
        };
        String as55[] = {
            "&times;", "&#215;", "\327"
        };
        String as56[] = {
            "&Oslash;", "&#216;", "\330"
        };
        String as57[] = {
            "&Ugrave;", "&#217;", "\331"
        };
        String as58[] = {
            "&Uacute;", "&#218;", "\332"
        };
        String as59[] = {
            "&Ucirc;", "&#219;", "\333"
        };
        String as60[] = {
            "&Uuml;", "&#220;", "\334"
        };
        String as61[] = {
            "&Yacute;", "&#221;", "\335"
        };
        String as62[] = {
            "&THORN;", "&#222;", "\336"
        };
        String as63[] = {
            "&szlig;", "&#223;", "\337"
        };
        String as64[] = {
            "&agrave;", "&#224;", "\340"
        };
        String as65[] = {
            "&aacute;", "&#225;", "\341"
        };
        String as66[] = {
            "&acirc;", "&#226;", "\342"
        };
        String as67[] = {
            "&atilde;", "&#227;", "\343"
        };
        String as68[] = {
            "&auml;", "&#228;", "\344"
        };
        String as69[] = {
            "&aring;", "&#229;", "\345"
        };
        String as70[] = {
            "&aelig;", "&#230;", "\346"
        };
        String as71[] = {
            "&ccedil;", "&#231;", "\347"
        };
        String as72[] = {
            "&egrave;", "&#232;", "\350"
        };
        String as73[] = {
            "&eacute;", "&#233;", "\351"
        };
        String as74[] = {
            "&ecirc;", "&#234;", "\352"
        };
        String as75[] = {
            "&iacute;", "&#237;", "\355"
        };
        String as76[] = {
            "&icirc;", "&#238;", "\356"
        };
        String as77[] = {
            "&iuml;", "&#239;", "\357"
        };
        String as78[] = {
            "&eth;", "&#240;", "\360"
        };
        String as79[] = {
            "&ntilde;", "&#241;", "\361"
        };
        String as80[] = {
            "&ograve;", "&#242;", "\362"
        };
        String as81[] = {
            "&oacute;", "&#243;", "\363"
        };
        String as82[] = {
            "&ocirc;", "&#244;", "\364"
        };
        String as83[] = {
            "&otilde;", "&#245;", "\365"
        };
        String as84[] = {
            "&ouml;", "&#246;", "\366"
        };
        String as85[] = {
            "&divide;", "&#247;", "\367"
        };
        String as86[] = {
            "&oslash;", "&#248;", "\370"
        };
        String as87[] = {
            "&ugrave;", "&#249;", "\371"
        };
        String as88[] = {
            "&uacute;", "&#250;", "\372"
        };
        String as89[] = {
            "&ucirc;", "&#251;", "\373"
        };
        String as90[] = {
            "&uuml;", "&#252;", "\374"
        };
        String as91[] = {
            "&yacute;", "&#253;", "\375"
        };
        String as92[] = {
            "&thorn;", "&#254;", "\376"
        };
        String as93[] = {
            "&yuml;", "&#255;", "\377"
        };
        String as94[] = {
            "&fnof;", "&#402;", "\u0192"
        };
        String as95[] = {
            "&Alpha;", "&#913;", "\u0391"
        };
        String as96[] = {
            "&Gamma;", "&#915;", "\u0393"
        };
        String as97[] = {
            "&Epsilon;", "&#917;", "\u0395"
        };
        String as98[] = {
            "&Zeta;", "&#918;", "\u0396"
        };
        String as99[] = {
            "&Eta;", "&#919;", "\u0397"
        };
        String as100[] = {
            "&Theta;", "&#920;", "\u0398"
        };
        String as101[] = {
            "&Lambda;", "&#923;", "\u039B"
        };
        String as102[] = {
            "&Mu;", "&#924;", "\u039C"
        };
        String as103[] = {
            "&Nu;", "&#925;", "\u039D"
        };
        String as104[] = {
            "&Xi;", "&#926;", "\u039E"
        };
        String as105[] = {
            "&Omicron;", "&#927;", "\u039F"
        };
        String as106[] = {
            "&Pi;", "&#928;", "\u03A0"
        };
        String as107[] = {
            "&Rho;", "&#929;", "\u03A1"
        };
        String as108[] = {
            "&Sigma;", "&#931;", "\u03A3"
        };
        String as109[] = {
            "&Tau;", "&#932;", "\u03A4"
        };
        String as110[] = {
            "&Phi;", "&#934;", "\u03A6"
        };
        String as111[] = {
            "&Chi;", "&#935;", "\u03A7"
        };
        String as112[] = {
            "&Psi;", "&#936;", "\u03A8"
        };
        String as113[] = {
            "&Omega;", "&#937;", "\u03A9"
        };
        String as114[] = {
            "&alpha;", "&#945;", "\u03B1"
        };
        String as115[] = {
            "&gamma;", "&#947;", "\u03B3"
        };
        String as116[] = {
            "&delta;", "&#948;", "\u03B4"
        };
        String as117[] = {
            "&epsilon;", "&#949;", "\u03B5"
        };
        String as118[] = {
            "&zeta;", "&#950;", "\u03B6"
        };
        String as119[] = {
            "&eta;", "&#951;", "\u03B7"
        };
        String as120[] = {
            "&theta;", "&#952;", "\u03B8"
        };
        String as121[] = {
            "&iota;", "&#953;", "\u03B9"
        };
        String as122[] = {
            "&kappa;", "&#954;", "\u03BA"
        };
        String as123[] = {
            "&lambda;", "&#955;", "\u03BB"
        };
        String as124[] = {
            "&mu;", "&#956;", "\u03BC"
        };
        String as125[] = {
            "&nu;", "&#957;", "\u03BD"
        };
        String as126[] = {
            "&xi;", "&#958;", "\u03BE"
        };
        String as127[] = {
            "&omicron;", "&#959;", "\u03BF"
        };
        String as128[] = {
            "&pi;", "&#960;", "\u03C0"
        };
        String as129[] = {
            "&rho;", "&#961;", "\u03C1"
        };
        String as130[] = {
            "&sigmaf;", "&#962;", "\u03C2"
        };
        String as131[] = {
            "&sigma;", "&#963;", "\u03C3"
        };
        String as132[] = {
            "&tau;", "&#964;", "\u03C4"
        };
        String as133[] = {
            "&upsilon;", "&#965;", "\u03C5"
        };
        String as134[] = {
            "&phi;", "&#966;", "\u03C6"
        };
        String as135[] = {
            "&chi;", "&#967;", "\u03C7"
        };
        String as136[] = {
            "&psi;", "&#968;", "\u03C8"
        };
        String as137[] = {
            "&omega;", "&#969;", "\u03C9"
        };
        String as138[] = {
            "&thetasym;", "&#977;", "\u03D1"
        };
        String as139[] = {
            "&upsih;", "&#978;", "\u03D2"
        };
        String as140[] = {
            "&piv;", "&#982;", "\u03D6"
        };
        String as141[] = {
            "&bull;", "&#8226;", "\u2022"
        };
        String as142[] = {
            "&hellip;", "&#8230;", "\u2026"
        };
        String as143[] = {
            "&prime;", "&#8242;", "\u2032"
        };
        String as144[] = {
            "&Prime;", "&#8243;", "\u2033"
        };
        String as145[] = {
            "&oline;", "&#8254;", "\u203E"
        };
        String as146[] = {
            "&frasl;", "&#8260;", "\u2044"
        };
        String as147[] = {
            "&weierp;", "&#8472;", "\u2118"
        };
        String as148[] = {
            "&image;", "&#8465;", "\u2111"
        };
        String as149[] = {
            "&real;", "&#8476;", "\u211C"
        };
        String as150[] = {
            "&trade;", "&#8482;", "\u2122"
        };
        String as151[] = {
            "&alefsym;", "&#8501;", "\u2135"
        };
        String as152[] = {
            "&larr;", "&#8592;", "\u2190"
        };
        String as153[] = {
            "&uarr;", "&#8593;", "\u2191"
        };
        String as154[] = {
            "&darr;", "&#8595;", "\u2193"
        };
        String as155[] = {
            "&harr;", "&#8596;", "\u2194"
        };
        String as156[] = {
            "&crarr;", "&#8629;", "\u21B5"
        };
        String as157[] = {
            "&lArr;", "&#8656;", "\u21D0"
        };
        String as158[] = {
            "&uArr;", "&#8657;", "\u21D1"
        };
        String as159[] = {
            "&rArr;", "&#8658;", "\u21D2"
        };
        String as160[] = {
            "&dArr;", "&#8659;", "\u21D3"
        };
        String as161[] = {
            "&hArr;", "&#8660;", "\u21D4"
        };
        String as162[] = {
            "&forall;", "&#8704;", "\u2200"
        };
        String as163[] = {
            "&part;", "&#8706;", "\u2202"
        };
        String as164[] = {
            "&exist;", "&#8707;", "\u2203"
        };
        String as165[] = {
            "&empty;", "&#8709;", "\u2205"
        };
        String as166[] = {
            "&nabla;", "&#8711;", "\u2207"
        };
        String as167[] = {
            "&isin;", "&#8712;", "\u2208"
        };
        String as168[] = {
            "&notin;", "&#8713;", "\u2209"
        };
        String as169[] = {
            "&ni;", "&#8715;", "\u220B"
        };
        String as170[] = {
            "&prod;", "&#8719;", "\u220F"
        };
        String as171[] = {
            "&minus;", "&#8722;", "\u2212"
        };
        String as172[] = {
            "&lowast;", "&#8727;", "\u2217"
        };
        String as173[] = {
            "&prop;", "&#8733;", "\u221D"
        };
        String as174[] = {
            "&infin;", "&#8734;", "\u221E"
        };
        String as175[] = {
            "&ang;", "&#8736;", "\u2220"
        };
        String as176[] = {
            "&and;", "&#8743;", "\u2227"
        };
        String as177[] = {
            "&or;", "&#8744;", "\u2228"
        };
        String as178[] = {
            "&cap;", "&#8745;", "\u2229"
        };
        String as179[] = {
            "&cup;", "&#8746;", "\u222A"
        };
        String as180[] = {
            "&int;", "&#8747;", "\u222B"
        };
        String as181[] = {
            "&there4;", "&#8756;", "\u2234"
        };
        String as182[] = {
            "&sim;", "&#8764;", "\u223C"
        };
        String as183[] = {
            "&cong;", "&#8773;", "\u2245"
        };
        String as184[] = {
            "&asymp;", "&#8776;", "\u2248"
        };
        String as185[] = {
            "&ne;", "&#8800;", "\u2260"
        };
        String as186[] = {
            "&equiv;", "&#8801;", "\u2261"
        };
        String as187[] = {
            "&le;", "&#8804;", "\u2264"
        };
        String as188[] = {
            "&ge;", "&#8805;", "\u2265"
        };
        String as189[] = {
            "&sub;", "&#8834;", "\u2282"
        };
        String as190[] = {
            "&sup;", "&#8835;", "\u2283"
        };
        String as191[] = {
            "&sube;", "&#8838;", "\u2286"
        };
        String as192[] = {
            "&supe;", "&#8839;", "\u2287"
        };
        String as193[] = {
            "&oplus;", "&#8853;", "\u2295"
        };
        String as194[] = {
            "&otimes;", "&#8855;", "\u2297"
        };
        String as195[] = {
            "&perp;", "&#8869;", "\u22A5"
        };
        String as196[] = {
            "&sdot;", "&#8901;", "\u22C5"
        };
        String as197[] = {
            "&lceil;", "&#8968;", "\u2308"
        };
        String as198[] = {
            "&rceil;", "&#8969;", "\u2309"
        };
        String as199[] = {
            "&lfloor;", "&#8970;", "\u230A"
        };
        String as200[] = {
            "&lang;", "&#9001;", "\u2329"
        };
        String as201[] = {
            "&rang;", "&#9002;", "\u232A"
        };
        String as202[] = {
            "&loz;", "&#9674;", "\u25CA"
        };
        String as203[] = {
            "&spades;", "&#9824;", "\u2660"
        };
        String as204[] = {
            "&clubs;", "&#9827;", "\u2663"
        };
        String as205[] = {
            "&hearts;", "&#9829;", "\u2665"
        };
        String as206[] = {
            "&diams;", "&#9830;", "\u2666"
        };
        String as207[] = {
            "&quot;", "&#34;", "\""
        };
        String as208[] = {
            "&amp;", "&#38;", "&"
        };
        String as209[] = {
            "&lt;", "&#60;", "<"
        };
        String as210[] = {
            "&gt;", "&#62;", ">"
        };
        String as211[] = {
            "&OElig;", "&#338;", "\u0152"
        };
        String as212[] = {
            "&Scaron;", "&#352;", "\u0160"
        };
        String as213[] = {
            "&scaron;", "&#353;", "\u0161"
        };
        String as214[] = {
            "&Yuml;", "&#376;", "\u0178"
        };
        String as215[] = {
            "&circ;", "&#710;", "\u02C6"
        };
        String as216[] = {
            "&tilde;", "&#732;", "\u02DC"
        };
        String as217[] = {
            "&emsp;", "&#8195;", "\u2003"
        };
        String as218[] = {
            "&thinsp;", "&#8201;", "\u2009"
        };
        String as219[] = {
            "&zwnj;", "&#8204;", "\u200C"
        };
        String as220[] = {
            "&zwj;", "&#8205;", "\u200D"
        };
        String as221[] = {
            "&lrm;", "&#8206;", "\u200E"
        };
        String as222[] = {
            "&rlm;", "&#8207;", "\u200F"
        };
        String as223[] = {
            "&ndash;", "&#8211;", "\u2013"
        };
        String as224[] = {
            "&mdash;", "&#8212;", "\u2014"
        };
        String as225[] = {
            "&rsquo;", "&#8217;", "\u2019"
        };
        String as226[] = {
            "&sbquo;", "&#8218;", "\u201A"
        };
        String as227[] = {
            "&ldquo;", "&#8220;", "\u201C"
        };
        String as228[] = {
            "&rdquo;", "&#8221;", "\u201D"
        };
        String as229[] = {
            "&bdquo;", "&#8222;", "\u201E"
        };
        String as230[] = {
            "&dagger;", "&#8224;", "\u2020"
        };
        String as231[] = {
            "&Dagger;", "&#8225;", "\u2021"
        };
        String as232[] = {
            "&permil;", "&#8240;", "\u2030"
        };
        String as233[] = {
            "&lsaquo;", "&#8249;", "\u2039"
        };
        String as234[] = {
            "&rsaquo;", "&#8250;", "\u203A"
        };
        String as235[] = {
            "&euro;", "&#8364;", "\u20AC"
        };
        for (int i = 0; i < 251; i++)
        {
            String as[] = (new String[][] {
                as1, as2, as3, as4, as5, as6, as7, as8, as9, as10, 
                as11, as12, as13, as14, as15, as16, as17, as18, as19, as20, 
                as21, as22, as23, as24, as25, as26, as27, as28, as29, as30, 
                as31, as32, as33, as34, as35, as36, as37, as38, as39, as40, 
                as41, as42, as43, as44, as45, as46, as47, as48, as49, as50, 
                as51, as52, as53, new String[] {
                    "&Otilde;", "&#213;", "\325"
                }, as54, as55, as56, as57, as58, as59, 
                as60, as61, as62, as63, as64, as65, as66, as67, as68, as69, 
                as70, as71, as72, as73, as74, new String[] {
                    "&euml;", "&#235;", "\353"
                }, new String[] {
                    "&igrave;", "&#236;", "\354"
                }, as75, as76, as77, 
                as78, as79, as80, as81, as82, as83, as84, as85, as86, as87, 
                as88, as89, as90, as91, as92, as93, as94, as95, new String[] {
                    "&Beta;", "&#914;", "\u0392"
                }, as96, 
                new String[] {
                    "&Delta;", "&#916;", "\u0394"
                }, as97, as98, as99, as100, new String[] {
                    "&Iota;", "&#921;", "\u0399"
                }, new String[] {
                    "&Kappa;", "&#922;", "\u039A"
                }, as101, as102, as103, 
                as104, as105, as106, as107, as108, as109, new String[] {
                    "&Upsilon;", "&#933;", "\u03A5"
                }, as110, as111, as112, 
                as113, as114, new String[] {
                    "&beta;", "&#946;", "\u03B2"
                }, as115, as116, as117, as118, as119, as120, as121, 
                as122, as123, as124, as125, as126, as127, as128, as129, as130, as131, 
                as132, as133, as134, as135, as136, as137, as138, as139, as140, as141, 
                as142, as143, as144, as145, as146, as147, as148, as149, as150, as151, 
                as152, as153, new String[] {
                    "&rarr;", "&#8594;", "\u2192"
                }, as154, as155, as156, as157, as158, as159, as160, 
                as161, as162, as163, as164, as165, as166, as167, as168, as169, as170, 
                new String[] {
                    "&sum;", "&#8721;", "\u2211"
                }, as171, as172, new String[] {
                    "&radic;", "&#8730;", "\u221A"
                }, as173, as174, as175, as176, as177, as178, 
                as179, as180, as181, as182, as183, as184, as185, as186, as187, as188, 
                as189, as190, as191, as192, as193, as194, as195, as196, as197, as198, 
                as199, new String[] {
                    "&rfloor;", "&#8971;", "\u230B"
                }, as200, as201, as202, as203, as204, as205, as206, as207, 
                as208, as209, as210, as211, new String[] {
                    "&oelig;", "&#339;", "\u0153"
                }, as212, as213, as214, as215, as216, 
                new String[] {
                    "&ensp;", "&#8194;", "\u2002"
                }, as217, as218, as219, as220, as221, as222, as223, as224, new String[] {
                    "&lsquo;", "&#8216;", "\u2018"
                }, 
                as225, as226, as227, as228, as229, as230, as231, as232, as233, as234, 
                as235
            })[i];
            entityEscapeMap.put(as[2], as[0]);
            escapeEntityMap.put(as[0], as[2]);
            escapeEntityMap.put(as[1], as[2]);
        }

    }
}
