// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.dataformat.smile;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import java.io.InputStream;

// Referenced classes of package com.fasterxml.jackson.dataformat.smile:
//            SmileParser

public class SmileParserBootstrapper
{

    private final boolean _bufferRecyclable;
    final IOContext _context;
    final InputStream _in;
    final byte _inputBuffer[];
    private int _inputEnd;
    protected int _inputProcessed;
    private int _inputPtr;

    public SmileParserBootstrapper(IOContext iocontext, InputStream inputstream)
    {
        _context = iocontext;
        _in = inputstream;
        _inputBuffer = iocontext.allocReadIOBuffer();
        _inputPtr = 0;
        _inputEnd = 0;
        _inputProcessed = 0;
        _bufferRecyclable = true;
    }

    public SmileParserBootstrapper(IOContext iocontext, byte abyte0[], int i, int j)
    {
        _context = iocontext;
        _in = null;
        _inputBuffer = abyte0;
        _inputPtr = i;
        _inputEnd = i + j;
        _inputProcessed = -i;
        _bufferRecyclable = false;
    }

    public static MatchStrength hasSmileFormat(InputAccessor inputaccessor)
    {
        if (!inputaccessor.hasMoreBytes())
        {
            return MatchStrength.INCONCLUSIVE;
        }
        byte byte0 = inputaccessor.nextByte();
        if (!inputaccessor.hasMoreBytes())
        {
            return MatchStrength.INCONCLUSIVE;
        }
        byte byte1 = inputaccessor.nextByte();
        if (byte0 == 58)
        {
            if (byte1 != 41)
            {
                return MatchStrength.NO_MATCH;
            }
            if (!inputaccessor.hasMoreBytes())
            {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputaccessor.nextByte() == 10)
            {
                return MatchStrength.FULL_MATCH;
            } else
            {
                return MatchStrength.NO_MATCH;
            }
        }
        if (byte0 == -6)
        {
            if (byte1 == 52)
            {
                return MatchStrength.SOLID_MATCH;
            }
            int i = byte1 & 0xff;
            if (i >= 128 && i < 248)
            {
                return MatchStrength.SOLID_MATCH;
            } else
            {
                return MatchStrength.NO_MATCH;
            }
        }
        if (byte0 == -8)
        {
            if (!inputaccessor.hasMoreBytes())
            {
                return MatchStrength.INCONCLUSIVE;
            }
            if (likelySmileValue(byte1) || possibleSmileValue(byte1, true))
            {
                return MatchStrength.SOLID_MATCH;
            } else
            {
                return MatchStrength.NO_MATCH;
            }
        }
        if (likelySmileValue(byte0) || possibleSmileValue(byte1, false))
        {
            return MatchStrength.SOLID_MATCH;
        } else
        {
            return MatchStrength.NO_MATCH;
        }
    }

    private static boolean likelySmileValue(byte byte0)
    {
        boolean flag = true;
        byte0 &= 0xff;
        if (byte0 >= 224)
        {
            switch (byte0)
            {
            default:
                flag = false;
                break;

            case -8: 
            case -6: 
            case 224: 
            case 228: 
            case 232: 
                break;
            }
        } else
        if (byte0 < 128 || byte0 > 159)
        {
            return false;
        }
        return flag;
    }

    private static boolean possibleSmileValue(byte byte0, boolean flag)
    {
        byte0 &= 0xff;
        if (byte0 < 128) goto _L2; else goto _L1
_L1:
        if (byte0 > 224) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (byte0 >= 64)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (byte0 <= -32)
        {
            break; /* Loop/switch isn't completed */
        }
        if (byte0 >= 44)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
        return false;
    }

    public SmileParser constructParser(int i, int j, boolean flag, ObjectCodec objectcodec, BytesToNameCanonicalizer bytestonamecanonicalizer)
    {
        bytestonamecanonicalizer = bytestonamecanonicalizer.makeChild(true, flag);
        ensureLoaded(1);
        objectcodec = new SmileParser(_context, i, j, objectcodec, bytestonamecanonicalizer, _in, _inputBuffer, _inputPtr, _inputEnd, _bufferRecyclable);
        boolean flag1 = false;
        flag = flag1;
        if (_inputPtr < _inputEnd)
        {
            flag = flag1;
            if (_inputBuffer[_inputPtr] == 58)
            {
                flag = objectcodec.handleSignature(true, true);
            }
        }
        if (!flag && (SmileParser.Feature.REQUIRE_HEADER.getMask() & j) != 0)
        {
            if (_inputPtr < _inputEnd)
            {
                i = _inputBuffer[_inputPtr];
            } else
            {
                i = 0;
            }
            if (i == 123 || i == 91)
            {
                objectcodec = (new StringBuilder()).append("Input does not start with Smile format header (first byte = 0x").append(Integer.toHexString(i & 0xff)).append(") -- rather, it starts with '").append((char)i).append("' (plain JSON input?) -- can not parse").toString();
            } else
            {
                objectcodec = (new StringBuilder()).append("Input does not start with Smile format header (first byte = 0x").append(Integer.toHexString(i & 0xff)).append(") and parser has REQUIRE_HEADER enabled: can not parse").toString();
            }
            throw new JsonParseException(objectcodec, JsonLocation.NA);
        } else
        {
            return objectcodec;
        }
    }

    protected boolean ensureLoaded(int i)
    {
        if (_in != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = _inputEnd - _inputPtr;
label0:
        do
        {
label1:
            {
                if (j >= i)
                {
                    break label1;
                }
                int k = _in.read(_inputBuffer, _inputEnd, _inputBuffer.length - _inputEnd);
                if (k < 1)
                {
                    break label0;
                }
                _inputEnd = _inputEnd + k;
                j += k;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }
}
