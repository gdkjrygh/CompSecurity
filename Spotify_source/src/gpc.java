// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import com.spotify.music.spotlets.radio.service.RadioActionsService;

public final class gpc extends Binder
{

    public final RadioActionsService a;

    public gpc(RadioActionsService radioactionsservice)
    {
        a = radioactionsservice;
        super();
    }
}
