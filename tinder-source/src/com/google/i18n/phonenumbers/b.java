// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.i18n.phonenumbers;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.i18n.phonenumbers:
//            c, a

public class b
{

    private static b A = null;
    static final Logger a = Logger.getLogger(com/google/i18n/phonenumbers/b.getName());
    static final Pattern b = Pattern.compile("[+\uFF0B]+");
    static final Pattern c = Pattern.compile("[\\\\/] *x");
    static final Pattern d = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    static final String e = e("x\uFF58#\uFF03~\uFF5E");
    static final Pattern f = Pattern.compile("(\\D+)");
    private static final Map g;
    private static final Map h;
    private static final Map i;
    private static final Map j;
    private static final Map k;
    private static final Pattern l = Pattern.compile("[\\d]+(?:[~\u2053\u223C\uFF5E][\\d]+)?");
    private static final String m;
    private static final Pattern n = Pattern.compile("[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]+");
    private static final Pattern o = Pattern.compile("(\\p{Nd})");
    private static final Pattern p = Pattern.compile("[+\uFF0B\\p{Nd}]");
    private static final Pattern q = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    private static final String r;
    private static final String s = e((new StringBuilder(",")).append("x\uFF58#\uFF03~\uFF5E").toString());
    private static final Pattern t = Pattern.compile((new StringBuilder("(?:")).append(s).append(")$").toString(), 66);
    private static final Pattern u;
    private static final Pattern v = Pattern.compile("(\\$\\d)");
    private static final Pattern w = Pattern.compile("\\$NP");
    private static final Pattern x = Pattern.compile("\\$FG");
    private static final Pattern y = Pattern.compile("\\$CC");
    private static final Pattern z = Pattern.compile("\\(?\\$1\\)?");
    private final Map B;
    private final Set C = new HashSet(35);
    private final Map D = Collections.synchronizedMap(new HashMap());
    private final Map E = Collections.synchronizedMap(new HashMap());
    private final c F = new c(100);
    private final Set G = new HashSet(320);
    private final Set H = new HashSet();
    private final String I;

    private b(String s1, Map map)
    {
        I = s1;
        B = map;
        for (s1 = map.entrySet().iterator(); s1.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)s1.next();
            List list = (List)entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0)))
            {
                H.add(entry.getKey());
            } else
            {
                G.addAll(list);
            }
        }

        if (G.remove("001"))
        {
            a.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        C.addAll((Collection)map.get(Integer.valueOf(1)));
    }

    private static Phonemetadata.PhoneMetadataCollection a(ObjectInput objectinput)
    {
        Phonemetadata.PhoneMetadataCollection phonemetadatacollection = new Phonemetadata.PhoneMetadataCollection();
        phonemetadatacollection.readExternal(objectinput);
        objectinput.close();
        return phonemetadatacollection;
        objectinput;
        a.log(Level.WARNING, "error closing input stream (ignored)", objectinput);
        return phonemetadatacollection;
        objectinput;
        return phonemetadatacollection;
        Object obj;
        obj;
        a.log(Level.WARNING, "error reading input (ignored)", ((Throwable) (obj)));
        objectinput.close();
        return phonemetadatacollection;
        objectinput;
        a.log(Level.WARNING, "error closing input stream (ignored)", objectinput);
        return phonemetadatacollection;
        objectinput;
        return phonemetadatacollection;
        obj;
        objectinput.close();
        return phonemetadatacollection;
        objectinput;
        a.log(Level.WARNING, "error closing input stream (ignored)", objectinput);
        return phonemetadatacollection;
        objectinput;
        return phonemetadatacollection;
    }

    public static b a()
    {
        com/google/i18n/phonenumbers/b;
        JVM INSTR monitorenter ;
        if (A != null) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new HashMap(286);
        ArrayList arraylist = new ArrayList(25);
        arraylist.add("US");
        arraylist.add("AG");
        arraylist.add("AI");
        arraylist.add("AS");
        arraylist.add("BB");
        arraylist.add("BM");
        arraylist.add("BS");
        arraylist.add("CA");
        arraylist.add("DM");
        arraylist.add("DO");
        arraylist.add("GD");
        arraylist.add("GU");
        arraylist.add("JM");
        arraylist.add("KN");
        arraylist.add("KY");
        arraylist.add("LC");
        arraylist.add("MP");
        arraylist.add("MS");
        arraylist.add("PR");
        arraylist.add("SX");
        arraylist.add("TC");
        arraylist.add("TT");
        arraylist.add("VC");
        arraylist.add("VG");
        arraylist.add("VI");
        ((Map) (obj)).put(Integer.valueOf(1), arraylist);
        arraylist = new ArrayList(2);
        arraylist.add("RU");
        arraylist.add("KZ");
        ((Map) (obj)).put(Integer.valueOf(7), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("EG");
        ((Map) (obj)).put(Integer.valueOf(20), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("ZA");
        ((Map) (obj)).put(Integer.valueOf(27), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GR");
        ((Map) (obj)).put(Integer.valueOf(30), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("NL");
        ((Map) (obj)).put(Integer.valueOf(31), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BE");
        ((Map) (obj)).put(Integer.valueOf(32), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("FR");
        ((Map) (obj)).put(Integer.valueOf(33), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("ES");
        ((Map) (obj)).put(Integer.valueOf(34), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("HU");
        ((Map) (obj)).put(Integer.valueOf(36), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("IT");
        ((Map) (obj)).put(Integer.valueOf(39), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("RO");
        ((Map) (obj)).put(Integer.valueOf(40), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CH");
        ((Map) (obj)).put(Integer.valueOf(41), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("AT");
        ((Map) (obj)).put(Integer.valueOf(43), arraylist);
        arraylist = new ArrayList(4);
        arraylist.add("GB");
        arraylist.add("GG");
        arraylist.add("IM");
        arraylist.add("JE");
        ((Map) (obj)).put(Integer.valueOf(44), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("DK");
        ((Map) (obj)).put(Integer.valueOf(45), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SE");
        ((Map) (obj)).put(Integer.valueOf(46), arraylist);
        arraylist = new ArrayList(2);
        arraylist.add("NO");
        arraylist.add("SJ");
        ((Map) (obj)).put(Integer.valueOf(47), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("PL");
        ((Map) (obj)).put(Integer.valueOf(48), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("DE");
        ((Map) (obj)).put(Integer.valueOf(49), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("PE");
        ((Map) (obj)).put(Integer.valueOf(51), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MX");
        ((Map) (obj)).put(Integer.valueOf(52), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CU");
        ((Map) (obj)).put(Integer.valueOf(53), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("AR");
        ((Map) (obj)).put(Integer.valueOf(54), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BR");
        ((Map) (obj)).put(Integer.valueOf(55), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CL");
        ((Map) (obj)).put(Integer.valueOf(56), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CO");
        ((Map) (obj)).put(Integer.valueOf(57), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("VE");
        ((Map) (obj)).put(Integer.valueOf(58), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MY");
        ((Map) (obj)).put(Integer.valueOf(60), arraylist);
        arraylist = new ArrayList(3);
        arraylist.add("AU");
        arraylist.add("CC");
        arraylist.add("CX");
        ((Map) (obj)).put(Integer.valueOf(61), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("ID");
        ((Map) (obj)).put(Integer.valueOf(62), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("PH");
        ((Map) (obj)).put(Integer.valueOf(63), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("NZ");
        ((Map) (obj)).put(Integer.valueOf(64), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SG");
        ((Map) (obj)).put(Integer.valueOf(65), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TH");
        ((Map) (obj)).put(Integer.valueOf(66), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("JP");
        ((Map) (obj)).put(Integer.valueOf(81), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("KR");
        ((Map) (obj)).put(Integer.valueOf(82), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("VN");
        ((Map) (obj)).put(Integer.valueOf(84), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CN");
        ((Map) (obj)).put(Integer.valueOf(86), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TR");
        ((Map) (obj)).put(Integer.valueOf(90), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("IN");
        ((Map) (obj)).put(Integer.valueOf(91), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("PK");
        ((Map) (obj)).put(Integer.valueOf(92), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("AF");
        ((Map) (obj)).put(Integer.valueOf(93), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("LK");
        ((Map) (obj)).put(Integer.valueOf(94), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MM");
        ((Map) (obj)).put(Integer.valueOf(95), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("IR");
        ((Map) (obj)).put(Integer.valueOf(98), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SS");
        ((Map) (obj)).put(Integer.valueOf(211), arraylist);
        arraylist = new ArrayList(2);
        arraylist.add("MA");
        arraylist.add("EH");
        ((Map) (obj)).put(Integer.valueOf(212), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("DZ");
        ((Map) (obj)).put(Integer.valueOf(213), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TN");
        ((Map) (obj)).put(Integer.valueOf(216), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("LY");
        ((Map) (obj)).put(Integer.valueOf(218), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GM");
        ((Map) (obj)).put(Integer.valueOf(220), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SN");
        ((Map) (obj)).put(Integer.valueOf(221), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MR");
        ((Map) (obj)).put(Integer.valueOf(222), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("ML");
        ((Map) (obj)).put(Integer.valueOf(223), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GN");
        ((Map) (obj)).put(Integer.valueOf(224), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CI");
        ((Map) (obj)).put(Integer.valueOf(225), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BF");
        ((Map) (obj)).put(Integer.valueOf(226), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("NE");
        ((Map) (obj)).put(Integer.valueOf(227), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TG");
        ((Map) (obj)).put(Integer.valueOf(228), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BJ");
        ((Map) (obj)).put(Integer.valueOf(229), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MU");
        ((Map) (obj)).put(Integer.valueOf(230), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("LR");
        ((Map) (obj)).put(Integer.valueOf(231), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SL");
        ((Map) (obj)).put(Integer.valueOf(232), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GH");
        ((Map) (obj)).put(Integer.valueOf(233), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("NG");
        ((Map) (obj)).put(Integer.valueOf(234), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TD");
        ((Map) (obj)).put(Integer.valueOf(235), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CF");
        ((Map) (obj)).put(Integer.valueOf(236), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CM");
        ((Map) (obj)).put(Integer.valueOf(237), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CV");
        ((Map) (obj)).put(Integer.valueOf(238), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("ST");
        ((Map) (obj)).put(Integer.valueOf(239), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GQ");
        ((Map) (obj)).put(Integer.valueOf(240), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GA");
        ((Map) (obj)).put(Integer.valueOf(241), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CG");
        ((Map) (obj)).put(Integer.valueOf(242), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CD");
        ((Map) (obj)).put(Integer.valueOf(243), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("AO");
        ((Map) (obj)).put(Integer.valueOf(244), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GW");
        ((Map) (obj)).put(Integer.valueOf(245), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("IO");
        ((Map) (obj)).put(Integer.valueOf(246), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("AC");
        ((Map) (obj)).put(Integer.valueOf(247), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SC");
        ((Map) (obj)).put(Integer.valueOf(248), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SD");
        ((Map) (obj)).put(Integer.valueOf(249), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("RW");
        ((Map) (obj)).put(Integer.valueOf(250), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("ET");
        ((Map) (obj)).put(Integer.valueOf(251), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SO");
        ((Map) (obj)).put(Integer.valueOf(252), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("DJ");
        ((Map) (obj)).put(Integer.valueOf(253), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("KE");
        ((Map) (obj)).put(Integer.valueOf(254), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TZ");
        ((Map) (obj)).put(Integer.valueOf(255), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("UG");
        ((Map) (obj)).put(Integer.valueOf(256), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BI");
        ((Map) (obj)).put(Integer.valueOf(257), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MZ");
        ((Map) (obj)).put(Integer.valueOf(258), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("ZM");
        ((Map) (obj)).put(Integer.valueOf(260), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MG");
        ((Map) (obj)).put(Integer.valueOf(261), arraylist);
        arraylist = new ArrayList(2);
        arraylist.add("RE");
        arraylist.add("YT");
        ((Map) (obj)).put(Integer.valueOf(262), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("ZW");
        ((Map) (obj)).put(Integer.valueOf(263), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("NA");
        ((Map) (obj)).put(Integer.valueOf(264), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MW");
        ((Map) (obj)).put(Integer.valueOf(265), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("LS");
        ((Map) (obj)).put(Integer.valueOf(266), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BW");
        ((Map) (obj)).put(Integer.valueOf(267), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SZ");
        ((Map) (obj)).put(Integer.valueOf(268), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("KM");
        ((Map) (obj)).put(Integer.valueOf(269), arraylist);
        arraylist = new ArrayList(2);
        arraylist.add("SH");
        arraylist.add("TA");
        ((Map) (obj)).put(Integer.valueOf(290), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("ER");
        ((Map) (obj)).put(Integer.valueOf(291), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("AW");
        ((Map) (obj)).put(Integer.valueOf(297), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("FO");
        ((Map) (obj)).put(Integer.valueOf(298), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GL");
        ((Map) (obj)).put(Integer.valueOf(299), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GI");
        ((Map) (obj)).put(Integer.valueOf(350), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("PT");
        ((Map) (obj)).put(Integer.valueOf(351), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("LU");
        ((Map) (obj)).put(Integer.valueOf(352), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("IE");
        ((Map) (obj)).put(Integer.valueOf(353), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("IS");
        ((Map) (obj)).put(Integer.valueOf(354), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("AL");
        ((Map) (obj)).put(Integer.valueOf(355), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MT");
        ((Map) (obj)).put(Integer.valueOf(356), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CY");
        ((Map) (obj)).put(Integer.valueOf(357), arraylist);
        arraylist = new ArrayList(2);
        arraylist.add("FI");
        arraylist.add("AX");
        ((Map) (obj)).put(Integer.valueOf(358), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BG");
        ((Map) (obj)).put(Integer.valueOf(359), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("LT");
        ((Map) (obj)).put(Integer.valueOf(370), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("LV");
        ((Map) (obj)).put(Integer.valueOf(371), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("EE");
        ((Map) (obj)).put(Integer.valueOf(372), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MD");
        ((Map) (obj)).put(Integer.valueOf(373), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("AM");
        ((Map) (obj)).put(Integer.valueOf(374), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BY");
        ((Map) (obj)).put(Integer.valueOf(375), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("AD");
        ((Map) (obj)).put(Integer.valueOf(376), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MC");
        ((Map) (obj)).put(Integer.valueOf(377), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SM");
        ((Map) (obj)).put(Integer.valueOf(378), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("VA");
        ((Map) (obj)).put(Integer.valueOf(379), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("UA");
        ((Map) (obj)).put(Integer.valueOf(380), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("RS");
        ((Map) (obj)).put(Integer.valueOf(381), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("ME");
        ((Map) (obj)).put(Integer.valueOf(382), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("HR");
        ((Map) (obj)).put(Integer.valueOf(385), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SI");
        ((Map) (obj)).put(Integer.valueOf(386), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BA");
        ((Map) (obj)).put(Integer.valueOf(387), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MK");
        ((Map) (obj)).put(Integer.valueOf(389), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CZ");
        ((Map) (obj)).put(Integer.valueOf(420), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SK");
        ((Map) (obj)).put(Integer.valueOf(421), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("LI");
        ((Map) (obj)).put(Integer.valueOf(423), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("FK");
        ((Map) (obj)).put(Integer.valueOf(500), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BZ");
        ((Map) (obj)).put(Integer.valueOf(501), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GT");
        ((Map) (obj)).put(Integer.valueOf(502), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SV");
        ((Map) (obj)).put(Integer.valueOf(503), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("HN");
        ((Map) (obj)).put(Integer.valueOf(504), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("NI");
        ((Map) (obj)).put(Integer.valueOf(505), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CR");
        ((Map) (obj)).put(Integer.valueOf(506), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("PA");
        ((Map) (obj)).put(Integer.valueOf(507), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("PM");
        ((Map) (obj)).put(Integer.valueOf(508), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("HT");
        ((Map) (obj)).put(Integer.valueOf(509), arraylist);
        arraylist = new ArrayList(3);
        arraylist.add("GP");
        arraylist.add("BL");
        arraylist.add("MF");
        ((Map) (obj)).put(Integer.valueOf(590), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BO");
        ((Map) (obj)).put(Integer.valueOf(591), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GY");
        ((Map) (obj)).put(Integer.valueOf(592), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("EC");
        ((Map) (obj)).put(Integer.valueOf(593), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GF");
        ((Map) (obj)).put(Integer.valueOf(594), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("PY");
        ((Map) (obj)).put(Integer.valueOf(595), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MQ");
        ((Map) (obj)).put(Integer.valueOf(596), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SR");
        ((Map) (obj)).put(Integer.valueOf(597), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("UY");
        ((Map) (obj)).put(Integer.valueOf(598), arraylist);
        arraylist = new ArrayList(2);
        arraylist.add("CW");
        arraylist.add("BQ");
        ((Map) (obj)).put(Integer.valueOf(599), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TL");
        ((Map) (obj)).put(Integer.valueOf(670), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("NF");
        ((Map) (obj)).put(Integer.valueOf(672), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BN");
        ((Map) (obj)).put(Integer.valueOf(673), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("NR");
        ((Map) (obj)).put(Integer.valueOf(674), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("PG");
        ((Map) (obj)).put(Integer.valueOf(675), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TO");
        ((Map) (obj)).put(Integer.valueOf(676), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SB");
        ((Map) (obj)).put(Integer.valueOf(677), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("VU");
        ((Map) (obj)).put(Integer.valueOf(678), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("FJ");
        ((Map) (obj)).put(Integer.valueOf(679), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("PW");
        ((Map) (obj)).put(Integer.valueOf(680), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("WF");
        ((Map) (obj)).put(Integer.valueOf(681), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("CK");
        ((Map) (obj)).put(Integer.valueOf(682), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("NU");
        ((Map) (obj)).put(Integer.valueOf(683), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("WS");
        ((Map) (obj)).put(Integer.valueOf(685), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("KI");
        ((Map) (obj)).put(Integer.valueOf(686), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("NC");
        ((Map) (obj)).put(Integer.valueOf(687), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TV");
        ((Map) (obj)).put(Integer.valueOf(688), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("PF");
        ((Map) (obj)).put(Integer.valueOf(689), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TK");
        ((Map) (obj)).put(Integer.valueOf(690), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("FM");
        ((Map) (obj)).put(Integer.valueOf(691), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MH");
        ((Map) (obj)).put(Integer.valueOf(692), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("001");
        ((Map) (obj)).put(Integer.valueOf(800), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("001");
        ((Map) (obj)).put(Integer.valueOf(808), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("KP");
        ((Map) (obj)).put(Integer.valueOf(850), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("HK");
        ((Map) (obj)).put(Integer.valueOf(852), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MO");
        ((Map) (obj)).put(Integer.valueOf(853), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("KH");
        ((Map) (obj)).put(Integer.valueOf(855), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("LA");
        ((Map) (obj)).put(Integer.valueOf(856), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("001");
        ((Map) (obj)).put(Integer.valueOf(870), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("001");
        ((Map) (obj)).put(Integer.valueOf(878), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BD");
        ((Map) (obj)).put(Integer.valueOf(880), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("001");
        ((Map) (obj)).put(Integer.valueOf(881), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("001");
        ((Map) (obj)).put(Integer.valueOf(882), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("001");
        ((Map) (obj)).put(Integer.valueOf(883), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TW");
        ((Map) (obj)).put(Integer.valueOf(886), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("001");
        ((Map) (obj)).put(Integer.valueOf(888), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MV");
        ((Map) (obj)).put(Integer.valueOf(960), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("LB");
        ((Map) (obj)).put(Integer.valueOf(961), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("JO");
        ((Map) (obj)).put(Integer.valueOf(962), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SY");
        ((Map) (obj)).put(Integer.valueOf(963), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("IQ");
        ((Map) (obj)).put(Integer.valueOf(964), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("KW");
        ((Map) (obj)).put(Integer.valueOf(965), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("SA");
        ((Map) (obj)).put(Integer.valueOf(966), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("YE");
        ((Map) (obj)).put(Integer.valueOf(967), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("OM");
        ((Map) (obj)).put(Integer.valueOf(968), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("PS");
        ((Map) (obj)).put(Integer.valueOf(970), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("AE");
        ((Map) (obj)).put(Integer.valueOf(971), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("IL");
        ((Map) (obj)).put(Integer.valueOf(972), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BH");
        ((Map) (obj)).put(Integer.valueOf(973), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("QA");
        ((Map) (obj)).put(Integer.valueOf(974), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("BT");
        ((Map) (obj)).put(Integer.valueOf(975), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("MN");
        ((Map) (obj)).put(Integer.valueOf(976), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("NP");
        ((Map) (obj)).put(Integer.valueOf(977), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("001");
        ((Map) (obj)).put(Integer.valueOf(979), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TJ");
        ((Map) (obj)).put(Integer.valueOf(992), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("TM");
        ((Map) (obj)).put(Integer.valueOf(993), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("AZ");
        ((Map) (obj)).put(Integer.valueOf(994), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("GE");
        ((Map) (obj)).put(Integer.valueOf(995), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("KG");
        ((Map) (obj)).put(Integer.valueOf(996), arraylist);
        arraylist = new ArrayList(1);
        arraylist.add("UZ");
        ((Map) (obj)).put(Integer.valueOf(998), arraylist);
        obj = a("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto", ((Map) (obj)));
_L4:
        com/google/i18n/phonenumbers/b;
        JVM INSTR monitorexit ;
        return ((b) (obj));
_L2:
        obj = A;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private static b a(String s1, Map map)
    {
        com/google/i18n/phonenumbers/b;
        JVM INSTR monitorenter ;
        if (A != null)
        {
            throw new IllegalStateException("PhoneNumberUtil instance is already set (you should call resetInstance() first)");
        }
        break MISSING_BLOCK_LABEL_26;
        s1;
        com/google/i18n/phonenumbers/b;
        JVM INSTR monitorexit ;
        throw s1;
        s1 = new b(s1, map);
        A = s1;
        com/google/i18n/phonenumbers/b;
        JVM INSTR monitorexit ;
        return s1;
    }

    private void a(String s1, String s2, int i1)
    {
        Object obj;
        boolean flag;
        flag = "001".equals(s2);
        obj = (new StringBuilder()).append(s1).append("_");
        if (flag)
        {
            s1 = String.valueOf(i1);
        } else
        {
            s1 = s2;
        }
        s1 = ((StringBuilder) (obj)).append(s1).toString();
        obj = com/google/i18n/phonenumbers/b.getResourceAsStream(s1);
        if (obj == null)
        {
            a.log(Level.SEVERE, (new StringBuilder("missing metadata: ")).append(s1).toString());
            throw new IllegalStateException((new StringBuilder("missing metadata: ")).append(s1).toString());
        }
        try
        {
            obj = a(((ObjectInput) (new ObjectInputStream(((java.io.InputStream) (obj)))))).a;
            if (((List) (obj)).isEmpty())
            {
                a.log(Level.SEVERE, (new StringBuilder("empty metadata: ")).append(s1).toString());
                throw new IllegalStateException((new StringBuilder("empty metadata: ")).append(s1).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            a.log(Level.SEVERE, (new StringBuilder("cannot load/parse metadata: ")).append(s1).toString(), s2);
            throw new RuntimeException((new StringBuilder("cannot load/parse metadata: ")).append(s1).toString(), s2);
        }
        if (((List) (obj)).size() > 1)
        {
            a.log(Level.WARNING, (new StringBuilder("invalid metadata (too many entries): ")).append(s1).toString());
        }
        obj = (Phonemetadata.PhoneMetadata)((List) (obj)).get(0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        E.put(Integer.valueOf(i1), obj);
        return;
        D.put(s2, obj);
        return;
    }

    static boolean a(String s1)
    {
        return s1.length() == 0 || z.matcher(s1).matches();
    }

    public static a d(String s1)
    {
        return new a(s1);
    }

    private static String e(String s1)
    {
        return (new StringBuilder(";ext=(\\p{Nd}{1,7})|[ \240\\t,]*(?:e?xt(?:ensi(?:o\u0301?|\363))?n?|\uFF45?\uFF58\uFF54\uFF4E?|[")).append(s1).append("]|int|anexo|\uFF49\uFF4E\uFF54)[:\\.\uFF0E]?[ \240\\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#").toString();
    }

    final int a(StringBuilder stringbuilder, StringBuilder stringbuilder1)
    {
        if (stringbuilder.length() == 0 || stringbuilder.charAt(0) == '0')
        {
            return 0;
        }
        int j1 = stringbuilder.length();
        for (int i1 = 1; i1 <= 3 && i1 <= j1; i1++)
        {
            int k1 = Integer.parseInt(stringbuilder.substring(0, i1));
            if (B.containsKey(Integer.valueOf(k1)))
            {
                stringbuilder1.append(stringbuilder.substring(i1));
                return k1;
            }
        }

        return 0;
    }

    final Phonemetadata.PhoneMetadata a(int i1)
    {
label0:
        {
            synchronized (E)
            {
                if (B.containsKey(Integer.valueOf(i1)))
                {
                    break label0;
                }
            }
            return null;
        }
        if (!E.containsKey(Integer.valueOf(i1)))
        {
            a(I, "001", i1);
        }
        map;
        JVM INSTR monitorexit ;
        return (Phonemetadata.PhoneMetadata)E.get(Integer.valueOf(i1));
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String b(int i1)
    {
        List list = (List)B.get(Integer.valueOf(i1));
        if (list == null)
        {
            return "ZZ";
        } else
        {
            return (String)list.get(0);
        }
    }

    final boolean b(String s1)
    {
        return s1 != null && G.contains(s1);
    }

    final Phonemetadata.PhoneMetadata c(String s1)
    {
        if (!b(s1))
        {
            return null;
        }
        synchronized (D)
        {
            if (!D.containsKey(s1))
            {
                a(I, s1, 0);
            }
        }
        return (Phonemetadata.PhoneMetadata)D.get(s1);
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put(Integer.valueOf(52), "1");
        hashmap.put(Integer.valueOf(54), "9");
        g = Collections.unmodifiableMap(hashmap);
        hashmap = new HashMap();
        hashmap.put(Character.valueOf('0'), Character.valueOf('0'));
        hashmap.put(Character.valueOf('1'), Character.valueOf('1'));
        hashmap.put(Character.valueOf('2'), Character.valueOf('2'));
        hashmap.put(Character.valueOf('3'), Character.valueOf('3'));
        hashmap.put(Character.valueOf('4'), Character.valueOf('4'));
        hashmap.put(Character.valueOf('5'), Character.valueOf('5'));
        hashmap.put(Character.valueOf('6'), Character.valueOf('6'));
        hashmap.put(Character.valueOf('7'), Character.valueOf('7'));
        hashmap.put(Character.valueOf('8'), Character.valueOf('8'));
        hashmap.put(Character.valueOf('9'), Character.valueOf('9'));
        HashMap hashmap1 = new HashMap(40);
        hashmap1.put(Character.valueOf('A'), Character.valueOf('2'));
        hashmap1.put(Character.valueOf('B'), Character.valueOf('2'));
        hashmap1.put(Character.valueOf('C'), Character.valueOf('2'));
        hashmap1.put(Character.valueOf('D'), Character.valueOf('3'));
        hashmap1.put(Character.valueOf('E'), Character.valueOf('3'));
        hashmap1.put(Character.valueOf('F'), Character.valueOf('3'));
        hashmap1.put(Character.valueOf('G'), Character.valueOf('4'));
        hashmap1.put(Character.valueOf('H'), Character.valueOf('4'));
        hashmap1.put(Character.valueOf('I'), Character.valueOf('4'));
        hashmap1.put(Character.valueOf('J'), Character.valueOf('5'));
        hashmap1.put(Character.valueOf('K'), Character.valueOf('5'));
        hashmap1.put(Character.valueOf('L'), Character.valueOf('5'));
        hashmap1.put(Character.valueOf('M'), Character.valueOf('6'));
        hashmap1.put(Character.valueOf('N'), Character.valueOf('6'));
        hashmap1.put(Character.valueOf('O'), Character.valueOf('6'));
        hashmap1.put(Character.valueOf('P'), Character.valueOf('7'));
        hashmap1.put(Character.valueOf('Q'), Character.valueOf('7'));
        hashmap1.put(Character.valueOf('R'), Character.valueOf('7'));
        hashmap1.put(Character.valueOf('S'), Character.valueOf('7'));
        hashmap1.put(Character.valueOf('T'), Character.valueOf('8'));
        hashmap1.put(Character.valueOf('U'), Character.valueOf('8'));
        hashmap1.put(Character.valueOf('V'), Character.valueOf('8'));
        hashmap1.put(Character.valueOf('W'), Character.valueOf('9'));
        hashmap1.put(Character.valueOf('X'), Character.valueOf('9'));
        hashmap1.put(Character.valueOf('Y'), Character.valueOf('9'));
        hashmap1.put(Character.valueOf('Z'), Character.valueOf('9'));
        i = Collections.unmodifiableMap(hashmap1);
        hashmap1 = new HashMap(100);
        hashmap1.putAll(i);
        hashmap1.putAll(hashmap);
        j = Collections.unmodifiableMap(hashmap1);
        hashmap1 = new HashMap();
        hashmap1.putAll(hashmap);
        hashmap1.put(Character.valueOf('+'), Character.valueOf('+'));
        hashmap1.put(Character.valueOf('*'), Character.valueOf('*'));
        h = Collections.unmodifiableMap(hashmap1);
        hashmap1 = new HashMap();
        char c1;
        for (Iterator iterator = i.keySet().iterator(); iterator.hasNext(); hashmap1.put(Character.valueOf(c1), Character.valueOf(c1)))
        {
            c1 = ((Character)iterator.next()).charValue();
            hashmap1.put(Character.valueOf(Character.toLowerCase(c1)), Character.valueOf(c1));
        }

        hashmap1.putAll(hashmap);
        hashmap1.put(Character.valueOf('-'), Character.valueOf('-'));
        hashmap1.put(Character.valueOf('\uFF0D'), Character.valueOf('-'));
        hashmap1.put(Character.valueOf('\u2010'), Character.valueOf('-'));
        hashmap1.put(Character.valueOf('\u2011'), Character.valueOf('-'));
        hashmap1.put(Character.valueOf('\u2012'), Character.valueOf('-'));
        hashmap1.put(Character.valueOf('\u2013'), Character.valueOf('-'));
        hashmap1.put(Character.valueOf('\u2014'), Character.valueOf('-'));
        hashmap1.put(Character.valueOf('\u2015'), Character.valueOf('-'));
        hashmap1.put(Character.valueOf('\u2212'), Character.valueOf('-'));
        hashmap1.put(Character.valueOf('/'), Character.valueOf('/'));
        hashmap1.put(Character.valueOf('\uFF0F'), Character.valueOf('/'));
        hashmap1.put(Character.valueOf(' '), Character.valueOf(' '));
        hashmap1.put(Character.valueOf('\u3000'), Character.valueOf(' '));
        hashmap1.put(Character.valueOf('\u2060'), Character.valueOf(' '));
        hashmap1.put(Character.valueOf('.'), Character.valueOf('.'));
        hashmap1.put(Character.valueOf('\uFF0E'), Character.valueOf('.'));
        k = Collections.unmodifiableMap(hashmap1);
        m = (new StringBuilder()).append(Arrays.toString(i.keySet().toArray()).replaceAll("[, \\[\\]]", "")).append(Arrays.toString(i.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", "")).toString();
        r = (new StringBuilder("\\p{Nd}{2}|[+\uFF0B]*+(?:[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E*]*\\p{Nd}){3,}[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E*")).append(m).append("\\p{Nd}]*").toString();
        u = Pattern.compile((new StringBuilder()).append(r).append("(?:").append(s).append(")?").toString(), 66);
    }
}
