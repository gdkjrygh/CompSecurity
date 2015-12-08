// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.analytics.utils.enums.ScreenNames;
import com.apptentive.android.sdk.Log;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.components.CustomSearchView;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.RegistryObject;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.framework.vo.AddRegistryVO;
import com.kohls.mcommerce.opal.framework.vo.ErrorVO;
import com.kohls.mcommerce.opal.framework.vo.ProductDetailVO;
import com.kohls.mcommerce.opal.framework.vo.ProductMatrixVO;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.error.ErrorHelper;
import com.kohls.mcommerce.opal.helper.json.JSONParsingHelper;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPO;
import com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPropertiesPO;
import com.kohls.mcommerce.opal.modules.lnr.common.po.ShipmentAddressPO;
import com.kohls.mcommerce.opal.modules.lnr.common.util.LnRUtility;
import com.kohls.mcommerce.opal.modules.lnr.common.value.LnRConstantValues;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.AddSingleProductControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.CreateOrUpdateRegistryControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.DeleteListItemControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.GetRegistryCategoriesControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.GetRegistryFulfillmentActivityControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.ListDetailControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.UpdateListItemQtyControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.listener.ActivityResultCallback;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyRegistryActivity;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.RegistrySettingActivity;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.component.views.LnRListSharingDialog;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.component.views.LnRListSortingDialog;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.CreateListVO;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.DashboardCategoryVO;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.DeleteListItemVO;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.Entries;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.FulfillmentActivityVO;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.ListDetailVO;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.ListItem;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.Properties;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.RegistryCategoriesVO;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.UpdateListItemVO;
import com.kohls.mcommerce.opal.modules.lnr.helper.adapter.RDPDashboardViewAdapter;
import com.kohls.mcommerce.opal.modules.lnr.helper.adapter.RDPProductsAdapter;
import com.kohls.mcommerce.opal.modules.lnr.helper.list.ListItemSorting;
import com.kohls.mcommerce.opal.modules.lnr.helper.list.SortingType;
import com.kohls.mcommerce.opal.modules.lnr.helper.registry.RegistryDashboardValueGenerator;
import com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment:
//            ListDetailFragment

public class RegistryDetailFragment extends BaseFragment
    implements android.view.View.OnClickListener, com.kohls.mcommerce.opal.modules.lnr.framework.view.component.views.LnRListSortingDialog.OnSortOptionSelectionListener, android.content.DialogInterface.OnClickListener, ActivityResultCallback
{

    private static final int RESPONSE_CODE_100 = 100;
    private static final int RESPONSE_CODE_MINUS_100 = -100;
    public static String TAG = com/kohls/mcommerce/opal/modules/lnr/framework/view/fragment/ListDetailFragment.getName();
    private static RegistryDetailFragment fragment;
    public static int mListFragmentHeaderHeight;
    private ArrayList categoryEntries;
    private FulfillmentActivityVO fulfillmentActivityVO;
    private ArrayList fulfillments;
    boolean isRegistryPublic;
    private int mActionBarHeight;
    Activity mActivity;
    private FrameLayout mCalenderView;
    private String mCategoryName;
    private ViewGroup mContentParentView;
    private int mCurrentRegistryIndex;
    private int mCurrentView;
    private com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPropertiesPO.DashboardPO mDashboardPO;
    private BroadcastReceiver mDataUpdateReceiver;
    private TextView mDaysLeft;
    private DeleteListItemControllerImpl mDeleteListItemControllerImpl;
    private ImageView mEditListImg;
    private GetRegistryCategoriesControllerImpl mGetRegCategoryController;
    private GetRegistryFulfillmentActivityControllerImpl mGetRegistryFulfillmentActivityControllerImpl;
    private Button mGoShoppingBtn;
    private android.widget.AbsListView.OnScrollListener mGridViewScrollListener;
    private LinearLayout mHeaderLayout;
    private LinearLayout mHiddenLayout;
    private boolean mIsDataRefreshReqd;
    private boolean mIsFromCategory;
    private boolean mIsHeaderHidden;
    private boolean mIsInGuestView;
    private ListItem mItemToBeDeleted;
    private int mLastVisibleItem;
    private ListDetailVO mListDetailVO;
    private StickyGridHeadersGridView mListMatrixGridView;
    private LinearLayout mLoaderLayout;
    private View mMainLayout;
    private float mMinHeaderAnimateY;
    private TextView mNoItemsTxtView;
    private RelativeLayout mNoListLayout;
    private int mOriginFragmentFindRegistry;
    private int mOriginOfRequest;
    private FragmentOnScreen mPrevFragmentOnScreen;
    private CustomSearchView mProductSearchView;
    private int mProductsViewLayout;
    private LinkedHashMap mPurchasedMap;
    private RDPDashboardViewAdapter mRDPDashboardViewAdapter;
    private RDPProductsAdapter mRDPProductsAdapter;
    private ImageView mRegCalenderImgView;
    private RegistryCategoriesVO mRegCategoriesVO;
    private TextView mRegEventDateTxtView;
    private TextView mRegEventLocTxtView;
    private long mRegId;
    private TextView mRegIdTxtView;
    private String mRegLongUrl;
    private TextView mRegOutOfStockTxtView;
    private View mRegOutOfStockView;
    private TextView mRegistrantsTxtView;
    private String mRegistryType;
    private com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList mRegistryVO;
    private ImageView mScanIcon;
    private int mSelectedSortOption;
    private TextView mShareRegistryView;
    private TextView mSortByTxt;
    private int mSortID;
    private TextView mTotalPurchasedItemsTxt;
    private UpdateListItemQtyControllerImpl mUpdateListItemQtyControllerImpl;
    private CreateOrUpdateRegistryControllerImpl mUpdateRegistrySettingsControllerImpl;
    private ArrayList mUserRegistryWishList;
    private ImageView mViewToggleDashboardImageView;
    private ImageView mViewToggleGridImageView;
    private ImageView mViewToggleListImageView;
    private ListDetailControllerImpl mlistDetailControllerImpl;
    boolean requestOriginatedFromShare;
    int userlistPosition;

    public RegistryDetailFragment()
    {
        mIsInGuestView = true;
        mOriginOfRequest = -1;
        isRegistryPublic = false;
        mOriginFragmentFindRegistry = -1;
        mCurrentRegistryIndex = -1;
        mUserRegistryWishList = new ArrayList();
        mDataUpdateReceiver = new _cls3();
        mGridViewScrollListener = new _cls6();
    }

    private void attachActionItemListener()
    {
        ((MyRegistryActivity)mActivity).getActionBarHelper().getItemView().setOnClickListener(new _cls7());
    }

    private int calculateOutOfStockItems()
    {
        boolean flag = false;
        int i = 0;
        int j = ((flag) ? 1 : 0);
        if (mListDetailVO != null)
        {
            j = ((flag) ? 1 : 0);
            if (mListDetailVO.getListItems() != null)
            {
                Iterator iterator = mListDetailVO.getListItems().iterator();
                do
                {
                    j = i;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    if (((ListItem)iterator.next()).getProperties().getAvailability().equalsIgnoreCase("out of stock"))
                    {
                        i++;
                    }
                } while (true);
            }
        }
        return j;
    }

    private int calculatePurchasedItems()
    {
        boolean flag = false;
        int i = 0;
        int j = ((flag) ? 1 : 0);
        if (mListDetailVO != null)
        {
            j = ((flag) ? 1 : 0);
            if (mListDetailVO.getListItems() != null)
            {
                Iterator iterator = mListDetailVO.getListItems().iterator();
                do
                {
                    j = i;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    i += ((ListItem)iterator.next()).getTotalPurchaseQty().intValue();
                } while (true);
            }
        }
        return j;
    }

    private void calculateSortingPrice()
    {
        if (mListDetailVO != null && mListDetailVO.getListItems() != null)
        {
            for (Iterator iterator = mListDetailVO.getListItems().iterator(); iterator.hasNext();)
            {
                ListItem listitem = (ListItem)iterator.next();
                float f;
                float f1;
                try
                {
                    f = Float.parseFloat(LnRUtility.getPriceValue(listitem.getProperties().getPrices(), "op"));
                }
                catch (NumberFormatException numberformatexception)
                {
                    f = -1F;
                }
                try
                {
                    f1 = Float.parseFloat(LnRUtility.getPriceValue(listitem.getProperties().getPrices(), "sp"));
                }
                catch (NumberFormatException numberformatexception1)
                {
                    f1 = -1F;
                }
                if (f < f1)
                {
                    if (f != -1F)
                    {
                        listitem.setSortingPrice(f);
                    } else
                    {
                        listitem.setSortingPrice(f1);
                    }
                } else
                if (f1 != -1F)
                {
                    listitem.setSortingPrice(f1);
                } else
                {
                    listitem.setSortingPrice(f);
                }
            }

        }
    }

    private int calculateTotalItems()
    {
        boolean flag = false;
        int i = 0;
        int j = ((flag) ? 1 : 0);
        if (mListDetailVO != null)
        {
            j = ((flag) ? 1 : 0);
            if (mListDetailVO.getListItems() != null)
            {
                Iterator iterator = mListDetailVO.getListItems().iterator();
                do
                {
                    j = i;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    ListItem listitem = (ListItem)iterator.next();
                    i += listitem.getWantedQty().intValue();
                    Log.d("CATEGORY NAME", new Object[] {
                        listitem.getProperties().getCategoryname()
                    });
                } while (true);
            }
        }
        return j;
    }

    private void createAddedMap()
    {
        loadProducts();
    }

    private void dismissDialog()
    {
        UtilityMethods.dismissDialog(4001);
        UtilityMethods.dismissDialog(4002);
    }

    public static RegistryDetailFragment getFragmentReference()
    {
        return fragment;
    }

    private String getRegistryDisplayName()
    {
        StringBuilder stringbuilder = null;
        if (mRegistryVO == null) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder1;
        String s;
        stringbuilder1 = new StringBuilder(mRegistryVO.getRegistryProperties().getProperties().getOwnerFirstName());
        if (mRegistryVO.getRegistryProperties() != null && mRegistryVO.getRegistryProperties().getProperties() != null && mRegistryVO.getRegistryProperties().getProperties().getPartnerFirstName() != null && !TextUtils.isEmpty(mRegistryVO.getRegistryProperties().getProperties().getPartnerFirstName()))
        {
            stringbuilder1.append((new StringBuilder()).append(" and ").append(mRegistryVO.getRegistryProperties().getProperties().getPartnerFirstName()).toString());
        }
        stringbuilder1.append("'s");
        s = mRegistryVO.getRegistryProperties().getProperties().getRegtype();
        if (!s.equals("registry.wedding")) goto _L4; else goto _L3
_L3:
        stringbuilder1.append(" Wedding Registry");
        stringbuilder = stringbuilder1;
_L2:
        return stringbuilder.toString();
_L4:
        if (s.equals("registry.baby"))
        {
            stringbuilder1.append(" Baby Registry");
            stringbuilder = stringbuilder1;
        } else
        {
            stringbuilder = stringbuilder1;
            if (s.equals("registry.splday"))
            {
                stringbuilder1.append(" Celebration Registry");
                stringbuilder = stringbuilder1;
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private RegistryPO getRegistryPO()
    {
        RegistryPO registrypo = new RegistryPO();
        registrypo.setBudget(mRegistryVO.getBudget());
        registrypo.setEventDate(mRegistryVO.getListEventDate());
        registrypo.setPromoCode(mRegistryVO.getPromoCode());
        registrypo.setPublic(isRegistryPublic);
        registrypo.setRegistryProperties(mRegistryVO.getRegistryProperties());
        registrypo.setRegistryName(mRegistryVO.getListName());
        return registrypo;
    }

    private void initializeHeaderAndLoadProducts()
    {
        parseDashboardPO();
        String s1 = mRegistryVO.getRegistryProperties().getProperties().getOwnerFirstName();
        String s = mRegistryVO.getRegistryProperties().getProperties().getPartnerFirstName();
        int i;
        if (TextUtils.isEmpty(s))
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append(" and ").append(s).toString();
        }
        mRegistrantsTxtView.setText((new StringBuilder()).append(s1).append(s).toString());
        mRegIdTxtView.setText((new StringBuilder()).append(getString(0x7f080325)).append(" ").append(mRegistryVO.getListId()).toString());
        mRegEventDateTxtView.setText((new StringBuilder()).append(getString(0x7f08031d)).append(" ").append(LnRUtility.getReminderDisplayDate(mRegistryVO.getListEventDate())).toString());
        i = LnRUtility.getDaysFromCurrentDate(mRegistryVO.getListEventDate());
        if (i == 0)
        {
            mCalenderView.setVisibility(0);
            mDaysLeft.setText(getString(0x7f0802cf));
            mDaysLeft.setTextSize(12F);
        } else
        if (i > 0)
        {
            mCalenderView.setVisibility(0);
            mDaysLeft.setText((new StringBuilder()).append("").append(i).toString());
        } else
        {
            mCalenderView.setVisibility(8);
        }
        if (mIsInGuestView)
        {
            mEditListImg.setVisibility(4);
            return;
        } else
        {
            mEditListImg.setVisibility(0);
            return;
        }
    }

    private void loadProducts()
    {
        if (!UtilityMethods.isNetworkConnected(mActivity))
        {
            Toast.makeText(mActivity, getResources().getString(0x7f0803cd), 0).show();
            return;
        } else
        {
            showLoader(true);
            mlistDetailControllerImpl.getListItems(mRegistryVO.getListId(), mIsInGuestView, false);
            return;
        }
    }

    private void loadPurchaseCount()
    {
        if (!UtilityMethods.isNetworkConnected(mActivity))
        {
            Toast.makeText(mActivity, getResources().getString(0x7f0803cd), 0).show();
            return;
        } else
        {
            showLoader(true);
            mGetRegistryFulfillmentActivityControllerImpl.getFulfillmentActivity(mRegistryVO.getListId());
            return;
        }
    }

    private void openShareRegistry()
    {
        Logger.debug("LnR", "Share Registry tapped");
        if (mActivity != null && !mActivity.isFinishing())
        {
            FragmentTransaction fragmenttransaction = mActivity.getFragmentManager().beginTransaction();
            if (mRegLongUrl == null || mRegLongUrl.isEmpty())
            {
                mRegLongUrl = LnRUtility.getShareListURL(mRegId, "share_originated_from_registry");
            }
            fragmenttransaction.add(new LnRListSharingDialog(mRegLongUrl, getRegistryDisplayName(), mIsInGuestView, "share_originated_from_registry"), "abc");
            fragmenttransaction.commitAllowingStateLoss();
        }
    }

    private void parseDashboardPO()
    {
        String s = mRegistryVO.getRegistryProperties().getProperties().getDashboard();
    /* block-local class not found */
    class DashboardParsingListener {}

        JSONParsingHelper jsonparsinghelper = new JSONParsingHelper(com/kohls/mcommerce/opal/modules/lnr/common/po/RegistryPropertiesPO$DashboardPO, new DashboardParsingListener());
        if (jsonparsinghelper != null)
        {
            jsonparsinghelper.execute(new String[] {
                s
            });
        }
    }

    private void prepareDashboardList(boolean flag)
    {
        ((MyRegistryActivity)mActivity).setRegistryCategoryList(new LinkedHashMap());
        if (mDashboardPO != null)
        {
            Object obj = mDashboardPO.getAddedArray();
            if (obj != null && categoryEntries != null)
            {
                obj = ((ArrayList) (obj)).iterator();
                categoryEntries.iterator();
label0:
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    int i = Integer.parseInt((String)((Iterator) (obj)).next());
                    Iterator iterator = categoryEntries.iterator();
                    Entries entries;
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            continue label0;
                        }
                        entries = (Entries)iterator.next();
                    } while (entries.getEntryId() != i || entries.getTitle().equals(""));
                    ((MyRegistryActivity)mActivity).getRegistryCategoryList().put(entries.getTitle(), null);
                } while (true);
            }
        }
        if (mListDetailVO != null && mListDetailVO.getListItems() != null)
        {
            Iterator iterator1 = mListDetailVO.getListItems().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                ListItem listitem = (ListItem)iterator1.next();
                if (mPurchasedMap != null && mPurchasedMap.containsKey(listitem.getItemId()))
                {
                    if (((Integer)mPurchasedMap.get(listitem.getItemId())).intValue() > listitem.getWantedQty().intValue())
                    {
                        mPurchasedMap.put(listitem.getItemId(), listitem.getWantedQty());
                    }
                    listitem.setTotalPurchaseQty((Integer)mPurchasedMap.get(listitem.getItemId()));
                }
                if (((MyRegistryActivity)mActivity).getRegistryCategoryList() != null && ((MyRegistryActivity)mActivity).getRegistryCategoryList().containsKey(listitem.getProperties().getCategoryname()))
                {
                    DashboardCategoryVO dashboardcategoryvo = (DashboardCategoryVO)((MyRegistryActivity)mActivity).getRegistryCategoryList().get(listitem.getProperties().getCategoryname());
                    if (dashboardcategoryvo == null)
                    {
                        dashboardcategoryvo = new DashboardCategoryVO();
                        ArrayList arraylist = new ArrayList();
                        arraylist.add(listitem);
                        dashboardcategoryvo.setListItems(arraylist);
                        dashboardcategoryvo.setTotalItems(listitem.getWantedQty().intValue());
                        dashboardcategoryvo.setPurchasedItems(listitem.getTotalPurchaseQty().intValue());
                    } else
                    {
                        ArrayList arraylist1 = dashboardcategoryvo.getListItems();
                        if (arraylist1 == null)
                        {
                            (new ArrayList()).add(listitem);
                        } else
                        {
                            arraylist1.add(listitem);
                        }
                        dashboardcategoryvo.setTotalItems(dashboardcategoryvo.getTotalItems() + listitem.getWantedQty().intValue());
                        dashboardcategoryvo.setPurchasedItems(dashboardcategoryvo.getPurchasedItems() + listitem.getTotalPurchaseQty().intValue());
                    }
                    ((MyRegistryActivity)mActivity).getRegistryCategoryList().put(listitem.getProperties().getCategoryname(), dashboardcategoryvo);
                }
            } while (true);
        }
        if (flag)
        {
            createNewProductsAdapter(mListDetailVO.getListItems());
        }
        refreshUI();
    }

    private void prepareListItem()
    {
        Iterator iterator = fulfillments.iterator();
        mPurchasedMap = new LinkedHashMap();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.kohls.mcommerce.opal.modules.lnr.framework.vo.FulfillmentActivityVO.Fulfillment fulfillment = (com.kohls.mcommerce.opal.modules.lnr.framework.vo.FulfillmentActivityVO.Fulfillment)iterator.next();
            if (fulfillment != null)
            {
                if (mPurchasedMap.containsKey(fulfillment.getItemId()))
                {
                    int i = ((Integer)mPurchasedMap.get(fulfillment.getItemId())).intValue();
                    mPurchasedMap.put(fulfillment.getItemId(), Integer.valueOf(fulfillment.getQuantity().intValue() + i));
                } else
                {
                    mPurchasedMap.put(fulfillment.getItemId(), fulfillment.getQuantity());
                }
            }
        } while (true);
        prepareDashboardList(true);
    }

    private void refreshUI()
    {
        calculateSortingPrice();
        String s;
        int i;
        if (calculateTotalItems() == 1)
        {
            s = getString(0x7f08030e);
        } else
        {
            s = getString(0x7f08030f);
        }
        if (mRegistryVO.getRegistryProperties().getProperties().isViewPurchased())
        {
            mTotalPurchasedItemsTxt.setText((new StringBuilder()).append(calculateTotalItems()).append(" ").append(s).append(" - ").append(calculatePurchasedItems()).append(" ").append(getString(0x7f0802e0)).toString());
        } else
        {
            mTotalPurchasedItemsTxt.setText((new StringBuilder()).append(calculateTotalItems()).append(" ").append(s).toString());
        }
        i = calculateOutOfStockItems();
        if (i > 0)
        {
            if (i == 1)
            {
                s = getString(0x7f08030e);
            } else
            {
                s = getString(0x7f08030f);
            }
            mRegOutOfStockView.setVisibility(0);
            mRegOutOfStockTxtView.setText(Html.fromHtml((new StringBuilder()).append("<u>").append(i).append(" ").append(s).append("</u>").toString()));
        } else
        {
            mRegOutOfStockView.setVisibility(4);
            mRegOutOfStockTxtView.setText("");
        }
        if (mListDetailVO == null || mListDetailVO.getListItems() == null || mListDetailVO.getListItems().size() == 0)
        {
            mNoListLayout.setVisibility(0);
            mTotalPurchasedItemsTxt.setVisibility(4);
            setToggelButtonState(true);
            if (mIsInGuestView)
            {
                mNoItemsTxtView.setText(getString(0x7f08031c));
                mGoShoppingBtn.setVisibility(4);
            } else
            if (mCurrentView == 1)
            {
                mGoShoppingBtn.setVisibility(0);
            } else
            {
                mGoShoppingBtn.setVisibility(4);
            }
        } else
        {
            mNoListLayout.setVisibility(8);
            mTotalPurchasedItemsTxt.setVisibility(0);
            setToggelButtonState(true);
        }
        if (mCurrentView == 0)
        {
            mSortByTxt.setEnabled(false);
            mSortByTxt.setTextColor(0xff888888);
            return;
        }
        if (mListDetailVO == null || mListDetailVO.getListItems() == null || mListDetailVO.getListItems().size() > 1)
        {
            mSortByTxt.setEnabled(true);
            mSortByTxt.setTextColor(-1);
            return;
        } else
        {
            mSortByTxt.setEnabled(false);
            mSortByTxt.setTextColor(0xff888888);
            return;
        }
    }

    private void sendRegistryViewAnalytics()
    {
        AnalyticsHelper.sendRegistryViewAnalytics(mRegistryVO, mIsInGuestView);
    }

    private void sendShareRegistryAnalytics()
    {
        AnalyticsHelper.sendShareRegistryAnalytics(mRegistryVO, mIsInGuestView);
    }

    private void setPrivacySettings()
    {
        if (!UtilityMethods.isNetworkConnected(mActivity))
        {
            ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803cd));
            return;
        } else
        {
            showLoader(true);
            mEditListImg.setClickable(false);
            requestOriginatedFromShare = true;
            isRegistryPublic = true;
            mUpdateRegistrySettingsControllerImpl.updateRegistry(getRegistryPO(), mRegId);
            return;
        }
    }

    private void setTitle()
    {
        if (mRegistryVO == null)
        {
            return;
        }
        String s3 = mRegistryVO.getRegistryProperties().getProperties().getRegtype();
        String s = "";
        String s2 = mRegistryVO.getRegistryProperties().getProperties().getCity();
        String s1 = s;
        if (s2 != null)
        {
            s1 = s;
            if (!TextUtils.isEmpty(s2))
            {
                s1 = s;
                if (!TextUtils.equals(s2, "null"))
                {
                    s1 = s2;
                }
            }
        }
        s2 = mRegistryVO.getRegistryProperties().getProperties().getState();
        s = s1;
        if (s2 != null)
        {
            s = s1;
            if (!TextUtils.isEmpty(s2))
            {
                s = s1;
                if (!TextUtils.equals(s2, "null"))
                {
                    if (TextUtils.isEmpty(s1))
                    {
                        s = s2;
                    } else
                    {
                        s = (new StringBuilder()).append(s1).append(",").append(s2).toString();
                    }
                }
            }
        }
        if (s3.equalsIgnoreCase("registry.baby"))
        {
            s1 = getString(0x7f080295);
            mRegCalenderImgView.setBackground(mActivity.getResources().getDrawable(0x7f020187));
            mDaysLeft.setTextColor(getResources().getColor(0x7f0c00ae));
        } else
        if (s3.equalsIgnoreCase("registry.wedding"))
        {
            s1 = getString(0x7f08038f);
            s = mRegistryVO.getRegistryProperties().getProperties().getEventLocation();
            mRegCalenderImgView.setBackground(mActivity.getResources().getDrawable(0x7f02018b));
            mDaysLeft.setTextColor(getResources().getColor(0x7f0c00a9));
        } else
        {
            s1 = getString(0x7f0802a4);
            mRegCalenderImgView.setBackground(mActivity.getResources().getDrawable(0x7f020188));
            mDaysLeft.setTextColor(getResources().getColor(0x7f0c00a8));
        }
        ((MyRegistryActivity)mActivity).getActionBarHelper().showActionBarForListDetail(s1);
        if (TextUtils.isEmpty(s) || TextUtils.equals(s, "null"))
        {
            mRegEventLocTxtView.setText("");
            mRegEventLocTxtView.setVisibility(4);
        } else
        {
            mRegEventLocTxtView.setText((new StringBuilder()).append(getString(0x7f08031e)).append(" ").append(s).toString());
        }
        ((MyRegistryActivity)mActivity).getActionBarHelper().getBackButtonView().setOnClickListener(this);
    }

    private void setToggelButtonState(boolean flag)
    {
        if (!flag)
        {
            mViewToggleListImageView.setImageResource(0x7f02013b);
            mViewToggleListImageView.setEnabled(false);
            mViewToggleGridImageView.setImageResource(0x7f0200bb);
            mViewToggleGridImageView.setEnabled(false);
            return;
        }
        switch (mCurrentView)
        {
        default:
            return;

        case 0: // '\0'
            if (((MyRegistryActivity)mActivity).getRegistryCategoryList() == null || ((MyRegistryActivity)mActivity).getRegistryCategoryList().size() == 0)
            {
                if (!mIsInGuestView)
                {
                    mNoListLayout.setVisibility(0);
                    mTotalPurchasedItemsTxt.setVisibility(4);
                    mGoShoppingBtn.setVisibility(4);
                    mNoItemsTxtView.setText(getString(0x7f080467));
                }
            } else
            {
                mNoListLayout.setVisibility(8);
            }
            mSortByTxt.setEnabled(false);
            mSortByTxt.setTextColor(0xff888888);
            mViewToggleDashboardImageView.setImageResource(0x7f020189);
            mViewToggleDashboardImageView.setEnabled(false);
            mViewToggleListImageView.setImageResource(0x7f02013b);
            mViewToggleListImageView.setEnabled(true);
            mViewToggleGridImageView.setImageResource(0x7f0200bb);
            mViewToggleGridImageView.setEnabled(true);
            return;

        case 1: // '\001'
            if (mListDetailVO == null || mListDetailVO.getListItems() == null || mListDetailVO.getListItems().size() > 1)
            {
                mSortByTxt.setEnabled(true);
                mSortByTxt.setTextColor(-1);
            } else
            {
                mSortByTxt.setEnabled(false);
                mSortByTxt.setTextColor(0xff888888);
            }
            if (mListDetailVO == null || mListDetailVO.getListItems() == null || mListDetailVO.getListItems().size() == 0)
            {
                mNoListLayout.setVisibility(0);
                mTotalPurchasedItemsTxt.setVisibility(4);
                if (mIsInGuestView)
                {
                    mNoItemsTxtView.setText(getString(0x7f08031c));
                    mGoShoppingBtn.setVisibility(4);
                } else
                {
                    mGoShoppingBtn.setVisibility(0);
                    mNoItemsTxtView.setText(getString(0x7f08031b));
                }
            } else
            {
                mTotalPurchasedItemsTxt.setVisibility(0);
                mNoListLayout.setVisibility(8);
            }
            mViewToggleDashboardImageView.setImageResource(0x7f02018a);
            mViewToggleDashboardImageView.setEnabled(true);
            mViewToggleListImageView.setImageResource(0x7f02013a);
            mViewToggleListImageView.setEnabled(false);
            mViewToggleGridImageView.setImageResource(0x7f0200bb);
            mViewToggleGridImageView.setEnabled(true);
            return;

        case 2: // '\002'
            break;
        }
        if (mListDetailVO == null || mListDetailVO.getListItems() == null || mListDetailVO.getListItems().size() > 1)
        {
            mSortByTxt.setEnabled(true);
            mSortByTxt.setTextColor(-1);
        } else
        {
            mSortByTxt.setEnabled(false);
            mSortByTxt.setTextColor(0xff888888);
        }
        if (mListDetailVO == null || mListDetailVO.getListItems() == null || mListDetailVO.getListItems().size() == 0)
        {
            mNoListLayout.setVisibility(0);
            mTotalPurchasedItemsTxt.setVisibility(4);
            if (mIsInGuestView)
            {
                mNoItemsTxtView.setText(getString(0x7f08031c));
                mGoShoppingBtn.setVisibility(4);
            } else
            {
                mGoShoppingBtn.setVisibility(0);
                mNoItemsTxtView.setText(getString(0x7f08031b));
            }
        } else
        {
            mTotalPurchasedItemsTxt.setVisibility(0);
            mNoListLayout.setVisibility(8);
        }
        mViewToggleDashboardImageView.setImageResource(0x7f02018a);
        mViewToggleDashboardImageView.setEnabled(true);
        mViewToggleListImageView.setImageResource(0x7f02013b);
        mViewToggleListImageView.setEnabled(true);
        mViewToggleGridImageView.setImageResource(0x7f0200ba);
        mViewToggleGridImageView.setEnabled(false);
    }

    private void showAddToBagProgressDialog()
    {
        UtilityMethods.showKohlsProgressDialog(4002, "", getString(0x7f080155), null, true, true, false, 4004, mActivity);
    }

    private void showInListView(int i, boolean flag)
    {
        mCurrentView = i;
        i;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 33
    //                   1 124
    //                   2 217;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        mProductsViewLayout = 0x7f0300e3;
        mListMatrixGridView.setNumColumns(1);
        setToggelButtonState(flag);
        if (((MyRegistryActivity)mActivity).getRegistryCategoryList() != null)
        {
            mRDPDashboardViewAdapter = new RDPDashboardViewAdapter(new WeakReference(mActivity), ((MyRegistryActivity)mActivity).getRegistryCategoryList(), this, mRegistryVO.getRegistryProperties().getProperties().isViewPurchased());
            mListMatrixGridView.setAdapter(mRDPDashboardViewAdapter);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        mProductsViewLayout = 0x7f0300e3;
        mListMatrixGridView.setNumColumns(1);
        setToggelButtonState(flag);
        if (mListDetailVO != null)
        {
            mRDPProductsAdapter = new RDPProductsAdapter(new WeakReference(mActivity), mListDetailVO.getListItems(), mProductsViewLayout, mlistDetailControllerImpl, mIsInGuestView, mRegistryVO.getRegistryProperties().getProperties().isViewPurchased());
            mListMatrixGridView.setAdapter(mRDPProductsAdapter);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        mProductsViewLayout = 0x7f0300e2;
        mListMatrixGridView.setNumColumns(2);
        setToggelButtonState(flag);
        if (mListDetailVO != null)
        {
            mRDPProductsAdapter = new RDPProductsAdapter(new WeakReference(mActivity), mListDetailVO.getListItems(), mProductsViewLayout, mlistDetailControllerImpl, mIsInGuestView, mRegistryVO.getRegistryProperties().getProperties().isViewPurchased());
            mListMatrixGridView.setAdapter(mRDPProductsAdapter);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void showLoader(boolean flag)
    {
        if (!flag)
        {
            mListMatrixGridView.setVisibility(0);
            mLoaderLayout.setVisibility(8);
            return;
        } else
        {
            mListMatrixGridView.setVisibility(8);
            mLoaderLayout.setVisibility(0);
            return;
        }
    }

    private void showProgressBar(boolean flag)
    {
        if (flag)
        {
            mMainLayout.setVisibility(0);
            return;
        } else
        {
            mMainLayout.setVisibility(8);
            return;
        }
    }

    private void toggleHeader(boolean flag)
    {
        if (flag)
        {
            showHeader();
            return;
        } else
        {
            hideHeader();
            return;
        }
    }

    private void updatePreviousBundleData()
    {
        if (mPrevFragmentOnScreen == FragmentOnScreen.REGISTRY_SEARCH_USER_RESULT && mCurrentRegistryIndex > -1 && mRegistryVO != null)
        {
            mUserRegistryWishList.remove(mCurrentRegistryIndex);
            mUserRegistryWishList.add(mCurrentRegistryIndex, mRegistryVO);
            Bundle bundle = ((MyRegistryActivity)mActivity).getBundle();
            bundle.putSerializable("searchresultusermap", mUserRegistryWishList);
            ((MyRegistryActivity)mActivity).setBundle(bundle);
        }
    }

    public void addSingleProductToRegistry(HashMap hashmap)
    {
        showProgressBar(true);
        hashmap = (String)hashmap.get("SCAN_PDP_BARCODE");
        AddSingleProductControllerImpl addsingleproductcontrollerimpl = new AddSingleProductControllerImpl(new WeakReference(this));
        if (mRegistryVO != null && mRegistryVO.getRegistryProperties() != null)
        {
            addsingleproductcontrollerimpl.addSingleProductToRegistry((new StringBuilder()).append(mRegId).append("").toString(), hashmap, (new StringBuilder()).append(LnRConstantValues.SKAVA_API_URL_REGISTRY).append("addItemsToList?").toString(), mRegistryVO.getRegistryProperties().getProperties().getRegtype(), mRegistryVO.getRegistryProperties().getProperties().getCustomEventType(), null);
        }
    }

    public void addToShoppingBag(int i, String s, String s1)
    {
        RegistryObject registryobject = new RegistryObject();
        registryobject.setRegistryID((new StringBuilder()).append(mRegistryVO.getListId()).append("").toString());
        registryobject.setRegistryName(mRegistryVO.getListName());
        String s2 = mRegistryVO.getRegistryProperties().getProperties().getRegtype();
        if (s2.equalsIgnoreCase("registry.baby"))
        {
            registryobject.setRegistryType("baby");
        } else
        if (s2.equalsIgnoreCase("registry.wedding"))
        {
            registryobject.setRegistryType("bridal");
        } else
        {
            registryobject.setRegistryType("specialevent");
        }
        registryobject.setWantedQty((new StringBuilder()).append(i).append("").toString());
        registryobject.setShipToId(mRegistryVO.getRegistryProperties().getShipmentAddress().getID());
        mlistDetailControllerImpl.addToShoppingBag(i, s, s1, registryobject);
        showAddToBagProgressDialog();
    }

    public void changeItemPriority(String s, int i, int j)
    {
        if (!UtilityMethods.isNetworkConnected(mActivity))
        {
            Toast.makeText(mActivity, getResources().getString(0x7f0803cd), 0).show();
            mRDPProductsAdapter.notifyDataSetChanged();
            return;
        } else
        {
            showLoader(true);
            mUpdateListItemQtyControllerImpl.updateItemQuantity(mRegId, s, i, j);
            return;
        }
    }

    public void createNewProductsAdapter(List list)
    {
        switch (mCurrentView)
        {
        default:
            return;

        case 0: // '\0'
            mRDPDashboardViewAdapter = new RDPDashboardViewAdapter(new WeakReference(mActivity), ((MyRegistryActivity)mActivity).getRegistryCategoryList(), this, mRegistryVO.getRegistryProperties().getProperties().isViewPurchased());
            mListMatrixGridView.setAdapter(mRDPDashboardViewAdapter);
            return;

        case 1: // '\001'
            mRDPProductsAdapter = new RDPProductsAdapter(new WeakReference(mActivity), list, 0x7f0300e3, mlistDetailControllerImpl, mIsInGuestView, mRegistryVO.getRegistryProperties().getProperties().isViewPurchased());
            mListMatrixGridView.setAdapter(mRDPProductsAdapter);
            return;

        case 2: // '\002'
            mRDPProductsAdapter = new RDPProductsAdapter(new WeakReference(mActivity), list, 0x7f0300e2, mlistDetailControllerImpl, mIsInGuestView, mRegistryVO.getRegistryProperties().getProperties().isViewPurchased());
            break;
        }
        mListMatrixGridView.setAdapter(mRDPProductsAdapter);
    }

    public void deleteItem(ListItem listitem)
    {
        if (!UtilityMethods.isNetworkConnected(mActivity))
        {
            Toast.makeText(mActivity, getResources().getString(0x7f0803cd), 0).show();
            return;
        }
        mItemToBeDeleted = listitem;
        mDeleteListItemControllerImpl.deleteListItem(mRegistryVO.getListId(), listitem.getItemId(), false);
        showLoader(true);
        listitem = LnRUtility.getRegistryName(mRegistryType);
        String s = (new StringBuilder()).append("registry:").append(listitem).append(":").append(mRegId).append("|owner").toString();
        Object obj = null;
        listitem = obj;
        if (KohlsPhoneApplication.getInstance().getKohlsPref().getCartID() != null)
        {
            listitem = obj;
            if (UtilityMethods.isOmniChannelBagClientEnabled())
            {
                listitem = KohlsPhoneApplication.getInstance().getKohlsPref().getCartID();
            }
        }
        AnalyticsHelper.sendAnalyticsForRemoveItemFromRegistry("actions.removeFromList", listitem, ScreenNames.REGISTRY_ITEM_REMOVE, "registry|registry remove", s, "1");
    }

    public void hideHeader()
    {
        if (!mIsHeaderHidden)
        {
            mMinHeaderAnimateY = mHiddenLayout.getHeight() + mActionBarHeight;
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mHeaderLayout, "translationY", new float[] {
                0.0F, -mMinHeaderAnimateY
            });
            objectanimator.setDuration(200L);
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mHiddenLayout, View.SCALE_Y, new float[] {
                1.0F, 0.0F
            });
            ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(mContentParentView.getChildAt(1), "translationY", new float[] {
                0.0F, (float)(-mActionBarHeight)
            });
            objectanimator.setDuration(200L);
            objectanimator1.setDuration(200L);
            objectanimator2.setDuration(200L);
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.play(objectanimator).with(objectanimator1).with(objectanimator2);
            animatorset.addListener(new _cls4());
            animatorset.start();
        }
    }

    protected void initializeAttributes()
    {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            mRegistryVO = (com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList)bundle.getSerializable("registry object");
            if (mRegistryVO != null)
            {
                mRegId = mRegistryVO.getListId();
                isRegistryPublic = mRegistryVO.isPublic();
                mRegistryType = mRegistryVO.getRegistryProperties().getProperties().getRegtype();
            }
            mOriginFragmentFindRegistry = bundle.getInt("origin_from_fragment_find_registry_user", -1);
            if (mOriginFragmentFindRegistry > -1 && FragmentOnScreen.values()[mOriginFragmentFindRegistry] == FragmentOnScreen.REGISTRY_SEARCH_USER_RESULT)
            {
                mPrevFragmentOnScreen = FragmentOnScreen.REGISTRY_SEARCH_USER_RESULT;
                mUserRegistryWishList = (ArrayList)bundle.getSerializable("searchresultusermap");
                mCurrentRegistryIndex = bundle.getInt("registry_search_current_item_position", -1);
            }
            mOriginOfRequest = bundle.getInt("origin_of_fragment", -1);
            String s = bundle.getString("registry_owner_userid");
            if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() && KohlsPhoneApplication.getInstance().getAuthenticationUtils().checkUserSessionValid() && !TextUtils.isEmpty(s) && TextUtils.equals(s, KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserID()))
            {
                mIsInGuestView = false;
            }
            ((MyRegistryActivity)mActivity).setBundle(bundle);
        }
        requestOriginatedFromShare = false;
        sendRegistryViewAnalytics();
    }

    protected void initializeController()
    {
        LocalBroadcastManager.getInstance(mActivity).registerReceiver(mDataUpdateReceiver, new IntentFilter("list_data_updated"));
        mlistDetailControllerImpl = (ListDetailControllerImpl)ControllerFactory.getListDetailController(new WeakReference(this));
        mUpdateRegistrySettingsControllerImpl = (CreateOrUpdateRegistryControllerImpl)ControllerFactory.getCreateRegistryController(new WeakReference(this));
        mDeleteListItemControllerImpl = (DeleteListItemControllerImpl)ControllerFactory.getDeleteListItemController(new WeakReference(this));
        mUpdateListItemQtyControllerImpl = (UpdateListItemQtyControllerImpl)ControllerFactory.getUpdateListItemQtyController(new WeakReference(this));
        mGetRegCategoryController = (GetRegistryCategoriesControllerImpl)ControllerFactory.getRegistryCategoriesController(new WeakReference(this));
        mGetRegistryFulfillmentActivityControllerImpl = (GetRegistryFulfillmentActivityControllerImpl)ControllerFactory.getFulfillmentActivityController(new WeakReference(this));
    }

    protected void initializeViews(Bundle bundle)
    {
        fragment = this;
        mMainLayout = getFragmentView().findViewById(0x7f0d02c7);
        mListMatrixGridView = (StickyGridHeadersGridView)getFragmentView().findViewById(0x7f0d02dd);
        mLoaderLayout = (LinearLayout)getFragmentView().findViewById(0x7f0d02e8);
        mNoListLayout = (RelativeLayout)getFragmentView().findViewById(0x7f0d02e9);
        mViewToggleDashboardImageView = (ImageView)getFragmentView().findViewById(0x7f0d02e2);
        mViewToggleListImageView = (ImageView)getFragmentView().findViewById(0x7f0d02e3);
        mViewToggleGridImageView = (ImageView)getFragmentView().findViewById(0x7f0d02e4);
        mHiddenLayout = (LinearLayout)getFragmentView().findViewById(0x7f0d02df);
        mHeaderLayout = (LinearLayout)getFragmentView().findViewById(0x7f0d02de);
        mRegistrantsTxtView = (TextView)getFragmentView().findViewById(0x7f0d02b4);
        mRegIdTxtView = (TextView)getFragmentView().findViewById(0x7f0d02b5);
        mRegEventDateTxtView = (TextView)getFragmentView().findViewById(0x7f0d02b6);
        mRegEventLocTxtView = (TextView)getFragmentView().findViewById(0x7f0d02b7);
        mDaysLeft = (TextView)getFragmentView().findViewById(0x7f0d02bd);
        mCalenderView = (FrameLayout)getFragmentView().findViewById(0x7f0d02bb);
        mEditListImg = (ImageView)getFragmentView().findViewById(0x7f0d02ba);
        mRegOutOfStockTxtView = (TextView)getFragmentView().findViewById(0x7f0d02b9);
        mRegOutOfStockView = getFragmentView().findViewById(0x7f0d02b8);
        mRegCalenderImgView = (ImageView)getFragmentView().findViewById(0x7f0d02bc);
        mContentParentView = (ViewGroup)mActivity.findViewById(0x1020002).getParent();
        mSortByTxt = (TextView)getFragmentView().findViewById(0x7f0d02e5);
        mTotalPurchasedItemsTxt = (TextView)getFragmentView().findViewById(0x7f0d02e7);
        mScanIcon = (ImageView)getFragmentView().findViewById(0x7f0d0406);
        mProductSearchView = (CustomSearchView)getFragmentView().findViewById(0x7f0d066d);
        mShareRegistryView = (TextView)getFragmentView().findViewById(0x7f0d02e6);
        mGoShoppingBtn = (Button)getFragmentView().findViewById(0x7f0d02eb);
        mNoItemsTxtView = (TextView)getFragmentView().findViewById(0x7f0d02ea);
        if (mIsInGuestView)
        {
            mViewToggleDashboardImageView.setVisibility(8);
            mCurrentView = 1;
        } else
        {
            mCurrentView = 0;
            mViewToggleDashboardImageView.setVisibility(0);
        }
        showInListView(mCurrentView, false);
        mHiddenLayout.setOnTouchListener(new _cls1());
        mProductSearchView.setHint(mActivity.getString(0x7f0802ba));
        mProductSearchView.setFocusable(false);
        mProductSearchView.setOnClickListener(this);
        mScanIcon.setOnClickListener(this);
        mActionBarHeight = UtilityMethods.getActionBarHeight(mActivity);
        mListMatrixGridView.setAreHeadersSticky(false);
        mListMatrixGridView.setOnScrollListener(mGridViewScrollListener);
        mViewToggleDashboardImageView.setOnClickListener(this);
        mViewToggleListImageView.setOnClickListener(this);
        mViewToggleGridImageView.setOnClickListener(this);
        mGoShoppingBtn.setOnClickListener(this);
        mSortByTxt.setOnClickListener(this);
        mSelectedSortOption = 0;
        mShareRegistryView.setOnClickListener(this);
        mEditListImg.setOnClickListener(this);
        getFragmentView().getViewTreeObserver().addOnPreDrawListener(new _cls2());
        attachActionItemListener();
        toggleHeader(true);
    }

    protected int intializaLayoutId()
    {
        return 0x7f03007b;
    }

    protected void loadContent()
    {
        ((MyRegistryActivity)mActivity).getActionBarHelper().showActionBarForListDetail("");
        if (mRegistryVO != null)
        {
            setTitle();
            initializeHeaderAndLoadProducts();
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        switch (i)
        {
        default:
            return;

        case 8004: 
            break;
        }
        if (j == 0)
        {
            mActivity.finish();
            return;
        } else
        {
            mRegistryVO = (com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList)intent.getExtras().getSerializable("registry object");
            refreshUI();
            setTitle();
            initializeHeaderAndLoadProducts();
            updatePreviousBundleData();
            return;
        }
    }

    public void onActivityResultCallback(int i, int j, Intent intent)
    {
label0:
        {
            intent = (HashMap)intent.getExtras().getSerializable("SCAN_DATA");
            if (intent != null && intent.containsKey("SCAN_PDP_BARCODE"))
            {
                if (UtilityMethods.isNetworkConnected(mActivity.getApplicationContext()))
                {
                    break label0;
                }
                UtilityMethods.showToast(mActivity, mActivity.getResources().getString(0x7f0803cd), 0);
            }
            return;
        }
        addSingleProductToRegistry(intent);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mActivity = activity;
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        setPrivacySettings();
    }

    public void onClick(View view)
    {
        Object obj = ((MyRegistryActivity)mActivity).getFragmentOnScreen();
        view.getId();
        JVM INSTR lookupswitch 10: default 104
    //                   2131559098: 577
    //                   2131559138: 105
    //                   2131559139: 112
    //                   2131559140: 119
    //                   2131559141: 126
    //                   2131559142: 505
    //                   2131559147: 566
    //                   2131559430: 300
    //                   2131559580: 350
    //                   2131560045: 231;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        return;
_L3:
        showInListView(0, true);
        return;
_L4:
        showInListView(1, true);
        return;
_L5:
        showInListView(2, true);
        return;
_L6:
        if (mListDetailVO != null && mListDetailVO.getListItems() != null && mListDetailVO.getListItems().size() > 1)
        {
            Logger.debug("LnR", "Sort by option tapped");
            view = mActivity.getFragmentManager();
            obj = new LnRListSortingDialog(getResources().getStringArray(0x7f0a0015));
            ((LnRListSortingDialog) (obj)).setTargetFragment(this, 1);
            Bundle bundle = new Bundle();
            bundle.putInt("SelectedSortOption", mSelectedSortOption);
            ((LnRListSortingDialog) (obj)).setArguments(bundle);
            ((LnRListSortingDialog) (obj)).show(view, "dialog");
            return;
        }
          goto _L1
_L11:
        view = new Bundle();
        view.putString("search_key", mProductSearchView.getText().toString());
        if (mIsInGuestView)
        {
            ((MyRegistryActivity)mActivity).setActivityResultCallback(null);
        } else
        {
            ((MyRegistryActivity)mActivity).setActivityResultCallback(this);
        }
        ((MyRegistryActivity)mActivity).attachSearchFragment(view);
        return;
_L9:
        if (mIsInGuestView)
        {
            ((MyRegistryActivity)mActivity).setActivityResultCallback(null);
        } else
        {
            ((MyRegistryActivity)mActivity).setActivityResultCallback(this);
        }
        UtilityMethods.openScanActivity(mActivity, 1001, String.valueOf(mRegId));
        return;
_L10:
        if (obj == FragmentOnScreen.REGISTRY_PRODUCT_SEARCH)
        {
            ((MyRegistryActivity)mActivity).popSearchFragmentIfVisible();
            return;
        }
        if (mOriginOfRequest > -1 && (FragmentOnScreen.values()[mOriginOfRequest] == FragmentOnScreen.HOME || FragmentOnScreen.values()[mOriginOfRequest] == FragmentOnScreen.ABOUT_REGISTRY_FRAGMENT))
        {
            mActivity.finish();
            return;
        }
        if (mOriginOfRequest > -1 && FragmentOnScreen.values()[mOriginOfRequest] == FragmentOnScreen.REGISTRY_SEARCH_USER_RESULT)
        {
            mActivity.finish();
            return;
        }
        if (mOriginFragmentFindRegistry > -1 && FragmentOnScreen.values()[mOriginFragmentFindRegistry] == FragmentOnScreen.REGISTRY_SEARCH_USER_RESULT)
        {
            getArguments().putSerializable("searchresultusermap", mUserRegistryWishList);
            ((MyRegistryActivity)mActivity).attachSearchUserRegistryResultFragment(getArguments());
            return;
        } else
        {
            ((MyRegistryActivity)mActivity).attachManagRegistryFragment(null);
            return;
        }
_L7:
        sendShareRegistryAnalytics();
        isRegistryPublic = mRegistryVO.isPublic();
        if (!isRegistryPublic)
        {
            LnRUtility.displayAlertDialog(mActivity, "", getString(0x7f080468), getString(0x7f0802dd), getString(0x7f0802dc), this, null);
            return;
        } else
        {
            openShareRegistry();
            return;
        }
_L8:
        ((MyRegistryActivity)mActivity).goToHome();
        return;
_L2:
        Object obj1 = ((MyRegistryActivity)mActivity).getRegistryDashboardValueObject();
        view = new Bundle();
        view.putSerializable("registry object", mRegistryVO);
        if (obj1 != null)
        {
            view.putSerializable("entry object", ((RegistryDashboardValueGenerator) (obj1)).getEntries());
        }
        if (mListDetailVO != null)
        {
            view.putSerializable("list items object", mListDetailVO.getListItems());
        }
        obj1 = new Intent(mActivity, com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/RegistrySettingActivity);
        ((Intent) (obj1)).putExtras(view);
        startActivityForResult(((Intent) (obj1)), 8004);
        return;
    }

    public void onDestroy()
    {
        super.onDestroy();
        LocalBroadcastManager.getInstance(mActivity).unregisterReceiver(mDataUpdateReceiver);
    }

    public void onDestroyView()
    {
        toggleHeader(true);
        super.onDestroyView();
    }

    public void onResume()
    {
        super.onResume();
        mActivity.getWindow().setSoftInputMode(3);
        if (mIsDataRefreshReqd)
        {
            createAddedMap();
            mIsDataRefreshReqd = false;
        }
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() && KohlsPhoneApplication.getInstance().getAuthenticationUtils().checkUserSessionValid() && mIsInGuestView)
        {
            Object obj = getArguments();
            initializeAttributes();
            initializeViews(((Bundle) (obj)));
            initializeController();
            loadContent();
            createAddedMap();
            mIsDataRefreshReqd = false;
            obj = ((Bundle) (obj)).getString("registry_owner_userid");
            if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() && KohlsPhoneApplication.getInstance().getAuthenticationUtils().checkUserSessionValid() && !TextUtils.isEmpty(((CharSequence) (obj))) && TextUtils.equals(((CharSequence) (obj)), KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserID()))
            {
                mIsInGuestView = false;
            }
        }
        ((MyRegistryActivity)mActivity).getActionBarHelper().updateShopingBagCount();
    }

    public void onSortOptionSelected(int i)
    {
        mSelectedSortOption = i;
        i;
        JVM INSTR tableswitch 0 6: default 48
    //                   0 60
    //                   1 83
    //                   2 106
    //                   3 129
    //                   4 152
    //                   5 175
    //                   6 214;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        createNewProductsAdapter(mListDetailVO.getListItems());
        return;
_L2:
        Collections.sort(mListDetailVO.getListItems(), new ListItemSorting(SortingType.SORT_BY_RECENTLY_ADDED));
        continue; /* Loop/switch isn't completed */
_L3:
        Collections.sort(mListDetailVO.getListItems(), new ListItemSorting(SortingType.SORT_BY_BRAND_A_TO_Z));
        continue; /* Loop/switch isn't completed */
_L4:
        Collections.sort(mListDetailVO.getListItems(), new ListItemSorting(SortingType.SORT_BY_BRAND_Z_TO_A));
        continue; /* Loop/switch isn't completed */
_L5:
        Collections.sort(mListDetailVO.getListItems(), new ListItemSorting(SortingType.SORT_BY_PRICE_LOW_TO_HIGH));
        continue; /* Loop/switch isn't completed */
_L6:
        Collections.sort(mListDetailVO.getListItems(), new ListItemSorting(SortingType.SORT_BY_PRICE_HIGH_TO_LOW));
        continue; /* Loop/switch isn't completed */
_L7:
        if (mRegistryVO.getRegistryProperties().getProperties().isViewPurchased())
        {
            Collections.sort(mListDetailVO.getListItems(), new ListItemSorting(SortingType.SORT_BY_NOT_YET_PURCHASED));
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (mRegistryVO.getRegistryProperties().getProperties().isViewPurchased())
        {
            Collections.sort(mListDetailVO.getListItems(), new ListItemSorting(SortingType.SORT_BY_PURCHASED));
        }
        if (true) goto _L1; else goto _L9
_L9:
    }

    public void onStart()
    {
        super.onStart();
    }

    public void showHeader()
    {
        if (mIsHeaderHidden)
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mContentParentView.getChildAt(1), "translationY", new float[] {
                (float)(-mActionBarHeight), 0.0F
            });
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mHeaderLayout, "translationY", new float[] {
                -mMinHeaderAnimateY, 0.0F
            });
            ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(mHiddenLayout, View.SCALE_Y, new float[] {
                0.0F, 1.0F
            });
            objectanimator.setDuration(200L);
            objectanimator1.setDuration(200L);
            objectanimator2.setDuration(200L);
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.play(objectanimator1).with(objectanimator2).with(objectanimator);
            animatorset.addListener(new _cls5());
            animatorset.start();
        }
    }

    public void updateViewsOnFailure(Object obj)
    {
        dismissDialog();
        showLoader(false);
        showProgressBar(false);
        if (!(obj instanceof Error))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        if (ErrorHelper.isApplicationManagable((Error)obj))
        {
            break MISSING_BLOCK_LABEL_395;
        }
        if (!((Error)obj).getMessage().equals(""))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        Toast.makeText(mActivity, getResources().getString(0x7f0803be), 0).show();
_L1:
        mRDPProductsAdapter.notifyDataSetChanged();
        return;
        try
        {
            Toast.makeText(mActivity, ((Error)obj).getMessage(), 0).show();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Toast.makeText(mActivity, getResources().getString(0x7f0803be), 0).show();
            return;
        }
          goto _L1
        if (obj instanceof ProductMatrixVO)
        {
            if (((ProductMatrixVO)obj).getErrors() != null && ((ProductMatrixVO)obj).getErrors().size() > 0 && ((ErrorVO)((ProductMatrixVO)obj).getErrors().get(0)).getMessage() != null)
            {
                Toast.makeText(mActivity, ((Error)obj).getMessage(), 0).show();
                return;
            }
            break MISSING_BLOCK_LABEL_395;
        }
        Activity activity;
        if (!(obj instanceof CreateListVO))
        {
            break MISSING_BLOCK_LABEL_248;
        }
        obj = ((CreateListVO)obj).getResponseMessage();
        activity = mActivity;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        if (!"".equals(obj))
        {
            break MISSING_BLOCK_LABEL_234;
        }
_L3:
        UtilityMethods.showToast(activity, ((String) (obj)), 0);
        return;
        obj = getResources().getString(0x7f0803be);
        if (true) goto _L3; else goto _L2
_L2:
        if (!(obj instanceof DeleteListItemVO))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj = ((DeleteListItemVO)obj).getResponseMessage();
        activity = mActivity;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_289;
        }
        if (!"".equals(obj))
        {
            break MISSING_BLOCK_LABEL_289;
        }
_L5:
        UtilityMethods.showToast(activity, ((String) (obj)), 0);
        return;
        obj = getResources().getString(0x7f0803be);
        if (true) goto _L5; else goto _L4
_L4:
        if (obj instanceof MyRegistryVO)
        {
            obj = (MyRegistryVO)obj;
            UtilityMethods.showToast(mActivity, ((MyRegistryVO) (obj)).getResponseMessage(), 0);
            mEditListImg.setClickable(true);
            mActivity.finish();
            return;
        }
        if (obj instanceof ProductDetailVO)
        {
            obj = (ProductDetailVO)obj;
            if (((ProductDetailVO) (obj)).getErrors() != null && ((ProductDetailVO) (obj)).getErrors().size() > 0)
            {
                Toast.makeText(mActivity, getResources().getString(0x7f0804a8), 0).show();
            }
        }
    }

    public void updateViewsOnSuccess(Object obj)
    {
        showLoader(false);
        if (!(obj instanceof ListDetailVO)) goto _L2; else goto _L1
_L1:
        mListDetailVO = (ListDetailVO)obj;
        if (mListDetailVO == null) goto _L4; else goto _L3
_L3:
        mListDetailVO.getResponseCode().intValue();
        JVM INSTR lookupswitch 3: default 72
    //                   -100: 140
    //                   0: 73
    //                   100: 83;
           goto _L4 _L5 _L6 _L7
_L4:
        return;
_L6:
        loadPurchaseCount();
        mIsDataRefreshReqd = false;
        return;
_L7:
        Activity activity = getActivity();
        if (mListDetailVO.getResponseMessage() != null && mListDetailVO.getResponseMessage().length() > 0)
        {
            obj = mListDetailVO.getResponseMessage();
        } else
        {
            obj = getResources().getString(0x7f0803be);
        }
        UtilityMethods.showToast(activity, ((String) (obj)), 0);
        return;
_L5:
        UtilityMethods.showToast(getActivity(), getResources().getString(0x7f0803be), 0);
        return;
_L2:
        if (!(obj instanceof DeleteListItemVO))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (DeleteListItemVO)obj;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        switch (((DeleteListItemVO) (obj)).getResponseCode())
        {
        default:
            return;

        case -100: 
            UtilityMethods.showToast(getActivity(), getResources().getString(0x7f0803be), 0);
            return;

        case 0: // '\0'
            if (mListDetailVO != null && mListDetailVO != null)
            {
                mListDetailVO.getListItems().remove(mItemToBeDeleted);
                mRDPProductsAdapter.setProductsList(mListDetailVO.getListItems());
                mRDPProductsAdapter.notifyDataSetChanged();
                loadPurchaseCount();
                return;
            }
            break;

        case 100: // 'd'
            Activity activity1 = getActivity();
            if (((DeleteListItemVO) (obj)).getResponseMessage() != null && ((DeleteListItemVO) (obj)).getResponseMessage().length() > 0)
            {
                obj = ((DeleteListItemVO) (obj)).getResponseMessage();
            } else
            {
                obj = getResources().getString(0x7f0803be);
            }
            UtilityMethods.showToast(activity1, ((String) (obj)), 0);
            return;
        }
        if (true) goto _L4; else goto _L8
_L8:
        if (!(obj instanceof UpdateListItemVO))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (UpdateListItemVO)obj;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        switch (((UpdateListItemVO) (obj)).getResponseCode())
        {
        default:
            return;

        case -100: 
            UtilityMethods.showToast(getActivity(), getResources().getString(0x7f0803be), 0);
            return;

        case 0: // '\0'
            if (mListDetailVO != null && ((UpdateListItemVO) (obj)).getListItems() != null && ((UpdateListItemVO) (obj)).getListItems().size() > 0)
            {
                obj = (ListItem)((UpdateListItemVO) (obj)).getListItems().get(0);
                Object obj1 = mListDetailVO.getListItems();
                if (obj1 != null)
                {
                    obj1 = ((List) (obj1)).iterator();
                    do
                    {
                        if (!((Iterator) (obj1)).hasNext())
                        {
                            break;
                        }
                        ListItem listitem = (ListItem)((Iterator) (obj1)).next();
                        if (listitem.getItemId().equals(((ListItem) (obj)).getItemId()))
                        {
                            listitem.setPriority(((ListItem) (obj)).getPriority());
                        }
                    } while (true);
                }
                mRDPProductsAdapter.setProductsList(mListDetailVO.getListItems());
                mRDPProductsAdapter.notifyDataSetChanged();
                return;
            }
            break;

        case 100: // 'd'
            Activity activity2 = getActivity();
            if (((UpdateListItemVO) (obj)).getResponseMessage() != null && ((UpdateListItemVO) (obj)).getResponseMessage().length() > 0)
            {
                obj = ((UpdateListItemVO) (obj)).getResponseMessage();
            } else
            {
                obj = getResources().getString(0x7f0803be);
            }
            UtilityMethods.showToast(activity2, ((String) (obj)), 0);
            return;
        }
        if (true) goto _L4; else goto _L9
_L9:
        if (!(obj instanceof MyRegistryVO))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (MyRegistryVO)obj;
        switch (((MyRegistryVO) (obj)).getResponseCode())
        {
        default:
            return;

        case -100: 
            UtilityMethods.showToast(getActivity(), getResources().getString(0x7f0803be), 0);
            return;

        case 0: // '\0'
            mRegistryVO.setPublic(isRegistryPublic);
            updatePreviousBundleData();
            setTitle();
            initializeHeaderAndLoadProducts();
            if (requestOriginatedFromShare)
            {
                requestOriginatedFromShare = false;
                mEditListImg.setClickable(true);
                openShareRegistry();
                return;
            }
            break;

        case 100: // 'd'
            Activity activity3 = getActivity();
            if (((MyRegistryVO) (obj)).getResponseMessage() != null && ((MyRegistryVO) (obj)).getResponseMessage().length() > 0)
            {
                obj = ((MyRegistryVO) (obj)).getResponseMessage();
            } else
            {
                obj = getResources().getString(0x7f0803be);
            }
            UtilityMethods.showToast(activity3, ((String) (obj)), 0);
            return;
        }
        if (true) goto _L4; else goto _L10
_L10:
        if (obj instanceof AddRegistryVO)
        {
            showProgressBar(false);
            if (((AddRegistryVO)obj).getResponseMessage() != null && ((AddRegistryVO)obj).getResponseMessage().contains("Successfully"))
            {
                ToastUtility.showCustomToast(mActivity.getActionBar().getHeight(), mActivity.getResources().getString(0x7f08046d));
                loadProducts();
                return;
            } else
            {
                UtilityMethods.showToast(mActivity, getString(0x7f080472), 1);
                return;
            }
        }
        if (obj instanceof String)
        {
            ToastUtility.showAddToBagToastMessages(mActivity.getActionBar().getHeight(), (String)obj);
            dismissDialog();
            ((MyRegistryActivity)mActivity).getActionBarHelper().updateShopingBagCount();
            return;
        }
        if (obj instanceof RegistryCategoriesVO)
        {
            showProgressBar(false);
            mRegCategoriesVO = (RegistryCategoriesVO)obj;
            categoryEntries = mRegCategoriesVO.getEntries();
            createAddedMap();
            return;
        }
        if (obj instanceof FulfillmentActivityVO)
        {
            showProgressBar(false);
            fulfillmentActivityVO = (FulfillmentActivityVO)obj;
            fulfillments = fulfillmentActivityVO.getFulfillments();
            prepareListItem();
            return;
        }
        if (true) goto _L4; else goto _L11
_L11:
    }











/*
    static boolean access$202(RegistryDetailFragment registrydetailfragment, boolean flag)
    {
        registrydetailfragment.mIsDataRefreshReqd = flag;
        return flag;
    }

*/


/*
    static boolean access$302(RegistryDetailFragment registrydetailfragment, boolean flag)
    {
        registrydetailfragment.mIsHeaderHidden = flag;
        return flag;
    }

*/





/*
    static int access$602(RegistryDetailFragment registrydetailfragment, int i)
    {
        registrydetailfragment.mLastVisibleItem = i;
        return i;
    }

*/



/*
    static com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPropertiesPO.DashboardPO access$802(RegistryDetailFragment registrydetailfragment, com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPropertiesPO.DashboardPO dashboardpo)
    {
        registrydetailfragment.mDashboardPO = dashboardpo;
        return dashboardpo;
    }

*/



/*
    static ArrayList access$902(RegistryDetailFragment registrydetailfragment, ArrayList arraylist)
    {
        registrydetailfragment.categoryEntries = arraylist;
        return arraylist;
    }

*/

    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls5 {}

}
