// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.Dialog;
import android.view.View;
import com.tinder.e.f;

// Referenced classes of package com.tinder.fragments:
//            bc

final class a
    implements android.view.OnClickListener
{

    final bc a;

    public final void onClick(View view)
    {
        if (bc.a(a) != null)
        {
            bc.a(a).b();
        }
        a.getDialog().dismiss();
    }

    istener(bc bc1)
    {
        a = bc1;
        super();
    }
}
