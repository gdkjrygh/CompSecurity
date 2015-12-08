// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ListView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.thetransitapp.droid.model.Feed;
import com.thetransitapp.droid.service.LegalNoticeTask;
import com.thetransitapp.droid.service.ServiceCallback;
import com.thetransitapp.droid.widget.LegalAdapter;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid:
//            BaseMapScreen

public class LegalScreen extends BaseMapScreen
    implements ServiceCallback
{

    private LegalAdapter adapter;
    private ListView legalItems;

    public LegalScreen()
    {
        super(TransitActivity.TransitScreen.LEGAL_SCREEN);
    }

    public void onError(String s, Exception exception)
    {
    }

    public volatile void onResult(Object obj)
    {
        onResult((List)obj);
    }

    public void onResult(List list)
    {
        adapter.clear();
        adapter.addAll(list);
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(super.getActivity()) == 0)
        {
            list = new Feed();
            list.setName("Google Play Services");
            list.setCode("play");
            list.setLicence(super.getActivity().getString(0x7f0a008f));
            adapter.add(list);
        }
    }

    public void onStart()
    {
        super.onStart();
        android.location.Location location = getLastLocation();
        if (location != null)
        {
            (new LegalNoticeTask(getActivity(), location, this)).execute();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        adapter = new LegalAdapter(view.getContext());
        adapter.setActivity(super.getActivity());
        legalItems.setAdapter(adapter);
    }
}
