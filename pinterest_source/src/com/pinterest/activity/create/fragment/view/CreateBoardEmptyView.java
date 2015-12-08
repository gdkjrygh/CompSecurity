// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.ui.grid.AdapterFooterView;

public class CreateBoardEmptyView extends LinearLayout
{

    private String _categorySuggestions[];
    private android.view.View.OnClickListener onSuggestionClick;

    public CreateBoardEmptyView(Context context)
    {
        this(context, null);
    }

    public CreateBoardEmptyView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onSuggestionClick = new _cls1();
        init();
    }

    private void buildUi()
    {
        setOrientation(1);
        LayoutInflater layoutinflater = LayoutInflater.from(getContext());
        layoutinflater.inflate(0x7f0301c5, this, true);
        setClickable(true);
        ViewGroup viewgroup = (ViewGroup)findViewById(0x7f0f0467);
        String as[] = _categorySuggestions;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            View view = layoutinflater.inflate(0x7f03014f, null, false);
            ((TextView)view.findViewById(0x7f0f0077)).setText(s);
            view.setOnClickListener(onSuggestionClick);
            view.setTag(s);
            viewgroup.addView(view);
        }

        ((AdapterFooterView)findViewById(0x7f0f0468)).setShadowVisibility(8);
        ((AdapterFooterView)findViewById(0x7f0f0468)).setState(1);
    }

    private void findSuggestions()
    {
        _categorySuggestions = new String[0];
        Object obj = ModelHelper.getPin(((Activity)getContext()).getIntent().getExtras().getString("com.pinterest.EXTRA_PIN_ID"));
        if (obj != null && ((Pin) (obj)).getBoard() != null)
        {
            String s1 = ((Pin) (obj)).getBoard().getCategory();
            obj = s1;
            if (s1 == null)
            {
                obj = "";
            }
            int i = getResources().getIdentifier((new StringBuilder("id_")).append(((String) (obj)).toLowerCase()).toString(), "string", getContext().getPackageName());
            if (i != 0)
            {
                String s = getContext().getString(i);
                _categorySuggestions = com.pinterest.kit.application.Resources.stringArray(getResources().getIdentifier((new StringBuilder()).append(s).append("_list").toString(), "array", getContext().getPackageName()));
                return;
            }
        }
        _categorySuggestions = com.pinterest.kit.application.Resources.stringArray(0x7f080022);
    }

    private void init()
    {
        findSuggestions();
        buildUi();
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CreateBoardEmptyView this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.BOARD_CREATE_SUGGESTED, ComponentType.NAVIGATION);
            String s1 = "";
            Object obj = ((Activity)getContext()).getIntent().getExtras();
            String s = s1;
            if (obj != null)
            {
                obj = ModelHelper.getPin(((Bundle) (obj)).getString("com.pinterest.EXTRA_PIN_ID"));
                s = s1;
                if (obj != null)
                {
                    s = ((Pin) (obj)).getBoard().getCategory();
                }
            }
            view = CreateBoardDialog.newInstance((String)view.getTag());
            view.setCategory(s);
            Events.post(new DialogEvent(view));
        }

        _cls1()
        {
            this$0 = CreateBoardEmptyView.this;
            super();
        }
    }

}
