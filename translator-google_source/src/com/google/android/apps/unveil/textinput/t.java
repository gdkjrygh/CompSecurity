// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import com.google.android.apps.unveil.env.j;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            TextInput, y

final class t
    implements Runnable
{

    final j a;
    final boolean b;
    final TextInput c;

    t(TextInput textinput, j j, boolean flag)
    {
        c = textinput;
        a = j;
        b = flag;
        super();
    }

    public final void run()
    {
        TextInput.c(c).g();
        if (b)
        {
            c.h();
        }
    }
}
