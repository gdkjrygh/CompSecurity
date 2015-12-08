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

public class DataFormatReaders
{
    protected class AccessorForReader extends com.fasterxml.jackson.core.format.InputAccessor.Std
    {

        final DataFormatReaders this$0;

        public Match createMatcher(ObjectReader objectreader, MatchStrength matchstrength)
        {
            return new Match(_in, _buffer, _bufferedStart, _bufferedEnd - _bufferedStart, objectreader, matchstrength);
        }

        public AccessorForReader(InputStream inputstream, byte abyte0[])
        {
            this$0 = DataFormatReaders.this;
            super(inputstream, abyte0);
        }
    }

    public static class Match
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

        protected Match(InputStream inputstream, byte abyte0[], int i, int j, ObjectReader objectreader, MatchStrength matchstrength)
        {
            _originalStream = inputstream;
            _bufferedData = abyte0;
            _bufferedStart = i;
            _bufferedLength = j;
            _match = objectreader;
            _matchStrength = matchstrength;
        }
    }


    protected final int _maxInputLookahead;
    protected final MatchStrength _minimalMatch;
    protected final MatchStrength _optimalMatch;
    protected final ObjectReader _readers[];

    private Match _findFormat(AccessorForReader accessorforreader)
        throws IOException
    {
        ObjectReader aobjectreader[] = _readers;
        int j = aobjectreader.length;
        int i = 0;
        ObjectReader objectreader = null;
        MatchStrength matchstrength = null;
        for (; i < j; i++)
        {
            ObjectReader objectreader1 = aobjectreader[i];
            accessorforreader.reset();
            MatchStrength matchstrength1 = objectreader1.getFactory().hasFormat(accessorforreader);
            if (matchstrength1 == null || matchstrength1.ordinal() < _minimalMatch.ordinal() || objectreader != null && matchstrength.ordinal() >= matchstrength1.ordinal())
            {
                continue;
            }
            matchstrength = matchstrength1;
            objectreader = objectreader1;
            if (matchstrength1.ordinal() >= _optimalMatch.ordinal())
            {
                break;
            }
            objectreader = objectreader1;
            matchstrength = matchstrength1;
        }

        return accessorforreader.createMatcher(objectreader, matchstrength);
    }

    public Match findFormat(InputStream inputstream)
        throws IOException
    {
        return _findFormat(new AccessorForReader(inputstream, new byte[_maxInputLookahead]));
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('[');
        int j = _readers.length;
        if (j > 0)
        {
            stringbuilder.append(_readers[0].getFactory().getFormatName());
            for (int i = 1; i < j; i++)
            {
                stringbuilder.append(", ");
                stringbuilder.append(_readers[i].getFactory().getFormatName());
            }

        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }
}
