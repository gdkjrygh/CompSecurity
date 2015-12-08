// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.Rating;

public final class hu
    implements android.media.RemoteControlClient.OnMetadataUpdateListener
{

    private hs a;

    public hu(hs hs1)
    {
        a = hs1;
    }

    public final void onMetadataUpdate(int i, Object obj)
    {
        if (i == 0x10000001 && (obj instanceof Rating))
        {
            a.a(obj);
        }
    }
}
