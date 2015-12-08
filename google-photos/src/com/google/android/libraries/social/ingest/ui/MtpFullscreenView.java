// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.ingest.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import b;
import java.util.Collection;
import ncy;
import ncz;

// Referenced classes of package com.google.android.libraries.social.ingest.ui:
//            MtpImageView

public final class MtpFullscreenView extends RelativeLayout
    implements Checkable, android.widget.CompoundButton.OnCheckedChangeListener, ncz
{

    public MtpImageView a;
    private CheckBox b;
    private int c;
    private ncy d;

    public MtpFullscreenView(Context context)
    {
        super(context);
        c = -1;
    }

    public MtpFullscreenView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = -1;
    }

    public MtpFullscreenView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = -1;
    }

    public final void a()
    {
        if (d != null)
        {
            setChecked(d.a(c));
        }
    }

    public final void a(int i, ncy ncy1)
    {
        if (d != null)
        {
            d.a(this);
        }
        c = i;
        d = ncy1;
        if (d != null)
        {
            setChecked(d.a(i));
            d.a.add(this);
        }
    }

    public final void a(int i, boolean flag)
    {
        if (i == c)
        {
            setChecked(flag);
        }
    }

    public final boolean isChecked()
    {
        return b.isChecked();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (d != null)
        {
            d.a(c, flag);
        }
    }

    public final void onDetachedFromWindow()
    {
        a(-1, ((ncy) (null)));
        super.onDetachedFromWindow();
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        a = (MtpImageView)findViewById(b.Fz);
        b = (CheckBox)findViewById(b.FA);
        b.setOnCheckedChangeListener(this);
    }

    public final void setChecked(boolean flag)
    {
        b.setChecked(flag);
    }

    public final void toggle()
    {
        b.toggle();
    }
}
