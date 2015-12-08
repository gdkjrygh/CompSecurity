// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;

import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

// Referenced classes of package org.apache.commons.lang3.text:
//            FormatFactory, StrMatcher

public class ExtendedMessageFormat extends MessageFormat
{

    private static final String DUMMY_PATTERN = "";
    private static final char END_FE = 125;
    private static final String ESCAPED_QUOTE = "''";
    private static final int HASH_SEED = 31;
    private static final char QUOTE = 39;
    private static final char START_FE = 123;
    private static final char START_FMT = 44;
    private static final long serialVersionUID = 0xdf38519104e1c7e1L;
    private final Map registry;
    private String toPattern;

    public ExtendedMessageFormat(String s)
    {
        this(s, Locale.getDefault());
    }

    public ExtendedMessageFormat(String s, Locale locale)
    {
        this(s, locale, null);
    }

    public ExtendedMessageFormat(String s, Locale locale, Map map)
    {
        super("");
        setLocale(locale);
        registry = map;
        applyPattern(s);
    }

    public ExtendedMessageFormat(String s, Map map)
    {
        this(s, Locale.getDefault(), map);
    }

    private StringBuilder appendQuotedString(String s, ParsePosition parseposition, StringBuilder stringbuilder, boolean flag)
    {
        char ac[];
        int k;
        k = parseposition.getIndex();
        ac = s.toCharArray();
        if (!flag || ac[k] != '\'') goto _L2; else goto _L1
_L1:
        next(parseposition);
        if (stringbuilder != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return stringbuilder.append('\'');
_L2:
        int j = k;
        int i = parseposition.getIndex();
        while (i < s.length()) 
        {
            if (flag && s.substring(i).startsWith("''"))
            {
                stringbuilder.append(ac, j, parseposition.getIndex() - j).append('\'');
                parseposition.setIndex("''".length() + i);
                j = parseposition.getIndex();
            } else
            {
                switch (ac[parseposition.getIndex()])
                {
                default:
                    next(parseposition);
                    break;

                case 39: // '\''
                    next(parseposition);
                    if (stringbuilder != null)
                    {
                        return stringbuilder.append(ac, j, parseposition.getIndex() - j);
                    }
                    continue; /* Loop/switch isn't completed */
                }
            }
            i++;
        }
        throw new IllegalArgumentException((new StringBuilder()).append("Unterminated quoted string at position ").append(k).toString());
        if (true) goto _L3; else goto _L5
_L5:
    }

    private boolean containsElements(Collection collection)
    {
        if (collection != null && !collection.isEmpty())
        {
            collection = collection.iterator();
            while (collection.hasNext()) 
            {
                if (collection.next() != null)
                {
                    return true;
                }
            }
        }
        return false;
    }

    private Format getFormat(String s)
    {
        if (registry != null)
        {
            String s2 = s;
            String s1 = null;
            int i = s.indexOf(',');
            if (i > 0)
            {
                s2 = s.substring(0, i).trim();
                s1 = s.substring(i + 1).trim();
            }
            s = (FormatFactory)registry.get(s2);
            if (s != null)
            {
                return s.getFormat(s2, s1, getLocale());
            }
        }
        return null;
    }

    private void getQuotedString(String s, ParsePosition parseposition, boolean flag)
    {
        appendQuotedString(s, parseposition, null, flag);
    }

    private String insertFormats(String s, ArrayList arraylist)
    {
        StringBuilder stringbuilder;
        ParsePosition parseposition;
        int i;
        int j;
        if (!containsElements(arraylist))
        {
            return s;
        }
        stringbuilder = new StringBuilder(s.length() * 2);
        parseposition = new ParsePosition(0);
        j = -1;
        i = 0;
_L8:
        if (parseposition.getIndex() >= s.length()) goto _L2; else goto _L1
_L1:
        char c = s.charAt(parseposition.getIndex());
        c;
        JVM INSTR lookupswitch 3: default 100
    //                   39: 117
    //                   123: 131
    //                   125: 223;
           goto _L3 _L4 _L5 _L6
_L3:
        stringbuilder.append(c);
        next(parseposition);
        continue; /* Loop/switch isn't completed */
_L4:
        appendQuotedString(s, parseposition, stringbuilder, false);
        continue; /* Loop/switch isn't completed */
_L5:
        int k = i + 1;
        i = k;
        if (k == 1)
        {
            int l = j + 1;
            stringbuilder.append('{').append(readArgumentIndex(s, next(parseposition)));
            String s1 = (String)arraylist.get(l);
            i = k;
            j = l;
            if (s1 != null)
            {
                stringbuilder.append(',').append(s1);
                i = k;
                j = l;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        i--;
        if (true) goto _L3; else goto _L2
_L2:
        return stringbuilder.toString();
        if (true) goto _L8; else goto _L7
_L7:
    }

    private ParsePosition next(ParsePosition parseposition)
    {
        parseposition.setIndex(parseposition.getIndex() + 1);
        return parseposition;
    }

    private String parseFormatDescription(String s, ParsePosition parseposition)
    {
        int i;
        int k;
        int l;
        k = parseposition.getIndex();
        seekNonWs(s, parseposition);
        l = parseposition.getIndex();
        i = 1;
_L6:
        if (parseposition.getIndex() >= s.length())
        {
            break MISSING_BLOCK_LABEL_122;
        }
        s.charAt(parseposition.getIndex());
        JVM INSTR lookupswitch 3: default 72
    //                   39: 112
    //                   123: 81
    //                   125: 88;
           goto _L1 _L2 _L3 _L4
_L2:
        break MISSING_BLOCK_LABEL_112;
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break; /* Loop/switch isn't completed */
_L7:
        next(parseposition);
        if (true) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        int j = i - 1;
        i = j;
        if (j == 0)
        {
            return s.substring(l, parseposition.getIndex());
        }
          goto _L7
        getQuotedString(s, parseposition, false);
          goto _L7
        throw new IllegalArgumentException((new StringBuilder()).append("Unterminated format element at position ").append(k).toString());
    }

    private int readArgumentIndex(String s, ParsePosition parseposition)
    {
        StringBuffer stringbuffer;
        int i;
        int j;
        j = parseposition.getIndex();
        seekNonWs(s, parseposition);
        stringbuffer = new StringBuffer();
        i = 0;
_L2:
        char c;
        if (i != 0 || parseposition.getIndex() >= s.length())
        {
            break MISSING_BLOCK_LABEL_170;
        }
        char c1 = s.charAt(parseposition.getIndex());
        c = c1;
        if (!Character.isWhitespace(c1))
        {
            break; /* Loop/switch isn't completed */
        }
        seekNonWs(s, parseposition);
        c1 = s.charAt(parseposition.getIndex());
        c = c1;
        if (c1 == ',')
        {
            break; /* Loop/switch isn't completed */
        }
        c = c1;
        if (c1 == '}')
        {
            break; /* Loop/switch isn't completed */
        }
        i = 1;
_L3:
        next(parseposition);
        if (true) goto _L2; else goto _L1
_L1:
        if (c != ',' && c != '}' || stringbuffer.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        i = Integer.parseInt(stringbuffer.toString());
        return i;
        NumberFormatException numberformatexception;
        numberformatexception;
        if (!Character.isDigit(c))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        stringbuffer.append(c);
          goto _L3
        if (i != 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid format argument index at position ").append(j).append(": ").append(s.substring(j, parseposition.getIndex())).toString());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unterminated format element at position ").append(j).toString());
        }
    }

    private void seekNonWs(String s, ParsePosition parseposition)
    {
        char ac[] = s.toCharArray();
        int i;
        do
        {
            i = StrMatcher.splitMatcher().isMatch(ac, parseposition.getIndex());
            parseposition.setIndex(parseposition.getIndex() + i);
        } while (i > 0 && parseposition.getIndex() < s.length());
    }

    public final void applyPattern(String s)
    {
        if (registry != null) goto _L2; else goto _L1
_L1:
        super.applyPattern(s);
        toPattern = super.toPattern();
_L11:
        return;
_L2:
        ArrayList arraylist;
        ArrayList arraylist1;
        StringBuilder stringbuilder;
        ParsePosition parseposition;
        char ac[];
        int i;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        stringbuilder = new StringBuilder(s.length());
        parseposition = new ParsePosition(0);
        ac = s.toCharArray();
        i = 0;
_L8:
        if (parseposition.getIndex() >= s.length()) goto _L4; else goto _L3
_L3:
        ac[parseposition.getIndex()];
        JVM INSTR lookupswitch 2: default 116
    //                   39: 140
    //                   123: 154;
           goto _L5 _L6 _L7
_L5:
        stringbuilder.append(ac[parseposition.getIndex()]);
        next(parseposition);
          goto _L8
_L6:
        appendQuotedString(s, parseposition, stringbuilder, true);
          goto _L8
_L7:
        i++;
        seekNonWs(s, parseposition);
        int k = parseposition.getIndex();
        int l = readArgumentIndex(s, next(parseposition));
        stringbuilder.append('{').append(l);
        seekNonWs(s, parseposition);
        Format format = null;
        String s1 = null;
        if (ac[parseposition.getIndex()] == ',')
        {
            String s2 = parseFormatDescription(s, next(parseposition));
            Format format2 = getFormat(s2);
            format = format2;
            s1 = s2;
            if (format2 == null)
            {
                stringbuilder.append(',').append(s2);
                s1 = s2;
                format = format2;
            }
        }
        arraylist.add(format);
        if (format == null)
        {
            s1 = null;
        }
        arraylist1.add(s1);
        boolean flag;
        if (arraylist.size() == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Validate.isTrue(flag);
        if (arraylist1.size() == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Validate.isTrue(flag);
        if (ac[parseposition.getIndex()] == '}') goto _L5; else goto _L9
_L9:
        throw new IllegalArgumentException((new StringBuilder()).append("Unreadable format element at position ").append(k).toString());
_L4:
        super.applyPattern(stringbuilder.toString());
        toPattern = insertFormats(super.toPattern(), arraylist1);
        if (containsElements(arraylist))
        {
            s = getFormats();
            int j = 0;
            for (Iterator iterator = arraylist.iterator(); iterator.hasNext();)
            {
                Format format1 = (Format)iterator.next();
                if (format1 != null)
                {
                    s[j] = format1;
                }
                j++;
            }

            super.setFormats(s);
            return;
        }
        if (true) goto _L11; else goto _L10
_L10:
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            if (ObjectUtils.notEqual(getClass(), obj.getClass()))
            {
                return false;
            }
            obj = (ExtendedMessageFormat)obj;
            if (ObjectUtils.notEqual(toPattern, ((ExtendedMessageFormat) (obj)).toPattern))
            {
                return false;
            }
            if (ObjectUtils.notEqual(registry, ((ExtendedMessageFormat) (obj)).registry))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (super.hashCode() * 31 + ObjectUtils.hashCode(registry)) * 31 + ObjectUtils.hashCode(toPattern);
    }

    public void setFormat(int i, Format format)
    {
        throw new UnsupportedOperationException();
    }

    public void setFormatByArgumentIndex(int i, Format format)
    {
        throw new UnsupportedOperationException();
    }

    public void setFormats(Format aformat[])
    {
        throw new UnsupportedOperationException();
    }

    public void setFormatsByArgumentIndex(Format aformat[])
    {
        throw new UnsupportedOperationException();
    }

    public String toPattern()
    {
        return toPattern;
    }
}
