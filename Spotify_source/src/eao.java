// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import com.spotify.mobile.android.service.media.MediaService;

public final class eao extends Binder
{

    public final MediaService a;

    public eao(MediaService mediaservice)
    {
        a = mediaservice;
        super();
    }
}
