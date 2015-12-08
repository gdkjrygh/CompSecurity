// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package crittercism.android:
//            n

public final class p extends n
{

    public p(Map map)
    {
        super(map);
        TreeMap treemap = new TreeMap(new Comparator() {

            final p a;

            public final volatile int compare(Object obj, Object obj1)
            {
                obj = (String)obj;
                obj1 = (String)obj1;
                if (obj == obj1)
                {
                    return 0;
                }
                if (obj == null)
                {
                    return -1;
                }
                if (obj1 == null)
                {
                    return 1;
                } else
                {
                    return String.CASE_INSENSITIVE_ORDER.compare(obj, obj1);
                }
            }

            
            {
                a = p.this;
                super();
            }
        });
        treemap.putAll(map);
        super.a = treemap;
    }
}
