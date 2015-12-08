// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.phunware.nbc.sochi.system.NBCSystem;
import com.urbanairship.push.PushManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            NationalAlertsWizardFragment3

public class SochiAlertSettingsFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private List mAlertOptions;
    private Set mCurrentTags;
    private ProgressBar mProgressBar;
    private final List mTags = new ArrayList();

    public SochiAlertSettingsFragment()
    {
    }

    public static SochiAlertSettingsFragment getInstance()
    {
        return new SochiAlertSettingsFragment();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setRetainInstance(true);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnLoader(getActivity());
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        menuinflater.inflate(0x7f100001, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04009b, viewgroup, false);
        mCurrentTags = PushManager.shared().getTags();
        mTags.clear();
        mTags.addAll(mCurrentTags);
        mProgressBar = (ProgressBar)layoutinflater.findViewById(0x7f0f01d4);
        if (mTags == null || mTags.isEmpty())
        {
            NBCSystem.debugLog(com/phunware/nbc/sochi/fragments/SochiAlertSettingsFragment.getSimpleName(), "Tag is null or empty");
        }
        for (viewgroup = mTags.iterator(); viewgroup.hasNext(); NBCSystem.debugLog(com/phunware/nbc/sochi/fragments/SochiAlertSettingsFragment.getSimpleName(), (new StringBuilder()).append("Tag ").append(bundle).toString()))
        {
            bundle = (String)viewgroup.next();
        }

        getLoaderManager().restartLoader(0, null, this).forceLoad();
        return layoutinflater;
    }

    public void onLoadFinished(Loader loader, air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.DataContainer datacontainer)
    {
        mAlertOptions = datacontainer.alertOptions;
        getActivity().runOnUiThread(new Runnable() {

            final SochiAlertSettingsFragment this$0;

            public void run()
            {
                mProgressBar.setVisibility(8);
            }

            
            {
                this$0 = SochiAlertSettingsFragment.this;
                super();
            }
        });
        getChildFragmentManager().beginTransaction().replace(0x7f0f01d5, NationalAlertsWizardFragment3.newInstance(null, mAlertOptions, new ArrayList(), true, true), "NATIONAL_ALERTS").addToBackStack(null).commit();
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.DataContainer)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131689982: 
            startActivity(new Intent(getActivity(), air/com/nbcuni/com/nbcsports/liveextra/NationalAlertsWizardActivity));
            break;
        }
        return true;
    }

}
