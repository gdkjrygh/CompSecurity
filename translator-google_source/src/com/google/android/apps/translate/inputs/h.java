// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.view.View;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            i, Camera2InputPopup

final class h
    implements android.view.View.OnLayoutChangeListener
{

    final View a;
    final Camera2InputPopup b;

    h(Camera2InputPopup camera2inputpopup, View view)
    {
        b = camera2inputpopup;
        a = view;
        super();
    }

    public final void onLayoutChange(View view, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2)
    {
        b.a(new i(this));
    }
}
