// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import com.nuance.b.b.em;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.a:
//            aj, ag, o, af, 
//            f, i, a, z

public final class ae
    implements aj
{

    public final String a;
    public final String b;
    public final String c;
    public final Map d;
    public final af e;
    public final Map f;
    public final f g;
    f h;
    Boolean i;
    private final Locale j;
    private final Locale k[];
    private final Map l;
    private int m;
    private final Map n;
    private final String o;

    public transient ae(String s, String s1, String s2, Map map, af af1, f f1, Locale alocale[])
    {
        this(s, s1, s2, map, af1, ((Map) (new HashMap())), f1, alocale);
    }

    private transient ae(String s, String s1, String s2, Map map, af af1, Map map1, f f1, 
            Locale alocale[])
    {
        JSONObject jsonobject;
        l = new HashMap();
        m = ag.a;
        n = new HashMap();
        i = null;
        if (s == null)
        {
            throw new NullPointerException("companyName must not be null");
        }
        if (s1 == null)
        {
            throw new NullPointerException("applicationName must not be null");
        }
        if (s2 == null)
        {
            throw new NullPointerException("applicationVersion must not be null");
        }
        if (map == null)
        {
            throw new NullPointerException("topLevelGrammars must not be null");
        }
        if (af1 == null)
        {
            throw new NullPointerException("grammarCompositionType must not be null");
        }
        if (f1 == null)
        {
            throw new NullPointerException("mainAgency must not be null");
        }
        if (alocale == null)
        {
            throw new NullPointerException("supportedLocales must not be null");
        }
        if (alocale.length == 0)
        {
            throw new IllegalArgumentException("supportedLocales must not be empty");
        }
        j = alocale[0];
        a = s;
        b = s1;
        c = s2;
        d = map;
        e = af1;
        f = map1;
        g = f1;
        k = new Locale[alocale.length];
        int i1 = 0;
        for (int k1 = alocale.length; i1 < k1; i1++)
        {
            k[i1] = alocale[i1];
        }

        a(g, ((f) (null)));
        try
        {
            alocale = new JSONObject();
            jsonobject = new JSONObject();
            jsonobject.put("companyName", s);
            jsonobject.put("applicationName", s1);
            jsonobject.put("applicationVersion", s2);
            if (map.isEmpty())
            {
                throw new IllegalArgumentException("empty topLevelGrammars map");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Should be unreachable.", s);
        }
        s1 = new JSONObject();
        s = new ArrayList(map.keySet());
        Collections.sort(s);
        s2 = s.iterator();
_L1:
        String s3;
        String s4;
        if (!s2.hasNext())
        {
            break MISSING_BLOCK_LABEL_471;
        }
        s3 = (String)s2.next();
        s4 = (String)map.get(s3);
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        if (!"".equals(s3.trim()))
        {
            break MISSING_BLOCK_LABEL_431;
        }
        throw new IllegalArgumentException("null or empty key in topLevelGrammars");
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        if (!"".equals(s4.trim()))
        {
            break MISSING_BLOCK_LABEL_459;
        }
        throw new IllegalArgumentException("null or empty value in topLevelGrammars");
        s1.put(s3, s4);
          goto _L1
        if (!((String)map.get(s.get(0))).contains("</grammar>"))
        {
            break MISSING_BLOCK_LABEL_623;
        }
        alocale.put("globalGrammars", s1);
        s1 = new StringBuilder();
        for (s2 = s.iterator(); s2.hasNext(); s1.append((String)map.get((String)s2.next()))) { }
        s1 = a(s1.toString().getBytes("UTF-8"));
        s2 = new JSONObject();
        for (s = s.iterator(); s.hasNext(); s2.put((String)s.next(), s1)) { }
        break MISSING_BLOCK_LABEL_632;
        s;
        throw new RuntimeException("UnsupportedEncodingException should be impossible for UTF-8.", s);
        jsonobject.put("grammarNames", s1);
        int l1;
        if (map1.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_733;
        }
        s = new JSONObject();
        s1 = (String[])map1.keySet().toArray(new String[map1.size()]);
        l1 = s1.length;
        int j1 = 0;
_L3:
        if (j1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = s1[j1];
        s.put(s2, ((o)map1.get(s2)).a());
        j1++;
        if (true) goto _L3; else goto _L2
_L2:
        alocale.put("filters", s);
        s = new JSONArray();
        s1 = new String[k.length];
        j1 = 0;
        l1 = s1.length;
_L5:
        if (j1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        s1[j1] = k[j1].toString();
        j1++;
        if (true) goto _L5; else goto _L4
_L4:
        Arrays.sort(s1);
        l1 = s1.length;
        j1 = 0;
_L7:
        if (j1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        s.put(s1[j1]);
        j1++;
        if (true) goto _L7; else goto _L6
_L6:
        jsonobject.put("supportedLocales", s);
        jsonobject.put("grammarCompositionEngine", af1.toString());
        alocale.put("application", jsonobject);
        alocale.put("format", "1.0");
        s = new JSONObject();
        s.put("main", f1.toJSONObject());
        alocale.put("executionModel", s);
        o = a(alocale);
        return;
    }

    private static String a(JSONArray jsonarray)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('[');
        int i1 = 0;
        while (i1 < jsonarray.length()) 
        {
            Object obj = jsonarray.get(i1);
            if (obj instanceof String)
            {
                stringbuilder.append('"');
                stringbuilder.append(c((String)obj));
                stringbuilder.append('"');
            } else
            if (obj instanceof JSONObject)
            {
                stringbuilder.append(a((JSONObject)obj));
            } else
            {
                throw new UnsupportedOperationException((new StringBuilder("invalid type for Push-To-Cloud JSON ")).append(obj.getClass().getName()).toString());
            }
            if (i1 < jsonarray.length() - 1)
            {
                stringbuilder.append(',');
            }
            i1++;
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    private static String a(JSONObject jsonobject)
    {
        boolean flag = false;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('{');
        int k1 = jsonobject.length();
        Iterator iterator = jsonobject.keys();
        String as[] = new String[k1];
        for (int i1 = 0; i1 < k1; i1++)
        {
            as[i1] = (String)iterator.next();
        }

        Arrays.sort(as);
        int j1 = ((flag) ? 1 : 0);
        while (j1 < k1) 
        {
            stringbuilder.append('"');
            stringbuilder.append(as[j1]);
            stringbuilder.append("\":");
            Object obj = jsonobject.get(as[j1]);
            if (obj instanceof String)
            {
                stringbuilder.append('"');
                stringbuilder.append(c((String)obj));
                stringbuilder.append('"');
            } else
            if (obj instanceof JSONObject)
            {
                stringbuilder.append(a((JSONObject)obj));
            } else
            if (obj instanceof JSONArray)
            {
                stringbuilder.append(a((JSONArray)obj));
            } else
            {
                throw new UnsupportedOperationException((new StringBuilder("invalid type for Push-To-Cloud JSON ")).append(obj.getClass().getName()).toString());
            }
            if (j1 < k1 - 1)
            {
                stringbuilder.append(',');
            }
            j1++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    private static String a(byte abyte0[])
    {
        Object obj;
        int i1;
        int l1;
        i1 = 0;
        int j1;
        int k1;
        try
        {
            obj = MessageDigest.getInstance("SHA-1");
            ((MessageDigest) (obj)).update(abyte0, 0, abyte0.length);
            abyte0 = ((MessageDigest) (obj)).digest();
            obj = new StringBuilder();
            j1 = abyte0.length;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException("NoSuchAlgorithmException should be impossible for SHA-1.", abyte0);
        }
_L6:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        l1 = abyte0[i1];
        k1 = (l1 & 0xf0) >> 4;
        l1 &= 0xf;
        if (k1 > 9) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append((char)(k1 + 48));
_L4:
        if (l1 > 9)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append((char)(l1 + 48));
        break MISSING_BLOCK_LABEL_157;
_L2:
        ((StringBuilder) (obj)).append((char)((k1 - 10) + 97));
        if (true) goto _L4; else goto _L3
_L3:
        char c1 = (char)((l1 - 10) + 97);
        ((StringBuilder) (obj)).append(c1);
        break MISSING_BLOCK_LABEL_157;
        abyte0 = ((StringBuilder) (obj)).toString();
        return abyte0;
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(a a1)
    {
        if (!(a1 instanceof i)) goto _L2; else goto _L1
_L1:
        a1.b();
_L4:
        return;
_L2:
        if (a1 instanceof f)
        {
            a1 = ((f)a1).getChildren().iterator();
            while (a1.hasNext()) 
            {
                a((a)a1.next());
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(a a1, f f1)
    {
        if (n.containsKey(a1.name))
        {
            if (a1 instanceof f)
            {
                f1 = "Agency";
            } else
            {
                f1 = "Agent";
            }
            throw new IllegalArgumentException((new StringBuilder("Non-unique ")).append(f1).append(" name: '").append(a1.name).append("'").toString());
        }
        n.put(a1.name, a1);
        a1.a = f1;
        if (a1 instanceof f)
        {
            a1 = (f)a1;
            for (f1 = a1.getChildren().iterator(); f1.hasNext(); a((a)f1.next(), ((f) (a1)))) { }
        }
    }

    private static String c(String s)
    {
        Object obj;
        Object obj1;
        int i1;
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("a", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException((new StringBuilder("should be unreachable. ")).append(s.toString()).toString(), s);
        }
        s = ((JSONObject) (obj)).toString();
        s = s.substring(s.indexOf(':') + 1, s.lastIndexOf('"'));
        s = s.substring(s.indexOf('"') + 1);
        obj = new StringBuilder();
        i1 = 0;
        if (i1 >= s.length())
        {
            break MISSING_BLOCK_LABEL_887;
        }
        obj1 = Character.valueOf(s.charAt(i1));
        if (!Character.isISOControl(((Character) (obj1)).charValue())) goto _L2; else goto _L1
_L1:
        ((Character) (obj1)).charValue();
        JVM INSTR tableswitch 8 13: default 132
    //                   8 233
    //                   9 244
    //                   10 255
    //                   11 132
    //                   12 266
    //                   13 277;
           goto _L3 _L4 _L5 _L6 _L3 _L7 _L8
_L3:
        ((StringBuilder) (obj)).append("\\u");
        ((StringBuilder) (obj)).append(((Character) (obj1)).charValue() >> 12 & 0xf);
        ((StringBuilder) (obj)).append(((Character) (obj1)).charValue() >> 8 & 0xf);
        ((StringBuilder) (obj)).append(((Character) (obj1)).charValue() >> 4 & 0xf);
        ((StringBuilder) (obj)).append(((Character) (obj1)).charValue() & 0xf);
_L20:
        i1++;
        break MISSING_BLOCK_LABEL_64;
_L4:
        ((StringBuilder) (obj)).append("\\b");
        continue; /* Loop/switch isn't completed */
_L5:
        ((StringBuilder) (obj)).append("\\t");
        continue; /* Loop/switch isn't completed */
_L6:
        ((StringBuilder) (obj)).append("\\n");
        continue; /* Loop/switch isn't completed */
_L7:
        ((StringBuilder) (obj)).append("\\f");
        continue; /* Loop/switch isn't completed */
_L8:
        ((StringBuilder) (obj)).append("\\r");
        continue; /* Loop/switch isn't completed */
_L2:
label0:
        {
            if ('\\' != ((Character) (obj1)).charValue())
            {
                break MISSING_BLOCK_LABEL_878;
            }
            if (s.length() - 1 == i1)
            {
                throw new IllegalArgumentException("String can't end with \\");
            }
            i1++;
            obj1 = Character.valueOf(s.charAt(i1));
            switch (((Character) (obj1)).charValue())
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Illegal escape sequence \\")).append(obj1).toString());

            case 34: // '"'
                ((StringBuilder) (obj)).append("\\\"");
                break label0;

            case 92: // '\\'
                ((StringBuilder) (obj)).append("\\\\");
                break label0;

            case 47: // '/'
                ((StringBuilder) (obj)).append("/");
                break label0;

            case 98: // 'b'
                ((StringBuilder) (obj)).append("\\b");
                break label0;

            case 102: // 'f'
                ((StringBuilder) (obj)).append("\\f");
                break label0;

            case 110: // 'n'
                ((StringBuilder) (obj)).append("\\n");
                break label0;

            case 114: // 'r'
                ((StringBuilder) (obj)).append("\\r");
                break label0;

            case 116: // 't'
                ((StringBuilder) (obj)).append("\\t");
                break label0;

            case 117: // 'u'
                if (i1 + 5 >= s.length())
                {
                    throw new IllegalArgumentException((new StringBuilder("Illegal unicode escape sequence at ")).append(i1 - 1).toString());
                }
                obj1 = s.substring(i1 + 1, i1 + 5);
                break;
            }
        }
        break MISSING_BLOCK_LABEL_577;
        if (false)
        {
        }
        continue; /* Loop/switch isn't completed */
        int j1;
        try
        {
            j1 = Integer.parseInt(((String) (obj1)), 16);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal unicode escape sequence at ")).append(i1 - 1).toString());
        }
        obj1 = Character.valueOf((char)j1);
        if (!Character.isISOControl(((Character) (obj1)).charValue())) goto _L10; else goto _L9
_L9:
        ((Character) (obj1)).charValue();
        JVM INSTR tableswitch 8 13: default 644
    //                   8 743
    //                   9 754
    //                   10 765
    //                   11 644
    //                   12 776
    //                   13 787;
           goto _L11 _L12 _L13 _L14 _L11 _L15 _L16
_L11:
        ((StringBuilder) (obj)).append("\\u");
        ((StringBuilder) (obj)).append(((Character) (obj1)).charValue() >> 12 & 0xf);
        ((StringBuilder) (obj)).append(((Character) (obj1)).charValue() >> 8 & 0xf);
        ((StringBuilder) (obj)).append(((Character) (obj1)).charValue() >> 4 & 0xf);
        ((StringBuilder) (obj)).append(((Character) (obj1)).charValue() & 0xf);
_L17:
        i1 += 4;
        continue; /* Loop/switch isn't completed */
_L12:
        ((StringBuilder) (obj)).append("\\b");
        continue; /* Loop/switch isn't completed */
_L13:
        ((StringBuilder) (obj)).append("\\t");
        continue; /* Loop/switch isn't completed */
_L14:
        ((StringBuilder) (obj)).append("\\n");
        continue; /* Loop/switch isn't completed */
_L15:
        ((StringBuilder) (obj)).append("\\f");
        continue; /* Loop/switch isn't completed */
_L16:
        ((StringBuilder) (obj)).append("\\r");
        if (true) goto _L17; else goto _L10
_L10:
        switch (((Character) (obj1)).charValue())
        {
        default:
            ((StringBuilder) (obj)).append(obj1);
            break;

        case 47: // '/'
            ((StringBuilder) (obj)).append("/");
            break;

        case 34: // '"'
            ((StringBuilder) (obj)).append("\"");
            break;

        case 92: // '\\'
            ((StringBuilder) (obj)).append("\\");
            break;
        }
        if (true) goto _L17; else goto _L18
_L18:
        ((StringBuilder) (obj)).append(obj1);
        if (true) goto _L20; else goto _L19
_L19:
        return ((StringBuilder) (obj)).toString();
    }

    public final f a(String s)
    {
        s = (a)n.get(s);
        if (s == null)
        {
            return null;
        }
        if (!(s instanceof f))
        {
            return null;
        } else
        {
            return (f)s;
        }
    }

    public final String a()
    {
        return o;
    }

    public final Locale a(Locale locale)
    {
        boolean flag = false;
        if (locale != null) goto _L2; else goto _L1
_L1:
        Locale locale1 = j;
_L6:
        return locale1;
_L2:
        Locale alocale[];
        int i1;
        int j1;
        alocale = k;
        j1 = alocale.length;
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L4; else goto _L3
_L3:
        Locale locale2;
        locale2 = alocale[i1];
        if (!locale.getCountry().equals(locale2.getCountry()))
        {
            continue; /* Loop/switch isn't completed */
        }
        locale1 = locale2;
        if (locale.getLanguage().equals(locale2.getLanguage())) goto _L6; else goto _L5
_L5:
        i1++;
          goto _L7
_L4:
        alocale = k;
        j1 = alocale.length;
        i1 = ((flag) ? 1 : 0);
_L11:
        if (i1 >= j1) goto _L9; else goto _L8
_L8:
        locale2 = alocale[i1];
        if (!"".equals(locale2.getCountry()))
        {
            continue; /* Loop/switch isn't completed */
        }
        locale1 = locale2;
        if (locale.getLanguage().equals(locale2.getLanguage())) goto _L6; else goto _L10
_L10:
        i1++;
          goto _L11
_L9:
        return j;
    }

    public final void a(int i1)
    {
        int j1 = i1;
        if (i1 == 0)
        {
            j1 = ag.a;
        }
        m = j1;
    }

    public final void a(em em1, Locale locale)
    {
        boolean flag1 = false;
        Locale alocale[] = k;
        int j1 = alocale.length;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < j1)
                {
                    if (!alocale[i1].equals(locale))
                    {
                        break label0;
                    }
                    flag = true;
                }
                if (!flag)
                {
                    throw new IllegalArgumentException("locale not in supported locales list");
                } else
                {
                    l.put(locale.toString(), em1);
                    return;
                }
            }
            i1++;
        } while (true);
    }

    public final i b(String s)
    {
        s = (a)n.get(s);
        if (s == null)
        {
            return null;
        }
        if (!(s instanceof i))
        {
            return null;
        } else
        {
            return (i)s;
        }
    }

    public final em b(Locale locale)
    {
        return (em)l.get(locale.toString());
    }

    final Map b()
    {
        return n;
    }

    public final void c()
    {
        a(g);
    }

    public final List getHints(String s, z z)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = (a)n.get(s);
        if (obj == null)
        {
            return arraylist;
        }
        arraylist.addAll(((a) (obj)).getHints(s, z));
        if (ag.b == m || arraylist.isEmpty())
        {
            obj = ((a) (obj)).a;
            if (obj != null)
            {
                arraylist.addAll(((f) (obj)).getHints(s, z));
            }
        }
        return arraylist;
    }
}
