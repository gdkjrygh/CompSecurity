// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import com.google.android.apps.unveil.env.j;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            TextInput, y

final class r
    implements Runnable
{

    final j a;
    final TextInput b;

    r(TextInput textinput, j j)
    {
        b = textinput;
        a = j;
        super();
    }

    public final void run()
    {
        TextInput.c(b).g();
    }
}
