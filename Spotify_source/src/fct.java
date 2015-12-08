// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.spotlets.player.notifications.PlayerNotificationType;
import com.spotify.mobile.android.util.Assertion;
import java.lang.ref.WeakReference;

final class fct extends Handler
{

    private final WeakReference a;

    public fct(fcs fcs1)
    {
        a = new WeakReference(fcs1);
    }

    public final void handleMessage(Message message)
    {
        fcs fcs1;
label0:
        {
            super.handleMessage(message);
            fcs1 = (fcs)a.get();
            if (fcs1 != null)
            {
                switch (message.what)
                {
                default:
                    Assertion.a((new StringBuilder("Unexpected message ")).append(message.what).toString());
                    break;

                case 2131820796: 
                    break label0;
                }
            }
            return;
        }
        fcs1.a((PlayerNotificationType)message.obj);
    }
}
