// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.translate.m;
import com.google.android.libraries.translate.e.h;

final class x
    implements android.view.View.OnClickListener
{

    x()
    {
    }

    public final void onClick(View view)
    {
        if (m.btn_take_cam_tour == view.getId() || m.btn_take_voice_tour == view.getId())
        {
            Bundle bundle = new Bundle();
            bundle.putInt("key.tour.type", view.getId());
            h.a(21, bundle);
        }
    }
}
