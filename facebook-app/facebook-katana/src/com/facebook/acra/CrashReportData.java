// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.acra:
//            ReportField

public class CrashReportData extends EnumMap
{

    private static final int CONTINUE = 3;
    private static final int IGNORE = 5;
    private static final int KEY_DONE = 4;
    private static final int NONE = 0;
    private static final String PROP_DTD_NAME = "http://java.sun.com/dtd/properties.dtd";
    private static final int SLASH = 1;
    private static final int UNICODE = 2;
    private static String lineSeparator = "\n";
    private static final long serialVersionUID = 0x3912d07a70363e98L;
    protected CrashReportData defaults;

    public CrashReportData()
    {
        super(com/facebook/acra/ReportField);
    }

    public CrashReportData(CrashReportData crashreportdata)
    {
        super(com/facebook/acra/ReportField);
        defaults = crashreportdata;
    }

    private void dumpString(Appendable appendable, String s, boolean flag)
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
                        int k = s.length();
                        int i;
                        if (!flag && k > 0 && s.charAt(0) == ' ')
                        {
                            appendable.append("\\ ");
                            i = 1;
                        } else
                        {
                            i = 0;
                        }
label4:
                        do
                        {
                            {
                                if (i >= k)
                                {
                                    break label0;
                                }
                                char c = s.charAt(i);
                                switch (c)
                                {
                                case 11: // '\013'
                                default:
                                    if (flag && c == ' ' || c == '\\' || c == '#' || c == '!' || c == ':')
                                    {
                                        appendable.append('\\');
                                    }
                                    if (c >= ' ' && c <= '~')
                                    {
                                        appendable.append(c);
                                    } else
                                    {
                                        String s1 = Integer.toHexString(c);
                                        appendable.append("\\u");
                                        for (int j = 0; j < 4 - s1.length(); j++)
                                        {
                                            appendable.append('0');
                                        }

                                        appendable.append(s1);
                                    }
                                    break;

                                case 9: // '\t'
                                    break label4;

                                case 10: // '\n'
                                    break label3;

                                case 12: // '\f'
                                    break label2;

                                case 13: // '\r'
                                    break label1;
                                }
                            }
                            i++;
                        } while (true);
                        appendable.append("\\t");
                        break MISSING_BLOCK_LABEL_159;
                    }
                    appendable.append("\\n");
                    break MISSING_BLOCK_LABEL_159;
                }
                appendable.append("\\f");
                break MISSING_BLOCK_LABEL_159;
            }
            appendable.append("\\r");
            break MISSING_BLOCK_LABEL_159;
        }
    }

    public static Writer getWriter(OutputStream outputstream)
    {
        try
        {
            outputstream = new OutputStreamWriter(outputstream, "ISO8859_1");
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            return null;
        }
        return outputstream;
    }

    private boolean isEbcdic(BufferedInputStream bufferedinputstream)
    {
        byte byte0;
        do
        {
            byte0 = (byte)bufferedinputstream.read();
            if (byte0 == -1 || byte0 == 35 || byte0 == 10 || byte0 == 61)
            {
                return false;
            }
        } while (byte0 != 21);
        return true;
    }

    private Enumeration keys()
    {
        return Collections.enumeration(keySet());
    }

    private String substitutePredefinedEntries(String s)
    {
        return s.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("'", "&apos;").replaceAll("\"", "&quot;");
    }

    public String getProperty(ReportField reportfield)
    {
        String s1 = (String)super.get(reportfield);
        String s = s1;
        if (s1 == null)
        {
            s = s1;
            if (defaults != null)
            {
                s = defaults.getProperty(reportfield);
            }
        }
        return s;
    }

    public String getProperty(ReportField reportfield, String s)
    {
        String s2 = (String)super.get(reportfield);
        String s1 = s2;
        if (s2 == null)
        {
            s1 = s2;
            if (defaults != null)
            {
                s1 = defaults.getProperty(reportfield);
            }
        }
        if (s1 == null)
        {
            return s;
        } else
        {
            return s1;
        }
    }

    public void list(PrintStream printstream)
    {
        if (printstream == null)
        {
            throw new NullPointerException();
        }
        StringBuilder stringbuilder = new StringBuilder(80);
        Enumeration enumeration = keys();
        while (enumeration.hasMoreElements()) 
        {
            ReportField reportfield = (ReportField)enumeration.nextElement();
            stringbuilder.append(reportfield);
            stringbuilder.append('=');
            String s = (String)super.get(reportfield);
            for (CrashReportData crashreportdata = defaults; s == null; crashreportdata = crashreportdata.defaults)
            {
                s = (String)crashreportdata.get(reportfield);
            }

            if (s.length() > 40)
            {
                stringbuilder.append(s.substring(0, 37));
                stringbuilder.append("...");
            } else
            {
                stringbuilder.append(s);
            }
            printstream.println(stringbuilder.toString());
            stringbuilder.setLength(0);
        }
    }

    public void list(PrintWriter printwriter)
    {
        if (printwriter == null)
        {
            throw new NullPointerException();
        }
        StringBuilder stringbuilder = new StringBuilder(80);
        Enumeration enumeration = keys();
        while (enumeration.hasMoreElements()) 
        {
            ReportField reportfield = (ReportField)enumeration.nextElement();
            stringbuilder.append(reportfield);
            stringbuilder.append('=');
            String s = (String)super.get(reportfield);
            for (CrashReportData crashreportdata = defaults; s == null; crashreportdata = crashreportdata.defaults)
            {
                s = (String)crashreportdata.get(reportfield);
            }

            if (s.length() > 40)
            {
                stringbuilder.append(s.substring(0, 37));
                stringbuilder.append("...");
            } else
            {
                stringbuilder.append(s);
            }
            printwriter.println(stringbuilder.toString());
            stringbuilder.setLength(0);
        }
    }

    public void load(InputStream inputstream)
    {
        this;
        JVM INSTR monitorenter ;
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        throw new NullPointerException();
        inputstream;
        this;
        JVM INSTR monitorexit ;
        throw inputstream;
        boolean flag;
        inputstream = new BufferedInputStream(inputstream);
        inputstream.mark(0x7fffffff);
        flag = isEbcdic(inputstream);
        inputstream.reset();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        load(((Reader) (new InputStreamReader(inputstream, "ISO8859-1"))));
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        load(((Reader) (new InputStreamReader(inputstream))));
          goto _L1
    }

    public void load(Reader reader)
    {
        this;
        JVM INSTR monitorenter ;
        char ac[] = new char[40];
        int k = 0;
        Object obj1 = new BufferedReader(reader);
        int i;
        int j;
        int l;
        int i1;
        int k1;
        k1 = 1;
        j = 0;
        i1 = -1;
        i = 0;
        l = 0;
        reader = ac;
_L6:
        int j1 = ((BufferedReader) (obj1)).read();
        if (j1 == -1 || j1 == 0) goto _L2; else goto _L1
_L1:
        char c2;
        Object obj;
        c2 = (char)j1;
        obj = reader;
        if (k == reader.length)
        {
            obj = new char[reader.length * 2];
            System.arraycopy(reader, 0, obj, 0, k);
        }
        if (l != 2) goto _L4; else goto _L3
_L3:
        j1 = Character.digit(c2, 16);
label0:
        {
            if (j1 < 0)
            {
                break label0;
            }
            j = j1 + (j << 4);
            i++;
            if (i >= 4)
            {
                break MISSING_BLOCK_LABEL_156;
            }
            reader = ((Reader) (obj));
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i > 4)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        throw new IllegalArgumentException("luni.09");
        reader;
        this;
        JVM INSTR monitorexit ;
        throw reader;
        j1 = k + 1;
        char c = (char)j;
        obj[k] = c;
        if (c2 != '\n' && c2 != '\205') goto _L8; else goto _L7
_L35:
        j1 = l;
        if (!Character.isWhitespace(c2)) goto _L10; else goto _L9
_L9:
        char c1;
        int l1;
        j1 = l;
        int i2;
        if (l == 3)
        {
            j1 = 5;
        }
        l1 = j1;
          goto _L11
_L17:
        j1 = ((BufferedReader) (obj1)).read();
        l1 = l;
        if (j1 == -1) goto _L13; else goto _L12
_L12:
        j1 = (char)j1;
        l1 = l;
        if (j1 == 13) goto _L13; else goto _L14
_L14:
        l1 = l;
        if (j1 == 10) goto _L13; else goto _L15
_L15:
        if (j1 != 133) goto _L17; else goto _L16
_L16:
        j1 = k;
        k = i;
        i = j;
        j = j1;
        reader = ((Reader) (obj));
          goto _L6
_L47:
        reader = new String(((char []) (obj)), 0, i);
        put(Enum.valueOf(com/facebook/acra/ReportField, reader.substring(0, l)), reader.substring(l));
          goto _L18
_L2:
        if (l != 2 || i > 4) goto _L20; else goto _L19
_L19:
        throw new IllegalArgumentException("luni.08");
_L21:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_432;
        }
        reader = new String(reader, 0, k);
        obj1 = (ReportField)Enum.valueOf(com/facebook/acra/ReportField, reader.substring(0, i));
        obj = reader.substring(i);
        reader = ((Reader) (obj));
        if (l != 1)
        {
            break MISSING_BLOCK_LABEL_424;
        }
        reader = (new StringBuilder()).append(((String) (obj))).append("\0").toString();
        put(((Enum) (obj1)), reader);
        this;
        JVM INSTR monitorexit ;
        return;
_L52:
        i = i1;
          goto _L21
_L13:
        l = k;
        k = i;
        i = j;
        j = l;
        l = l1;
        reader = ((Reader) (obj));
          goto _L6
_L8:
        k = j1;
        l = 0;
        reader = ((Reader) (obj));
          goto _L6
_L4:
        j1 = j;
        j = i;
        i = k;
        k = j1;
          goto _L22
_L7:
        l = 0;
        k = j;
        j = i;
        i = j1;
_L22:
        if (l != 1) goto _L24; else goto _L23
_L23:
        c2;
        JVM INSTR lookupswitch 9: default 608
    //                   10: 712
    //                   13: 683
    //                   98: 741
    //                   102: 750
    //                   110: 759
    //                   114: 768
    //                   116: 777
    //                   117: 786
    //                   133: 712;
           goto _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L26
_L25:
        l = 0;
        c1 = c2;
_L34:
        j1 = i1;
        i1 = l;
        if (l == 4)
        {
            i1 = 0;
            j1 = i;
        }
        obj[i] = c1;
        l = i1;
        i2 = i + 1;
        l1 = 0;
        k1 = k;
        i1 = j1;
        i = j;
        k = i2;
        j = k1;
        reader = ((Reader) (obj));
        k1 = l1;
          goto _L6
_L27:
        l = k;
        j1 = 3;
        k = i;
        i = j;
        j = l;
        l = j1;
        reader = ((Reader) (obj));
          goto _L6
_L26:
        l = k;
        j1 = 5;
        k = i;
        i = j;
        j = l;
        l = j1;
        reader = ((Reader) (obj));
          goto _L6
_L28:
        c1 = '\b';
        l = 0;
          goto _L34
_L29:
        c1 = '\f';
        l = 0;
          goto _L34
_L30:
        c1 = '\n';
        l = 0;
          goto _L34
_L31:
        c1 = '\r';
        l = 0;
          goto _L34
_L32:
        c1 = '\t';
        l = 0;
          goto _L34
_L33:
        j = 0;
        l = 2;
        k = i;
        i = 0;
        reader = ((Reader) (obj));
          goto _L6
_L24:
        c2;
        JVM INSTR lookupswitch 8: default 880
    //                   10: 956
    //                   13: 991
    //                   33: 948
    //                   35: 948
    //                   58: 1096
    //                   61: 1096
    //                   92: 1057
    //                   133: 991;
           goto _L35 _L36 _L37 _L38 _L38 _L39 _L39 _L40 _L37
_L39:
        continue; /* Loop/switch isn't completed */
_L11:
        if (i == 0) goto _L13; else goto _L41
_L41:
        l1 = j1;
        if (i == i1) goto _L13; else goto _L42
_L42:
        l1 = j1;
        if (j1 == 5) goto _L13; else goto _L43
_L43:
        if (i1 != -1) goto _L10; else goto _L44
_L44:
        l = k;
        j1 = 4;
        k = i;
        i = j;
        j = l;
        l = j1;
        reader = ((Reader) (obj));
          goto _L6
_L38:
        if (k1 == 0) goto _L35; else goto _L17
_L36:
        if (l != 3) goto _L37; else goto _L45
_L45:
        l = k;
        j1 = 5;
        k = i;
        i = j;
        j = l;
        l = j1;
        reader = ((Reader) (obj));
          goto _L6
_L37:
        if (i <= 0 && (i != 0 || i1 != 0)) goto _L18; else goto _L46
_L46:
        l = i1;
        if (i1 == -1)
        {
            l = i;
        }
          goto _L47
_L18:
        i1 = -1;
        k1 = 1;
        l = k;
        k = 0;
        i = j;
        j1 = 0;
        j = l;
        l = j1;
        reader = ((Reader) (obj));
          goto _L6
_L40:
        if (l == 4)
        {
            i1 = i;
        }
        l = k;
        j1 = 1;
        k = i;
        i = j;
        j = l;
        l = j1;
        reader = ((Reader) (obj));
          goto _L6
        if (i1 != -1) goto _L35; else goto _L48
_L48:
        i1 = i;
        l = k;
        j1 = 0;
        k = i;
        i = j;
        j = l;
        l = j1;
        reader = ((Reader) (obj));
          goto _L6
_L10:
        if (j1 == 5) goto _L50; else goto _L49
_L49:
        l = j1;
        c1 = c2;
        if (j1 != 3) goto _L34; else goto _L50
_L50:
        l = 0;
        c1 = c2;
          goto _L34
_L20:
        if (i1 != -1 || k <= 0) goto _L52; else goto _L51
_L51:
        i = k;
          goto _L21
    }

    public void merge(CrashReportData crashreportdata)
    {
        Iterator iterator = crashreportdata.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ReportField reportfield = (ReportField)iterator.next();
            if (getProperty(reportfield) == null)
            {
                put(reportfield, crashreportdata.getProperty(reportfield));
            }
        } while (true);
    }

    public String put(ReportField reportfield, String s, Writer writer)
    {
        String s1 = (String)put(((Enum) (reportfield)), s);
        if (writer != null)
        {
            storeKeyValuePair(writer, reportfield, s);
        }
        return s1;
    }

    public void save(OutputStream outputstream, String s)
    {
        try
        {
            store(outputstream, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            return;
        }
    }

    public Object setProperty(ReportField reportfield, String s)
    {
        return put(reportfield, s);
    }

    public void store(OutputStream outputstream, String s)
    {
        this;
        JVM INSTR monitorenter ;
        store(getWriter(outputstream), s);
        this;
        JVM INSTR monitorexit ;
        return;
        outputstream;
        throw outputstream;
    }

    public void store(Writer writer, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        storeComment(writer, s);
        java.util.Map.Entry entry;
        for (s = entrySet().iterator(); s.hasNext(); storeKeyValuePair(writer, (ReportField)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)s.next();
        }

        break MISSING_BLOCK_LABEL_72;
        writer;
        throw writer;
        writer.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public void storeComment(Writer writer, String s)
    {
        this;
        JVM INSTR monitorenter ;
        writer.write("#");
        writer.write(s);
        writer.write(lineSeparator);
        this;
        JVM INSTR monitorexit ;
        return;
        writer;
        throw writer;
    }

    public void storeKeyValuePair(Writer writer, ReportField reportfield, String s)
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = reportfield.toString();
        reportfield = s;
        if (s == null)
        {
            reportfield = "";
        }
        int i = s1.length() + reportfield.length() + 1;
        s = new StringBuilder(i + i / 5);
        dumpString(s, s1, true);
        s.append('=');
        dumpString(s, reportfield, false);
        s.append(lineSeparator);
        writer.write(s.toString());
        writer.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        writer;
        throw writer;
    }

    public void storeToXML(OutputStream outputstream, String s)
    {
        storeToXML(outputstream, s, "UTF-8");
    }

    public void storeToXML(OutputStream outputstream, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (outputstream != null && s1 != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        throw new NullPointerException();
        outputstream;
        this;
        JVM INSTR monitorexit ;
        throw outputstream;
        String s2 = Charset.forName(s1).name();
        s1 = s2;
_L2:
        outputstream = new PrintStream(outputstream, false, s1);
        outputstream.print("<?xml version=\"1.0\" encoding=\"");
        outputstream.print(s1);
        outputstream.println("\"?>");
        outputstream.print("<!DOCTYPE properties SYSTEM \"");
        outputstream.print("http://java.sun.com/dtd/properties.dtd");
        outputstream.println("\">");
        outputstream.println("<properties>");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        outputstream.print("<comment>");
        outputstream.print(substitutePredefinedEntries(s));
        outputstream.println("</comment>");
        for (s = entrySet().iterator(); s.hasNext(); outputstream.println("</entry>"))
        {
            Object obj = (java.util.Map.Entry)s.next();
            s1 = ((ReportField)((java.util.Map.Entry) (obj)).getKey()).toString();
            obj = (String)((java.util.Map.Entry) (obj)).getValue();
            outputstream.print("<entry key=\"");
            outputstream.print(substitutePredefinedEntries(s1));
            outputstream.print("\">");
            outputstream.print(substitutePredefinedEntries(((String) (obj))));
        }

        break; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        System.out.println((new StringBuilder("Warning: encoding name ")).append(s1).append(" is illegal, using UTF-8 as default encoding").toString());
        s1 = "UTF-8";
        continue; /* Loop/switch isn't completed */
        obj1;
        System.out.println((new StringBuilder("Warning: encoding ")).append(s1).append(" is not supported, using UTF-8 as default encoding").toString());
        s1 = "UTF-8";
        if (true) goto _L2; else goto _L1
_L1:
        outputstream.println("</properties>");
        outputstream.flush();
        this;
        JVM INSTR monitorexit ;
    }

}
