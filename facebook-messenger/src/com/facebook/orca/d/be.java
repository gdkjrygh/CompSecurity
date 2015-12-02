// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import javax.inject.a;

public class be
    implements a
{

    public static final ae a = n.a("messenger_audio_recorder_android");
    private final d b;
    private final Context c;

    public be(d d1, Context context)
    {
        b = d1;
        c = context;
    }

    public Boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b.a(a, false))
        {
            flag = flag1;
            if (c.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0)
            {
                flag = flag1;
                if (c.getPackageManager().hasSystemFeature("android.hardware.microphone"))
                {
                    flag = true;
                }
            }
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }

}
