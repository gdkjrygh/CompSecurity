// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.sso.AuthorizationActivity;
import com.spotify.mobile.android.util.logging.Logger;
import java.lang.ref.WeakReference;
import java.net.HttpCookie;

public final class flu extends Handler
{

    private final WeakReference a;

    public flu(AuthorizationActivity authorizationactivity)
    {
        a = new WeakReference(authorizationactivity);
    }

    public final void handleMessage(Message message)
    {
        AuthorizationActivity authorizationactivity;
label0:
        {
label1:
            {
label2:
                {
                    authorizationactivity = (AuthorizationActivity)a.get();
                    if (authorizationactivity != null)
                    {
                        switch (message.what)
                        {
                        default:
                            Logger.c("Invalid preflight message-ID: %u", new Object[] {
                                Integer.valueOf(message.what)
                            });
                            break;

                        case 0: // '\0'
                            break label1;

                        case 1: // '\001'
                            break label0;

                        case 2: // '\002'
                            break label2;
                        }
                    }
                    return;
                }
                AuthorizationActivity.a(authorizationactivity, (String)message.obj);
                return;
            }
            authorizationactivity.a((flx)message.obj);
            return;
        }
        AuthorizationActivity.a(authorizationactivity, (HttpCookie)message.obj);
    }
}
