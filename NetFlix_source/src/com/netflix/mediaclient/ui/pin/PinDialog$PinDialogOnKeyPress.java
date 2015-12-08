// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.pin;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.pin:
//            PinDialog

private class <init>
    implements android.view.nDialogOnKeyPress
{

    final PinDialog this$0;

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (i != 67)
        {
            PinDialog.access$800(PinDialog.this).setError(null, null);
            PinDialog.access$900(PinDialog.this, false);
            view = ((EditText)view).getText().toString();
            if (view.length() >= PinDialog.access$500().intValue())
            {
                if (PinDialog.access$600(PinDialog.this) == null)
                {
                    Log.d("nf_pin", "serviceManager is null");
                    return false;
                } else
                {
                    PinDialog.access$700(PinDialog.this, view);
                    return false;
                }
            }
        }
        return false;
    }

    private ()
    {
        this$0 = PinDialog.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
