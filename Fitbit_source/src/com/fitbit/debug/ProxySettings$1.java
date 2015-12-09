// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.debug;

import android.view.View;
import android.widget.EditText;
import com.fitbit.savedstate.ServerSavedState;

// Referenced classes of package com.fitbit.debug:
//            ProxySettings

class a
    implements android.view.ener
{

    final EditText a;
    final ProxySettings b;

    public void onClick(View view)
    {
        ServerSavedState.c(a.getText().toString());
    }

    State(ProxySettings proxysettings, EditText edittext)
    {
        b = proxysettings;
        a = edittext;
        super();
    }
}
