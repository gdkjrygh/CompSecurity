// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.analytics.utils.enums.ProductFindingMethod;
import com.analytics.utils.enums.ScreenNames;
import com.kohls.mcommerce.opal.common.ui.components.CustomSearchView;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.FontUtils;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.framework.vo.LnRRecentSearchVO;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.helper.db.custom.DBLnRRecentSearchHelper;
import com.kohls.mcommerce.opal.helper.error.AppException;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.error.ErrorHelper;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.RegistrySearchResultControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.listener.ActivityResultCallback;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.AboutRegistryActivity;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyRegistryActivity;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.ManageRegistryVO;
import com.kohls.mcommerce.opal.modules.lnr.helper.adapter.RegistryRecentSearchAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class RegistrySearchFragment extends BaseFragment
    implements ActivityResultCallback
{

    private static String TAG = com/kohls/mcommerce/opal/modules/lnr/framework/view/fragment/RegistrySearchFragment.getSimpleName();
    private RegistryRecentSearchAdapter mAdapter;
    private String mKeyword;
    private LinearLayout mLayout;
    private ListView mListView;
    private RegistrySearchResultControllerImpl mRegistrySearchResultController;
    private ImageView mScanView;
    private TextView mSearchCancel;
    private String mSearchKeyword;
    private ViewGroup mSearchLayout;
    private Drawable mSearchLeftDrawable;
    private Drawable mSearchRightDrawable;
    private CustomSearchView mSearchView;
    private CustomSearchView mSearchViewIcon;

    public RegistrySearchFragment()
    {
    }

    private void addTextWatcherOnSearchView()
    {
        mSearchView.addTextChangedListener(new _cls4());
    }

    private void clearSearchSuggestion()
    {
        (new DBLnRRecentSearchHelper()).clearRegistryData();
    }

    private void firstTimeInitializeView()
    {
        mScanView.setVisibility(8);
        mSearchViewIcon.setVisibility(8);
        mSearchView.setVisibility(0);
        mLayout.setVisibility(0);
        mSearchCancel.setVisibility(0);
        mListView.setVisibility(0);
    }

    private List getAllSuggestion(String s)
    {
        DBLnRRecentSearchHelper dblnrrecentsearchhelper = new DBLnRRecentSearchHelper();
        try
        {
            s = dblnrrecentsearchhelper.getSuggestion(s, 2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.debug(TAG, s.toString());
            return null;
        }
        return s;
    }

    private void initializeCursorAndFocus()
    {
        mSearchView.requestFocus();
        mSearchView.setCursorVisible(true);
        mSearchView.setSelection(mSearchView.getText().length());
        ((InputMethodManager)getActivity().getSystemService("input_method")).showSoftInput(mSearchView, 0);
        if (mKeyword != null && mKeyword.length() > 0)
        {
            mSearchView.setCompoundDrawablesWithIntrinsicBounds(mSearchLeftDrawable, null, mSearchRightDrawable, null);
        }
    }

    private void initializeDrawable()
    {
        mSearchRightDrawable = getActivity().getResources().getDrawable(0x7f0200c4);
        mSearchLeftDrawable = getActivity().getResources().getDrawable(0x7f0200c8);
        mSearchRightDrawable.setBounds(0, 0, 28, 28);
        mSearchLeftDrawable.setBounds(0, 0, 28, 28);
    }

    private void insertSearchKeyword(String s)
    {
        if (!s.equalsIgnoreCase(getActivity().getString(0x7f080360)) && !s.equalsIgnoreCase(getActivity().getString(0x7f080346)))
        {
            DBLnRRecentSearchHelper dblnrrecentsearchhelper = new DBLnRRecentSearchHelper();
            LnRRecentSearchVO lnrrecentsearchvo = new LnRRecentSearchVO();
            lnrrecentsearchvo.setLnrSearchKeyword(s);
            lnrrecentsearchvo.setLnrSearchKeywordFor(2);
            dblnrrecentsearchhelper.insert(lnrrecentsearchvo);
        }
    }

    private void performSearch(String s)
    {
        if (s.length() > 0)
        {
            mSearchView.clearFocus();
            Bundle bundle = new Bundle();
            bundle.putString("key_search_keyword", s);
            bundle.putInt("origin_from_fragment_registry_search", FragmentOnScreen.REGISTRY_SEARCH.ordinal());
            if (getActivity() instanceof HomeActivity)
            {
                ((HomeActivity)getActivity()).startMyRegistryActivity(com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyRegistryActivity.RegistryScreenType.SEARCH_RESULT_REGISTRY, bundle);
            } else
            {
                if (getActivity() instanceof MyRegistryActivity)
                {
                    ((MyRegistryActivity)getActivity()).setFilterBundle(null);
                    ((MyRegistryActivity)getActivity()).setFindRegistryResultsGroup(null);
                    ((MyRegistryActivity)getActivity()).attachRegistrySearchResultFragment(bundle);
                    return;
                }
                if (getActivity() instanceof AboutRegistryActivity)
                {
                    ((AboutRegistryActivity)getActivity()).removeCurrentFragment();
                    ((AboutRegistryActivity)getActivity()).startMyRegistryActivity(com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyRegistryActivity.RegistryScreenType.SEARCH_RESULT_REGISTRY, bundle);
                    return;
                }
            }
        }
    }

    private void setClickListenerOnCancel()
    {
        mSearchCancel.setOnClickListener(new _cls3());
    }

    private void setClickListenerOnSearchIMEAction()
    {
        if (mSearchView != null)
        {
            mSearchView.setOnEditorActionListener(new _cls1());
        }
    }

    private void setClickListenerOnSearchItem()
    {
        mListView.setOnItemClickListener(new _cls2());
    }

    private void setDrawableClickListener()
    {
        mSearchView.setDrawableClickListener(new _cls5());
    }

    private void showProgresssDialog(boolean flag)
    {
        if (flag)
        {
            mListView.setVisibility(0);
            mLayout.setVisibility(0);
            mSearchLayout.setVisibility(0);
            return;
        } else
        {
            mListView.setVisibility(4);
            mLayout.setVisibility(4);
            mSearchLayout.setVisibility(4);
            return;
        }
    }

    private void showSearchView()
    {
        mScanView.setVisibility(8);
        mSearchViewIcon.setVisibility(8);
        mSearchView.setVisibility(0);
        mLayout.setVisibility(0);
        mSearchCancel.setVisibility(0);
        mListView.setVisibility(0);
        showSuggestion();
    }

    private void showSuggestion()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(0, getActivity().getString(0x7f080360));
        arraylist.add(1, getActivity().getString(0x7f080346));
        Object obj = getAllSuggestion("");
        if (((List) (obj)).size() > 0)
        {
            ((List) (obj)).add(0, getActivity().getString(0x7f0801a1));
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add((String)((Iterator) (obj)).next())) { }
        mAdapter = new RegistryRecentSearchAdapter(getActivity(), arraylist, mSearchView);
        mListView.setAdapter(mAdapter);
    }

    private void startDBOperationTask(String s)
    {
    /* block-local class not found */
    class UpdateDBAndPerformSearch {}

        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            (new UpdateDBAndPerformSearch(null)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                s
            });
            return;
        } else
        {
            (new UpdateDBAndPerformSearch(null)).execute(new String[] {
                s
            });
            return;
        }
    }

    protected void initializeAttributes()
    {
        AnalyticsHelper.sendAnalyticsTrackStateForLnR(ScreenNames.REGISTRY_SEARCH, ProductFindingMethod.REGISTRY, null, "registry|registry search", null, null, null);
    }

    protected void initializeController()
    {
        mRegistrySearchResultController = (RegistrySearchResultControllerImpl)ControllerFactory.getRegistrySearchResultController(new WeakReference(this));
    }

    protected void initializeViews(Bundle bundle)
    {
        bundle = getFragmentView();
        mLayout = (LinearLayout)bundle.findViewById(0x7f0d0470);
        mLayout.setEnabled(false);
        mLayout.setClickable(false);
        mSearchView = (CustomSearchView)bundle.findViewById(0x7f0d0405);
        mSearchViewIcon = (CustomSearchView)bundle.findViewById(0x7f0d0404);
        mSearchCancel = (TextView)bundle.findViewById(0x7f0d0407);
        mScanView = (ImageView)getFragmentView().findViewById(0x7f0d0406);
        mListView = (ListView)bundle.findViewById(0x7f0d046f);
        mSearchLayout = (ViewGroup)bundle.findViewById(0x7f0d046e);
        mKeyword = getArguments().getString("search_key");
        mSearchView.setText(mKeyword);
        FontUtils.setFonts(getActivity(), bundle, "Gotham-Book.otf");
        if (mKeyword == null)
        {
            showSearchView();
        } else
        if (mKeyword.length() == 0)
        {
            showSearchView();
        } else
        {
            firstTimeInitializeView();
        }
        setClickListenerOnSearchItem();
        setClickListenerOnSearchIMEAction();
        setClickListenerOnCancel();
        initializeDrawable();
        addTextWatcherOnSearchView();
        setDrawableClickListener();
        mSearchView.setHint(0x7f080361);
        mSearchViewIcon.setHint(0x7f080361);
    }

    protected int intializaLayoutId()
    {
        return 0x7f0300b0;
    }

    protected void loadContent()
    {
        initializeCursorAndFocus();
    }

    public void onActivityResultCallback(int i, int j, Intent intent)
    {
        intent = (HashMap)intent.getExtras().getSerializable("SCAN_DATA");
        if (intent == null || !intent.containsKey("SCAN_FIND_REGISTRY_ID") || intent.get("SCAN_FIND_REGISTRY_ID") == null || "".equals(intent.get("SCAN_FIND_REGISTRY_ID")))
        {
            break MISSING_BLOCK_LABEL_164;
        }
        Long.parseLong((String)intent.get("SCAN_FIND_REGISTRY_ID"));
        showProgresssDialog(true);
        mSearchKeyword = (String)intent.get("SCAN_FIND_REGISTRY_ID");
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
            Toast.makeText(getActivity(), getResources().getString(0x7f080254), 0).show();
        }
    }

    public boolean onBackPress()
    {
        if (getActivity() instanceof AboutRegistryActivity)
        {
            ((AboutRegistryActivity)getActivity()).removeCurrentFragment();
            return true;
        } else
        {
            return false;
        }
    }

    public void onClick(View view)
    {
    }

    public void startMyRegistryActivity(com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyRegistryActivity.RegistryScreenType registryscreentype, Bundle bundle)
    {
        Intent intent = new Intent(getActivity(), com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/MyRegistryActivity);
        intent.putExtra("ScreenToOpen", registryscreentype);
        if (bundle != null)
        {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    public void updateViewsOnFailure(Object obj)
    {
label0:
        {
label1:
            {
                showProgresssDialog(false);
                if (!(obj instanceof Error))
                {
                    break label0;
                }
                if (!ErrorHelper.isApplicationManagable((Error)obj))
                {
                    if (!((Error)obj).getMessage().equals(""))
                    {
                        break label1;
                    }
                    Toast.makeText(getActivity(), getResources().getString(0x7f0803be), 0).show();
                }
                return;
            }
            Toast.makeText(getActivity(), ((Error)obj).getMessage(), 0).show();
            return;
        }
        ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
    }

    public void updateViewsOnSuccess(Object obj)
    {
label0:
        {
            if (obj instanceof ManageRegistryVO)
            {
                obj = (ManageRegistryVO)obj;
                switch (((ManageRegistryVO) (obj)).getResponseCode())
                {
                default:
                    ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
                    break;

                case 0: // '\0'
                    break label0;
                }
            }
            return;
        }
        if (obj != null && ((ManageRegistryVO) (obj)).getLists() != null && ((ManageRegistryVO) (obj)).getLists().size() > 0)
        {
            obj = (com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList)((ManageRegistryVO) (obj)).getLists().get(0);
            if (obj != null)
            {
                Bundle bundle = new Bundle();
                bundle.putSerializable("registry object", ((java.io.Serializable) (obj)));
                bundle.putString("registry_owner_userid", ((com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList) (obj)).getListuser().getRetailerUserId());
                bundle.putInt("origin_of_fragment", FragmentOnScreen.HOME.ordinal());
                startMyRegistryActivity(com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyRegistryActivity.RegistryScreenType.REGISTRY_DETAIL_PAGE, bundle);
                return;
            } else
            {
                ToastUtility.showCustomToastBottom((new StringBuilder()).append(getString(0x7f0802fd)).append(" \"").append(mSearchKeyword).append("\"").toString());
                return;
            }
        } else
        {
            ToastUtility.showCustomToastBottom((new StringBuilder()).append(getString(0x7f0802fd)).append(" \"").append(mSearchKeyword).append("\"").toString());
            return;
        }
    }














    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls5 {}

}
