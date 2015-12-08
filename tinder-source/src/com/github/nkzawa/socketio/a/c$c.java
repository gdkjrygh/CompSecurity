// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.a;

import java.util.logging.Logger;

// Referenced classes of package com.github.nkzawa.socketio.a:
//            c, b

public static final class a
{
    public static interface a
    {

        public abstract void a(Object aobj[]);
    }


    public static String a(b b1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(b1.a);
        if (5 == b1.a || 6 == b1.a)
        {
            stringbuilder.append(b1.e);
            stringbuilder.append("-");
        }
        boolean flag;
        boolean flag1;
        if (b1.c != null && b1.c.length() != 0 && !"/".equals(b1.c))
        {
            stringbuilder.append(b1.c);
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (b1.b >= 0)
        {
            flag1 = flag;
            if (flag)
            {
                stringbuilder.append(",");
                flag1 = false;
            }
            stringbuilder.append(b1.b);
        }
        if (b1.d != null)
        {
            if (flag1)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(b1.d);
        }
        com.github.nkzawa.socketio.a.c.a().fine(String.format("encoded %s as %s", new Object[] {
            b1, stringbuilder
        }));
        return stringbuilder.toString();
    }

    public a()
    {
    }
}
