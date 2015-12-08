// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.sendapin.adapter.SendPinAdapter;
import com.pinterest.activity.sendapin.events.SendEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Conversation;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import java.util.List;

// Referenced classes of package com.pinterest.activity.sendapin.ui:
//            PeoplePickerListWrapper

class this._cls0
    implements android.widget.tener
{

    final PeoplePickerListWrapper this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i == 0)
        {
            PeoplePickerListWrapper.access$1200(PeoplePickerListWrapper.this).finish();
        } else
        {
            view = ((View) (PeoplePickerListWrapper.access$100(PeoplePickerListWrapper.this).getItem(i)));
            adapterview = view;
            if (view instanceof Conversation)
            {
                view = (Conversation)view;
                adapterview = new TypeAheadItem();
                adapterview.setIdentifier(view.getUid());
                adapterview.setUid(view.getUid());
                adapterview.setTitle(view.getConversationTitle());
                adapterview.setItemType(com.pinterest.activity.search.model.VERSATION);
                view = view.getConversationImageUrls();
                if (view != null && !view.isEmpty())
                {
                    adapterview.setImageUri((String)view.get(0));
                }
            }
            if (adapterview instanceof TypeAheadItem)
            {
                adapterview = (TypeAheadItem)adapterview;
                switch (.SwitchMap.com.pinterest.activity.search.model.TypeAheadItem.ItemType[adapterview.getItemType().inal()])
                {
                default:
                    return;

                case 1: // '\001'
                case 2: // '\002'
                    view = PeoplePickerListWrapper.access$400(PeoplePickerListWrapper.this).getText().toString();
                    if (SignupFormUtils.isEmailValid(view))
                    {
                        adapterview.setTitle(view);
                        adapterview.setItemType(com.pinterest.activity.search.model.IL_CONTACT);
                        adapterview.setIdentifier(view);
                        Events.post(new SendEvent(adapterview));
                        return;
                    } else
                    {
                        Application.showToast(0x7f0702fa);
                        return;
                    }

                case 3: // '\003'
                    Events.post(new com.pinterest.base.(com.pinterest.base.));
                    return;

                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                case 7: // '\007'
                    Device.hideSoftKeyboard(PeoplePickerListWrapper.access$400(PeoplePickerListWrapper.this));
                    Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.USER_FEED);
                    Events.post(new SendEvent(adapterview));
                    return;

                case 8: // '\b'
                    PeoplePickerListWrapper.access$1300(PeoplePickerListWrapper.this);
                    return;
                }
            }
        }
    }

    ()
    {
        this$0 = PeoplePickerListWrapper.this;
        super();
    }
}
