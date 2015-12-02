// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.view.View;
import android.widget.RadioButton;

// Referenced classes of package com.facebook.widget:
//            RadioButtonWithSubtitle

class m
    implements android.view.View.OnClickListener
{

    final RadioButtonWithSubtitle a;

    m(RadioButtonWithSubtitle radiobuttonwithsubtitle)
    {
        a = radiobuttonwithsubtitle;
        super();
    }

    public void onClick(View view)
    {
        RadioButtonWithSubtitle.a(a).setChecked(true);
    }
}
