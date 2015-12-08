// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            MockLocationsWarningDialogView

public class _cls1.val.target
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (MockLocationsWarningDialogView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, final MockLocationsWarningDialogView target, Object obj)
    {
        ((View)viewinjector.(obj, 0x7f0d014c, "method 'onClick_goToDevelopmentSettings'")).setOnClickListener(new DebouncingOnClickListener() {

            final MockLocationsWarningDialogView..ViewInjector this$0;
            final MockLocationsWarningDialogView val$target;

            public void doClick(View view)
            {
                target.onClick_goToDevelopmentSettings(view);
            }

            
            {
                this$0 = MockLocationsWarningDialogView..ViewInjector.this;
                target = mocklocationswarningdialogview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((MockLocationsWarningDialogView)obj);
    }

    public void reset(MockLocationsWarningDialogView mocklocationswarningdialogview)
    {
    }

    public _cls1.val.target()
    {
    }
}
