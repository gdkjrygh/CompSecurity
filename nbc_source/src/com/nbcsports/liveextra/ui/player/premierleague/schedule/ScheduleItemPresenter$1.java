// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            ScheduleItemPresenter, ScheduleViewModel, ScheduleItemView

class this._cls0 extends Subscriber
{

    final ScheduleItemPresenter this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "Error setting splash data", new Object[0]);
    }

    public void onNext(this._cls0 _pcls0)
    {
        if (!hasView() || ScheduleItemPresenter.access$000(ScheduleItemPresenter.this) == null)
        {
            return;
        }
        if (_pcls0 == null) goto _L2; else goto _L1
_L1:
        byte byte0;
        _pcls0 = _pcls0.network;
        byte0 = -1;
        _pcls0.hashCode();
        JVM INSTR lookupswitch 4: default 80
    //                   84323: 169
    //                   2073068: 155
    //                   146534352: 141
    //                   1177988542: 183;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        byte0;
        JVM INSTR tableswitch 0 2: default 108
    //                   0 197
    //                   1 212
    //                   2 227;
           goto _L8 _L9 _L10 _L11
_L8:
        ScheduleItemPresenter.access$100(ScheduleItemPresenter.this).setProviderIcon(0x7f020126);
_L12:
        ((ScheduleItemView)ScheduleItemPresenter.access$200(ScheduleItemPresenter.this)).bind(ScheduleItemPresenter.access$100(ScheduleItemPresenter.this));
        return;
_L6:
        if (_pcls0.equals("NBC Sports"))
        {
            byte0 = 0;
        }
          goto _L3
_L5:
        if (_pcls0.equals("CNBC"))
        {
            byte0 = 1;
        }
          goto _L3
_L4:
        if (_pcls0.equals("USA"))
        {
            byte0 = 2;
        }
          goto _L3
_L7:
        if (_pcls0.equals("NBC Sports Network"))
        {
            byte0 = 3;
        }
          goto _L3
_L9:
        ScheduleItemPresenter.access$100(ScheduleItemPresenter.this).setProviderIcon(0x7f020125);
          goto _L12
_L10:
        ScheduleItemPresenter.access$100(ScheduleItemPresenter.this).setProviderIcon(0x7f020124);
          goto _L12
_L11:
        ScheduleItemPresenter.access$100(ScheduleItemPresenter.this).setProviderIcon(0x7f020127);
          goto _L12
_L2:
        ScheduleItemPresenter.access$100(ScheduleItemPresenter.this).setProviderIcon(0x7f020126);
          goto _L12
    }

    public volatile void onNext(Object obj)
    {
        onNext((onNext)obj);
    }

    ()
    {
        this$0 = ScheduleItemPresenter.this;
        super();
    }
}
