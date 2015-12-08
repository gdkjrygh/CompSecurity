// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.core.io.UTF32Reader;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// Referenced classes of package com.fasterxml.jackson.core.json:
//            UTF8StreamJsonParser, ReaderBasedJsonParser

public final class ByteSourceJsonBootstrapper
{

    static final byte UTF8_BOM_1 = -17;
    static final byte UTF8_BOM_2 = -69;
    static final byte UTF8_BOM_3 = -65;
    protected boolean _bigEndian;
    private final boolean _bufferRecyclable;
    protected int _bytesPerChar;
    protected final IOContext _context;
    protected final InputStream _in;
    protected final byte _inputBuffer[];
    private int _inputEnd;
    protected int _inputProcessed;
    private int _inputPtr;

    public ByteSourceJsonBootstrapper(IOContext iocontext, InputStream inputstream)
    {
        _bigEndian = true;
        _bytesPerChar = 0;
        _context = iocontext;
        _in = inputstream;
        _inputBuffer = iocontext.allocReadIOBuffer();
        _inputPtr = 0;
        _inputEnd = 0;
        _inputProcessed = 0;
        _bufferRecyclable = true;
    }

    public ByteSourceJsonBootstrapper(IOContext iocontext, byte abyte0[], int i, int j)
    {
        _bigEndian = true;
        _bytesPerChar = 0;
        _context = iocontext;
        _in = null;
        _inputBuffer = abyte0;
        _inputPtr = i;
        _inputEnd = i + j;
        _inputProcessed = -i;
        _bufferRecyclable = false;
    }

    private boolean checkUTF16(int i)
    {
        boolean flag = false;
        if ((0xff00 & i) != 0) goto _L2; else goto _L1
_L1:
        _bigEndian = true;
_L6:
        _bytesPerChar = 2;
        flag = true;
_L4:
        return flag;
_L2:
        if ((i & 0xff) != 0) goto _L4; else goto _L3
_L3:
        _bigEndian = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean checkUTF32(int i)
        throws IOException
    {
        boolean flag = false;
        if (i >> 8 == 0)
        {
            _bigEndian = true;
        } else
        if ((0xffffff & i) == 0)
        {
            _bigEndian = false;
        } else
        {
            if ((0xff00ffff & i) != 0)
            {
                continue;
            }
            reportWeirdUCS4("3412");
        }
        do
        {
            _bytesPerChar = 4;
            flag = true;
            do
            {
                return flag;
            } while ((0xffff00ff & i) != 0);
            reportWeirdUCS4("2143");
        } while (true);
    }

    private boolean handleBOM(int i)
        throws IOException
    {
        i;
        JVM INSTR lookupswitch 4: default 44
    //                   -16842752: 127
    //                   -131072: 99
    //                   65279: 77
    //                   65534: 121;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        int j;
        j = i >>> 16;
        if (j == 65279)
        {
            _inputPtr = _inputPtr + 2;
            _bytesPerChar = 2;
            _bigEndian = true;
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        _bigEndian = true;
        _inputPtr = _inputPtr + 4;
        _bytesPerChar = 4;
        return true;
_L3:
        _inputPtr = _inputPtr + 4;
        _bytesPerChar = 4;
        _bigEndian = false;
        return true;
_L5:
        reportWeirdUCS4("2143");
_L2:
        reportWeirdUCS4("3412");
        if (true) goto _L1; else goto _L6
_L6:
        if (j == 65534)
        {
            _inputPtr = _inputPtr + 2;
            _bytesPerChar = 2;
            _bigEndian = false;
            return true;
        }
        if (i >>> 8 == 0xefbbbf)
        {
            _inputPtr = _inputPtr + 3;
            _bytesPerChar = 1;
            _bigEndian = true;
            return true;
        } else
        {
            return false;
        }
    }

    public static MatchStrength hasJSONFormat(InputAccessor inputaccessor)
        throws IOException
    {
        if (inputaccessor.hasMoreBytes()) goto _L2; else goto _L1
_L1:
        MatchStrength matchstrength = MatchStrength.INCONCLUSIVE;
_L4:
        return matchstrength;
_L2:
        MatchStrength matchstrength1;
        int i;
        byte byte1 = inputaccessor.nextByte();
        byte byte0 = byte1;
        if (byte1 == -17)
        {
            if (!inputaccessor.hasMoreBytes())
            {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputaccessor.nextByte() != -69)
            {
                return MatchStrength.NO_MATCH;
            }
            if (!inputaccessor.hasMoreBytes())
            {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputaccessor.nextByte() != -65)
            {
                return MatchStrength.NO_MATCH;
            }
            if (!inputaccessor.hasMoreBytes())
            {
                return MatchStrength.INCONCLUSIVE;
            }
            byte0 = inputaccessor.nextByte();
        }
        i = skipSpace(inputaccessor, byte0);
        if (i < 0)
        {
            return MatchStrength.INCONCLUSIVE;
        }
        if (i == 123)
        {
            i = skipSpace(inputaccessor);
            if (i < 0)
            {
                return MatchStrength.INCONCLUSIVE;
            }
            if (i == 34 || i == 125)
            {
                return MatchStrength.SOLID_MATCH;
            } else
            {
                return MatchStrength.NO_MATCH;
            }
        }
        if (i == 91)
        {
            i = skipSpace(inputaccessor);
            if (i < 0)
            {
                return MatchStrength.INCONCLUSIVE;
            }
            if (i == 93 || i == 91)
            {
                return MatchStrength.SOLID_MATCH;
            } else
            {
                return MatchStrength.SOLID_MATCH;
            }
        }
        matchstrength1 = MatchStrength.WEAK_MATCH;
        matchstrength = matchstrength1;
        if (i == 34) goto _L4; else goto _L3
_L3:
        if (i > 57)
        {
            break; /* Loop/switch isn't completed */
        }
        matchstrength = matchstrength1;
        if (i >= 48) goto _L4; else goto _L5
_L5:
        if (i != 45)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        i = skipSpace(inputaccessor);
        if (i < 0)
        {
            return MatchStrength.INCONCLUSIVE;
        }
        if (i > 57)
        {
            break; /* Loop/switch isn't completed */
        }
        matchstrength = matchstrength1;
        if (i >= 48) goto _L4; else goto _L6
_L6:
        return MatchStrength.NO_MATCH;
        if (i == 110)
        {
            return tryMatch(inputaccessor, "ull", matchstrength1);
        }
        if (i == 116)
        {
            return tryMatch(inputaccessor, "rue", matchstrength1);
        }
        if (i == 102)
        {
            return tryMatch(inputaccessor, "alse", matchstrength1);
        } else
        {
            return MatchStrength.NO_MATCH;
        }
    }

    private void reportWeirdUCS4(String s)
        throws IOException
    {
        throw new CharConversionException((new StringBuilder()).append("Unsupported UCS-4 endianness (").append(s).append(") detected").toString());
    }

    private static int skipSpace(InputAccessor inputaccessor)
        throws IOException
    {
        if (!inputaccessor.hasMoreBytes())
        {
            return -1;
        } else
        {
            return skipSpace(inputaccessor, inputaccessor.nextByte());
        }
    }

    private static int skipSpace(InputAccessor inputaccessor, byte byte0)
        throws IOException
    {
        do
        {
            byte0 &= 0xff;
            if (byte0 != 32 && byte0 != 13 && byte0 != 10 && byte0 != 9)
            {
                return byte0;
            }
            if (!inputaccessor.hasMoreBytes())
            {
                return -1;
            }
            byte0 = inputaccessor.nextByte();
        } while (true);
    }

    private static MatchStrength tryMatch(InputAccessor inputaccessor, String s, MatchStrength matchstrength)
        throws IOException
    {
        int i = 0;
        int j = s.length();
        do
        {
label0:
            {
                MatchStrength matchstrength1 = matchstrength;
                if (i < j)
                {
                    if (inputaccessor.hasMoreBytes())
                    {
                        break label0;
                    }
                    matchstrength1 = MatchStrength.INCONCLUSIVE;
                }
                return matchstrength1;
            }
            if (inputaccessor.nextByte() != s.charAt(i))
            {
                return MatchStrength.NO_MATCH;
            }
            i++;
        } while (true);
    }

    public JsonParser constructParser(int i, ObjectCodec objectcodec, BytesToNameCanonicalizer bytestonamecanonicalizer, CharsToNameCanonicalizer charstonamecanonicalizer, boolean flag, boolean flag1)
        throws IOException, JsonParseException
    {
        if (detectEncoding() == JsonEncoding.UTF8 && flag)
        {
            bytestonamecanonicalizer = bytestonamecanonicalizer.makeChild(flag, flag1);
            return new UTF8StreamJsonParser(_context, i, _in, objectcodec, bytestonamecanonicalizer, _inputBuffer, _inputPtr, _inputEnd, _bufferRecyclable);
        } else
        {
            return new ReaderBasedJsonParser(_context, i, constructReader(), objectcodec, charstonamecanonicalizer.makeChild(flag, flag1));
        }
    }

    public Reader constructReader()
        throws IOException
    {
        Object obj;
        JsonEncoding jsonencoding;
        jsonencoding = _context.getEncoding();
        static class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$core$JsonEncoding[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonEncoding = new int[JsonEncoding.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonEncoding[JsonEncoding.UTF32_BE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonEncoding[JsonEncoding.UTF32_LE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonEncoding[JsonEncoding.UTF16_BE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonEncoding[JsonEncoding.UTF16_LE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonEncoding[JsonEncoding.UTF8.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonEncoding[jsonencoding.ordinal()])
        {
        default:
            throw new RuntimeException("Internal error");

        case 1: // '\001'
        case 2: // '\002'
            return new UTF32Reader(_context, _in, _inputBuffer, _inputPtr, _inputEnd, _context.getEncoding().isBigEndian());

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            obj = _in;
            break;
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new ByteArrayInputStream(_inputBuffer, _inputPtr, _inputEnd);
_L4:
        return new InputStreamReader(((InputStream) (obj)), jsonencoding.getJavaName());
_L2:
        if (_inputPtr < _inputEnd)
        {
            obj = new MergedStream(_context, ((InputStream) (obj)), _inputBuffer, _inputPtr, _inputEnd);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JsonEncoding detectEncoding()
        throws IOException, JsonParseException
    {
        boolean flag1 = false;
        if (!ensureLoaded(4)) goto _L2; else goto _L1
_L1:
        int i = _inputBuffer[_inputPtr] << 24 | (_inputBuffer[_inputPtr + 1] & 0xff) << 16 | (_inputBuffer[_inputPtr + 2] & 0xff) << 8 | _inputBuffer[_inputPtr + 3] & 0xff;
        if (!handleBOM(i)) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L10:
        if (flag) goto _L6; else goto _L5
_L5:
        JsonEncoding jsonencoding = JsonEncoding.UTF8;
_L8:
        _context.setEncoding(jsonencoding);
        return jsonencoding;
_L4:
        if (checkUTF32(i))
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (checkUTF16(i >>> 16))
            {
                flag = true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        flag = flag1;
        if (ensureLoaded(2))
        {
            flag = flag1;
            if (checkUTF16((_inputBuffer[_inputPtr] & 0xff) << 8 | _inputBuffer[_inputPtr + 1] & 0xff))
            {
                flag = true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        switch (_bytesPerChar)
        {
        case 3: // '\003'
        default:
            throw new RuntimeException("Internal error");

        case 1: // '\001'
            jsonencoding = JsonEncoding.UTF8;
            break;

        case 2: // '\002'
            if (_bigEndian)
            {
                jsonencoding = JsonEncoding.UTF16_BE;
            } else
            {
                jsonencoding = JsonEncoding.UTF16_LE;
            }
            break;

        case 4: // '\004'
            if (_bigEndian)
            {
                jsonencoding = JsonEncoding.UTF32_BE;
            } else
            {
                jsonencoding = JsonEncoding.UTF32_LE;
            }
            break;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected boolean ensureLoaded(int i)
        throws IOException
    {
        boolean flag1 = true;
        int j = _inputEnd - _inputPtr;
        do
        {
            int k;
label0:
            {
                boolean flag = flag1;
                if (j < i)
                {
                    if (_in == null)
                    {
                        k = -1;
                    } else
                    {
                        k = _in.read(_inputBuffer, _inputEnd, _inputBuffer.length - _inputEnd);
                    }
                    if (k >= 1)
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            _inputEnd = _inputEnd + k;
            j += k;
        } while (true);
    }
}
