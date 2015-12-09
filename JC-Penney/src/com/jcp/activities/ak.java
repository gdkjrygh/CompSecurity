// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import com.jcp.helper.s;
import com.jcp.util.ae;
import com.jcp.util.g;
import java.util.List;

// Referenced classes of package com.jcp.activities:
//            al, MainActivity

class ak
    implements Runnable
{

    final g a;
    final String b;
    final int c;
    final List d;
    final MainActivity e;

    ak(MainActivity mainactivity, g g1, String s1, int i, List list)
    {
        e = mainactivity;
        a = g1;
        b = s1;
        c = i;
        d = list;
        super();
    }

    public void run()
    {
        String s1 = a.c(b);
        try
        {
            (new s()).b(s1);
            e.runOnUiThread(new al(this));
            return;
        }
        catch (Exception exception)
        {
            ae.a(MainActivity.i, exception.getMessage());
        }
    }
}
