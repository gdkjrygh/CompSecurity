// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.widget.CompoundButton;

// Referenced classes of package com.arist.activity:
//            c, AddToListActivity

final class d
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final c a;
    private final int b;

    d(c c1, int i)
    {
        a = c1;
        b = i;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        AddToListActivity.c(c.a(a))[b] = flag;
        AddToListActivity.d(c.a(a));
    }
}
