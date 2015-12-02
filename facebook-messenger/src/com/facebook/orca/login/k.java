// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.view.View;
import android.widget.AdapterView;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.orca.login:
//            WildfireRegPhoneNumberViewGroup

class k
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final WildfireRegPhoneNumberViewGroup a;

    k(WildfireRegPhoneNumberViewGroup wildfireregphonenumberviewgroup)
    {
        a = wildfireregphonenumberviewgroup;
        super();
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        WildfireRegPhoneNumberViewGroup.access$000(a);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        b.a(WildfireRegPhoneNumberViewGroup.access$100(), com/facebook/orca/login/WildfireRegPhoneNumberViewGroup, "No country selected, should never occur");
    }
}
