// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import com.kik.g.i;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kik.a.d.k;

// Referenced classes of package kik.android.util:
//            ck

final class cl extends i
{

    final ck a;

    cl(ck ck1)
    {
        a = ck1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        obj1 = ck.b.values();
        int l = obj1.length;
        int j = 0;
        do
        {
label0:
            {
                if (j < l)
                {
                    Iterator iterator = obj1[j];
                    iterator = (new ArrayList(((ck.a)ck.a(a).get(iterator)).a)).iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                    } while (!((String) (obj)).equals(((k)iterator.next()).b()));
                    ck.b(a).a(null);
                }
                return;
            }
            j++;
        } while (true);
    }
}
