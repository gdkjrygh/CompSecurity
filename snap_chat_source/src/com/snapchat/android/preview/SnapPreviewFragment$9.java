// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import android.view.View;
import java.util.LinkedHashSet;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.view.eviewFragment._cls9
{

    private SnapPreviewFragment a;

    public final void onClick(View view)
    {
        if (a.k.isEmpty())
        {
            SnapPreviewFragment.A(a);
            return;
        } else
        {
            SnapPreviewFragment.x(a);
            return;
        }
    }

    (SnapPreviewFragment snappreviewfragment)
    {
        a = snappreviewfragment;
        super();
    }
}
