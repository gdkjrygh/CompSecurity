// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package me.lyft.android.controls:
//            ViewWithErrorState

public class Validation
{

    public Validation()
    {
    }

    public static transient void focusErrorField(View aview[])
    {
        int i;
        boolean flag;
        int k;
        flag = false;
        k = aview.length;
        i = 0;
_L3:
        View view;
        ViewWithErrorState viewwitherrorstate;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        view = aview[i];
        viewwitherrorstate = (ViewWithErrorState)view;
        if (!view.hasFocus() || !viewwitherrorstate.hasValidationError()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i++;
          goto _L3
        int l = aview.length;
        int j = ((flag) ? 1 : 0);
        while (j < l) 
        {
            Object obj = aview[j];
            ViewWithErrorState viewwitherrorstate1 = (ViewWithErrorState)obj;
            if (viewwitherrorstate1.hasValidationError())
            {
                ((View) (obj)).requestFocus();
                viewwitherrorstate1.showValidationMessage();
                if (obj instanceof EditText)
                {
                    obj = (EditText)obj;
                    ((EditText) (obj)).setSelection(((EditText) (obj)).getText().length());
                }
            }
            j++;
        }
          goto _L1
    }
}
