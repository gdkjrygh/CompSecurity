// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import java.util.Iterator;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

protected static class it
{

    private final Iterator it;

    public boolean hasNext()
    {
        return it.hasNext();
    }

    public String next()
    {
        if (!hasNext())
        {
            return null;
        }
        String s1 = (String)it.next();
        String s = s1;
        if (s1.length() == 0)
        {
            s = null;
        }
        return s;
    }

    public (Iterator iterator)
    {
        it = iterator;
    }
}
