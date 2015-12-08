// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            DataFormatReaders

public static class _matchStrength
{

    protected final byte _bufferedData[];
    protected final int _bufferedLength;
    protected final int _bufferedStart;
    protected final ObjectReader _match;
    protected final MatchStrength _matchStrength;
    protected final InputStream _originalStream;

    public JsonParser createParserWithMatch()
        throws IOException
    {
        if (_match == null)
        {
            return null;
        }
        JsonFactory jsonfactory = _match.getFactory();
        if (_originalStream == null)
        {
            return jsonfactory.createParser(_bufferedData, _bufferedStart, _bufferedLength);
        } else
        {
            return jsonfactory.createParser(getDataStream());
        }
    }

    public InputStream getDataStream()
    {
        if (_originalStream == null)
        {
            return new ByteArrayInputStream(_bufferedData, _bufferedStart, _bufferedLength);
        } else
        {
            return new MergedStream(null, _originalStream, _bufferedData, _bufferedStart, _bufferedLength);
        }
    }

    public ObjectReader getReader()
    {
        return _match;
    }

    public boolean hasMatch()
    {
        return _match != null;
    }

    protected (InputStream inputstream, byte abyte0[], int i, int j, ObjectReader objectreader, MatchStrength matchstrength)
    {
        _originalStream = inputstream;
        _bufferedData = abyte0;
        _bufferedStart = i;
        _bufferedLength = j;
        _match = objectreader;
        _matchStrength = matchstrength;
    }
}
