// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.q;

// Referenced classes of package com.facebook.widget:
//            e, m, n, o

public class RadioButtonWithSubtitle extends e
    implements Checkable
{

    private final RadioButton a;
    private final TextView b;
    private final TextView c;
    private final ViewGroup d;
    private o e;

    public RadioButtonWithSubtitle(Context context)
    {
        this(context, null);
    }

    public RadioButtonWithSubtitle(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setContentView(k.radio_button_with_subtitle);
        setOrientation(0);
        a = (RadioButton)a(i.radio_button);
        d = (ViewGroup)a(i.radio_button_text_wrapper);
        b = (TextView)a(i.radio_button_title);
        c = (TextView)a(i.radio_button_subtitle);
        attributeset = context.obtainStyledAttributes(attributeset, q.RadioButtonWithSubtitle);
        context = attributeset.getString(q.RadioButtonWithSubtitle_android_text);
        attributeset = attributeset.getString(q.RadioButtonWithSubtitle_subtitle);
        b.setText(context);
        c.setText(attributeset);
        d.setOnClickListener(new m(this));
        a.setOnCheckedChangeListener(new n(this));
    }

    static RadioButton a(RadioButtonWithSubtitle radiobuttonwithsubtitle)
    {
        return radiobuttonwithsubtitle.a;
    }

    static o b(RadioButtonWithSubtitle radiobuttonwithsubtitle)
    {
        return radiobuttonwithsubtitle.e;
    }

    public boolean isChecked()
    {
        return a.isChecked();
    }

    public void setChecked(boolean flag)
    {
        a.setChecked(flag);
    }

    public void setOnCheckedChangeListener(o o)
    {
        e = o;
    }

    public void toggle()
    {
        a.toggle();
    }
}
