// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.invites:
//            BottomSheetDialogView

public class _cls2.val.target
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (BottomSheetDialogView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, final BottomSheetDialogView target, Object obj)
    {
        View view = (View)viewinjector.(obj, 0x7f0d008b, "field 'backgroundView' and method 'onItemClick'");
        target.backgroundView = view;
        view.setOnClickListener(new DebouncingOnClickListener() {

            final BottomSheetDialogView..ViewInjector this$0;
            final BottomSheetDialogView val$target;

            public void doClick(View view1)
            {
                target.onItemClick();
            }

            
            {
                this$0 = BottomSheetDialogView..ViewInjector.this;
                target = bottomsheetdialogview;
                super();
            }
        });
        target.bottomSheetContainer = (LinearLayout)viewinjector.bottomSheetContainer((View)viewinjector.bottomSheetContainer(obj, 0x7f0d008c, "field 'bottomSheetContainer'"), 0x7f0d008c, "field 'bottomSheetContainer'");
        obj = (View)viewinjector.bottomSheetContainer(obj, 0x7f0d008d, "field 'bottomSheet' and method 'onItemClick'");
        target.bottomSheet = (GridView)viewinjector.bottomSheet(((View) (obj)), 0x7f0d008d, "field 'bottomSheet'");
        ((AdapterView)obj).setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final BottomSheetDialogView..ViewInjector this$0;
            final BottomSheetDialogView val$target;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                target.onItemClick(adapterview, view1, i, l);
            }

            
            {
                this$0 = BottomSheetDialogView..ViewInjector.this;
                target = bottomsheetdialogview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((BottomSheetDialogView)obj);
    }

    public void reset(BottomSheetDialogView bottomsheetdialogview)
    {
        bottomsheetdialogview.backgroundView = null;
        bottomsheetdialogview.bottomSheetContainer = null;
        bottomsheetdialogview.bottomSheet = null;
    }

    public _cls2.val.target()
    {
    }
}
