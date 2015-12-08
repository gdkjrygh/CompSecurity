// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.kit.application.Resources;
import java.util.Arrays;

// Referenced classes of package com.pinterest.activity.report:
//            ReportPinBaseFragment

public class ReportPinHurtfulContentFragment extends ReportPinBaseFragment
{

    public ReportPinHurtfulContentFragment()
    {
    }

    public void initStrings()
    {
        _pageTitle = Resources.string(0x7f0702f0);
        _optionTitles = Arrays.asList(Resources.stringArray(0x7f08002c));
        _optionPinFlagIds = new _cls1();
        _learnAboutText = Resources.string(0x7f070462);
        _learnAboutUrl = Resources.string(0x7f070745);
        _currFragmentFlagList = new _cls2();
        _singleReasonList = new _cls3();
    }

    private class _cls1 extends ArrayList
    {

        final ReportPinHurtfulContentFragment this$0;

        _cls1()
        {
            this$0 = ReportPinHurtfulContentFragment.this;
            super();
            add("harassingMeOrMyChild");
            add("harassingFriend");
            add("harassingPublicFigure");
            add("hateSpeech");
            add("selfHarm");
        }
    }


    private class _cls2 extends ArrayList
    {

        final ReportPinHurtfulContentFragment this$0;

        _cls2()
        {
            this$0 = ReportPinHurtfulContentFragment.this;
            super();
            add("policies");
            add("hurtfulContent");
        }
    }


    private class _cls3 extends ArrayList
    {

        final ReportPinHurtfulContentFragment this$0;

        _cls3()
        {
            this$0 = ReportPinHurtfulContentFragment.this;
            super();
            add("attacks");
            add("attacks");
            add("attacks");
            add("attacks");
            add("self-harm");
        }
    }

}
