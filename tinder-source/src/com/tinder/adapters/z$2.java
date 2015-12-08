// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.view.View;
import com.tinder.model.Message;

// Referenced classes of package com.tinder.adapters:
//            z

final class a
    implements android.view..OnClickListener
{

    final Message a;
    final z b;

    public final void onClick(View view)
    {
        z.a(b).a(a);
    }

    (z z1, Message message)
    {
        b = z1;
        a = message;
        super();
    }
}
