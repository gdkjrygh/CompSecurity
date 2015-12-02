// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.widget.switcher.Switch;
import com.qihoo360.mobilesafe.b.a;

public class CheckBoxPreference extends RelativeLayout
{

    public final CompoundButton a;
    private final ImageView b;
    private final LocaleTextView c;
    private final LocaleTextView d;
    private final CompoundButton e;
    private final View f;
    private final LocaleTextView g;
    private boolean h;

    public CheckBoxPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.Preference);
        float f1;
        int i;
        boolean flag;
        if (attributeset.getBoolean(7, false))
        {
            View.inflate(context, 0x7f030084, this);
        } else
        {
            View.inflate(context, 0x7f030083, this);
        }
        b = (ImageView)findViewById(0x7f0b01b4);
        c = (LocaleTextView)findViewById(0x7f0b01b7);
        d = (LocaleTextView)findViewById(0x7f0b01b8);
        g = (LocaleTextView)findViewById(0x7f0b01bb);
        a = (Switch)findViewById(0x7f0b01b9);
        e = (CheckBox)findViewById(0x7f0b01ba);
        f = findViewById(0x7f0b01bc);
        attributeset.getInt(6, 0);
        JVM INSTR tableswitch 0 2: default 156
    //                   0 299
    //                   1 325
    //                   2 341;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_341;
_L5:
        i = attributeset.getResourceId(0, 0);
        context = attributeset.getText(0);
        int j;
        if (i != 0)
        {
            c.setLocalText(i);
            c.setVisibility(0);
        } else
        if (context != null)
        {
            c.setLocalText(context);
            c.setVisibility(0);
        } else
        {
            c.setVisibility(8);
        }
        f1 = attributeset.getDimension(2, 0.0F);
        if (f1 != 0.0F)
        {
            c.setTextSize(0, f1);
        }
        i = attributeset.getResourceId(4, 0);
        context = attributeset.getText(4);
        if (i != 0)
        {
            d.setLocalText(i);
            d.setVisibility(0);
        } else
        if (context != null)
        {
            d.setLocalText(context);
            d.setVisibility(0);
        } else
        {
            d.setVisibility(8);
        }
        flag = attributeset.getBoolean(5, true);
        context = f;
        if (flag)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        context.setVisibility(j);
        attributeset.recycle();
        setBackgroundResource(0x7f02011a);
        return;
_L2:
        a.setVisibility(8);
        e.setVisibility(8);
        h = false;
          goto _L5
_L3:
        a.setVisibility(0);
        h = false;
          goto _L5
        e.setVisibility(0);
        h = true;
          goto _L5
    }

    public void a()
    {
        if (c.getLineCount() + d.getLineCount() >= 3)
        {
            LinearLayout linearlayout = (LinearLayout)findViewById(0x7f0b01b5);
            if (linearlayout != null)
            {
                android.view.ViewGroup.LayoutParams layoutparams = linearlayout.getLayoutParams();
                if (layoutparams != null)
                {
                    layoutparams.height = com.qihoo360.mobilesafe.b.a.a(getContext(), 88F);
                    linearlayout.setLayoutParams(layoutparams);
                }
            }
        }
    }

    public boolean a(boolean flag)
    {
        if (h)
        {
            e.setChecked(flag);
            return flag;
        } else
        {
            a.setChecked(flag);
            return flag;
        }
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        float f1;
        if (h)
        {
            e.setEnabled(flag);
        } else
        {
            a.setEnabled(flag);
        }
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.4F;
        }
        com.nineoldandroids.b.a.a(this, f1);
    }

    public void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener oncheckedchangelistener)
    {
        if (h)
        {
            e.setOnCheckedChangeListener(oncheckedchangelistener);
            return;
        } else
        {
            a.setOnCheckedChangeListener(oncheckedchangelistener);
            return;
        }
    }

    public void setStatus(int i)
    {
        if (g != null)
        {
            g.setVisibility(0);
            g.setLocalText(i);
        }
    }

    public void setStatus(CharSequence charsequence)
    {
        if (g != null)
        {
            g.setVisibility(0);
            g.setLocalText(charsequence);
        }
    }

    public void setSummary(int i)
    {
        if (d.getVisibility() != 0)
        {
            d.setVisibility(0);
        }
        d.setLocalText(i);
    }

    public void setSummary(String s)
    {
        if (d.getVisibility() != 0)
        {
            d.setVisibility(0);
        }
        d.setLocalText(s);
    }

    public void setTitle(String s)
    {
        c.setLocalText(s);
    }

    public void setTitleColor(int i)
    {
        if (c != null)
        {
            c.setTextColor(i);
        }
    }
}
