// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationFlyoutView

final class val.target extends DebouncingOnClickListener
{

    final EducationFlyoutView val$target;

    public final void doClick(View view)
    {
        val$target.onStartIvClicked(view);
    }

    ()
    {
        val$target = educationflyoutview;
        super();
    }
}
