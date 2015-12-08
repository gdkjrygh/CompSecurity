// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.service.flow.login.StartFragment;
import java.lang.ref.WeakReference;

public final class dyg extends Handler
{

    private final WeakReference a;

    private dyg(StartFragment startfragment)
    {
        a = new WeakReference(startfragment);
    }

    public dyg(StartFragment startfragment, byte byte0)
    {
        this(startfragment);
    }

    public final void handleMessage(Message message)
    {
        StartFragment startfragment = (StartFragment)a.get();
        if (startfragment != null && !startfragment.p() && startfragment.y() != null)
        {
            if (message.what == 1)
            {
                StartFragment.j(startfragment);
                return;
            }
            if (message.what == 2)
            {
                StartFragment.l(startfragment);
                startfragment.a = false;
                return;
            }
        }
    }
}
