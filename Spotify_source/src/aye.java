// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class aye extends axy
    implements bla, blc, ble
{

    public aye()
    {
    }

    protected final Bundle a(Bundle bundle, Bundle bundle1)
    {
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        bundle.putBundle("sdk_less_server_data", bundle1);
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }

    public final String a(Bundle bundle)
    {
        return "adurl";
    }
}
