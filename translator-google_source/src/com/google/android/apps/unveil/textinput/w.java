// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import com.google.android.apps.unveil.nonstop.e;
import com.google.android.apps.unveil.nonstop.m;
import com.google.android.apps.unveil.sensors.CameraManager;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            TextInput

final class w extends e
{

    final TextInput j;

    public w(TextInput textinput, CameraManager cameramanager)
    {
        j = textinput;
        super(cameramanager);
    }

    protected final void a(m m)
    {
        while (!TextInput.j(j).f() || TextInput.j(j).g() || !TextInput.k(j)) 
        {
            return;
        }
        super.a(m);
    }
}
