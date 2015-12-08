// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.PROPKEY;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.SpinnerAdapter;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat:
//            SmsTargetsSpinner

private final class this._cls0 extends SpinnerAdapter
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
            view = SmsTargetsSpinner.access$200(SmsTargetsSpinner.this).getBold(f);
        } else
        {
            view = SmsTargetsSpinner.access$200(SmsTargetsSpinner.this).getDefault(f);
        }
        textview.setTypeface(view);
        return viewgroup;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = super.getView(i, view, viewgroup);
        if (SmsTargetsSpinner.access$000(SmsTargetsSpinner.this).a())
        {
            AccessibilityUtil.a(new View[] {
                view1
            });
        }
        SmsTargetsSpinner.access$102(SmsTargetsSpinner.this, (ImageView)view1.findViewById(0x7f100533));
        view = SmsTargetsSpinner.access$100(SmsTargetsSpinner.this);
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
            if (SmsTargetsSpinner.access$000(SmsTargetsSpinner.this).a())
            {
                AccessibilityUtil _tmp = SmsTargetsSpinner.access$000(SmsTargetsSpinner.this);
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
        textview.setTypeface(SmsTargetsSpinner.access$200(SmsTargetsSpinner.this).getBold(textview.getTextSize()));
        return view1;
    }

    public ityUtil(Context context, List list)
    {
        this$0 = SmsTargetsSpinner.this;
        super(context, list);
    }
}
