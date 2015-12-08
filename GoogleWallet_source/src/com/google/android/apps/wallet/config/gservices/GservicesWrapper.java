// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.gservices;

import android.content.ContentResolver;
import com.google.android.gsf.Gservices;

// Referenced classes of package com.google.android.apps.wallet.config.gservices:
//            GservicesKey

public class GservicesWrapper
{

    private final ContentResolver contentResolver;

    public GservicesWrapper(ContentResolver contentresolver)
    {
        contentResolver = contentresolver;
    }

    public final int getInt(GservicesKey gserviceskey)
    {
        return Gservices.getInt(contentResolver, gserviceskey.getKey(), ((Integer)gserviceskey.getDefaultValue()).intValue());
    }

    public final long getLong(GservicesKey gserviceskey)
    {
        return Gservices.getLong(contentResolver, gserviceskey.getKey(), ((Long)gserviceskey.getDefaultValue()).longValue());
    }

    public final String getString(GservicesKey gserviceskey)
    {
        return Gservices.getString(contentResolver, gserviceskey.getKey(), (String)gserviceskey.getDefaultValue());
    }
}
