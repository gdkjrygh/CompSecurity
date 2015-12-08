// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;


// Referenced classes of package com.google.zxing.client.result:
//            ParsedResultType

public abstract class ParsedResult
{

    private final ParsedResultType type;

    protected ParsedResult(ParsedResultType parsedresulttype)
    {
        type = parsedresulttype;
    }

    public static void maybeAppend(String s, StringBuilder stringbuilder)
    {
        if (s != null && !s.isEmpty())
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append('\n');
            }
            stringbuilder.append(s);
        }
    }

    public static void maybeAppend(String as[], StringBuilder stringbuilder)
    {
        if (as != null)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                maybeAppend(as[i], stringbuilder);
            }

        }
    }

    public abstract String getDisplayResult();

    public final ParsedResultType getType()
    {
        return type;
    }

    public final String toString()
    {
        return getDisplayResult();
    }
}
