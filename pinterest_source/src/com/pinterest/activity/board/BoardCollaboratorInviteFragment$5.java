// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.board.model.CollaboratorInvite;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.InviteEmailToast;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.text.SearchEditText;

// Referenced classes of package com.pinterest.activity.board:
//            BoardCollaboratorInviteFragment

class this._cls0
    implements android.widget.iteFragment._cls5
{

    final BoardCollaboratorInviteFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (view.getTag()));
        if (adapterview != null)
        {
            if (adapterview instanceof CollaboratorInvite)
            {
                adapterview = (CollaboratorInvite)adapterview;
                Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.USER_FEED);
                Events.post(new Navigation(Location.USER, adapterview.getInvitedUser().getUid()));
            } else
            if (adapterview instanceof TypeAheadItem)
            {
                adapterview = (TypeAheadItem)adapterview;
                if (!adapterview.isPlaceHolder())
                {
                    Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.SUGGESTED_USERS);
                    Events.post(new Navigation(Location.USER, adapterview.getUid()));
                    return;
                }
                if (adapterview.getItemType() == com.pinterest.activity.search.model.HOLDER)
                {
                    adapterview = _searchEt.getText().toString();
                    if (SignupFormUtils.isEmailValid(adapterview))
                    {
                        Device.hideSoftKeyboard(_searchEt);
                        Events.post(new ToastEvent(new InviteEmailToast(BoardCollaboratorInviteFragment.access$100(BoardCollaboratorInviteFragment.this), adapterview)));
                        return;
                    } else
                    {
                        Application.showToast(0x7f0702fa);
                        return;
                    }
                }
            }
        }
    }

    ()
    {
        this$0 = BoardCollaboratorInviteFragment.this;
        super();
    }
}
