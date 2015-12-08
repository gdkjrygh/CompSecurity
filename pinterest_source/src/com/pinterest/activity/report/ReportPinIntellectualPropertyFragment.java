// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.kit.application.Resources;
import java.util.Arrays;

// Referenced classes of package com.pinterest.activity.report:
//            ReportPinBaseFragment

public class ReportPinIntellectualPropertyFragment extends ReportPinBaseFragment
{

    public ReportPinIntellectualPropertyFragment()
    {
    }

    public void initStrings()
    {
        _pageTitle = Resources.string(0x7f070381);
        _pageExplanation = Resources.string(0x7f070382);
        _optionTitles = Arrays.asList(Resources.stringArray(0x7f08002d));
        _optionPinFlagIds = new _cls1();
        _currFragmentFlagList = new _cls2();
    }

    private class _cls1 extends ArrayList
    {

        final ReportPinIntellectualPropertyFragment this$0;

        _cls1()
        {
            this$0 = ReportPinIntellectualPropertyFragment.this;
            super();
            add("fileReport");
        }
    }


    private class _cls2 extends ArrayList
    {

        final ReportPinIntellectualPropertyFragment this$0;

        _cls2()
        {
            this$0 = ReportPinIntellectualPropertyFragment.this;
            super();
            add("IP");
        }
    }

}
