// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import com.android.slyce.k.h;
import com.moodstocks.android.MoodstocksError;
import com.moodstocks.android.Scanner;

// Referenced classes of package com.android.slyce:
//            a, h

class e
    implements Runnable
{

    final String a;
    final String b;
    final a c;

    e(a a1, String s, String s1)
    {
        c = a1;
        a = s;
        b = s1;
        super();
    }

    public void run()
    {
        String s;
        s = (new StringBuilder()).append(a).append("_").append(b).append("_scanner.db").toString();
        com.android.slyce.a.a(c, Scanner.isCompatible());
        if (!com.android.slyce.a.c(c))
        {
            break MISSING_BLOCK_LABEL_131;
        }
        com.android.slyce.a.a(c, Scanner.get());
        s = Scanner.pathFromFilesDir(com.android.slyce.a.d(c), s);
        com.android.slyce.a.e(c).open(s, a, b);
        com.android.slyce.a.e(c).setSyncListener(new com.android.slyce.h(c, null));
        com.android.slyce.a.e(c).sync();
        return;
        MoodstocksError moodstockserror;
        moodstockserror;
        h.b(com.android.slyce.a.j(), moodstockserror.getMessage());
        return;
    }
}
