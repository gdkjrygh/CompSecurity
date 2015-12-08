// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.autocomplete;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.text.clearable.ClearableEditText;
import com.google.common.base.Preconditions;

public class AutoCompleteTile extends LinearLayout
{

    private Filter filter;
    private final ClearableEditText input;
    private final ListView listView;

    public AutoCompleteTile(Context context)
    {
        this(context, null);
    }

    public AutoCompleteTile(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(1);
        LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.autocomplete_tile, this);
        input = (ClearableEditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Input);
        listView = (ListView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.SuggestionList);
        listView.setEmptyView(new View(context));
        input.addTextChangedListener(new DefaultTextWatcher() {

            final AutoCompleteTile this$0;

            public final void afterTextChanged(Editable editable)
            {
                if (filter != null)
                {
                    filter.filter(editable);
                }
            }

            
            {
                this$0 = AutoCompleteTile.this;
                super();
            }
        });
        context = context.obtainStyledAttributes(attributeset, com.google.android.apps.walletnfcrel.R.styleable.AutoCompleteTile);
        if (context.hasValue(com.google.android.apps.walletnfcrel.R.styleable.AutoCompleteTile_actHint))
        {
            input.setHint(context.getString(com.google.android.apps.walletnfcrel.R.styleable.AutoCompleteTile_actHint));
        }
        context.recycle();
    }

    public final void addTextChangedListener(TextWatcher textwatcher)
    {
        input.addTextChangedListener(textwatcher);
    }

    public final Editable getText()
    {
        return input.getText();
    }

    public void setAdapter(ListAdapter listadapter)
    {
        Preconditions.checkNotNull(listadapter);
        setAdapter(listadapter, ((Filterable)listadapter).getFilter());
    }

    public void setAdapter(ListAdapter listadapter, Filter filter1)
    {
        Preconditions.checkNotNull(listadapter);
        listView.setAdapter(listadapter);
        filter = filter1;
    }

    public void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener oneditoractionlistener)
    {
        input.setOnEditorActionListener(oneditoractionlistener);
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        listView.setOnItemClickListener(onitemclicklistener);
    }

    public void setText(CharSequence charsequence)
    {
        input.setText(charsequence);
        input.setSelection(input.getText().length());
    }

}
