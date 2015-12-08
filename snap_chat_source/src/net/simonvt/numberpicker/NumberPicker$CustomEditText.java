// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

// Referenced classes of package net.simonvt.numberpicker:
//            NumberPicker

public static class  extends EditText
{

    public void onEditorAction(int i)
    {
        super.onEditorAction(i);
        if (i == 6)
        {
            clearFocus();
        }
    }

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }
}
