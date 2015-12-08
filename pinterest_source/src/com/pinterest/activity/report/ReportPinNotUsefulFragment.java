// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.kit.application.Resources;
import java.util.Arrays;

// Referenced classes of package com.pinterest.activity.report:
//            ReportPinBaseFragment

public class ReportPinNotUsefulFragment extends ReportPinBaseFragment
{

    public ReportPinNotUsefulFragment()
    {
    }

    public void initStrings()
    {
        _pageTitle = Resources.string(0x7f070411);
        _optionTitles = Arrays.asList(Resources.stringArray(0x7f08002f));
        _optionPinFlagIds = new _cls1();
        _currFragmentFlagList = new _cls2();
    }

    private class _cls1 extends ArrayList
    {

        final ReportPinNotUsefulFragment this$0;

        _cls1()
        {
            this$0 = ReportPinNotUsefulFragment.this;
            super();
            add("noImage");
            add("brokenLink");
            add("noInstructions");
        }
    }


    private class _cls2 extends ArrayList
    {

        final ReportPinNotUsefulFragment this$0;

        _cls2()
        {
            this$0 = ReportPinNotUsefulFragment.this;
            super();
            add("notUseful");
        }
    }

}
