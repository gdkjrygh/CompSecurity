// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.am;
import com.facebook.internal.aw;
import com.facebook.internal.az;
import com.facebook.internal.m;
import com.facebook.internal.n;
import com.facebook.internal.o;
import com.facebook.q;

// Referenced classes of package com.facebook.share.internal:
//            z

public final class y extends o
{

    private static final int b;

    public static boolean a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            z z1 = z.a;
            Object obj = q.h();
            String s = z1.a();
            obj = aw.a(((String) (obj)), s, z1.name());
            int ai[];
            boolean flag;
            if (obj != null)
            {
                ai = ((az) (obj)).d();
            } else
            {
                ai = new int[1];
                ai[0] = z1.b();
            }
            if (am.a(s, ai) != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean b()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            Object obj1 = z.a;
            Object obj = ((n) (obj1)).name();
            obj1 = ((n) (obj1)).a();
            obj1 = aw.a(q.h(), ((String) (obj1)), ((String) (obj)));
            obj = null;
            if (obj1 != null)
            {
                obj = ((az) (obj1)).c();
            }
            boolean flag;
            if (obj != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    static 
    {
        b = m.d.a();
    }
}
