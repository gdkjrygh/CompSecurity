// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.widget.CompoundButton;

// Referenced classes of package com.facebook.widget:
//            RadioButtonWithSubtitle, o

class n
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final RadioButtonWithSubtitle a;

    n(RadioButtonWithSubtitle radiobuttonwithsubtitle)
    {
        a = radiobuttonwithsubtitle;
        super();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (RadioButtonWithSubtitle.b(a) != null)
        {
            RadioButtonWithSubtitle.b(a).a(a, flag);
        }
    }
}
