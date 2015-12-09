// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.pin;

import android.view.KeyEvent;
import android.widget.TextView;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.pin:
//            PinDialog

private class <init>
    implements android.widget.tener
{

    final PinDialog this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i != 6)
        {
            return false;
        }
        textview = textview.getText().toString();
        if (textview.length() < PinDialog.access$500().intValue())
        {
            return true;
        }
        if (PinDialog.access$600(PinDialog.this) == null)
        {
            Log.d("nf_pin", "serviceManager is null");
            return false;
        } else
        {
            PinDialog.access$700(PinDialog.this, textview);
            return false;
        }
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
