// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

public class edx
{

    public static final IntentFilter a = new IntentFilter(d);
    public static final String b = (new StringBuilder()).append(c).append("key_ad").toString();
    private static final String c = (new StringBuilder()).append(edx.getCanonicalName()).append(".").toString();
    private static final String d = (new StringBuilder()).append(c).append("action.current_ad").toString();

    public edx()
    {
    }

    public static Intent a(Ad ad, com.spotify.mobile.android.spotlets.ads.model.AdEvent.Event event)
    {
        Intent intent = new Intent();
        intent.setAction(d);
        intent.putExtra(b, ad);
        intent.putExtra("EXTRA_EVENT_TYPE", event);
        return intent;
    }

}
