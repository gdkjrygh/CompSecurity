// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.FitbitMobile;

import android.view.View;
import android.widget.EditText;
import com.fitbit.savedstate.ServerSavedState;
import com.fitbit.savedstate.p;

// Referenced classes of package com.fitbit.FitbitMobile:
//            ServerSettingsActivity

class b
    implements android.view.Activity._cls1
{

    final EditText a;
    final EditText b;
    final ServerSettingsActivity c;

    public void onClick(View view)
    {
        ServerSavedState.a(a.getText().toString());
        ServerSavedState.b(b.getText().toString());
        p.b();
        System.exit(0);
    }

    (ServerSettingsActivity serversettingsactivity, EditText edittext, EditText edittext1)
    {
        c = serversettingsactivity;
        a = edittext;
        b = edittext1;
        super();
    }
}
