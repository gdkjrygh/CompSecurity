// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.InputStream;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.core.format:
//            MatchStrength, DataFormatMatcher

public class DataFormatDetector
{

    public static final int DEFAULT_MAX_INPUT_LOOKAHEAD = 64;
    protected final JsonFactory _detectors[];
    protected final int _maxInputLookahead;
    protected final MatchStrength _minimalMatch;
    protected final MatchStrength _optimalMatch;

    public DataFormatDetector(Collection collection)
    {
        this((JsonFactory[])collection.toArray(new JsonFactory[collection.size()]));
    }

    public transient DataFormatDetector(JsonFactory ajsonfactory[])
    {
        this(ajsonfactory, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
    }

    private DataFormatDetector(JsonFactory ajsonfactory[], MatchStrength matchstrength, MatchStrength matchstrength1, int i)
    {
        _detectors = ajsonfactory;
        _optimalMatch = matchstrength;
        _minimalMatch = matchstrength1;
        _maxInputLookahead = i;
    }

    private DataFormatMatcher _findFormat(InputAccessor.Std std)
    {
        JsonFactory jsonfactory;
        MatchStrength matchstrength;
        JsonFactory ajsonfactory[];
        int i;
        int j;
        ajsonfactory = _detectors;
        j = ajsonfactory.length;
        i = 0;
        jsonfactory = null;
        matchstrength = null;
_L3:
        JsonFactory jsonfactory1;
        MatchStrength matchstrength1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonfactory1 = ajsonfactory[i];
        std.reset();
        matchstrength1 = jsonfactory1.hasFormat(std);
          goto _L1
_L4:
        i++;
        if (true) goto _L3; else goto _L2
_L1:
        if (matchstrength1 != null && (matchstrength1.ordinal() >= _minimalMatch.ordinal() && (jsonfactory == null || matchstrength.ordinal() < matchstrength1.ordinal()))) goto _L5; else goto _L4
_L5:
        if (matchstrength1.ordinal() < _optimalMatch.ordinal()) goto _L7; else goto _L6
_L6:
        return std.createMatcher(jsonfactory1, matchstrength1);
_L2:
        matchstrength1 = matchstrength;
        jsonfactory1 = jsonfactory;
        if (true) goto _L6; else goto _L7
_L7:
        matchstrength = matchstrength1;
        jsonfactory = jsonfactory1;
          goto _L4
    }

    public DataFormatMatcher findFormat(InputStream inputstream)
    {
        return _findFormat(new InputAccessor.Std(inputstream, new byte[_maxInputLookahead]));
    }

    public DataFormatMatcher findFormat(byte abyte0[])
    {
        return _findFormat(new InputAccessor.Std(abyte0));
    }

    public DataFormatDetector withMaxInputLookahead(int i)
    {
        if (i == _maxInputLookahead)
        {
            return this;
        } else
        {
            return new DataFormatDetector(_detectors, _optimalMatch, _minimalMatch, i);
        }
    }

    public DataFormatDetector withMinimalMatch(MatchStrength matchstrength)
    {
        if (matchstrength == _minimalMatch)
        {
            return this;
        } else
        {
            return new DataFormatDetector(_detectors, _optimalMatch, matchstrength, _maxInputLookahead);
        }
    }

    public DataFormatDetector withOptimalMatch(MatchStrength matchstrength)
    {
        if (matchstrength == _optimalMatch)
        {
            return this;
        } else
        {
            return new DataFormatDetector(_detectors, matchstrength, _minimalMatch, _maxInputLookahead);
        }
    }
}
