// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.gcm.GcmBroadcastReceiver;
import com.google.android.libraries.social.location.GcmLocationService;

public final class nez
    implements nae
{

    public nez()
    {
    }

    public final String a()
    {
        return "location-refresh-v2";
    }

    public final void a(Context context, Intent intent)
    {
        GcmBroadcastReceiver.a(context, (new Intent(context, com/google/android/libraries/social/location/GcmLocationService)).putExtras(intent.getExtras()));
    }
}
