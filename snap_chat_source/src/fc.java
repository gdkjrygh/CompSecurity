// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

class fc
{

    private static final Logger a = Logger.getLogger(fc.getName());
    private static final Map b = Collections.synchronizedMap(new HashMap());
    private static final Set c;

    private fc()
    {
    }

    static fh.b a(int i)
    {
        if (!c.contains(Integer.valueOf(i)))
        {
            return null;
        }
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        if (b.containsKey(Integer.valueOf(i))) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = String.valueOf(String.valueOf("/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto_"));
        obj = ff.getResourceAsStream((new StringBuilder(((String) (obj)).length() + 11)).append(((String) (obj))).append(i).toString());
        Object obj1 = new ObjectInputStream(((InputStream) (obj)));
        obj = obj1;
        Object obj2 = new fh.c();
        obj = obj1;
        ((fh.c) (obj2)).readExternal(((java.io.ObjectInput) (obj1)));
        obj = obj1;
        obj2 = ((fh.c) (obj2)).a.iterator();
_L4:
        obj = obj1;
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        fh.b b1 = (fh.b)((Iterator) (obj2)).next();
        obj = obj1;
        b.put(Integer.valueOf(b1.l), b1);
        if (true) goto _L4; else goto _L3
        Object obj3;
        obj3;
_L8:
        obj = obj1;
        a.log(Level.WARNING, ((IOException) (obj3)).toString());
        a(((InputStream) (obj1)));
_L2:
        map;
        JVM INSTR monitorexit ;
        return (fh.b)b.get(Integer.valueOf(i));
_L3:
        a(((InputStream) (obj1)));
          goto _L2
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        obj3 = null;
        obj1 = obj;
_L6:
        a(((InputStream) (obj3)));
        throw obj1;
        obj1;
        obj3 = obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj3;
        obj1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        inputstream.close();
        return;
        inputstream;
        a.log(Level.WARNING, inputstream.toString());
        return;
    }

    static 
    {
        Collections.synchronizedMap(new HashMap());
        HashSet hashset = new HashSet(57);
        hashset.add(Integer.valueOf(7));
        hashset.add(Integer.valueOf(27));
        hashset.add(Integer.valueOf(30));
        hashset.add(Integer.valueOf(31));
        hashset.add(Integer.valueOf(34));
        hashset.add(Integer.valueOf(36));
        hashset.add(Integer.valueOf(43));
        hashset.add(Integer.valueOf(44));
        hashset.add(Integer.valueOf(49));
        hashset.add(Integer.valueOf(54));
        hashset.add(Integer.valueOf(55));
        hashset.add(Integer.valueOf(58));
        hashset.add(Integer.valueOf(61));
        hashset.add(Integer.valueOf(62));
        hashset.add(Integer.valueOf(63));
        hashset.add(Integer.valueOf(66));
        hashset.add(Integer.valueOf(81));
        hashset.add(Integer.valueOf(84));
        hashset.add(Integer.valueOf(90));
        hashset.add(Integer.valueOf(91));
        hashset.add(Integer.valueOf(94));
        hashset.add(Integer.valueOf(95));
        hashset.add(Integer.valueOf(255));
        hashset.add(Integer.valueOf(350));
        hashset.add(Integer.valueOf(351));
        hashset.add(Integer.valueOf(352));
        hashset.add(Integer.valueOf(358));
        hashset.add(Integer.valueOf(359));
        hashset.add(Integer.valueOf(372));
        hashset.add(Integer.valueOf(373));
        hashset.add(Integer.valueOf(380));
        hashset.add(Integer.valueOf(381));
        hashset.add(Integer.valueOf(385));
        hashset.add(Integer.valueOf(505));
        hashset.add(Integer.valueOf(506));
        hashset.add(Integer.valueOf(595));
        hashset.add(Integer.valueOf(675));
        hashset.add(Integer.valueOf(676));
        hashset.add(Integer.valueOf(679));
        hashset.add(Integer.valueOf(855));
        hashset.add(Integer.valueOf(971));
        hashset.add(Integer.valueOf(972));
        hashset.add(Integer.valueOf(995));
        c = hashset;
        hashset = new HashSet(309);
        hashset.add("AC");
        hashset.add("AD");
        hashset.add("AE");
        hashset.add("AF");
        hashset.add("AG");
        hashset.add("AI");
        hashset.add("AL");
        hashset.add("AM");
        hashset.add("AO");
        hashset.add("AR");
        hashset.add("AS");
        hashset.add("AT");
        hashset.add("AU");
        hashset.add("AW");
        hashset.add("AX");
        hashset.add("AZ");
        hashset.add("BA");
        hashset.add("BB");
        hashset.add("BD");
        hashset.add("BE");
        hashset.add("BF");
        hashset.add("BG");
        hashset.add("BH");
        hashset.add("BI");
        hashset.add("BJ");
        hashset.add("BL");
        hashset.add("BM");
        hashset.add("BN");
        hashset.add("BO");
        hashset.add("BQ");
        hashset.add("BR");
        hashset.add("BS");
        hashset.add("BT");
        hashset.add("BW");
        hashset.add("BY");
        hashset.add("BZ");
        hashset.add("CA");
        hashset.add("CC");
        hashset.add("CD");
        hashset.add("CH");
        hashset.add("CI");
        hashset.add("CK");
        hashset.add("CL");
        hashset.add("CM");
        hashset.add("CN");
        hashset.add("CO");
        hashset.add("CR");
        hashset.add("CU");
        hashset.add("CV");
        hashset.add("CW");
        hashset.add("CX");
        hashset.add("CY");
        hashset.add("CZ");
        hashset.add("DE");
        hashset.add("DJ");
        hashset.add("DK");
        hashset.add("DM");
        hashset.add("DO");
        hashset.add("DZ");
        hashset.add("EC");
        hashset.add("EE");
        hashset.add("EG");
        hashset.add("EH");
        hashset.add("ES");
        hashset.add("ET");
        hashset.add("FI");
        hashset.add("FJ");
        hashset.add("FK");
        hashset.add("FM");
        hashset.add("FO");
        hashset.add("FR");
        hashset.add("GA");
        hashset.add("GB");
        hashset.add("GD");
        hashset.add("GE");
        hashset.add("GF");
        hashset.add("GG");
        hashset.add("GH");
        hashset.add("GI");
        hashset.add("GL");
        hashset.add("GM");
        hashset.add("GN");
        hashset.add("GP");
        hashset.add("GR");
        hashset.add("GT");
        hashset.add("GU");
        hashset.add("GW");
        hashset.add("GY");
        hashset.add("HK");
        hashset.add("HN");
        hashset.add("HR");
        hashset.add("HT");
        hashset.add("HU");
        hashset.add("ID");
        hashset.add("IE");
        hashset.add("IL");
        hashset.add("IM");
        hashset.add("IN");
        hashset.add("IQ");
        hashset.add("IR");
        hashset.add("IS");
        hashset.add("IT");
        hashset.add("JE");
        hashset.add("JM");
        hashset.add("JO");
        hashset.add("JP");
        hashset.add("KE");
        hashset.add("KG");
        hashset.add("KH");
        hashset.add("KI");
        hashset.add("KM");
        hashset.add("KN");
        hashset.add("KR");
        hashset.add("KW");
        hashset.add("KY");
        hashset.add("KZ");
        hashset.add("LA");
        hashset.add("LB");
        hashset.add("LC");
        hashset.add("LI");
        hashset.add("LK");
        hashset.add("LR");
        hashset.add("LS");
        hashset.add("LT");
        hashset.add("LU");
        hashset.add("LV");
        hashset.add("LY");
        hashset.add("MA");
        hashset.add("MC");
        hashset.add("MD");
        hashset.add("ME");
        hashset.add("MF");
        hashset.add("MG");
        hashset.add("MH");
        hashset.add("MK");
        hashset.add("ML");
        hashset.add("MM");
        hashset.add("MN");
        hashset.add("MO");
        hashset.add("MP");
        hashset.add("MQ");
        hashset.add("MR");
        hashset.add("MS");
        hashset.add("MT");
        hashset.add("MU");
        hashset.add("MV");
        hashset.add("MW");
        hashset.add("MX");
        hashset.add("MY");
        hashset.add("MZ");
        hashset.add("NA");
        hashset.add("NC");
        hashset.add("NF");
        hashset.add("NG");
        hashset.add("NI");
        hashset.add("NL");
        hashset.add("NO");
        hashset.add("NP");
        hashset.add("NR");
        hashset.add("NU");
        hashset.add("NZ");
        hashset.add("OM");
        hashset.add("PA");
        hashset.add("PE");
        hashset.add("PF");
        hashset.add("PG");
        hashset.add("PH");
        hashset.add("PK");
        hashset.add("PL");
        hashset.add("PM");
        hashset.add("PR");
        hashset.add("PT");
        hashset.add("PW");
        hashset.add("PY");
        hashset.add("QA");
        hashset.add("RE");
        hashset.add("RO");
        hashset.add("RS");
        hashset.add("RU");
        hashset.add("RW");
        hashset.add("SA");
        hashset.add("SB");
        hashset.add("SC");
        hashset.add("SD");
        hashset.add("SE");
        hashset.add("SG");
        hashset.add("SH");
        hashset.add("SI");
        hashset.add("SJ");
        hashset.add("SK");
        hashset.add("SL");
        hashset.add("SM");
        hashset.add("SN");
        hashset.add("SR");
        hashset.add("ST");
        hashset.add("SV");
        hashset.add("SX");
        hashset.add("SY");
        hashset.add("SZ");
        hashset.add("TC");
        hashset.add("TD");
        hashset.add("TG");
        hashset.add("TH");
        hashset.add("TJ");
        hashset.add("TL");
        hashset.add("TM");
        hashset.add("TN");
        hashset.add("TO");
        hashset.add("TR");
        hashset.add("TT");
        hashset.add("TV");
        hashset.add("TW");
        hashset.add("TZ");
        hashset.add("UA");
        hashset.add("UG");
        hashset.add("US");
        hashset.add("UY");
        hashset.add("UZ");
        hashset.add("VA");
        hashset.add("VC");
        hashset.add("VE");
        hashset.add("VG");
        hashset.add("VI");
        hashset.add("VN");
        hashset.add("VU");
        hashset.add("WF");
        hashset.add("WS");
        hashset.add("YE");
        hashset.add("YT");
        hashset.add("ZA");
        hashset.add("ZM");
        hashset.add("ZW");
    }
}
