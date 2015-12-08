// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.skype.android.config.ecs.EcsConfiguration;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsCategoriesFragment

private static final class abled extends ArrayAdapter
{

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = LayoutInflater.from(getContext()).inflate(0x1090016, null);
        }
        view = (getContext)getItem(i);
        viewgroup.setTag(view);
        ((TextView)viewgroup).setText(getContext().getString(access._mth000(view)));
        return viewgroup;
    }

    public A(Context context, EcsConfiguration ecsconfiguration)
    {
        super(context, 0, getValues(false, ecsconfiguration.isFeedbackUiEnabled()));
    }
}
