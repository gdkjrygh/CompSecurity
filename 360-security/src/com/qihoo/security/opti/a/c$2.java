// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.a;

import android.text.TextUtils;
import java.util.Comparator;

// Referenced classes of package com.qihoo.security.opti.a:
//            c

class a
    implements Comparator
{

    final c a;

    public final int a(a a1, a a2)
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (a1 != null)
        {
            i = ((flag) ? 1 : 0);
            if (a2 != null)
            {
                i = ((flag) ? 1 : 0);
                if (!TextUtils.isEmpty(a1.b))
                {
                    i = ((flag) ? 1 : 0);
                    if (!TextUtils.isEmpty(a2.b))
                    {
                        a1 = a1.b;
                        a2 = a2.b;
                        if (a1.compareTo(a2) > 0)
                        {
                            i = 1;
                        } else
                        {
                            i = ((flag) ? 1 : 0);
                            if (a1.compareTo(a2) < 0)
                            {
                                return -1;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((a)obj, (a)obj1);
    }

    (c c1)
    {
        a = c1;
        super();
    }
}
