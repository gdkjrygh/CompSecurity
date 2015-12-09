// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.location;

import android.location.Location;
import com.vungle.log.Logger;
import com.vungle.publisher.cj;
import com.vungle.publisher.cn;
import java.util.Locale;
import java.util.TimeZone;

public class AndroidLocation
    implements cn
{

    cj a;

    public AndroidLocation()
    {
    }

    public final String a()
    {
        String s;
        try
        {
            s = Locale.getDefault().getISO3Language();
        }
        catch (Exception exception)
        {
            Logger.w("VungleLocation", "error getting ISO 3-letter language code", exception);
            return "";
        }
        return s;
    }

    public final Location b()
    {
        if (a == null)
        {
            Logger.d("VungleLocation", "cannot provide detailed location - null detailed location provider");
            return null;
        } else
        {
            return a.b();
        }
    }

    public final String c()
    {
        return TimeZone.getDefault().getID();
    }
}
