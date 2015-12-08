// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.Rating;

final class ga
    implements android.media.RemoteControlClient.OnMetadataUpdateListener
{

    private fw a;

    public ga(fw fw1)
    {
        a = fw1;
    }

    public final void onMetadataUpdate(int i, Object obj)
    {
        if (i == 0x10000001 && (obj instanceof Rating))
        {
            a.a(obj);
        }
    }
}
