// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.model;

import android.view.View;

// Referenced classes of package com.pinterest.activity.settings.model:
//            AppPermissionSettingsGuideFragment

public class _cls2
{

    public static void inject(butterknife.ideFragment idefragment, final AppPermissionSettingsGuideFragment target, Object obj)
    {
        class _cls1 extends DebouncingOnClickListener
        {

            final AppPermissionSettingsGuideFragment val$target;

            public final void doClick(View view)
            {
                target.onGoToSettingsClick((Button)view);
            }

            _cls1()
            {
                target = apppermissionsettingsguidefragment;
                super();
            }
        }

        idefragment.ideFragment(obj, 0x7f0f01dc, "method 'onGoToSettingsClick'").setOnClickListener(new _cls1());
        class _cls2 extends DebouncingOnClickListener
        {

            final AppPermissionSettingsGuideFragment val$target;

            public final void doClick(View view)
            {
                target.onCancelClick((Button)view);
            }

            _cls2()
            {
                target = apppermissionsettingsguidefragment;
                super();
            }
        }

        idefragment.ideFragment(obj, 0x7f0f01dd, "method 'onCancelClick'").setOnClickListener(new _cls2());
    }

    public static void reset(AppPermissionSettingsGuideFragment apppermissionsettingsguidefragment)
    {
    }

    public _cls2()
    {
    }
}
