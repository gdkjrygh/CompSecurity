// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.TimerTask;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk, PhotoGridActivity

final class ec extends TimerTask
{

    final EditText a;
    final dk b;

    ec(dk dk1, EditText edittext)
    {
        b = dk1;
        a = edittext;
        super();
    }

    public final void run()
    {
        if (!dk.b(b).isFinishing())
        {
            ((InputMethodManager)dk.b(b).getSystemService("input_method")).showSoftInput(a, 0);
        }
    }
}
