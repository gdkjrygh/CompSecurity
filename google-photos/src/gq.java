// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.session.MediaController;

final class gq extends gp
{

    public gq(Context context, gz gz)
    {
        super(context, gz);
    }

    public final gt a()
    {
        android.media.session.MediaController.TransportControls transportcontrols = ((MediaController)a).getTransportControls();
        if (transportcontrols != null)
        {
            return new gv(transportcontrols);
        } else
        {
            return null;
        }
    }
}
