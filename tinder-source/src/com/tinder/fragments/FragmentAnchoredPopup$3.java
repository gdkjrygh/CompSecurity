// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;

// Referenced classes of package com.tinder.fragments:
//            FragmentAnchoredPopup

final class a
    implements android.view.Popup._cls3
{

    final FragmentAnchoredPopup a;

    public final void onClick(View view)
    {
        if (FragmentAnchoredPopup.e(a) != null)
        {
            FragmentAnchoredPopup.e(a).a();
        }
        a.b();
    }

    (FragmentAnchoredPopup fragmentanchoredpopup)
    {
        a = fragmentanchoredpopup;
        super();
    }
}
