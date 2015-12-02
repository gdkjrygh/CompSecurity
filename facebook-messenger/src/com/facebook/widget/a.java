// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.view.View;

// Referenced classes of package com.facebook.widget:
//            ConfirmationView, c

class a
    implements android.view.View.OnClickListener
{

    final ConfirmationView a;

    a(ConfirmationView confirmationview)
    {
        a = confirmationview;
        super();
    }

    public void onClick(View view)
    {
        if (ConfirmationView.a(a) != null)
        {
            ConfirmationView.a(a).a();
        }
    }
}
