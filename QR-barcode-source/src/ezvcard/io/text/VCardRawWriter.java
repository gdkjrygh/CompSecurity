// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.text;

import ezvcard.VCardVersion;
import ezvcard.parameter.Encoding;
import ezvcard.parameter.VCardParameters;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package ezvcard.io.text:
//            FoldingScheme, FoldedLineWriter

public class VCardRawWriter
    implements Closeable, Flushable
{
    public static interface ProblemsListener
    {

        public abstract void onParameterValueChanged(String s, String s1, String s2, String s3);
    }


    private static final Map invalidParamValueChars;
    private static final Pattern newlineRegex = Pattern.compile("\\r\\n|\\r|\\n");
    private static final Pattern propertyNameRegex = Pattern.compile("(?i)[-a-z0-9]+");
    private static final Pattern quoteMeRegex = Pattern.compile(".*?[,:;].*");
    private boolean caretEncodingEnabled;
    private final FoldingScheme foldingScheme;
    private final String newline;
    private ProblemsListener problemsListener;
    private VCardVersion version;
    private final FoldedLineWriter writer;

    public VCardRawWriter(Writer writer1, VCardVersion vcardversion)
    {
        this(writer1, vcardversion, FoldingScheme.MIME_DIR);
    }

    public VCardRawWriter(Writer writer1, VCardVersion vcardversion, FoldingScheme foldingscheme)
    {
        this(writer1, vcardversion, foldingscheme, "\r\n");
    }

    public VCardRawWriter(Writer writer1, VCardVersion vcardversion, FoldingScheme foldingscheme, String s)
    {
        caretEncodingEnabled = false;
        if (foldingscheme == null)
        {
            writer = new FoldedLineWriter(writer1, null, "", s);
        } else
        {
            writer = new FoldedLineWriter(writer1, Integer.valueOf(foldingscheme.getLineLength()), foldingscheme.getIndent(), s);
        }
        version = vcardversion;
        foldingScheme = foldingscheme;
        newline = s;
    }

    private String applyCaretEncoding(String s)
    {
        s = s.replace("^", "^^");
        return newlineRegex.matcher(s).replaceAll("^n").replace("\"", "^'");
    }

    private boolean containsNewlines(String s)
    {
        return newlineRegex.matcher(s).find();
    }

    private String escapeNewlines(String s)
    {
        return newlineRegex.matcher(s).replaceAll("\\\\n");
    }

    private String removeInvalidParameterValueChars(String s)
    {
        BitSet bitset = (BitSet)invalidParamValueChars.get(version);
        StringBuilder stringbuilder = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (!bitset.get(c))
            {
                stringbuilder.append(c);
            }
        }

        if (stringbuilder.length() == s.length())
        {
            return s;
        } else
        {
            return stringbuilder.toString();
        }
    }

    private String sanitizeParameterValue(String s, String s1, String s2)
    {
        String s3;
        boolean flag;
        s3 = null;
        flag = false;
        static class _cls1
        {

            static final int $SwitchMap$ezvcard$VCardVersion[];

            static 
            {
                $SwitchMap$ezvcard$VCardVersion = new int[VCardVersion.values().length];
                try
                {
                    $SwitchMap$ezvcard$VCardVersion[VCardVersion.V2_1.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ezvcard$VCardVersion[VCardVersion.V3_0.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ezvcard$VCardVersion[VCardVersion.V4_0.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.ezvcard.VCardVersion[version.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 73
    //                   2 131
    //                   3 215;
           goto _L1 _L2 _L3 _L4
_L1:
        if (flag && problemsListener != null)
        {
            problemsListener.onParameterValueChanged(s2, s1, s, s3);
        }
        return s3;
_L2:
        s3 = removeInvalidParameterValueChars(s);
        s3 = newlineRegex.matcher(s3).replaceAll(" ");
        if (s != s3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s3 = s3.replace("\\", "\\\\").replace(";", "\\;");
        continue; /* Loop/switch isn't completed */
_L3:
        s3 = removeInvalidParameterValueChars(s);
        if (caretEncodingEnabled)
        {
            if (s3 != s)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s3 = applyCaretEncoding(s3);
        } else
        {
            s3 = s3.replace('"', '\'');
            s3 = newlineRegex.matcher(s3).replaceAll(" ");
            if (s3 != s)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        s3 = removeInvalidParameterValueChars(s);
        if (caretEncodingEnabled)
        {
            if (s3 != s)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s3 = applyCaretEncoding(s3);
        } else
        {
            s3 = s3.replace('"', '\'');
            if (s3 != s)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s3 = newlineRegex.matcher(s3).replaceAll("\\\\\\n");
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private String sanitizeValue(VCardParameters vcardparameters, String s)
    {
        if (s == null)
        {
            return "";
        }
        if (version == VCardVersion.V2_1 && containsNewlines(s))
        {
            vcardparameters.setEncoding(Encoding.QUOTED_PRINTABLE);
            return s;
        } else
        {
            return escapeNewlines(s);
        }
    }

    public void close()
        throws IOException
    {
        writer.close();
    }

    public void flush()
        throws IOException
    {
        writer.flush();
    }

    public FoldingScheme getFoldingScheme()
    {
        return foldingScheme;
    }

    public String getNewline()
    {
        return newline;
    }

    public ProblemsListener getProblemsListener()
    {
        return problemsListener;
    }

    public VCardVersion getVersion()
    {
        return version;
    }

    public boolean isCaretEncodingEnabled()
    {
        return caretEncodingEnabled;
    }

    public void setCaretEncodingEnabled(boolean flag)
    {
        caretEncodingEnabled = flag;
    }

    public void setProblemsListener(ProblemsListener problemslistener)
    {
        problemsListener = problemslistener;
    }

    public void setVersion(VCardVersion vcardversion)
    {
        version = vcardversion;
    }

    public void writeBeginComponent(String s)
        throws IOException
    {
        writeProperty("BEGIN", s);
    }

    public void writeEndComponent(String s)
        throws IOException
    {
        writeProperty("END", s);
    }

    public void writeProperty(String s, String s1)
        throws IOException
    {
        writeProperty(null, s, new VCardParameters(), s1);
    }

    public void writeProperty(String s, String s1, VCardParameters vcardparameters, String s2)
        throws IOException
    {
        if (s != null && !propertyNameRegex.matcher(s).matches())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Group contains invalid characters.  Valid characters are letters, numbers, and hyphens: ").append(s).toString());
        }
        if (!propertyNameRegex.matcher(s1).matches())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Property name contains invalid characters.  Valid characters are letters, numbers, and hyphens: ").append(s1).toString());
        }
        s2 = sanitizeValue(vcardparameters, s2);
        if (s != null)
        {
            writer.append(s);
            writer.append('.');
        }
        writer.append(s1);
        s = vcardparameters.iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)s.next();
            String s3 = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (List)((java.util.Map.Entry) (obj)).getValue();
            if (!((List) (obj)).isEmpty())
            {
                if (version == VCardVersion.V2_1)
                {
                    boolean flag1 = "TYPE".equalsIgnoreCase(s3);
                    obj = ((List) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s4 = sanitizeParameterValue((String)((Iterator) (obj)).next(), s3, s1);
                        if (flag1)
                        {
                            writer.append(';').append(s4.toUpperCase());
                        } else
                        {
                            writer.append(';').append(s3).append('=').append(s4);
                        }
                    }
                } else
                {
                    boolean flag = true;
                    writer.append(';').append(s3).append('=');
                    obj = ((List) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s5 = (String)((Iterator) (obj)).next();
                        if (!flag)
                        {
                            writer.append(',');
                        }
                        s5 = sanitizeParameterValue(s5, s3, s1);
                        if (quoteMeRegex.matcher(s5).matches())
                        {
                            writer.append('"');
                            writer.append(s5);
                            writer.append('"');
                        } else
                        {
                            writer.append(s5);
                        }
                        flag = false;
                    }
                }
            }
        } while (true);
        writer.append(':');
        boolean flag2;
        if (vcardparameters.getEncoding() == Encoding.QUOTED_PRINTABLE)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        writer.append(s2, flag2);
        writer.append(newline);
    }

    public void writeVersion()
        throws IOException
    {
        writeProperty("VERSION", version.getVersion());
    }

    static 
    {
        invalidParamValueChars = new HashMap();
        BitSet bitset = new BitSet(128);
        bitset.set(0, 31);
        bitset.set(127);
        bitset.set(9, false);
        bitset.set(10, false);
        bitset.set(13, false);
        BitSet bitset1 = new BitSet(128);
        bitset1.or(bitset);
        bitset1.set(44);
        bitset1.set(46);
        bitset1.set(58);
        bitset1.set(61);
        bitset1.set(91);
        bitset1.set(93);
        invalidParamValueChars.put(VCardVersion.V2_1, bitset1);
        bitset1 = new BitSet(128);
        bitset1.or(bitset);
        invalidParamValueChars.put(VCardVersion.V3_0, bitset1);
        invalidParamValueChars.put(VCardVersion.V4_0, bitset1);
    }
}
