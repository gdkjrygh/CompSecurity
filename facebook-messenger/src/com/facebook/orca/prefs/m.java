// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.widget.CompoundButton;

// Referenced classes of package com.facebook.orca.prefs:
//            l

class m
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        l.a(a, Boolean.valueOf(flag));
    }
}
