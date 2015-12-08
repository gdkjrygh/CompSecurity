// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.zxing.client.result:
//            ResultParser, AddressBookParsedResult, ParsedResult

public final class VCardResultParser extends ResultParser
{

    private static final Pattern BEGIN_VCARD = Pattern.compile("BEGIN:VCARD", 2);
    private static final Pattern COMMA = Pattern.compile(",");
    private static final Pattern CR_LF_SPACE_TAB = Pattern.compile("\r\n[ \t]");
    private static final Pattern EQUALS = Pattern.compile("=");
    private static final Pattern NEWLINE_ESCAPE = Pattern.compile("\\\\[nN]");
    private static final Pattern SEMICOLON = Pattern.compile(";");
    private static final Pattern SEMICOLON_OR_COMMA = Pattern.compile("[;,]");
    private static final Pattern UNESCAPED_SEMICOLONS = Pattern.compile("(?<!\\\\);+");
    private static final Pattern VCARD_ESCAPES = Pattern.compile("\\\\([,;\\\\])");
    private static final Pattern VCARD_LIKE_DATE = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    public VCardResultParser()
    {
    }

    private static String decodeQuotedPrintable(CharSequence charsequence, String s)
    {
        StringBuilder stringbuilder;
        ByteArrayOutputStream bytearrayoutputstream;
        int i;
        int k;
        k = charsequence.length();
        stringbuilder = new StringBuilder(k);
        bytearrayoutputstream = new ByteArrayOutputStream();
        i = 0;
_L8:
        if (i >= k) goto _L2; else goto _L1
_L1:
        char c;
        int j;
        c = charsequence.charAt(i);
        j = i;
        c;
        JVM INSTR lookupswitch 3: default 88
    //                   10: 107
    //                   13: 107
    //                   61: 116;
           goto _L3 _L4 _L4 _L5
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        maybeAppendFragment(bytearrayoutputstream, s, stringbuilder);
        stringbuilder.append(c);
        j = i;
_L6:
        i = j + 1;
        continue; /* Loop/switch isn't completed */
_L5:
        j = i;
        if (i < k - 2)
        {
            char c1 = charsequence.charAt(i + 1);
            j = i;
            if (c1 != '\r')
            {
                j = i;
                if (c1 != '\n')
                {
                    char c2 = charsequence.charAt(i + 2);
                    j = parseHexDigit(c1);
                    int l = parseHexDigit(c2);
                    if (j >= 0 && l >= 0)
                    {
                        bytearrayoutputstream.write((j << 4) + l);
                    }
                    j = i + 2;
                }
            }
        }
        if (true) goto _L6; else goto _L2
_L2:
        maybeAppendFragment(bytearrayoutputstream, s, stringbuilder);
        return stringbuilder.toString();
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void formatNames(Iterable iterable)
    {
        if (iterable != null)
        {
            List list;
            Object obj;
            for (iterable = iterable.iterator(); iterable.hasNext(); list.set(0, ((StringBuilder) (obj)).toString().trim()))
            {
                list = (List)iterable.next();
                obj = (String)list.get(0);
                String as[] = new String[5];
                int i = 0;
                int j = 0;
                do
                {
                    if (i >= as.length - 1)
                    {
                        break;
                    }
                    int k = ((String) (obj)).indexOf(';', j);
                    if (k <= 0)
                    {
                        break;
                    }
                    as[i] = ((String) (obj)).substring(j, k);
                    i++;
                    j = k + 1;
                } while (true);
                as[i] = ((String) (obj)).substring(j);
                obj = new StringBuilder(100);
                maybeAppendComponent(as, 3, ((StringBuilder) (obj)));
                maybeAppendComponent(as, 1, ((StringBuilder) (obj)));
                maybeAppendComponent(as, 2, ((StringBuilder) (obj)));
                maybeAppendComponent(as, 0, ((StringBuilder) (obj)));
                maybeAppendComponent(as, 4, ((StringBuilder) (obj)));
            }

        }
    }

    private static boolean isLikeVCardDate(CharSequence charsequence)
    {
        return charsequence == null || VCARD_LIKE_DATE.matcher(charsequence).matches();
    }

    static List matchSingleVCardPrefixedField(CharSequence charsequence, String s, boolean flag, boolean flag1)
    {
        charsequence = matchVCardPrefixedField(charsequence, s, flag, flag1);
        if (charsequence == null || charsequence.isEmpty())
        {
            return null;
        } else
        {
            return (List)charsequence.get(0);
        }
    }

    static List matchVCardPrefixedField(CharSequence charsequence, String s, boolean flag, boolean flag1)
    {
        Object obj;
        int i;
        int l;
        obj = null;
        i = 0;
        l = s.length();
_L2:
        Object obj2;
        Object obj3;
        int k;
        int i1;
        Object obj1;
label0:
        {
            if (i < l)
            {
                obj1 = Pattern.compile((new StringBuilder()).append("(?:^|\n)").append(charsequence).append("(?:;([^:]*))?:").toString(), 2).matcher(s);
                int j = i;
                if (i > 0)
                {
                    j = i - 1;
                }
                if (((Matcher) (obj1)).find(j))
                {
                    break label0;
                }
            }
            return ((List) (obj));
        }
        i1 = ((Matcher) (obj1)).end(0);
        obj3 = ((Matcher) (obj1)).group(1);
        obj2 = null;
        k = 0;
        i = 0;
        obj1 = null;
        if (obj3 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        String as[] = SEMICOLON.split(((CharSequence) (obj3)));
        int j1 = as.length;
        k = 0;
        while (k < j1) 
        {
            String s3 = as[k];
            obj3 = obj2;
            if (obj2 == null)
            {
                obj3 = new ArrayList(1);
            }
            ((List) (obj3)).add(s3);
            obj2 = EQUALS.split(s3, 2);
            if (obj2.length > 1)
            {
                String s4 = obj2[0];
                obj2 = obj2[1];
                if ("ENCODING".equalsIgnoreCase(s4) && "QUOTED-PRINTABLE".equalsIgnoreCase(((String) (obj2))))
                {
                    i = 1;
                } else
                if ("CHARSET".equalsIgnoreCase(s4))
                {
                    obj1 = obj2;
                }
            }
            k++;
            obj2 = obj3;
        }
        k = i;
        obj3 = obj1;
_L3:
        i = i1;
        int k1;
        do
        {
            k1 = s.indexOf('\n', i);
            if (k1 < 0)
            {
                break;
            }
            if (k1 < s.length() - 1 && (s.charAt(k1 + 1) == ' ' || s.charAt(k1 + 1) == '\t'))
            {
                i = k1 + 2;
                continue;
            }
            if (k == 0 || (k1 < 1 || s.charAt(k1 - 1) != '=') && (k1 < 2 || s.charAt(k1 - 2) != '='))
            {
                break;
            }
            i = k1 + 1;
        } while (true);
        if (k1 < 0)
        {
            i = l;
        } else
        if (k1 > i1)
        {
            if (obj == null)
            {
                obj = new ArrayList(1);
            }
            i = k1;
            if (k1 >= 1)
            {
                i = k1;
                if (s.charAt(k1 - 1) == '\r')
                {
                    i = k1 - 1;
                }
            }
            String s2 = s.substring(i1, i);
            String s1 = s2;
            if (flag)
            {
                s1 = s2.trim();
            }
            if (k != 0)
            {
                obj3 = decodeQuotedPrintable(s1, ((String) (obj3)));
                s1 = ((String) (obj3));
                if (flag1)
                {
                    s1 = UNESCAPED_SEMICOLONS.matcher(((CharSequence) (obj3))).replaceAll("\n").trim();
                }
            } else
            {
                obj3 = s1;
                if (flag1)
                {
                    obj3 = UNESCAPED_SEMICOLONS.matcher(s1).replaceAll("\n").trim();
                }
                s1 = CR_LF_SPACE_TAB.matcher(((CharSequence) (obj3))).replaceAll("");
                s1 = NEWLINE_ESCAPE.matcher(s1).replaceAll("\n");
                s1 = VCARD_ESCAPES.matcher(s1).replaceAll("$1");
            }
            if (obj2 == null)
            {
                obj2 = new ArrayList(1);
                ((List) (obj2)).add(s1);
                ((List) (obj)).add(obj2);
            } else
            {
                ((List) (obj2)).add(0, s1);
                ((List) (obj)).add(obj2);
            }
            i++;
        } else
        {
            i = k1 + 1;
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj3 = null;
        obj2 = null;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private static void maybeAppendComponent(String as[], int i, StringBuilder stringbuilder)
    {
        if (as[i] != null)
        {
            stringbuilder.append(' ');
            stringbuilder.append(as[i]);
        }
    }

    private static void maybeAppendFragment(ByteArrayOutputStream bytearrayoutputstream, String s, StringBuilder stringbuilder)
    {
        if (bytearrayoutputstream.size() > 0)
        {
            byte abyte0[] = bytearrayoutputstream.toByteArray();
            if (s == null)
            {
                s = new String(abyte0);
            } else
            {
                try
                {
                    s = new String(abyte0, s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s = new String(abyte0);
                }
            }
            bytearrayoutputstream.reset();
            stringbuilder.append(s);
        }
    }

    private static String toPrimaryValue(List list)
    {
        if (list == null || list.isEmpty())
        {
            return null;
        } else
        {
            return (String)list.get(0);
        }
    }

    private static String[] toPrimaryValues(Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            return null;
        }
        ArrayList arraylist = new ArrayList(collection.size());
        Iterator iterator = collection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)((List)iterator.next()).get(0);
            if (s != null && !s.isEmpty())
            {
                arraylist.add(s);
            }
        } while (true);
        return (String[])arraylist.toArray(new String[collection.size()]);
    }

    private static String[] toTypes(Collection collection)
    {
        ArrayList arraylist;
        Iterator iterator;
        if (collection == null || collection.isEmpty())
        {
            return null;
        }
        arraylist = new ArrayList(collection.size());
        iterator = collection.iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        List list;
        int i;
        list = (List)iterator.next();
        i = 1;
_L4:
        String s;
        if (i >= list.size())
        {
            break MISSING_BLOCK_LABEL_164;
        }
        s = (String)list.get(i);
        int j = s.indexOf('=');
        if (j >= 0)
        {
label0:
            {
                if (!"TYPE".equalsIgnoreCase(s.substring(0, j)))
                {
                    break label0;
                }
                s = s.substring(j + 1);
            }
        }
_L5:
        arraylist.add(s);
          goto _L3
        i++;
          goto _L4
_L2:
        return (String[])arraylist.toArray(new String[collection.size()]);
        s = null;
          goto _L5
    }

    public AddressBookParsedResult parse(Result result)
    {
        String s = getMassagedText(result);
        result = BEGIN_VCARD.matcher(s);
        if (!result.find() || result.start() != 0)
        {
            return null;
        }
        result = matchVCardPrefixedField("FN", s, true, false);
        Object obj = result;
        if (result == null)
        {
            obj = matchVCardPrefixedField("N", s, true, false);
            formatNames(((Iterable) (obj)));
        }
        result = matchSingleVCardPrefixedField("NICKNAME", s, true, false);
        String as[];
        List list;
        String as1[];
        List list1;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        if (result == null)
        {
            as = null;
        } else
        {
            as = COMMA.split((CharSequence)result.get(0));
        }
        list1 = matchVCardPrefixedField("TEL", s, true, false);
        list2 = matchVCardPrefixedField("EMAIL", s, true, false);
        list3 = matchSingleVCardPrefixedField("NOTE", s, false, false);
        list4 = matchVCardPrefixedField("ADR", s, true, true);
        list5 = matchSingleVCardPrefixedField("ORG", s, true, true);
        list = matchSingleVCardPrefixedField("BDAY", s, true, false);
        if (list != null && !isLikeVCardDate((CharSequence)list.get(0)))
        {
            list = null;
        }
        list6 = matchSingleVCardPrefixedField("TITLE", s, true, false);
        list7 = matchVCardPrefixedField("URL", s, true, false);
        list8 = matchSingleVCardPrefixedField("IMPP", s, true, false);
        result = matchSingleVCardPrefixedField("GEO", s, true, false);
        if (result == null)
        {
            result = null;
        } else
        {
            result = SEMICOLON_OR_COMMA.split((CharSequence)result.get(0));
        }
        as1 = result;
        if (result != null)
        {
            as1 = result;
            if (result.length != 2)
            {
                as1 = null;
            }
        }
        return new AddressBookParsedResult(toPrimaryValues(((Collection) (obj))), as, null, toPrimaryValues(list1), toTypes(list1), toPrimaryValues(list2), toTypes(list2), toPrimaryValue(list8), toPrimaryValue(list3), toPrimaryValues(list4), toTypes(list4), toPrimaryValue(list5), toPrimaryValue(list), toPrimaryValue(list6), toPrimaryValues(list7), as1);
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }

}
