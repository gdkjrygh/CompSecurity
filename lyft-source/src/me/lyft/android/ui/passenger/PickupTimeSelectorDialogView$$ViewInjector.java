// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PickupTimeSelectorDialogView

public class _cls1.val.target
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PickupTimeSelectorDialogView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, final PickupTimeSelectorDialogView target, Object obj)
    {
        obj = (View)viewinjector.ew(obj, 0x7f0d0344, "field 'listView' and method 'onPickupOffsetSelected'");
        target.listView = (ListView)viewinjector.listView(((View) (obj)), 0x7f0d0344, "field 'listView'");
        ((AdapterView)obj).setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final PickupTimeSelectorDialogView..ViewInjector this$0;
            final PickupTimeSelectorDialogView val$target;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                target.onPickupOffsetSelected(i);
            }

            
            {
                this$0 = PickupTimeSelectorDialogView..ViewInjector.this;
                target = pickuptimeselectordialogview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((PickupTimeSelectorDialogView)obj);
    }

    public void reset(PickupTimeSelectorDialogView pickuptimeselectordialogview)
    {
        pickuptimeselectordialogview.listView = null;
    }

    public _cls1.val.target()
    {
    }
}
