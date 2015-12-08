// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.activity.task.fragment.ListFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.ViewParameterType;
import com.pinterest.schemas.event.ViewType;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.activity.report:
//            ReportItem, ReportAdapter, ReportHelper

public abstract class ReportPinBaseFragment extends ListFragment
    implements android.widget.AdapterView.OnItemClickListener
{

    protected static final String BLOCK_USER = "block_user";
    protected static final String BROKEN_LINK = "brokenLink";
    protected static final String FAKE_ACCOUNT = "pinFromFakeAccount";
    protected static final String FILE_REPORT = "fileReport";
    protected static final String GORE = "gore";
    protected static final String HACKED_ACCOUNT = "pinFromHackedAccount";
    protected static final String HARASSING_FRIEND = "harassingFriend";
    protected static final String HARASSING_ME_OR_CHILD = "harassingMeOrMyChild";
    protected static final String HARASSING_PUBLIC_FIGURE = "harassingPublicFigure";
    protected static final String HATE_SPEECH = "hateSpeech";
    protected static final String HURTFUL_CONTENT = "hurtfulContent";
    protected static final String IGNORE = "ignoreThisPin";
    protected static final String IP = "IP";
    protected static final String LOCATION = "location";
    protected static final String NOT_A_PLACE = "not_place";
    protected static final String NOT_USEFUL = "notUseful";
    protected static final String NO_IMAGE = "noImage";
    protected static final String NO_INSTRUCTIONS = "noInstructions";
    protected static final String NUDITY = "nudity";
    protected static final String POLICIES = "policies";
    protected static final String REASON_ATTACKS = "attacks";
    protected static final String REASON_COPYRIGHT = "copyright";
    protected static final String REASON_GORE = "graphic-violence";
    protected static final String REASON_NUDITY = "nudity";
    protected static final String REASON_OTHER = "other";
    protected static final String REASON_SELF_HARM = "self-harm";
    protected static final String REASON_SPAM = "spam";
    protected static final String REASON_WRONG_LOCATION = "wrongLocation";
    protected static final String REPETITIVE_SPAM = "spamPin";
    protected static final String SELF_HARM = "selfHarm";
    protected static final String SPAM = "spam";
    protected static final String UNFOLLOW_BOARD = "unfollowBoard";
    protected static final String UNFOLLOW_USER = "unfollowUser";
    protected static final String WRONG_LOCATION = "incorrect";
    private static boolean isDone;
    private static Pin pin;
    protected List _currFragmentFlagList;
    protected LinearLayout _learnAboutContainer;
    protected TextView _learnAboutLinkText;
    protected String _learnAboutText;
    protected String _learnAboutUrl;
    protected List _optionPinFlagIds;
    protected List _optionText;
    protected List _optionTitles;
    protected String _pageExplanation;
    protected String _pageSubtitle;
    protected String _pageTitle;
    private List _pinFlagList;
    protected Button _reportDoneButton;
    protected TextView _reportExplanationText;
    private List _reportItems;
    protected TextView _reportTopSubtitle;
    protected TextView _reportTopTitle;
    protected List _singleReasonList;

    public ReportPinBaseFragment()
    {
    }

    public static Pin getPin()
    {
        return pin;
    }

    public static boolean isDone()
    {
        return isDone;
    }

    public static void setIsDone(boolean flag)
    {
        isDone = flag;
    }

    public static void setPin(Pin pin1)
    {
        pin = pin1;
    }

    private void submitPinReport(String s, List list)
    {
        String s1;
        s1 = getPinId();
        Pinalytics.a(ElementType.PIN_REPORT_BUTTON, ComponentType.MODAL_DIALOG, s1);
        if (!(getActivity() instanceof MainActivity)) goto _L2; else goto _L1
_L1:
        Object obj = ((MainActivity)getActivity()).getNavigationSource(s1);
        if (obj == null) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        ViewType viewtype = ((Navigation) (obj)).getFragmentViewType();
        if (viewtype != null)
        {
            i = viewtype.getValue();
        } else
        {
            i = -1;
        }
        obj = ((Navigation) (obj)).getFragmentViewParameterType();
        if (obj != null)
        {
            j = ((ViewParameterType) (obj)).getValue();
        } else
        {
            j = -1;
        }
_L5:
        PinApi.a(s1, s, list, "", i, j, new _cls2());
        return;
_L2:
        j = -1;
        i = -1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void createDataSource()
    {
        boolean flag = false;
        List list = getOptionTitles();
        List list1 = getOptionText();
        List list2 = getOptionPinFlagIds();
        List list3 = getSingleReasonList();
        _reportItems = new ArrayList();
        int i = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= list.size())
            {
                break;
            }
            _reportItems.add(new ReportItem((String)list.get(i), (String)list2.get(i)));
            ReportItem reportitem = (ReportItem)_reportItems.get(i);
            String s;
            if (list3 != null)
            {
                s = (String)list3.get(i);
            } else
            {
                s = "other";
            }
            reportitem.setSingleReason(s);
            i++;
        } while (true);
        for (; list1 != null && j < _reportItems.size(); j++)
        {
            ((ReportItem)_reportItems.get(j)).setTextValue((String)list1.get(j));
        }

        ((ReportAdapter)_adapter).setDataSource(_reportItems);
    }

    public String getLearnAboutText()
    {
        return _learnAboutText;
    }

    public String getLearnAboutUrl()
    {
        return _learnAboutUrl;
    }

    public List getOptionPinFlagIds()
    {
        return _optionPinFlagIds;
    }

    public List getOptionText()
    {
        return _optionText;
    }

    public List getOptionTitles()
    {
        return _optionTitles;
    }

    public String getPageExplanation()
    {
        return _pageExplanation;
    }

    public String getPageSubtitle()
    {
        return _pageSubtitle;
    }

    public String getPageTitle()
    {
        return _pageTitle;
    }

    public String getPinId()
    {
        if (getPin() != null)
        {
            return getPin().getUid();
        } else
        {
            return "";
        }
    }

    public List getSingleReasonList()
    {
        return _singleReasonList;
    }

    public abstract void initStrings();

    public void onActivate()
    {
        if (_currFragmentFlagList != null)
        {
            _pinFlagList = new ArrayList(_currFragmentFlagList);
        }
        super.onActivate();
        if (isDone())
        {
            pressBackButton();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setIsDone(false);
        _layoutId = 0x7f0300fe;
        _adapter = new ReportAdapter();
        initStrings();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Object obj = (ReportItem)((ReportAdapter)_adapter).getItem(i);
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        adapterview = getActivity();
        view = ((ReportItem) (obj)).getPinFlagId();
        obj = ((ReportItem) (obj)).getSingleReason();
        i = -1;
        view.hashCode();
        JVM INSTR lookupswitch 26: default 264
    //                   -2011885172: 568
    //                   -1448685074: 598
    //                   -1413384283: 763
    //                   -1379503748: 423
    //                   -1358139898: 748
    //                   -1034625007: 613
    //                   -408631323: 409
    //                   -258101588: 688
    //                   -197510469: 643
    //                   2343: 523
    //                   3178779: 628
    //                   3536713: 465
    //                   94617205: 437
    //                   267311320: 658
    //                   546894160: 479
    //                   808521099: 493
    //                   842816697: 583
    //                   1191673440: 703
    //                   1286582333: 451
    //                   1340928841: 508
    //                   1624652955: 778
    //                   1677699439: 733
    //                   1759128016: 553
    //                   1901043637: 538
    //                   1984541031: 673
    //                   2089753626: 718;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29
_L3:
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            Pinalytics.a(ElementType.PIN_REPORT_BUTTON, ComponentType.NAVIGATION);
            Events.post(new Navigation(Location.REPORT_PIN_UNFOLLOW, view));
            return;

        case 1: // '\001'
            if (getPin() != null)
            {
                adapterview = getPin().getBoard();
                if (adapterview != null)
                {
                    ReportHelper.showUnfollowDialog(adapterview);
                    return;
                }
            }
            break;

        case 2: // '\002'
            if (getPin() != null)
            {
                adapterview = getPin().getUser();
                if (adapterview != null)
                {
                    ReportHelper.showUnfollowDialog(adapterview);
                    return;
                }
            }
            break;

        case 3: // '\003'
            if (getPin() != null)
            {
                view = getPin().getUser();
                if (view != null)
                {
                    ReportHelper.showBlockDialog(adapterview, view);
                    return;
                }
            }
            break;

        case 4: // '\004'
            Pinalytics.a(ElementType.PIN_REPORT_BUTTON, ComponentType.NAVIGATION);
            Events.post(new Navigation(Location.REPORT_PIN_SPAM));
            return;

        case 5: // '\005'
            Pinalytics.a(ElementType.PIN_REPORT_BUTTON, ComponentType.NAVIGATION);
            Events.post(new Navigation(Location.REPORT_PIN_AGAINST_POLICIES));
            return;

        case 6: // '\006'
            Pinalytics.a(ElementType.PIN_REPORT_BUTTON, ComponentType.NAVIGATION);
            Events.post(new Navigation(Location.REPORT_PIN_HURTFUL_CONTENT));
            return;

        case 7: // '\007'
            Pinalytics.a(ElementType.PIN_REPORT_BUTTON, ComponentType.NAVIGATION);
            Events.post(new Navigation(Location.REPORT_PIN_NOT_USEFUL));
            return;

        case 8: // '\b'
            Pinalytics.a(ElementType.PIN_REPORT_BUTTON, ComponentType.NAVIGATION);
            Events.post(new Navigation(Location.REPORT_PIN_IP));
            return;

        case 9: // '\t'
            Pinalytics.a(ElementType.PIN_REPORT_BUTTON, ComponentType.NAVIGATION);
            Events.post(new Navigation(Location.REPORT_PIN_INCORRECT_LOCATION));
            return;

        case 10: // '\n'
            ActivityHelper.goIntentView(getActivity(), Resources.string(0x7f070741));
            return;

        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
            _pinFlagList.add(view);
            Events.post(new Navigation(Location.REPORT_PIN_UNFOLLOW, view));
            submitPinReport(((String) (obj)), _pinFlagList);
            return;
        }
        if (true) goto _L1; else goto _L10
_L10:
        if (view.equals("ignoreThisPin"))
        {
            i = 0;
        }
          goto _L3
_L7:
        if (view.equals("unfollowBoard"))
        {
            i = 1;
        }
          goto _L3
_L16:
        if (view.equals("unfollowUser"))
        {
            i = 2;
        }
          goto _L3
_L22:
        if (view.equals("block_user"))
        {
            i = 3;
        }
          goto _L3
_L15:
        if (view.equals("spam"))
        {
            i = 4;
        }
          goto _L3
_L18:
        if (view.equals("policies"))
        {
            i = 5;
        }
          goto _L3
_L19:
        if (view.equals("hurtfulContent"))
        {
            i = 6;
        }
          goto _L3
_L23:
        if (view.equals("notUseful"))
        {
            i = 7;
        }
          goto _L3
_L13:
        if (view.equals("IP"))
        {
            i = 8;
        }
          goto _L3
_L27:
        if (view.equals("location"))
        {
            i = 9;
        }
          goto _L3
_L26:
        if (view.equals("fileReport"))
        {
            i = 10;
        }
          goto _L3
_L4:
        if (view.equals("spamPin"))
        {
            i = 11;
        }
          goto _L3
_L20:
        if (view.equals("pinFromFakeAccount"))
        {
            i = 12;
        }
          goto _L3
_L5:
        if (view.equals("pinFromHackedAccount"))
        {
            i = 13;
        }
          goto _L3
_L9:
        if (view.equals("nudity"))
        {
            i = 14;
        }
          goto _L3
_L14:
        if (view.equals("gore"))
        {
            i = 15;
        }
          goto _L3
_L12:
        if (view.equals("harassingMeOrMyChild"))
        {
            i = 16;
        }
          goto _L3
_L17:
        if (view.equals("harassingFriend"))
        {
            i = 17;
        }
          goto _L3
_L28:
        if (view.equals("harassingPublicFigure"))
        {
            i = 18;
        }
          goto _L3
_L11:
        if (view.equals("hateSpeech"))
        {
            i = 19;
        }
          goto _L3
_L21:
        if (view.equals("selfHarm"))
        {
            i = 20;
        }
          goto _L3
_L29:
        if (view.equals("noImage"))
        {
            i = 21;
        }
          goto _L3
_L25:
        if (view.equals("brokenLink"))
        {
            i = 22;
        }
          goto _L3
_L8:
        if (view.equals("noInstructions"))
        {
            i = 23;
        }
          goto _L3
_L6:
        if (view.equals("incorrect"))
        {
            i = 24;
        }
          goto _L3
_L24:
        if (view.equals("not_place"))
        {
            i = 25;
        }
          goto _L3
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        createDataSource();
        _listView = (ListView)view.findViewById(0x7f0f02b4);
        _listView.setAdapter(_adapter);
        _listView.setOnItemClickListener(this);
        setUpUi();
    }

    public void setUpUi()
    {
        _reportTopTitle.setText(getPageTitle());
        if (getPageSubtitle() != null)
        {
            _reportTopSubtitle.setVisibility(0);
            _reportTopSubtitle.setText(getPageSubtitle());
            _reportDoneButton.setVisibility(0);
            _reportDoneButton.setOnClickListener(new _cls1());
        } else
        {
            _reportTopSubtitle.setVisibility(8);
            _reportDoneButton.setVisibility(8);
        }
        if (getPageExplanation() != null)
        {
            _reportExplanationText.setVisibility(0);
            _reportExplanationText.setText(getPageExplanation());
        } else
        {
            _reportExplanationText.setVisibility(8);
        }
        if (getLearnAboutText() != null && getLearnAboutUrl() != null)
        {
            _learnAboutContainer.setVisibility(0);
            _learnAboutLinkText.setText(getLearnAboutText());
            _learnAboutLinkText.setOnClickListener(new OnLearnAboutLinkClickListener(getLearnAboutUrl()));
            return;
        } else
        {
            _learnAboutContainer.setVisibility(8);
            return;
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final ReportPinBaseFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            if (apiresponse != null)
            {
                Application.showToast(apiresponse.getMessageDisplay());
                return;
            } else
            {
                Application.showToast(0x7f0704ae);
                return;
            }
        }

        public void onStart()
        {
            Application.showToast(0x7f0704af);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            Pinalytics.a(EventType.PIN_FLAG, getPinId());
            Application.showToast(0x7f0704b0);
        }

        _cls2()
        {
            this$0 = ReportPinBaseFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ReportPinBaseFragment this$0;

        public void onClick(View view)
        {
            ReportPinBaseFragment.setIsDone(true);
            pressBackButton();
        }

        _cls1()
        {
            this$0 = ReportPinBaseFragment.this;
            super();
        }
    }


    private class OnLearnAboutLinkClickListener
        implements android.view.View.OnClickListener
    {

        String _link;
        final ReportPinBaseFragment this$0;

        public void onClick(View view)
        {
            ActivityHelper.goIntentView(getActivity(), _link);
        }

        public OnLearnAboutLinkClickListener(String s)
        {
            this$0 = ReportPinBaseFragment.this;
            super();
            _link = s;
        }
    }

}
