// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class erg
{

    final Activity a;
    private boolean b;

    public erg(Activity activity)
    {
        dmz.a(fop);
        a = activity;
    }

    public final void a(float f)
    {
        if (b)
        {
            return;
        } else
        {
            b = true;
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.al);
            clientevent.a("volume", String.valueOf(f));
            fop.a(a, ViewUri.bA, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
            return;
        }
    }
}
