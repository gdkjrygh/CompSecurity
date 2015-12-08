// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectReader;

public class DataFormatReaders
{

    protected final int _maxInputLookahead;
    protected final MatchStrength _minimalMatch;
    protected final MatchStrength _optimalMatch;
    protected final ObjectReader _readers[];

    private DataFormatReaders(ObjectReader aobjectreader[], MatchStrength matchstrength, MatchStrength matchstrength1, int i)
    {
        _readers = aobjectreader;
        _optimalMatch = matchstrength;
        _minimalMatch = matchstrength1;
        _maxInputLookahead = i;
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

    public DataFormatReaders with(DeserializationConfig deserializationconfig)
    {
        int j = _readers.length;
        ObjectReader aobjectreader[] = new ObjectReader[j];
        for (int i = 0; i < j; i++)
        {
            aobjectreader[i] = _readers[i].with(deserializationconfig);
        }

        return new DataFormatReaders(aobjectreader, _optimalMatch, _minimalMatch, _maxInputLookahead);
    }

    public DataFormatReaders withType(JavaType javatype)
    {
        int j = _readers.length;
        ObjectReader aobjectreader[] = new ObjectReader[j];
        for (int i = 0; i < j; i++)
        {
            aobjectreader[i] = _readers[i].withType(javatype);
        }

        return new DataFormatReaders(aobjectreader, _optimalMatch, _minimalMatch, _maxInputLookahead);
    }
}
