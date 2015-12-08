// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.controller.iface.IAddToBagController;
import com.kohls.mcommerce.opal.framework.view.fragment.productdetails.helper.QuantityHelper;
import com.kohls.mcommerce.opal.framework.view.fragment.productdetails.iface.QuantityViewState;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import java.util.List;

public class StoreInfoAdapter extends ArrayAdapter
{

    private static final int STORE_ADDRESS = 1;
    private static final int STORE_AVAILABILE_STOCK = 6;
    private static final int STORE_AVAILABILITY = 3;
    private static final int STORE_BOPUS_ELIGIBLE = 4;
    private static final int STORE_DISTANCE = 2;
    private static final int STORE_NAME = 0;
    private static final int STORE_NUM = 5;
    private String mCollectionID;
    private Context mContext;
    private IAddToBagController mController;
    private boolean mIsFromCheckout;
    private boolean mIsOnlineExclusive;
    private boolean mIsProductBopusEligible;
    private boolean mIsSkuBopusEligible;
    private boolean mIsUpdateStore;
    public int mItemPostion;
    private LayoutInflater mLayoutInflator;
    private String mMyStoreNum;
    private String mSkuCode;
    private List mStores;
    private String mWebId;

    public StoreInfoAdapter(Context context, int i, List list, String s, String s1, boolean flag, boolean flag1, 
            String s2, boolean flag2, boolean flag3, boolean flag4)
    {
        super(context, i, list);
        mStores = list;
        mContext = context;
        mSkuCode = s;
        mWebId = s1;
        mIsProductBopusEligible = flag;
        mIsSkuBopusEligible = flag1;
        mCollectionID = s2;
        mIsOnlineExclusive = flag2;
        mIsFromCheckout = flag3;
        mIsUpdateStore = flag4;
        mLayoutInflator = (LayoutInflater)context.getSystemService("layout_inflater");
        getMyStore();
    }

    private void setStoreSort()
    {
        if (mStores != null && mStores.size() > 1)
        {
            mStores = UtilityMethods.sortArrayStore(mStores, 1003, mMyStoreNum);
        }
    }

    public int getCount()
    {
        if (mStores == null)
        {
            return 0;
        } else
        {
            return mStores.size();
        }
    }

    public int getItemPosition()
    {
        return mItemPostion;
    }

    public String[] getItemString(int i)
    {
        Object obj = null;
        String as[] = obj;
        if (mStores != null)
        {
            as = obj;
            if (!mStores.isEmpty())
            {
                as = obj;
                if (mStores.get(i) != null)
                {
                    as = new String[7];
                    as[0] = (new StringBuilder()).append(mContext.getResources().getString(0x7f08026a).toUpperCase()).append(" ").append(((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStores.get(i)).getStoreName()).toString();
                    as[1] = (new StringBuilder()).append(UtilityMethods.getAddressLine(((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStores.get(i)).getAddress(), true, false).toString()).append("\n").append(UtilityMethods.getAddressLine(((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStores.get(i)).getAddress(), false, true).toString()).append(", ").append(((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStores.get(i)).getAddress().getPostalCode()).toString();
                    if (((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStores.get(i)).getDistanceFromOrigin() != null)
                    {
                        double d = (double)Math.round(Double.valueOf(((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStores.get(i)).getDistanceFromOrigin()).doubleValue() * 10D) / 10D;
                        as[2] = (new StringBuilder()).append(d).append(" ").append(mContext.getString(0x7f08010b)).toString();
                    }
                    as[3] = ((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStores.get(i)).getAvailability();
                    as[4] = String.valueOf(((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStores.get(i)).isBopusEligibleStore());
                    as[5] = String.valueOf(((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStores.get(i)).getStoreNum());
                    as[6] = ((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStores.get(i)).getAvailableStock();
                }
            }
        }
        return as;
    }

    public void getMyStore()
    {
        com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store = (new PreferenceHelper(mContext)).getUserStore();
        if (store != null)
        {
            mMyStoreNum = store.getStoreNum();
        } else
        {
            mMyStoreNum = null;
        }
        setStoreSort();
    }

    public List getStoreInfoData()
    {
        return mStores;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
    /* block-local class not found */
    class ViewHolder {}

        CharSequence charsequence;
        if (view == null)
        {
            viewgroup = new ViewHolder();
            view = mLayoutInflator.inflate(0x7f030069, null);
            viewgroup.textStoreName = (TextView)view.findViewById(0x7f0d023e);
            viewgroup.textAvailableTxt = (TextView)view.findViewById(0x7f0d0243);
            viewgroup.textStoreAddress = (TextView)view.findViewById(0x7f0d0240);
            viewgroup.textStoreDistance = (TextView)view.findViewById(0x7f0d0242);
            viewgroup.textMyStore = (TextView)view.findViewById(0x7f0d023f);
            viewgroup.mQtyUpBtn = (Button)view.findViewById(0x7f0d0249);
            viewgroup.mQtyDownBtn = (Button)view.findViewById(0x7f0d0247);
            viewgroup.mQtyValueEditTxt = (EditText)view.findViewById(0x7f0d0248);
            viewgroup.mButtonAddToBag = (Button)view.findViewById(0x7f0d024a);
            viewgroup.mAddToBagLayout = (LinearLayout)view.findViewById(0x7f0d0245);
            viewgroup.mSelectStoreLayout = (LinearLayout)view.findViewById(0x7f0d024c);
            viewgroup.mButtonSelectStore = (Button)view.findViewById(0x7f0d024d);
            viewgroup.mQtyHelper = new QuantityHelper(mContext);
            viewgroup.mtextInlineErr = (TextView)view.findViewById(0x7f0d024b);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        if (mStores != null && !mStores.isEmpty() && mStores.get(i) != null)
        {
            charsequence = ((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStores.get(i)).getErrorMess();
            if (TextUtils.isEmpty(charsequence))
            {
                ((ViewHolder) (viewgroup)).mtextInlineErr.setText("");
            } else
            {
                ((ViewHolder) (viewgroup)).mtextInlineErr.setText(charsequence);
            }
        }
        charsequence = getItemString(i);
        if (charsequence != null)
        {
            ((ViewHolder) (viewgroup)).textStoreName.setText(charsequence[0]);
            ((ViewHolder) (viewgroup)).textStoreAddress.setText(charsequence[1]);
            ((ViewHolder) (viewgroup)).textStoreDistance.setText(charsequence[2]);
            if (charsequence[5] != null && !TextUtils.isEmpty(mMyStoreNum) && charsequence[5].equalsIgnoreCase(mMyStoreNum))
            {
                ((ViewHolder) (viewgroup)).textMyStore.setVisibility(0);
            } else
            {
                ((ViewHolder) (viewgroup)).textMyStore.setVisibility(8);
            }
            if (charsequence[3] != null && charsequence[3].equalsIgnoreCase(mContext.getResources().getString(0x7f080239)) && charsequence[6] != null && !charsequence[6].equalsIgnoreCase("0"))
            {
                ((ViewHolder) (viewgroup)).textAvailableTxt.setText(mContext.getResources().getString(0x7f08016d));
                ((ViewHolder) (viewgroup)).textAvailableTxt.setCompoundDrawablesWithIntrinsicBounds(0x7f020108, 0, 0, 0);
                ((ViewHolder) (viewgroup)).mAddToBagLayout.setVisibility(0);
            } else
            if (charsequence[3] != null && charsequence[3].equalsIgnoreCase(mContext.getResources().getString(0x7f080398)) && charsequence[6] != null && !charsequence[6].equalsIgnoreCase("0"))
            {
                ((ViewHolder) (viewgroup)).textAvailableTxt.setText(mContext.getResources().getString(0x7f080282));
                ((ViewHolder) (viewgroup)).textAvailableTxt.setCompoundDrawablesWithIntrinsicBounds(0x7f020108, 0, 0, 0);
                ((ViewHolder) (viewgroup)).mAddToBagLayout.setVisibility(0);
            } else
            {
                ((ViewHolder) (viewgroup)).textAvailableTxt.setText(mContext.getResources().getString(0x7f0803d7));
                ((ViewHolder) (viewgroup)).textAvailableTxt.setCompoundDrawablesWithIntrinsicBounds(0x7f02010c, 0, 0, 0);
                ((ViewHolder) (viewgroup)).mAddToBagLayout.setVisibility(8);
            }
            if (mIsUpdateStore)
            {
                ((ViewHolder) (viewgroup)).mAddToBagLayout.setVisibility(8);
                ((ViewHolder) (viewgroup)).mSelectStoreLayout.setVisibility(0);
            } else
            {
                ((ViewHolder) (viewgroup)).mSelectStoreLayout.setVisibility(8);
            }
            if (!Boolean.valueOf(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().isFeatureBOPUSEnabled()).booleanValue() || !mIsProductBopusEligible || !mIsSkuBopusEligible || !Boolean.parseBoolean(charsequence[4]))
            {
                ((ViewHolder) (viewgroup)).mAddToBagLayout.setVisibility(8);
                ((ViewHolder) (viewgroup)).mSelectStoreLayout.setVisibility(8);
            }
            ((ViewHolder) (viewgroup)).mQtyHelper.setQuantity(((ViewHolder) (viewgroup)).mQtyValueEditTxt, ((ViewHolder) (viewgroup)).mQtyDownBtn, ((ViewHolder) (viewgroup)).mQtyUpBtn, (QuantityViewState)mStores.get(i));
            ((ViewHolder) (viewgroup)).mButtonAddToBag.setOnClickListener(new _cls1(viewgroup, i));
            view.setOnClickListener(new _cls2(i));
            ((ViewHolder) (viewgroup)).mButtonSelectStore.setOnClickListener(new _cls3(charsequence));
        }
        return view;
    }

    public void setAddToBagController(IAddToBagController iaddtobagcontroller)
    {
        mController = iaddtobagcontroller;
    }

    public void setStoreInfoData(List list)
    {
        mStores = list;
        setStoreSort();
    }








    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
