// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.os.Bundle;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Pin;
import com.pinterest.kit.application.Resources;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.pinterest.activity.report:
//            ReportPinBaseFragment

public class ReportPinFragment extends ReportPinBaseFragment
{

    public ReportPinFragment()
    {
    }

    public void initStrings()
    {
        _pageTitle = Resources.string(0x7f0704ad);
        if (getPin() != null)
        {
            if (getPin().getHasPlace().booleanValue())
            {
                _optionTitles = new LinkedList(Arrays.asList(Resources.stringArray(0x7f080033)));
            } else
            {
                _optionTitles = new LinkedList(Arrays.asList(Resources.stringArray(0x7f080032)));
            }
        }
        _optionText = new LinkedList(Arrays.asList(Resources.stringArray(0x7f080031)));
        _optionPinFlagIds = new _cls1();
        if (getPin() != null && getPin().isCSR())
        {
            _optionTitles.remove(0);
            _optionText.remove(0);
            _optionPinFlagIds.remove(0);
        }
        _learnAboutText = Resources.string(0x7f0703dc);
        _learnAboutUrl = Resources.string(0x7f070747);
    }

    public void onCreate(Bundle bundle)
    {
        setPin(_navigation.getModelAsPin());
        super.onCreate(bundle);
    }

    private class _cls1 extends ArrayList
    {

        final ReportPinFragment this$0;

        _cls1()
        {
            this$0 = ReportPinFragment.this;
            super();
            add("ignoreThisPin");
            add("spam");
            add("policies");
            add("notUseful");
            add("IP");
            if (ReportPinBaseFragment.getPin() != null && ReportPinBaseFragment.getPin().getHasPlace().booleanValue())
            {
                add("location");
            }
        }
    }

}
