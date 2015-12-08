// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import com.pinterest.activity.sendapin.adapter.SendPinAdapter;
import com.pinterest.activity.sendapin.events.SendEvent;
import com.pinterest.activity.sendapin.events.SendPinMessageChangeEvent;
import com.pinterest.base.SocialUtils;
import com.pinterest.kit.activity.BaseActivity;

// Referenced classes of package com.pinterest.activity.sendapin.ui:
//            PeoplePickerListWrapper

class this._cls0
    implements com.pinterest.base.erListWrapper._cls6
{

    final PeoplePickerListWrapper this$0;

    public void onEventMainThread(final SendEvent event)
    {
        event.setObjectToSend(PeoplePickerListWrapper.access$1100(PeoplePickerListWrapper.this));
        event.setMessage(PeoplePickerListWrapper.access$100(PeoplePickerListWrapper.this).getMessage());
        PeoplePickerListWrapper.access$1200(PeoplePickerListWrapper.this).finish();
        class _cls1
            implements Runnable
        {

            final PeoplePickerListWrapper._cls6 this$1;
            final SendEvent val$event;

            public void run()
            {
                Events.post(new ToastEvent(new SendToast(event)));
            }

            _cls1()
            {
                this$1 = PeoplePickerListWrapper._cls6.this;
                event = sendevent;
                super();
            }
        }

        postDelayed(new _cls1(), 250L);
    }

    public void onEventMainThread(SendPinMessageChangeEvent sendpinmessagechangeevent)
    {
        PeoplePickerListWrapper.access$100(PeoplePickerListWrapper.this).setMessage(sendpinmessagechangeevent.getMessage());
    }

    public void onEventMainThread(vent vent)
    {
        SocialUtils.startShare(getContext(), PeoplePickerListWrapper.access$1100(PeoplePickerListWrapper.this), vent.text, vent.packageName, PeoplePickerListWrapper.access$100(PeoplePickerListWrapper.this).getMessage());
    }

    public void onEventMainThread(com.pinterest.base.erListWrapper._cls6 _pcls6)
    {
        switch (.SwitchMap.com.pinterest.base.Social.Network[_pcls6.ork().ork()])
        {
        default:
            return;

        case 1: // '\001'
            PeoplePickerListWrapper.access$100(PeoplePickerListWrapper.this).onFacebookConnected();
            break;
        }
    }

    vent()
    {
        this$0 = PeoplePickerListWrapper.this;
        super();
    }
}
