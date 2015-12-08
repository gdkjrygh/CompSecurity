// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import android.os.Bundle;
import android.text.TextUtils;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.user:
//            UserImageView

public class UserImageDialog extends BaseDialog
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private User _user;

    public UserImageDialog()
    {
        _eventsSubscriber = new _cls1();
    }

    public static UserImageDialog newInstance(String s)
    {
        UserImageDialog userimagedialog = new UserImageDialog();
        if (!TextUtils.isEmpty(s))
        {
            Bundle bundle = new Bundle();
            bundle.putString("com.pinterest.EXTRA_USER_ID", s);
            userimagedialog.setArguments(bundle);
        }
        return userimagedialog;
    }

    public void onCreate(Bundle bundle)
    {
        Object obj;
        Object obj1;
        super.onCreate(bundle);
        obj = getArguments();
        obj1 = null;
        if (obj == null || ((Bundle) (obj)).getString("com.pinterest.EXTRA_USER_ID") == null) goto _L2; else goto _L1
_L1:
        obj = ((Bundle) (obj)).getString("com.pinterest.EXTRA_USER_ID");
_L4:
        _user = ModelHelper.getUser(((String) (obj)));
        bundle = new UserImageView(getContext());
        bundle.setUser(_user);
        setContent(bundle, 0);
        return;
_L2:
        obj = obj1;
        if (bundle != null)
        {
            obj = obj1;
            if (bundle.getString("com.pinterest.EXTRA_USER_ID") != null)
            {
                obj = bundle.getString("com.pinterest.EXTRA_USER_ID");
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (_user != null)
        {
            bundle.putString("com.pinterest.EXTRA_USER_ID", _user.getUid());
        }
    }

    public void onStart()
    {
        super.onStart();
        Events.register(_eventsSubscriber, com/pinterest/api/model/User$UpdateEvent, new Class[0]);
    }

    public void onStop()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/api/model/User$UpdateEvent
        });
        super.onStop();
    }


    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final UserImageDialog this$0;

        public void onEventMainThread(com.pinterest.api.model.User.UpdateEvent updateevent)
        {
            updateevent = updateevent.getUser();
            if (updateevent == null || _user != null && !_user.equals(updateevent))
            {
                return;
            } else
            {
                dismissAllowingStateLoss();
                return;
            }
        }

        _cls1()
        {
            this$0 = UserImageDialog.this;
            super();
        }
    }

}
