// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import com.google.zxing.Result;

// Referenced classes of package com.google.zxing.client.result:
//            AbstractDoCoMoResultParser, URIResultParser, URIParsedResult, ParsedResult

public final class BookmarkDoCoMoResultParser extends AbstractDoCoMoResultParser
{

    public BookmarkDoCoMoResultParser()
    {
    }

    public volatile ParsedResult parse(Result result)
    {
        return parse(result);
    }

    public URIParsedResult parse(Result result)
    {
        String s = result.getText();
        if (s.startsWith("MEBKM:"))
        {
            result = matchSingleDoCoMoPrefixedField("TITLE:", s, true);
            String as[] = matchDoCoMoPrefixedField("URL:", s, true);
            if (as != null)
            {
                String s1 = as[0];
                if (URIResultParser.isBasicallyValidURI(s1))
                {
                    return new URIParsedResult(s1, result);
                }
            }
        }
        return null;
    }
}
