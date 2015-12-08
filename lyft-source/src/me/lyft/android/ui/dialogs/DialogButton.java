// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.DialogFlow;

public class DialogButton extends Button
{

    DialogFlow dialogFlow;

    public DialogButton(Context context)
    {
        super(context);
        init();
    }

    public DialogButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public DialogButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        if (isInEditMode())
        {
            return;
        } else
        {
            Scoop.a(this).b(this);
            return;
        }
    }

    public boolean performClick()
    {
        dialogFlow.dismiss();
        return super.performClick();
    }
}
