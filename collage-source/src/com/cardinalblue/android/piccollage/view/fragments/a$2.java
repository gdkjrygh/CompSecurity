// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.SharedPreferences;
import android.widget.CompoundButton;
import com.cardinalblue.android.b.k;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            a

class a
    implements android.widget.oundButton.OnCheckedChangeListener
{

    final a a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        k.j().edit().putBoolean("ENABLE_HD", flag).apply();
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
