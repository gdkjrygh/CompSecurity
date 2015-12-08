// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.nonstop.f;
import com.google.android.apps.unveil.sensors.k;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            TextInput, y

final class u
    implements k
{

    final boolean a;
    final TextInput b;

    u(TextInput textinput, boolean flag)
    {
        b = textinput;
        a = flag;
        super();
    }

    public final void a(boolean flag)
    {
        TextInput.m();
        if (TextInput.e(b) == null)
        {
            TextInput.n().a("Preview looper is null, input has finished already?", new Object[0]);
            return;
        }
        af af1 = TextInput.n();
        String s;
        if (flag)
        {
            s = "Succeed";
        } else
        {
            s = "Failed";
        }
        af1.a("Camera focus completed. %s", new Object[] {
            s
        });
        com.google.android.apps.unveil.textinput.TextInput.f(b);
        TextInput.e(b).b();
        TextInput.c(b).f();
        TextInput.b(b, a);
    }
}
