// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

protected static class it
{

    private final Iterator it;

    public boolean hasNext()
    {
        return it.hasNext();
    }

    public List nextComponent()
    {
        Object obj;
        if (!hasNext())
        {
            obj = new ArrayList(0);
        } else
        {
            List list = (List)it.next();
            obj = list;
            if (list.size() == 1)
            {
                obj = list;
                if (((String)list.get(0)).length() == 0)
                {
                    return new ArrayList(0);
                }
            }
        }
        return ((List) (obj));
    }

    public String nextString()
    {
        Object obj;
        if (hasNext())
        {
            if (!((List) (obj = (List)it.next())).isEmpty())
            {
                String s = (String)((List) (obj)).get(0);
                obj = s;
                if (s.length() == 0)
                {
                    obj = null;
                }
                return ((String) (obj));
            }
        }
        return null;
    }

    public (Iterator iterator)
    {
        it = iterator;
    }
}
