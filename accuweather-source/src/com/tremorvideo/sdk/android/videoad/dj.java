// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;

final class dj
    implements android.view.View.OnClickListener
{

    final EditText a;
    final di.a b;
    final Dialog c;

    dj(EditText edittext, di.a a1, Dialog dialog)
    {
        a = edittext;
        b = a1;
        c = dialog;
        super();
    }

    public void onClick(View view)
    {
        if (((Integer)view.getTag()).intValue() != 0) goto _L2; else goto _L1
_L1:
        int i;
        try
        {
            i = Integer.parseInt(a.getText().toString());
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            i = 0x80000000;
        }
        if (i != 0x80000000) goto _L4; else goto _L3
_L3:
        b.a(c);
_L6:
        return;
_L4:
        b.a(c, i);
        return;
_L2:
        if (((Integer)view.getTag()).intValue() == 1)
        {
            b.a(c);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
