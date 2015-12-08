// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.adobe.mobile:
//            MessageMatcher

class MessageMatcherEquals extends MessageMatcher
{

    MessageMatcherEquals()
    {
    }

    protected boolean matches(Object obj)
    {
label0:
        {
            Iterator iterator = values.iterator();
            Object obj1;
label1:
            do
            {
                do
                {
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        obj1 = iterator.next();
                        if ((obj1 instanceof String) && (obj instanceof String))
                        {
                            if (obj1.toString().compareToIgnoreCase(obj.toString()) == 0)
                            {
                                return true;
                            }
                            continue;
                        }
                        if (!(obj1 instanceof Number) || !(obj instanceof Number))
                        {
                            break;
                        }
                        if (((Number)obj1).doubleValue() == ((Number)obj).doubleValue())
                        {
                            return true;
                        }
                    } while (true);
                    if (!(obj1 instanceof Number) || !(obj instanceof String))
                    {
                        continue label1;
                    }
                } while (tryParseDouble(obj) == null || ((Number)obj1).doubleValue() != tryParseDouble(obj).doubleValue());
                return true;
            } while (!(obj1 instanceof String) || !(obj instanceof Number) || obj1.toString().compareToIgnoreCase(obj.toString()) != 0);
            return true;
        }
        return false;
    }
}
