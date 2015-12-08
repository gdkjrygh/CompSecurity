// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.support.v7.widget.ListPopupWindow;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.adapter.IconTextListAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.base.SocialUtils;
import com.pinterest.experiment.Experiments;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupAccessoryActionBar

class val.adapter
    implements android.widget.
{

    final PinCloseupAccessoryActionBar this$0;
    final IconTextListAdapter val$adapter;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i >= 0 && i < val$adapter.getCount())
        {
            if (i != val$adapter.getCount() - 1)
            {
                adapterview = (com.pinterest.adapter.tionBar._cls3.val.adapter)val$adapter.getItem(i);
                view = ActivityHelper.getElementTypeByPackageName(((com.pinterest.adapter.yPackageName) (adapterview)).ta);
                if (view == null)
                {
                    Pinalytics.a(ElementType.SHARE_SOCIAL_BUTTON, ComponentType.MODAL_DIALOG, ((com.pinterest.adapter.G) (adapterview)).ta);
                } else
                {
                    Pinalytics.a(view, ComponentType.MODAL_DIALOG, PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this).getUid());
                }
                if (Experiments.L())
                {
                    SocialUtils.shareWithInviteCode(getContext(), new SendableObject(PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this).getUid(), 0), ((com.pinterest.adapter.tionBar) (adapterview)).ta, PinCloseupAccessoryActionBar.access$100(PinCloseupAccessoryActionBar.this));
                } else
                {
                    SocialUtils.startShare(getContext(), PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this), ((com.pinterest.adapter.tionBar) (adapterview)).xt, ((com.pinterest.adapter.xt) (adapterview)).ta);
                }
            } else
            {
                PinCloseupAccessoryActionBar.access$200(PinCloseupAccessoryActionBar.this);
            }
        }
        if (PinCloseupAccessoryActionBar.access$300(PinCloseupAccessoryActionBar.this) != null)
        {
            PinCloseupAccessoryActionBar.access$300(PinCloseupAccessoryActionBar.this).dismiss();
        }
    }

    ()
    {
        this$0 = final_pincloseupaccessoryactionbar;
        val$adapter = IconTextListAdapter.this;
        super();
    }
}
