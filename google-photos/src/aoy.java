// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class aoy
{

    final axg a;
    private final Class b;
    private final List c;
    private final jw d;
    private final String e;

    public aoy(Class class1, Class class2, Class class3, List list, axg axg, jw jw1)
    {
        b = class1;
        c = list;
        a = axg;
        d = jw1;
        class1 = String.valueOf(class1.getSimpleName());
        class2 = String.valueOf(class2.getSimpleName());
        class3 = String.valueOf(class3.getSimpleName());
        e = (new StringBuilder(String.valueOf(class1).length() + 23 + String.valueOf(class2).length() + String.valueOf(class3).length())).append("Failed DecodePath{").append(class1).append("->").append(class2).append("->").append(class3).append("}").toString();
    }

    private aqa a(anp anp1, int i, int j, ani ani, List list)
    {
        Object obj;
        int k;
        int l;
        obj = null;
        l = c.size();
        k = 0;
_L5:
        Object obj1 = obj;
        if (k >= l) goto _L2; else goto _L1
_L1:
        Object obj2 = (anj)c.get(k);
        if (!((anj) (obj2)).a(anp1.a(), ani))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        obj1 = ((anj) (obj2)).a(anp1.a(), i, j, ani);
        obj = obj1;
_L3:
        obj1 = obj;
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        k++;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (Log.isLoggable("DecodePath", 2))
        {
            obj2 = String.valueOf(obj2);
            (new StringBuilder(String.valueOf(obj2).length() + 26)).append("Failed to decode data for ").append(((String) (obj2)));
        }
        list.add(obj1);
        if (true) goto _L3; else goto _L2
_L2:
        if (obj1 == null)
        {
            throw new apv(e, new ArrayList(list));
        }
        return ((aqa) (obj1));
        if (true) goto _L5; else goto _L4
_L4:
    }

    aqa a(anp anp1, int i, int j, ani ani)
    {
        List list = (List)d.a();
        anp1 = a(anp1, i, j, ani, list);
        d.a(list);
        return anp1;
        anp1;
        d.a(list);
        throw anp1;
    }

    public final String toString()
    {
        String s = String.valueOf("DecodePath{ dataClass=");
        String s1 = String.valueOf(b);
        String s2 = String.valueOf(c);
        String s3 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 25 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(", decoders=").append(s2).append(", transcoder=").append(s3).append("}").toString();
    }
}
