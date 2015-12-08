// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.support.v4.app.i;
import android.view.View;

// Referenced classes of package com.tinder.fragments:
//            m

final class a
    implements android.view..OnClickListener
{

    final m a;

    public final void onClick(View view)
    {
        if (a.getActivity() != null)
        {
            a.getActivity().finish();
        }
    }

    Listener(m m1)
    {
        a = m1;
        super();
    }
}
