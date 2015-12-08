// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.AddressUtil;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.locator.BuildingResult;
import com.dominos.android.sdk.common.dom.locator.RegionResult;
import com.dominos.android.sdk.common.dom.locator.SiteResult;
import com.dominos.android.sdk.common.dom.useraccounts.States;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.storelocator.CampusLocatorManager;
import com.dominos.android.sdk.core.storelocator.StoreLocatorManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.controllers.utils.ControllerLocator;
import com.dominos.inputfilters.NoNumberInputFilter;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AddressType;
import com.dominos.utils.AlertType;
import com.dominos.views.DominosArrayAdapter;
import com.dominos.views.LocationTypeAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.a.a.a.o;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, CartActivity_

public class UserAddLocation extends BaseActivity
    implements android.view.View.OnTouchListener, android.widget.AdapterView.OnItemSelectedListener
{

    public static final String EXTRA_EDIT_ADD = "edit_add";
    public static final String EXTRA_LOCATION_INDEX = "locationIndex";
    private LabsAddress address;
    private EditText aptEntry;
    private TextView aptLabel;
    private TextView aptText;
    private EditText buildingEntry;
    private TextView buildingLabel;
    private TextView buildingText;
    private Button carryoutButton;
    private EditText cityEntry;
    private TextView cityText;
    private Button deliveryButton;
    private EditText deliveryInstructionsEntry;
    private TextView deliveryInstructionsLabel;
    private Button editButton;
    private int locationIndex;
    private LocationTypeAdapter mAdapter;
    private RelativeLayout mAptRow;
    RelativeLayout mBuildingContainerLayout;
    private RelativeLayout mBuildingRow;
    private Spinner mBuildingSelectorSpinner;
    private TextView mCampusBuilding;
    private TextView mCampusLocation;
    private CampusLocatorManager mCampusLocatorManger;
    private TextView mCampusState;
    private TextView mCampusUnitLabel;
    private RelativeLayout mCityRow;
    ControllerLocator mControllerLocator;
    boolean mLoadUnitNumber;
    RelativeLayout mLocationContainerLayout;
    private Spinner mLocationSelectorSpinner;
    boolean mLockedBuilding;
    boolean mLockedLocation;
    boolean mLockedState;
    RelativeLayout mRegionContainerLayout;
    private RelativeLayout mStateRow;
    private Spinner mStateSelectorSpinner;
    boolean mStillLoadingSavedData;
    private StoreLocatorManager mStoreLocatorManager;
    private RelativeLayout mStreetRow;
    RelativeLayout mUnitContainerLayout;
    private TextView mUnitLabel;
    private EditText mUnitSelector;
    private RelativeLayout mZipRow;
    private EditText nameEntry;
    private TextView nameText;
    private String selectedState;
    private String selectedTypeId;
    private String selectedTypeName;
    private ArrayList stateList;
    private Spinner stateSelector;
    private TextView stateText;
    private EditText streetEntry;
    private TextView streetText;
    private Button topButton;
    private Spinner typeSelector;
    private TextView typeText;
    private EditText zipEntry;
    private TextView zipText;

    public UserAddLocation()
    {
        locationIndex = -1;
        selectedState = "";
        mLockedBuilding = true;
        mStillLoadingSavedData = true;
    }

    private String capitalizeWord(String s)
    {
        if (s == null || s.length() == 0)
        {
            return "";
        }
        if (s.length() == 1)
        {
            return s.toUpperCase();
        } else
        {
            return (new StringBuilder()).append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).toString();
        }
    }

    private boolean checkDataFields()
    {
        Object obj;
        StringBuilder stringbuilder;
        boolean flag;
        flag = true;
        obj = new ArrayList();
        stringbuilder = new StringBuilder();
        if (!selectedTypeName.equalsIgnoreCase(AddressType.TYPE_CAMPUS_BASE.getName())) goto _L2; else goto _L1
_L1:
        int i = mStateSelectorSpinner.getSelectedItemPosition();
        int j = mLocationSelectorSpinner.getSelectedItemPosition();
        int k = mBuildingSelectorSpinner.getSelectedItemPosition();
        if (i <= 0)
        {
            stringbuilder.append(getString(0x7f080278));
        }
        if (j <= 0 && mLocationContainerLayout.getVisibility() == 0)
        {
            stringbuilder.append(getString(0x7f080274));
        }
        if (k <= 0 && mBuildingContainerLayout.getVisibility() == 0)
        {
            stringbuilder.append(getString(0x7f080276));
        }
        if (StringHelper.isEmpty(mUnitSelector.getText().toString()) && mUnitContainerLayout.getVisibility() == 0)
        {
            stringbuilder.append(getString(0x7f080277));
        }
_L4:
        if (stringbuilder.toString().length() > 0)
        {
            mActivityHelper.showAlert(AlertType.MISSING_FIELDS_USER_INFO, stringbuilder.toString(), null);
            if (((ArrayList) (obj)).size() > 0 && (((ArrayList) (obj)).get(0) instanceof EditText))
            {
                obj = (EditText)((ArrayList) (obj)).get(0);
                ((EditText) (obj)).requestFocus();
                ((InputMethodManager)getSystemService("input_method")).showSoftInput(((View) (obj)), 2);
            }
            flag = false;
        }
        return flag;
_L2:
        if (streetEntry.getText().toString().trim().length() == 0)
        {
            stringbuilder.append(getString(0x7f080279));
            ((ArrayList) (obj)).add(streetEntry);
        }
        if ((selectedTypeName.equalsIgnoreCase(AddressType.TYPE_HOTEL.getName()) || selectedTypeName.equalsIgnoreCase(AddressType.TYPE_DORMITORY.getName())) && aptEntry.getText().toString().trim().length() == 0)
        {
            stringbuilder.append(getString(0x7f080277));
            ((ArrayList) (obj)).add(aptEntry);
        }
        if (selectedTypeName.equalsIgnoreCase(AddressType.TYPE_APARTMENT.getName()) && aptEntry.getText().toString().trim().length() == 0)
        {
            stringbuilder.append(getString(0x7f08027a));
            ((ArrayList) (obj)).add(aptEntry);
        }
        if (cityEntry.getText().toString().trim().length() == 0)
        {
            stringbuilder.append(getString(0x7f080275));
            ((ArrayList) (obj)).add(cityEntry);
        }
        if (stateSelector.getSelectedItemPosition() <= 0)
        {
            stringbuilder.append(getString(0x7f080278));
            ((ArrayList) (obj)).add(stateSelector);
        }
        if (StringHelper.isEmpty(zipEntry.getText().toString()))
        {
            stringbuilder.append(getString(0x7f08027b));
            ((ArrayList) (obj)).add(zipEntry);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void displayEditor()
    {
        initViews();
        fillEntries();
        setOptionalEntryHints();
    }

    private void displayLocation()
    {
        initDisplayViews();
        fillLocationData();
        setOptionalLabels();
    }

    private void fillEntries()
    {
label0:
        {
            if (locationIndex >= 0)
            {
                address = (LabsAddress)mProfileManager.getCurrentUser().getAddressList().get(locationIndex);
                AddressType addresstype = AddressType.getAddressType(address.getAddressType());
                int i = mAdapter.getIndexOfItem(addresstype);
                typeSelector.setSelection(i);
                nameEntry.setText(address.getName());
                deliveryInstructionsEntry.setText(address.getDeliveryInstructions());
                boolean flag = StringHelper.equalsIgnoreCase(addresstype.getId(), AddressType.TYPE_CAMPUS_BASE.getId());
                mStillLoadingSavedData = true;
                setVisiblity(flag);
                if (!StringHelper.equalsIgnoreCase(addresstype.getId(), AddressType.TYPE_CAMPUS_BASE.getId()))
                {
                    break label0;
                }
                mCampusLocatorManger.getSavedCampusLoction(address, new CampusLocatorCallback(null));
            }
            return;
        }
        streetEntry.setText(address.getStreet());
        cityEntry.setText(address.getCity());
        zipEntry.setText(NumberUtil.formatPostalCode(address.getPostalCode()));
        buildingEntry.setText(address.getOrganizationName());
        aptEntry.setText(address.getUnitNumber());
        int k = stateList.indexOf(address.getRegion());
        int j = k;
        if (k == -1)
        {
            String s = (String)States.getFiftyStatesFullNameMap().get(address.getRegion());
            j = stateList.indexOf(s);
        }
        stateSelector.setSelection(j);
        nameEntry.selectAll();
    }

    private void fillLocationData()
    {
        address = (LabsAddress)mProfileManager.getCurrentUser().getAddressList().get(locationIndex);
        setSpecialRowVisibility(address);
        setTitle(address.getName());
        nameText.setText(address.getName());
        AddressType addresstype = AddressType.getAddressType(address.getAddressType());
        typeText.setText(o.a(addresstype.getName()));
        String s = address.getRegion();
        if (s.length() < 3)
        {
            String s1 = (String)States.getFiftyStatesFullNameMap().get(s);
            if (s1 != null)
            {
                s = s1;
            }
        }
        boolean flag = StringHelper.equalsIgnoreCase(addresstype.getId(), AddressType.TYPE_CAMPUS_BASE.getId());
        mStillLoadingSavedData = false;
        setVisiblity(flag);
        if (flag)
        {
            mCampusState.setText(s);
            mCampusLocation.setText(address.getOrganizationName());
            mCampusBuilding.setText(address.getLine3());
            mCampusUnitLabel.setText(address.getUnitNumber());
        } else
        {
            streetText.setText(address.getStreet());
            cityText.setText(address.getCity());
            stateText.setText(s);
            zipText.setText(address.getPostalCode());
            if (address.getOrganizationName().length() > 0)
            {
                buildingText.setText(address.getOrganizationName());
            } else
            {
                mBuildingRow.setVisibility(8);
            }
            if (address.getUnitNumber().length() > 0)
            {
                aptText.setText(address.getUnitNumber());
            } else
            {
                mAptRow.setVisibility(8);
            }
        }
        deliveryInstructionsLabel.setText(address.getDeliveryInstructions());
    }

    private void initDisplayViews()
    {
        setContentView(0x7f0300bd);
        mCampusState = (TextView)findViewById(0x7f0f03ff);
        mCampusLocation = (TextView)findViewById(0x7f0f0400);
        mCampusBuilding = (TextView)findViewById(0x7f0f0402);
        mCampusUnitLabel = (TextView)findViewById(0x7f0f03da);
        mBuildingRow = (RelativeLayout)findViewById(0x7f0f03db);
        mRegionContainerLayout = (RelativeLayout)findViewById(0x7f0f03d0);
        mLocationContainerLayout = (RelativeLayout)findViewById(0x7f0f03d3);
        mBuildingContainerLayout = (RelativeLayout)findViewById(0x7f0f03d6);
        mUnitContainerLayout = (RelativeLayout)findViewById(0x7f0f03d9);
        mAptRow = (RelativeLayout)findViewById(0x7f0f03e1);
        mStateRow = (RelativeLayout)findViewById(0x7f0f03e7);
        mZipRow = (RelativeLayout)findViewById(0x7f0f03eb);
        mCityRow = (RelativeLayout)findViewById(0x7f0f03e4);
        mStreetRow = (RelativeLayout)findViewById(0x7f0f03de);
        nameText = (TextView)findViewById(0x7f0f03fd);
        typeText = (TextView)findViewById(0x7f0f03fc);
        buildingText = (TextView)findViewById(0x7f0f03d7);
        buildingLabel = (TextView)findViewById(0x7f0f03dc);
        streetText = (TextView)findViewById(0x7f0f0403);
        aptText = (TextView)findViewById(0x7f0f0404);
        aptLabel = (TextView)findViewById(0x7f0f03e2);
        cityText = (TextView)findViewById(0x7f0f0405);
        stateText = (TextView)findViewById(0x7f0f03d1);
        zipText = (TextView)findViewById(0x7f0f0406);
        deliveryInstructionsLabel = (TextView)findViewById(0x7f0f0407);
        deliveryButton = (Button)findViewById(0x7f0f030c);
        carryoutButton = (Button)findViewById(0x7f0f030d);
        editButton = (Button)findViewById(0x7f0f03bd);
        editButton.setVisibility(0);
        editButton.setText(getString(0x7f08010d));
        setUpDisplayListeners();
    }

    private void initViews()
    {
        setContentView(0x7f0300ba);
        if (locationIndex < 0)
        {
            setTitle(getString(0x7f080339));
        } else
        {
            setTitle(getString(0x7f08033b));
        }
        mStillLoadingSavedData = true;
        mStateSelectorSpinner = (Spinner)findViewById(0x7f0f03d2);
        mLocationSelectorSpinner = (Spinner)findViewById(0x7f0f03d5);
        mBuildingSelectorSpinner = (Spinner)findViewById(0x7f0f03d8);
        mUnitSelector = (EditText)findViewById(0x7f0f03da);
        mRegionContainerLayout = (RelativeLayout)findViewById(0x7f0f03d0);
        mLocationContainerLayout = (RelativeLayout)findViewById(0x7f0f03d3);
        mBuildingContainerLayout = (RelativeLayout)findViewById(0x7f0f03d6);
        mUnitContainerLayout = (RelativeLayout)findViewById(0x7f0f03d9);
        typeSelector = (Spinner)findViewById(0x7f0f03cc);
        stateSelector = (Spinner)findViewById(0x7f0f03e9);
        nameEntry = (EditText)findViewById(0x7f0f03cf);
        buildingEntry = (EditText)findViewById(0x7f0f03dd);
        buildingLabel = (TextView)findViewById(0x7f0f03dc);
        streetEntry = (EditText)findViewById(0x7f0f03e0);
        aptEntry = (EditText)findViewById(0x7f0f03e3);
        aptLabel = (TextView)findViewById(0x7f0f03e2);
        cityEntry = (EditText)findViewById(0x7f0f03e6);
        zipEntry = (EditText)findViewById(0x7f0f03ed);
        deliveryInstructionsEntry = (EditText)findViewById(0x7f0f03f0);
        topButton = (Button)findViewById(0x7f0f03bd);
        topButton.setVisibility(0);
        topButton.setText(getString(0x7f08028b));
        mBuildingRow = (RelativeLayout)findViewById(0x7f0f03db);
        mAptRow = (RelativeLayout)findViewById(0x7f0f03e1);
        mStateRow = (RelativeLayout)findViewById(0x7f0f03e7);
        mZipRow = (RelativeLayout)findViewById(0x7f0f03eb);
        mCityRow = (RelativeLayout)findViewById(0x7f0f03e4);
        mStreetRow = (RelativeLayout)findViewById(0x7f0f03de);
        mAdapter = new LocationTypeAdapter(this);
        setUpListeners();
    }

    private LabsAddress saveCampusAddress()
    {
        com.dominos.android.sdk.common.dom.locator.RegionResult.Region region = (com.dominos.android.sdk.common.dom.locator.RegionResult.Region)mStateSelectorSpinner.getSelectedItem();
        com.dominos.android.sdk.common.dom.locator.SiteResult.Site site = (com.dominos.android.sdk.common.dom.locator.SiteResult.Site)mLocationSelectorSpinner.getSelectedItem();
        com.dominos.android.sdk.common.dom.locator.BuildingResult.Building building = (com.dominos.android.sdk.common.dom.locator.BuildingResult.Building)mBuildingSelectorSpinner.getSelectedItem();
        String s = ((EditText)findViewById(0x7f0f03da)).getText().toString();
        LabsAddress labsaddress = new LabsAddress();
        labsaddress.setAddressType(AddressType.TYPE_CAMPUS_BASE.getId());
        labsaddress.setName(nameEntry.getText().toString().trim());
        labsaddress.setBuildingId(String.valueOf(building.getBuildingId()));
        labsaddress.setCampusId(String.valueOf(site.getSiteId()));
        labsaddress.setRegion(region.getCode());
        labsaddress.setLine3(site.getSiteName());
        labsaddress.setLine2(building.getBuildingName());
        labsaddress.setOrganizationName(site.getSiteName());
        labsaddress.setUnitNumber(s);
        labsaddress.setDeliveryInstructions(deliveryInstructionsEntry.getText().toString());
        return labsaddress;
    }

    private void saveCustomer(LabsAddress labsaddress, LabsAddress labsaddress1)
    {
        String s;
        byte byte0;
        s = labsaddress.getAddressType();
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 2011093247 2011093247: default 32
    //                   2011093247 76;
           goto _L1 _L2
_L1:
        byte0;
        JVM INSTR tableswitch 0 0: default 52
    //                   0 92;
           goto _L3 _L4
_L3:
        mProfileManager.modifyAddress(locationIndex, labsaddress, false, new SaveAddressCallback(labsaddress, null));
        return;
_L2:
        if (s.equals("Campus"))
        {
            byte0 = 0;
        }
          goto _L1
_L4:
        labsaddress = AddressUtil.getProfileCampusAddress(labsaddress, labsaddress1);
          goto _L3
    }

    private void setOptionalEntryHints()
    {
        AddressType addresstype = (AddressType)typeSelector.getSelectedItem();
        String s = addresstype.getId();
        buildingLabel.setText((new StringBuilder()).append(capitalizeWord(addresstype.toString())).append(" ").append(getString(0x7f0801d0)).toString());
        setUnitCopy(s);
        if (selectedTypeName.equalsIgnoreCase(AddressType.TYPE_OTHER.getName()))
        {
            mBuildingRow.setVisibility(8);
        }
        if (selectedTypeName.equalsIgnoreCase(AddressType.TYPE_HOUSE.getName()) || selectedTypeName.equalsIgnoreCase(AddressType.TYPE_BUSINESS.getName()) || selectedTypeName.equalsIgnoreCase(AddressType.TYPE_OTHER.getName()))
        {
            aptEntry.setHint(getString(0x7f0801f9));
        } else
        if (selectedTypeName.equalsIgnoreCase(AddressType.TYPE_HOTEL.getName()) || selectedTypeName.equalsIgnoreCase(AddressType.TYPE_APARTMENT.getName()) || selectedTypeName.equalsIgnoreCase(AddressType.TYPE_DORMITORY.getName()))
        {
            aptEntry.setHint(capitalizeWord(getString(0x7f08013d)));
            return;
        }
    }

    private void setOptionalLabels()
    {
        String s = address.getAddressType();
        buildingLabel.setText((new StringBuilder()).append(capitalizeWord(s)).append(" ").append(getString(0x7f0801d0)).toString());
        setUnitCopy(s);
    }

    private void setSpecialRowVisibility(LabsAddress labsaddress)
    {
        if (labsaddress != null && labsaddress.getAddressType() != null && (labsaddress.getAddressType().equalsIgnoreCase(AddressType.TYPE_HOUSE.getId()) || labsaddress.getAddressType().equalsIgnoreCase(AddressType.TYPE_OTHER.getId()) || StringHelper.equalsIgnoreCase(labsaddress.getAddressType(), AddressType.TYPE_CAMPUS_BASE.getId())))
        {
            mBuildingRow.setVisibility(8);
        }
    }

    private void setSpecialRowVisibility(boolean flag, int i)
    {
        byte byte0 = 8;
        RelativeLayout relativelayout = mAptRow;
        int j;
        if (flag)
        {
            j = 8;
        } else
        {
            j = i;
        }
        relativelayout.setVisibility(j);
        relativelayout = mBuildingRow;
        if (flag)
        {
            i = byte0;
        }
        relativelayout.setVisibility(i);
    }

    private void setUnitCopy(String s)
    {
        int i = AddressType.getUnitCopy(s);
        aptLabel.setText(getString(i));
    }

    private void setUpDisplayListeners()
    {
        deliveryButton.setOnClickListener(new _cls7());
        carryoutButton.setOnClickListener(new _cls8());
        editButton.setOnClickListener(new _cls9());
    }

    private void setUpListeners()
    {
        typeSelector.setAdapter(mAdapter);
        typeSelector.setOnItemSelectedListener(new _cls1());
        Object obj = new NoNumberInputFilter(this);
        cityEntry.setFilters(new InputFilter[] {
            obj
        });
        cityEntry.setOnEditorActionListener(new _cls2());
        deliveryInstructionsEntry.setOnEditorActionListener(new _cls3());
        stateList = new ArrayList(Arrays.asList(States.getStateNameArray()));
        stateList.add(0, getString(0x7f0802a0));
        obj = new DominosArrayAdapter(this, 0x1090008, stateList, 0x106000c);
        ((DominosArrayAdapter) (obj)).setDropDownViewResource(0x1090009);
        stateSelector.setAdapter(((SpinnerAdapter) (obj)));
        stateSelector.setOnItemSelectedListener(new _cls4());
        topButton.setOnClickListener(new _cls5());
        mStateSelectorSpinner.setOnItemSelectedListener(this);
        mStateSelectorSpinner.setOnTouchListener(this);
        mLocationSelectorSpinner.setOnItemSelectedListener(this);
        mLocationSelectorSpinner.setOnTouchListener(this);
        mBuildingSelectorSpinner.setOnItemSelectedListener(this);
        mBuildingSelectorSpinner.setOnTouchListener(this);
        typeSelector.setOnTouchListener(this);
    }

    private void setVisiblity(boolean flag)
    {
        byte byte0 = 8;
        RelativeLayout relativelayout = mRegionContainerLayout;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        relativelayout.setVisibility(i);
        if (!mStillLoadingSavedData)
        {
            RelativeLayout relativelayout1 = mLocationContainerLayout;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            relativelayout1.setVisibility(i);
            relativelayout1 = mBuildingContainerLayout;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            relativelayout1.setVisibility(i);
            relativelayout1 = mUnitContainerLayout;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            relativelayout1.setVisibility(i);
        }
        relativelayout1 = mStreetRow;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        relativelayout1.setVisibility(i);
        relativelayout1 = mAptRow;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        relativelayout1.setVisibility(i);
        relativelayout1 = mCityRow;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        relativelayout1.setVisibility(i);
        relativelayout1 = mZipRow;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        relativelayout1.setVisibility(i);
        relativelayout1 = mStateRow;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        relativelayout1.setVisibility(i);
    }

    private void updateUiAfterSelection(int i)
    {
        i;
        JVM INSTR tableswitch 1 4: default 32
    //                   1 121
    //                   2 139
    //                   3 157
    //                   4 103;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_157;
_L6:
        if (mLockedState)
        {
            mLocationContainerLayout.setVisibility(0);
        } else
        {
            mLocationContainerLayout.setVisibility(8);
        }
        if (mLockedLocation)
        {
            mBuildingContainerLayout.setVisibility(0);
        } else
        {
            mBuildingContainerLayout.setVisibility(8);
        }
        if (mLockedBuilding)
        {
            mUnitContainerLayout.setVisibility(0);
            EditText edittext = mUnitSelector;
            String s;
            if (mStillLoadingSavedData)
            {
                s = address.getUnitNumber();
            } else
            {
                s = "";
            }
            edittext.setText(s);
            return;
        } else
        {
            mUnitContainerLayout.setVisibility(8);
            return;
        }
_L5:
        mLockedState = false;
        mLockedLocation = false;
        mLockedBuilding = false;
          goto _L6
_L2:
        mLockedState = true;
        mLockedLocation = false;
        mLockedBuilding = false;
          goto _L6
_L3:
        mLockedState = true;
        mLockedLocation = true;
        mLockedBuilding = false;
          goto _L6
        mLockedState = true;
        mLockedLocation = true;
        mLockedBuilding = true;
          goto _L6
    }

    protected void checkDeliveryAddressStoreStatus(final LabsAddress deliveryAddress)
    {
        mStoreLocatorManager.locateClosestStore(deliveryAddress, new _cls6());
    }

    protected void fillSpinnersWithSavedData(RegionResult regionresult, SiteResult siteresult, BuildingResult buildingresult)
    {
        if (regionresult != null)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(new com.dominos.android.sdk.common.dom.locator.RegionResult.Region("-1", getString(0x7f0802a0)));
            arraylist.addAll(regionresult.getRegions());
            regionresult = new DominosArrayAdapter(this, 0x1090008, arraylist, 0x106000c);
            regionresult.setDropDownViewResource(0x1090009);
            mStateSelectorSpinner.setAdapter(regionresult);
            setRegionText(regionresult);
            if (siteresult != null)
            {
                regionresult = new ArrayList();
                regionresult.add(new com.dominos.android.sdk.common.dom.locator.SiteResult.Site(-1, getString(0x7f08029d)));
                regionresult.addAll(siteresult.getSites());
                regionresult = new DominosArrayAdapter(this, 0x1090008, regionresult, 0x106000c);
                regionresult.setDropDownViewResource(0x1090009);
                mLocationSelectorSpinner.setAdapter(regionresult);
                setSiteText(regionresult);
                if (buildingresult != null)
                {
                    regionresult = new ArrayList();
                    regionresult.add(new com.dominos.android.sdk.common.dom.locator.BuildingResult.Building(-1, getString(0x7f08029e)));
                    regionresult.addAll(buildingresult.getBuildings());
                    regionresult = new DominosArrayAdapter(this, 0x1090008, regionresult, 0x106000c);
                    regionresult.setDropDownViewResource(0x1090009);
                    mBuildingSelectorSpinner.setAdapter(regionresult);
                    setBuildingText(regionresult);
                }
            }
        }
    }

    protected void navigateToCart()
    {
        ((CartActivity_.IntentBuilder_)CartActivity_.intent(this).flags(0x4000000)).start();
        setResult(1);
        finish();
    }

    void onAfterInject()
    {
        mCampusLocatorManger = (CampusLocatorManager)mMobileSession.getManager("campus_locator_manager");
        mStoreLocatorManager = (StoreLocatorManager)mMobileSession.getManager("store_locator");
    }

    public void onClickContainer(View view)
    {
        int i = view.getId();
        mStillLoadingSavedData = false;
        if (i == 0x7f0f03d0)
        {
            mStateSelectorSpinner.performClick();
        } else
        {
            if (i == 0x7f0f03d3)
            {
                mLocationSelectorSpinner.performClick();
                return;
            }
            if (i == 0x7f0f03d6)
            {
                mBuildingSelectorSpinner.performClick();
                return;
            }
            if (i == 0x7f0f03d9)
            {
                mUnitContainerLayout.requestFocus();
                ((InputMethodManager)getSystemService("input_method")).showSoftInput(mUnitContainerLayout, 1);
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        locationIndex = getIntent().getIntExtra("locationIndex", -1);
        AddressType.resetForLangSwitch();
        selectedTypeName = AddressType.TYPE_HOUSE.getName();
        selectedTypeId = AddressType.TYPE_HOUSE.getId();
        if (getIntent().hasExtra("edit_add"))
        {
            displayEditor();
            return;
        } else
        {
            displayLocation();
            return;
        }
    }

    public void onGetBuildingCompleted(BuildingResult buildingresult)
    {
        if (buildingresult != null)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(new com.dominos.android.sdk.common.dom.locator.BuildingResult.Building(-1, getString(0x7f08029e)));
            arraylist.addAll(buildingresult.getBuildings());
            buildingresult = new DominosArrayAdapter(this, 0x1090008, arraylist, 0x106000c);
            buildingresult.setDropDownViewResource(0x1090009);
            mBuildingSelectorSpinner.setAdapter(buildingresult);
            updateUiAfterSelection(2);
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.NETWORK_ERROR);
            mLocationSelectorSpinner.setSelection(0);
            return;
        }
    }

    public void onGetRegionCompleted(RegionResult regionresult)
    {
        if (regionresult != null)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(new com.dominos.android.sdk.common.dom.locator.RegionResult.Region("-1", getString(0x7f0802a0)));
            arraylist.addAll(regionresult.getRegions());
            regionresult = new DominosArrayAdapter(this, 0x1090008, arraylist, 0x106000c);
            regionresult.setDropDownViewResource(0x1090009);
            mStateSelectorSpinner.setAdapter(regionresult);
            updateUiAfterSelection(5);
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.NETWORK_ERROR);
            return;
        }
    }

    public void onGetSitesCompleted(SiteResult siteresult)
    {
        if (siteresult != null)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(new com.dominos.android.sdk.common.dom.locator.SiteResult.Site(-1, getString(0x7f08029d)));
            arraylist.addAll(siteresult.getSites());
            siteresult = new DominosArrayAdapter(this, 0x1090008, arraylist, 0x106000c);
            siteresult.setDropDownViewResource(0x1090009);
            mLocationSelectorSpinner.setAdapter(siteresult);
            updateUiAfterSelection(1);
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.NETWORK_ERROR);
            mStateSelectorSpinner.setSelection(0);
            return;
        }
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (adapterview.getId() != 0x7f0f03d2) goto _L2; else goto _L1
_L1:
        adapterview = (com.dominos.android.sdk.common.dom.locator.RegionResult.Region)adapterview.getItemAtPosition(i);
        if (!adapterview.getCode().equals("-1")) goto _L4; else goto _L3
_L3:
        updateUiAfterSelection(4);
_L6:
        return;
_L4:
        mLocationContainerLayout.setVisibility(8);
        mBuildingContainerLayout.setVisibility(8);
        mUnitContainerLayout.setVisibility(8);
        updateUiAfterSelection(1);
        if (mStillLoadingSavedData) goto _L6; else goto _L5
_L5:
        mCampusLocatorManger.getSites(adapterview.getCode(), new CampusLocatorCallback(null));
        return;
_L2:
        if (adapterview.getId() != 0x7f0f03d5)
        {
            continue; /* Loop/switch isn't completed */
        }
        adapterview = (com.dominos.android.sdk.common.dom.locator.SiteResult.Site)adapterview.getItemAtPosition(i);
        if (adapterview.getSiteId() == -1)
        {
            updateUiAfterSelection(1);
            return;
        }
        mBuildingContainerLayout.setVisibility(8);
        mUnitContainerLayout.setVisibility(8);
        updateUiAfterSelection(2);
        if (mStillLoadingSavedData) goto _L6; else goto _L7
_L7:
        mCampusLocatorManger.getBuilding(adapterview.getSiteId(), new CampusLocatorCallback(null));
        return;
        if (adapterview.getId() != 0x7f0f03d8) goto _L6; else goto _L8
_L8:
        if (((com.dominos.android.sdk.common.dom.locator.BuildingResult.Building)adapterview.getItemAtPosition(i)).getBuildingId() == -1)
        {
            updateUiAfterSelection(2);
            return;
        } else
        {
            updateUiAfterSelection(3);
            return;
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    protected void onResume()
    {
        super.onResume();
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
    }

    protected void onStoreListActivityResult(int i)
    {
        if (i == 1)
        {
            setResult(1);
            finish();
        }
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            mStillLoadingSavedData = false;
        }
        return false;
    }

    protected void setBuildingText(SpinnerAdapter spinneradapter)
    {
        int i = 1;
        do
        {
label0:
            {
label1:
                {
                    if (i < spinneradapter.getCount())
                    {
                        com.dominos.android.sdk.common.dom.locator.BuildingResult.Building building;
                        if (spinneradapter.getItem(i) instanceof com.dominos.android.sdk.common.dom.locator.BuildingResult.Building)
                        {
                            building = (com.dominos.android.sdk.common.dom.locator.BuildingResult.Building)spinneradapter.getItem(i);
                        } else
                        {
                            building = null;
                        }
                        if (building == null)
                        {
                            break label0;
                        }
                        if (!StringHelper.equalsIgnoreCase(building.getBuildingName(), address.getLine3()))
                        {
                            break label1;
                        }
                        mLoadUnitNumber = true;
                        mBuildingSelectorSpinner.setSelection(i);
                    }
                    return;
                }
                mLoadUnitNumber = false;
            }
            i++;
        } while (true);
    }

    protected void setRegionText(SpinnerAdapter spinneradapter)
    {
        int i = 1;
        do
        {
label0:
            {
                if (i < spinneradapter.getCount())
                {
                    com.dominos.android.sdk.common.dom.locator.RegionResult.Region region;
                    if (spinneradapter.getItem(i) instanceof com.dominos.android.sdk.common.dom.locator.RegionResult.Region)
                    {
                        region = (com.dominos.android.sdk.common.dom.locator.RegionResult.Region)spinneradapter.getItem(i);
                    } else
                    {
                        region = null;
                    }
                    if (region == null || !StringHelper.equalsIgnoreCase(region.getCode(), address.getRegion()))
                    {
                        break label0;
                    }
                    mStateSelectorSpinner.setSelection(i);
                }
                return;
            }
            i++;
        } while (true);
    }

    protected void setSiteText(SpinnerAdapter spinneradapter)
    {
        int i = 1;
        do
        {
label0:
            {
                if (i < spinneradapter.getCount())
                {
                    com.dominos.android.sdk.common.dom.locator.SiteResult.Site site;
                    if (spinneradapter.getItem(i) instanceof com.dominos.android.sdk.common.dom.locator.SiteResult.Site)
                    {
                        site = (com.dominos.android.sdk.common.dom.locator.SiteResult.Site)spinneradapter.getItem(i);
                    } else
                    {
                        site = null;
                    }
                    if (site == null || !StringHelper.equalsIgnoreCase(site.getSiteName(), address.getOrganizationName()))
                    {
                        break label0;
                    }
                    mLocationSelectorSpinner.setSelection(i);
                }
                return;
            }
            i++;
        } while (true);
    }



/*
    static String access$102(UserAddLocation useraddlocation, String s)
    {
        useraddlocation.selectedTypeName = s;
        return s;
    }

*/



/*
    static String access$1102(UserAddLocation useraddlocation, String s)
    {
        useraddlocation.selectedState = s;
        return s;
    }

*/




/*
    static LabsAddress access$1302(UserAddLocation useraddlocation, LabsAddress labsaddress)
    {
        useraddlocation.address = labsaddress;
        return labsaddress;
    }

*/










/*
    static String access$202(UserAddLocation useraddlocation, String s)
    {
        useraddlocation.selectedTypeId = s;
        return s;
    }

*/










    private class CampusLocatorCallback extends com.dominos.android.sdk.core.storelocator.CampusLocatorManager.GetCampusLocationCallback
    {

        final UserAddLocation this$0;

        public void onBegin()
        {
            super.onBegin();
            showLoading();
        }

        public void onError()
        {
        }

        public void onFinish()
        {
            super.onFinish();
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
            fillSpinnersWithSavedData(regionresult, siteresult, buildingresult);
        }

        public void onGetSitesFound(SiteResult siteresult)
        {
            onGetSitesCompleted(siteresult);
        }

        private CampusLocatorCallback()
        {
            this$0 = UserAddLocation.this;
            super();
        }

        CampusLocatorCallback(_cls1 _pcls1)
        {
            this();
        }
    }


    private class SaveAddressCallback extends com.dominos.android.sdk.core.user.UserProfileManager.SaveAddressCallback
    {

        LabsAddress addressToSave;
        final UserAddLocation this$0;

        public void onAddressDuplicated()
        {
            mActivityHelper.showAlert(AlertType.ADDRESS_SAVE_TO_PROFILE_DUPLICATE, addressToSave.getName(), null);
        }

        public void onAddressSaveFailure()
        {
            mActivityHelper.showAlert(AlertType.ADDRESS_SAVE_TO_PROFILE_ERROR);
        }

        public void onAddressSaved()
        {
            hideLoading();
            int i;
            if (addressToSave.getName().length() > 0)
            {
                i = 0x7f080193;
            } else
            {
                i = 0x7f080396;
            }
            showLongToast(String.format(getString(i), new Object[] {
                addressToSave.getName()
            }));
            setResult(2);
            finish();
        }

        public void onBegin()
        {
            super.onBegin();
            showLoading();
        }

        public void onFinish()
        {
            super.onFinish();
            hideLoading();
        }

        private SaveAddressCallback(LabsAddress labsaddress)
        {
            this$0 = UserAddLocation.this;
            super();
            addressToSave = labsaddress;
        }

        SaveAddressCallback(LabsAddress labsaddress, _cls1 _pcls1)
        {
            this(labsaddress);
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final UserAddLocation this$0;

        public void onClick(View view)
        {
            mOrderManager.createOrderForDelivery(address, new DeliveryOrderCallback(null));
        }

        _cls7()
        {
            this$0 = UserAddLocation.this;
            super();
        }

        private class DeliveryOrderCallback extends com.dominos.android.sdk.core.order.OrderManager.CreateDeliveryOrderCallback
        {

            final UserAddLocation this$0;

            public void onAddressInvalid(com.dominos.android.sdk.core.storelocator.StoreLocatorManager.LocateStoreError locatestoreerror)
            {
                mActivityHelper.showAlert(AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA);
            }

            public void onBegin()
            {
                showLoading();
            }

            public void onCreateOrderError(RequestErrorCode requesterrorcode)
            {
                mActivityHelper.showAlert(AlertType.STORE_CONNECTION_ERROR);
            }

            public void onFinish()
            {
                hideLoading();
            }

            public void onNoStoreFoundForDelivery()
            {
                mActivityHelper.showAlert(AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA);
            }

            public void onOrderCreated(LabsOrder labsorder)
            {
                navigateToCart();
            }

            public void onStoreClosed(LabsAddress labsaddress)
            {
                mActivityHelper.showAlert(AlertType.STORE_DELIVERY_CLOSED);
            }

            public void onStoreDeliveryUnavailable(LabsAddress labsaddress, String s)
            {
                mActivityHelper.showAlert(AlertType.STORE_DELIVERY_UNAVAILABLE, s, null);
            }

            public void onStoreOffline(LabsAddress labsaddress, String s)
            {
                mActivityHelper.showAlert(AlertType.STORE_DELIVERY_OFFLINE, s, null);
            }

            private DeliveryOrderCallback()
            {
                this$0 = UserAddLocation.this;
                super();
            }

            DeliveryOrderCallback(_cls1 _pcls1)
            {
                this();
            }
        }

    }


    private class _cls8
        implements android.view.View.OnClickListener
    {

        final UserAddLocation this$0;

        public void onClick(View view)
        {
            StoreListActivity_.intent(UserAddLocation.this).addressIndex(locationIndex).startForResult(49);
        }

        _cls8()
        {
            this$0 = UserAddLocation.this;
            super();
        }
    }


    private class _cls9
        implements android.view.View.OnClickListener
    {

        final UserAddLocation this$0;

        public void onClick(View view)
        {
            displayEditor();
        }

        _cls9()
        {
            this$0 = UserAddLocation.this;
            super();
        }
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        private boolean initialized;
        final UserAddLocation this$0;

        public void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = (AddressType)adapterview.getAdapter().getItem(i);
            selectedTypeName = new String(adapterview.getName());
            selectedTypeId = new String(adapterview.getId());
            boolean flag = StringHelper.equalsIgnoreCase(adapterview.getId(), AddressType.TYPE_CAMPUS_BASE.getId());
            if (i != 0)
            {
                setSpecialRowVisibility(flag, 0);
            } else
            {
                setSpecialRowVisibility(flag, 8);
            }
            setVisiblity(flag);
            setOptionalEntryHints();
            if (initialized)
            {
                nameEntry.requestFocus();
            } else
            {
                initialized = true;
            }
            if (flag && !mStillLoadingSavedData)
            {
                mCampusLocatorManger.getRegions(new CampusLocatorCallback(null));
            }
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        }

        _cls1()
        {
            this$0 = UserAddLocation.this;
            super();
            initialized = false;
        }
    }


    private class _cls2
        implements android.widget.TextView.OnEditorActionListener
    {

        final UserAddLocation this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            stateSelector.performClick();
            return true;
        }

        _cls2()
        {
            this$0 = UserAddLocation.this;
            super();
        }
    }


    private class _cls3
        implements android.widget.TextView.OnEditorActionListener
    {

        final UserAddLocation this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            topButton.performClick();
            return false;
        }

        _cls3()
        {
            this$0 = UserAddLocation.this;
            super();
        }
    }


    private class _cls4
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        private boolean spinnerInitialized;
        final UserAddLocation this$0;

        public void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            if (spinnerInitialized) goto _L2; else goto _L1
_L1:
            spinnerInitialized = true;
_L4:
            selectedState = (String)adapterview.getAdapter().getItem(i);
            return;
_L2:
            if (i != 0)
            {
                zipEntry.requestFocus();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        }

        _cls4()
        {
            this$0 = UserAddLocation.this;
            super();
            spinnerInitialized = false;
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final UserAddLocation this$0;

        public void onClick(View view)
        {
            if (checkDataFields())
            {
                if (StringHelper.equalsIgnoreCase(selectedTypeId, AddressType.TYPE_CAMPUS_BASE.getId()))
                {
                    address = saveCampusAddress();
                } else
                {
                    address = new LabsAddress();
                    address.setAddressType(selectedTypeId.trim());
                    address.setCity(cityEntry.getText().toString().trim());
                    address.setName(nameEntry.getText().toString().trim());
                    address.setStreet(streetEntry.getText().toString().trim());
                    address.setRegion(selectedState);
                    address.setPostalCode(zipEntry.getText().toString().trim());
                    LabsAddress labsaddress;
                    if (aptEntry.getVisibility() == 0)
                    {
                        view = aptEntry.getText().toString().trim().replace("#", " ");
                    } else
                    {
                        view = "";
                    }
                    address.setUnitNumber(view);
                    address.setLine2(view);
                    labsaddress = address;
                    if (buildingEntry.getVisibility() == 0)
                    {
                        view = buildingEntry.getText().toString().trim();
                    } else
                    {
                        view = "";
                    }
                    labsaddress.setOrganizationName(view);
                    address.setDeliveryInstructions(deliveryInstructionsEntry.getText().toString());
                }
                checkDeliveryAddressStoreStatus(address);
            }
        }

        _cls5()
        {
            this$0 = UserAddLocation.this;
            super();
        }
    }


    private class _cls6 extends com.dominos.android.sdk.core.storelocator.StoreLocatorManager.LocateClosestStoreCallback
    {

        final UserAddLocation this$0;
        final LabsAddress val$deliveryAddress;

        public void onAddressInvalid(com.dominos.android.sdk.core.storelocator.StoreLocatorManager.LocateStoreError locatestoreerror)
        {
            if (locatestoreerror == com.dominos.android.sdk.core.storelocator.StoreLocatorManager.LocateStoreError.STREET_NUMBER_MISSING)
            {
                mActivityHelper.showAlert(AlertType.ADDRESS_MISSING_STREET_NUMBER);
                return;
            } else
            {
                mActivityHelper.showAlert(AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA);
                return;
            }
        }

        public void onLocateStoreFailed()
        {
            mActivityHelper.showAlert(AlertType.STORE_CONNECTION_ERROR);
        }

        public void onStoreFound(LocatorStore locatorstore, LabsAddress labsaddress)
        {
            saveCustomer(labsaddress, deliveryAddress);
        }

        public void onStoreNotFound()
        {
            mActivityHelper.showAlert(AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA);
        }

        _cls6()
        {
            this$0 = UserAddLocation.this;
            deliveryAddress = labsaddress;
            super();
        }
    }

}
