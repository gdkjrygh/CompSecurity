// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva;


public class StreamInfo
{

    private int _bitrateKbps;
    private String _cdnName;
    private String _resource;

    public StreamInfo(int i, String s, String s1)
    {
        _bitrateKbps = -1;
        _resource = null;
        _cdnName = null;
        _bitrateKbps = i;
        _cdnName = s;
        if (_cdnName == null)
        {
            _cdnName = "OTHER";
        }
        _resource = s1;
    }

    public boolean equals(StreamInfo streaminfo)
    {
        return _bitrateKbps == streaminfo.getBitrateKbps() && _resource == streaminfo.getResource() && _cdnName == streaminfo.getCdnName();
    }

    public int getBitrateKbps()
    {
        return _bitrateKbps;
    }

    public String getCdnName()
    {
        return _cdnName;
    }

    public String getResource()
    {
        return _resource;
    }
}
