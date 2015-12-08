// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

final class lne extends lmu
{

    private final jzc a;

    public lne(jzc jzc1)
    {
        a = jzc1;
    }

    public final void a(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor, Bundle bundle1)
    {
        int j = 0;
        if (b.r(3))
        {
            (new StringBuilder("Avatar callback: status=")).append(i).append(" resolution=").append(bundle).append(" pfd=").append(parcelfiledescriptor).toString();
            b.r(3);
        }
        bundle = lnd.a(i, null, bundle);
        boolean flag;
        if (bundle1 != null)
        {
            flag = bundle1.getBoolean("rewindable");
            i = bundle1.getInt("width");
            j = bundle1.getInt("height");
        } else
        {
            i = 0;
            flag = false;
        }
        a.a(new lnf(bundle, parcelfiledescriptor, flag, i, j));
    }
}
