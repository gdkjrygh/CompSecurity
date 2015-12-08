// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Context;
import android.content.res.Resources;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public abstract class BinaryDialogPreference extends DialogPreference
{

    private static final String FIRST_SELECTION = "0";
    private static final String SECOND_SELECTION = "1";
    private CharSequence choiceDetails[];
    private CharSequence choiceHeaders[];
    android.view.View.OnClickListener containerListener = new android.view.View.OnClickListener() {

        final BinaryDialogPreference this$0;

        public final void onClick(View view)
        {
            switch (view.getId())
            {
            default:
                return;

            case 2131756328: 
                firstRadio.setChecked(true);
                return;

            case 2131756332: 
                secondRadio.setChecked(true);
                break;
            }
        }

            
            {
                this$0 = BinaryDialogPreference.this;
                super();
            }
    };
    private RelativeLayout firstContainer;
    private RadioButton firstRadio;
    android.widget.CompoundButton.OnCheckedChangeListener radioListener = new android.widget.CompoundButton.OnCheckedChangeListener() {

        final BinaryDialogPreference this$0;

        public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            if (!flag || compoundbutton.getId() != 0x7f10052b) goto _L2; else goto _L1
_L1:
            secondRadio.setChecked(false);
_L4:
            updateContentDescription();
            return;
_L2:
            if (flag && compoundbutton.getId() == 0x7f10052f)
            {
                firstRadio.setChecked(false);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

            
            {
                this$0 = BinaryDialogPreference.this;
                super();
            }
    };
    private RelativeLayout secondContainer;
    private RadioButton secondRadio;
    private boolean value;

    public BinaryDialogPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        choiceHeaders = null;
        choiceDetails = null;
    }

    public BinaryDialogPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        choiceHeaders = null;
        choiceDetails = null;
    }

    private void updateContentDescription()
    {
        int j = 0x7f080074;
        Resources resources = getContext().getResources();
        RelativeLayout relativelayout = firstContainer;
        StringBuilder stringbuilder = (new StringBuilder()).append(((TextView)firstContainer.findViewById(0x7f10052a)).getText()).append(", ");
        int i;
        if (firstRadio.isChecked())
        {
            i = 0x7f080074;
        } else
        {
            i = 0x7f0800e8;
        }
        relativelayout.setContentDescription(stringbuilder.append(resources.getString(i)).toString());
        relativelayout = secondContainer;
        stringbuilder = (new StringBuilder()).append(((TextView)secondContainer.findViewById(0x7f10052e)).getText()).append(", ");
        if (secondRadio.isChecked())
        {
            i = j;
        } else
        {
            i = 0x7f0800e8;
        }
        relativelayout.setContentDescription(stringbuilder.append(resources.getString(i)).toString());
    }

    protected View onCreateDialogView()
    {
        if (choiceHeaders == null || choiceDetails == null)
        {
            throw new IllegalStateException("Strings for positive and negative choices required.");
        }
        View view = LayoutInflater.from(getContext()).inflate(0x7f03010d, null);
        TextView textview = (TextView)view.findViewById(0x7f100529);
        TextView textview1 = (TextView)view.findViewById(0x7f10052a);
        TextView textview2 = (TextView)view.findViewById(0x7f10052d);
        TextView textview3 = (TextView)view.findViewById(0x7f10052e);
        textview.setText(choiceHeaders[0]);
        textview1.setText(choiceDetails[0]);
        textview2.setText(choiceHeaders[1]);
        textview3.setText(choiceDetails[1]);
        firstRadio = (RadioButton)view.findViewById(0x7f10052b);
        secondRadio = (RadioButton)view.findViewById(0x7f10052f);
        if (value)
        {
            firstRadio.setChecked(true);
        } else
        {
            secondRadio.setChecked(true);
        }
        firstRadio.setOnCheckedChangeListener(radioListener);
        secondRadio.setOnCheckedChangeListener(radioListener);
        firstContainer = (RelativeLayout)view.findViewById(0x7f100528);
        secondContainer = (RelativeLayout)view.findViewById(0x7f10052c);
        firstContainer.setOnClickListener(containerListener);
        secondContainer.setOnClickListener(containerListener);
        updateContentDescription();
        return view;
    }

    protected void onDialogClosed(boolean flag)
    {
        if (flag)
        {
            value = firstRadio.isChecked();
            callChangeListener(Boolean.valueOf(value));
        }
    }

    protected void setDetails(CharSequence acharsequence[])
    {
        choiceDetails = acharsequence;
    }

    protected void setHeaders(CharSequence acharsequence[])
    {
        choiceHeaders = acharsequence;
    }

    public void setValue(boolean flag)
    {
        value = flag;
        callChangeListener(Boolean.valueOf(flag));
    }



}
