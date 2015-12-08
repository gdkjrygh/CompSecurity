// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.util.Map;

// Referenced classes of package com.localytics.android:
//            TestModeListView, AmpConstants, AmpCallable

class adjustLayout extends Dialog
{

    private LinearLayout mDialogLayout;
    private DisplayMetrics mMetrics;
    final TestModeListView this$0;

    private void adjustLayout()
    {
        mMetrics = new DisplayMetrics();
        ((WindowManager)getActivity().getSystemService("window")).getDefaultDisplay().getMetrics(mMetrics);
        Window window = getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setAttributes(window.getAttributes());
        window.setFlags(1024, 1024);
    }

    private void setupViews()
    {
        mDialogLayout = new LinearLayout(getContext());
        mDialogLayout.setLayoutParams(new android.widget.nit>(-1, -2));
        mDialogLayout.setGravity(16);
        mDialogLayout.setOrientation(1);
        Object obj = new pter(TestModeListView.this, getActivity());
        ListView listview = new ListView(getActivity());
        listview.setAdapter(((android.widget.ListAdapter) (obj)));
        listview.setBackground(new ColorDrawable(0));
        listview.setDividerHeight(1);
        listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final TestModeListView.MenuDialog this$1;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (i != 0) goto _L2; else goto _L1
_L1:
                AmpConstants.setTestModeEnabled(false);
                dismiss();
_L4:
                dismiss();
                return;
_L2:
                if (i == 1)
                {
                    if (TestModeListView.access$200(this$0) != null)
                    {
                        adapterview = (AmpCallable)TestModeListView.access$200(this$0).get(Integer.valueOf(12));
                        if (adapterview != null)
                        {
                            adapterview.call(null);
                        }
                    }
                } else
                if (i == 2)
                {
                    if (TestModeListView.access$200(this$0) != null)
                    {
                        adapterview = (AmpCallable)TestModeListView.access$200(this$0).get(Integer.valueOf(13));
                        if (adapterview != null)
                        {
                            adapterview.call(null);
                        }
                    }
                } else
                if (i == 3 && TestModeListView.access$200(this$0) != null)
                {
                    adapterview = (AmpCallable)TestModeListView.access$200(this$0).get(Integer.valueOf(14));
                    if (adapterview != null)
                    {
                        adapterview.call(null);
                    }
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$1 = TestModeListView.MenuDialog.this;
                super();
            }
        });
        mDialogLayout.addView(listview);
        obj = new View(getActivity());
        ((View) (obj)).setBackground(new ColorDrawable(0));
        ((View) (obj)).setLayoutParams(new android.widget.nit>(-1, (int)(getResources().getDisplayMetrics().density * 10F + 0.5F)));
        mDialogLayout.addView(((View) (obj)));
        obj = new dapter(TestModeListView.this, getActivity());
        listview = new ListView(getActivity());
        listview.setAdapter(((android.widget.ListAdapter) (obj)));
        listview.setBackground(new ColorDrawable(0));
        listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final TestModeListView.MenuDialog this$1;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                dismiss();
            }

            
            {
                this$1 = TestModeListView.MenuDialog.this;
                super();
            }
        });
        mDialogLayout.addView(listview);
        requestWindowFeature(1);
        setContentView(mDialogLayout);
    }

    public _cls2.this._cls1(Context context, int i)
    {
        this$0 = TestModeListView.this;
        super(context, i);
        setupViews();
        adjustLayout();
    }
}
