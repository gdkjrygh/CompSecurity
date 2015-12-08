// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.adjust.sdk.ActivityPackage;
import java.lang.ref.WeakReference;

final class acz extends Handler
{

    private final WeakReference a;

    protected acz(Looper looper, acy acy1)
    {
        super(looper);
        a = new WeakReference(acy1);
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        acy acy1 = (acy)a.get();
        if (acy1 == null)
        {
            return;
        }
        switch (message.arg1)
        {
        default:
            return;

        case 1: // '\001'
            acy.a(acy1);
            return;

        case 2: // '\002'
            acy.a(acy1, (ActivityPackage)message.obj);
            return;

        case 4: // '\004'
            acy.b(acy1);
            return;

        case 3: // '\003'
            acy.c(acy1);
            return;
        }
    }
}
