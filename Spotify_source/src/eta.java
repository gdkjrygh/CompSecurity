// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.hubs.util.DeviceCapability;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class eta
{

    private static final ThreadLocal a = new ThreadLocal() {

        protected final Object initialValue()
        {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        }

    };

    public static String a(Resources resources, android.net.Uri.Builder builder, Flags flags)
    {
        int i = resources.getInteger(0x7f0e0003);
        resources = ((android.net.Uri.Builder)ctz.a(builder)).appendQueryParameter("card-columns", String.valueOf(i)).appendQueryParameter("locale", Locale.getDefault().toString());
        boolean flag;
        if (!((Boolean)flags.a(fys.ad)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return resources.appendQueryParameter("mft", String.valueOf(flag)).appendQueryParameter("client-version", ((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a.versionName).appendQueryParameter("capabilities", DeviceCapability.b(flags)).appendQueryParameter("date-time", ((SimpleDateFormat)a.get()).format(new Date())).build().toString();
    }

    public static String a(Resources resources, String s, Flags flags)
    {
        return a(resources, Uri.parse(s).buildUpon(), flags);
    }

}
