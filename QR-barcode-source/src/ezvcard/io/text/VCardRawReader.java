// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.text;

import ezvcard.VCardException;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

// Referenced classes of package ezvcard.io.text:
//            FoldedLineReader

public class VCardRawReader
    implements Closeable
{
    public static class StopReadingException extends VCardException
    {

        public StopReadingException()
        {
        }
    }

    public static interface VCardDataStreamListener
    {

        public abstract void beginComponent(String s);

        public abstract void endComponent(String s);

        public abstract void invalidLine(String s);

        public abstract void invalidVersion(String s);

        public abstract void readProperty(String s, String s1, VCardParameters vcardparameters, String s2);

        public abstract void readVersion(VCardVersion vcardversion);
    }


    private boolean caretDecodingEnabled;
    private boolean eof;
    private final FoldedLineReader reader;
    private VCardVersion version;

    public VCardRawReader(Reader reader1)
    {
        caretDecodingEnabled = true;
        eof = false;
        version = VCardVersion.V2_1;
        reader = new FoldedLineReader(reader1);
    }

    private void parseLine(String s, VCardDataStreamListener vcarddatastreamlistener)
    {
        int i;
        String s1;
        String s2;
        String s4;
        Object obj;
        VCardParameters vcardparameters;
        StringBuilder stringbuilder;
        boolean flag;
        int j;
        s4 = null;
        s1 = null;
        vcardparameters = new VCardParameters();
        obj = null;
        i = 0;
        flag = false;
        stringbuilder = new StringBuilder();
        s2 = null;
        j = 0;
_L10:
        String s3;
        String s5;
        s5 = s1;
        s3 = obj;
        if (j >= s.length()) goto _L2; else goto _L1
_L1:
        char c = s.charAt(j);
        if (i == 0) goto _L4; else goto _L3
_L3:
        if (i == 92)
        {
            if (c == '\\')
            {
                stringbuilder.append(c);
            } else
            if (c == 'n' || c == 'N')
            {
                stringbuilder.append(StringUtils.NEWLINE);
            } else
            if (c == '"' && version != VCardVersion.V2_1)
            {
                stringbuilder.append(c);
            } else
            if (c == ';' && version == VCardVersion.V2_1)
            {
                stringbuilder.append(c);
            } else
            {
                stringbuilder.append(i).append(c);
            }
        } else
        if (i == 94)
        {
            if (c == '^')
            {
                stringbuilder.append(c);
            } else
            if (c == 'n')
            {
                stringbuilder.append(StringUtils.NEWLINE);
            } else
            if (c == '\'')
            {
                stringbuilder.append('"');
            } else
            {
                stringbuilder.append(i).append(c);
            }
        }
        i = 0;
        s5 = s1;
        s3 = s4;
_L8:
        j++;
        s4 = s3;
        s1 = s5;
        continue; /* Loop/switch isn't completed */
_L4:
        if (c == '\\' || c == '^' && version != VCardVersion.V2_1 && caretDecodingEnabled)
        {
            i = c;
            s3 = s4;
            s5 = s1;
            continue; /* Loop/switch isn't completed */
        }
        if (c == '.' && s4 == null && s1 == null)
        {
            s3 = stringbuilder.toString();
            stringbuilder.setLength(0);
            s5 = s1;
            continue; /* Loop/switch isn't completed */
        }
        if (c != ';' && c != ':' || flag) goto _L6; else goto _L5
_L5:
        if (s1 == null)
        {
            s1 = stringbuilder.toString();
        } else
        {
            s5 = stringbuilder.toString();
            s3 = s5;
            if (version == VCardVersion.V2_1)
            {
                s3 = StringUtils.ltrim(s5);
            }
            vcardparameters.put(s2, s3);
            s2 = null;
        }
        stringbuilder.setLength(0);
        s3 = s4;
        s5 = s1;
        if (c != ':')
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j < s.length() - 1)
        {
            s3 = s.substring(j + 1);
            s5 = s1;
        } else
        {
            s3 = "";
            s5 = s1;
        }
_L2:
        if (s5 == null || s3 == null)
        {
            vcarddatastreamlistener.invalidLine(s);
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (c == ',' && !flag && version != VCardVersion.V2_1)
        {
            vcardparameters.put(s2, stringbuilder.toString());
            stringbuilder.setLength(0);
            s3 = s4;
            s5 = s1;
        } else
        if (c == '=' && s2 == null)
        {
            s3 = stringbuilder.toString();
            s2 = s3;
            if (version == VCardVersion.V2_1)
            {
                s2 = StringUtils.rtrim(s3);
            }
            stringbuilder.setLength(0);
            s3 = s4;
            s5 = s1;
        } else
        if (c == '"' && version != VCardVersion.V2_1)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s3 = s4;
            s5 = s1;
        } else
        {
            stringbuilder.append(c);
            s3 = s4;
            s5 = s1;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if ("VERSION".equalsIgnoreCase(s5))
        {
            s = VCardVersion.valueOfByStr(s3.trim());
            if (s == null)
            {
                vcarddatastreamlistener.invalidVersion(s3);
                return;
            } else
            {
                version = s;
                vcarddatastreamlistener.readVersion(s);
                return;
            }
        }
        if ("BEGIN".equalsIgnoreCase(s5))
        {
            vcarddatastreamlistener.beginComponent(s3.trim());
            return;
        }
        if ("END".equalsIgnoreCase(s5))
        {
            vcarddatastreamlistener.endComponent(s3.trim());
            return;
        }
        vcarddatastreamlistener.readProperty(s4, s5, vcardparameters, s3);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void close()
        throws IOException
    {
        reader.close();
    }

    public boolean eof()
    {
        return eof;
    }

    public int getLineNum()
    {
        return reader.getLineNum();
    }

    public boolean isCaretDecodingEnabled()
    {
        return caretDecodingEnabled;
    }

    public void setCaretDecodingEnabled(boolean flag)
    {
        caretDecodingEnabled = flag;
    }

    public void start(VCardDataStreamListener vcarddatastreamlistener)
        throws IOException
    {
        do
        {
            String s = reader.readLine();
            if (s != null)
            {
                try
                {
                    parseLine(s, vcarddatastreamlistener);
                }
                // Misplaced declaration of an exception variable
                catch (VCardDataStreamListener vcarddatastreamlistener)
                {
                    return;
                }
            } else
            {
                eof = true;
                return;
            }
        } while (true);
    }
}
