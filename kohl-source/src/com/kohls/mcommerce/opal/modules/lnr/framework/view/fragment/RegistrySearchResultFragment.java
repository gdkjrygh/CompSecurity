// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.analytics.AnalyticsMain;
import com.analytics.utils.enums.ProductFindingMethod;
import com.analytics.utils.enums.ScreenNames;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.components.CustomSearchView;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.FontUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.framework.vo.LnRRecentSearchVO;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.helper.db.custom.DBLnRRecentSearchHelper;
import com.kohls.mcommerce.opal.modules.lnr.common.util.LnRRegistryFilter;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.ListDetailControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.RegistrySearchResultControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.listener.ActivityResultCallback;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyRegistryActivity;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.ManageRegistryVO;
import com.kohls.mcommerce.opal.modules.lnr.helper.adapter.RegistrySearchResultsAdapter;
import com.kohls.mcommerce.opal.modules.lnr.helper.registry.FindRegistryHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RegistrySearchResultFragment extends BaseFragment
    implements ActivityResultCallback
{

    private Map filteredResultsGroup;
    private Map findRegistryResultsGroup;
    private boolean isBabySelected;
    private boolean isCelebrationSelected;
    private boolean isOriginatedFromFilter;
    private boolean isRequestFromScan;
    private boolean isWeddingSelected;
    private RelativeLayout mEmptySearchResultLayout;
    private TextView mEmptySearchTextView;
    private TextView mFilterTextView;
    private CustomSearchView mListSearchView;
    private View mProgressBarView;
    private RegistrySearchResultControllerImpl mRegistrySearchResultController;
    private TextView mResultCountTextView;
    private ImageView mScanView;
    private String mSearchKeyword;
    private String mSearchNoResultKeyword;
    private ListView mSearchResultListView;
    private ManageRegistryVO mSearchResultsRegistryVO;
    private String mSearchValueFirstName;
    private String mSearchValueLastName;
    private String mSearchValueRegistryId;
    private String mSearchValueRegistrytype;
    private String mSearchValueState;
    private ListDetailControllerImpl mlistDetailControllerImpl;

    public RegistrySearchResultFragment()
    {
        findRegistryResultsGroup = new TreeMap();
        filteredResultsGroup = new TreeMap();
        mSearchValueFirstName = "";
        mSearchValueLastName = "";
        mSearchValueState = "";
        mSearchValueRegistrytype = "";
        mSearchValueRegistryId = "";
        isRequestFromScan = false;
    }

    private void findSearchValuesFromKeyword(String s)
    {
        if (s != null && s.matches("\\d+"))
        {
            mSearchValueRegistryId = s;
            return;
        }
        int i = s.indexOf(' ');
        if (i > -1 && i < s.length())
        {
            mSearchValueFirstName = s.substring(0, s.indexOf(' '));
            mSearchValueLastName = s.substring(s.indexOf(' ') + 1);
            return;
        } else
        {
            mSearchValueFirstName = s;
            return;
        }
    }

    private String generateEmptySearchResultKeyword(String s, String s1)
    {
        if (mSearchKeyword.equals(""))
        {
            if (!s.equals(""))
            {
                return s;
            } else
            {
                return s1;
            }
        } else
        {
            return mSearchKeyword;
        }
    }

    private String generateSearchKeywordForDisplay(String s, String s1)
    {
label0:
        {
            String s2 = "";
            if (!s.equals(""))
            {
                s2 = s;
            }
            s = s2;
            if (!s1.equals(""))
            {
                if (s2.equals(""))
                {
                    break label0;
                }
                s = (new StringBuilder()).append(s2).append(" ").append(s1).toString();
            }
            return s;
        }
        return s1;
    }

    private void handleUIUpdatesByResult(int i, Map map, boolean flag)
    {
        if (findRegistryResultsGroup != null && !findRegistryResultsGroup.isEmpty() && findRegistryResultsGroup.size() > 0)
        {
            mFilterTextView.setVisibility(0);
        } else
        {
            mFilterTextView.setVisibility(8);
        }
        if (i > 0)
        {
            mResultCountTextView.setText((new StringBuilder()).append(" (").append(i).append(")").toString());
            mEmptySearchResultLayout.setVisibility(8);
            mSearchResultListView.setVisibility(0);
            mSearchResultListView.setAdapter(new RegistrySearchResultsAdapter(getActivity(), map));
            return;
        }
        mResultCountTextView.setText(" (0)");
        mSearchResultListView.setVisibility(8);
        mEmptySearchResultLayout.setVisibility(0);
        if (flag)
        {
            mEmptySearchTextView.setText(getString(0x7f0802ed));
            return;
        }
        if (mSearchNoResultKeyword.equals(""))
        {
            mEmptySearchTextView.setText(getString(0x7f0802ed));
            return;
        } else
        {
            mEmptySearchTextView.setText((new StringBuilder()).append(getString(0x7f0802fd)).append(" \"").append(mSearchNoResultKeyword).append("\"").toString());
            return;
        }
    }

    private void hideOrShowProgressBar(boolean flag)
    {
        if (flag)
        {
            getActivity().getWindow().setSoftInputMode(32);
            mProgressBarView.setVisibility(0);
            return;
        } else
        {
            getActivity().getWindow().setSoftInputMode(16);
            mProgressBarView.setVisibility(8);
            return;
        }
    }

    private void insertSearchKeywordToDB(String s)
    {
        if (!s.trim().equals(""))
        {
            DBLnRRecentSearchHelper dblnrrecentsearchhelper = new DBLnRRecentSearchHelper();
            LnRRecentSearchVO lnrrecentsearchvo = new LnRRecentSearchVO();
            lnrrecentsearchvo.setLnrSearchKeyword(s);
            lnrrecentsearchvo.setLnrSearchKeywordFor(2);
            dblnrrecentsearchhelper.insert(lnrrecentsearchvo);
        }
    }

    public void filterSearchResults()
    {
        LnRRegistryFilter lnrregistryfilter = new LnRRegistryFilter();
        hideOrShowProgressBar(true);
        filteredResultsGroup = lnrregistryfilter.filterList(Boolean.valueOf(isWeddingSelected), Boolean.valueOf(isBabySelected), Boolean.valueOf(isCelebrationSelected), findRegistryResultsGroup);
        isOriginatedFromFilter = true;
        if (filteredResultsGroup != null && !filteredResultsGroup.isEmpty())
        {
            handleUIUpdatesByResult(filteredResultsGroup.size(), filteredResultsGroup, isOriginatedFromFilter);
        } else
        {
            handleUIUpdatesByResult(0, filteredResultsGroup, isOriginatedFromFilter);
        }
        hideOrShowProgressBar(false);
    }

    protected void initializeAttributes()
    {
        Object obj = getArguments();
        if (obj == null) goto _L2; else goto _L1
_L1:
        int i = ((Bundle) (obj)).getInt("origin_from_fragment_registry_search", -1);
        if (i <= -1 || FragmentOnScreen.values()[i] != FragmentOnScreen.REGISTRY_ADVANCE_SEARCH) goto _L4; else goto _L3
_L3:
        mSearchValueFirstName = ((Bundle) (obj)).getString("registry_advance_search_first_name", "");
        mSearchValueLastName = ((Bundle) (obj)).getString("registry_advance_search_last_name", "");
        mSearchValueState = ((Bundle) (obj)).getString("registry_advance_search_state", "");
        mSearchValueRegistrytype = ((Bundle) (obj)).getString("registry_advance_search_registry_type", "");
        String s = ((Bundle) (obj)).getString("registry_advance_search_state_name", "");
        obj = ((Bundle) (obj)).getString("registry_search_no_result_reg_type_msg", "");
        mSearchKeyword = generateSearchKeywordForDisplay(mSearchValueFirstName, mSearchValueLastName);
        insertSearchKeywordToDB(mSearchKeyword);
        mSearchNoResultKeyword = generateEmptySearchResultKeyword(s, ((String) (obj)));
_L6:
        if (mSearchKeyword != null && !mSearchKeyword.equals(""))
        {
            ((MyRegistryActivity)getActivity()).setRegistrySearchKeyword(mSearchKeyword);
        }
_L2:
        KohlsPhoneApplication kohlsphoneapplication = KohlsPhoneApplication.getInstance();
        boolean flag = false;
        i = ((flag) ? 1 : 0);
        if (kohlsphoneapplication != null)
        {
            i = ((flag) ? 1 : 0);
            if (kohlsphoneapplication.getAnalytics() != null)
            {
                i = kohlsphoneapplication.getAnalytics().getInteractionNumber() + 1;
            }
        }
        AnalyticsHelper.sendAnalyticsTrackStateForLnR(ScreenNames.REGISTRY_SEARCH_RESULTS, ProductFindingMethod.REGISTRY, mSearchKeyword, "registry|registry search", null, (new StringBuilder()).append(";product").append(i).toString(), "1");
        return;
_L4:
        if (i > -1 && FragmentOnScreen.values()[i] == FragmentOnScreen.REGISTRY_SEARCH)
        {
            mSearchKeyword = ((Bundle) (obj)).getString("key_search_keyword");
            findSearchValuesFromKeyword(mSearchKeyword);
            mSearchNoResultKeyword = mSearchKeyword;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void initializeController()
    {
        mRegistrySearchResultController = (RegistrySearchResultControllerImpl)ControllerFactory.getRegistrySearchResultController(new WeakReference(this));
        mlistDetailControllerImpl = (ListDetailControllerImpl)ControllerFactory.getListDetailController(new WeakReference(this));
    }

    protected void initializeViews(Bundle bundle)
    {
        ((MyRegistryActivity)getActivity()).getActionBarHelper().showActionBarForCreateRegistry(getString(0x7f080363));
        bundle = getFragmentView();
        TextView textview = (TextView)bundle.findViewById(0x7f0d0425);
        mResultCountTextView = (TextView)bundle.findViewById(0x7f0d0426);
        mSearchResultListView = (ListView)bundle.findViewById(0x7f0d0428);
        mFilterTextView = (TextView)bundle.findViewById(0x7f0d0427);
        mProgressBarView = getFragmentView().findViewById(0x7f0d0424);
        mEmptySearchResultLayout = (RelativeLayout)bundle.findViewById(0x7f0d0429);
        mScanView = (ImageView)getFragmentView().findViewById(0x7f0d0406);
        mEmptySearchTextView = (TextView)bundle.findViewById(0x7f0d042a);
        mListSearchView = (CustomSearchView)getFragmentView().findViewById(0x7f0d0404);
        mListSearchView.setFocusable(false);
        mListSearchView.setClickable(true);
        mListSearchView.setHint(0x7f080361);
        mScanView.setVisibility(0);
        FontUtils.setFonts(getActivity(), bundle, "Gotham-Book.otf");
        FontUtils.setFonts(getActivity(), textview, "Gotham-Bold.otf");
        FontUtils.setFonts(getActivity(), mFilterTextView, "Gotham-Bold.otf");
        mFilterTextView.setOnClickListener(this);
        mListSearchView.setOnClickListener(this);
        mScanView.setOnClickListener(this);
        isOriginatedFromFilter = false;
    }

    protected int intializaLayoutId()
    {
        return 0x7f0300a2;
    }

    protected void loadContent()
    {
label0:
        {
label1:
            {
                findRegistryResultsGroup = ((MyRegistryActivity)getActivity()).getFindRegistryResultsGroup();
                mSearchKeyword = ((MyRegistryActivity)getActivity()).getRegistrySearchKeyword();
                mListSearchView.setText(mSearchKeyword);
                if (findRegistryResultsGroup != null)
                {
                    break label0;
                }
                if (!mSearchValueRegistryId.trim().equals("") || !mSearchValueFirstName.trim().equals("") || !mSearchValueLastName.trim().equals("") || !mSearchValueState.trim().equals("") || !mSearchValueRegistrytype.trim().equals(""))
                {
                    if (UtilityMethods.isNetworkConnected(getActivity()))
                    {
                        break label1;
                    }
                    ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803cd));
                    handleUIUpdatesByResult(0, null, isOriginatedFromFilter);
                }
                return;
            }
            hideOrShowProgressBar(true);
            mRegistrySearchResultController.getRegistrySearchResults(mSearchValueRegistryId, mSearchValueFirstName, mSearchValueLastName, mSearchValueState, mSearchValueRegistrytype);
            return;
        }
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            isWeddingSelected = bundle.getBoolean("is_wedding_filter_selected", false);
            isBabySelected = bundle.getBoolean("is_baby_filter_selected", false);
            isCelebrationSelected = bundle.getBoolean("is_celebration_filter_selected", false);
        } else
        {
            isWeddingSelected = false;
            isBabySelected = false;
            isCelebrationSelected = false;
        }
        if (isWeddingSelected || isBabySelected || isCelebrationSelected)
        {
            filterSearchResults();
            return;
        } else
        {
            handleUIUpdatesByResult(findRegistryResultsGroup.size(), findRegistryResultsGroup, isOriginatedFromFilter);
            return;
        }
    }

    public void onActivityResultCallback(int i, int j, Intent intent)
    {
        intent = (HashMap)intent.getExtras().getSerializable("SCAN_DATA");
        if (intent == null || !intent.containsKey("SCAN_FIND_REGISTRY_ID") || intent.get("SCAN_FIND_REGISTRY_ID") == null || "".equals(intent.get("SCAN_FIND_REGISTRY_ID")))
        {
            break MISSING_BLOCK_LABEL_171;
        }
        Long.parseLong((String)intent.get("SCAN_FIND_REGISTRY_ID"));
        hideOrShowProgressBar(true);
        isRequestFromScan = true;
        mSearchKeyword = (String)intent.get("SCAN_FIND_REGISTRY_ID");
        mListSearchView.setText(mSearchKeyword);
        mSearchNoResultKeyword = mSearchKeyword;
        if (mSearchKeyword != null && !mSearchKeyword.equals(""))
        {
            mRegistrySearchResultController.getRegistrySearchResults(mSearchKeyword, "", "", "", "");
            return;
        }
        try
        {
            ToastUtility.showCustomToastBottom(getString(0x7f080254));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            ToastUtility.showCustomToastBottom(getString(0x7f080254));
        }
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131559463: 
            view = new Bundle();
            view.putBoolean("is_wedding_filter_selected", isWeddingSelected);
            view.putBoolean("is_baby_filter_selected", isBabySelected);
            view.putBoolean("is_celebration_filter_selected", isCelebrationSelected);
            ((MyRegistryActivity)getActivity()).attachRegistryFilterFragment(view);
            return;

        case 2131559428: 
            if (!UtilityMethods.isNetworkConnected(getActivity()))
            {
                UtilityMethods.showToast(getActivity(), getResources().getString(0x7f0803cd), 0);
                return;
            } else
            {
                view = new Bundle();
                view.putString("search_key", mListSearchView.getText().toString());
                ((MyRegistryActivity)getActivity()).attachRegistrySearchFragment(view);
                return;
            }

        case 2131559430: 
            break;
        }
        if (getActivity() instanceof MyRegistryActivity)
        {
            ((MyRegistryActivity)getActivity()).setActivityResultCallback(this);
        }
        UtilityMethods.openScanActivity(getActivity(), 1005, null);
    }

    public void onResume()
    {
        super.onResume();
    }

    public void updateViewsOnFailure(Object obj)
    {
        hideOrShowProgressBar(false);
        if (obj instanceof Error)
        {
            obj = (Error)obj;
            UtilityMethods.showToast(getActivity(), ((Error) (obj)).getMessage(), 0);
            return;
        } else
        {
            ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
            return;
        }
    }

    public void updateViewsOnSuccess(Object obj)
    {
label0:
        {
            hideOrShowProgressBar(false);
            if (obj instanceof ManageRegistryVO)
            {
                mSearchResultsRegistryVO = (ManageRegistryVO)obj;
                switch (mSearchResultsRegistryVO.getResponseCode())
                {
                default:
                    handleUIUpdatesByResult(0, null, false);
                    ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
                    break;

                case 0: // '\0'
                    break label0;
                }
            }
            return;
        }
        if (isRequestFromScan)
        {
            isRequestFromScan = false;
            if (mSearchResultsRegistryVO != null && mSearchResultsRegistryVO.getLists() != null && mSearchResultsRegistryVO.getLists().size() > 0)
            {
                obj = (com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList)mSearchResultsRegistryVO.getLists().get(0);
                if (obj != null)
                {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("registry object", ((java.io.Serializable) (obj)));
                    bundle.putString("registry_owner_userid", ((com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList) (obj)).getListuser().getRetailerUserId());
                    bundle.putInt("origin_of_fragment", FragmentOnScreen.HOME.ordinal());
                    ((MyRegistryActivity)getActivity()).attachRegistryDetailFragment(bundle);
                    return;
                } else
                {
                    handleUIUpdatesByResult(0, null, false);
                    return;
                }
            } else
            {
                handleUIUpdatesByResult(0, null, false);
                return;
            }
        }
        findRegistryResultsGroup = (new FindRegistryHelper()).getUserGroupForRegistry(mSearchResultsRegistryVO);
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (findRegistryResultsGroup != null)
        {
            i = ((flag) ? 1 : 0);
            if (!findRegistryResultsGroup.isEmpty())
            {
                i = findRegistryResultsGroup.size();
                ((MyRegistryActivity)getActivity()).setFindRegistryResultsGroup(findRegistryResultsGroup);
            }
        }
        handleUIUpdatesByResult(i, findRegistryResultsGroup, false);
    }
}
