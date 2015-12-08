// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.view.View;
import com.facebook.l;

// Referenced classes of package com.facebook.share.widget:
//            SendButton, d, h

final class f
    implements android.view.View.OnClickListener
{

    final SendButton a;

    f(SendButton sendbutton)
    {
        a = sendbutton;
        super();
    }

    public final void onClick(View view)
    {
        SendButton.a(a, view);
        if (((l) (a)).b != null)
        {
            view = new d(((l) (a)).b, ((h) (a)).d);
        } else
        {
            view = new d(SendButton.a(a), ((h) (a)).d);
        }
        view.a(((h) (a)).c);
    }
}
