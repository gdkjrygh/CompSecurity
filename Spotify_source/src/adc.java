// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.adjust.sdk.ActivityPackage;
import java.lang.ref.WeakReference;

final class adc extends Handler
{

    private final WeakReference a;

    protected adc(Looper looper, adb adb1)
    {
        super(looper);
        a = new WeakReference(adb1);
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        adb adb1 = (adb)a.get();
        if (adb1 == null)
        {
            return;
        }
        switch (message.arg1)
        {
        default:
            return;

        case 72400: 
            adb.a(adb1, (ActivityPackage)message.obj);
            break;
        }
    }
}
