// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.view.viewFragment._cls25
{

    private SnapPreviewFragment a;

    public final void onClick(View view)
    {
        ((InputMethodManager)SnapPreviewFragment.a(a, "input_method")).hideSoftInputFromWindow(SnapPreviewFragment.j(a).getApplicationWindowToken(), 0);
        a.getActivity().onBackPressed();
    }

    _cls9(SnapPreviewFragment snappreviewfragment)
    {
        a = snappreviewfragment;
        super();
    }
}
