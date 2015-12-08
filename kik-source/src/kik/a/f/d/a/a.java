// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.d.a;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Hashtable;
import org.d.a.b;

public class a
    implements org.d.a.a
{

    private static final String ILLEGAL_TYPE = "Wrong event type";
    private static final int LEGACY = 999;
    private static final String UNEXPECTED_EOF = "Unexpected EOF";
    private static final int XML_DECL = 998;
    private int attributeCount;
    private String attributes[];
    protected int column;
    private boolean degenerated;
    private int depth;
    private String elementStack[];
    private String encoding;
    private Hashtable entityMap;
    private String error;
    private boolean isWhitespace;
    protected int line;
    private Object location;
    private String name;
    private String namespace;
    private int nspCounts[];
    private String nspStack[];
    protected int peek[];
    protected int peekCount;
    private String prefix;
    private boolean processNsp;
    private Reader reader;
    private boolean relaxed;
    protected char srcBuf[];
    protected int srcCount;
    protected int srcPos;
    private int stackMismatch;
    private Boolean standalone;
    private boolean token;
    private char txtBuf[];
    private int txtPos;
    private int type;
    private boolean unresolved;
    private String version;
    protected boolean wasCR;

    public a()
    {
        char c = '\200';
        super();
        elementStack = new String[16];
        nspStack = new String[8];
        nspCounts = new int[4];
        txtBuf = new char[128];
        attributes = new String[16];
        stackMismatch = 0;
        peek = new int[2];
        if (Runtime.getRuntime().freeMemory() >= 0x100000L)
        {
            c = '\u2000';
        }
        srcBuf = new char[c];
    }

    private final boolean adjustNsp()
    {
        int i;
        boolean flag;
        i = 0;
        flag = false;
_L7:
        String s4;
        int l;
        if (i >= attributeCount << 2)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        s4 = attributes[i + 2];
        l = s4.indexOf(':');
        if (l == -1) goto _L2; else goto _L1
_L1:
        String s;
        String s2;
        s2 = s4.substring(0, l);
        s = s4.substring(l + 1);
_L5:
        boolean flag1;
        if (!s2.equals("xmlns"))
        {
            flag1 = true;
            l = i;
        } else
        {
            Object aobj[] = nspCounts;
            l = depth;
            int j1 = aobj[l];
            aobj[l] = j1 + 1;
            l = j1 << 1;
            nspStack = ensureCapacity(nspStack, l + 2);
            nspStack[l] = s;
            nspStack[l + 1] = attributes[i + 3];
            if (s != null && attributes[i + 3].equals(""))
            {
                error("illegal empty namespace");
            }
            String as[] = attributes;
            aobj = attributes;
            l = attributeCount - 1;
            attributeCount = l;
            System.arraycopy(as, i + 4, ((Object) (aobj)), i, (l << 2) - i);
            l = i - 4;
            flag1 = flag;
        }
_L4:
        i = l + 4;
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L2:
        l = i;
        flag1 = flag;
        if (!s4.equals("xmlns")) goto _L4; else goto _L3
_L3:
        s = null;
        s2 = s4;
          goto _L5
        if (flag)
        {
            for (int j = (attributeCount << 2) - 4; j >= 0; j -= 4)
            {
                String s3 = attributes[j + 2];
                int i1 = s3.indexOf(':');
                if (i1 == 0 && !relaxed)
                {
                    throw new RuntimeException((new StringBuilder("illegal attribute name: ")).append(s3).append(" at ").append(this).toString());
                }
                if (i1 == -1)
                {
                    continue;
                }
                String s1 = s3.substring(0, i1);
                s3 = s3.substring(i1 + 1);
                String s5 = getNamespace(s1);
                if (s5 == null && !relaxed)
                {
                    throw new RuntimeException((new StringBuilder("Undefined Prefix: ")).append(s1).append(" in ").append(this).toString());
                }
                attributes[j] = s5;
                attributes[j + 1] = s1;
                attributes[j + 2] = s3;
            }

        }
        int k = name.indexOf(':');
        if (k == 0)
        {
            error((new StringBuilder("illegal tag name: ")).append(name).toString());
        }
        if (k != -1)
        {
            prefix = name.substring(0, k);
            name = name.substring(k + 1);
        }
        namespace = getNamespace(prefix);
        if (namespace == null)
        {
            if (prefix != null)
            {
                error((new StringBuilder("undefined prefix: ")).append(prefix).toString());
            }
            namespace = "";
        }
        return flag;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private final String[] ensureCapacity(String as[], int i)
    {
        if (as.length >= i)
        {
            return as;
        } else
        {
            String as1[] = new String[i + 16];
            System.arraycopy(as, 0, as1, 0, as.length);
            return as1;
        }
    }

    private final void error(String s)
    {
        if (relaxed)
        {
            if (error == null)
            {
                error = (new StringBuilder("ERR: ")).append(s).toString();
            }
            return;
        } else
        {
            exception(s);
            return;
        }
    }

    private final void exception(String s)
    {
        if (s.length() >= 100)
        {
            s = (new StringBuilder()).append(s.substring(0, 100)).append("\n").toString();
        }
        throw new b(s, this, null);
    }

    private final String get(int i)
    {
        return new String(txtBuf, i, txtPos - i);
    }

    private final boolean isProp(String s, boolean flag, String s1)
    {
        if (!s.startsWith("http://xmlpull.org/v1/doc/"))
        {
            return false;
        }
        if (flag)
        {
            return s.substring(42).equals(s1);
        } else
        {
            return s.substring(40).equals(s1);
        }
    }

    private final void nextImpl()
    {
        int i;
        boolean flag;
        flag = false;
        i = 0;
        if (reader == null)
        {
            exception("No Input specified");
        }
        if (type == 3)
        {
            depth = depth - 1;
        }
_L8:
        attributeCount = -1;
        if (!degenerated) goto _L2; else goto _L1
_L1:
        degenerated = false;
        type = 3;
_L4:
        return;
_L2:
        if (error != null)
        {
            for (; i < error.length(); i++)
            {
                push(error.charAt(i));
            }

            error = null;
            type = 9;
            return;
        }
        if (!relaxed || stackMismatch <= 0 && (peek(0) != -1 || depth <= 0))
        {
            break; /* Loop/switch isn't completed */
        }
        i = depth - 1 << 2;
        type = 3;
        namespace = elementStack[i];
        prefix = elementStack[i + 1];
        name = elementStack[i + 2];
        if (stackMismatch != 1)
        {
            error = (new StringBuilder("missing end tag /")).append(name).append(" inserted").toString();
        }
        if (stackMismatch > 0)
        {
            stackMismatch = stackMismatch - 1;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        prefix = null;
        name = null;
        namespace = null;
        type = peekType();
        switch (type)
        {
        case 5: // '\005'
        default:
            type = parseLegacy(token);
            if (type != 998)
            {
                return;
            }
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            break;

        case 6: // '\006'
            pushEntity();
            return;

        case 2: // '\002'
            parseStartTag(false);
            return;

        case 3: // '\003'
            parseEndTag();
            return;

        case 4: // '\004'
            if (!token)
            {
                flag = true;
            }
            pushText(60, flag);
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (depth != 0 || !isWhitespace) goto _L4; else goto _L6
_L6:
        type = 7;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private final void parseDoctype(boolean flag)
    {
        int j;
        boolean flag2;
        flag2 = false;
        j = 1;
_L10:
        int k = read();
        k;
        JVM INSTR lookupswitch 4: default 56
    //                   -1: 87
    //                   39: 94
    //                   60: 115
    //                   62: 137;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        boolean flag1;
        int i;
        i = j;
        flag1 = flag2;
_L6:
        flag2 = flag1;
        j = i;
        if (flag)
        {
            push(k);
            flag2 = flag1;
            j = i;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        error("Unexpected EOF");
        return;
_L3:
        if (!flag2)
        {
            flag1 = true;
            i = j;
        } else
        {
            flag1 = false;
            i = j;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        flag1 = flag2;
        i = j;
        if (!flag2)
        {
            i = j + 1;
            flag1 = flag2;
        }
        if (true) goto _L6; else goto _L5
_L5:
        flag1 = flag2;
        i = j;
        if (flag2) goto _L6; else goto _L7
_L7:
        j--;
        flag1 = flag2;
        i = j;
        if (j != 0) goto _L6; else goto _L8
_L8:
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private final void parseEndTag()
    {
        read();
        read();
        name = readName();
        skip();
        read('>');
        int j = depth - 1 << 2;
        if (depth == 0)
        {
            error("element stack empty");
            type = 9;
            return;
        }
        if (!name.equals(elementStack[j + 3]))
        {
            error((new StringBuilder("expected: /")).append(elementStack[j + 3]).append(" read: ").append(name).toString());
            int i;
            for (i = j; i >= 0 && !name.toLowerCase().equals(elementStack[i + 3].toLowerCase()); i -= 4)
            {
                stackMismatch = stackMismatch + 1;
            }

            if (i < 0)
            {
                stackMismatch = 0;
                type = 9;
                return;
            }
        }
        namespace = elementStack[j];
        prefix = elementStack[j + 1];
        name = elementStack[j + 2];
    }

    private final int parseLegacy(boolean flag)
    {
        read();
        int i = read();
        if (i == 63)
        {
            if ((peek(0) == 120 || peek(0) == 88) && (peek(1) == 109 || peek(1) == 77))
            {
                if (flag)
                {
                    push(peek(0));
                    push(peek(1));
                }
                read();
                read();
                if ((peek(0) == 108 || peek(0) == 76) && peek(1) <= 32)
                {
                    if (line != 1 || column > 4)
                    {
                        error("PI must not start with xml");
                    }
                    parseStartTag(true);
                    if (attributeCount <= 0 || !"version".equals(attributes[2]))
                    {
                        error("version expected");
                    }
                    version = attributes[3];
                    String s1;
                    int j;
                    int k;
                    int l;
                    if (1 < attributeCount && "encoding".equals(attributes[6]))
                    {
                        encoding = attributes[7];
                        i = 2;
                    } else
                    {
                        i = 1;
                    }
                    j = i;
                    if (i < attributeCount)
                    {
                        j = i;
                        if ("standalone".equals(attributes[i * 4 + 2]))
                        {
                            String s = attributes[i * 4 + 3];
                            if ("yes".equals(s))
                            {
                                standalone = new Boolean(true);
                            } else
                            if ("no".equals(s))
                            {
                                standalone = new Boolean(false);
                            } else
                            {
                                error((new StringBuilder("illegal standalone value: ")).append(s).toString());
                            }
                            j = i + 1;
                        }
                    }
                    if (j != attributeCount)
                    {
                        error("illegal xmldecl");
                    }
                    isWhitespace = true;
                    txtPos = 0;
                    return 998;
                }
            }
            i = 8;
            s1 = "";
            j = 63;
        } else
        if (i == 33)
        {
            if (peek(0) == 45)
            {
                j = 45;
                s1 = "--";
                i = 9;
            } else
            if (peek(0) == 91)
            {
                i = 5;
                s1 = "[CDATA[";
                j = 93;
                flag = true;
            } else
            {
                i = 10;
                s1 = "DOCTYPE";
                j = -1;
            }
        } else
        {
            error((new StringBuilder("illegal: <")).append(i).toString());
            return 9;
        }
        for (k = 0; k < s1.length(); k++)
        {
            read(s1.charAt(k));
        }

        if (i != 10)
        {
            break MISSING_BLOCK_LABEL_642;
        }
        parseDoctype(flag);
        return i;
_L2:
        if (flag)
        {
            push(l);
        }
        if ((j == 63 || l == j) && peek(0) == j && peek(1) == 62)
        {
            break; /* Loop/switch isn't completed */
        }
        k = l;
_L3:
        l = read();
        if (l == -1)
        {
            error("Unexpected EOF");
            return 9;
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (j == 45 && k == 45)
        {
            error("illegal comment delimiter: --->");
        }
        read();
        read();
        if (flag && j != 63)
        {
            txtPos = txtPos - 1;
        }
        break MISSING_BLOCK_LABEL_516;
        k = 0;
          goto _L3
    }

    private final void parseStartTag(boolean flag)
    {
        if (!flag)
        {
            read();
        }
        name = readName();
        attributeCount = 0;
_L3:
        int i;
label0:
        {
            skip();
            i = peek(0);
            if (flag)
            {
                if (i == 63)
                {
                    read();
                    read('>');
                    return;
                }
                break label0;
            }
            int ai[];
            if (i == 47)
            {
                degenerated = true;
                read();
                skip();
                read('>');
            } else
            {
                if (i != 62 || flag)
                {
                    break label0;
                }
                read();
            }
        }
_L1:
        i = depth;
        depth = i + 1;
        i <<= 2;
        elementStack = ensureCapacity(elementStack, i + 4);
        elementStack[i + 3] = name;
        if (depth >= nspCounts.length)
        {
            ai = new int[depth + 4];
            System.arraycopy(nspCounts, 0, ai, 0, nspCounts.length);
            nspCounts = ai;
        }
        nspCounts[depth] = nspCounts[depth - 1];
        String s;
        String as[];
        int j;
        int k;
        if (processNsp)
        {
            adjustNsp();
        } else
        {
            namespace = "";
        }
        elementStack[i] = namespace;
        elementStack[i + 1] = prefix;
        elementStack[i + 2] = name;
        return;
label1:
        {
            if (i == -1)
            {
                error("Unexpected EOF");
                return;
            }
            s = readName();
            if (s.length() != 0)
            {
                break label1;
            }
            error("attr name expected");
        }
          goto _L1
        i = attributeCount;
        attributeCount = i + 1;
        j = i << 2;
        attributes = ensureCapacity(attributes, j + 4);
        as = attributes;
        i = j + 1;
        as[j] = "";
        as = attributes;
        k = i + 1;
        as[i] = null;
        as = attributes;
        j = k + 1;
        as[k] = s;
        skip();
        if (peek(0) != 61)
        {
            error((new StringBuilder("Attr.value missing f. ")).append(s).toString());
            attributes[j] = "1";
        } else
        {
            read('=');
            skip();
            i = peek(0);
            if (i != 39 && i != 34)
            {
                error("attr value delimiter missing!");
                i = 32;
            } else
            {
                read();
            }
            k = txtPos;
            pushText(i, true);
            attributes[j] = get(k);
            txtPos = k;
            if (i != 32)
            {
                read();
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    private final int peek(int i)
    {
        while (i >= peekCount) 
        {
            int j;
            if (srcBuf.length <= 1)
            {
                j = reader.read();
            } else
            if (srcPos < srcCount)
            {
                char ac[] = srcBuf;
                j = srcPos;
                srcPos = j + 1;
                j = ac[j];
            } else
            {
                srcCount = reader.read(srcBuf, 0, srcBuf.length);
                if (srcCount <= 0)
                {
                    j = -1;
                } else
                {
                    j = srcBuf[0];
                }
                srcPos = 1;
            }
            if (j == 13)
            {
                wasCR = true;
                int ai[] = peek;
                j = peekCount;
                peekCount = j + 1;
                ai[j] = 10;
            } else
            {
                if (j == 10)
                {
                    if (!wasCR)
                    {
                        int ai1[] = peek;
                        j = peekCount;
                        peekCount = j + 1;
                        ai1[j] = 10;
                    }
                } else
                {
                    int ai2[] = peek;
                    int k = peekCount;
                    peekCount = k + 1;
                    ai2[k] = j;
                }
                wasCR = false;
            }
        }
        return peek[i];
    }

    private final int peekType()
    {
        byte byte0 = 1;
        switch (peek(0))
        {
        default:
            byte0 = 4;
            // fall through

        case -1: 
            return byte0;

        case 38: // '&'
            return 6;

        case 60: // '<'
            switch (peek(1))
            {
            default:
                return 2;

            case 47: // '/'
                return 3;

            case 33: // '!'
            case 63: // '?'
                return 999;
            }
        }
    }

    private final void push(int i)
    {
        boolean flag = isWhitespace;
        char ac1[];
        int j;
        if (i <= 32)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        isWhitespace = j & flag;
        if (txtPos == txtBuf.length)
        {
            char ac[] = new char[(txtPos * 4) / 3 + 4];
            System.arraycopy(txtBuf, 0, ac, 0, txtPos);
            txtBuf = ac;
        }
        ac1 = txtBuf;
        j = txtPos;
        txtPos = j + 1;
        ac1[j] = (char)i;
    }

    private final void pushEntity()
    {
        int i;
        int j;
        boolean flag;
        flag = true;
        i = 0;
        push(read());
        j = txtPos;
_L3:
        int k;
        k = read();
        if (k == 59)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (k >= 128 || k >= 48 && k <= 57 || k >= 97 && k <= 122 || k >= 65 && k <= 90 || k == 95 || k == 45 || k == 35) goto _L2; else goto _L1
_L1:
        if (!relaxed)
        {
            error("unterminated entity ref");
        }
        if (k != -1)
        {
            push(k);
        }
_L4:
        return;
_L2:
        push(k);
          goto _L3
        String s = get(j);
        txtPos = j - 1;
        if (token && type == 6)
        {
            name = s;
        }
        if (s.charAt(0) == '#')
        {
            if (s.charAt(1) == 'x')
            {
                i = Integer.parseInt(s.substring(2), 16);
            } else
            {
                i = Integer.parseInt(s.substring(1));
            }
            push(i);
            return;
        }
        String s1 = (String)entityMap.get(s);
        if (s1 != null)
        {
            flag = false;
        }
        unresolved = flag;
        if (unresolved)
        {
            if (!token)
            {
                error((new StringBuilder("unresolved: &")).append(s).append(";").toString());
                return;
            }
        } else
        {
            while (i < s1.length()) 
            {
                push(s1.charAt(i));
                i++;
            }
        }
          goto _L4
    }

    private final void pushText(int i, boolean flag)
    {
        int k = peek(0);
        int j = 0;
        do
        {
            if (k == -1 || k == i || i == 32 && (k <= 32 || k == 62))
            {
                break MISSING_BLOCK_LABEL_147;
            }
            if (k == 38)
            {
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_147;
                }
                pushEntity();
            } else
            if (k == 10 && type == 2)
            {
                read();
                push(32);
            } else
            {
                push(read());
            }
            if (k == 62 && j >= 2 && i != 93)
            {
                error("Illegal: ]]>");
            }
            if (k == 93)
            {
                j++;
            } else
            {
                j = 0;
            }
            k = peek(0);
        } while (true);
    }

    private final int read()
    {
        int i;
        if (peekCount == 0)
        {
            i = peek(0);
        } else
        {
            i = peek[0];
            peek[0] = peek[1];
        }
        peekCount = peekCount - 1;
        column = column + 1;
        if (i == 10)
        {
            line = line + 1;
            column = 1;
        }
        return i;
    }

    private final void read(char c)
    {
        int i = read();
        if (i != c)
        {
            error((new StringBuilder("expected: '")).append(c).append("' actual: '").append((char)i).append("'").toString());
        }
    }

    private final String readName()
    {
        int i = txtPos;
        int j = peek(0);
        if ((j < 97 || j > 122) && (j < 65 || j > 90) && j != 95 && j != 58 && j < 192 && !relaxed)
        {
            error("name expected");
        }
        do
        {
            push(read());
            j = peek(0);
        } while (j >= 97 && j <= 122 || j >= 65 && j <= 90 || j >= 48 && j <= 57 || j == 95 || j == 45 || j == 58 || j == 46 || j >= 183);
        String s = get(i);
        txtPos = i;
        return s;
    }

    private final void skip()
    {
        do
        {
            int i = peek(0);
            if (i <= 32 && i != -1)
            {
                read();
            } else
            {
                return;
            }
        } while (true);
    }

    public void defineEntityReplacementText(String s, String s1)
    {
        if (entityMap == null)
        {
            throw new RuntimeException("entity replacement text must be defined after setInput!");
        } else
        {
            entityMap.put(s, s1);
            return;
        }
    }

    public int getAttributeCount()
    {
        return attributeCount;
    }

    public String getAttributeName(int i)
    {
        if (i >= attributeCount)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return attributes[(i << 2) + 2];
        }
    }

    public String getAttributeNamespace(int i)
    {
        if (i >= attributeCount)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return attributes[i << 2];
        }
    }

    public String getAttributePrefix(int i)
    {
        if (i >= attributeCount)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return attributes[(i << 2) + 1];
        }
    }

    public String getAttributeType(int i)
    {
        return "CDATA";
    }

    public String getAttributeValue(int i)
    {
        if (i >= attributeCount)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return attributes[(i << 2) + 3];
        }
    }

    public String getAttributeValue(String s, String s1)
    {
        for (int i = (attributeCount << 2) - 4; i >= 0; i -= 4)
        {
            if (attributes[i + 2].equals(s1) && (s == null || attributes[i].equals(s)))
            {
                return attributes[i + 3];
            }
        }

        return null;
    }

    public int getColumnNumber()
    {
        return column;
    }

    public int getDepth()
    {
        return depth;
    }

    public int getEventType()
    {
        return type;
    }

    public boolean getFeature(String s)
    {
        boolean flag = false;
        if ("http://xmlpull.org/v1/doc/features.html#process-namespaces".equals(s))
        {
            flag = processNsp;
        } else
        if (isProp(s, false, "relaxed"))
        {
            return relaxed;
        }
        return flag;
    }

    public String getInputEncoding()
    {
        return encoding;
    }

    public int getLineNumber()
    {
        return line;
    }

    public String getName()
    {
        return name;
    }

    public String getNamespace()
    {
        return namespace;
    }

    public String getNamespace(String s)
    {
        if ("xml".equals(s))
        {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(s))
        {
            return "http://www.w3.org/2000/xmlns/";
        }
        for (int i = (getNamespaceCount(depth) << 1) - 2; i >= 0; i -= 2)
        {
            if (s == null)
            {
                if (nspStack[i] == null)
                {
                    return nspStack[i + 1];
                }
                continue;
            }
            if (s.equals(nspStack[i]))
            {
                return nspStack[i + 1];
            }
        }

        return null;
    }

    public int getNamespaceCount(int i)
    {
        if (i > depth)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return nspCounts[i];
        }
    }

    public String getNamespacePrefix(int i)
    {
        return nspStack[i << 1];
    }

    public String getNamespaceUri(int i)
    {
        return nspStack[(i << 1) + 1];
    }

    public String getPositionDescription()
    {
        String s;
        StringBuffer stringbuffer;
        if (type < a.length)
        {
            s = a[type];
        } else
        {
            s = "unknown";
        }
        stringbuffer = new StringBuffer(s);
        stringbuffer.append(' ');
        if (type == 2 || type == 3)
        {
            if (degenerated)
            {
                stringbuffer.append("(empty) ");
            }
            stringbuffer.append('<');
            if (type == 3)
            {
                stringbuffer.append('/');
            }
            if (prefix != null)
            {
                stringbuffer.append((new StringBuilder("{")).append(namespace).append("}").append(prefix).append(":").toString());
            }
            stringbuffer.append(name);
            int j = attributeCount;
            for (int i = 0; i < j << 2; i += 4)
            {
                stringbuffer.append(' ');
                if (attributes[i + 1] != null)
                {
                    stringbuffer.append((new StringBuilder("{")).append(attributes[i]).append("}").append(attributes[i + 1]).append(":").toString());
                }
                stringbuffer.append((new StringBuilder()).append(attributes[i + 2]).append("='").append(attributes[i + 3]).append("'").toString());
            }

            stringbuffer.append('>');
        } else
        if (type != 7)
        {
            if (type != 4)
            {
                stringbuffer.append(getText());
            } else
            if (isWhitespace)
            {
                stringbuffer.append("(whitespace)");
            } else
            {
                String s2 = getText();
                String s1 = s2;
                if (s2.length() > 16)
                {
                    s1 = (new StringBuilder()).append(s2.substring(0, 16)).append("...").toString();
                }
                stringbuffer.append(s1);
            }
        }
        stringbuffer.append((new StringBuilder("@")).append(line).append(":").append(column).toString());
        if (location != null)
        {
            stringbuffer.append(" in ");
            stringbuffer.append(location);
        } else
        if (reader != null)
        {
            stringbuffer.append(" in ");
            stringbuffer.append(reader.toString());
        }
        return stringbuffer.toString();
    }

    public String getPrefix()
    {
        return prefix;
    }

    public Object getProperty(String s)
    {
        if (isProp(s, true, "xmldecl-version"))
        {
            return version;
        }
        if (isProp(s, true, "xmldecl-standalone"))
        {
            return standalone;
        }
        if (isProp(s, true, "location"))
        {
            if (location != null)
            {
                return location;
            } else
            {
                return reader.toString();
            }
        } else
        {
            return null;
        }
    }

    public String getText()
    {
        if (type < 4 || type == 6 && unresolved)
        {
            return null;
        } else
        {
            return get(0);
        }
    }

    public char[] getTextCharacters(int ai[])
    {
        if (type >= 4)
        {
            if (type == 6)
            {
                ai[0] = 0;
                ai[1] = name.length();
                return name.toCharArray();
            } else
            {
                ai[0] = 0;
                ai[1] = txtPos;
                return txtBuf;
            }
        } else
        {
            ai[0] = -1;
            ai[1] = -1;
            return null;
        }
    }

    public boolean isAttributeDefault(int i)
    {
        return false;
    }

    public boolean isEmptyElementTag()
    {
        if (type != 2)
        {
            exception("Wrong event type");
        }
        return degenerated;
    }

    public boolean isWhitespace()
    {
        if (type != 4 && type != 7 && type != 5)
        {
            exception("Wrong event type");
        }
        return isWhitespace;
    }

    public int next()
    {
        txtPos = 0;
        isWhitespace = true;
        int i = 9999;
        token = false;
        int j;
        do
        {
            do
            {
                nextImpl();
                j = i;
                if (type < i)
                {
                    j = type;
                }
                i = j;
            } while (j > 6);
            if (j < 4)
            {
                break;
            }
            i = j;
        } while (peekType() >= 4);
        type = j;
        if (type > 4)
        {
            type = 4;
        }
        return type;
    }

    public int nextTag()
    {
        next();
        if (type == 4 && isWhitespace)
        {
            next();
        }
        if (type != 3 && type != 2)
        {
            exception("unexpected type");
        }
        return type;
    }

    public String nextText()
    {
        if (type != 2)
        {
            exception("precondition: START_TAG");
        }
        next();
        String s;
        if (type == 4)
        {
            s = getText();
            next();
        } else
        {
            s = "";
        }
        if (type != 3)
        {
            exception("END_TAG expected");
        }
        return s;
    }

    public int nextToken()
    {
        isWhitespace = true;
        txtPos = 0;
        token = true;
        nextImpl();
        return type;
    }

    public void require(int i, String s, String s1)
    {
        if (i != type || s != null && !s.equals(getNamespace()) || s1 != null && !s1.equals(getName()))
        {
            exception((new StringBuilder("expected: ")).append(a[i]).append(" {").append(s).append("}").append(s1).toString());
        }
    }

    public void setFeature(String s, boolean flag)
    {
        if ("http://xmlpull.org/v1/doc/features.html#process-namespaces".equals(s))
        {
            processNsp = flag;
            return;
        }
        if (isProp(s, false, "relaxed"))
        {
            relaxed = flag;
            return;
        } else
        {
            exception((new StringBuilder("unsupported feature: ")).append(s).toString());
            return;
        }
    }

    public void setInput(InputStream inputstream, String s)
    {
        srcPos = 0;
        srcCount = 0;
        if (inputstream == null)
        {
            throw new IllegalArgumentException();
        }
        if (s != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (srcCount >= 4) goto _L4; else goto _L3
_L3:
        int j = inputstream.read();
        if (j == -1) goto _L4; else goto _L5
_L5:
        Object obj;
        Object obj1;
        char ac[];
        int k;
        try
        {
            ac = srcBuf;
            k = srcCount;
            srcCount = k + 1;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new b((new StringBuilder("Invalid stream or encoding: ")).append(inputstream.toString()).toString(), this, inputstream);
        }
        ac[k] = (char)j;
        i = i << 8 | j;
        if (true) goto _L6; else goto _L4
_L4:
        if (srcCount != 4) goto _L2; else goto _L7
_L7:
        i;
        JVM INSTR lookupswitch 7: default 618
    //                   -131072: 286
    //                   60: 298
    //                   65279: 243
    //                   3932223: 338
    //                   1006632960: 318
    //                   1006649088: 366
    //                   1010792557: 394;
           goto _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L21:
        if ((0xffff0000 & i) != 0xfeff0000) goto _L17; else goto _L16
_L16:
        obj = "UTF-16BE";
        srcBuf[0] = (char)(srcBuf[2] << 8 | srcBuf[3]);
        srcCount = 1;
        break MISSING_BLOCK_LABEL_623;
_L24:
        i = srcCount;
        setInput(((Reader) (new InputStreamReader(inputstream, ((String) (obj1))))));
        encoding = s;
        srcCount = i;
        return;
_L11:
        obj = "UTF-32BE";
        srcCount = 0;
        break MISSING_BLOCK_LABEL_623;
_L9:
        obj = "UTF-32LE";
        srcCount = 0;
        break MISSING_BLOCK_LABEL_623;
_L10:
        obj = "UTF-32BE";
        srcBuf[0] = '<';
        srcCount = 1;
        break MISSING_BLOCK_LABEL_623;
_L13:
        obj = "UTF-32LE";
        srcBuf[0] = '<';
        srcCount = 1;
        break MISSING_BLOCK_LABEL_623;
_L12:
        obj = "UTF-16BE";
        srcBuf[0] = '<';
        srcBuf[1] = '?';
        srcCount = 2;
        break MISSING_BLOCK_LABEL_623;
_L14:
        obj = "UTF-16LE";
        srcBuf[0] = '<';
        srcBuf[1] = '?';
        srcCount = 2;
        break MISSING_BLOCK_LABEL_623;
_L15:
        j = inputstream.read();
        if (j == -1) goto _L8; else goto _L18
_L18:
        int l;
        obj = srcBuf;
        l = srcCount;
        srcCount = l + 1;
        obj[l] = (char)j;
        if (j != 62) goto _L15; else goto _L19
_L19:
        obj = new String(srcBuf, 0, srcCount);
        j = ((String) (obj)).indexOf("encoding");
        if (j == -1) goto _L8; else goto _L20
_L20:
        for (; ((String) (obj)).charAt(j) != '"' && ((String) (obj)).charAt(j) != '\''; j++) { }
        l = j + 1;
        obj = ((String) (obj)).substring(l, ((String) (obj)).indexOf(((String) (obj)).charAt(j), l));
          goto _L21
_L17:
        if ((0xffff0000 & i) != 0xfffe0000) goto _L23; else goto _L22
_L22:
        obj = "UTF-16LE";
        srcBuf[0] = (char)(srcBuf[3] << 8 | srcBuf[2]);
        srcCount = 1;
        break MISSING_BLOCK_LABEL_623;
_L23:
        if ((i & 0xffffff00) != 0xefbbbf00)
        {
            break MISSING_BLOCK_LABEL_623;
        }
        obj = "UTF-8";
        srcBuf[0] = srcBuf[3];
        srcCount = 1;
        break MISSING_BLOCK_LABEL_623;
_L2:
        obj = s;
        break MISSING_BLOCK_LABEL_623;
_L8:
        obj = s;
          goto _L21
        obj1 = obj;
        if (obj == null)
        {
            obj1 = "UTF-8";
        }
          goto _L24
    }

    public void setInput(Reader reader1)
    {
        reader = reader1;
        line = 1;
        column = 0;
        type = 0;
        name = null;
        namespace = null;
        degenerated = false;
        attributeCount = -1;
        encoding = null;
        version = null;
        standalone = null;
        if (reader1 == null)
        {
            return;
        } else
        {
            srcPos = 0;
            srcCount = 0;
            peekCount = 0;
            depth = 0;
            entityMap = new Hashtable();
            entityMap.put("amp", "&");
            entityMap.put("apos", "'");
            entityMap.put("gt", ">");
            entityMap.put("lt", "<");
            entityMap.put("quot", "\"");
            return;
        }
    }

    public void setProperty(String s, Object obj)
    {
        if (isProp(s, true, "location"))
        {
            location = obj;
            return;
        } else
        {
            throw new b((new StringBuilder("unsupported property: ")).append(s).toString());
        }
    }

    public void skipSubTree()
    {
        require(2, null, null);
        int i = 1;
        do
        {
            if (i <= 0)
            {
                break;
            }
            int j = next();
            if (j == 3)
            {
                i--;
            } else
            if (j == 2)
            {
                i++;
            }
        } while (true);
    }
}
