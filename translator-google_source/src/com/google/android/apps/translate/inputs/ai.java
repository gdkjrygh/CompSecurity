// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.google.android.apps.unveil.textinput.TextInput;
import com.google.android.libraries.translate.core.b;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class ai
    implements android.content.DialogInterface.OnClickListener
{

    final CheckBox a;
    final boolean b = true;
    final Camera2InputPopup c;

    ai(Camera2InputPopup camera2inputpopup, CheckBox checkbox)
    {
        c = camera2inputpopup;
        a = checkbox;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        boolean flag = a.isChecked();
        com.google.android.libraries.translate.core.b.a(c.getContext(), flag);
        Camera2InputPopup.h(c).setImageLogging(flag);
        if (b)
        {
            Camera2InputPopup.i(c);
        }
    }
}
