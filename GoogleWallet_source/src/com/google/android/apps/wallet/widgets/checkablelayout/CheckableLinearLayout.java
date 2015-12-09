// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.checkablelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

public class CheckableLinearLayout extends LinearLayout
    implements Checkable
{

    private Checkable _flddelegate;

    public CheckableLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean isChecked()
    {
        if (_flddelegate != null)
        {
            return _flddelegate.isChecked();
        } else
        {
            return false;
        }
    }

    public void setChecked(boolean flag)
    {
        if (_flddelegate != null)
        {
            _flddelegate.setChecked(flag);
        }
    }

    public void setDelegate(Checkable checkable)
    {
        _flddelegate = checkable;
    }

    public void toggle()
    {
        if (_flddelegate != null)
        {
            Checkable checkable = _flddelegate;
            boolean flag;
            if (!_flddelegate.isChecked())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            checkable.setChecked(flag);
        }
    }
}
