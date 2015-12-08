// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package org.chromium.ui.picker:
//            DateTimeSuggestion

class DateTimeSuggestionListAdapter extends ArrayAdapter
{

    private final Context mContext;

    DateTimeSuggestionListAdapter(Context context, List list)
    {
        super(context, org.chromium.ui.R.layout.date_time_suggestion, list);
        mContext = context;
    }

    public int getCount()
    {
        return super.getCount() + 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(mContext).inflate(org.chromium.ui.R.layout.date_time_suggestion, viewgroup, false);
        }
        view = (TextView)view1.findViewById(org.chromium.ui.R.id.date_time_suggestion_value);
        viewgroup = (TextView)view1.findViewById(org.chromium.ui.R.id.date_time_suggestion_label);
        if (i == getCount() - 1)
        {
            view.setText(mContext.getText(org.chromium.ui.R.string.date_picker_dialog_other_button_label));
            viewgroup.setText("");
            return view1;
        } else
        {
            view.setText(((DateTimeSuggestion)getItem(i)).localizedValue());
            viewgroup.setText(((DateTimeSuggestion)getItem(i)).label());
            return view1;
        }
    }
}
