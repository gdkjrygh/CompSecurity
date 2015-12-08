// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import Ge;
import android.content.Context;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a extends Ge
{

    private SnapPreviewFragment a;

    protected final void a()
    {
        if (!SnapPreviewFragment.d(a))
        {
            SnapPreviewFragment.e(a);
            FragmentActivity fragmentactivity = a.getActivity();
            if (fragmentactivity != null)
            {
                fragmentactivity.onBackPressed();
                return;
            }
        }
    }

    protected final void b()
    {
    }

    _cls9(SnapPreviewFragment snappreviewfragment, Context context, String s)
    {
        a = snappreviewfragment;
        super(context, s);
    }
}
