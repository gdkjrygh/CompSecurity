// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package brut.androlib.res.decoder;

import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import brut.androlib.AndrolibException;
import brut.androlib.res.xml.ResXmlEncoders;
import brut.util.ExtDataInput;
import com.mindprod.ledatastream.LEDataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package brut.androlib.res.decoder:
//            ResAttrDecoder, StringBlock

public class AXmlResourceParser
    implements XmlResourceParser
{
    private static final class NamespaceStack
    {

        private int m_count;
        private int m_data[];
        private int m_dataLength;
        private int m_depth;

        private void ensureDataCapacity(int i)
        {
            int j = m_data.length - m_dataLength;
            if (j > i)
            {
                return;
            } else
            {
                int ai[] = new int[(j + m_data.length) * 2];
                System.arraycopy(m_data, 0, ai, 0, m_dataLength);
                m_data = ai;
                return;
            }
        }

        private final int find(int i, boolean flag)
        {
            if (m_dataLength != 0)
            {
                int j = m_dataLength - 1;
                int k = m_depth;
                while (k != 0) 
                {
                    int l = m_data[j];
                    j -= 2;
                    for (; l != 0; l--)
                    {
                        if (flag)
                        {
                            if (m_data[j] == i)
                            {
                                return m_data[j + 1];
                            }
                        } else
                        if (m_data[j + 1] == i)
                        {
                            return m_data[j];
                        }
                        j -= 2;
                    }

                    k--;
                }
            }
            return -1;
        }

        private final int get(int i, boolean flag)
        {
            if (m_dataLength != 0 && i >= 0)
            {
                int j = 0;
                int l = m_depth;
                int k = i;
                i = l;
                while (i != 0) 
                {
                    int i1 = m_data[j];
                    if (k >= i1)
                    {
                        k -= i1;
                        j += i1 * 2 + 2;
                        i--;
                    } else
                    {
                        j = k * 2 + 1 + j;
                        i = j;
                        if (!flag)
                        {
                            i = j + 1;
                        }
                        return m_data[i];
                    }
                }
            }
            return -1;
        }

        public final void decreaseDepth()
        {
            if (m_dataLength != 0)
            {
                int i = m_dataLength - 1;
                int j = m_data[i];
                if (i - 1 - j * 2 != 0)
                {
                    m_dataLength = m_dataLength - (j * 2 + 2);
                    m_count = m_count - j;
                    m_depth = m_depth - 1;
                    return;
                }
            }
        }

        public final int findPrefix(int i)
        {
            return find(i, false);
        }

        public final int getAccumulatedCount(int i)
        {
            int j;
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = false;
            j = ((flag) ? 1 : 0);
            if (m_dataLength == 0) goto _L2; else goto _L1
_L1:
            if (i >= 0) goto _L4; else goto _L3
_L3:
            j = ((flag) ? 1 : 0);
_L2:
            return j;
_L4:
            j = i;
            if (i > m_depth)
            {
                j = m_depth;
            }
            int k = 0;
            int l = j;
            i = ((flag1) ? 1 : 0);
            do
            {
                j = i;
                if (l == 0)
                {
                    continue;
                }
                j = m_data[k];
                l--;
                k = j * 2 + 2 + k;
                i += j;
            } while (true);
            if (true) goto _L2; else goto _L5
_L5:
        }

        public final int getCurrentCount()
        {
            if (m_dataLength == 0)
            {
                return 0;
            } else
            {
                int i = m_dataLength;
                return m_data[i - 1];
            }
        }

        public final int getDepth()
        {
            return m_depth;
        }

        public final int getPrefix(int i)
        {
            return get(i, true);
        }

        public final int getUri(int i)
        {
            return get(i, false);
        }

        public final void increaseDepth()
        {
            ensureDataCapacity(2);
            int i = m_dataLength;
            m_data[i] = 0;
            m_data[i + 1] = 0;
            m_dataLength = m_dataLength + 2;
            m_depth = m_depth + 1;
        }

        public final boolean pop()
        {
            if (m_dataLength != 0)
            {
                int i = m_dataLength - 1;
                int j = m_data[i];
                if (j != 0)
                {
                    j--;
                    i -= 2;
                    m_data[i] = j;
                    m_data[i - (j * 2 + 1)] = j;
                    m_dataLength = m_dataLength - 2;
                    m_count = m_count - 1;
                    return true;
                }
            }
            return false;
        }

        public final void push(int i, int j)
        {
            if (m_depth == 0)
            {
                increaseDepth();
            }
            ensureDataCapacity(2);
            int k = m_dataLength - 1;
            int l = m_data[k];
            m_data[k - 1 - l * 2] = l + 1;
            m_data[k] = i;
            m_data[k + 1] = j;
            m_data[k + 2] = l + 1;
            m_dataLength = m_dataLength + 2;
            m_count = m_count + 1;
        }

        public final void reset()
        {
            m_dataLength = 0;
            m_count = 0;
            m_depth = 0;
        }

        public NamespaceStack()
        {
            m_data = new int[32];
        }
    }


    private static final Logger LOGGER = Logger.getLogger(brut/androlib/res/decoder/AXmlResourceParser.getName());
    private ResAttrDecoder mAttrDecoder;
    private AndrolibException mFirstError;
    private int m_attributes[];
    private int m_classAttribute;
    private boolean m_decreaseDepth;
    private int m_event;
    private int m_idAttribute;
    private int m_lineNumber;
    private int m_name;
    private int m_namespaceUri;
    private NamespaceStack m_namespaces;
    private boolean m_operational;
    private ExtDataInput m_reader;
    private int m_resourceIDs[];
    private StringBlock m_strings;
    private int m_styleAttribute;

    public AXmlResourceParser()
    {
        mAttrDecoder = new ResAttrDecoder();
        m_operational = false;
        m_namespaces = new NamespaceStack();
        resetEventInfo();
    }

    public AXmlResourceParser(InputStream inputstream)
    {
        this();
        open(inputstream);
    }

    private final void doNext()
        throws IOException
    {
        byte byte0 = 3;
        if (m_strings == null)
        {
            m_reader.skipCheckInt(0x80003);
            m_reader.skipInt();
            m_strings = StringBlock.read(m_reader);
            m_namespaces.increaseDepth();
            m_operational = true;
        }
        if (m_event == 1)
        {
            return;
        }
        int j = m_event;
        resetEventInfo();
        int i;
        do
        {
            int k;
            do
            {
                if (m_decreaseDepth)
                {
                    m_decreaseDepth = false;
                    m_namespaces.decreaseDepth();
                }
                if (j == 3 && m_namespaces.getDepth() == 1 && m_namespaces.getCurrentCount() == 0)
                {
                    m_event = 1;
                    return;
                }
                if (j == 0)
                {
                    i = 0x100102;
                } else
                {
                    i = m_reader.readInt();
                }
                if (i == 0x80180)
                {
                    i = m_reader.readInt();
                    if (i < 8 || i % 4 != 0)
                    {
                        throw new IOException((new StringBuilder()).append("Invalid resource ids size (").append(i).append(").").toString());
                    }
                    m_resourceIDs = m_reader.readIntArray(i / 4 - 2);
                    continue;
                }
                if (i < 0x100100 || i > 0x100104)
                {
                    throw new IOException((new StringBuilder()).append("Invalid chunk type (").append(i).append(").").toString());
                }
                if (i == 0x100102 && j == -1)
                {
                    m_event = 0;
                    return;
                }
                m_reader.skipInt();
                k = m_reader.readInt();
                m_reader.skipInt();
                if (i != 0x100100 && i != 0x100101)
                {
                    break;
                }
                if (i == 0x100100)
                {
                    i = m_reader.readInt();
                    k = m_reader.readInt();
                    m_namespaces.push(i, k);
                } else
                {
                    m_reader.skipInt();
                    m_reader.skipInt();
                    m_namespaces.pop();
                }
            } while (true);
            m_lineNumber = k;
            if (i == 0x100102)
            {
                m_namespaceUri = m_reader.readInt();
                m_name = m_reader.readInt();
                m_reader.skipInt();
                i = m_reader.readInt();
                m_idAttribute = (i >>> 16) - 1;
                m_classAttribute = m_reader.readInt();
                m_styleAttribute = (m_classAttribute >>> 16) - 1;
                m_classAttribute = (m_classAttribute & 0xffff) - 1;
                m_attributes = m_reader.readIntArray((i & 0xffff) * 5);
                for (i = byte0; i < m_attributes.length; i += 5)
                {
                    m_attributes[i] = m_attributes[i] >>> 24;
                }

                m_namespaces.increaseDepth();
                m_event = 2;
                return;
            }
            if (i == 0x100103)
            {
                m_namespaceUri = m_reader.readInt();
                m_name = m_reader.readInt();
                m_event = 3;
                m_decreaseDepth = true;
                return;
            }
        } while (i != 0x100104);
        m_name = m_reader.readInt();
        m_reader.skipInt();
        m_reader.skipInt();
        m_event = 4;
    }

    private final int findAttribute(String s, String s1)
    {
        if (m_strings != null && s1 != null) goto _L2; else goto _L1
_L1:
        int k;
        return -1;
_L2:
        if ((k = m_strings.find(s1)) != -1)
        {
            int i;
            int j;
            if (s != null)
            {
                i = m_strings.find(s);
            } else
            {
                i = -1;
            }
            j = 0;
            while (j != m_attributes.length) 
            {
                if (k == m_attributes[j + 1] && (i == -1 || i == m_attributes[j + 0]))
                {
                    return j / 5;
                }
                j++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private final int getAttributeOffset(int i)
    {
        if (m_event != 2)
        {
            throw new IndexOutOfBoundsException("Current event is not START_TAG.");
        }
        int j = i * 5;
        if (j >= m_attributes.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid attribute index (").append(i).append(").").toString());
        } else
        {
            return j;
        }
    }

    private final void resetEventInfo()
    {
        m_event = -1;
        m_lineNumber = -1;
        m_name = -1;
        m_namespaceUri = -1;
        m_attributes = null;
        m_idAttribute = -1;
        m_classAttribute = -1;
        m_styleAttribute = -1;
    }

    private void setFirstError(AndrolibException androlibexception)
    {
        if (mFirstError == null)
        {
            mFirstError = androlibexception;
        }
    }

    public void close()
    {
        if (!m_operational)
        {
            return;
        } else
        {
            m_operational = false;
            m_reader = null;
            m_strings = null;
            m_resourceIDs = null;
            m_namespaces.reset();
            resetEventInfo();
            return;
        }
    }

    public void defineEntityReplacementText(String s, String s1)
        throws XmlPullParserException
    {
        throw new XmlPullParserException("Method is not supported.");
    }

    public boolean getAttributeBooleanValue(int i, boolean flag)
    {
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        return getAttributeIntValue(i, j) != 0;
    }

    public boolean getAttributeBooleanValue(String s, String s1, boolean flag)
    {
        int i = findAttribute(s, s1);
        if (i == -1)
        {
            return flag;
        } else
        {
            return getAttributeBooleanValue(i, flag);
        }
    }

    public int getAttributeCount()
    {
        if (m_event != 2)
        {
            return -1;
        } else
        {
            return m_attributes.length / 5;
        }
    }

    public float getAttributeFloatValue(int i, float f)
    {
        i = getAttributeOffset(i);
        if (m_attributes[i + 3] == 4)
        {
            f = Float.intBitsToFloat(m_attributes[i + 4]);
        }
        return f;
    }

    public float getAttributeFloatValue(String s, String s1, float f)
    {
        int i = findAttribute(s, s1);
        if (i == -1)
        {
            return f;
        } else
        {
            return getAttributeFloatValue(i, f);
        }
    }

    public int getAttributeIntValue(int i, int j)
    {
        int k = getAttributeOffset(i);
        int l = m_attributes[k + 3];
        i = j;
        if (l >= 16)
        {
            i = j;
            if (l <= 31)
            {
                i = m_attributes[k + 4];
            }
        }
        return i;
    }

    public int getAttributeIntValue(String s, String s1, int i)
    {
        int j = findAttribute(s, s1);
        if (j == -1)
        {
            return i;
        } else
        {
            return getAttributeIntValue(j, i);
        }
    }

    public int getAttributeListValue(int i, String as[], int j)
    {
        return 0;
    }

    public int getAttributeListValue(String s, String s1, String as[], int i)
    {
        return 0;
    }

    public String getAttributeName(int i)
    {
        i = getAttributeOffset(i);
        i = m_attributes[i + 1];
        if (i == -1)
        {
            return "";
        } else
        {
            return m_strings.getString(i);
        }
    }

    public int getAttributeNameResource(int i)
    {
        i = getAttributeOffset(i);
        i = m_attributes[i + 1];
        if (m_resourceIDs == null || i < 0 || i >= m_resourceIDs.length)
        {
            return 0;
        } else
        {
            return m_resourceIDs[i];
        }
    }

    public String getAttributeNamespace(int i)
    {
        i = getAttributeOffset(i);
        i = m_attributes[i + 0];
        if (i == -1)
        {
            return "";
        } else
        {
            return m_strings.getString(i);
        }
    }

    public String getAttributePrefix(int i)
    {
        i = getAttributeOffset(i);
        i = m_attributes[i + 0];
        i = m_namespaces.findPrefix(i);
        if (i == -1)
        {
            return "";
        } else
        {
            return m_strings.getString(i);
        }
    }

    public int getAttributeResourceValue(int i, int j)
    {
        i = getAttributeOffset(i);
        if (m_attributes[i + 3] == 1)
        {
            j = m_attributes[i + 4];
        }
        return j;
    }

    public int getAttributeResourceValue(String s, String s1, int i)
    {
        int j = findAttribute(s, s1);
        if (j == -1)
        {
            return i;
        } else
        {
            return getAttributeResourceValue(j, i);
        }
    }

    public String getAttributeType(int i)
    {
        return "CDATA";
    }

    public int getAttributeUnsignedIntValue(int i, int j)
    {
        return getAttributeIntValue(i, j);
    }

    public int getAttributeUnsignedIntValue(String s, String s1, int i)
    {
        int j = findAttribute(s, s1);
        if (j == -1)
        {
            return i;
        } else
        {
            return getAttributeUnsignedIntValue(j, i);
        }
    }

    public String getAttributeValue(int i)
    {
        int j;
        int k;
        int l;
        l = getAttributeOffset(i);
        j = m_attributes[l + 3];
        k = m_attributes[l + 4];
        l = m_attributes[l + 2];
        if (mAttrDecoder == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        ResAttrDecoder resattrdecoder = mAttrDecoder;
        if (l != -1) goto _L2; else goto _L1
_L1:
        String s = null;
_L4:
        return resattrdecoder.decode(j, k, s, getAttributeNameResource(i));
_L2:
        s = ResXmlEncoders.escapeXmlChars(m_strings.getString(l));
        if (true) goto _L4; else goto _L3
_L3:
        AndrolibException androlibexception;
        androlibexception;
        setFirstError(androlibexception);
        LOGGER.log(Level.WARNING, String.format("Could not decode attr value, using undecoded value instead: ns=%s, name=%s, value=0x%08x", new Object[] {
            getAttributePrefix(i), getAttributeName(i), Integer.valueOf(k)
        }), androlibexception);
        return TypedValue.coerceToString(j, k);
    }

    public String getAttributeValue(String s, String s1)
    {
        int i = findAttribute(s, s1);
        if (i == -1)
        {
            return null;
        } else
        {
            return getAttributeValue(i);
        }
    }

    public String getClassAttribute()
    {
        if (m_classAttribute == -1)
        {
            return null;
        } else
        {
            int i = getAttributeOffset(m_classAttribute);
            i = m_attributes[i + 2];
            return m_strings.getString(i);
        }
    }

    public int getColumnNumber()
    {
        return -1;
    }

    public int getDepth()
    {
        return m_namespaces.getDepth() - 1;
    }

    public int getEventType()
        throws XmlPullParserException
    {
        return m_event;
    }

    public boolean getFeature(String s)
    {
        return false;
    }

    public String getIdAttribute()
    {
        if (m_idAttribute == -1)
        {
            return null;
        } else
        {
            int i = getAttributeOffset(m_idAttribute);
            i = m_attributes[i + 2];
            return m_strings.getString(i);
        }
    }

    public int getIdAttributeResourceValue(int i)
    {
        int j;
        if (m_idAttribute != -1)
        {
            if (m_attributes[(j = getAttributeOffset(m_idAttribute)) + 3] == 1)
            {
                return m_attributes[j + 4];
            }
        }
        return i;
    }

    public String getInputEncoding()
    {
        return null;
    }

    public int getLineNumber()
    {
        return m_lineNumber;
    }

    public String getName()
    {
        if (m_name == -1 || m_event != 2 && m_event != 3)
        {
            return null;
        } else
        {
            return m_strings.getString(m_name);
        }
    }

    public String getNamespace()
    {
        return m_strings.getString(m_namespaceUri);
    }

    public String getNamespace(String s)
    {
        throw new RuntimeException("Method is not supported.");
    }

    public int getNamespaceCount(int i)
        throws XmlPullParserException
    {
        return m_namespaces.getAccumulatedCount(i);
    }

    public String getNamespacePrefix(int i)
        throws XmlPullParserException
    {
        i = m_namespaces.getPrefix(i);
        return m_strings.getString(i);
    }

    public String getNamespaceUri(int i)
        throws XmlPullParserException
    {
        i = m_namespaces.getUri(i);
        return m_strings.getString(i);
    }

    public String getPositionDescription()
    {
        return (new StringBuilder()).append("XML line #").append(getLineNumber()).toString();
    }

    public String getPrefix()
    {
        int i = m_namespaces.findPrefix(m_namespaceUri);
        return m_strings.getString(i);
    }

    public Object getProperty(String s)
    {
        return null;
    }

    public int getStyleAttribute()
    {
        if (m_styleAttribute == -1)
        {
            return 0;
        } else
        {
            int i = getAttributeOffset(m_styleAttribute);
            return m_attributes[i + 4];
        }
    }

    public String getText()
    {
        if (m_name == -1 || m_event != 4)
        {
            return null;
        } else
        {
            return m_strings.getString(m_name);
        }
    }

    public char[] getTextCharacters(int ai[])
    {
        String s = getText();
        if (s == null)
        {
            return null;
        } else
        {
            ai[0] = 0;
            ai[1] = s.length();
            ai = new char[s.length()];
            s.getChars(0, s.length(), ai, 0);
            return ai;
        }
    }

    public boolean isAttributeDefault(int i)
    {
        return false;
    }

    public boolean isEmptyElementTag()
        throws XmlPullParserException
    {
        return false;
    }

    public boolean isWhitespace()
        throws XmlPullParserException
    {
        return false;
    }

    public int next()
        throws XmlPullParserException, IOException
    {
        if (m_reader == null)
        {
            throw new XmlPullParserException("Parser is not opened.", this, null);
        }
        int i;
        try
        {
            doNext();
            i = m_event;
        }
        catch (IOException ioexception)
        {
            close();
            throw ioexception;
        }
        return i;
    }

    public int nextTag()
        throws XmlPullParserException, IOException
    {
        int j = next();
        int i = j;
        if (j == 4)
        {
            i = j;
            if (isWhitespace())
            {
                i = next();
            }
        }
        if (i != 2 && i != 3)
        {
            throw new XmlPullParserException("Expected start or end tag.", this, null);
        } else
        {
            return i;
        }
    }

    public String nextText()
        throws XmlPullParserException, IOException
    {
label0:
        {
            if (getEventType() != 2)
            {
                throw new XmlPullParserException("Parser must be on START_TAG to read next text.", this, null);
            }
            int i = next();
            String s;
            if (i == 4)
            {
                s = getText();
                if (next() != 3)
                {
                    throw new XmlPullParserException("Event TEXT must be immediately followed by END_TAG.", this, null);
                }
            } else
            {
                if (i != 3)
                {
                    break label0;
                }
                s = "";
            }
            return s;
        }
        throw new XmlPullParserException("Parser must be on START_TAG or TEXT to read text.", this, null);
    }

    public int nextToken()
        throws XmlPullParserException, IOException
    {
        return next();
    }

    public void open(InputStream inputstream)
    {
        close();
        if (inputstream != null)
        {
            m_reader = new ExtDataInput(new LEDataInputStream(inputstream));
        }
    }

    public void require(int i, String s, String s1)
        throws XmlPullParserException, IOException
    {
        if (i != getEventType() || s != null && !s.equals(getNamespace()) || s1 != null && !s1.equals(getName()))
        {
            throw new XmlPullParserException((new StringBuilder()).append(TYPES[i]).append(" is expected.").toString(), this, null);
        } else
        {
            return;
        }
    }

    public void setFeature(String s, boolean flag)
        throws XmlPullParserException
    {
        throw new XmlPullParserException("Method is not supported.");
    }

    public void setInput(InputStream inputstream, String s)
        throws XmlPullParserException
    {
        open(inputstream);
    }

    public void setInput(Reader reader)
        throws XmlPullParserException
    {
        throw new XmlPullParserException("Method is not supported.");
    }

    public void setProperty(String s, Object obj)
        throws XmlPullParserException
    {
        throw new XmlPullParserException("Method is not supported.");
    }

}
