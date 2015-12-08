// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.skype.PROPKEY;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.SpinnerAdapter;
import java.util.Arrays;
import java.util.List;

public class SmsTargetsSpinner extends Spinner
{
    private final class a extends SpinnerAdapter
    {

        final SmsTargetsSpinner this$0;

        public final View getDropDownView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = super.getDropDownView(i, view, viewgroup);
            TextView textview = (TextView)viewgroup.findViewById(0x7f100531);
            view = (PROPKEY)((Pair)getItem(i)).first;
            String s = (String)((Pair)getItem(i)).second;
            float f;
            if (view == PROPKEY.CONTACT_SKYPENAME)
            {
                textview.setText(getContext().getString(0x7f080328));
            } else
            {
                textview.setText(getContext().getString(0x7f08032d, new Object[] {
                    s
                }));
            }
            f = textview.getTextSize();
            if (i == getSelectedPosition())
            {
                view = typeFaceFactory.getBold(f);
            } else
            {
                view = typeFaceFactory.getDefault(f);
            }
            textview.setTypeface(view);
            return viewgroup;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = super.getView(i, view, viewgroup);
            if (accessibility.a())
            {
                AccessibilityUtil.a(new View[] {
                    view1
                });
            }
            spinnerArrow = (ImageView)view1.findViewById(0x7f100533);
            view = spinnerArrow;
            Resources resources;
            TextView textview;
            String s1;
            int j;
            if (isEnabled())
            {
                j = 0;
            } else
            {
                j = 8;
            }
            view.setVisibility(j);
            textview = (TextView)view1.findViewById(0x7f100532);
            view = (PROPKEY)((Pair)getItem(i)).first;
            s1 = (String)((Pair)getItem(i)).second;
            if (view == PROPKEY.CONTACT_PSTNNUMBER || Arrays.asList(ContactUtil.c).contains(view))
            {
                String s = getContext().getString(0x7f08032d, new Object[] {
                    s1
                });
                view = s;
                if (accessibility.a())
                {
                    AccessibilityUtil _tmp = accessibility;
                    view = AccessibilityUtil.a(s1);
                    textview.setContentDescription(getContext().getString(0x7f08032d, new Object[] {
                        view
                    }));
                    view = s;
                }
            } else
            {
                view = getContext().getString(0x7f0801a3);
            }
            textview.setTextAppearance(getContext(), 0x7f090230);
            resources = getResources();
            if (viewgroup.isEnabled())
            {
                i = 0x7f0f00d3;
            } else
            {
                i = 0x7f0f0114;
            }
            textview.setTextColor(resources.getColor(i));
            textview.setText(view);
            textview.setTypeface(typeFaceFactory.getBold(textview.getTextSize()));
            return view1;
        }

        public a(Context context, List list)
        {
            this$0 = SmsTargetsSpinner.this;
            super(context, list);
        }
    }


    private AccessibilityUtil accessibility;
    private ImageView spinnerArrow;
    private TypeFaceFactory typeFaceFactory;

    public SmsTargetsSpinner(Context context)
    {
        super(context, null);
        init();
    }

    public SmsTargetsSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public SmsTargetsSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public SmsTargetsSpinner(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    private void init()
    {
        accessibility = new AccessibilityUtil(getContext());
        typeFaceFactory = SegoeTypeFaceFactory.getInstance((Application)getContext().getApplicationContext());
        ViewUtil.a(this, getResources().getDrawable(0x7f0201ca));
    }

    public void setAdapter(List list)
    {
        setAdapter(((android.widget.SpinnerAdapter) (new a(getContext(), list))));
        if (list.size() < 2)
        {
            setEnabled(false);
        }
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        if (spinnerArrow != null)
        {
            ImageView imageview = spinnerArrow;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            imageview.setVisibility(i);
        }
    }

    public void setSelection(int i)
    {
        super.setSelection(i);
        ((a)getAdapter()).setSelectedPosition(i);
    }




/*
    static ImageView access$102(SmsTargetsSpinner smstargetsspinner, ImageView imageview)
    {
        smstargetsspinner.spinnerArrow = imageview;
        return imageview;
    }

*/

}
