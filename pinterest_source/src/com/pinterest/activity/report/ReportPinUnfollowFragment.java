// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.activity.report:
//            ReportPinBaseFragment

public class ReportPinUnfollowFragment extends ReportPinBaseFragment
{

    public ReportPinUnfollowFragment()
    {
    }

    public List getOptionTitles()
    {
        ArrayList arraylist = new ArrayList();
        if (getPin() != null)
        {
            Object obj = getPin().getUser();
            Iterator iterator;
            if (((User) (obj)).getFirstName() == null)
            {
                obj = "";
            } else
            {
                obj = ((User) (obj)).getFirstName();
            }
            for (iterator = _optionTitles.iterator(); iterator.hasNext(); arraylist.add(String.format((String)iterator.next(), new Object[] {
    obj
}))) { }
        }
        return arraylist;
    }

    public void initStrings()
    {
        _pageTitle = Resources.string(0x7f07058b);
        String s;
        if (_navigation.getId().equals("ignoreThisPin"))
        {
            s = Resources.string(0x7f07058d);
        } else
        {
            s = Resources.string(0x7f07058e);
        }
        _pageSubtitle = s;
        _pageExplanation = Resources.string(0x7f07058c);
        _optionTitles = Arrays.asList(Resources.stringArray(0x7f080035));
        _optionText = Arrays.asList(Resources.stringArray(0x7f080034));
        _optionPinFlagIds = new _cls1();
        _learnAboutText = Resources.string(0x7f0705c6);
        _learnAboutUrl = Resources.string(0x7f07073e);
    }

    private class _cls1 extends ArrayList
    {

        final ReportPinUnfollowFragment this$0;

        _cls1()
        {
            this$0 = ReportPinUnfollowFragment.this;
            super();
            add("unfollowBoard");
            add("unfollowUser");
            add("block_user");
        }
    }

}
