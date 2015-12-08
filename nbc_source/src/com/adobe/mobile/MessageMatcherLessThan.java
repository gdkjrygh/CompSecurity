// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.adobe.mobile:
//            MessageMatcher

final class MessageMatcherLessThan extends MessageMatcher
{

    MessageMatcherLessThan()
    {
    }

    protected boolean matches(Object obj)
    {
        obj = tryParseDouble(obj);
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator = values.iterator();
        Object obj1;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = iterator.next();
        } while (!(obj1 instanceof Number) || ((Double) (obj)).doubleValue() >= ((Number)obj1).doubleValue());
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }
}
