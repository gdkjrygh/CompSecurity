// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;

// Referenced classes of package com.qihoo.antivirus.update:
//            ab

public abstract class l
    implements ab
{

    protected int a;
    protected final int b[] = new int[2];
    private final Context c;
    private final String d;

    public l(Context context, String s)
    {
        a = 0;
        c = context;
        d = s;
    }

    public String a()
    {
        return d;
    }

    public Context b()
    {
        return c;
    }

    public String c()
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        do
        {
            if (i >= 2)
            {
                return stringbuilder.toString();
            }
            stringbuilder.append(String.format("%02d", new Object[] {
                Integer.valueOf(b[i])
            }));
            i++;
        } while (true);
    }
}
