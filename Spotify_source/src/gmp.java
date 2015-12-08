// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.ui.activity.MainActivityIntentQueue;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.MainActivity;
import java.lang.ref.WeakReference;

public final class gmp extends Handler
{

    private final WeakReference a;

    public gmp(MainActivity mainactivity)
    {
        a = new WeakReference(mainactivity);
    }

    public final void handleMessage(Message message)
    {
        MainActivity mainactivity = (MainActivity)a.get();
        if (mainactivity != null && MainActivity.b(mainactivity)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (message.what)
        {
        default:
            Assertion.a("Sending ourselves messages we do not know how to handle..");
            return;

        case 0: // '\0'
            MainActivity.c(mainactivity);
            if (MainActivity.a(mainactivity).a())
            {
                MainActivity.d(mainactivity);
                return;
            }
            break;

        case 1: // '\001'
            MainActivity.e(mainactivity);
            return;

        case 2: // '\002'
            MainActivity.f(mainactivity);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
