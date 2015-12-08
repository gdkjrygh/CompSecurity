// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.pinterest.activity.user:
//            UserImageView

final class val.target extends DebouncingOnClickListener
{

    final UserImageView val$target;

    public final void doClick(View view)
    {
        val$target.onUpdatePictureClicked(view);
    }

    ()
    {
        val$target = userimageview;
        super();
    }
}
