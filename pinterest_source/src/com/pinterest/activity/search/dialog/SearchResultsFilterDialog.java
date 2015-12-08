// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.util.CommerceHelper;
import com.pinterest.activity.search.event.GuidedSearchEvent;
import com.pinterest.activity.search.model.QueryMetaData;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;

public class SearchResultsFilterDialog extends BaseDialog
    implements android.view.View.OnClickListener
{

    public static final int SEARCH_FILTER_ALL_PINS = 0;
    public static final int SEARCH_FILTER_BOARDS = 3;
    public static final int SEARCH_FILTER_BUYABLE_PINS = 4;
    public static final int SEARCH_FILTER_MY_PINS = 1;
    public static final int SEARCH_FILTER_PINNERS = 2;
    View _board;
    View _buyablePins;
    private View _container;
    private int _currentSearchFilter;
    private QueryMetaData _lastQueryData;
    private GuidedSearchEvent _lastSearchEvent;
    View _pinners;
    View _pins;
    View _yourPins;

    public SearchResultsFilterDialog()
    {
    }

    private void init()
    {
        ButterKnife.a(this, _container);
        _pins.setOnClickListener(this);
        _pinners.setOnClickListener(this);
        _board.setOnClickListener(this);
        _yourPins.setOnClickListener(this);
        _buyablePins.setOnClickListener(this);
        ViewHelper.setVisibility(_buyablePins, CommerceHelper.isCommerceEnabled());
        ImageView imageview = (ImageView)_pins.findViewById(0x7f0f0076);
        imageview.setImageDrawable(Resources.drawable(0x7f020199));
        ImageView imageview1 = (ImageView)_yourPins.findViewById(0x7f0f0076);
        imageview1.setImageDrawable(Resources.drawable(0x7f020195));
        ImageView imageview2 = (ImageView)_pinners.findViewById(0x7f0f0076);
        imageview2.setImageDrawable(Resources.drawable(0x7f020197));
        ImageView imageview3 = (ImageView)_board.findViewById(0x7f0f0076);
        imageview3.setImageDrawable(Resources.drawable(0x7f020191));
        ImageView imageview4 = (ImageView)_buyablePins.findViewById(0x7f0f0076);
        imageview4.setImageDrawable(Resources.drawable(0x7f020193));
        ((TextView)_pins.findViewById(0x7f0f0077)).setText(Resources.string(0x7f0704d4));
        ((TextView)_yourPins.findViewById(0x7f0f0077)).setText(Resources.string(0x7f0704d9));
        ((TextView)_pinners.findViewById(0x7f0f0077)).setText(Resources.string(0x7f0704d7));
        ((TextView)_board.findViewById(0x7f0f0077)).setText(Resources.string(0x7f0704d5));
        ((TextView)_buyablePins.findViewById(0x7f0f0077)).setText(Resources.string(0x7f0704d6));
        switch (_currentSearchFilter)
        {
        default:
            return;

        case 0: // '\0'
            _pins.setBackgroundColor(Resources.color(0x7f0e001f));
            imageview.setImageDrawable(Resources.drawable(0x7f02019a));
            return;

        case 1: // '\001'
            _yourPins.setBackgroundColor(Resources.color(0x7f0e001f));
            imageview1.setImageDrawable(Resources.drawable(0x7f020196));
            return;

        case 3: // '\003'
            _board.setBackgroundColor(Resources.color(0x7f0e001f));
            imageview3.setImageDrawable(Resources.drawable(0x7f020192));
            return;

        case 2: // '\002'
            _pinners.setBackgroundColor(Resources.color(0x7f0e001f));
            imageview2.setImageDrawable(Resources.drawable(0x7f020198));
            return;

        case 4: // '\004'
            _buyablePins.setBackgroundColor(Resources.color(0x7f0e001f));
            break;
        }
        imageview4.setImageDrawable(Resources.drawable(0x7f020193));
    }

    public static SearchResultsFilterDialog newInstance(GuidedSearchEvent guidedsearchevent, int i, QueryMetaData querymetadata)
    {
        SearchResultsFilterDialog searchresultsfilterdialog = new SearchResultsFilterDialog();
        searchresultsfilterdialog._lastSearchEvent = guidedsearchevent;
        searchresultsfilterdialog._lastQueryData = querymetadata;
        searchresultsfilterdialog._currentSearchFilter = i;
        return searchresultsfilterdialog;
    }

    public void make(LayoutInflater layoutinflater)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(getActivity()).inflate(0x7f030088, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onClick(View view)
    {
        boolean flag = true;
        view.getId();
        JVM INSTR tableswitch 2131689873 2131689877: default 40
    //                   2131689873 79
    //                   2131689874 139
    //                   2131689875 152
    //                   2131689876 110
    //                   2131689877 165;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        _lastSearchEvent.setLastQueryData(_lastQueryData);
        _lastSearchEvent.setSearchFilterApplied(flag);
        _lastSearchEvent.setTokenFilter(false);
        Events.post(_lastSearchEvent);
        dismiss();
        return;
_L2:
        _lastSearchEvent.setType(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
        _lastSearchEvent.setIsMyPins(false);
        _lastSearchEvent.setCommerceOnly(false);
        flag = false;
        continue; /* Loop/switch isn't completed */
_L5:
        _lastSearchEvent.setType(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
        _lastSearchEvent.setIsMyPins(true);
        _lastSearchEvent.setCommerceOnly(false);
        continue; /* Loop/switch isn't completed */
_L3:
        _lastSearchEvent.setType(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER);
        continue; /* Loop/switch isn't completed */
_L4:
        _lastSearchEvent.setType(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD);
        continue; /* Loop/switch isn't completed */
_L6:
        _lastSearchEvent.setType(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
        _lastSearchEvent.setIsMyPins(false);
        _lastSearchEvent.setCommerceOnly(true);
        if (true) goto _L1; else goto _L7
_L7:
    }
}
