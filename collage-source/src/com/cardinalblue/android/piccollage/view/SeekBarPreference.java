// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.content.res.Resources;
import android.preference.DialogPreference;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarPreference extends DialogPreference
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    private SeekBar a;
    private TextView b;
    private String c;
    private int d;
    private int e;
    private Context f;

    protected void onBindDialogView(View view)
    {
        super.onBindDialogView(view);
        a.setMax(d);
        a.setProgress(e - 320);
    }

    protected View onCreateDialogView()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030125, null);
        a = (SeekBar)view.findViewById(0x7f100263);
        b = (TextView)view.findViewById(0x7f100262);
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            b.setTextColor(f.getResources().getColor(0x106000b));
        }
        if (shouldPersist())
        {
            e = getPersistedInt(320);
        }
        a.setOnSeekBarChangeListener(this);
        a.setMax(d);
        a.setProgress(e - 320);
        return view;
    }

    protected void onDialogClosed(boolean flag)
    {
        super.onDialogClosed(flag);
        if (flag)
        {
            e = a.getProgress() + 320;
            if (shouldPersist())
            {
                persistInt(e);
            }
            callChangeListener(Integer.valueOf(e));
        }
        f = null;
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        String s = String.valueOf(i + 320);
        seekbar = s;
        if (c != null)
        {
            seekbar = (new StringBuilder()).append(s).append(c).toString();
        }
        b.setText(seekbar);
    }

    protected void onSetInitialValue(boolean flag, Object obj)
    {
        super.onSetInitialValue(flag, obj);
        if (flag)
        {
            int i;
            if (shouldPersist())
            {
                i = getPersistedInt(320);
            } else
            {
                i = 0;
            }
            e = i;
            return;
        } else
        {
            e = ((Integer)obj).intValue();
            return;
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
    }
}
