// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.address;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.locator.BuildingResult;
import com.dominos.android.sdk.common.dom.locator.RegionResult;
import com.dominos.android.sdk.common.dom.locator.SiteResult;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.storelocator.CampusLocatorManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AddressFormValidation;
import com.dominos.utils.AddressType;
import com.dominos.utils.AlertType;
import com.dominos.views.DominosArrayAdapter;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.dominos.fragments.address:
//            AddressBaseFragment

public class AddressCampusBaseFragment extends AddressBaseFragment
    implements android.widget.AdapterView.OnItemSelectedListener
{

    private DominosArrayAdapter mBuildingsAdapter;
    private ArrayList mBuildingsList;
    Spinner mCampusBaseSpinner;
    private CampusLocatorManager mCampusLocatorManger;
    private Context mContext;
    EditText mDeliveryInstEntry;
    Spinner mDormBuildingSpinner;
    private ArrayList mRegionsList;
    EditText mRoomEntry;
    private DominosArrayAdapter mSitesAdapter;
    private ArrayList mSitesList;
    Spinner mStateSpinner;
    private DominosArrayAdapter mStatesAdapter;

    public AddressCampusBaseFragment()
    {
    }

    private void showSpinnerDummyText()
    {
        mRegionsList = new ArrayList();
        mRegionsList.add(new com.dominos.android.sdk.common.dom.locator.RegionResult.Region("-1", getString(0x7f0802a0)));
        mStatesAdapter = new DominosArrayAdapter(mContext, 0x1090008, mRegionsList, 0x106000c);
        mStatesAdapter.setDropDownViewResource(0x1090009);
        mStateSpinner.setAdapter(mStatesAdapter);
        mSitesList = new ArrayList();
        mSitesList.add(new com.dominos.android.sdk.common.dom.locator.SiteResult.Site(-1, getString(0x7f08029d)));
        mSitesAdapter = new DominosArrayAdapter(mContext, 0x1090008, mSitesList, 0x106000c);
        mSitesAdapter.setDropDownViewResource(0x1090009);
        mCampusBaseSpinner.setAdapter(mSitesAdapter);
        mBuildingsList = new ArrayList();
        mBuildingsList.add(new com.dominos.android.sdk.common.dom.locator.BuildingResult.Building(-1, getString(0x7f08029e)));
        mBuildingsAdapter = new DominosArrayAdapter(mContext, 0x1090008, mBuildingsList, 0x106000c);
        mBuildingsAdapter.setDropDownViewResource(0x1090009);
        mDormBuildingSpinner.setAdapter(mBuildingsAdapter);
    }

    protected void afterView()
    {
        mContext = getActivity();
        showSpinnerDummyText();
        mStateSpinner.setOnItemSelectedListener(this);
        mCampusBaseSpinner.setOnItemSelectedListener(this);
        mDormBuildingSpinner.setOnItemSelectedListener(this);
        mCampusLocatorManger.getRegions(new CampusLocatorCallback(null));
        FontManager.applyDominosFont(this);
        mRoomEntry.setOnTouchListener(new _cls1());
    }

    public void clearAddressForm()
    {
        mStateSpinner.setSelection(0);
        mCampusBaseSpinner.setSelection(0);
        mDormBuildingSpinner.setSelection(0);
        mRoomEntry.setText("");
        mDeliveryInstEntry.setText("");
    }

    public void fillAddressFrom(LabsAddress labsaddress)
    {
    }

    public LabsAddress getFormObject()
    {
        com.dominos.android.sdk.common.dom.locator.RegionResult.Region region = (com.dominos.android.sdk.common.dom.locator.RegionResult.Region)mStateSpinner.getSelectedItem();
        com.dominos.android.sdk.common.dom.locator.SiteResult.Site site = (com.dominos.android.sdk.common.dom.locator.SiteResult.Site)mCampusBaseSpinner.getSelectedItem();
        com.dominos.android.sdk.common.dom.locator.BuildingResult.Building building = (com.dominos.android.sdk.common.dom.locator.BuildingResult.Building)mDormBuildingSpinner.getSelectedItem();
        LabsAddress labsaddress = new LabsAddress();
        labsaddress.setRegion(region.getCode());
        labsaddress.setOrganizationName(site.getSiteName());
        labsaddress.setLine3(building.getBuildingName());
        labsaddress.setCampusId(String.valueOf(site.getSiteId()));
        labsaddress.setLine2(building.getBuildingName());
        labsaddress.setBuildingId(String.valueOf(building.getBuildingId()));
        labsaddress.setUnitNumber(mRoomEntry.getText().toString().trim());
        labsaddress.setDeliveryInstructions(mDeliveryInstEntry.getText().toString().trim());
        labsaddress.setAddressType(AddressType.TYPE_CAMPUS_BASE.getId());
        return labsaddress;
    }

    public volatile Object getFormObject()
    {
        return getFormObject();
    }

    void onAfterInject()
    {
        mCampusLocatorManger = (CampusLocatorManager)mMobileSession.getManager("campus_locator_manager");
    }

    protected void onGetBuildingCompleted(BuildingResult buildingresult)
    {
        if (buildingresult != null)
        {
            mBuildingsList.clear();
            mBuildingsList.add(new com.dominos.android.sdk.common.dom.locator.BuildingResult.Building(-1, getString(0x7f08029e)));
            mBuildingsList.addAll(buildingresult.getBuildings());
            mBuildingsAdapter.notifyDataSetChanged();
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.NETWORK_ERROR);
            mCampusBaseSpinner.setSelection(0);
            return;
        }
    }

    protected void onGetRegionCompleted(RegionResult regionresult)
    {
        if (regionresult != null)
        {
            mRegionsList.clear();
            mRegionsList.add(new com.dominos.android.sdk.common.dom.locator.RegionResult.Region("-1", getString(0x7f0802a0)));
            mRegionsList.addAll(regionresult.getRegions());
            mStatesAdapter.notifyDataSetChanged();
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.NETWORK_ERROR);
            return;
        }
    }

    protected void onGetSitesCompleted(SiteResult siteresult)
    {
        if (siteresult != null)
        {
            mSitesList.clear();
            mSitesList.add(new com.dominos.android.sdk.common.dom.locator.SiteResult.Site(-1, getString(0x7f08029d)));
            mSitesList.addAll(siteresult.getSites());
            mSitesAdapter.notifyDataSetChanged();
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.NETWORK_ERROR);
            mStateSpinner.setSelection(0);
            return;
        }
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (adapterview.getId() != 0x7f0f021f) goto _L2; else goto _L1
_L1:
        view = (com.dominos.android.sdk.common.dom.locator.RegionResult.Region)adapterview.getItemAtPosition(i);
        if (adapterview.getSelectedItemPosition() > 0)
        {
            mCampusBaseSpinner.setSelection(0);
            mDormBuildingSpinner.setSelection(0);
            mRoomEntry.setCursorVisible(false);
            mCampusLocatorManger.getSites(view.getCode(), new CampusLocatorCallback(null));
        }
_L4:
        return;
_L2:
        if (adapterview.getId() != 0x7f0f0222)
        {
            continue; /* Loop/switch isn't completed */
        }
        view = (com.dominos.android.sdk.common.dom.locator.SiteResult.Site)adapterview.getItemAtPosition(i);
        if (adapterview.getSelectedItemPosition() <= 0) goto _L4; else goto _L3
_L3:
        mDormBuildingSpinner.setSelection(0);
        mRoomEntry.setCursorVisible(false);
        mCampusLocatorManger.getBuilding(view.getSiteId(), new CampusLocatorCallback(null));
        return;
        if (adapterview.getId() != 0x7f0f0225 || adapterview.getSelectedItemPosition() <= 0) goto _L4; else goto _L5
_L5:
        mRoomEntry.setCursorVisible(true);
        mRoomEntry.setFocusable(true);
        return;
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    public List validate()
    {
        ArrayList arraylist = new ArrayList();
        int i = mStateSpinner.getSelectedItemPosition();
        int j = mCampusBaseSpinner.getSelectedItemPosition();
        int k = mDormBuildingSpinner.getSelectedItemPosition();
        if (i <= 0)
        {
            arraylist.add(AddressFormValidation.EMPTY_STATE);
        }
        if (j <= 0)
        {
            arraylist.add(AddressFormValidation.CAMPUS_BASE);
        }
        if (k <= 0)
        {
            arraylist.add(AddressFormValidation.DORM_BUILDING);
        }
        if (StringHelper.isEmpty(mRoomEntry.getText().toString()))
        {
            arraylist.add(AddressFormValidation.EMPTY_ROOM);
        }
        return arraylist;
    }



    private class CampusLocatorCallback extends com.dominos.android.sdk.core.storelocator.CampusLocatorManager.GetCampusLocationCallback
    {

        final AddressCampusBaseFragment this$0;

        public void onBegin()
        {
            showLoading();
        }

        public void onError()
        {
        }

        public void onFinish()
        {
            hideLoading();
        }

        public void onGetBuildingsFound(BuildingResult buildingresult)
        {
            onGetBuildingCompleted(buildingresult);
        }

        public void onGetRegionsFound(RegionResult regionresult)
        {
            onGetRegionCompleted(regionresult);
        }

        public void onGetSavedCampusLocationFound(RegionResult regionresult, SiteResult siteresult, BuildingResult buildingresult)
        {
        }

        public void onGetSitesFound(SiteResult siteresult)
        {
            onGetSitesCompleted(siteresult);
        }

        private CampusLocatorCallback()
        {
            this$0 = AddressCampusBaseFragment.this;
            super();
        }

        CampusLocatorCallback(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1
        implements android.view.View.OnTouchListener
    {

        final AddressCampusBaseFragment this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            mRoomEntry.setCursorVisible(true);
            return false;
        }

        _cls1()
        {
            this$0 = AddressCampusBaseFragment.this;
            super();
        }
    }

}
