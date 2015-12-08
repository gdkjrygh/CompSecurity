// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package hu.dpal.phonegap.plugins;

import android.app.ProgressDialog;
import java.util.Stack;

// Referenced classes of package hu.dpal.phonegap.plugins:
//            SpinnerDialog

class this._cls0
    implements Runnable
{

    final SpinnerDialog this$0;

    public void run()
    {
        if (!spinnerDialogStack.empty())
        {
            ((ProgressDialog)spinnerDialogStack.pop()).dismiss();
        }
    }

    ()
    {
        this$0 = SpinnerDialog.this;
        super();
    }
}
