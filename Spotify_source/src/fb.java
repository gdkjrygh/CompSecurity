// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.session.MediaController;
import android.support.v4.media.session.MediaSessionCompat;

final class fb extends fa
{

    public fb(Context context, MediaSessionCompat mediasessioncompat)
    {
        super(context, mediasessioncompat);
    }

    public final fe a()
    {
        android.media.session.MediaController.TransportControls transportcontrols = ((MediaController)a).getTransportControls();
        if (transportcontrols != null)
        {
            return new fg(transportcontrols);
        } else
        {
            return null;
        }
    }
}
