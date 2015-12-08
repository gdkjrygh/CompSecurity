// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.base.view.DefaultViewHolder;
import com.google.android.apps.wallet.ui.listener.Listeners;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.common.base.Strings;

public class TextAndButtonListRowDisplay extends DefaultViewHolder
{

    private final View horizontalDivider;
    private final ImageButton icon;
    private final View listRow;
    private final CompoundButton listRowControl;
    private final TextView subtitle;
    private final TextView title;

    public TextAndButtonListRowDisplay(LayoutInflater layoutinflater)
    {
        super(com.google.android.apps.walletnfcrel.R.layout.text_and_button_list_row);
        createView(layoutinflater);
        listRow = findViewById(com.google.android.apps.walletnfcrel.R.id.ListRow);
        title = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.Title);
        subtitle = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.Subtitle);
        listRowControl = (CompoundButton)findViewById(com.google.android.apps.walletnfcrel.R.id.ListRowControl);
        listRowControl.setFocusable(false);
        listRowControl.setClickable(false);
        listRowControl.setVisibility(8);
        icon = (ImageButton)findViewById(com.google.android.apps.walletnfcrel.R.id.Icon);
        horizontalDivider = findViewById(com.google.android.apps.walletnfcrel.R.id.HorizontalDivider);
    }

    public final String getTitle()
    {
        return title.getText().toString();
    }

    public final boolean isSwitchOn()
    {
        return listRowControl.isChecked();
    }

    public final void setDividerVisible(boolean flag)
    {
        View view = horizontalDivider;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void setEnabled(boolean flag)
    {
        title.setEnabled(flag);
        listRowControl.setEnabled(flag);
        listRow.setEnabled(flag);
    }

    public final void setRootViewId(int i)
    {
        ((RelativeLayout)rootView).setId(i);
    }

    public final void setRowActionListener(OnActionListener onactionlistener)
    {
        if (onactionlistener == null)
        {
            listRow.setClickable(false);
            listRow.setOnClickListener(null);
            return;
        } else
        {
            listRow.setClickable(true);
            listRow.setOnClickListener(Listeners.getOnClickListener(onactionlistener, null));
            return;
        }
    }

    public final void setSubtitle(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            subtitle.setVisibility(8);
            return;
        } else
        {
            subtitle.setText(s);
            subtitle.setVisibility(0);
            return;
        }
    }

    public final void setSwitch(boolean flag)
    {
        listRowControl.setChecked(flag);
        listRowControl.setVisibility(0);
    }

    public final void setTitle(String s)
    {
        title.setText(s);
    }

    public final void setTitleStyleToDisableable()
    {
        title.setTextAppearance(getContext(), com.google.android.apps.walletnfcrel.R.style.ListItemPrimaryText_Disableable);
    }
}
