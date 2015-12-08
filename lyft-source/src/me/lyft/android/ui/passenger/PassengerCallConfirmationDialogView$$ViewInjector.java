// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCallConfirmationDialogView

public class _cls1.val.target
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PassengerCallConfirmationDialogView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, final PassengerCallConfirmationDialogView target, Object obj)
    {
        target.titleTextView = (TextView)viewinjector.titleTextView((View)viewinjector.titleTextView(obj, 0x7f0d0061, "field 'titleTextView'"), 0x7f0d0061, "field 'titleTextView'");
        ((View)viewinjector.titleTextView(obj, 0x7f0d014c, "method 'call'")).setOnClickListener(new DebouncingOnClickListener() {

            final PassengerCallConfirmationDialogView..ViewInjector this$0;
            final PassengerCallConfirmationDialogView val$target;

            public void doClick(View view)
            {
                target.call();
            }

            
            {
                this$0 = PassengerCallConfirmationDialogView..ViewInjector.this;
                target = passengercallconfirmationdialogview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((PassengerCallConfirmationDialogView)obj);
    }

    public void reset(PassengerCallConfirmationDialogView passengercallconfirmationdialogview)
    {
        passengercallconfirmationdialogview.titleTextView = null;
    }

    public _cls1.val.target()
    {
    }
}
