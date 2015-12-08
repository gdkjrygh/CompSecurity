// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.kit.application.Resources;
import java.util.Arrays;

// Referenced classes of package com.pinterest.activity.report:
//            ReportPinBaseFragment

public class ReportPinSpamFragment extends ReportPinBaseFragment
{

    public ReportPinSpamFragment()
    {
    }

    public void initStrings()
    {
        _pageTitle = Resources.string(0x7f070591);
        _optionTitles = Arrays.asList(Resources.stringArray(0x7f080030));
        _optionPinFlagIds = new _cls1();
        _learnAboutText = Resources.string(0x7f070566);
        _learnAboutUrl = Resources.string(0x7f070747);
        _currFragmentFlagList = new _cls2();
        _singleReasonList = new _cls3();
    }

    private class _cls1 extends ArrayList
    {

        final ReportPinSpamFragment this$0;

        _cls1()
        {
            this$0 = ReportPinSpamFragment.this;
            super();
            add("spamPin");
            add("pinFromFakeAccount");
            add("pinFromHackedAccount");
        }
    }


    private class _cls2 extends ArrayList
    {

        final ReportPinSpamFragment this$0;

        _cls2()
        {
            this$0 = ReportPinSpamFragment.this;
            super();
            add("spam");
        }
    }


    private class _cls3 extends ArrayList
    {

        final ReportPinSpamFragment this$0;

        _cls3()
        {
            this$0 = ReportPinSpamFragment.this;
            super();
            for (int i = 0; i < _optionPinFlagIds.size(); i++)
            {
                add("spam");
            }

        }
    }

}
