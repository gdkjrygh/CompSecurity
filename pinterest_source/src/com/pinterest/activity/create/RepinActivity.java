// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.os.Bundle;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.create.fragment.RepinFragment;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.base.Events;
import com.pinterest.kit.activity.BaseActivity;

public class RepinActivity extends BaseActivity
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    protected RepinFragment _repinFragment;

    public RepinActivity()
    {
        _eventsSubscriber = new _cls1();
    }

    public BaseFragment getActiveFragment()
    {
        return _repinFragment;
    }

    protected void init()
    {
        setContentView(0x7f030021);
        _repinFragment = new RepinFragment();
        FragmentHelper.replaceFragment(this, _repinFragment, false, com.pinterest.activity.FragmentHelper.Animation.NONE);
        FragmentHelper.updateFragmentWidth(this);
    }

    protected void onActionBarClicked()
    {
        _repinFragment.scrollTo(0, 0);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        init();
        Events.register(_eventsSubscriber, com/pinterest/base/Device$MetricsUpdateEvent, new Class[0]);
    }

    protected void onDestroy()
    {
        Events.unregister(_eventsSubscriber);
        super.onDestroy();
    }

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final RepinActivity this$0;

        public void onEventMainThread(com.pinterest.base.Device.MetricsUpdateEvent metricsupdateevent)
        {
            FragmentHelper.updateFragmentWidth(RepinActivity.this);
        }

        _cls1()
        {
            this$0 = RepinActivity.this;
            super();
        }
    }

}
