// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.DialogInterface;
import com.tinder.enums.Environment;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;

// Referenced classes of package com.tinder.views:
//            DevControls, CustomEditText

class 
    implements android.content.e.OnClickListener
{

    final DevControls this$0;
    final CustomEditText val$editText;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = val$editText.getText().toString();
        ae.b.putString("KEY_SANDBOX", dialoginterface).commit();
        ((ManagerApp)mAppcontext).a(Environment.SANDBOX, true);
    }

    ()
    {
        this$0 = final_devcontrols;
        val$editText = CustomEditText.this;
        super();
    }
}
