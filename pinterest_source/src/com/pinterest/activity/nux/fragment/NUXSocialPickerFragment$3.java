// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.activity.nux.adapter.NUXSocialAdapter;
import com.pinterest.activity.nux.view.NUXContinueBar;
import com.pinterest.activity.nux.view.NUXHeaderView;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXSocialPickerFragment, NUXSocialGridFragment

class this._cls0
    implements com.pinterest.base.PickerFragment._cls3
{

    final NUXSocialPickerFragment this$0;

    public void onEventMainThread(com.pinterest.activity.nux.ngeEvent ngeevent)
    {
        ngeevent = getActivity();
        if (ngeevent == null || NUXSocialPickerFragment.access$000(NUXSocialPickerFragment.this))
        {
            return;
        }
        if (ngeevent instanceof NUXActivity)
        {
            ((NUXActivity)getActivity()).setProgressVisibility(0);
        }
        _continueBar.enableButton(NUXSocialPickerFragment.access$100(NUXSocialPickerFragment.this).isEitherSocialComplete());
    }

    public void onEventMainThread(idViewScrolledEvent idviewscrolledevent)
    {
        if (idviewscrolledevent.getY() > 20 && _header.getVisibility() == 0)
        {
            _header.setVisibility(8);
            return;
        } else
        {
            _header.setVisibility(0);
            return;
        }
    }

    public void onEventMainThread(cialConnectedEvent cialconnectedevent)
    {
        Events.post(new DialogEvent(null));
        if (NUXSocialPickerFragment.access$000(NUXSocialPickerFragment.this))
        {
            return;
        }
        switch (cialconnectedevent.getType())
        {
        default:
            return;

        case 0: // '\0'
            selectNewTabView(0);
            return;

        case 1: // '\001'
            selectNewTabView(1);
            break;
        }
    }

    public void onEventMainThread(com.pinterest.base.PickerFragment._cls3 _pcls3)
    {
        if (_pcls3.cted()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        .SwitchMap.com.pinterest.base.Social.Network[_pcls3.ork().ork()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 41
    //                   2 72;
           goto _L3 _L4 _L5
_L5:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        if (NUXSocialPickerFragment.access$100(NUXSocialPickerFragment.this).getCurrentFragmentCount() == 0) goto _L1; else goto _L6
_L6:
        ((NUXSocialGridFragment)NUXSocialPickerFragment.access$100(NUXSocialPickerFragment.this).getItem(0)).loadData();
        return;
        if (NUXSocialPickerFragment.access$100(NUXSocialPickerFragment.this).getCurrentFragmentCount() == 1) goto _L1; else goto _L7
_L7:
        ((NUXSocialGridFragment)NUXSocialPickerFragment.access$100(NUXSocialPickerFragment.this).getItem(1)).loadData();
        return;
    }

    cialConnectedEvent()
    {
        this$0 = NUXSocialPickerFragment.this;
        super();
    }
}
