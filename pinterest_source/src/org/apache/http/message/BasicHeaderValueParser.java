// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//            HeaderValueParser, ParserCursor, BasicHeaderElement, BasicNameValuePair

public class BasicHeaderValueParser
    implements HeaderValueParser
{

    private static final char ALL_DELIMITERS[] = {
        ';', ','
    };
    public static final BasicHeaderValueParser DEFAULT = new BasicHeaderValueParser();
    private static final char ELEM_DELIMITER = 44;
    private static final char PARAM_DELIMITER = 59;

    public BasicHeaderValueParser()
    {
    }

    private static boolean isOneOf(char c, char ac[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (ac == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        flag = flag1;
        if (i >= ac.length) goto _L2; else goto _L3
_L3:
        if (c != ac[i]) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static final HeaderElement[] parseElements(String s, HeaderValueParser headervalueparser)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Value to parse may not be null");
        }
        Object obj = headervalueparser;
        if (headervalueparser == null)
        {
            obj = DEFAULT;
        }
        headervalueparser = new CharArrayBuffer(s.length());
        headervalueparser.append(s);
        return ((HeaderValueParser) (obj)).parseElements(headervalueparser, new ParserCursor(0, s.length()));
    }

    public static final HeaderElement parseHeaderElement(String s, HeaderValueParser headervalueparser)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Value to parse may not be null");
        }
        Object obj = headervalueparser;
        if (headervalueparser == null)
        {
            obj = DEFAULT;
        }
        headervalueparser = new CharArrayBuffer(s.length());
        headervalueparser.append(s);
        return ((HeaderValueParser) (obj)).parseHeaderElement(headervalueparser, new ParserCursor(0, s.length()));
    }

    public static final NameValuePair parseNameValuePair(String s, HeaderValueParser headervalueparser)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Value to parse may not be null");
        }
        Object obj = headervalueparser;
        if (headervalueparser == null)
        {
            obj = DEFAULT;
        }
        headervalueparser = new CharArrayBuffer(s.length());
        headervalueparser.append(s);
        return ((HeaderValueParser) (obj)).parseNameValuePair(headervalueparser, new ParserCursor(0, s.length()));
    }

    public static final NameValuePair[] parseParameters(String s, HeaderValueParser headervalueparser)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Value to parse may not be null");
        }
        Object obj = headervalueparser;
        if (headervalueparser == null)
        {
            obj = DEFAULT;
        }
        headervalueparser = new CharArrayBuffer(s.length());
        headervalueparser.append(s);
        return ((HeaderValueParser) (obj)).parseParameters(headervalueparser, new ParserCursor(0, s.length()));
    }

    protected HeaderElement createHeaderElement(String s, String s1, NameValuePair anamevaluepair[])
    {
        return new BasicHeaderElement(s, s1, anamevaluepair);
    }

    protected NameValuePair createNameValuePair(String s, String s1)
    {
        return new BasicNameValuePair(s, s1);
    }

    public HeaderElement[] parseElements(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
    {
        if (chararraybuffer == null)
        {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (parsercursor == null)
        {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        ArrayList arraylist = new ArrayList();
        do
        {
            if (parsercursor.atEnd())
            {
                break;
            }
            HeaderElement headerelement = parseHeaderElement(chararraybuffer, parsercursor);
            if (headerelement.getName().length() != 0 || headerelement.getValue() != null)
            {
                arraylist.add(headerelement);
            }
        } while (true);
        return (HeaderElement[])arraylist.toArray(new HeaderElement[arraylist.size()]);
    }

    public HeaderElement parseHeaderElement(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
    {
        if (chararraybuffer == null)
        {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (parsercursor == null)
        {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        NameValuePair namevaluepair = parseNameValuePair(chararraybuffer, parsercursor);
        Object obj = null;
        NameValuePair anamevaluepair[] = obj;
        if (!parsercursor.atEnd())
        {
            anamevaluepair = obj;
            if (chararraybuffer.charAt(parsercursor.getPos() - 1) != ',')
            {
                anamevaluepair = parseParameters(chararraybuffer, parsercursor);
            }
        }
        return createHeaderElement(namevaluepair.getName(), namevaluepair.getValue(), anamevaluepair);
    }

    public NameValuePair parseNameValuePair(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
    {
        return parseNameValuePair(chararraybuffer, parsercursor, ALL_DELIMITERS);
    }

    public NameValuePair parseNameValuePair(CharArrayBuffer chararraybuffer, ParserCursor parsercursor, char ac[])
    {
        String s;
        int i;
        int j;
        int k;
        boolean flag1;
        int k1;
        flag1 = true;
        if (chararraybuffer == null)
        {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (parsercursor == null)
        {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        j = parsercursor.getPos();
        i = parsercursor.getPos();
        k1 = parsercursor.getUpperBound();
        do
        {
            if (j >= k1)
            {
                break MISSING_BLOCK_LABEL_440;
            }
            char c = chararraybuffer.charAt(j);
            if (c == '=')
            {
                break MISSING_BLOCK_LABEL_440;
            }
            if (isOneOf(c, ac))
            {
                k = 1;
                break MISSING_BLOCK_LABEL_83;
            }
            j++;
        } while (true);
_L4:
        int l;
        if (j == k1)
        {
            s = chararraybuffer.substringTrimmed(i, k1);
            k = 1;
        } else
        {
            s = chararraybuffer.substringTrimmed(i, j);
            j++;
        }
        if (k != 0)
        {
            parsercursor.updatePos(j);
            return createNameValuePair(s, null);
        }
        boolean flag = false;
        l = 0;
        i = j;
        while (i < k1) 
        {
            char c1 = chararraybuffer.charAt(i);
            if (c1 == '"' && !flag)
            {
                if (l == 0)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
            }
            if (l == 0 && !flag && isOneOf(c1, ac))
            {
                l = ((flag1) ? 1 : 0);
                break MISSING_BLOCK_LABEL_218;
            }
            if (!flag && l != 0 && c1 == '\\')
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i++;
        }
_L2:
        l = k;
        if (false)
        {
            break; /* Loop/switch isn't completed */
        }
        for (; j < i && HTTP.isWhitespace(chararraybuffer.charAt(j)); j++) { }
        k = i;
        while (true) 
        {
            for (; k > j && HTTP.isWhitespace(chararraybuffer.charAt(k - 1)); k--) { }
            int j1 = k;
            int i1 = j;
            if (k - j >= 2)
            {
                j1 = k;
                i1 = j;
                if (chararraybuffer.charAt(j) == '"')
                {
                    j1 = k;
                    i1 = j;
                    if (chararraybuffer.charAt(k - 1) == '"')
                    {
                        i1 = j + 1;
                        j1 = k - 1;
                    }
                }
            }
            chararraybuffer = chararraybuffer.substring(i1, j1);
            if (l != 0)
            {
                i++;
            }
            parsercursor.updatePos(i);
            return createNameValuePair(s, chararraybuffer);
        }
        if (true) goto _L2; else goto _L1
_L1:
        k = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public NameValuePair[] parseParameters(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
    {
        if (chararraybuffer == null)
        {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (parsercursor == null)
        {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        int i = parsercursor.getPos();
        for (int j = parsercursor.getUpperBound(); i < j && HTTP.isWhitespace(chararraybuffer.charAt(i)); i++) { }
        parsercursor.updatePos(i);
        if (parsercursor.atEnd())
        {
            return new NameValuePair[0];
        }
        ArrayList arraylist = new ArrayList();
        do
        {
            if (parsercursor.atEnd())
            {
                break;
            }
            arraylist.add(parseNameValuePair(chararraybuffer, parsercursor));
        } while (chararraybuffer.charAt(parsercursor.getPos() - 1) != ',');
        return (NameValuePair[])arraylist.toArray(new NameValuePair[arraylist.size()]);
    }

}
