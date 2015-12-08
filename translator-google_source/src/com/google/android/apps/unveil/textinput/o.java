// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.view.View;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            TextInput

final class o
    implements android.view.View.OnClickListener
{

    final TextInput a;

    o(TextInput textinput)
    {
        a = textinput;
        super();
    }

    public final void onClick(View view)
    {
        a.a(true);
    }
}
