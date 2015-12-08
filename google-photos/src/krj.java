// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

final class krj extends Handler
{

    private kri a;

    krj(kri kri1, Looper looper)
    {
        a = kri1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
label0:
        {
            kri kri1 = a;
            if (message != null)
            {
                if (!(message.obj instanceof Intent))
                {
                    break label0;
                }
                Object obj = (Intent)message.obj;
                ((Intent) (obj)).setExtrasClassLoader(com/google/android/gms/iid/MessengerCompat.getClassLoader());
                if (((Intent) (obj)).hasExtra("google.messenger"))
                {
                    obj = ((Intent) (obj)).getParcelableExtra("google.messenger");
                    if (obj instanceof MessengerCompat)
                    {
                        kri1.b = (MessengerCompat)obj;
                    }
                    if (obj instanceof Messenger)
                    {
                        kri1.a = (Messenger)obj;
                    }
                }
                kri1.b((Intent)message.obj);
            }
            return;
        }
        Log.w("InstanceID/Rpc", "Dropping invalid message");
    }
}
