// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public abstract class UndoButtonInterface extends ImageButton
{

    public UndoButtonInterface(Context context)
    {
        super(context);
    }

    public UndoButtonInterface(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public UndoButtonInterface(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public UndoButtonInterface(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    public abstract UndoButtonState getState();

    public abstract void setState(UndoButtonState undobuttonstate);
}
