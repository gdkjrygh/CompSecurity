// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import android.app.Activity;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Interest;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.schemas.event.EventType;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.user.dialog:
//            AddInterestView

public class AddInterestDialog extends BaseDialog
{

    private AddInterestView _interestView;
    private android.widget.AdapterView.OnItemClickListener onItemClick;

    public AddInterestDialog()
    {
        onItemClick = new _cls1();
    }

    private void followInterest(Interest interest)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("interest", interest.getUrlName());
        Pinalytics.a(EventType.INTEREST_FOLLOW, null, null, hashmap);
        InterestsApi.a(interest, true, null, null, null, new _cls2(interest), null);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        _interestView = new AddInterestView(getContext());
        _interestView.setOnItemClickListener(onItemClick);
        setContent(_interestView, 0);
    }

    public void onDetach()
    {
        _interestView = null;
        super.onDetach();
    }



    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final AddInterestDialog this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (_interestView != null)
            {
                if ((adapterview = _interestView.getAdapter()) != null && (adapterview = adapterview.getItem(i)) != null)
                {
                    followInterest(adapterview);
                    return;
                }
            }
        }

        _cls1()
        {
            this$0 = AddInterestDialog.this;
            super();
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final AddInterestDialog this$0;
        final Interest val$interest;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            ModelHelper.setInterest(interest);
            Events.post(new com.pinterest.api.model.Interest.UpdateEvent(interest, Boolean.valueOf(true)));
            Events.post(new com.pinterest.activity.user.fragment.UserFollowedInterestsFragment.UpdateEvent());
        }

        _cls2(Interest interest1)
        {
            this$0 = AddInterestDialog.this;
            interest = interest1;
            super(final_flag);
        }
    }

}
