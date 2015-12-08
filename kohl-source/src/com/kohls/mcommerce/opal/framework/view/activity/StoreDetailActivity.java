// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.FontUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import java.util.HashMap;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class StoreDetailActivity extends BaseActivityWithoutSlider
{

    public static final String TAG = com/kohls/mcommerce/opal/framework/view/activity/StoreDetailActivity.getName();
    private Location mSearchLocation;
    private com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store selectedStore;
    private Button storeCall;
    private TextView storeCityAddress;
    private TextView storeDetailAddress;
    private Button storeDirections;
    private TextView storeDistance;
    private TextView storeFridayHours;
    private TextView storeFridayLabel;
    private TextView storeLabel;
    private TextView storeMondayHours;
    private TextView storeMondayLabel;
    private TextView storeSaturdayHours;
    private TextView storeSaturdayLabel;
    private Button storeSetMyStore;
    private TextView storeSundayHours;
    private TextView storeSundayLabel;
    private TextView storeThrusdayHours;
    private TextView storeThrusdayLabel;
    private TextView storeTuesdayHours;
    private TextView storeTuesdayLabel;
    private TextView storeWednesdayHours;
    private TextView storeWednesdayLabel;

    public StoreDetailActivity()
    {
    }

    private boolean compareWithMyStore(com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store)
    {
        com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store1 = ((KohlsPhoneApplication)getApplication()).getKohlsPref().getUserStore();
        return store1 != null && store1.getStoreNum().equalsIgnoreCase(store.getStoreNum());
    }

    public boolean addToMyStore(com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store)
    {
        com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store1 = ((KohlsPhoneApplication)getApplication()).getKohlsPref().getUserStore();
        if (store1 != null && store1.getStoreNum().equalsIgnoreCase(store.getStoreNum()))
        {
            ((KohlsPhoneApplication)getApplication()).getKohlsPref().removeUserStore();
            return false;
        } else
        {
            ((KohlsPhoneApplication)getApplication()).getKohlsPref().saveUserStore(store);
            return true;
        }
    }

    protected int getLayoutId()
    {
        return 0x7f03010a;
    }

    protected void initializeViews()
    {
        storeDetailAddress = (TextView)findViewById(0x7f0d0696);
        storeCityAddress = (TextView)findViewById(0x7f0d0697);
        storeDistance = (TextView)findViewById(0x7f0d0242);
        storeCall = (Button)findViewById(0x7f0d0699);
        registerForContextMenu(storeCall);
        storeDirections = (Button)findViewById(0x7f0d069a);
        storeSetMyStore = (Button)findViewById(0x7f0d069b);
        storeLabel = (TextView)findViewById(0x7f0d069d);
        storeMondayLabel = (TextView)findViewById(0x7f0d06a0);
        storeMondayLabel.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Bold.otf"));
        storeTuesdayLabel = (TextView)findViewById(0x7f0d06a3);
        storeTuesdayLabel.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Bold.otf"));
        storeWednesdayLabel = (TextView)findViewById(0x7f0d06a6);
        storeWednesdayLabel.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Bold.otf"));
        storeThrusdayLabel = (TextView)findViewById(0x7f0d06a9);
        storeThrusdayLabel.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Bold.otf"));
        storeFridayLabel = (TextView)findViewById(0x7f0d06ac);
        storeFridayLabel.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Bold.otf"));
        storeSaturdayLabel = (TextView)findViewById(0x7f0d06af);
        storeSaturdayLabel.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Bold.otf"));
        storeSundayLabel = (TextView)findViewById(0x7f0d06b2);
        storeSundayLabel.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Bold.otf"));
        storeMondayHours = (TextView)findViewById(0x7f0d06a1);
        storeTuesdayHours = (TextView)findViewById(0x7f0d06a4);
        storeWednesdayHours = (TextView)findViewById(0x7f0d06a7);
        storeThrusdayHours = (TextView)findViewById(0x7f0d06aa);
        storeFridayHours = (TextView)findViewById(0x7f0d06ad);
        storeSaturdayHours = (TextView)findViewById(0x7f0d06b0);
        storeSundayHours = (TextView)findViewById(0x7f0d06b3);
    }

    protected void initializeViews(Bundle bundle)
    {
        if (bundle != null)
        {
            selectedStore = (com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)bundle.getSerializable("store_detail");
            mSearchLocation = new Location("gps");
            mSearchLocation.setLatitude(bundle.getDouble("search_latitude"));
            mSearchLocation.setLongitude(bundle.getDouble("search_longitude"));
        }
        initializeViews();
        loadContent();
    }

    protected void loadContent()
    {
        storeDetailAddress.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Book.otf"));
        storeDetailAddress.setText(UtilityMethods.getAddressLine(selectedStore.getAddress(), true, false));
        storeCityAddress.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Book.otf"));
        storeCityAddress.setText((new StringBuilder()).append(UtilityMethods.getAddressLine(selectedStore.getAddress(), false, true)).append(",\n").append(selectedStore.getAddress().getPostalCode()).toString());
        if (selectedStore.getDistanceFromOrigin() != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            String s1 = selectedStore.getDistanceFromOrigin();
            stringbuilder.append(selectedStore.getDistanceFromOrigin());
            String s = s1;
            if (stringbuilder.indexOf(".") != -1)
            {
                s = s1;
                if (stringbuilder.substring(stringbuilder.indexOf(".")).length() > 2)
                {
                    s = String.valueOf((double)Math.round(Double.valueOf(stringbuilder.substring(0, stringbuilder.indexOf(".") + 3)).doubleValue() * 10D) / 10D);
                }
            }
            storeDistance.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Book.otf"));
            storeDistance.setText((new StringBuilder()).append(s).append(" ").append(getString(0x7f08010b)).toString());
        }
        HashMap hashmap;
        if (selectedStore.getContactInfo().length > 0)
        {
            storeCall.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Bold.otf"));
            storeCall.setText(UtilityMethods.formatPhoneNumber(selectedStore.getContactInfo()[0].getValue()));
            storeCall.setOnClickListener(new android.view.View.OnClickListener() {

                final StoreDetailActivity this$0;

                public void onClick(View view)
                {
                    UtilityMethods.initiateCall(selectedStore.getContactInfo()[0].getValue(), StoreDetailActivity.this);
                }

            
            {
                this$0 = StoreDetailActivity.this;
                super();
            }
            });
        } else
        {
            storeCall.setVisibility(8);
        }
        storeDirections.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Bold.otf"));
        storeDirections.setOnClickListener(new android.view.View.OnClickListener() {

            final StoreDetailActivity this$0;

            public void onClick(View view)
            {
                startNavigation();
            }

            
            {
                this$0 = StoreDetailActivity.this;
                super();
            }
        });
        storeSetMyStore.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Bold.otf"));
        if (compareWithMyStore(selectedStore))
        {
            storeSetMyStore.setText(getString(0x7f0800f6));
        } else
        {
            storeSetMyStore.setText(getString(0x7f08011d));
        }
        storeSetMyStore.setOnClickListener(new android.view.View.OnClickListener() {

            final StoreDetailActivity this$0;

            public void onClick(View view)
            {
                if (addToMyStore(selectedStore))
                {
                    storeSetMyStore.setText(getString(0x7f0800f6));
                    Toast.makeText(StoreDetailActivity.this, getString(0x7f0804f1), 0).show();
                } else
                {
                    finish();
                }
                view.invalidate();
            }

            
            {
                this$0 = StoreDetailActivity.this;
                super();
            }
        });
        storeLabel.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Bold.otf"));
        selectedStore.getStoreHours().setHoursofOperation();
        hashmap = selectedStore.getStoreHours().getHoursOfOperation();
        storeMondayHours.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Book.otf"));
        storeMondayHours.setText((CharSequence)hashmap.get("monday"));
        storeTuesdayHours.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Book.otf"));
        storeTuesdayHours.setText((CharSequence)hashmap.get("tuesday"));
        storeWednesdayHours.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Book.otf"));
        storeWednesdayHours.setText((CharSequence)hashmap.get("wednesday"));
        storeThrusdayHours.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Book.otf"));
        storeThrusdayHours.setText((CharSequence)hashmap.get("thursday"));
        storeFridayHours.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Book.otf"));
        storeFridayHours.setText((CharSequence)hashmap.get("friday"));
        storeSaturdayHours.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Book.otf"));
        if (hashmap.get("saturday") != null)
        {
            storeSaturdayHours.setText((CharSequence)hashmap.get("saturday"));
        } else
        {
            storeSaturdayHours.setVisibility(8);
            storeSaturdayLabel.setVisibility(8);
        }
        storeSundayHours.setTypeface(FontUtils.loadTypeFace(this, "Gotham-Book.otf"));
        if (hashmap.get("sunday") != null)
        {
            storeSundayHours.setText((CharSequence)hashmap.get("sunday"));
            return;
        } else
        {
            storeSundayHours.setVisibility(8);
            storeSundayLabel.setVisibility(8);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        contextmenu.add(0, view.getId(), 0, getString(0x7f0800fa));
        contextmenu = (TextView)view;
        ((ClipboardManager)getSystemService("clipboard")).setText(contextmenu.getText());
    }

    protected void startNavigation()
    {
        if (mSearchLocation != null)
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("http://maps.google.com/maps?daddr=").append(selectedStore.getAddress().getLocation().getLatitude()).append(",").append(selectedStore.getAddress().getLocation().getLongitude()).toString())));
        }
    }

    protected void updateActionBarViews()
    {
        StringBuilder stringbuilder = new StringBuilder(getResources().getText(0x7f08026a));
        stringbuilder.append(" ");
        stringbuilder.append(selectedStore.getStoreName());
        getActionBarHelper().showActionBarWithDetail(stringbuilder.toString());
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }



}
