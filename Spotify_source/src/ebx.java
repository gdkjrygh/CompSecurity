// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import java.util.Locale;

public final class ebx extends ebt
{

    public ebx(eay eay1, ecb ecb, Context context)
    {
        super(eay1, ecb, context);
    }

    public static MediaBrowserItem a(Context context, eay eay1)
    {
        eay1 = new ebh(eay1.e());
        eay1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b;
        eay1.d = eck.a(context, 0x7f02022e);
        eay1.b = gei.a(context.getString(0x7f080439), Locale.getDefault());
        return eay1.a();
    }

    public final boolean a(String s)
    {
        return String.valueOf(a.e()).equals(s);
    }

    protected final RadioStationModel[] b(RadioStationsModel radiostationsmodel)
    {
        return radiostationsmodel.userStations;
    }
}
