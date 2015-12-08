// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.pandora.android.view.PandoraImageButton;

// Referenced classes of package com.pandora.android.util:
//            s

public class ThumbImageButton extends PandoraImageButton
    implements Checkable
{

    private static final int a[] = {
        0x7f0100d0
    };
    private static final int b[] = {
        0x10100a0
    };
    private boolean c;
    private boolean d;
    private String e;

    public ThumbImageButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = false;
        a(context, attributeset);
    }

    public ThumbImageButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = false;
        a(context, attributeset);
    }

    public ThumbImageButton(Context context, String s1)
    {
        super(context);
        c = false;
        e = s1;
        a();
    }

    private void a()
    {
        if (c || !isEnabled())
        {
            setContentDescription(getResources().getString(0x7f0800e5, new Object[] {
                e
            }));
            return;
        }
        if (d)
        {
            setContentDescription(getResources().getString(0x7f0800e9, new Object[] {
                e
            }));
            return;
        } else
        {
            setContentDescription(getResources().getString(0x7f0800e4, new Object[] {
                e
            }));
            return;
        }
    }

    private void a(Context context, AttributeSet attributeset)
    {
        int i;
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.ThumbType);
            e = context.getString(0);
            context.recycle();
        }
        i = getId();
        if (!s.a(e) || i == -1) goto _L2; else goto _L1
_L1:
        context = getResources().getResourceEntryName(getId()).toLowerCase();
        if (!context.contains(getResources().getString(0x7f0800ed).toLowerCase())) goto _L4; else goto _L3
_L3:
        e = getResources().getString(0x7f0800ed);
_L2:
        a();
        return;
_L4:
        if (context.contains(getResources().getString(0x7f0800d2).toLowerCase()))
        {
            e = getResources().getString(0x7f0800d2);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public boolean getPreventFeedback()
    {
        return c;
    }

    public boolean isChecked()
    {
        return d;
    }

    public int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 2);
        if (c)
        {
            mergeDrawableStates(ai, a);
        }
        if (d)
        {
            mergeDrawableStates(ai, b);
        }
        return ai;
    }

    public void setChecked(boolean flag)
    {
        if (d != flag)
        {
            d = flag;
            refreshDrawableState();
        }
        a();
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        a();
    }

    public void setPreventFeedback(boolean flag)
    {
        c = flag;
        refreshDrawableState();
    }

    public void toggle()
    {
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }

}
