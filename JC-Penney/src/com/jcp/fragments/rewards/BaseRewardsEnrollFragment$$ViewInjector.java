// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.jcp.views.TypefaceEditText;

// Referenced classes of package com.jcp.fragments.rewards:
//            BaseRewardsEnrollFragment, a, b, c

public class 
    implements butterknife..ViewInjector
{

    public void inject(butterknife..ViewInjector viewinjector, BaseRewardsEnrollFragment baserewardsenrollfragment, Object obj)
    {
        View view = (View)viewinjector.ViewInjector(obj, 0x7f0e044c, "field 'etAddressLineOne' and method 'onAddressLineOneTouch'");
        baserewardsenrollfragment.etAddressLineOne = (TypefaceEditText)viewinjector.etAddressLineOne(view, 0x7f0e044c, "field 'etAddressLineOne'");
        view.setOnTouchListener(new a(this, baserewardsenrollfragment));
        baserewardsenrollfragment.etAddressLineTwo = (EditText)viewinjector.etAddressLineTwo((View)viewinjector.etAddressLineTwo(obj, 0x7f0e044d, "field 'etAddressLineTwo'"), 0x7f0e044d, "field 'etAddressLineTwo'");
        view = (View)viewinjector.etAddressLineTwo(obj, 0x7f0e044b, "field 'tvBirthDate' and method 'onBirthDateClick'");
        baserewardsenrollfragment.tvBirthDate = (TextView)viewinjector.tvBirthDate(view, 0x7f0e044b, "field 'tvBirthDate'");
        view.setOnClickListener(new b(this, baserewardsenrollfragment));
        baserewardsenrollfragment.etCity = (EditText)viewinjector.etCity((View)viewinjector.etCity(obj, 0x7f0e044e, "field 'etCity'"), 0x7f0e044e, "field 'etCity'");
        obj = (View)viewinjector.etCity(obj, 0x7f0e044f, "field 'spState' and method 'stateSelected'");
        baserewardsenrollfragment.spState = (Spinner)viewinjector.spState(((View) (obj)), 0x7f0e044f, "field 'spState'");
        ((AdapterView)obj).setOnItemSelectedListener(new c(this, baserewardsenrollfragment));
    }

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (BaseRewardsEnrollFragment)obj, obj1);
    }

    public void reset(BaseRewardsEnrollFragment baserewardsenrollfragment)
    {
        baserewardsenrollfragment.etAddressLineOne = null;
        baserewardsenrollfragment.etAddressLineTwo = null;
        baserewardsenrollfragment.tvBirthDate = null;
        baserewardsenrollfragment.etCity = null;
        baserewardsenrollfragment.spState = null;
    }

    public volatile void reset(Object obj)
    {
        reset((BaseRewardsEnrollFragment)obj);
    }

    public ()
    {
    }
}
