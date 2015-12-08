// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.pinterest.activity.settings.Country;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.adapter.CountryListAdapter;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.utils.LocaleUtils;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountrySettingDialog extends BaseDialog
{

    private CountryListAdapter _adapter;
    private View _container;
    private List _countries;
    private CountrySettingDialog _dialog;
    ListView _listView;

    public CountrySettingDialog()
    {
        _adapter = new CountryListAdapter();
        _countries = new ArrayList();
        _dialog = this;
    }

    private void initAdapter(PinterestJsonObject pinterestjsonobject)
    {
        java.util.Map.Entry entry;
        for (pinterestjsonobject = pinterestjsonobject.a().entrySet().iterator(); pinterestjsonobject.hasNext(); _countries.add(new Country((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)pinterestjsonobject.next();
        }

        Collections.sort(_countries);
        _adapter.setDataSource(_countries);
    }

    public void init()
    {
        initAdapter(DiskCache.getJsonObject("COUNTRIES"));
        ButterKnife.a(this, _container);
        _listView.setAdapter(_adapter);
        _listView.setOnItemClickListener(new _cls1());
    }

    public void make(LayoutInflater layoutinflater)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(getActivity()).inflate(0x7f03005f, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        setTitle((new StringBuilder()).append(Resources.string(0x7f070190)).append(": ").append(LocaleUtils.getCountry()).toString());
        super.onActivityCreated(bundle);
    }



    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final CountrySettingDialog this$0;

        public void onItemClick(final AdapterView country, View view, int i, long l)
        {
            Pinalytics.a(ElementType.COUNTRY_BUTTON, ComponentType.MODAL_DIALOG);
            country = _adapter.getItem(i);
            class _cls1 extends ApiResponseHandler
            {

                final _cls1 this$1;
                final Country val$country;

                public void onFailure(Throwable throwable, ApiResponse apiresponse)
                {
                    super.onFailure(throwable, apiresponse);
                    Events.post(new DialogEvent(null));
                }

                public void onStart()
                {
                    super.onStart();
                    Events.post(new DialogEvent(new LoadingDialog()));
                }

                public void onSuccess(ApiResponse apiresponse)
                {
                    Application.showToastShort(String.format(Resources.string(0x7f07038c), new Object[] {
                        country.name
                    }));
                    super.onSuccess(apiresponse);
                    Events.post(new DialogEvent(null));
                    Events.post(new com.pinterest.activity.settings.UpdatedAccountSettingsFragment.AccountSettingsEvent());
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    country = country1;
                    super();
                }
            }

            SettingsApi.e("country", ((Country) (country)).code, new _cls1(), null);
            LocaleUtils.saveLocale(LocaleUtils.getLang(), ((Country) (country)).name);
            _dialog.dismiss();
        }

        _cls1()
        {
            this$0 = CountrySettingDialog.this;
            super();
        }
    }

}
