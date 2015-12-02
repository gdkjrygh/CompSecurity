// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.util.Log;
import android.view.View;
import com.nineoldandroids.a.b;

// Referenced classes of package com.qihoo.security.ui.main:
//            a

static final class c
    implements Runnable
{

    final View a[];
    final View b[];
    final b c;

    public void run()
    {
        Log.e("AnimUtils", "double click running...");
        com.qihoo.security.ui.main.a.a(0L, a, b, c);
    }

    (View aview[], View aview1[], b b1)
    {
        a = aview;
        b = aview1;
        c = b1;
        super();
    }
}
