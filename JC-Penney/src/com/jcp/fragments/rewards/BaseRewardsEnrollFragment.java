// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.jcp.adapters.cv;
import com.jcp.e.aj;
import com.jcp.helper.ad;
import com.jcp.model.State;
import com.jcp.searchentity.SearchCityAndStateContainer;
import com.jcp.util.au;
import com.jcp.views.TypefaceEditText;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.jcp.fragments.rewards:
//            d

public abstract class BaseRewardsEnrollFragment extends d
    implements android.app.DatePickerDialog.OnDateSetListener, aj
{

    protected String a;
    protected String b;
    protected boolean c;
    protected cv d;
    protected List e;
    protected TypefaceEditText etAddressLineOne;
    protected EditText etAddressLineTwo;
    protected EditText etCity;
    protected Integer f;
    protected Integer g;
    protected Spinner spState;
    protected TextView tvBirthDate;

    public BaseRewardsEnrollFragment()
    {
    }

    protected void U()
    {
        c = false;
        e = new ArrayList();
        State state;
        for (Iterator iterator = ad.a(i()).iterator(); iterator.hasNext(); e.add(state.getName()))
        {
            state = (State)iterator.next();
        }

        e.add("");
        d = new cv(i(), 0x7f0300ed, 0x1020014, e);
        d.setDropDownViewResource(0x1090009);
        spState.setAdapter(d);
        spState.setSelection(d.getCount() - 1);
    }

    protected void V()
    {
        if (!c)
        {
            if (!TextUtils.isEmpty(a))
            {
                etCity.setText(a);
                c = true;
            }
            if (!TextUtils.isEmpty(b))
            {
                String s = ad.a(b, i());
                spState.setSelection(d.getPosition(s));
                c = true;
            }
        }
    }

    public void a(int i, String s)
    {
    }

    public void a(SearchCityAndStateContainer searchcityandstatecontainer)
    {
        if (searchcityandstatecontainer != null)
        {
            a = searchcityandstatecontainer.getCity();
            b = searchcityandstatecontainer.getState();
            c = false;
        }
    }

    public boolean onAddressLineOneTouch(View view, MotionEvent motionevent)
    {
        boolean flag = false;
        if (etAddressLineOne.a(etAddressLineOne, motionevent))
        {
            etAddressLineTwo.setVisibility(0);
            etAddressLineTwo.requestFocus();
            flag = true;
        }
        return flag;
    }

    public void onBirthDateClick()
    {
        au.a(i(), this);
    }

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        f = Integer.valueOf(j + 1);
        g = Integer.valueOf(k);
        datepicker = Calendar.getInstance();
        datepicker.set(i, j, k);
        tvBirthDate.setText((new StringBuilder()).append(datepicker.getDisplayName(2, 2, Locale.getDefault())).append(" ").append(k).toString());
    }

    public void stateSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ad.b(((String)d.getItem(i)).toString(), i());
        view = (TextView)spState.getSelectedView();
        if (view != null)
        {
            view.setText(adapterview);
        }
    }
}
