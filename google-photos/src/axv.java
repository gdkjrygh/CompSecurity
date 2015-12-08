// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class axv
    implements axx
{

    private axu a;

    axv(axu axu1)
    {
        a = axu1;
        super();
    }

    public final Set a()
    {
        Object obj = a.a();
        HashSet hashset = new HashSet(((Set) (obj)).size());
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            axu axu1 = (axu)((Iterator) (obj)).next();
            if (axu1.c != null)
            {
                hashset.add(axu1.c);
            }
        } while (true);
        return hashset;
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf(s1).length())).append(s).append("{fragment=").append(s1).append("}").toString();
    }
}
