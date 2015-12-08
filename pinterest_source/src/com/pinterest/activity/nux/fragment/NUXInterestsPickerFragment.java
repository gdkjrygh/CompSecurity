// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.activity.nux.NUXCoreConceptsHelper;
import com.pinterest.activity.nux.adapter.NUXInterestGridAdapter;
import com.pinterest.activity.nux.adapter.NUXNextFragmentListener;
import com.pinterest.activity.nux.view.NUXContinueBar;
import com.pinterest.activity.nux.view.NUXHeaderView;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.ApiFields;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.education.EducationHelper;
import com.pinterest.experience.ExperienceEnabled;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.experience.NuxDisplayData;
import com.pinterest.experience.NuxStep;
import com.pinterest.fragment.PinterestGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.ui.grid.AdapterFooterView;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXSocialPickerFragment, NUXEndScreenFragment

public class NUXInterestsPickerFragment extends PinterestGridFragment
    implements ExperienceEnabled
{

    private long CHOOSE_TEXT_ALPHA_DURATION;
    private long CONTINUE_BTN_ANIMATION_DURATION;
    private float CONTINUE_BTN_FADED_ALPHA;
    private float CONTINUE_BTN_INTERPOLATOR_FRICTION;
    private float CONTINUE_BTN_INTERPOLATOR_TENSION;
    private float CONTINUE_BTN_TRANSLATE_Y;
    WebImageView _bottomFade;
    private PinterestJsonArray _chooseMoreInterestsTextArray;
    PTextView _chooseMoreTopicsText;
    NUXContinueBar _continueBar;
    PButton _continueBtn;
    PButton _giftwrapContinueBtn;
    NUXHeaderView _header;
    private boolean _inCoreConceptsExp;
    private boolean _inGiftWrapInterestsExp;
    private int _minInterests;
    PinterestAdapterView _pinGrid;
    PTextView _title;
    private String giftWrapContinueString;
    private LinearLayout giftWrapHeader;
    private String giftWrapPickMoreString;
    NUXNextFragmentListener nextFragmentListener;
    private android.widget.AdapterView.OnItemClickListener onItemClick;

    public NUXInterestsPickerFragment()
    {
        _minInterests = 5;
        CONTINUE_BTN_FADED_ALPHA = 0.5F;
        CONTINUE_BTN_TRANSLATE_Y = -30F;
        CONTINUE_BTN_INTERPOLATOR_FRICTION = 0.7F;
        CONTINUE_BTN_INTERPOLATOR_TENSION = 0.2F;
        CHOOSE_TEXT_ALPHA_DURATION = 300L;
        CONTINUE_BTN_ANIMATION_DURATION = 700L;
        onItemClick = new _cls3();
        nextFragmentListener = new _cls4();
        _inCoreConceptsExp = NUXCoreConceptsHelper.inCoreConceptsExp();
        _inGiftWrapInterestsExp = EducationHelper.n();
        _layoutId = getLayoutId();
        _adapter = new NUXInterestGridAdapter();
        ((NUXInterestGridAdapter)_adapter).setBounceOnTouch(true);
    }

    private void applyExperienceCoreConcepts(NuxStep nuxstep)
    {
        _title.setText(Html.fromHtml(nuxstep.b));
        _title.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.MEDIUM);
        _continueBtn.setText(nuxstep.m);
        _chooseMoreInterestsTextArray = nuxstep.t;
        _chooseMoreTopicsText.setText(_chooseMoreInterestsTextArray.a(0));
        nuxstep = nuxstep.r;
        _bottomFade.loadUri(Uri.parse(nuxstep.a("bottomFade", "")));
        _bottomFade.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        _minInterests = _chooseMoreInterestsTextArray.a();
    }

    private void applyExperienceGiftWrap(NuxStep nuxstep)
    {
        PTextView ptextview = (PTextView)giftWrapHeader.findViewById(0x7f0f048b);
        ptextview.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD);
        ptextview.setText(nuxstep.b);
        giftWrapContinueString = nuxstep.m;
        giftWrapPickMoreString = nuxstep.u;
        _minInterests = nuxstep.l;
        _giftwrapContinueBtn.setAllCaps(false);
        _giftwrapContinueBtn.setText(String.format(nuxstep.u, new Object[] {
            Integer.valueOf(_minInterests)
        }));
    }

    private void applyExperienceMandatoryNUX(NuxStep nuxstep)
    {
        _header.applyExperience(nuxstep);
        _continueBar.applyExperience(nuxstep);
        if (nuxstep.l > 0)
        {
            _minInterests = nuxstep.l;
        }
    }

    private void finishInterestsPicker()
    {
        ((NUXActivity)getActivity()).submitInterests(((NUXInterestGridAdapter)_adapter).getCheckedInterests());
        goToNextFragment();
    }

    private int getLayoutId()
    {
        if (_inCoreConceptsExp)
        {
            return 0x7f0300e4;
        }
        return !_inGiftWrapInterestsExp ? 0x7f0300e8 : 0x7f0300cc;
    }

    private void onViewCreatedCoreConcepts()
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)_pinGrid.getLayoutParams();
        layoutparams.setMargins(0, 0, 0, (int)Resources.dimension(0x7f0a00db));
        _pinGrid.setLayoutParams(layoutparams);
        _pinGrid.setBrickPadding((int)Resources.dimension(0x7f0a00dc));
        _continueBtn.setOnClickListener(new _cls1());
    }

    private void onViewCreatedGiftWrapInterests()
    {
        _pinGrid.setBrickPadding((int)Resources.dimension(0x7f0a00dc));
        giftWrapHeader = new LinearLayout(getContext());
        LayoutInflater.from(getContext()).inflate(0x7f0301d8, giftWrapHeader, true);
        _gridVw.addHeaderView(giftWrapHeader);
        _giftwrapContinueBtn.setEnabled(false);
        _giftwrapContinueBtn.setOnClickListener(new _cls2());
    }

    public void applyExperience()
    {
        Object obj;
        obj = Experiences.a(Experiences.b);
        break MISSING_BLOCK_LABEL_7;
        if (obj != null && (((ExperienceValue) (obj)).f instanceof NuxDisplayData))
        {
            obj = ((NuxDisplayData)((ExperienceValue) (obj)).f).a();
            if (obj != null)
            {
                if (_inCoreConceptsExp)
                {
                    applyExperienceCoreConcepts(((NuxStep) (obj)));
                    return;
                }
                if (_inGiftWrapInterestsExp)
                {
                    applyExperienceGiftWrap(((NuxStep) (obj)));
                    return;
                } else
                {
                    applyExperienceMandatoryNUX(((NuxStep) (obj)));
                    return;
                }
            }
        }
        return;
    }

    public void goToNextFragment()
    {
        if (getActivity() == null)
        {
            return;
        }
        Object obj = NuxDisplayData.c();
        if (obj == null)
        {
            obj = new NUXSocialPickerFragment();
        } else
        {
            obj = ((NuxDisplayData) (obj)).a(((NuxDisplayData) (obj)).a());
            if (obj != null && ((NuxStep) (obj)).b())
            {
                obj = new NUXSocialPickerFragment();
            } else
            {
                obj = new NUXEndScreenFragment();
            }
        }
        FragmentHelper.replaceFragment(getActivity(), ((android.support.v4.app.Fragment) (obj)), false, com.pinterest.activity.FragmentHelper.Animation.SLIDE);
    }

    protected void loadData()
    {
        if (_inGiftWrapInterestsExp)
        {
            InterestsApi.a("nux", ApiFields.s, null, new com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse(gridResponseHandler), getApiTag());
            return;
        } else
        {
            InterestsApi.a("nux", new com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse(gridResponseHandler), getApiTag());
            return;
        }
    }

    public boolean onBackPressed()
    {
        return false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
    }

    public void onPause()
    {
        if (getActivity() != null)
        {
            ((NUXActivity)getActivity()).setCheckedInterests(((NUXInterestGridAdapter)_adapter).getCheckedInterests());
        }
        super.onPause();
    }

    public void onResume()
    {
        if (getActivity() != null && _adapter != null)
        {
            ((NUXInterestGridAdapter)_adapter).setCheckedInterests(((NUXActivity)getActivity()).getCheckedInterests());
        }
        super.onResume();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        AnalyticsApi.b("interest_selector_start");
        if (_inCoreConceptsExp)
        {
            onViewCreatedCoreConcepts();
        } else
        if (_inGiftWrapInterestsExp)
        {
            onViewCreatedGiftWrapInterests();
        } else
        {
            _header = new NUXHeaderView(view.getContext());
            _header.setSkipListener(nextFragmentListener);
            _header.setTitle(Resources.string(0x7f0703be));
            _header.setTitleDesc(Resources.string(0x7f0703bd));
            _header.setSkipTitle(Resources.string(0x7f0703b6));
            _header.setSkipDesc(Resources.string(0x7f0703b8));
            _header.setSkipPosTx(Resources.string(0x7f0703b7));
            _header.setSkipNegTx(Resources.string(0x7f07055f));
            _continueBar.setContinueListener(nextFragmentListener);
            _gridVw.addHeaderView(_header, -1, -2);
            _gridVw.getFooterView().setPadding(0, 0, 0, (int)Resources.dimension(0x7f0a016e));
        }
        _gridVw.setOnItemClickListener(onItemClick);
        applyExperience();
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _emptyCenterImage = 0x7f0201d3;
        _emptyMessage = Resources.string(0x7f07026b);
    }




























    private class _cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final NUXInterestsPickerFragment this$0;

        private void chooseMoreInterestsTextUpdate()
        {
            int i = ((NUXInterestGridAdapter)
// JavaClassFileOutputException: get_constant: invalid tag

        private void continueBarUpdate()
        {
            _continueBar.popInAnimate();
            android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
            if (fragmentactivity instanceof NUXActivity)
            {
                ((NUXActivity)fragmentactivity).setProgressVisibility(0);
            }
            ((NUXInterestGridAdapter)
// JavaClassFileOutputException: get_constant: invalid tag

        private void continueBtnAnimation(PTextView ptextview, PButton pbutton, float f, float f1, float f2, float f3, float f4, 
                float f5)
        {
            ptextview = ObjectAnimator.ofFloat(ptextview, "alpha", new float[] {
                f, f1
            });
            ptextview.setDuration(CHOOSE_TEXT_ALPHA_DURATION);
            Object obj = ObjectAnimator.ofFloat(pbutton, "alpha", new float[] {
                f2, f3
            });
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(pbutton, "translationY", new float[] {
                f4, f5
            });
            pbutton = new AnimatorSet();
            pbutton.playTogether(new Animator[] {
                obj, objectanimator
            });
            pbutton.setDuration(CONTINUE_BTN_ANIMATION_DURATION);
            pbutton.setInterpolator(new SpringInterpolator(CONTINUE_BTN_INTERPOLATOR_FRICTION, CONTINUE_BTN_INTERPOLATOR_TENSION));
            obj = new AnimatorSet();
            ((AnimatorSet) (obj)).playTogether(new Animator[] {
                ptextview, pbutton
            });
            ((AnimatorSet) (obj)).start();
        }

        private void pickMoreInterestsPromptUpdate()
        {
            int i = ((NUXInterestGridAdapter)
// JavaClassFileOutputException: get_constant: invalid tag

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (
// JavaClassFileOutputException: get_constant: invalid tag

        _cls3()
        {
            this$0 = NUXInterestsPickerFragment.this;
            super();
        }
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final NUXInterestsPickerFragment this$0;

        public void onClick(View view)
        {
            finishInterestsPicker();
        }

        _cls1()
        {
            this$0 = NUXInterestsPickerFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final NUXInterestsPickerFragment this$0;

        public void onClick(View view)
        {
            finishInterestsPicker();
        }

        _cls2()
        {
            this$0 = NUXInterestsPickerFragment.this;
            super();
        }
    }

}
