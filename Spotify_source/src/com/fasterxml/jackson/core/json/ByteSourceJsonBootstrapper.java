// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.core.io.UTF32Reader;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// Referenced classes of package com.fasterxml.jackson.core.json:
//            UTF8StreamJsonParser, ReaderBasedJsonParser

public final class ByteSourceJsonBootstrapper
{

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

    private void reportWeirdUCS4(String s)
    {
        throw new CharConversionException((new StringBuilder("Unsupported UCS-4 endianness (")).append(s).append(") detected").toString());
    }

    public final JsonParser constructParser(int i, ObjectCodec objectcodec, BytesToNameCanonicalizer bytestonamecanonicalizer, CharsToNameCanonicalizer charstonamecanonicalizer, int j)
    {
        if (detectEncoding() == JsonEncoding.UTF8 && com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(j))
        {
            bytestonamecanonicalizer = bytestonamecanonicalizer.makeChild(j);
            return new UTF8StreamJsonParser(_context, i, _in, objectcodec, bytestonamecanonicalizer, _inputBuffer, _inputPtr, _inputEnd, _bufferRecyclable);
        } else
        {
            return new ReaderBasedJsonParser(_context, i, constructReader(), objectcodec, charstonamecanonicalizer.makeChild(j));
        }
    }

    public final Reader constructReader()
    {
        JsonEncoding jsonencoding = _context.getEncoding();
        switch (jsonencoding.bits())
        {
        default:
            throw new RuntimeException("Internal error");

        case 8: // '\b'
        case 16: // '\020'
            Object obj = _in;
            if (obj == null)
            {
                obj = new ByteArrayInputStream(_inputBuffer, _inputPtr, _inputEnd);
            } else
            if (_inputPtr < _inputEnd)
            {
                obj = new MergedStream(_context, ((InputStream) (obj)), _inputBuffer, _inputPtr, _inputEnd);
            }
            return new InputStreamReader(((InputStream) (obj)), jsonencoding.getJavaName());

        case 32: // ' '
            return new UTF32Reader(_context, _in, _inputBuffer, _inputPtr, _inputEnd, _context.getEncoding().isBigEndian());
        }
    }

    public final JsonEncoding detectEncoding()
    {
        boolean flag1 = true;
        if (!ensureLoaded(4)) goto _L2; else goto _L1
_L1:
        int i = _inputBuffer[_inputPtr] << 24 | (_inputBuffer[_inputPtr + 1] & 0xff) << 16 | (_inputBuffer[_inputPtr + 2] & 0xff) << 8 | _inputBuffer[_inputPtr + 3] & 0xff;
        if (!handleBOM(i)) goto _L4; else goto _L3
_L3:
        boolean flag = flag1;
_L12:
        if (flag) goto _L6; else goto _L5
_L5:
        JsonEncoding jsonencoding = JsonEncoding.UTF8;
_L10:
        _context.setEncoding(jsonencoding);
        return jsonencoding;
_L4:
        flag = flag1;
        if (checkUTF32(i))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (checkUTF16(i >>> 16))
        {
            continue; /* Loop/switch isn't completed */
        }
_L8:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!ensureLoaded(2) || !checkUTF16((_inputBuffer[_inputPtr] & 0xff) << 8 | _inputBuffer[_inputPtr + 1] & 0xff)) goto _L8; else goto _L7
_L7:
        flag = flag1;
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
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected final boolean ensureLoaded(int i)
    {
        int k;
        for (int j = _inputEnd - _inputPtr; j < i; j = k + j)
        {
            if (_in == null)
            {
                k = -1;
            } else
            {
                k = _in.read(_inputBuffer, _inputEnd, _inputBuffer.length - _inputEnd);
            }
            if (k <= 0)
            {
                return false;
            }
            _inputEnd = _inputEnd + k;
        }

        return true;
    }
}
