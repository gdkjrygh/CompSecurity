// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public final class RawHeaders
{

    private static final Comparator FIELD_NAME_COMPARATOR = new Comparator() {

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((String)obj, (String)obj1);
        }

        public int compare(String s, String s1)
        {
            if (s == s1)
            {
                return 0;
            }
            if (s == null)
            {
                return -1;
            }
            if (s1 == null)
            {
                return 1;
            } else
            {
                return String.CASE_INSENSITIVE_ORDER.compare(s, s1);
            }
        }

    };
    private int httpMinorVersion;
    private final List namesAndValues;
    private String requestLine;
    private int responseCode;
    private String responseMessage;
    private String statusLine;

    public RawHeaders()
    {
        namesAndValues = new ArrayList(20);
        httpMinorVersion = 1;
        responseCode = -1;
    }

    public RawHeaders(RawHeaders rawheaders)
    {
        namesAndValues = new ArrayList(20);
        httpMinorVersion = 1;
        responseCode = -1;
        namesAndValues.addAll(rawheaders.namesAndValues);
        requestLine = rawheaders.requestLine;
        statusLine = rawheaders.statusLine;
        httpMinorVersion = rawheaders.httpMinorVersion;
        responseCode = rawheaders.responseCode;
        responseMessage = rawheaders.responseMessage;
    }

    private void addLenient(String s, String s1)
    {
        namesAndValues.add(s);
        namesAndValues.add(s1.trim());
    }

    public static RawHeaders fromBytes(InputStream inputstream)
        throws IOException
    {
        RawHeaders rawheaders;
        do
        {
            rawheaders = new RawHeaders();
            rawheaders.setStatusLine(Util.readAsciiLine(inputstream));
            readHeaders(inputstream, rawheaders);
        } while (rawheaders.getResponseCode() == 100);
        return rawheaders;
    }

    public static RawHeaders fromMultimap(Map map, boolean flag)
        throws IOException
    {
        if (!flag)
        {
            throw new UnsupportedOperationException();
        }
        RawHeaders rawheaders = new RawHeaders();
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)map.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (List)((java.util.Map.Entry) (obj)).getValue();
            if (s != null)
            {
                obj = ((List) (obj)).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    rawheaders.addLenient(s, (String)((Iterator) (obj)).next());
                }
            } else
            if (!((List) (obj)).isEmpty())
            {
                rawheaders.setStatusLine((String)((List) (obj)).get(((List) (obj)).size() - 1));
            }
        } while (true);
        return rawheaders;
    }

    public static RawHeaders fromNameValueBlock(List list)
        throws IOException
    {
        if (list.size() % 2 != 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected name value block: ").append(list).toString());
        }
        String s1 = null;
        String s = null;
        RawHeaders rawheaders = new RawHeaders();
        for (int i = 0; i < list.size(); i += 2)
        {
            String s3 = (String)list.get(i);
            String s4 = (String)list.get(i + 1);
            int j = 0;
            while (j < s4.length()) 
            {
                int l = s4.indexOf('\0', j);
                int k = l;
                if (l == -1)
                {
                    k = s4.length();
                }
                String s2 = s4.substring(j, k);
                if (":status".equals(s3))
                {
                    s1 = s2;
                } else
                if (":version".equals(s3))
                {
                    s = s2;
                } else
                {
                    rawheaders.namesAndValues.add(s3);
                    rawheaders.namesAndValues.add(s2);
                }
                j = k + 1;
            }
        }

        if (s1 == null)
        {
            throw new ProtocolException("Expected ':status' header not present");
        }
        if (s == null)
        {
            throw new ProtocolException("Expected ':version' header not present");
        } else
        {
            rawheaders.setStatusLine((new StringBuilder()).append(s).append(" ").append(s1).toString());
            return rawheaders;
        }
    }

    public static void readHeaders(InputStream inputstream, RawHeaders rawheaders)
        throws IOException
    {
        do
        {
            String s = Util.readAsciiLine(inputstream);
            if (s.length() != 0)
            {
                rawheaders.addLine(s);
            } else
            {
                return;
            }
        } while (true);
    }

    public void add(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("fieldname == null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("value == null");
        }
        if (s.length() == 0 || s.indexOf('\0') != -1 || s1.indexOf('\0') != -1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected header: ").append(s).append(": ").append(s1).toString());
        } else
        {
            addLenient(s, s1);
            return;
        }
    }

    public void addAll(String s, List list)
    {
        for (list = list.iterator(); list.hasNext(); add(s, (String)list.next())) { }
    }

    public void addLine(String s)
    {
        int i = s.indexOf(":", 1);
        if (i != -1)
        {
            addLenient(s.substring(0, i), s.substring(i + 1));
            return;
        }
        if (s.startsWith(":"))
        {
            addLenient("", s.substring(1));
            return;
        } else
        {
            addLenient("", s);
            return;
        }
    }

    public void addSpdyRequestHeaders(String s, String s1, String s2, String s3, String s4)
    {
        add(":method", s);
        add(":scheme", s4);
        add(":path", s1);
        add(":version", s2);
        add(":host", s3);
    }

    public String get(String s)
    {
        for (int i = namesAndValues.size() - 2; i >= 0; i -= 2)
        {
            if (s.equalsIgnoreCase((String)namesAndValues.get(i)))
            {
                return (String)namesAndValues.get(i + 1);
            }
        }

        return null;
    }

    public RawHeaders getAll(Set set1)
    {
        RawHeaders rawheaders = new RawHeaders();
        for (int i = 0; i < namesAndValues.size(); i += 2)
        {
            String s = (String)namesAndValues.get(i);
            if (set1.contains(s))
            {
                rawheaders.add(s, (String)namesAndValues.get(i + 1));
            }
        }

        return rawheaders;
    }

    public String getFieldName(int i)
    {
        i *= 2;
        if (i < 0 || i >= namesAndValues.size())
        {
            return null;
        } else
        {
            return (String)namesAndValues.get(i);
        }
    }

    public int getHttpMinorVersion()
    {
        if (httpMinorVersion != -1)
        {
            return httpMinorVersion;
        } else
        {
            return 1;
        }
    }

    public int getResponseCode()
    {
        return responseCode;
    }

    public String getResponseMessage()
    {
        return responseMessage;
    }

    public String getStatusLine()
    {
        return statusLine;
    }

    public String getValue(int i)
    {
        i = i * 2 + 1;
        if (i < 0 || i >= namesAndValues.size())
        {
            return null;
        } else
        {
            return (String)namesAndValues.get(i);
        }
    }

    public int length()
    {
        return namesAndValues.size() / 2;
    }

    public Set names()
    {
        TreeSet treeset = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < length(); i++)
        {
            treeset.add(getFieldName(i));
        }

        return Collections.unmodifiableSet(treeset);
    }

    public void removeAll(String s)
    {
        for (int i = 0; i < namesAndValues.size(); i += 2)
        {
            if (s.equalsIgnoreCase((String)namesAndValues.get(i)))
            {
                namesAndValues.remove(i);
                namesAndValues.remove(i);
            }
        }

    }

    public void set(String s, String s1)
    {
        removeAll(s);
        add(s, s1);
    }

    public void setRequestLine(String s)
    {
        requestLine = s.trim();
    }

    public void setStatusLine(String s)
        throws IOException
    {
        if (responseMessage != null)
        {
            throw new IllegalStateException("statusLine is already set");
        }
        boolean flag;
        if (s.length() > 13)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!s.startsWith("HTTP/1.") || s.length() < 12 || s.charAt(8) != ' ' || flag && s.charAt(12) != ' ')
        {
            throw new ProtocolException((new StringBuilder()).append("Unexpected status line: ").append(s).toString());
        }
        int i = s.charAt(7) - 48;
        if (i < 0 || i > 9)
        {
            throw new ProtocolException((new StringBuilder()).append("Unexpected status line: ").append(s).toString());
        }
        Object obj;
        int j;
        try
        {
            j = Integer.parseInt(s.substring(9, 12));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ProtocolException((new StringBuilder()).append("Unexpected status line: ").append(s).toString());
        }
        if (flag)
        {
            obj = s.substring(13);
        } else
        {
            obj = "";
        }
        responseMessage = ((String) (obj));
        responseCode = j;
        statusLine = s;
        httpMinorVersion = i;
    }

    public byte[] toBytes()
        throws UnsupportedEncodingException
    {
        StringBuilder stringbuilder = new StringBuilder(256);
        stringbuilder.append(requestLine).append("\r\n");
        for (int i = 0; i < namesAndValues.size(); i += 2)
        {
            stringbuilder.append((String)namesAndValues.get(i)).append(": ").append((String)namesAndValues.get(i + 1)).append("\r\n");
        }

        stringbuilder.append("\r\n");
        return stringbuilder.toString().getBytes("ISO-8859-1");
    }

    public Map toMultimap(boolean flag)
    {
        TreeMap treemap;
        treemap = new TreeMap(FIELD_NAME_COMPARATOR);
        for (int i = 0; i < namesAndValues.size(); i += 2)
        {
            String s = (String)namesAndValues.get(i);
            String s1 = (String)namesAndValues.get(i + 1);
            ArrayList arraylist = new ArrayList();
            List list = (List)treemap.get(s);
            if (list != null)
            {
                arraylist.addAll(list);
            }
            arraylist.add(s1);
            treemap.put(s, Collections.unmodifiableList(arraylist));
        }

        if (!flag || statusLine == null) goto _L2; else goto _L1
_L1:
        treemap.put(null, Collections.unmodifiableList(Collections.singletonList(statusLine)));
_L4:
        return Collections.unmodifiableMap(treemap);
_L2:
        if (requestLine != null)
        {
            treemap.put(null, Collections.unmodifiableList(Collections.singletonList(requestLine)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public List toNameValueBlock()
    {
        HashSet hashset;
        ArrayList arraylist;
        int i;
        hashset = new HashSet();
        arraylist = new ArrayList();
        i = 0;
_L2:
        String s;
        String s1;
        if (i >= namesAndValues.size())
        {
            break MISSING_BLOCK_LABEL_250;
        }
        s = ((String)namesAndValues.get(i)).toLowerCase(Locale.US);
        s1 = (String)namesAndValues.get(i + 1);
        if (!s.equals("connection") && !s.equals("host") && !s.equals("keep-alive") && !s.equals("proxy-connection") && !s.equals("transfer-encoding"))
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i += 2;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            if (!hashset.add(s))
            {
                break label0;
            }
            arraylist.add(s);
            arraylist.add(s1);
        }
          goto _L3
        int j = 0;
_L4:
        if (j < arraylist.size())
        {
label1:
            {
                if (!s.equals(arraylist.get(j)))
                {
                    break label1;
                }
                arraylist.set(j + 1, (new StringBuilder()).append((String)arraylist.get(j + 1)).append("\0").append(s1).toString());
            }
        }
          goto _L3
        j += 2;
          goto _L4
        return arraylist;
          goto _L3
    }

    public List values(String s)
    {
        ArrayList arraylist = null;
        for (int i = 0; i < length();)
        {
            ArrayList arraylist1 = arraylist;
            if (s.equalsIgnoreCase(getFieldName(i)))
            {
                arraylist1 = arraylist;
                if (arraylist == null)
                {
                    arraylist1 = new ArrayList(2);
                }
                arraylist1.add(getValue(i));
            }
            i++;
            arraylist = arraylist1;
        }

        if (arraylist != null)
        {
            return Collections.unmodifiableList(arraylist);
        } else
        {
            return Collections.emptyList();
        }
    }

}
