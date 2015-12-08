// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
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
                int j = 0;
                int i = 0;
                do
                {
                    if (i >= as.length - 1)
                    {
                        break;
                    }
                    int k = ((String) (obj)).indexOf(';', j);
                    if (k < 0)
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
        Object obj3 = null;
        int i = 0;
        int i1 = s.length();
        do
        {
            Object obj;
label0:
            {
                if (i < i1)
                {
                    obj = Pattern.compile((new StringBuilder()).append("(?:^|\n)").append(charsequence).append("(?:;([^:]*))?:").toString(), 2).matcher(s);
                    int j = i;
                    if (i > 0)
                    {
                        j = i - 1;
                    }
                    if (((Matcher) (obj)).find(j))
                    {
                        break label0;
                    }
                }
                return ((List) (obj3));
            }
            int j1 = ((Matcher) (obj)).end(0);
            String s3 = ((Matcher) (obj)).group(1);
            ArrayList arraylist = null;
            Object obj1 = null;
            boolean flag2 = false;
            i = 0;
            Object obj4 = null;
            obj = null;
            if (s3 != null)
            {
                String as[] = SEMICOLON.split(s3);
                int k1 = as.length;
                int k = 0;
                do
                {
                    arraylist = ((ArrayList) (obj1));
                    flag2 = i;
                    obj4 = obj;
                    if (k >= k1)
                    {
                        break;
                    }
                    obj4 = as[k];
                    arraylist = ((ArrayList) (obj1));
                    if (obj1 == null)
                    {
                        arraylist = new ArrayList(1);
                    }
                    arraylist.add(obj4);
                    obj1 = EQUALS.split(((CharSequence) (obj4)), 2);
                    flag2 = i;
                    obj4 = obj;
                    if (obj1.length > 1)
                    {
                        String s4 = obj1[0];
                        obj1 = obj1[1];
                        if ("ENCODING".equalsIgnoreCase(s4) && "QUOTED-PRINTABLE".equalsIgnoreCase(((String) (obj1))))
                        {
                            flag2 = true;
                            obj4 = obj;
                        } else
                        {
                            flag2 = i;
                            obj4 = obj;
                            if ("CHARSET".equalsIgnoreCase(s4))
                            {
                                obj4 = obj1;
                                flag2 = i;
                            }
                        }
                    }
                    k++;
                    obj1 = arraylist;
                    i = ((flag2) ? 1 : 0);
                    obj = obj4;
                } while (true);
            }
            i = j1;
            int l;
            do
            {
                l = s.indexOf('\n', i);
                if (l < 0)
                {
                    break;
                }
                if (l < s.length() - 1 && (s.charAt(l + 1) == ' ' || s.charAt(l + 1) == '\t'))
                {
                    i = l + 2;
                    continue;
                }
                if (!flag2 || (l < 1 || s.charAt(l - 1) != '=') && (l < 2 || s.charAt(l - 2) != '='))
                {
                    break;
                }
                i = l + 1;
            } while (true);
            if (l < 0)
            {
                i = i1;
            } else
            if (l > j1)
            {
                Object obj2 = obj3;
                if (obj3 == null)
                {
                    obj2 = new ArrayList(1);
                }
                i = l;
                if (l >= 1)
                {
                    i = l;
                    if (s.charAt(l - 1) == '\r')
                    {
                        i = l - 1;
                    }
                }
                obj3 = s.substring(j1, i);
                String s1 = ((String) (obj3));
                if (flag)
                {
                    s1 = ((String) (obj3)).trim();
                }
                if (flag2)
                {
                    obj3 = decodeQuotedPrintable(s1, ((String) (obj4)));
                    s1 = ((String) (obj3));
                    if (flag1)
                    {
                        s1 = UNESCAPED_SEMICOLONS.matcher(((CharSequence) (obj3))).replaceAll("\n").trim();
                    }
                } else
                {
                    String s2 = s1;
                    if (flag1)
                    {
                        s2 = UNESCAPED_SEMICOLONS.matcher(s1).replaceAll("\n").trim();
                    }
                    s1 = CR_LF_SPACE_TAB.matcher(s2).replaceAll("");
                    s1 = NEWLINE_ESCAPE.matcher(s1).replaceAll("\n");
                    s1 = VCARD_ESCAPES.matcher(s1).replaceAll("$1");
                }
                if (arraylist == null)
                {
                    arraylist = new ArrayList(1);
                    arraylist.add(s1);
                    ((List) (obj2)).add(arraylist);
                } else
                {
                    arraylist.add(0, s1);
                    ((List) (obj2)).add(arraylist);
                }
                i++;
                obj3 = obj2;
            } else
            {
                i = l + 1;
            }
        } while (true);
    }

    private static void maybeAppendComponent(String as[], int i, StringBuilder stringbuilder)
    {
        if (as[i] != null && !as[i].isEmpty())
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(' ');
            }
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
                s = new String(abyte0, Charset.forName("UTF-8"));
            } else
            {
                try
                {
                    s = new String(abyte0, s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s = new String(abyte0, Charset.forName("UTF-8"));
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
_L9:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        List list;
        int i;
        list = (List)iterator.next();
        obj = null;
        i = 1;
_L7:
        String s = obj;
        if (i >= list.size()) goto _L4; else goto _L3
_L3:
        int j;
        s = (String)list.get(i);
        j = s.indexOf('=');
        if (j >= 0) goto _L5; else goto _L4
_L4:
        arraylist.add(s);
        continue; /* Loop/switch isn't completed */
_L5:
        if (!"TYPE".equalsIgnoreCase(s.substring(0, j)))
        {
            break; /* Loop/switch isn't completed */
        }
        s = s.substring(j + 1);
        if (true) goto _L4; else goto _L6
_L6:
        i++;
        if (true) goto _L7; else goto _L2
_L2:
        return (String[])arraylist.toArray(new String[collection.size()]);
        if (true) goto _L9; else goto _L8
_L8:
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
        Result result1;
        String as1[];
        List list;
        List list1;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        if (result == null)
        {
            as = null;
        } else
        {
            as = COMMA.split((CharSequence)result.get(0));
        }
        list = matchVCardPrefixedField("TEL", s, true, false);
        list1 = matchVCardPrefixedField("EMAIL", s, true, false);
        list2 = matchSingleVCardPrefixedField("NOTE", s, false, false);
        list3 = matchVCardPrefixedField("ADR", s, true, true);
        list4 = matchSingleVCardPrefixedField("ORG", s, true, true);
        result = matchSingleVCardPrefixedField("BDAY", s, true, false);
        result1 = result;
        if (result != null)
        {
            result1 = result;
            if (!isLikeVCardDate((CharSequence)result.get(0)))
            {
                result1 = null;
            }
        }
        list5 = matchSingleVCardPrefixedField("TITLE", s, true, false);
        list6 = matchVCardPrefixedField("URL", s, true, false);
        list7 = matchSingleVCardPrefixedField("IMPP", s, true, false);
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
        return new AddressBookParsedResult(toPrimaryValues(((Collection) (obj))), as, null, toPrimaryValues(list), toTypes(list), toPrimaryValues(list1), toTypes(list1), toPrimaryValue(list7), toPrimaryValue(list2), toPrimaryValues(list3), toTypes(list3), toPrimaryValue(list4), toPrimaryValue(result1), toPrimaryValue(list5), toPrimaryValues(list6), as1);
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }

}
