// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget.rewards;

import android.view.View;
import android.widget.CheckBox;
import com.jcp.views.HtmlTypefaceTextView;

// Referenced classes of package com.jcp.widget.rewards:
//            AgreeToTermsAndConditions

public class 
    implements butterknife.ewInjector
{

    public void inject(butterknife.ewInjector ewinjector, AgreeToTermsAndConditions agreetotermsandconditions, Object obj)
    {
        agreetotermsandconditions.cbAgree = (CheckBox)ewinjector.gree((View)ewinjector.gree(obj, 0x7f0e041d, "field 'cbAgree'"), 0x7f0e041d, "field 'cbAgree'");
        agreetotermsandconditions.tvTermsAndConditions = (HtmlTypefaceTextView)ewinjector.ermsAndConditions((View)ewinjector.ermsAndConditions(obj, 0x7f0e041e, "field 'tvTermsAndConditions'"), 0x7f0e041e, "field 'tvTermsAndConditions'");
    }

    public volatile void inject(butterknife.ewInjector ewinjector, Object obj, Object obj1)
    {
        inject(ewinjector, (AgreeToTermsAndConditions)obj, obj1);
    }

    public void reset(AgreeToTermsAndConditions agreetotermsandconditions)
    {
        agreetotermsandconditions.cbAgree = null;
        agreetotermsandconditions.tvTermsAndConditions = null;
    }

    public volatile void reset(Object obj)
    {
        reset((AgreeToTermsAndConditions)obj);
    }

    public ()
    {
    }
}
