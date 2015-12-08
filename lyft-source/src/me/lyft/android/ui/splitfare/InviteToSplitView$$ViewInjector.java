// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import me.lyft.android.controls.BackButtonToolbar;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitView

public class _cls2.val.target
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (InviteToSplitView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, final InviteToSplitView target, Object obj)
    {
        View view = (View)viewinjector.ew(obj, 0x7f0d023e, "field 'contactsList' and method 'onItemClick'");
        target.contactsList = (ListView)viewinjector.contactsList(view, 0x7f0d023e, "field 'contactsList'");
        ((AdapterView)view).setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final InviteToSplitView..ViewInjector this$0;
            final InviteToSplitView val$target;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                target.onItemClick(i);
            }

            
            {
                this$0 = InviteToSplitView..ViewInjector.this;
                target = invitetosplitview;
                super();
            }
        });
        target.splitPaymentFee = (TextView)viewinjector.splitPaymentFee((View)viewinjector.splitPaymentFee(obj, 0x7f0d023c, "field 'splitPaymentFee'"), 0x7f0d023c, "field 'splitPaymentFee'");
        view = (View)viewinjector.splitPaymentFee(obj, 0x7f0d023f, "field 'sendInvitesButton' and method 'sendInvites'");
        target.sendInvitesButton = view;
        view.setOnClickListener(new DebouncingOnClickListener() {

            final InviteToSplitView..ViewInjector this$0;
            final InviteToSplitView val$target;

            public void doClick(View view1)
            {
                target.sendInvites();
            }

            
            {
                this$0 = InviteToSplitView..ViewInjector.this;
                target = invitetosplitview;
                super();
            }
        });
        target.toolbar = (BackButtonToolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        target.emptyView = (View)viewinjector.emptyView(obj, 0x7f0d023d, "field 'emptyView'");
    }

    public volatile void reset(Object obj)
    {
        reset((InviteToSplitView)obj);
    }

    public void reset(InviteToSplitView invitetosplitview)
    {
        invitetosplitview.contactsList = null;
        invitetosplitview.splitPaymentFee = null;
        invitetosplitview.sendInvitesButton = null;
        invitetosplitview.toolbar = null;
        invitetosplitview.emptyView = null;
    }

    public _cls2.val.target()
    {
    }
}
