// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import java.util.Locale;

// Referenced classes of package com.soundcloud.android.utils:
//            CountryProvider

public class LocaleBasedCountryProvider
    implements CountryProvider
{

    public LocaleBasedCountryProvider()
    {
    }

    public String getCountryCode()
    {
        return Locale.getDefault().getCountry();
    }
}
