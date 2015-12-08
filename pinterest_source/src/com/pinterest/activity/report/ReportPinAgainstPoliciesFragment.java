// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.kit.application.Resources;
import java.util.Arrays;

// Referenced classes of package com.pinterest.activity.report:
//            ReportPinBaseFragment

public class ReportPinAgainstPoliciesFragment extends ReportPinBaseFragment
{

    public ReportPinAgainstPoliciesFragment()
    {
    }

    public void initStrings()
    {
        _pageTitle = Resources.string(0x7f070045);
        _optionTitles = Arrays.asList(Resources.stringArray(0x7f08002b));
        _optionText = Arrays.asList(Resources.stringArray(0x7f08002a));
        _optionPinFlagIds = new _cls1();
        _learnAboutText = Resources.string(0x7f070462);
        _learnAboutUrl = Resources.string(0x7f070745);
        _currFragmentFlagList = new _cls2();
        _singleReasonList = new _cls3();
    }

    private class _cls1 extends ArrayList
    {

        final ReportPinAgainstPoliciesFragment this$0;

        _cls1()
        {
            this$0 = ReportPinAgainstPoliciesFragment.this;
            super();
            add("nudity");
            add("hurtfulContent");
            add("gore");
        }
    }


    private class _cls2 extends ArrayList
    {

        final ReportPinAgainstPoliciesFragment this$0;

        _cls2()
        {
            this$0 = ReportPinAgainstPoliciesFragment.this;
            super();
            add("policies");
        }
    }


    private class _cls3 extends ArrayList
    {

        final ReportPinAgainstPoliciesFragment this$0;

        _cls3()
        {
            this$0 = ReportPinAgainstPoliciesFragment.this;
            super();
            add("nudity");
            add("other");
            add("graphic-violence");
        }
    }

}
