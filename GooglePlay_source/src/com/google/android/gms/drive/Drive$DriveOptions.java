// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.drive:
//            Drive

public static final class <init>
    implements com.google.android.gms.common.api.onal
{
    public static final class Builder
    {

        private final Bundle mBundle = new Bundle();

        public final Drive.DriveOptions build()
        {
            return new Drive.DriveOptions(new Bundle(mBundle), (byte)0);
        }

        public final Builder setProxyType$24057e15()
        {
            mBundle.putInt("proxy_type", 1);
            return this;
        }

        public Builder()
        {
        }
    }


    final Bundle mBundle;

    private Builder(Bundle bundle)
    {
        mBundle = bundle;
    }

    mBundle(Bundle bundle, byte byte0)
    {
        this(bundle);
    }
}
