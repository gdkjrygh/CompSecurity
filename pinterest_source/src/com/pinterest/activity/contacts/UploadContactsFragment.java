// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.base.Events;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.activity.BaseActivity;

// Referenced classes of package com.pinterest.activity.contacts:
//            UploadContactsUtil

public class UploadContactsFragment extends BaseFragment
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;

    public UploadContactsFragment()
    {
        _eventsSubscriber = new _cls2();
    }

    protected void onCancelClick(Button button)
    {
        Events.post(new UploadContactsDismissEvent());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f030117;
    }

    public void onPause()
    {
        Events.unregister(_eventsSubscriber);
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        Events.registerSticky(_eventsSubscriber, com/pinterest/activity/contacts/UploadContactsFragment$UploadContactsDismissEvent, new Class[0]);
    }

    protected void onUploadContactsClick(final Button baseActivity)
    {
        baseActivity = (BaseActivity)getActivity();
        PermissionUtil.checkPermissionAsync(baseActivity, "android.permission.READ_CONTACTS", 0x7f07017d, new _cls1());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        UploadContactsUtil.onDialogShown();
    }


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final UploadContactsFragment this$0;

        public void onEventMainThread(UploadContactsDismissEvent uploadcontactsdismissevent)
        {
            pressBackButton();
            Events.removeStickyEvent(uploadcontactsdismissevent);
        }

        _cls2()
        {
            this$0 = UploadContactsFragment.this;
            super();
        }
    }


    private class UploadContactsDismissEvent
    {

        public UploadContactsDismissEvent()
        {
        }
    }


    private class _cls1
        implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    {

        final UploadContactsFragment this$0;
        final BaseActivity val$baseActivity;

        public void onRequestPermissionsResult(int i, String as[], int ai[])
        {
            if (PermissionUtil.checkPermission(baseActivity, "android.permission.READ_CONTACTS"))
            {
                AnalyticsApi.b("permissions_contact_accept");
                UploadContactsUtil.setStoreContacts(true);
            }
            Events.postSticky(new UploadContactsDismissEvent());
        }

        _cls1()
        {
            this$0 = UploadContactsFragment.this;
            baseActivity = baseactivity;
            super();
        }
    }

}
