// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.NumberInput;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core.util:
//            BufferRecycler

public final class TextBuffer
{

    static final char NO_CHARS[] = new char[0];
    private final BufferRecycler _allocator;
    private char _currentSegment[];
    private int _currentSize;
    private boolean _hasSegments;
    private char _inputBuffer[];
    private int _inputLen;
    private int _inputStart;
    private char _resultArray[];
    private String _resultString;
    private int _segmentSize;
    private ArrayList _segments;

    public TextBuffer(BufferRecycler bufferrecycler)
    {
        _hasSegments = false;
        _allocator = bufferrecycler;
    }

    private char[] buf(int i)
    {
        if (_allocator != null)
        {
            return _allocator.allocCharBuffer(2, i);
        } else
        {
            return new char[Math.max(i, 1000)];
        }
    }

    private char[] carr(int i)
    {
        return new char[i];
    }

    private void clearSegments()
    {
        _hasSegments = false;
        _segments.clear();
        _segmentSize = 0;
        _currentSize = 0;
    }

    private void expand(int i)
    {
        int j;
        if (_segments == null)
        {
            _segments = new ArrayList();
        }
        char ac[] = _currentSegment;
        _hasSegments = true;
        _segments.add(ac);
        _segmentSize = _segmentSize + ac.length;
        _currentSize = 0;
        i = ac.length;
        j = i + (i >> 1);
        if (j >= 1000) goto _L2; else goto _L1
_L1:
        i = 1000;
_L4:
        _currentSegment = carr(i);
        return;
_L2:
        i = j;
        if (j > 0x40000)
        {
            i = 0x40000;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private char[] resultArray()
    {
        if (_resultString != null)
        {
            return _resultString.toCharArray();
        }
        if (_inputStart >= 0)
        {
            int i = _inputLen;
            if (i < 1)
            {
                return NO_CHARS;
            }
            int k = _inputStart;
            if (k == 0)
            {
                return Arrays.copyOf(_inputBuffer, i);
            } else
            {
                return Arrays.copyOfRange(_inputBuffer, k, k + i);
            }
        }
        int l = size();
        if (l < 1)
        {
            return NO_CHARS;
        }
        int j1 = 0;
        int j = 0;
        char ac[] = carr(l);
        if (_segments != null)
        {
            int i1 = 0;
            int k1 = _segments.size();
            do
            {
                j1 = j;
                if (i1 >= k1)
                {
                    break;
                }
                char ac1[] = (char[])_segments.get(i1);
                j1 = ac1.length;
                System.arraycopy(ac1, 0, ac, j, j1);
                j += j1;
                i1++;
            } while (true);
        }
        System.arraycopy(_currentSegment, 0, ac, j1, _currentSize);
        return ac;
    }

    private void unshare(int i)
    {
        int j = _inputLen;
        _inputLen = 0;
        char ac[] = _inputBuffer;
        _inputBuffer = null;
        int k = _inputStart;
        _inputStart = -1;
        i = j + i;
        if (_currentSegment == null || i > _currentSegment.length)
        {
            _currentSegment = buf(i);
        }
        if (j > 0)
        {
            System.arraycopy(ac, k, _currentSegment, 0, j);
        }
        _segmentSize = 0;
        _currentSize = j;
    }

    public void append(char ac[], int i, int j)
    {
        if (_inputStart >= 0)
        {
            unshare(j);
        }
        _resultString = null;
        _resultArray = null;
        char ac1[] = _currentSegment;
        int i1 = ac1.length - _currentSize;
        if (i1 >= j)
        {
            System.arraycopy(ac, i, ac1, _currentSize, j);
            _currentSize = _currentSize + j;
            return;
        }
        int l = i;
        int k = j;
        if (i1 > 0)
        {
            System.arraycopy(ac, i, ac1, _currentSize, i1);
            l = i + i1;
            k = j - i1;
        }
        do
        {
            expand(k);
            i = Math.min(_currentSegment.length, k);
            System.arraycopy(ac, l, _currentSegment, 0, i);
            _currentSize = _currentSize + i;
            l += i;
            i = k - i;
            k = i;
        } while (i > 0);
    }

    public char[] contentsAsArray()
    {
        char ac1[] = _resultArray;
        char ac[] = ac1;
        if (ac1 == null)
        {
            ac = resultArray();
            _resultArray = ac;
        }
        return ac;
    }

    public BigDecimal contentsAsDecimal()
        throws NumberFormatException
    {
        if (_resultArray != null)
        {
            return NumberInput.parseBigDecimal(_resultArray);
        }
        if (_inputStart >= 0 && _inputBuffer != null)
        {
            return NumberInput.parseBigDecimal(_inputBuffer, _inputStart, _inputLen);
        }
        if (_segmentSize == 0 && _currentSegment != null)
        {
            return NumberInput.parseBigDecimal(_currentSegment, 0, _currentSize);
        } else
        {
            return NumberInput.parseBigDecimal(contentsAsArray());
        }
    }

    public double contentsAsDouble()
        throws NumberFormatException
    {
        return NumberInput.parseDouble(contentsAsString());
    }

    public String contentsAsString()
    {
        if (_resultString == null)
        {
            if (_resultArray != null)
            {
                _resultString = new String(_resultArray);
            } else
            if (_inputStart >= 0)
            {
                if (_inputLen < 1)
                {
                    _resultString = "";
                    return "";
                }
                _resultString = new String(_inputBuffer, _inputStart, _inputLen);
            } else
            {
                int i = _segmentSize;
                int k = _currentSize;
                if (i == 0)
                {
                    String s;
                    if (k == 0)
                    {
                        s = "";
                    } else
                    {
                        s = new String(_currentSegment, 0, k);
                    }
                    _resultString = s;
                } else
                {
                    StringBuilder stringbuilder = new StringBuilder(i + k);
                    if (_segments != null)
                    {
                        int j = 0;
                        for (int l = _segments.size(); j < l; j++)
                        {
                            char ac[] = (char[])_segments.get(j);
                            stringbuilder.append(ac, 0, ac.length);
                        }

                    }
                    stringbuilder.append(_currentSegment, 0, _currentSize);
                    _resultString = stringbuilder.toString();
                }
            }
        }
        return _resultString;
    }

    public char[] emptyAndGetCurrentSegment()
    {
        _inputStart = -1;
        _currentSize = 0;
        _inputLen = 0;
        _inputBuffer = null;
        _resultString = null;
        _resultArray = null;
        if (_hasSegments)
        {
            clearSegments();
        }
        char ac1[] = _currentSegment;
        char ac[] = ac1;
        if (ac1 == null)
        {
            ac = buf(0);
            _currentSegment = ac;
        }
        return ac;
    }

    public char[] expandCurrentSegment()
    {
        char ac[] = _currentSegment;
        int k = ac.length;
        int j = k + (k >> 1);
        int i = j;
        if (j > 0x40000)
        {
            i = k + (k >> 2);
        }
        ac = Arrays.copyOf(ac, i);
        _currentSegment = ac;
        return ac;
    }

    public char[] finishCurrentSegment()
    {
        int k;
        if (_segments == null)
        {
            _segments = new ArrayList();
        }
        _hasSegments = true;
        _segments.add(_currentSegment);
        int i = _currentSegment.length;
        _segmentSize = _segmentSize + i;
        _currentSize = 0;
        k = i + (i >> 1);
        if (k >= 1000) goto _L2; else goto _L1
_L1:
        int j = 1000;
_L4:
        char ac[] = carr(j);
        _currentSegment = ac;
        return ac;
_L2:
        j = k;
        if (k > 0x40000)
        {
            j = 0x40000;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public char[] getCurrentSegment()
    {
        if (_inputStart < 0) goto _L2; else goto _L1
_L1:
        unshare(1);
_L4:
        return _currentSegment;
_L2:
        char ac[] = _currentSegment;
        if (ac == null)
        {
            _currentSegment = buf(0);
        } else
        if (_currentSize >= ac.length)
        {
            expand(1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getCurrentSegmentSize()
    {
        return _currentSize;
    }

    public char[] getTextBuffer()
    {
        if (_inputStart >= 0)
        {
            return _inputBuffer;
        }
        if (_resultArray != null)
        {
            return _resultArray;
        }
        if (_resultString != null)
        {
            char ac[] = _resultString.toCharArray();
            _resultArray = ac;
            return ac;
        }
        if (!_hasSegments)
        {
            return _currentSegment;
        } else
        {
            return contentsAsArray();
        }
    }

    public int getTextOffset()
    {
        if (_inputStart >= 0)
        {
            return _inputStart;
        } else
        {
            return 0;
        }
    }

    public void releaseBuffers()
    {
        if (_allocator == null)
        {
            resetWithEmpty();
        } else
        if (_currentSegment != null)
        {
            resetWithEmpty();
            char ac[] = _currentSegment;
            _currentSegment = null;
            _allocator.releaseCharBuffer(2, ac);
            return;
        }
    }

    public void resetWithCopy(char ac[], int i, int j)
    {
        _inputBuffer = null;
        _inputStart = -1;
        _inputLen = 0;
        _resultString = null;
        _resultArray = null;
        if (!_hasSegments) goto _L2; else goto _L1
_L1:
        clearSegments();
_L4:
        _segmentSize = 0;
        _currentSize = 0;
        append(ac, i, j);
        return;
_L2:
        if (_currentSegment == null)
        {
            _currentSegment = buf(j);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void resetWithEmpty()
    {
        _inputStart = -1;
        _currentSize = 0;
        _inputLen = 0;
        _inputBuffer = null;
        _resultString = null;
        _resultArray = null;
        if (_hasSegments)
        {
            clearSegments();
        }
    }

    public void resetWithShared(char ac[], int i, int j)
    {
        _resultString = null;
        _resultArray = null;
        _inputBuffer = ac;
        _inputStart = i;
        _inputLen = j;
        if (_hasSegments)
        {
            clearSegments();
        }
    }

    public void resetWithString(String s)
    {
        _inputBuffer = null;
        _inputStart = -1;
        _inputLen = 0;
        _resultString = s;
        _resultArray = null;
        if (_hasSegments)
        {
            clearSegments();
        }
        _currentSize = 0;
    }

    public void setCurrentLength(int i)
    {
        _currentSize = i;
    }

    public int size()
    {
        if (_inputStart >= 0)
        {
            return _inputLen;
        }
        if (_resultArray != null)
        {
            return _resultArray.length;
        }
        if (_resultString != null)
        {
            return _resultString.length();
        } else
        {
            return _segmentSize + _currentSize;
        }
    }

    public String toString()
    {
        return contentsAsString();
    }

}
