// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.view.View;
import android.widget.ListView;
import java.util.List;
import me.lyft.android.adapters.ContactsAdapter;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.SecureSubscriber;
import me.lyft.android.utils.ViewExtensions;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.invites:
//            InviteScreenView

class this._cls0 extends SecureSubscriber
{

    final InviteScreenView this$0;

    public volatile void onSafeNext(Object obj)
    {
        onSafeNext((List)obj);
    }

    public void onSafeNext(List list)
    {
        contactsAdapter.swapData(list);
        contactsList.setEmptyView(contactsListEmptyView);
        if (heroContainer.getHeight() != 0 && heroContainer.getWidth() != 0)
        {
            onMeasureAction.call(null);
        } else
        {
            binder.bind(ViewExtensions.onLoadedObservable(heroContainer), onMeasureAction);
        }
        if (list.isEmpty())
        {
            list = "show_social_options";
        } else
        {
            list = "show_contact_list";
        }
        InviteScreenView.access$100(InviteScreenView.this).trackSuccess(list);
    }

    ()
    {
        this$0 = InviteScreenView.this;
        super();
    }
}
