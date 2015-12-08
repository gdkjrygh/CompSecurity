// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class ats
    implements atm
{

    private final List a;
    private final jw b;

    ats(List list, jw jw)
    {
        a = list;
        b = jw;
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        int l = a.size();
        ArrayList arraylist = new ArrayList(l);
        int k = 0;
        ane ane = null;
        for (; k < l; k++)
        {
            Object obj1 = (atm)a.get(k);
            if (!((atm) (obj1)).a(obj))
            {
                continue;
            }
            obj1 = ((atm) (obj1)).a(obj, i, j, ani);
            if (obj1 != null)
            {
                ane = ((atn) (obj1)).a;
                arraylist.add(((atn) (obj1)).c);
            }
        }

        if (!arraylist.isEmpty())
        {
            return new atn(ane, new att(arraylist, b));
        } else
        {
            return null;
        }
    }

    public final boolean a(Object obj)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((atm)iterator.next()).a(obj))
            {
                return true;
            }
        }

        return false;
    }

    public final String toString()
    {
        String s = String.valueOf("MultiModelLoader{modelLoaders=");
        String s1 = String.valueOf(Arrays.toString(a.toArray(new atm[a.size()])));
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(s1).append("}").toString();
    }
}
