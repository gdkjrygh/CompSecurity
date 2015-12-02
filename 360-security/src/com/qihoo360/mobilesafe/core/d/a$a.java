// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.d;

import java.util.Locale;

// Referenced classes of package com.qihoo360.mobilesafe.core.d:
//            a

static final class 
{

    int a;
    int b;
    String c[];
    String d;
    android.os.g.MemoryInfo e;
    int f;

    public String toString()
    {
        return String.format(Locale.US, "%s[pid=%d,uid=%d,processName=%s,oom_adj=%d,pss=%dKB", new Object[] {
            c[0], Integer.valueOf(a), Integer.valueOf(b), d, Integer.valueOf(f), Integer.valueOf(e.getTotalPss())
        });
    }

    ()
    {
    }
}
