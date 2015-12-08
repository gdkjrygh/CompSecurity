// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.session.MediaSession;
import android.os.Bundle;

public final class ecl
{

    public static void a(MediaSession mediasession)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.support.wearable.media.extra.BACKGROUND_COLOR_FROM_THEME", true);
        mediasession.setExtras(bundle);
    }
}
