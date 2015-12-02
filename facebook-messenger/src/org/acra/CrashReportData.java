// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra;

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

// Referenced classes of package org.acra:
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
        super(org/acra/ReportField);
    }

    public CrashReportData(CrashReportData crashreportdata)
    {
        super(org/acra/ReportField);
        defaults = crashreportdata;
    }

    private void dumpString(Writer writer, String s, boolean flag)
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
                        int i;
                        if (!flag && s.length() < 0 && s.charAt(0) == ' ')
                        {
                            writer.write("\\ ");
                            i = 1;
                        } else
                        {
                            i = 0;
                        }
label4:
                        do
                        {
                            {
                                if (i >= s.length())
                                {
                                    break label0;
                                }
                                char c = s.charAt(i);
                                switch (c)
                                {
                                case 11: // '\013'
                                default:
                                    if ("\\#!=:".indexOf(c) >= 0 || flag && c == ' ')
                                    {
                                        writer.write(92);
                                    }
                                    if (c >= ' ' && c <= '~')
                                    {
                                        writer.write(c);
                                    } else
                                    {
                                        String s1 = Integer.toHexString(c);
                                        writer.write("\\u");
                                        for (int j = 0; j < 4 - s1.length(); j++)
                                        {
                                            writer.write("0");
                                        }

                                        writer.write(s1);
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
                        writer.write("\\t");
                        break MISSING_BLOCK_LABEL_131;
                    }
                    writer.write("\\n");
                    break MISSING_BLOCK_LABEL_131;
                }
                writer.write("\\f");
                break MISSING_BLOCK_LABEL_131;
            }
            writer.write("\\r");
            break MISSING_BLOCK_LABEL_131;
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
        int l;
        int i1;
        i1 = 0;
        l = -1;
        Object obj1 = new BufferedReader(reader);
        int i;
        int j;
        int k;
        boolean flag;
        flag = true;
        j = 0;
        k = 0;
        i = 0;
        reader = ac;
_L11:
        int j1 = ((BufferedReader) (obj1)).read();
        if (j1 != -1) goto _L2; else goto _L1
_L1:
        if (k != 2 || i > 4) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException("luni.08");
        reader;
        this;
        JVM INSTR monitorexit ;
        throw reader;
_L2:
        char c;
        Object obj;
        c = (char)j1;
        obj = reader;
        if (i1 == reader.length)
        {
            obj = new char[reader.length * 2];
            System.arraycopy(reader, 0, obj, 0, i1);
        }
        if (k != 2) goto _L6; else goto _L5
_L5:
        j1 = Character.digit(c, 16);
        if (j1 < 0) goto _L8; else goto _L7
_L7:
        j = j1 + (j << 4);
        i++;
        if (i >= 4) goto _L10; else goto _L9
_L9:
        reader = ((Reader) (obj));
          goto _L11
_L8:
        if (i > 4) goto _L10; else goto _L12
_L12:
        throw new IllegalArgumentException("luni.09");
_L33:
        j1 = k;
        if (!Character.isWhitespace(c)) goto _L14; else goto _L13
_L13:
        j1 = k;
        if (k == 3)
        {
            j1 = 5;
        }
        k1 = j1;
          goto _L15
_L44:
        j1 = ((BufferedReader) (obj1)).read();
        if (j1 != -1) goto _L17; else goto _L16
_L16:
        reader = ((Reader) (obj));
          goto _L11
_L50:
        reader = new String(((char []) (obj)), 0, i1);
        put(Enum.valueOf(org/acra/ReportField, reader.substring(0, k)), reader.substring(k));
          goto _L18
_L4:
        i = l;
        if (l == -1)
        {
            i = l;
            if (i1 > 0)
            {
                i = i1;
            }
        }
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        reader = new String(reader, 0, i1);
        obj1 = (ReportField)Enum.valueOf(org/acra/ReportField, reader.substring(0, i));
        obj = reader.substring(i);
        reader = ((Reader) (obj));
        if (k != 1)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        reader = (new StringBuilder()).append(((String) (obj))).append("\0").toString();
        put(((Enum) (obj1)), reader);
        this;
        JVM INSTR monitorexit ;
        return;
_L56:
        k = j1;
          goto _L19
_L40:
        k = k1;
        reader = ((Reader) (obj));
          goto _L11
_L52:
        k = l;
          goto _L20
_L10:
label0:
        {
            k = i1 + 1;
            obj[i1] = (char)j;
            if (c == '\n' || c == '\205')
            {
                break label0;
            }
            i1 = k;
            k = 0;
            reader = ((Reader) (obj));
        }
        if (true) goto _L11; else goto _L21
_L21:
        i1 = k;
        k = 0;
_L6:
        if (k != 1) goto _L23; else goto _L22
_L22:
        c;
        JVM INSTR lookupswitch 9: default 496
    //                   10: 547
    //                   13: 539
    //                   98: 555
    //                   102: 561
    //                   110: 567
    //                   114: 573
    //                   116: 579
    //                   117: 585
    //                   133: 547;
           goto _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L25
_L24:
        k = 0;
_L19:
        j1 = k;
        if (k == 4)
        {
            j1 = 0;
            l = i1;
        }
        obj[i1] = c;
        i1++;
        flag = false;
        k = j1;
        reader = ((Reader) (obj));
          goto _L11
_L26:
        k = 3;
        reader = ((Reader) (obj));
          goto _L11
_L25:
        k = 5;
        reader = ((Reader) (obj));
          goto _L11
_L27:
        c = '\b';
          goto _L24
_L28:
        c = '\f';
          goto _L24
_L29:
        c = '\n';
          goto _L24
_L30:
        c = '\r';
          goto _L24
_L31:
        c = '\t';
          goto _L24
_L32:
        j = 0;
        k = 2;
        i = 0;
        reader = ((Reader) (obj));
          goto _L11
_L23:
        c;
        JVM INSTR lookupswitch 8: default 676
    //                   10: 762
    //                   13: 776
    //                   33: 714
    //                   35: 714
    //                   58: 851
    //                   61: 851
    //                   92: 825
    //                   133: 776;
           goto _L33 _L34 _L35 _L36 _L36 _L37 _L37 _L38 _L35
_L37:
        continue; /* Loop/switch isn't completed */
_L15:
        if (i1 == 0) goto _L40; else goto _L39
_L39:
        k1 = j1;
        if (i1 == l) goto _L40; else goto _L41
_L41:
        if (j1 != 5) goto _L43; else goto _L42
_L42:
        k = j1;
        reader = ((Reader) (obj));
          goto _L11
_L36:
        if (!flag) goto _L33; else goto _L44
_L17:
        j1 = (char)j1;
        k1 = k;
        if (j1 == '\r') goto _L40; else goto _L45
_L45:
        k1 = k;
        if (j1 == '\n') goto _L40; else goto _L46
_L46:
        if (j1 != '\205') goto _L44; else goto _L47
_L47:
        reader = ((Reader) (obj));
          goto _L11
_L34:
        if (k != 3) goto _L35; else goto _L48
_L48:
        k = 5;
        reader = ((Reader) (obj));
          goto _L11
_L35:
        if (i1 <= 0 && (i1 != 0 || l != 0)) goto _L18; else goto _L49
_L49:
        k = l;
        if (l == -1)
        {
            k = i1;
        }
          goto _L50
_L18:
        l = -1;
        i1 = 0;
        flag = true;
        k = 0;
        reader = ((Reader) (obj));
          goto _L11
_L38:
        if (k != 4) goto _L52; else goto _L51
_L51:
        k = i1;
_L20:
        j1 = 1;
        l = k;
        k = j1;
        reader = ((Reader) (obj));
          goto _L11
        if (l != -1) goto _L33; else goto _L53
_L53:
        l = i1;
        k = 0;
        reader = ((Reader) (obj));
          goto _L11
_L43:
        if (l != -1) goto _L14; else goto _L54
_L54:
        k = 4;
        reader = ((Reader) (obj));
          goto _L11
_L14:
        if (j1 != '\005' && j1 != '\003') goto _L56; else goto _L55
_L55:
        k = 0;
          goto _L19
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
        dumpString(writer, reportfield.toString(), true);
        writer.write("=");
        reportfield = s;
        if (s == null)
        {
            reportfield = "";
        }
        dumpString(writer, reportfield, false);
        writer.write(lineSeparator);
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
        System.out.println((new StringBuilder()).append("Warning: encoding name ").append(s1).append(" is illegal, using UTF-8 as default encoding").toString());
        s1 = "UTF-8";
        continue; /* Loop/switch isn't completed */
        obj1;
        System.out.println((new StringBuilder()).append("Warning: encoding ").append(s1).append(" is not supported, using UTF-8 as default encoding").toString());
        s1 = "UTF-8";
        if (true) goto _L2; else goto _L1
_L1:
        outputstream.println("</properties>");
        outputstream.flush();
        this;
        JVM INSTR monitorexit ;
    }

}
