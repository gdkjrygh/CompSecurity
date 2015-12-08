// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Events;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.activity.sendapin:
//            SendPinFragment

public class SendPinActivity extends BaseActivity
{

    public static final String EXTRA_KEY_BOARDID = "boardId";
    public static final String EXTRA_KEY_PINID = "pinId";
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private SendPinFragment _fragment;

    public SendPinActivity()
    {
        _eventsSubscriber = new _cls1();
    }

    public static void startSendPin(Context context, String s)
    {
        Intent intent = new Intent(context, com/pinterest/activity/sendapin/SendPinActivity);
        intent.putExtra("pinId", s);
        context.startActivity(intent);
    }

    public BaseFragment getActiveFragment()
    {
        return _fragment;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030027);
        bundle = getIntent().getStringExtra("pinId");
        String s = getIntent().getStringExtra("boardId");
        if (bundle == null && s == null)
        {
            PLog.error("Invalid Pin & board id. Exiting SendPinActivity", new Object[0]);
            finish();
        }
        _fragment = (SendPinFragment)getSupportFragmentManager().findFragmentById(0x7f0f0094);
        _fragment.setPinId(bundle);
        _fragment.setBoardId(s);
        AnalyticsApi.b("sendpin_open");
        Events.post(new com.pinterest.activity.task.view.MainViewPager.ControlEvent(2));
        Events.register(_eventsSubscriber, com/pinterest/activity/sendapin/ui/SendPinTitleCell$DimMessageDialogEvent, new Class[0]);
    }

    public void onDestroy()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/activity/sendapin/ui/SendPinTitleCell$DimMessageDialogEvent
        });
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        if (isFinishing())
        {
            Events.post(new com.pinterest.activity.task.view.MainViewPager.ControlEvent(3));
        }
    }

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final SendPinActivity this$0;

        public void onEventMainThread(com.pinterest.activity.sendapin.ui.SendPinTitleCell.DimMessageDialogEvent dimmessagedialogevent)
        {
            setTheme(0x7f0b00e5);
        }

        _cls1()
        {
            this$0 = SendPinActivity.this;
            super();
        }
    }

}
