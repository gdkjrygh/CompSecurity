// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva;


// Referenced classes of package com.conviva:
//            StreamInfo

public class StreamerError
{

    public static final int ERROR_SCOPE_RESOURCE = 3;
    public static final int ERROR_SCOPE_STREAM = 2;
    public static final int ERROR_SCOPE_STREAM_SEGMENT = 1;
    public static final int SEVERITY_FATAL = 1;
    public static final int SEVERITY_WARNING = 0;
    public static final int eErrorScope_Unknown = 0;
    private String _errorCode;
    private int _index;
    private int _scope;
    private int _severity;
    private StreamInfo _stream;

    public StreamerError(String s, StreamInfo streaminfo, int i, int j, int k)
    {
        _errorCode = s;
        _stream = streaminfo;
        _index = i;
        _severity = j;
        _scope = k;
    }

    public static StreamerError makeStreamError(String s, int i, StreamInfo streaminfo)
    {
        return new StreamerError(s, streaminfo, -1, i, 2);
    }

    public static StreamerError makeStreamSegmentError(String s, int i, StreamInfo streaminfo, int j)
    {
        return new StreamerError(s, streaminfo, j, i, 1);
    }

    public static StreamerError makeUnscopedError(String s, int i)
    {
        return new StreamerError(s, null, -1, i, 0);
    }

    public String getErrorCode()
    {
        return _errorCode;
    }

    public int getIndex()
    {
        return _index;
    }

    public int getScope()
    {
        return _scope;
    }

    public int getSeverity()
    {
        return _severity;
    }

    public StreamInfo getStream()
    {
        return _stream;
    }
}
