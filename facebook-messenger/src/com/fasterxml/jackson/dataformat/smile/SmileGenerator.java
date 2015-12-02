// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.dataformat.smile;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.dataformat.smile:
//            SmileBufferRecycler, SmileUtil, ModuleVersion

public class SmileGenerator extends GeneratorBase
{

    protected static final long MAX_INT_AS_LONG = 0x7fffffffL;
    private static final int MIN_BUFFER_LENGTH = 770;
    protected static final long MIN_INT_AS_LONG = 0xffffffff80000000L;
    protected static final int SURR1_FIRST = 55296;
    protected static final int SURR1_LAST = 56319;
    protected static final int SURR2_FIRST = 56320;
    protected static final int SURR2_LAST = 57343;
    protected static final byte TOKEN_BYTE_BIG_DECIMAL = 42;
    protected static final byte TOKEN_BYTE_BIG_INTEGER = 38;
    protected static final byte TOKEN_BYTE_FLOAT_32 = 40;
    protected static final byte TOKEN_BYTE_FLOAT_64 = 41;
    protected static final byte TOKEN_BYTE_INT_32 = 36;
    protected static final byte TOKEN_BYTE_INT_64 = 37;
    protected static final byte TOKEN_BYTE_LONG_STRING_ASCII = -32;
    protected static final byte TOKEN_BYTE_LONG_STRING_UNICODE = -28;
    protected static final ThreadLocal _smileRecyclerRef = new ThreadLocal();
    protected boolean _bufferRecyclable;
    protected int _bytesWritten;
    protected char _charBuffer[];
    protected final int _charBufferLength;
    protected final IOContext _ioContext;
    protected final OutputStream _out;
    protected byte _outputBuffer[];
    protected final int _outputEnd;
    protected int _outputTail;
    protected int _seenNameCount;
    protected SharedStringNode _seenNames[];
    protected int _seenStringValueCount;
    protected SharedStringNode _seenStringValues[];
    protected final SmileBufferRecycler _smileBufferRecycler;
    protected int _smileFeatures;

    public SmileGenerator(IOContext iocontext, int i, int j, ObjectCodec objectcodec, OutputStream outputstream)
    {
        super(i, objectcodec);
        _outputTail = 0;
        _smileFeatures = j;
        _ioContext = iocontext;
        _smileBufferRecycler = _smileBufferRecycler();
        _out = outputstream;
        _bufferRecyclable = true;
        _outputBuffer = iocontext.allocWriteEncodingBuffer();
        _outputEnd = _outputBuffer.length;
        _charBuffer = iocontext.allocConcatBuffer();
        _charBufferLength = _charBuffer.length;
        if (_outputEnd < 770)
        {
            throw new IllegalStateException((new StringBuilder()).append("Internal encoding buffer length (").append(_outputEnd).append(") too short, must be at least ").append(770).toString());
        }
        if ((Feature.CHECK_SHARED_NAMES.getMask() & j) == 0)
        {
            _seenNames = null;
            _seenNameCount = -1;
        } else
        {
            _seenNames = (SharedStringNode[])_smileBufferRecycler.allocSeenNamesBuffer();
            if (_seenNames == null)
            {
                _seenNames = new SharedStringNode[64];
            }
            _seenNameCount = 0;
        }
        if ((Feature.CHECK_SHARED_STRING_VALUES.getMask() & j) == 0)
        {
            _seenStringValues = null;
            _seenStringValueCount = -1;
            return;
        }
        _seenStringValues = (SharedStringNode[])_smileBufferRecycler.allocSeenStringValuesBuffer();
        if (_seenStringValues == null)
        {
            _seenStringValues = new SharedStringNode[64];
        }
        _seenStringValueCount = 0;
    }

    public SmileGenerator(IOContext iocontext, int i, int j, ObjectCodec objectcodec, OutputStream outputstream, byte abyte0[], int k, 
            boolean flag)
    {
        super(i, objectcodec);
        _outputTail = 0;
        _smileFeatures = j;
        _ioContext = iocontext;
        _smileBufferRecycler = _smileBufferRecycler();
        _out = outputstream;
        _bufferRecyclable = flag;
        _outputTail = k;
        _outputBuffer = abyte0;
        _outputEnd = _outputBuffer.length;
        _charBuffer = iocontext.allocConcatBuffer();
        _charBufferLength = _charBuffer.length;
        if (_outputEnd < 770)
        {
            throw new IllegalStateException((new StringBuilder()).append("Internal encoding buffer length (").append(_outputEnd).append(") too short, must be at least ").append(770).toString());
        }
        if ((Feature.CHECK_SHARED_NAMES.getMask() & j) == 0)
        {
            _seenNames = null;
            _seenNameCount = -1;
        } else
        {
            _seenNames = (SharedStringNode[])_smileBufferRecycler.allocSeenNamesBuffer();
            if (_seenNames == null)
            {
                _seenNames = new SharedStringNode[64];
            }
            _seenNameCount = 0;
        }
        if ((Feature.CHECK_SHARED_STRING_VALUES.getMask() & j) == 0)
        {
            _seenStringValues = null;
            _seenStringValueCount = -1;
            return;
        }
        _seenStringValues = (SharedStringNode[])_smileBufferRecycler.allocSeenStringValuesBuffer();
        if (_seenStringValues == null)
        {
            _seenStringValues = new SharedStringNode[64];
        }
        _seenStringValueCount = 0;
    }

    private final void _addSeenName(String s)
    {
        int i;
        if (_seenNameCount == _seenNames.length)
        {
            if (_seenNameCount == 1024)
            {
                Arrays.fill(_seenNames, null);
                _seenNameCount = 0;
            } else
            {
                SharedStringNode asharedstringnode[] = _seenNames;
                _seenNames = new SharedStringNode[1024];
                int k = asharedstringnode.length;
                int j = 0;
                while (j < k) 
                {
                    SharedStringNode sharedstringnode1;
                    for (SharedStringNode sharedstringnode = asharedstringnode[j]; sharedstringnode != null; sharedstringnode = sharedstringnode1)
                    {
                        int l = sharedstringnode.value.hashCode() & 0x3ff;
                        sharedstringnode1 = sharedstringnode.next;
                        sharedstringnode.next = _seenNames[l];
                        _seenNames[l] = sharedstringnode;
                    }

                    j++;
                }
            }
        }
        i = s.hashCode() & _seenNames.length - 1;
        _seenNames[i] = new SharedStringNode(s, _seenNameCount, _seenNames[i]);
        _seenNameCount = _seenNameCount + 1;
    }

    private final void _addSeenStringValue(String s)
    {
        int i;
        if (_seenStringValueCount == _seenStringValues.length)
        {
            if (_seenStringValueCount == 1024)
            {
                Arrays.fill(_seenStringValues, null);
                _seenStringValueCount = 0;
            } else
            {
                SharedStringNode asharedstringnode[] = _seenStringValues;
                _seenStringValues = new SharedStringNode[1024];
                int k = asharedstringnode.length;
                int j = 0;
                while (j < k) 
                {
                    SharedStringNode sharedstringnode1;
                    for (SharedStringNode sharedstringnode = asharedstringnode[j]; sharedstringnode != null; sharedstringnode = sharedstringnode1)
                    {
                        int l = sharedstringnode.value.hashCode() & 0x3ff;
                        sharedstringnode1 = sharedstringnode.next;
                        sharedstringnode.next = _seenStringValues[l];
                        _seenStringValues[l] = sharedstringnode;
                    }

                    j++;
                }
            }
        }
        i = s.hashCode() & _seenStringValues.length - 1;
        _seenStringValues[i] = new SharedStringNode(s, _seenStringValueCount, _seenStringValues[i]);
        _seenStringValueCount = _seenStringValueCount + 1;
    }

    private int _convertSurrogate(int i, int j)
    {
        if (j < 56320 || j > 57343)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Broken surrogate pair: first char 0x").append(Integer.toHexString(i)).append(", second 0x").append(Integer.toHexString(j)).append("; illegal combination").toString());
        } else
        {
            return 0x10000 + (i - 55296 << 10) + (j - 56320);
        }
    }

    private final void _ensureRoomForOutput(int i)
    {
        if (_outputTail + i >= _outputEnd)
        {
            _flushBuffer();
        }
    }

    private final int _findSeenName(String s)
    {
        int i = s.hashCode();
        SharedStringNode sharedstringnode = _seenNames[_seenNames.length - 1 & i];
        if (sharedstringnode == null)
        {
            return -1;
        }
        if (sharedstringnode.value == s)
        {
            return sharedstringnode.index;
        }
        SharedStringNode sharedstringnode1 = sharedstringnode;
        do
        {
            SharedStringNode sharedstringnode2 = sharedstringnode1.next;
            sharedstringnode1 = sharedstringnode;
            if (sharedstringnode2 != null)
            {
                sharedstringnode1 = sharedstringnode2;
                if (sharedstringnode2.value == s)
                {
                    return sharedstringnode2.index;
                }
            } else
            {
                Object obj;
                do
                {
                    obj = sharedstringnode1.value;
                    if (((String) (obj)).hashCode() == i && ((String) (obj)).equals(s))
                    {
                        return sharedstringnode1.index;
                    }
                    obj = sharedstringnode1.next;
                    sharedstringnode1 = ((SharedStringNode) (obj));
                } while (obj != null);
                return -1;
            }
        } while (true);
    }

    private final int _findSeenStringValue(String s)
    {
        int i = s.hashCode();
        SharedStringNode sharedstringnode = _seenStringValues[_seenStringValues.length - 1 & i];
        if (sharedstringnode != null)
        {
            Object obj = sharedstringnode;
            SharedStringNode sharedstringnode1;
            do
            {
                if (((SharedStringNode) (obj)).value == s)
                {
                    return ((SharedStringNode) (obj)).index;
                }
                sharedstringnode1 = ((SharedStringNode) (obj)).next;
                obj = sharedstringnode1;
            } while (sharedstringnode1 != null);
            do
            {
                obj = sharedstringnode.value;
                if (((String) (obj)).hashCode() == i && ((String) (obj)).equals(s))
                {
                    return sharedstringnode.index;
                }
                obj = sharedstringnode.next;
                sharedstringnode = ((SharedStringNode) (obj));
            } while (obj != null);
        }
        return -1;
    }

    private void _mediumUTF8Encode(char ac[], int i, int j)
    {
        int j1 = _outputEnd - 4;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        if (_outputTail >= j1)
        {
            _flushBuffer();
        }
        k = i + 1;
        l = ac[i];
        if (l > 127)
        {
            break MISSING_BLOCK_LABEL_577;
        }
        byte abyte0[] = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = (byte)l;
        l = j - k;
        i = j1 - _outputTail;
        if (l > i)
        {
            l = i;
        }
        i = k;
_L6:
        int i1;
label0:
        {
            i1 = i;
            if (i1 < l + k)
            {
                break label0;
            }
            i = i1;
        }
          goto _L3
        i = i1 + 1;
        i1 = ac[i1];
        if (i1 <= '\177') goto _L5; else goto _L4
_L4:
        k = i1;
_L7:
        byte abyte2[];
        int k1;
        if (k < 2048)
        {
            byte abyte1[] = _outputBuffer;
            l = _outputTail;
            _outputTail = l + 1;
            abyte1[l] = (byte)(k >> 6 | 0xc0);
            abyte1 = _outputBuffer;
            l = _outputTail;
            _outputTail = l + 1;
            abyte1[l] = (byte)(k & 0x3f | 0x80);
        } else
        if (k < 55296 || k > 57343)
        {
            byte abyte3[] = _outputBuffer;
            l = _outputTail;
            _outputTail = l + 1;
            abyte3[l] = (byte)(k >> 12 | 0xe0);
            abyte3 = _outputBuffer;
            l = _outputTail;
            _outputTail = l + 1;
            abyte3[l] = (byte)(k >> 6 & 0x3f | 0x80);
            abyte3 = _outputBuffer;
            l = _outputTail;
            _outputTail = l + 1;
            abyte3[l] = (byte)(k & 0x3f | 0x80);
        } else
        {
            if (k > 56319)
            {
                _throwIllegalSurrogate(k);
            }
            if (i >= j)
            {
                _throwIllegalSurrogate(k);
            }
            k = _convertSurrogate(k, ac[i]);
            if (k > 0x10ffff)
            {
                _throwIllegalSurrogate(k);
            }
            byte abyte4[] = _outputBuffer;
            l = _outputTail;
            _outputTail = l + 1;
            abyte4[l] = (byte)(k >> 18 | 0xf0);
            abyte4 = _outputBuffer;
            l = _outputTail;
            _outputTail = l + 1;
            abyte4[l] = (byte)(k >> 12 & 0x3f | 0x80);
            abyte4 = _outputBuffer;
            l = _outputTail;
            _outputTail = l + 1;
            abyte4[l] = (byte)(k >> 6 & 0x3f | 0x80);
            abyte4 = _outputBuffer;
            l = _outputTail;
            _outputTail = l + 1;
            abyte4[l] = (byte)(k & 0x3f | 0x80);
            i++;
        }
          goto _L3
_L5:
        abyte2 = _outputBuffer;
        k1 = _outputTail;
        _outputTail = k1 + 1;
        abyte2[k1] = (byte)i1;
          goto _L6
_L2:
        return;
        i = k;
        k = l;
          goto _L7
    }

    private final int _shortUTF8Encode(char ac[], int i, int j)
    {
        int l = _outputTail;
        byte abyte0[] = _outputBuffer;
        int k = i;
        i = l;
        do
        {
            char c = ac[k];
            if (c > '\177')
            {
                return _shortUTF8Encode2(ac, k, j, i);
            }
            int i1 = i + 1;
            abyte0[i] = (byte)c;
            k++;
            if (k >= j)
            {
                i = _outputTail;
                _outputTail = i1;
                return i1 - i;
            }
            i = i1;
        } while (true);
    }

    private final int _shortUTF8Encode2(char ac[], int i, int j, int k)
    {
        byte abyte0[] = _outputBuffer;
        while (i < j) 
        {
            int l = i + 1;
            int i1 = ac[i];
            if (i1 <= '\177')
            {
                abyte0[k] = (byte)i1;
                k++;
                i = l;
            } else
            if (i1 < '\u0800')
            {
                i = k + 1;
                abyte0[k] = (byte)(i1 >> 6 | 0xc0);
                k = i + 1;
                abyte0[i] = (byte)(i1 & 0x3f | 0x80);
                i = l;
            } else
            if (i1 < '\uD800' || i1 > '\uDFFF')
            {
                i = k + 1;
                abyte0[k] = (byte)(i1 >> 12 | 0xe0);
                int j1 = i + 1;
                abyte0[i] = (byte)(i1 >> 6 & 0x3f | 0x80);
                k = j1 + 1;
                abyte0[j1] = (byte)(i1 & 0x3f | 0x80);
                i = l;
            } else
            {
                if (i1 > '\uDBFF')
                {
                    _throwIllegalSurrogate(i1);
                }
                if (l >= j)
                {
                    _throwIllegalSurrogate(i1);
                }
                i = l + 1;
                l = _convertSurrogate(i1, ac[l]);
                if (l > 0x10ffff)
                {
                    _throwIllegalSurrogate(l);
                }
                i1 = k + 1;
                abyte0[k] = (byte)(l >> 18 | 0xf0);
                k = i1 + 1;
                abyte0[i1] = (byte)(l >> 12 & 0x3f | 0x80);
                i1 = k + 1;
                abyte0[k] = (byte)(l >> 6 & 0x3f | 0x80);
                k = i1 + 1;
                abyte0[i1] = (byte)(l & 0x3f | 0x80);
            }
        }
        i = _outputTail;
        _outputTail = k;
        return k - i;
    }

    private void _slowUTF8Encode(String s)
    {
        int i;
        int i1;
        int j1;
        i1 = s.length();
        i = 0;
        j1 = _outputEnd - 4;
_L3:
        if (i >= i1) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        if (_outputTail >= j1)
        {
            _flushBuffer();
        }
        j = i + 1;
        k = s.charAt(i);
        if (k > 127)
        {
            break MISSING_BLOCK_LABEL_572;
        }
        byte abyte0[] = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = (byte)k;
        k = i1 - j;
        i = j1 - _outputTail;
        if (k > i)
        {
            k = i;
        }
        i = j;
_L6:
        int l;
label0:
        {
            l = i;
            if (l < k + j)
            {
                break label0;
            }
            i = l;
        }
          goto _L3
        i = l + 1;
        l = s.charAt(l);
        if (l <= '\177') goto _L5; else goto _L4
_L4:
        j = l;
_L7:
        byte abyte2[];
        int k1;
        if (j < 2048)
        {
            byte abyte1[] = _outputBuffer;
            k = _outputTail;
            _outputTail = k + 1;
            abyte1[k] = (byte)(j >> 6 | 0xc0);
            abyte1 = _outputBuffer;
            k = _outputTail;
            _outputTail = k + 1;
            abyte1[k] = (byte)(j & 0x3f | 0x80);
        } else
        if (j < 55296 || j > 57343)
        {
            byte abyte3[] = _outputBuffer;
            k = _outputTail;
            _outputTail = k + 1;
            abyte3[k] = (byte)(j >> 12 | 0xe0);
            abyte3 = _outputBuffer;
            k = _outputTail;
            _outputTail = k + 1;
            abyte3[k] = (byte)(j >> 6 & 0x3f | 0x80);
            abyte3 = _outputBuffer;
            k = _outputTail;
            _outputTail = k + 1;
            abyte3[k] = (byte)(j & 0x3f | 0x80);
        } else
        {
            if (j > 56319)
            {
                _throwIllegalSurrogate(j);
            }
            if (i >= i1)
            {
                _throwIllegalSurrogate(j);
            }
            j = _convertSurrogate(j, s.charAt(i));
            if (j > 0x10ffff)
            {
                _throwIllegalSurrogate(j);
            }
            byte abyte4[] = _outputBuffer;
            k = _outputTail;
            _outputTail = k + 1;
            abyte4[k] = (byte)(j >> 18 | 0xf0);
            abyte4 = _outputBuffer;
            k = _outputTail;
            _outputTail = k + 1;
            abyte4[k] = (byte)(j >> 12 & 0x3f | 0x80);
            abyte4 = _outputBuffer;
            k = _outputTail;
            _outputTail = k + 1;
            abyte4[k] = (byte)(j >> 6 & 0x3f | 0x80);
            abyte4 = _outputBuffer;
            k = _outputTail;
            _outputTail = k + 1;
            abyte4[k] = (byte)(j & 0x3f | 0x80);
            i++;
        }
          goto _L3
_L5:
        abyte2 = _outputBuffer;
        k1 = _outputTail;
        _outputTail = k1 + 1;
        abyte2[k1] = (byte)l;
          goto _L6
_L2:
        return;
        i = j;
        j = k;
          goto _L7
    }

    protected static final SmileBufferRecycler _smileBufferRecycler()
    {
        Object obj = (SoftReference)_smileRecyclerRef.get();
        Object obj1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (SmileBufferRecycler)((SoftReference) (obj)).get();
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new SmileBufferRecycler();
            _smileRecyclerRef.set(new SoftReference(obj1));
        }
        return ((SmileBufferRecycler) (obj1));
    }

    private void _throwIllegalSurrogate(int i)
    {
        if (i > 0x10ffff)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal character point (0x").append(Integer.toHexString(i)).append(") to output; max is 0x10FFFF as per RFC 4627").toString());
        }
        if (i >= 55296)
        {
            if (i <= 56319)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unmatched first part of surrogate pair (0x").append(Integer.toHexString(i)).append(")").toString());
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unmatched second part of surrogate pair (0x").append(Integer.toHexString(i)).append(")").toString());
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal character point (0x").append(Integer.toHexString(i)).append(") to output").toString());
        }
    }

    private final void _writeByte(byte byte0)
    {
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte0;
    }

    private final void _writeBytes(byte byte0, byte byte1)
    {
        if (_outputTail + 1 >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte0;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte1;
    }

    private final void _writeBytes(byte byte0, byte byte1, byte byte2)
    {
        if (_outputTail + 2 >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte0;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte1;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte2;
    }

    private final void _writeBytes(byte byte0, byte byte1, byte byte2, byte byte3)
    {
        if (_outputTail + 3 >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte0;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte1;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte2;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte3;
    }

    private final void _writeBytes(byte byte0, byte byte1, byte byte2, byte byte3, byte byte4)
    {
        if (_outputTail + 4 >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte0;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte1;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte2;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte3;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte4;
    }

    private final void _writeBytes(byte byte0, byte byte1, byte byte2, byte byte3, byte byte4, byte byte5)
    {
        if (_outputTail + 5 >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte0;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte1;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte2;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte3;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte4;
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = byte5;
    }

    private final void _writeBytes(byte abyte0[], int i, int j)
    {
        if (j == 0)
        {
            return;
        }
        if (_outputTail + j >= _outputEnd)
        {
            _writeBytesLong(abyte0, i, j);
            return;
        } else
        {
            System.arraycopy(abyte0, i, _outputBuffer, _outputTail, j);
            _outputTail = _outputTail + j;
            return;
        }
    }

    private final void _writeBytesLong(byte abyte0[], int i, int j)
    {
        int k = i;
        int l = j;
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
            l = j;
            k = i;
        }
        do
        {
            i = Math.min(l, _outputEnd - _outputTail);
            System.arraycopy(abyte0, k, _outputBuffer, _outputTail, i);
            _outputTail = _outputTail + i;
            l -= i;
            if (l == 0)
            {
                return;
            }
            k += i;
            _flushBuffer();
        } while (true);
    }

    private final void _writeFieldName(String s)
    {
        byte byte0 = 52;
        int k = s.length();
        if (k == 0)
        {
            _writeByte((byte)32);
        } else
        {
            if (_seenNameCount >= 0)
            {
                int i = _findSeenName(s);
                if (i >= 0)
                {
                    _writeSharedNameReference(i);
                    return;
                }
            }
            if (k > 56)
            {
                _writeNonShortFieldName(s, k);
                return;
            }
            if (_outputTail + 196 >= _outputEnd)
            {
                _flushBuffer();
            }
            s.getChars(0, k, _charBuffer, 0);
            int j = _outputTail;
            _outputTail = _outputTail + 1;
            int j1 = _shortUTF8Encode(_charBuffer, 0, k);
            if (j1 == k)
            {
                if (j1 <= 64)
                {
                    byte0 = (byte)(j1 + 127);
                } else
                {
                    byte abyte0[] = _outputBuffer;
                    int l = _outputTail;
                    _outputTail = l + 1;
                    abyte0[l] = -4;
                }
            } else
            if (j1 <= 56)
            {
                byte0 = (byte)(j1 + 190);
            } else
            {
                byte abyte1[] = _outputBuffer;
                int i1 = _outputTail;
                _outputTail = i1 + 1;
                abyte1[i1] = -4;
            }
            _outputBuffer[j] = byte0;
            if (_seenNameCount >= 0)
            {
                _addSeenName(s);
                return;
            }
        }
    }

    private final void _writeLongAsciiFieldName(byte abyte0[])
    {
        int i = abyte0.length;
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte1[] = _outputBuffer;
        int j = _outputTail;
        _outputTail = j + 1;
        abyte1[j] = 52;
        if (_outputTail + i + 1 < _outputEnd)
        {
            System.arraycopy(abyte0, 0, _outputBuffer, _outputTail, i);
            _outputTail = i + _outputTail;
        } else
        {
            _flushBuffer();
            if (i < 770)
            {
                System.arraycopy(abyte0, 0, _outputBuffer, _outputTail, i);
                _outputTail = i + _outputTail;
            } else
            {
                if (_outputTail > 0)
                {
                    _flushBuffer();
                }
                _out.write(abyte0, 0, i);
            }
        }
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = -4;
    }

    private final void _writeNonSharedString(String s, int i)
    {
        if (i > _charBufferLength)
        {
            _writeByte((byte)-28);
            _slowUTF8Encode(s);
            _writeByte((byte)-4);
            return;
        }
        s.getChars(0, i, _charBuffer, 0);
        int j = i + i + i + 2;
        if (j > _outputBuffer.length)
        {
            _writeByte((byte)-28);
            _mediumUTF8Encode(_charBuffer, 0, i);
            _writeByte((byte)-4);
            return;
        }
        if (j + _outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        j = _outputTail;
        _writeByte((byte)-32);
        if (_shortUTF8Encode(_charBuffer, 0, i) > i)
        {
            _outputBuffer[j] = -28;
        }
        s = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        s[i] = -4;
    }

    private final void _writeNonShortFieldName(String s, int i)
    {
        _writeByte((byte)52);
        if (i > _charBufferLength)
        {
            _slowUTF8Encode(s);
        } else
        {
            s.getChars(0, i, _charBuffer, 0);
            int j = i + i + i;
            if (j <= _outputBuffer.length)
            {
                if (j + _outputTail >= _outputEnd)
                {
                    _flushBuffer();
                }
                _shortUTF8Encode(_charBuffer, 0, i);
            } else
            {
                _mediumUTF8Encode(_charBuffer, 0, i);
            }
        }
        if (_seenNameCount >= 0)
        {
            _addSeenName(s);
        }
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        s = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        s[i] = -4;
    }

    private void _writePositiveVInt(int i)
    {
        _ensureRoomForOutput(5);
        byte byte0 = (byte)((i & 0x3f) + 128);
        i >>= 6;
        if (i <= 127)
        {
            if (i > 0)
            {
                byte abyte0[] = _outputBuffer;
                int j = _outputTail;
                _outputTail = j + 1;
                abyte0[j] = (byte)i;
            }
            byte abyte1[] = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte1[i] = byte0;
            return;
        }
        byte byte1 = (byte)(i & 0x7f);
        i >>= 7;
        if (i <= 127)
        {
            byte abyte2[] = _outputBuffer;
            int k = _outputTail;
            _outputTail = k + 1;
            abyte2[k] = (byte)i;
            abyte2 = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte2[i] = byte1;
            abyte2 = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte2[i] = byte0;
            return;
        }
        byte byte2 = (byte)(i & 0x7f);
        i >>= 7;
        if (i <= 127)
        {
            byte abyte3[] = _outputBuffer;
            int l = _outputTail;
            _outputTail = l + 1;
            abyte3[l] = (byte)i;
            abyte3 = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte3[i] = byte2;
            abyte3 = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte3[i] = byte1;
            abyte3 = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte3[i] = byte0;
            return;
        } else
        {
            byte byte3 = (byte)(i & 0x7f);
            byte abyte4[] = _outputBuffer;
            int i1 = _outputTail;
            _outputTail = i1 + 1;
            abyte4[i1] = (byte)(i >> 7);
            abyte4 = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte4[i] = byte3;
            abyte4 = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte4[i] = byte2;
            abyte4 = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte4[i] = byte1;
            abyte4 = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte4[i] = byte0;
            return;
        }
    }

    private final void _writeSharedNameReference(int i)
    {
        if (i >= _seenNameCount)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Internal error: trying to write shared name with index ").append(i).append("; but have only seen ").append(_seenNameCount).append(" so far!").toString());
        }
        if (i < 64)
        {
            _writeByte((byte)(i + 64));
            return;
        } else
        {
            _writeBytes((byte)((i >> 8) + 48), (byte)i);
            return;
        }
    }

    private final void _writeSharedStringValueReference(int i)
    {
        if (i >= _seenStringValueCount)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Internal error: trying to write shared String value with index ").append(i).append("; but have only seen ").append(_seenStringValueCount).append(" so far!").toString());
        }
        if (i < 31)
        {
            _writeByte((byte)(i + 1));
            return;
        } else
        {
            _writeBytes((byte)((i >> 8) + 236), (byte)i);
            return;
        }
    }

    private void _writeSignedVInt(int i)
    {
        _writePositiveVInt(SmileUtil.zigzagEncode(i));
    }

    protected final void _flushBuffer()
    {
        if (_outputTail > 0)
        {
            _bytesWritten = _bytesWritten + _outputTail;
            _out.write(_outputBuffer, 0, _outputTail);
            _outputTail = 0;
        }
    }

    protected UnsupportedOperationException _notSupported()
    {
        return new UnsupportedOperationException();
    }

    protected void _releaseBuffers()
    {
        Object aobj[] = _outputBuffer;
        if (aobj != null && _bufferRecyclable)
        {
            _outputBuffer = null;
            _ioContext.releaseWriteEncodingBuffer(((byte []) (aobj)));
        }
        aobj = _charBuffer;
        if (aobj != null)
        {
            _charBuffer = null;
            _ioContext.releaseConcatBuffer(((char []) (aobj)));
        }
        aobj = _seenNames;
        if (aobj != null && aobj.length == 64)
        {
            _seenNames = null;
            if (_seenNameCount > 0)
            {
                Arrays.fill(aobj, null);
            }
            _smileBufferRecycler.releaseSeenNamesBuffer(aobj);
        }
        aobj = _seenStringValues;
        if (aobj != null && aobj.length == 64)
        {
            _seenStringValues = null;
            if (_seenStringValueCount > 0)
            {
                Arrays.fill(aobj, null);
            }
            _smileBufferRecycler.releaseSeenStringValuesBuffer(aobj);
        }
    }

    protected final void _verifyValueWrite(String s)
    {
        if (_writeContext.writeValue() == 5)
        {
            _reportError((new StringBuilder()).append("Can not ").append(s).append(", expecting field name").toString());
        }
    }

    protected void _write7BitBinaryWithLength(byte abyte0[], int i, int j)
    {
        int j1;
label0:
        {
label1:
            {
label2:
                {
                    int l;
label3:
                    {
label4:
                        {
                            _writePositiveVInt(j);
                            for (; j >= 7; j -= 7)
                            {
                                if (_outputTail + 8 >= _outputEnd)
                                {
                                    _flushBuffer();
                                }
                                int k = i + 1;
                                int i1 = abyte0[i];
                                byte abyte1[] = _outputBuffer;
                                i = _outputTail;
                                _outputTail = i + 1;
                                abyte1[i] = (byte)(i1 >> 1 & 0x7f);
                                i = k + 1;
                                i1 = abyte0[k] & 0xff | i1 << 8;
                                abyte1 = _outputBuffer;
                                k = _outputTail;
                                _outputTail = k + 1;
                                abyte1[k] = (byte)(i1 >> 2 & 0x7f);
                                k = i + 1;
                                i1 = i1 << 8 | abyte0[i] & 0xff;
                                abyte1 = _outputBuffer;
                                i = _outputTail;
                                _outputTail = i + 1;
                                abyte1[i] = (byte)(i1 >> 3 & 0x7f);
                                i = k + 1;
                                i1 = i1 << 8 | abyte0[k] & 0xff;
                                abyte1 = _outputBuffer;
                                k = _outputTail;
                                _outputTail = k + 1;
                                abyte1[k] = (byte)(i1 >> 4 & 0x7f);
                                k = i + 1;
                                i = i1 << 8 | abyte0[i] & 0xff;
                                abyte1 = _outputBuffer;
                                i1 = _outputTail;
                                _outputTail = i1 + 1;
                                abyte1[i1] = (byte)(i >> 5 & 0x7f);
                                i1 = k + 1;
                                k = i << 8 | abyte0[k] & 0xff;
                                abyte1 = _outputBuffer;
                                i = _outputTail;
                                _outputTail = i + 1;
                                abyte1[i] = (byte)(k >> 6 & 0x7f);
                                i = i1 + 1;
                                k = k << 8 | abyte0[i1] & 0xff;
                                abyte1 = _outputBuffer;
                                i1 = _outputTail;
                                _outputTail = i1 + 1;
                                abyte1[i1] = (byte)(k >> 7 & 0x7f);
                                abyte1 = _outputBuffer;
                                i1 = _outputTail;
                                _outputTail = i1 + 1;
                                abyte1[i1] = (byte)(k & 0x7f);
                            }

                            if (j > 0)
                            {
                                if (_outputTail + 7 >= _outputEnd)
                                {
                                    _flushBuffer();
                                }
                                l = i + 1;
                                j1 = abyte0[i];
                                byte abyte2[] = _outputBuffer;
                                i = _outputTail;
                                _outputTail = i + 1;
                                abyte2[i] = (byte)(j1 >> 1 & 0x7f);
                                if (j <= 1)
                                {
                                    break label0;
                                }
                                i = l + 1;
                                j1 = abyte0[l] & 0xff | (j1 & 1) << 8;
                                abyte2 = _outputBuffer;
                                l = _outputTail;
                                _outputTail = l + 1;
                                abyte2[l] = (byte)(j1 >> 2 & 0x7f);
                                if (j <= 2)
                                {
                                    break label1;
                                }
                                l = i + 1;
                                j1 = (j1 & 3) << 8 | abyte0[i] & 0xff;
                                abyte2 = _outputBuffer;
                                i = _outputTail;
                                _outputTail = i + 1;
                                abyte2[i] = (byte)(j1 >> 3 & 0x7f);
                                if (j <= 3)
                                {
                                    break label2;
                                }
                                i = l + 1;
                                l = (j1 & 7) << 8 | abyte0[l] & 0xff;
                                abyte2 = _outputBuffer;
                                j1 = _outputTail;
                                _outputTail = j1 + 1;
                                abyte2[j1] = (byte)(l >> 4 & 0x7f);
                                if (j <= 4)
                                {
                                    break label3;
                                }
                                j1 = i + 1;
                                i = (l & 0xf) << 8 | abyte0[i] & 0xff;
                                abyte2 = _outputBuffer;
                                l = _outputTail;
                                _outputTail = l + 1;
                                abyte2[l] = (byte)(i >> 5 & 0x7f);
                                if (j <= 5)
                                {
                                    break label4;
                                }
                                i = (i & 0x1f) << 8 | abyte0[j1] & 0xff;
                                abyte0 = _outputBuffer;
                                j = _outputTail;
                                _outputTail = j + 1;
                                abyte0[j] = (byte)(i >> 6 & 0x7f);
                                abyte0 = _outputBuffer;
                                j = _outputTail;
                                _outputTail = j + 1;
                                abyte0[j] = (byte)(i & 0x3f);
                            }
                            return;
                        }
                        abyte0 = _outputBuffer;
                        j = _outputTail;
                        _outputTail = j + 1;
                        abyte0[j] = (byte)(i & 0x1f);
                        return;
                    }
                    abyte0 = _outputBuffer;
                    i = _outputTail;
                    _outputTail = i + 1;
                    abyte0[i] = (byte)(l & 0xf);
                    return;
                }
                abyte0 = _outputBuffer;
                i = _outputTail;
                _outputTail = i + 1;
                abyte0[i] = (byte)(j1 & 7);
                return;
            }
            abyte0 = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte0[i] = (byte)(j1 & 3);
            return;
        }
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = (byte)(j1 & 1);
    }

    protected final void _writeFieldName(SerializableString serializablestring)
    {
        int i = serializablestring.charLength();
        if (i == 0)
        {
            _writeByte((byte)32);
        } else
        {
            if (_seenNameCount >= 0)
            {
                int k = _findSeenName(serializablestring.getValue());
                if (k >= 0)
                {
                    _writeSharedNameReference(k);
                    return;
                }
            }
            byte abyte0[] = serializablestring.asUnquotedUTF8();
            int l = abyte0.length;
            if (l != i)
            {
                _writeFieldNameUnicode(serializablestring, abyte0);
                return;
            }
            if (l <= 64)
            {
                if (_outputTail + l >= _outputEnd)
                {
                    _flushBuffer();
                }
                byte abyte1[] = _outputBuffer;
                int j = _outputTail;
                _outputTail = j + 1;
                abyte1[j] = (byte)(l + 127);
                System.arraycopy(abyte0, 0, _outputBuffer, _outputTail, l);
                _outputTail = _outputTail + l;
            } else
            {
                _writeLongAsciiFieldName(abyte0);
            }
            if (_seenNameCount >= 0)
            {
                _addSeenName(serializablestring.getValue());
                return;
            }
        }
    }

    protected final void _writeFieldNameUnicode(SerializableString serializablestring, byte abyte0[])
    {
        int i = abyte0.length;
        if (i <= 56)
        {
            if (_outputTail + i >= _outputEnd)
            {
                _flushBuffer();
            }
            byte abyte1[] = _outputBuffer;
            int j = _outputTail;
            _outputTail = j + 1;
            abyte1[j] = (byte)(i + 190);
            System.arraycopy(abyte0, 0, _outputBuffer, _outputTail, i);
            _outputTail = i + _outputTail;
            if (_seenNameCount >= 0)
            {
                _addSeenName(serializablestring.getValue());
            }
        } else
        {
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            byte abyte2[] = _outputBuffer;
            int k = _outputTail;
            _outputTail = k + 1;
            abyte2[k] = 52;
            if (_outputTail + i + 1 < _outputEnd)
            {
                System.arraycopy(abyte0, 0, _outputBuffer, _outputTail, i);
                _outputTail = i + _outputTail;
            } else
            {
                _flushBuffer();
                if (i < 770)
                {
                    System.arraycopy(abyte0, 0, _outputBuffer, _outputTail, i);
                    _outputTail = i + _outputTail;
                } else
                {
                    if (_outputTail > 0)
                    {
                        _flushBuffer();
                    }
                    _out.write(abyte0, 0, i);
                }
            }
            abyte0 = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte0[i] = -4;
            if (_seenNameCount >= 0)
            {
                _addSeenName(serializablestring.getValue());
                return;
            }
        }
    }

    public void close()
    {
        if (_outputBuffer != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT))
        {
            do
            {
                JsonWriteContext jsonwritecontext = getOutputContext();
                if (jsonwritecontext.inArray())
                {
                    writeEndArray();
                    continue;
                }
                if (!jsonwritecontext.inObject())
                {
                    break;
                }
                writeEndObject();
            } while (true);
        }
        boolean flag = _closed;
        super.close();
        if (!flag && isEnabled(Feature.WRITE_END_MARKER))
        {
            _writeByte((byte)-1);
        }
        _flushBuffer();
        if (_ioContext.isResourceManaged() || isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET))
        {
            _out.close();
        } else
        {
            _out.flush();
        }
        _releaseBuffers();
    }

    public SmileGenerator configure(Feature feature, boolean flag)
    {
        if (flag)
        {
            enable(feature);
            return this;
        } else
        {
            disable(feature);
            return this;
        }
    }

    public SmileGenerator disable(Feature feature)
    {
        _smileFeatures = _smileFeatures & ~feature.getMask();
        return this;
    }

    public SmileGenerator enable(Feature feature)
    {
        _smileFeatures = _smileFeatures | feature.getMask();
        return this;
    }

    public final void flush()
    {
        _flushBuffer();
        if (isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
        {
            _out.flush();
        }
    }

    public Object getOutputTarget()
    {
        return _out;
    }

    public final boolean isEnabled(Feature feature)
    {
        return (_smileFeatures & feature.getMask()) != 0;
    }

    protected long outputOffset()
    {
        return (long)(_bytesWritten + _outputTail);
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyprinter)
    {
        return this;
    }

    public JsonGenerator useDefaultPrettyPrinter()
    {
        return this;
    }

    public Version version()
    {
        return ModuleVersion.instance.version();
    }

    public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
    {
        if (abyte0 == null)
        {
            writeNull();
            return;
        }
        _verifyValueWrite("write Binary value");
        if (isEnabled(Feature.ENCODE_BINARY_AS_7BIT))
        {
            _writeByte((byte)-24);
            _write7BitBinaryWithLength(abyte0, i, j);
            return;
        } else
        {
            _writeByte((byte)-3);
            _writePositiveVInt(j);
            _writeBytes(abyte0, i, j);
            return;
        }
    }

    public void writeBoolean(boolean flag)
    {
        _verifyValueWrite("write boolean value");
        if (flag)
        {
            _writeByte((byte)35);
            return;
        } else
        {
            _writeByte((byte)34);
            return;
        }
    }

    public void writeBytes(byte abyte0[], int i, int j)
    {
        _writeBytes(abyte0, i, j);
    }

    public final void writeEndArray()
    {
        if (!_writeContext.inArray())
        {
            _reportError((new StringBuilder()).append("Current context not an ARRAY but ").append(_writeContext.getTypeDesc()).toString());
        }
        _writeByte((byte)-7);
        _writeContext = _writeContext.getParent();
    }

    public final void writeEndObject()
    {
        if (!_writeContext.inObject())
        {
            _reportError((new StringBuilder()).append("Current context not an object but ").append(_writeContext.getTypeDesc()).toString());
        }
        _writeContext = _writeContext.getParent();
        _writeByte((byte)-5);
    }

    public final void writeFieldName(SerializableString serializablestring)
    {
        if (_writeContext.writeFieldName(serializablestring.getValue()) == 4)
        {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(serializablestring);
    }

    public final void writeFieldName(String s)
    {
        if (_writeContext.writeFieldName(s) == 4)
        {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(s);
    }

    public void writeHeader()
    {
        int j = 0;
        if ((_smileFeatures & Feature.CHECK_SHARED_NAMES.getMask()) != 0)
        {
            j = 1;
        }
        int i = j;
        if ((_smileFeatures & Feature.CHECK_SHARED_STRING_VALUES.getMask()) != 0)
        {
            i = j | 2;
        }
        j = i;
        if ((_smileFeatures & Feature.ENCODE_BINARY_AS_7BIT.getMask()) == 0)
        {
            j = i | 4;
        }
        _writeBytes((byte)58, (byte)41, (byte)10, (byte)j);
    }

    public void writeNull()
    {
        _verifyValueWrite("write null value");
        _writeByte((byte)33);
    }

    public void writeNumber(double d)
    {
        _ensureRoomForOutput(11);
        _verifyValueWrite("write number");
        long l = Double.doubleToRawLongBits(d);
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = 41;
        i = (int)(l >>> 35);
        _outputBuffer[_outputTail + 4] = (byte)(i & 0x7f);
        i >>= 7;
        _outputBuffer[_outputTail + 3] = (byte)(i & 0x7f);
        i >>= 7;
        _outputBuffer[_outputTail + 2] = (byte)(i & 0x7f);
        i >>= 7;
        _outputBuffer[_outputTail + 1] = (byte)(i & 0x7f);
        _outputBuffer[_outputTail] = (byte)(i >> 7);
        _outputTail = _outputTail + 5;
        i = (int)(l >> 28);
        abyte0 = _outputBuffer;
        int j = _outputTail;
        _outputTail = j + 1;
        abyte0[j] = (byte)(i & 0x7f);
        i = (int)l;
        _outputBuffer[_outputTail + 3] = (byte)(i & 0x7f);
        i >>= 7;
        _outputBuffer[_outputTail + 2] = (byte)(i & 0x7f);
        i >>= 7;
        _outputBuffer[_outputTail + 1] = (byte)(i & 0x7f);
        _outputBuffer[_outputTail] = (byte)(i >> 7 & 0x7f);
        _outputTail = _outputTail + 4;
    }

    public void writeNumber(float f)
    {
        _ensureRoomForOutput(6);
        _verifyValueWrite("write number");
        int i = Float.floatToRawIntBits(f);
        byte abyte0[] = _outputBuffer;
        int j = _outputTail;
        _outputTail = j + 1;
        abyte0[j] = 40;
        _outputBuffer[_outputTail + 4] = (byte)(i & 0x7f);
        i >>= 7;
        _outputBuffer[_outputTail + 3] = (byte)(i & 0x7f);
        i >>= 7;
        _outputBuffer[_outputTail + 2] = (byte)(i & 0x7f);
        i >>= 7;
        _outputBuffer[_outputTail + 1] = (byte)(i & 0x7f);
        _outputBuffer[_outputTail] = (byte)(i >> 7 & 0x7f);
        _outputTail = _outputTail + 5;
    }

    public void writeNumber(int i)
    {
        _verifyValueWrite("write number");
        i = SmileUtil.zigzagEncode(i);
        if (i <= 63 && i >= 0)
        {
            if (i <= 31)
            {
                _writeByte((byte)(i + 192));
                return;
            } else
            {
                _writeBytes((byte)36, (byte)(i + 128));
                return;
            }
        }
        byte byte0 = (byte)((i & 0x3f) + 128);
        i >>>= 6;
        if (i <= 127)
        {
            _writeBytes((byte)36, (byte)i, byte0);
            return;
        }
        byte byte1 = (byte)(i & 0x7f);
        i >>= 7;
        if (i <= 127)
        {
            _writeBytes((byte)36, (byte)i, byte1, byte0);
            return;
        }
        byte byte2 = (byte)(i & 0x7f);
        i >>= 7;
        if (i <= 127)
        {
            _writeBytes((byte)36, (byte)i, byte2, byte1, byte0);
            return;
        } else
        {
            byte byte3 = (byte)(i & 0x7f);
            _writeBytes((byte)36, (byte)(i >> 7), byte3, byte2, byte1, byte0);
            return;
        }
    }

    public void writeNumber(long l)
    {
        if (l <= 0x7fffffffL && l >= 0xffffffff80000000L)
        {
            writeNumber((int)l);
            return;
        }
        _verifyValueWrite("write number");
        l = SmileUtil.zigzagEncode(l);
        int i = (int)l;
        byte byte0 = (byte)((i & 0x3f) + 128);
        byte byte1 = (byte)(i >> 6 & 0x7f);
        byte byte2 = (byte)(i >> 13 & 0x7f);
        byte byte3 = (byte)(i >> 20 & 0x7f);
        l >>>= 27;
        byte byte4 = (byte)((int)l & 0x7f);
        i = (int)(l >> 7);
        if (i == 0)
        {
            _writeBytes((byte)37, byte4, byte3, byte2, byte1, byte0);
            return;
        }
        if (i <= 127)
        {
            _writeBytes((byte)37, (byte)i);
            _writeBytes(byte4, byte3, byte2, byte1, byte0);
            return;
        }
        byte byte5 = (byte)(i & 0x7f);
        i >>= 7;
        if (i <= 127)
        {
            _writeBytes((byte)37, (byte)i);
            _writeBytes(byte5, byte4, byte3, byte2, byte1, byte0);
            return;
        }
        byte byte6 = (byte)(i & 0x7f);
        i >>= 7;
        if (i <= 127)
        {
            _writeBytes((byte)37, (byte)i, byte6);
            _writeBytes(byte5, byte4, byte3, byte2, byte1, byte0);
            return;
        }
        byte byte7 = (byte)(i & 0x7f);
        i >>= 7;
        if (i <= 127)
        {
            _writeBytes((byte)37, (byte)i, byte7, byte6);
            _writeBytes(byte5, byte4, byte3, byte2, byte1, byte0);
            return;
        } else
        {
            byte byte8 = (byte)(i & 0x7f);
            _writeBytes((byte)37, (byte)(i >> 7), byte8, byte7, byte6);
            _writeBytes(byte5, byte4, byte3, byte2, byte1, byte0);
            return;
        }
    }

    public void writeNumber(String s)
    {
        throw _notSupported();
    }

    public void writeNumber(BigDecimal bigdecimal)
    {
        if (bigdecimal == null)
        {
            writeNull();
            return;
        } else
        {
            _verifyValueWrite("write number");
            _writeByte((byte)42);
            _writeSignedVInt(bigdecimal.scale());
            bigdecimal = bigdecimal.unscaledValue().toByteArray();
            _write7BitBinaryWithLength(bigdecimal, 0, bigdecimal.length);
            return;
        }
    }

    public void writeNumber(BigInteger biginteger)
    {
        if (biginteger == null)
        {
            writeNull();
            return;
        } else
        {
            _verifyValueWrite("write number");
            _writeByte((byte)38);
            biginteger = biginteger.toByteArray();
            _write7BitBinaryWithLength(biginteger, 0, biginteger.length);
            return;
        }
    }

    public void writeRaw(byte byte0)
    {
        _writeByte((byte)-8);
    }

    public void writeRaw(char c)
    {
        throw _notSupported();
    }

    public void writeRaw(String s)
    {
        throw _notSupported();
    }

    public void writeRaw(String s, int i, int j)
    {
        throw _notSupported();
    }

    public void writeRaw(char ac[], int i, int j)
    {
        throw _notSupported();
    }

    public void writeRawUTF8String(byte abyte0[], int i, int j)
    {
        _verifyValueWrite("write String value");
        if (j == 0)
        {
            _writeByte((byte)32);
            return;
        }
        if (_seenStringValueCount >= 0)
        {
            throw new UnsupportedOperationException("Can not use direct UTF-8 write methods when 'Feature.CHECK_SHARED_STRING_VALUES' enabled");
        }
        if (j <= 65)
        {
            if (_outputTail + j >= _outputEnd)
            {
                _flushBuffer();
            }
            if (j == 1)
            {
                byte abyte1[] = _outputBuffer;
                j = _outputTail;
                _outputTail = j + 1;
                abyte1[j] = 64;
                abyte1 = _outputBuffer;
                j = _outputTail;
                _outputTail = j + 1;
                abyte1[j] = abyte0[i];
                return;
            } else
            {
                byte abyte2[] = _outputBuffer;
                int k = _outputTail;
                _outputTail = k + 1;
                abyte2[k] = (byte)(j + 126);
                System.arraycopy(abyte0, i, _outputBuffer, _outputTail, j);
                _outputTail = _outputTail + j;
                return;
            }
        }
        int l = j + j + j + 2;
        if (l <= _outputBuffer.length)
        {
            if (l + _outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            byte abyte3[] = _outputBuffer;
            l = _outputTail;
            _outputTail = l + 1;
            abyte3[l] = -28;
            System.arraycopy(abyte0, i, _outputBuffer, _outputTail, j);
            _outputTail = _outputTail + j;
            abyte0 = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            abyte0[i] = -4;
            return;
        } else
        {
            _writeByte((byte)-28);
            _writeBytes(abyte0, i, j);
            _writeByte((byte)-4);
            return;
        }
    }

    public void writeRawValue(String s)
    {
        throw _notSupported();
    }

    public void writeRawValue(String s, int i, int j)
    {
        throw _notSupported();
    }

    public void writeRawValue(char ac[], int i, int j)
    {
        throw _notSupported();
    }

    public final void writeStartArray()
    {
        _verifyValueWrite("start an array");
        _writeContext = _writeContext.createChildArrayContext();
        _writeByte((byte)-8);
    }

    public final void writeStartObject()
    {
        _verifyValueWrite("start an object");
        _writeContext = _writeContext.createChildObjectContext();
        _writeByte((byte)-6);
    }

    public final void writeString(SerializableString serializablestring)
    {
        _verifyValueWrite("write String value");
        String s = serializablestring.getValue();
        int i = s.length();
        if (i == 0)
        {
            _writeByte((byte)32);
        } else
        {
            if (i <= 65 && _seenStringValueCount >= 0)
            {
                int j = _findSeenStringValue(s);
                if (j >= 0)
                {
                    _writeSharedStringValueReference(j);
                    return;
                }
            }
            byte abyte0[] = serializablestring.asUnquotedUTF8();
            int k = abyte0.length;
            if (k <= 64)
            {
                if (_outputTail + k + 1 >= _outputEnd)
                {
                    _flushBuffer();
                }
                byte abyte1[];
                int l;
                if (k == i)
                {
                    i = k + 63;
                } else
                {
                    i = k + 126;
                }
                abyte1 = _outputBuffer;
                l = _outputTail;
                _outputTail = l + 1;
                abyte1[l] = (byte)i;
                System.arraycopy(abyte0, 0, _outputBuffer, _outputTail, k);
                _outputTail = _outputTail + k;
                if (_seenStringValueCount >= 0)
                {
                    _addSeenStringValue(serializablestring.getValue());
                    return;
                }
            } else
            {
                byte byte0;
                if (k == i)
                {
                    byte0 = -32;
                } else
                {
                    byte0 = -28;
                }
                _writeByte(byte0);
                _writeBytes(abyte0, 0, abyte0.length);
                _writeByte((byte)-4);
                return;
            }
        }
    }

    public void writeString(String s)
    {
        if (s == null)
        {
            writeNull();
            return;
        }
        _verifyValueWrite("write String value");
        int i = s.length();
        if (i == 0)
        {
            _writeByte((byte)32);
            return;
        }
        if (i > 65)
        {
            _writeNonSharedString(s, i);
            return;
        }
        if (_seenStringValueCount >= 0)
        {
            int j = _findSeenStringValue(s);
            if (j >= 0)
            {
                _writeSharedStringValueReference(j);
                return;
            }
        }
        if (_outputTail + 196 >= _outputEnd)
        {
            _flushBuffer();
        }
        s.getChars(0, i, _charBuffer, 0);
        int k = _outputTail;
        _outputTail = _outputTail + 1;
        int l = _shortUTF8Encode(_charBuffer, 0, i);
        if (l <= 64)
        {
            if (_seenStringValueCount >= 0)
            {
                _addSeenStringValue(s);
            }
            if (l == i)
            {
                _outputBuffer[k] = (byte)(l + 63);
                return;
            } else
            {
                _outputBuffer[k] = (byte)(l + 126);
                return;
            }
        }
        s = _outputBuffer;
        byte byte0;
        if (l == i)
        {
            byte0 = -32;
        } else
        {
            byte0 = -28;
        }
        s[k] = byte0;
        s = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        s[i] = -4;
    }

    public void writeString(char ac[], int i, int j)
    {
        byte byte0 = -28;
        if (j <= 65 && _seenStringValueCount >= 0 && j > 0)
        {
            writeString(new String(ac, i, j));
            return;
        }
        _verifyValueWrite("write String value");
        if (j == 0)
        {
            _writeByte((byte)32);
            return;
        }
        if (j <= 64)
        {
            if (_outputTail + 196 >= _outputEnd)
            {
                _flushBuffer();
            }
            int k = _outputTail;
            _outputTail = _outputTail + 1;
            i = _shortUTF8Encode(ac, i, i + j);
            if (i <= 64)
            {
                if (i == j)
                {
                    byte0 = (byte)(i + 63);
                } else
                {
                    byte0 = (byte)(i + 126);
                }
            } else
            {
                ac = _outputBuffer;
                i = _outputTail;
                _outputTail = i + 1;
                ac[i] = '\uFFFC';
            }
            _outputBuffer[k] = byte0;
            return;
        }
        int l = j + j + j + 2;
        if (l <= _outputBuffer.length)
        {
            if (l + _outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            l = _outputTail;
            _writeByte((byte)-28);
            if (_shortUTF8Encode(ac, i, i + j) == j)
            {
                _outputBuffer[l] = -32;
            }
            ac = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            ac[i] = '\uFFFC';
            return;
        } else
        {
            _writeByte((byte)-28);
            _mediumUTF8Encode(ac, i, i + j);
            _writeByte((byte)-4);
            return;
        }
    }

    public final void writeStringField(String s, String s1)
    {
        if (_writeContext.writeFieldName(s) == 4)
        {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(s);
        writeString(s1);
    }

    public final void writeUTF8String(byte abyte0[], int i, int j)
    {
        writeRawUTF8String(abyte0, i, j);
    }


    private class Feature extends Enum
    {

        private static final Feature $VALUES[];
        public static final Feature CHECK_SHARED_NAMES;
        public static final Feature CHECK_SHARED_STRING_VALUES;
        public static final Feature ENCODE_BINARY_AS_7BIT;
        public static final Feature WRITE_END_MARKER;
        public static final Feature WRITE_HEADER;
        protected final boolean _defaultState;
        protected final int _mask = 1 << ordinal();

        public static int collectDefaults()
        {
            int j = 0;
            Feature afeature[] = values();
            int l = afeature.length;
            for (int i = 0; i < l;)
            {
                Feature feature = afeature[i];
                int k = j;
                if (feature.enabledByDefault())
                {
                    k = j | feature.getMask();
                }
                i++;
                j = k;
            }

            return j;
        }

        public static Feature valueOf(String s)
        {
            return (Feature)Enum.valueOf(com/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature, s);
        }

        public static Feature[] values()
        {
            return (Feature[])$VALUES.clone();
        }

        public boolean enabledByDefault()
        {
            return _defaultState;
        }

        public int getMask()
        {
            return _mask;
        }

        static 
        {
            WRITE_HEADER = new Feature("WRITE_HEADER", 0, true);
            WRITE_END_MARKER = new Feature("WRITE_END_MARKER", 1, false);
            ENCODE_BINARY_AS_7BIT = new Feature("ENCODE_BINARY_AS_7BIT", 2, true);
            CHECK_SHARED_NAMES = new Feature("CHECK_SHARED_NAMES", 3, true);
            CHECK_SHARED_STRING_VALUES = new Feature("CHECK_SHARED_STRING_VALUES", 4, false);
            $VALUES = (new Feature[] {
                WRITE_HEADER, WRITE_END_MARKER, ENCODE_BINARY_AS_7BIT, CHECK_SHARED_NAMES, CHECK_SHARED_STRING_VALUES
            });
        }

        private Feature(String s, int i, boolean flag)
        {
            super(s, i);
            _defaultState = flag;
        }
    }


    private class SharedStringNode
    {

        public final int index;
        public SharedStringNode next;
        public final String value;

        public SharedStringNode(String s, int i, SharedStringNode sharedstringnode)
        {
            value = s;
            index = i;
            next = sharedstringnode;
        }
    }

}
