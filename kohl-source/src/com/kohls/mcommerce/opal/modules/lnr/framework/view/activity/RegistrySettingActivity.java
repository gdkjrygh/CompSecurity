// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity;

import android.content.Intent;
import android.os.Bundle;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithoutSlider;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.RegistryCategoriesVO;
import java.util.ArrayList;
import java.util.List;

public class RegistrySettingActivity extends BaseActivityWithoutSlider
{
    public static final class RegistrySettingScreenType extends Enum
    {

        private static final RegistrySettingScreenType $VALUES[];
        public static final RegistrySettingScreenType REGISTRY_SETTING;

        public static RegistrySettingScreenType valueOf(String s)
        {
            return (RegistrySettingScreenType)Enum.valueOf(com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/RegistrySettingActivity$RegistrySettingScreenType, s);
        }

        public static RegistrySettingScreenType[] values()
        {
            return (RegistrySettingScreenType[])$VALUES.clone();
        }

        static 
        {
            REGISTRY_SETTING = new RegistrySettingScreenType("REGISTRY_SETTING", 0);
            $VALUES = (new RegistrySettingScreenType[] {
                REGISTRY_SETTING
            });
        }

        private RegistrySettingScreenType(String s, int i)
        {
            super(s, i);
        }
    }


    private List mAddedCategoryList;
    private ArrayList mCategoryEntries;
    private FragmentOnScreen mFragmentOnScreen;
    private ArrayList mListItems;
    private FragmentOnScreen mPrevFragOnScreen;
    private RegistryCategoriesVO mRegCategoriesVO;
    private com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList mRegistryObj;
    private List mRemovedCategoryList;

    public RegistrySettingActivity()
    {
    }

    public void attachAddressSelectionFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachAddressFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.ADDRESS_FRAGMENT;
    }

    public void attachDefaultContent()
    {
        attachRegistrySettingFragment(getIntent().getExtras());
    }

    public void attachRegSettingsMsgPromocodeFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachtRegSettingsMsgPromocodeFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_SETTING_MSG_PROMOCODE_FRAGMENT;
    }

    public void attachRegSettingsRegistrantsFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachtRegSettingsRegistrantsFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_SETTING_REGISTRANTS_FRAGMENT;
    }

    public void attachRegSettingsSpecialDayFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachtRegSettingsSpecialDayFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_SETTING_SPECIAL_DAY_FRAGMENT;
    }

    public void attachRegistryAddCategoryFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachRegistryAddCategoryFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_ADD_CATEGORY_FRAGMENT;
    }

    public void attachRegistryCategoryFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachRegistryCategoryFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_CATEGORY_FRAGMENT;
    }

    public void attachRegistrySettingFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachRegistrySettingFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_SETTING_FRAGMENT;
    }

    public List getAddedCategoryList()
    {
        return mAddedCategoryList;
    }

    protected int getLayoutId()
    {
        return 0x7f030001;
    }

    public ArrayList getListItems()
    {
        return mListItems;
    }

    public com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList getRegistryObj()
    {
        return mRegistryObj;
    }

    public List getRemovedCategoryList()
    {
        return mRemovedCategoryList;
    }

    public ArrayList getmCategoryEntries()
    {
        return mCategoryEntries;
    }

    public RegistryCategoriesVO getmRegCategoriesVO()
    {
        return mRegCategoriesVO;
    }

    protected void initializeViews(Bundle bundle)
    {
        mRegistryObj = (com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList)bundle.getSerializable("registry object");
        mCategoryEntries = (ArrayList)bundle.getSerializable("entry object");
        mListItems = (ArrayList)bundle.getSerializable("list items object");
        attachDefaultContent();
    }

    public void onBackPressed()
    {
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_SETTING_REGISTRANTS_FRAGMENT)
        {
            attachRegistrySettingFragment(null);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_ADD_CATEGORY_FRAGMENT)
        {
            attachRegistryCategoryFragment(null);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_CATEGORY_FRAGMENT)
        {
            attachRegistrySettingFragment(null);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_SETTING_MSG_PROMOCODE_FRAGMENT)
        {
            attachRegistrySettingFragment(null);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_SETTING_SPECIAL_DAY_FRAGMENT)
        {
            attachRegistrySettingFragment(null);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_SETTING_FRAGMENT)
        {
            Bundle bundle = new Bundle();
            bundle.putSerializable("registry object", mRegistryObj);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            setResult(8004, intent);
            finish();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void openManageRegistry()
    {
        setResult(0, new Intent());
        finish();
    }

    public void setAddedCategoryList(List list)
    {
        mAddedCategoryList = list;
    }

    public void setRegistryObj(com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList wishlist)
    {
        mRegistryObj = wishlist;
    }

    public void setRemovedCategoryList(List list)
    {
        mRemovedCategoryList = list;
    }

    public void setmCategoryEntries(ArrayList arraylist)
    {
        mCategoryEntries = arraylist;
    }

    public void setmRegCategoriesVO(RegistryCategoriesVO registrycategoriesvo)
    {
        mRegCategoriesVO = registrycategoriesvo;
    }

    protected void updateActionBarViews()
    {
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }
}
