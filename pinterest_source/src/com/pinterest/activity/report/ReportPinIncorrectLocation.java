// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.api.model.Pin;
import com.pinterest.kit.application.Resources;
import java.util.Arrays;

// Referenced classes of package com.pinterest.activity.report:
//            ReportPinBaseFragment

public class ReportPinIncorrectLocation extends ReportPinBaseFragment
{

    public ReportPinIncorrectLocation()
    {
    }

    public void initStrings()
    {
        if (!getPin().getHasPlace().booleanValue())
        {
            return;
        } else
        {
            _pageTitle = Resources.string(0x7f070345);
            _optionTitles = Arrays.asList(Resources.stringArray(0x7f08002e));
            _optionPinFlagIds = new _cls1();
            _currFragmentFlagList = new _cls2();
            _singleReasonList = new _cls3();
            return;
        }
    }

    private class _cls1 extends ArrayList
    {

        final ReportPinIncorrectLocation this$0;

        _cls1()
        {
            this$0 = ReportPinIncorrectLocation.this;
            super();
            add("incorrect");
            add("not_place");
        }
    }


    private class _cls2 extends ArrayList
    {

        final ReportPinIncorrectLocation this$0;

        _cls2()
        {
            this$0 = ReportPinIncorrectLocation.this;
            super();
            add("location");
        }
    }


    private class _cls3 extends ArrayList
    {

        final ReportPinIncorrectLocation this$0;

        _cls3()
        {
            this$0 = ReportPinIncorrectLocation.this;
            super();
            for (int i = 0; i < _optionPinFlagIds.size(); i++)
            {
                add("other");
            }

        }
    }

}
