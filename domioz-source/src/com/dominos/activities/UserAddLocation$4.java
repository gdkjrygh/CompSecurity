// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;

// Referenced classes of package com.dominos.activities:
//            UserAddLocation

class spinnerInitialized
    implements android.widget.SelectedListener
{

    private boolean spinnerInitialized;
    final UserAddLocation this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (spinnerInitialized) goto _L2; else goto _L1
_L1:
        spinnerInitialized = true;
_L4:
        UserAddLocation.access$1102(UserAddLocation.this, (String)adapterview.getAdapter().getItem(i));
        return;
_L2:
        if (i != 0)
        {
            UserAddLocation.access$1000(UserAddLocation.this).requestFocus();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    Listener()
    {
        this$0 = UserAddLocation.this;
        super();
        spinnerInitialized = false;
    }
}
