// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;

final class lyb
    implements lxm
{

    lyb()
    {
    }

    public final lxl a(Bundle bundle)
    {
        bundle = CastDevice.a(bundle);
        if (bundle != null)
        {
            return new lyc(bundle);
        } else
        {
            return null;
        }
    }
}
