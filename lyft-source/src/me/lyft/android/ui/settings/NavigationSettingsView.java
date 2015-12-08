// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.AppFlow;
import me.lyft.android.controls.Toggle;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.rx.Binder;
import me.lyft.android.utils.Navigator;
import rx.functions.Action1;

public class NavigationSettingsView extends LinearLayout
{

    AppFlow appFlow;
    Toggle autoNavigationToggle;
    ILyftPreferences lyftPreferences;
    Navigator navigator;
    ListView navigatorsListView;
    private final Action1 onAutoNavigationToggleChanged = new Action1() {

        final NavigationSettingsView this$0;

        public void call(Boolean boolean1)
        {
            lyftPreferences.setAutoNavigationEnabled(boolean1.booleanValue());
        }

        public volatile void call(Object obj)
        {
            call((Boolean)obj);
        }

            
            {
                this$0 = NavigationSettingsView.this;
                super();
            }
    };
    private android.widget.AdapterView.OnItemClickListener onNavigatorSelectedListener;
    Toolbar toolbar;

    public NavigationSettingsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onNavigatorSelectedListener = new android.widget.AdapterView.OnItemClickListener() {

            final NavigationSettingsView this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (i == 1 && !navigator.isWazeInstalled())
                {
                    navigator.startWazeInstall();
                    return;
                } else
                {
                    lyftPreferences.setSelectedNavigation(i);
                    return;
                }
            }

            
            {
                this$0 = NavigationSettingsView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            Binder binder = Binder.attach(this);
            navigatorsListView.setItemChecked(lyftPreferences.getSelectedNavigation(), true);
            autoNavigationToggle.setChecked(lyftPreferences.isAutoNavigationEnabled());
            binder.bind(autoNavigationToggle.observeChange(), onAutoNavigationToggleChanged);
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            toolbar.setTitle(getContext().getString(0x7f070208));
            Object obj = getResources().getString(0x7f070209);
            String s = getResources().getString(0x7f07020a);
            obj = new ArrayAdapter(getContext(), 0x7f03012d, 0x7f0d0198, new String[] {
                obj, s
            });
            navigatorsListView.setAdapter(((android.widget.ListAdapter) (obj)));
            navigatorsListView.setOnItemClickListener(onNavigatorSelectedListener);
            return;
        }
    }
}
