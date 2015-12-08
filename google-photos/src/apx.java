// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class apx
{

    private final jw a;
    private final List b;
    private final String c;

    public apx(Class class1, Class class2, Class class3, List list, jw jw1)
    {
        a = jw1;
        b = (List)b.a(list);
        class1 = String.valueOf(class1.getSimpleName());
        class2 = String.valueOf(class2.getSimpleName());
        class3 = String.valueOf(class3.getSimpleName());
        c = (new StringBuilder(String.valueOf(class1).length() + 21 + String.valueOf(class2).length() + String.valueOf(class3).length())).append("Failed LoadPath{").append(class1).append("->").append(class2).append("->").append(class3).append("}").toString();
    }

    private aqa a(anp anp, ani ani, int i, int j, aoz aoz1, List list)
    {
        aqa aqa;
        int k;
        int l;
        l = b.size();
        aqa = null;
        k = 0;
_L6:
        if (k >= l) goto _L2; else goto _L1
_L1:
        Object obj = (aoy)b.get(k);
        aqa aqa1 = aoz1.a(((aoy) (obj)).a(anp, i, j, ani));
        obj = ((aoy) (obj)).a.a(aqa1);
        aqa = ((aqa) (obj));
_L4:
        obj = aqa;
        if (aqa != null)
        {
            break; /* Loop/switch isn't completed */
        }
        k++;
        continue; /* Loop/switch isn't completed */
        obj;
        list.add(obj);
        if (true) goto _L4; else goto _L3
_L2:
        obj = aqa;
_L3:
        if (obj == null)
        {
            throw new apv(c, new ArrayList(list));
        }
        return ((aqa) (obj));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final aqa a(anp anp, ani ani, int i, int j, aoz aoz1)
    {
        List list = (List)a.a();
        anp = a(anp, ani, i, j, aoz1, list);
        a.a(list);
        return anp;
        anp;
        a.a(list);
        throw anp;
    }

    public final String toString()
    {
        String s = String.valueOf("LoadPath{decodePaths=");
        String s1 = String.valueOf(Arrays.toString(b.toArray(new aoy[b.size()])));
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(s1).append("}").toString();
    }
}
